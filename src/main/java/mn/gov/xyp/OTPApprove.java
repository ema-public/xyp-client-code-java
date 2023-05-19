package mn.gov.xyp;

/**
 * OTP код авах WS100008_registerOTPRequest сервисийг ашиглаж WS100101_getCitizenIDCardInfo сервисийг ашиглах хүсэлтийг sms-ээр явуулах
 *
 * @author unenbat
 * @since 2023-05-*
 */
public class OTPApprove {
    public static void main(String[] args) {
        XypClientCode clientCode = new XypClientCode();
        clientCode.callUseOTP("123987654", Constants.REGNUM);
        //coming soon
    }
}
