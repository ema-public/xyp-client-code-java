
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for foreignCitizenForbiddenDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignCitizenForbiddenDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detectedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="penaltyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="penaltyNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prohibitionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="prohibittionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="resideAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideAimagCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideSubDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="violationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="violationDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="violationLaw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="violationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignCitizenForbiddenDetailData", propOrder = {
    "birthDate",
    "countryName",
    "detectedDate",
    "givenName",
    "identityType",
    "passportNum",
    "passportType",
    "penaltyDate",
    "penaltyNum",
    "phoneNum",
    "prohibitionStartDate",
    "prohibittionEndDate",
    "resideAddress",
    "resideAimagCity",
    "resideDistrict",
    "resideSubDistrict",
    "sexName",
    "status",
    "surname",
    "violationDate",
    "violationDetail",
    "violationLaw",
    "violationType"
})
public class ForeignCitizenForbiddenDetailData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String countryName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar detectedDate;
    protected String givenName;
    protected String identityType;
    protected String passportNum;
    protected String passportType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar penaltyDate;
    protected String penaltyNum;
    protected String phoneNum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prohibitionStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prohibittionEndDate;
    protected String resideAddress;
    protected String resideAimagCity;
    protected String resideDistrict;
    protected String resideSubDistrict;
    protected String sexName;
    protected String status;
    protected String surname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar violationDate;
    protected String violationDetail;
    protected String violationLaw;
    protected String violationType;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
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
     * Gets the value of the detectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDetectedDate() {
        return detectedDate;
    }

    /**
     * Sets the value of the detectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDetectedDate(XMLGregorianCalendar value) {
        this.detectedDate = value;
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
     * Gets the value of the penaltyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPenaltyDate() {
        return penaltyDate;
    }

    /**
     * Sets the value of the penaltyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPenaltyDate(XMLGregorianCalendar value) {
        this.penaltyDate = value;
    }

    /**
     * Gets the value of the penaltyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyNum() {
        return penaltyNum;
    }

    /**
     * Sets the value of the penaltyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyNum(String value) {
        this.penaltyNum = value;
    }

    /**
     * Gets the value of the phoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * Sets the value of the phoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNum(String value) {
        this.phoneNum = value;
    }

    /**
     * Gets the value of the prohibitionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProhibitionStartDate() {
        return prohibitionStartDate;
    }

    /**
     * Sets the value of the prohibitionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProhibitionStartDate(XMLGregorianCalendar value) {
        this.prohibitionStartDate = value;
    }

    /**
     * Gets the value of the prohibittionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProhibittionEndDate() {
        return prohibittionEndDate;
    }

    /**
     * Sets the value of the prohibittionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProhibittionEndDate(XMLGregorianCalendar value) {
        this.prohibittionEndDate = value;
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
     * Gets the value of the resideDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideDistrict() {
        return resideDistrict;
    }

    /**
     * Sets the value of the resideDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideDistrict(String value) {
        this.resideDistrict = value;
    }

    /**
     * Gets the value of the resideSubDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResideSubDistrict() {
        return resideSubDistrict;
    }

    /**
     * Sets the value of the resideSubDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResideSubDistrict(String value) {
        this.resideSubDistrict = value;
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
     * Gets the value of the violationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getViolationDate() {
        return violationDate;
    }

    /**
     * Sets the value of the violationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setViolationDate(XMLGregorianCalendar value) {
        this.violationDate = value;
    }

    /**
     * Gets the value of the violationDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationDetail() {
        return violationDetail;
    }

    /**
     * Sets the value of the violationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationDetail(String value) {
        this.violationDetail = value;
    }

    /**
     * Gets the value of the violationLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationLaw() {
        return violationLaw;
    }

    /**
     * Sets the value of the violationLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationLaw(String value) {
        this.violationLaw = value;
    }

    /**
     * Gets the value of the violationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationType() {
        return violationType;
    }

    /**
     * Sets the value of the violationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationType(String value) {
        this.violationType = value;
    }

}
