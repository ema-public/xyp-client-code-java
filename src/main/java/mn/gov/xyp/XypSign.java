package mn.gov.xyp;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Hashtable;

/**
 * ХУР системийг ашиглаж буй байгууллага өөрийн тоон гарын үсгийг зурах модуль
 *
 * @author unenbat
 * @since 2023-05-19
 */
public class XypSign {

    private Hashtable<String, String> toBeSigned(String accessToken, String timestamp) {
        Hashtable<String, String> toBeSigned = new Hashtable<>();
        toBeSigned.put("accessToken", accessToken);
        toBeSigned.put("timestamp", timestamp);
        return toBeSigned;
    }

    public Hashtable<String, String> Generate(String accessToken, String timestamp) {
        try {
            byte[] privateKeyBytes = Files.readAllBytes(Paths.get(Constants.KEY_PATH));
            String privateKeyString = new String(privateKeyBytes);
            privateKeyString = privateKeyString
                    .replace(System.getProperty("line.separator"), "")
                    .replace("-----BEGIN PRIVATE KEY-----", "")
                    .replace("-----END PRIVATE KEY-----", "");
            byte[] decodedKey = Base64.getDecoder().decode(privateKeyString);
            PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decodedKey);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKey = keyFactory.generatePrivate(spec);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(privateKey);

            Hashtable<String, String> toBeSigned = toBeSigned(accessToken, timestamp);
            signature.update((toBeSigned.get("accessToken") + "." + toBeSigned.get("timestamp")).getBytes());

            byte[] signatureBytes = signature.sign();
            String encodedSignature = Base64.getEncoder().encodeToString(signatureBytes);
            toBeSigned.put("signature", encodedSignature);

            return toBeSigned;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}