
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foreignCitizenVisaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignCitizenVisaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accChildCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviterOrgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviterOrgRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaEntries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaIssedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaIssuedOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaStayDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaValidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignCitizenVisaData", propOrder = {
    "accChildCount",
    "birthDate",
    "country",
    "givenName",
    "identityType",
    "inviterOrgName",
    "inviterOrgRegister",
    "passportNum",
    "passportType",
    "sexName",
    "surname",
    "visaCategory",
    "visaEntries",
    "visaIssedDate",
    "visaIssuedOrg",
    "visaLevel",
    "visaNum",
    "visaStayDays",
    "visaType",
    "visaValidDate"
})
public class ForeignCitizenVisaData {

    protected String accChildCount;
    protected String birthDate;
    protected String country;
    protected String givenName;
    protected String identityType;
    protected String inviterOrgName;
    protected String inviterOrgRegister;
    protected String passportNum;
    protected String passportType;
    protected String sexName;
    protected String surname;
    protected String visaCategory;
    protected String visaEntries;
    protected String visaIssedDate;
    protected String visaIssuedOrg;
    protected String visaLevel;
    protected String visaNum;
    protected String visaStayDays;
    protected String visaType;
    protected String visaValidDate;

    /**
     * Gets the value of the accChildCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccChildCount() {
        return accChildCount;
    }

    /**
     * Sets the value of the accChildCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccChildCount(String value) {
        this.accChildCount = value;
    }

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
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the inviterOrgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviterOrgName() {
        return inviterOrgName;
    }

    /**
     * Sets the value of the inviterOrgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviterOrgName(String value) {
        this.inviterOrgName = value;
    }

    /**
     * Gets the value of the inviterOrgRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviterOrgRegister() {
        return inviterOrgRegister;
    }

    /**
     * Sets the value of the inviterOrgRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviterOrgRegister(String value) {
        this.inviterOrgRegister = value;
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
     * Gets the value of the passportType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportType() {
        return passportType;
    }

    /**
     * Sets the value of the passportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportType(String value) {
        this.passportType = value;
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
     * Gets the value of the visaCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaCategory() {
        return visaCategory;
    }

    /**
     * Sets the value of the visaCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaCategory(String value) {
        this.visaCategory = value;
    }

    /**
     * Gets the value of the visaEntries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaEntries() {
        return visaEntries;
    }

    /**
     * Sets the value of the visaEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaEntries(String value) {
        this.visaEntries = value;
    }

    /**
     * Gets the value of the visaIssedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaIssedDate() {
        return visaIssedDate;
    }

    /**
     * Sets the value of the visaIssedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaIssedDate(String value) {
        this.visaIssedDate = value;
    }

    /**
     * Gets the value of the visaIssuedOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaIssuedOrg() {
        return visaIssuedOrg;
    }

    /**
     * Sets the value of the visaIssuedOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaIssuedOrg(String value) {
        this.visaIssuedOrg = value;
    }

    /**
     * Gets the value of the visaLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaLevel() {
        return visaLevel;
    }

    /**
     * Sets the value of the visaLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaLevel(String value) {
        this.visaLevel = value;
    }

    /**
     * Gets the value of the visaNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNum() {
        return visaNum;
    }

    /**
     * Sets the value of the visaNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNum(String value) {
        this.visaNum = value;
    }

    /**
     * Gets the value of the visaStayDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaStayDays() {
        return visaStayDays;
    }

    /**
     * Sets the value of the visaStayDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaStayDays(String value) {
        this.visaStayDays = value;
    }

    /**
     * Gets the value of the visaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaType() {
        return visaType;
    }

    /**
     * Sets the value of the visaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaType(String value) {
        this.visaType = value;
    }

    /**
     * Gets the value of the visaValidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaValidDate() {
        return visaValidDate;
    }

    /**
     * Sets the value of the visaValidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaValidDate(String value) {
        this.visaValidDate = value;
    }

}
