
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkCitizenAddressInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkCitizenAddressInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validAimagCity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validApartemnt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validBagKhoroo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validSoumDistrict" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="validStreet" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCitizenAddressInfoData", propOrder = {
    "valid",
    "validAimagCity",
    "validApartemnt",
    "validBagKhoroo",
    "validSoumDistrict",
    "validStreet"
})
public class CheckCitizenAddressInfoData {

    protected boolean valid;
    protected boolean validAimagCity;
    protected boolean validApartemnt;
    protected boolean validBagKhoroo;
    protected boolean validSoumDistrict;
    protected boolean validStreet;

    /**
     * Gets the value of the valid property.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

    /**
     * Gets the value of the validAimagCity property.
     * 
     */
    public boolean isValidAimagCity() {
        return validAimagCity;
    }

    /**
     * Sets the value of the validAimagCity property.
     * 
     */
    public void setValidAimagCity(boolean value) {
        this.validAimagCity = value;
    }

    /**
     * Gets the value of the validApartemnt property.
     * 
     */
    public boolean isValidApartemnt() {
        return validApartemnt;
    }

    /**
     * Sets the value of the validApartemnt property.
     * 
     */
    public void setValidApartemnt(boolean value) {
        this.validApartemnt = value;
    }

    /**
     * Gets the value of the validBagKhoroo property.
     * 
     */
    public boolean isValidBagKhoroo() {
        return validBagKhoroo;
    }

    /**
     * Sets the value of the validBagKhoroo property.
     * 
     */
    public void setValidBagKhoroo(boolean value) {
        this.validBagKhoroo = value;
    }

    /**
     * Gets the value of the validSoumDistrict property.
     * 
     */
    public boolean isValidSoumDistrict() {
        return validSoumDistrict;
    }

    /**
     * Sets the value of the validSoumDistrict property.
     * 
     */
    public void setValidSoumDistrict(boolean value) {
        this.validSoumDistrict = value;
    }

    /**
     * Gets the value of the validStreet property.
     * 
     */
    public boolean isValidStreet() {
        return validStreet;
    }

    /**
     * Sets the value of the validStreet property.
     * 
     */
    public void setValidStreet(boolean value) {
        this.validStreet = value;
    }

}
