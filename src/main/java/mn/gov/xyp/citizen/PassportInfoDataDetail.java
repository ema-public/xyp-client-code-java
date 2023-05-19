
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for passportInfoDataDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="passportInfoDataDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expiryDateAsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendDateAsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="image" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="issuedDateAsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnumEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passportInfoDataDetail", propOrder = {
    "expiryDateAsText",
    "extendDateAsText",
    "firstnameEng",
    "image",
    "issuedDateAsText",
    "lastnameEng",
    "passportNum",
    "passportStatus",
    "regnumEng"
})
public class PassportInfoDataDetail {

    protected String expiryDateAsText;
    protected String extendDateAsText;
    protected String firstnameEng;
    protected byte[] image;
    protected String issuedDateAsText;
    protected String lastnameEng;
    protected String passportNum;
    protected String passportStatus;
    protected String regnumEng;

    /**
     * Gets the value of the expiryDateAsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDateAsText() {
        return expiryDateAsText;
    }

    /**
     * Sets the value of the expiryDateAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDateAsText(String value) {
        this.expiryDateAsText = value;
    }

    /**
     * Gets the value of the extendDateAsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendDateAsText() {
        return extendDateAsText;
    }

    /**
     * Sets the value of the extendDateAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendDateAsText(String value) {
        this.extendDateAsText = value;
    }

    /**
     * Gets the value of the firstnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameEng() {
        return firstnameEng;
    }

    /**
     * Sets the value of the firstnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameEng(String value) {
        this.firstnameEng = value;
    }

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImage(byte[] value) {
        this.image = value;
    }

    /**
     * Gets the value of the issuedDateAsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedDateAsText() {
        return issuedDateAsText;
    }

    /**
     * Sets the value of the issuedDateAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedDateAsText(String value) {
        this.issuedDateAsText = value;
    }

    /**
     * Gets the value of the lastnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameEng() {
        return lastnameEng;
    }

    /**
     * Sets the value of the lastnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameEng(String value) {
        this.lastnameEng = value;
    }

    /**
     * Gets the value of the passportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNum() {
        return passportNum;
    }

    /**
     * Sets the value of the passportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNum(String value) {
        this.passportNum = value;
    }

    /**
     * Gets the value of the passportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportStatus() {
        return passportStatus;
    }

    /**
     * Sets the value of the passportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportStatus(String value) {
        this.passportStatus = value;
    }

    /**
     * Gets the value of the regnumEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumEng() {
        return regnumEng;
    }

    /**
     * Sets the value of the regnumEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumEng(String value) {
        this.regnumEng = value;
    }

}
