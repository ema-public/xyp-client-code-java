
package mn.gov.xyp.meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registerOTPRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registerOTPRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://meta.xyp.gov.mn/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="isApp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isEmail" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isKiosk" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isSms" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jsonWSList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registerOTPRequest", propOrder = {
    "isApp",
    "isEmail",
    "isKiosk",
    "isSms",
    "jsonWSList",
    "phoneNum",
    "regnum"
})
public class RegisterOTPRequest
    extends ServiceRequest
{

    protected int isApp;
    protected int isEmail;
    protected int isKiosk;
    protected int isSms;
    protected String jsonWSList;
    protected int phoneNum;
    protected String regnum;

    /**
     * Gets the value of the isApp property.
     * 
     */
    public int getIsApp() {
        return isApp;
    }

    /**
     * Sets the value of the isApp property.
     * 
     */
    public void setIsApp(int value) {
        this.isApp = value;
    }

    /**
     * Gets the value of the isEmail property.
     * 
     */
    public int getIsEmail() {
        return isEmail;
    }

    /**
     * Sets the value of the isEmail property.
     * 
     */
    public void setIsEmail(int value) {
        this.isEmail = value;
    }

    /**
     * Gets the value of the isKiosk property.
     * 
     */
    public int getIsKiosk() {
        return isKiosk;
    }

    /**
     * Sets the value of the isKiosk property.
     * 
     */
    public void setIsKiosk(int value) {
        this.isKiosk = value;
    }

    /**
     * Gets the value of the isSms property.
     * 
     */
    public int getIsSms() {
        return isSms;
    }

    /**
     * Sets the value of the isSms property.
     * 
     */
    public void setIsSms(int value) {
        this.isSms = value;
    }

    /**
     * Gets the value of the jsonWSList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonWSList() {
        return jsonWSList;
    }

    /**
     * Sets the value of the jsonWSList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonWSList(String value) {
        this.jsonWSList = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     */
    public int getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     */
    public void setPhoneNum(int value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

}
