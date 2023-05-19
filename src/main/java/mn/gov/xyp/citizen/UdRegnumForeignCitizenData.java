
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for udRegnumForeignCitizenData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udRegnumForeignCitizenData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideAimagCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideKhoroo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideSoumDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="residentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udRegnumForeignCitizenData", propOrder = {
    "birthDate",
    "countryName",
    "expiedDate",
    "firstname",
    "identityType",
    "issiedDate",
    "lastname",
    "passportNum",
    "passportType",
    "regnum",
    "resideAddress",
    "resideAimagCity",
    "resideKhoroo",
    "resideSoumDistrict",
    "residentNum",
    "residentType",
    "sex",
    "status"
})
public class UdRegnumForeignCitizenData {

    protected String birthDate;
    protected String countryName;
    protected String expiedDate;
    protected String firstname;
    protected String identityType;
    protected String issiedDate;
    protected String lastname;
    protected String passportNum;
    protected String passportType;
    protected String regnum;
    protected String resideAddress;
    protected String resideAimagCity;
    protected String resideKhoroo;
    protected String resideSoumDistrict;
    protected String residentNum;
    protected String residentType;
    protected String sex;
    protected String status;

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
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the expiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiedDate() {
        return expiedDate;
    }

    /**
     * Sets the value of the expiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiedDate(String value) {
        this.expiedDate = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
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
     * Gets the value of the issiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssiedDate() {
        return issiedDate;
    }

    /**
     * Sets the value of the issiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssiedDate(String value) {
        this.issiedDate = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
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
     * Gets the value of the resideAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideAddress() {
        return resideAddress;
    }

    /**
     * Sets the value of the resideAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideAddress(String value) {
        this.resideAddress = value;
    }

    /**
     * Gets the value of the resideAimagCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideAimagCity() {
        return resideAimagCity;
    }

    /**
     * Sets the value of the resideAimagCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideAimagCity(String value) {
        this.resideAimagCity = value;
    }

    /**
     * Gets the value of the resideKhoroo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideKhoroo() {
        return resideKhoroo;
    }

    /**
     * Sets the value of the resideKhoroo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideKhoroo(String value) {
        this.resideKhoroo = value;
    }

    /**
     * Gets the value of the resideSoumDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideSoumDistrict() {
        return resideSoumDistrict;
    }

    /**
     * Sets the value of the resideSoumDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideSoumDistrict(String value) {
        this.resideSoumDistrict = value;
    }

    /**
     * Gets the value of the residentNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentNum() {
        return residentNum;
    }

    /**
     * Sets the value of the residentNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentNum(String value) {
        this.residentNum = value;
    }

    /**
     * Gets the value of the residentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidentType() {
        return residentType;
    }

    /**
     * Sets the value of the residentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidentType(String value) {
        this.residentType = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
