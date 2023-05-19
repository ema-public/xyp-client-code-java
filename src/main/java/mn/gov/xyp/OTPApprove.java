package mn.gov.xyp;

public class OTPApprove {
    public static void main(String[] args) {
        XypClientCode clientCode = new XypClientCode();
        clientCode.callUseOTP("123987654", Constants.REGNUM);
    }
}
