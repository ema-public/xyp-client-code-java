package mn.gov.xyp;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.websocket.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.Date;

/**
 * Esign client программыг ашиглаж regnum.timestamp мэдээллийг тоон гарын үсгээр баталгаажуулах хүсэлт явуулах
 *
 * @author unenbat
 * @since 2023-05-19
 */
@ClientEndpoint
public class DigitalSignatureApprove {
    private static final char[] HEX_DIGITS = "0123456789abcdef".toCharArray();
    private final String timeStamp;
    public DigitalSignatureApprove(){
        this.timeStamp = GetCurrentTimestamp();
    }

    public static void main(String[] args) throws Exception {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        Session session = container.connectToServer(DigitalSignatureApprove.class, URI.create(Constants.ESIGN_URL));
        Thread.sleep(20000); // Wait for a few seconds before closing the connection
        session.close();
        System.out.println("end");
    }

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("WebSocket connection opened: " + session.getId());
        //Тоон гарын үсэг уншигч төхөөрөмж рүү "Регистр.timeStamp" датаг зуруулахаар хүсэлт илгээнэ
        String data = Constants.REGNUM + "." + timeStamp;
        String message = "{'type':'e457cb50ed64bde0','data':'" + data +"'}";
        System.out.println(message);
        session.getAsyncRemote().sendText(message);
    }

    /**
     * Тоон гарын үсэг унших төхөөрөмжтэй амжилттай холбогдож гарын үсэг зурсны дараа мэдээлэл ирэх хэсэг
     * @param message тоон гарын үсэг уншигч төхөөрөмжөөс ирсэн мэдээлэл
     * @param session веб холболт
     *
     * @author unenbat
     * @since 2023-05-19
     */
    @OnMessage
    public void onMessage(String message, Session session) throws CertificateException {
        JsonReader reader = Json.createReader(new StringReader(message));
        JsonObject jsonObject = reader.readObject();
        String serialNumber = getSerialNumber(jsonObject.getString("certificate"));
        String signature = jsonObject.getString("signature");
        System.out.println("сериал дугаар: " + serialNumber);
        System.out.println("тоон гарын үсгээр баталгаажсан мэдээлэл: " + signature);

        //шаардлагатай мэдээллүүдийг дамжуулан хур сервис дуудах
        XypClientCode df = new XypClientCode();
        df.callUseSignature(serialNumber, signature ,timeStamp, Constants.REGNUM);

        reader.close();
        try {
            session.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("WebSocket connection closed: " + session.getId());
    }

    @OnError
    public void onError(Throwable throwable) {
        System.out.println("WebSocket error occurred: " + throwable.getMessage());
    }

    /**
     * Сертификатын дугаараар сертификат гаргаж авах
     * @param certBase64 сертификатын дугаар
     * @return сертификат
     * @throws CertificateException сертификатын дугаар буруу байх
     */
    public static X509Certificate parseCertificate(String certBase64) throws CertificateException {
        //before decoding we need to get rod off the prefix and suffix
        byte[] decoded = Base64.getDecoder().decode(certBase64);
        return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(decoded));
    }

    /**
     * Сертификатын дугаар мэдээллээр сериал дугаарыг олох
     * @param certBase64 сертификатын дугаар
     * @return сериал дугаар
     * @throws CertificateException сертификатын дугаар буруу байх
     */
    public static String getSerialNumber(String certBase64) throws CertificateException {
        return toHex(parseCertificate(certBase64).getSerialNumber().toByteArray());
    }

    /**
     * сериал дугаарыг String төрөлтэй болгох
     * @param data Bigint төрөлтэй сериал дугаар
     * @return Strign төрөлтэй сервиал дугаар
     */
    public static String toHex(byte[] data) {
        char[] chars = new char[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            chars[i * 2] = HEX_DIGITS[(data[i] >> 4) & 0xf];
            chars[i * 2 + 1] = HEX_DIGITS[data[i] & 0xf];
        }
        return new String(chars);
    }

    /**
     *
     * @return current timestamp
     */
    public static String GetCurrentTimestamp(){
        Date date = new Date();
        return Long.toString(date.getTime() / 1000);
    }
}
