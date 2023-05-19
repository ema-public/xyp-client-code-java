package mn.gov.xyp;

import mn.gov.xyp.citizen.AuthorizationData;
import mn.gov.xyp.citizen.AuthorizationEntity;
import mn.gov.xyp.meta.MetaService;
import mn.gov.xyp.meta.MetaServiceService;
import mn.gov.xyp.meta.RegisterOTPRequest;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.*;

/**
 * OTP код авах WS100008_registerOTPRequest сервисийг ашиглаж WS100101_getCitizenIDCardInfo сервисийг ашиглах хүсэлтийг sms-ээр явуулах
 *
 * @author unenbat
 * @since 2023-05-19
 */
public class OTPApprove {
    static String wsdl = "https://xyp.gov.mn/meta-1.5.0/ws?WSDL";

    public static void main(String[] args) {

        String timestamp = GetCurrentTimestamp();

        MetaService metaService = new MetaServiceService().getMetaServicePort();
        Map<String, Object> req_ctx = ((BindingProvider) metaService).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdl);
        Map<String, List<String>> headers = new HashMap<>();
        XypSign xypSign = new XypSign();

        Hashtable<String, String> fields = xypSign.Generate(Constants.ACCESS_TOKEN, timestamp);

        headers.put("accessToken", Collections.singletonList(fields.get("accessToken")));
        headers.put("timestamp", Collections.singletonList(fields.get("timestamp")));
        headers.put("signature", Collections.singletonList(fields.get("signature")));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

        AuthorizationEntity authorizationEntity = new AuthorizationEntity();
        authorizationEntity.setRegnum(Constants.REGNUM);

        AuthorizationData authorizationData = new AuthorizationData();
        authorizationData.setCitizen(authorizationEntity);

        RegisterOTPRequest requestData = new RegisterOTPRequest();
        requestData.setRegnum(Constants.REGNUM);
        requestData.setJsonWSList("[{\"ws\":\"WS100101_getCitizenIDCardInfo\"}]");
        //OTP кодыг мессежээр авах бол 1 үгүй бол 0
        requestData.setIsSms(1);
        //OTP кодыг e-mongolia аппаар авах бол 1 үгүй бол 0
        requestData.setIsApp(0);
        //OTP кодыг мэйлээр авах бол 1 үгүй бол 0
        requestData.setIsEmail(0);
        //киоск машинаас үйлчилгээ авч байгаа эсэх 1 үгүй бол 0
        requestData.setIsKiosk(0);
        //мессежээр авах үед иргэний өөрийн нэр дээр бүртгэлтэй утасны дугаарыг бичнэ.
        //Хэрвээ иргэний бүртгэлтэй дугаарыг 0 утгатай илгээсэн тохиолдолд e-mongolia дээр бүртгэлтэй дугаар луу otp явуулна
        requestData.setPhoneNum(0);

        mn.gov.xyp.meta.ServiceResponse serviceResponse = metaService.ws100008RegisterOTPRequest(requestData);

        System.out.println(serviceResponse.getResultCode());
        System.out.println(serviceResponse.getResultMessage());
        System.out.println(serviceResponse.getRequestId());
        System.out.println(serviceResponse.getResponse());

        //OTP илгээх сервис амжилттай болсон
        if(serviceResponse.getResultCode() == 0) {
            XypClientCode clientCode = new XypClientCode();
            clientCode.callUseOTP(timestamp, Constants.REGNUM);
        }
    }

    /**
     * @return current timestamp
     */
    public static String GetCurrentTimestamp() {
        Date date = new Date();
        return Long.toString(date.getTime() / 1000);
    }
}
