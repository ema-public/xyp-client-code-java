
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenBirthsAndRelativesInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenBirthsAndRelativesInfoDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthAimagCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthSoumDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faForeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyForeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familySurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="foreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inquiryTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moForeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moSurName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resideAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenBirthsAndRelativesInfoDetailData", propOrder = {
    "birthAimagCity",
    "birthPlace",
    "birthSoumDistrict",
    "faForeName",
    "faGivenName",
    "faRegisterNum",
    "faSurName",
    "familyForeName",
    "familyGivenName",
    "familyRegisterNum",
    "familySurName",
    "familyTypeName",
    "foreName",
    "givenName",
    "inquiryDate",
    "inquiryTypeName",
    "moForeName",
    "moGivenName",
    "moRegisterNum",
    "moSurName",
    "recipientGivenName",
    "recipientRegisterNum",
    "recipientSurname",
    "registerNum",
    "resideAddress",
    "surName"
})
public class CitizenBirthsAndRelativesInfoDetailData {

    protected String birthAimagCity;
    protected String birthPlace;
    protected String birthSoumDistrict;
    protected String faForeName;
    protected String faGivenName;
    protected String faRegisterNum;
    protected String faSurName;
    protected String familyForeName;
    protected String familyGivenName;
    protected String familyRegisterNum;
    protected String familySurName;
    protected String familyTypeName;
    protected String foreName;
    protected String givenName;
    protected String inquiryDate;
    protected String inquiryTypeName;
    protected String moForeName;
    protected String moGivenName;
    protected String moRegisterNum;
    protected String moSurName;
    protected String recipientGivenName;
    protected String recipientRegisterNum;
    protected String recipientSurname;
    protected String registerNum;
    protected String resideAddress;
    protected String surName;

    /**
     * Gets the value of the birthAimagCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthAimagCity() {
        return birthAimagCity;
    }

    /**
     * Sets the value of the birthAimagCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthAimagCity(String value) {
        this.birthAimagCity = value;
    }

    /**
     * Gets the value of the birthPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the value of the birthPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlace(String value) {
        this.birthPlace = value;
    }

    /**
     * Gets the value of the birthSoumDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthSoumDistrict() {
        return birthSoumDistrict;
    }

    /**
     * Sets the value of the birthSoumDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthSoumDistrict(String value) {
        this.birthSoumDistrict = value;
    }

    /**
     * Gets the value of the faForeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaForeName() {
        return faForeName;
    }

    /**
     * Sets the value of the faForeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaForeName(String value) {
        this.faForeName = value;
    }

    /**
     * Gets the value of the faGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaGivenName() {
        return faGivenName;
    }

    /**
     * Sets the value of the faGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaGivenName(String value) {
        this.faGivenName = value;
    }

    /**
     * Gets the value of the faRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaRegisterNum() {
        return faRegisterNum;
    }

    /**
     * Sets the value of the faRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaRegisterNum(String value) {
        this.faRegisterNum = value;
    }

    /**
     * Gets the value of the faSurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaSurName() {
        return faSurName;
    }

    /**
     * Sets the value of the faSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaSurName(String value) {
        this.faSurName = value;
    }

    /**
     * Gets the value of the familyForeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyForeName() {
        return familyForeName;
    }

    /**
     * Sets the value of the familyForeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyForeName(String value) {
        this.familyForeName = value;
    }

    /**
     * Gets the value of the familyGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyGivenName() {
        return familyGivenName;
    }

    /**
     * Sets the value of the familyGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyGivenName(String value) {
        this.familyGivenName = value;
    }

    /**
     * Gets the value of the familyRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyRegisterNum() {
        return familyRegisterNum;
    }

    /**
     * Sets the value of the familyRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyRegisterNum(String value) {
        this.familyRegisterNum = value;
    }

    /**
     * Gets the value of the familySurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilySurName() {
        return familySurName;
    }

    /**
     * Sets the value of the familySurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilySurName(String value) {
        this.familySurName = value;
    }

    /**
     * Gets the value of the familyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyTypeName() {
        return familyTypeName;
    }

    /**
     * Sets the value of the familyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyTypeName(String value) {
        this.familyTypeName = value;
    }

    /**
     * Gets the value of the foreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeName() {
        return foreName;
    }

    /**
     * Sets the value of the foreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeName(String value) {
        this.foreName = value;
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
     * Gets the value of the inquiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryDate() {
        return inquiryDate;
    }

    /**
     * Sets the value of the inquiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryDate(String value) {
        this.inquiryDate = value;
    }

    /**
     * Gets the value of the inquiryTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryTypeName() {
        return inquiryTypeName;
    }

    /**
     * Sets the value of the inquiryTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryTypeName(String value) {
        this.inquiryTypeName = value;
    }

    /**
     * Gets the value of the moForeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoForeName() {
        return moForeName;
    }

    /**
     * Sets the value of the moForeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoForeName(String value) {
        this.moForeName = value;
    }

    /**
     * Gets the value of the moGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoGivenName() {
        return moGivenName;
    }

    /**
     * Sets the value of the moGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoGivenName(String value) {
        this.moGivenName = value;
    }

    /**
     * Gets the value of the moRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoRegisterNum() {
        return moRegisterNum;
    }

    /**
     * Sets the value of the moRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoRegisterNum(String value) {
        this.moRegisterNum = value;
    }

    /**
     * Gets the value of the moSurName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoSurName() {
        return moSurName;
    }

    /**
     * Sets the value of the moSurName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoSurName(String value) {
        this.moSurName = value;
    }

    /**
     * Gets the value of the recipientGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientGivenName() {
        return recipientGivenName;
    }

    /**
     * Sets the value of the recipientGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientGivenName(String value) {
        this.recipientGivenName = value;
    }

    /**
     * Gets the value of the recipientRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientRegisterNum() {
        return recipientRegisterNum;
    }

    /**
     * Sets the value of the recipientRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientRegisterNum(String value) {
        this.recipientRegisterNum = value;
    }

    /**
     * Gets the value of the recipientSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientSurname() {
        return recipientSurname;
    }

    /**
     * Sets the value of the recipientSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientSurname(String value) {
        this.recipientSurname = value;
    }

    /**
     * Gets the value of the registerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNum() {
        return registerNum;
    }

    /**
     * Sets the value of the registerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNum(String value) {
        this.registerNum = value;
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
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

}
