package mn.gov.xyp;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Hashtable;

@RestController
public class XypSign {

    public String keyPath = "src/unenbat.key";
    private Hashtable<String, String> toBeSigned(String accessToken, String timestamp){
        Hashtable<String, String> toBeSigned = new Hashtable<String, String>();
        toBeSigned.put("accessToken", accessToken);
        toBeSigned.put("timestamp", timestamp);
        return toBeSigned;
    }
    public Hashtable<String, String> Generate(String accessToken, String timestamp){
        try {
            byte[] privateKeyBytes = Files.readAllBytes(Paths.get(keyPath));
            String privateKeyString = new String(privateKeyBytes);
            privateKeyString = privateKeyString
                    .replaceAll("\\n", "")
                    .replace("-----BEGIN PRIVATE KEY-----", "")
                    .replace("-----END PRIVATE KEY-----", "");
            byte[] decodedKey = Base64.getDecoder().decode(privateKeyString);

            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decodedKey);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(spec);

            // Create a signature object
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);

            // Generate the signature
            Hashtable<String, String> toBeSigned = toBeSigned(accessToken, timestamp);
            signature.update((toBeSigned.get("accessToken") + "." + toBeSigned.get("timestamp")).getBytes());
            byte[] signatureBytes = signature.sign();

            // Print the signature in Base64 encoding
            String encodedSignature = Base64.getEncoder().encodeToString(signatureBytes);
            toBeSigned.put("signature", encodedSignature);

            return toBeSigned;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeySpecException e) {
            throw new RuntimeException(e);
        } catch (SignatureException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }
}