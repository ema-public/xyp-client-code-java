
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for borderPassInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="borderPassInfoDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenNameCyr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passpordType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnumCyr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameCyr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borderPassInfoDetailData", propOrder = {
    "birthDate",
    "givenName",
    "givenNameCyr",
    "id",
    "identityType",
    "passDate",
    "passDateTime",
    "passDirection",
    "passpordType",
    "passportNum",
    "regnum",
    "regnumCyr",
    "sexName",
    "surname",
    "surnameCyr"
})
public class BorderPassInfoDetailData {

    protected String birthDate;
    protected String givenName;
    protected String givenNameCyr;
    protected String id;
    protected String identityType;
    protected String passDate;
    protected String passDateTime;
    protected String passDirection;
    protected String passpordType;
    protected String passportNum;
    protected String regnum;
    protected String regnumCyr;
    protected String sexName;
    protected String surname;
    protected String surnameCyr;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Gets the value of the givenNameCyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenNameCyr() {
        return givenNameCyr;
    }

    /**
     * Sets the value of the givenNameCyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenNameCyr(String value) {
        this.givenNameCyr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the identityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * Sets the value of the identityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityType(String value) {
        this.identityType = value;
    }

    /**
     * Gets the value of the passDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDate() {
        return passDate;
    }

    /**
     * Sets the value of the passDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDate(String value) {
        this.passDate = value;
    }

    /**
     * Gets the value of the passDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDateTime() {
        return passDateTime;
    }

    /**
     * Sets the value of the passDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDateTime(String value) {
        this.passDateTime = value;
    }

    /**
     * Gets the value of the passDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassDirection() {
        return passDirection;
    }

    /**
     * Sets the value of the passDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassDirection(String value) {
        this.passDirection = value;
    }

    /**
     * Gets the value of the passpordType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasspordType() {
        return passpordType;
    }

    /**
     * Sets the value of the passpordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasspordType(String value) {
        this.passpordType = value;
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

    /**
     * Gets the value of the regnumCyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumCyr() {
        return regnumCyr;
    }

    /**
     * Sets the value of the regnumCyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumCyr(String value) {
        this.regnumCyr = value;
    }

    /**
     * Gets the value of the sexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexName() {
        return sexName;
    }

    /**
     * Sets the value of the sexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexName(String value) {
        this.sexName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the surnameCyr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameCyr() {
        return surnameCyr;
    }

    /**
     * Sets the value of the surnameCyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameCyr(String value) {
        this.surnameCyr = value;
    }

}
