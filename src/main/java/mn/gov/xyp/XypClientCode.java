package mn.gov.xyp;

import mn.gov.xyp.citizen.*;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.util.*;

public class XypClientCode {
    static String wsdl = "https://xyp.gov.mn/citizen-1.5.0/ws?WSDL";
    public void callUseSignature(String serialNumber, String signature, String timestamp, String regnum) {
        CitizenService citizenService = new CitizenServiceService().getCitizenServicePort();
        Map<String, Object> req_ctx = ((BindingProvider)citizenService).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdl);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        XypSign xypSign = new XypSign();
        Hashtable<String, String> fields = xypSign.Generate(Constants.ACCESS_TOKEN, timestamp);
        try{
            headers.put("accessToken", Collections.singletonList(fields.get("accessToken")));
            headers.put("timestamp", Collections.singletonList(fields.get("timestamp")));
            headers.put("signature", Collections.singletonList(fields.get("signature")));
            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

            CitizenRequestData requestData = new CitizenRequestData();
            AuthorizationData authorizationData = new AuthorizationData();
            AuthorizationEntity authorizationEntity = new AuthorizationEntity();

            authorizationEntity.setRegnum(regnum);
            authorizationEntity.setCertFingerprint(serialNumber);
            authorizationEntity.setSignature(signature);

            authorizationData.setCitizen(authorizationEntity);

            requestData.setRegnum(regnum);
            requestData.setAuth(authorizationData);
            ServiceResponse serviceResponse = citizenService.ws100101GetCitizenIDCardInfo(requestData);

            System.out.println(serviceResponse.getResultCode());
            System.out.println(serviceResponse.getResultMessage());
            System.out.println(serviceResponse.getRequestId());
            System.out.println(serviceResponse.getResponse());

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public void callUseOTP(String timestamp, String regnum) {
        int otpCode = 0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Иргэнд ирсэн OTP код: ");
        otpCode = sc.nextInt();
        sc.close();

        if(otpCode == 0){
            System.out.println("OTP код буруу байна.");
            return;
        }

        CitizenService citizenService = new CitizenServiceService().getCitizenServicePort();
        Map<String, Object> req_ctx = ((BindingProvider)citizenService).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, wsdl);
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        XypSign xypSign = new XypSign();
        Hashtable<String, String> fields = xypSign.Generate(Constants.ACCESS_TOKEN, timestamp);
        try{
            headers.put("accessToken", Collections.singletonList(fields.get("accessToken")));
            headers.put("timestamp", Collections.singletonList(fields.get("timestamp")));
            headers.put("signature", Collections.singletonList(fields.get("signature")));
            req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

            CitizenRequestData requestData = new CitizenRequestData();
            AuthorizationData authorizationData = new AuthorizationData();
            AuthorizationEntity authorizationEntity = new AuthorizationEntity();

            authorizationEntity.setRegnum(regnum);
            authorizationEntity.setOtp(otpCode);

            authorizationData.setCitizen(authorizationEntity);

            requestData.setRegnum(regnum);
            requestData.setAuth(authorizationData);
            ServiceResponse serviceResponse = citizenService.ws100101GetCitizenIDCardInfo(requestData);

            System.out.println(serviceResponse.getResultCode());
            System.out.println(serviceResponse.getResultMessage());
            System.out.println(serviceResponse.getRequestId());
            System.out.println(serviceResponse.getResponse());

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        XypClientCode clientCode = new XypClientCode();
        clientCode.callUseOTP(DigitalSignatureApprove.GetCurrentTimestamp(), "ЕЮ00222501");
    }
}
