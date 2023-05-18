
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenLookUpInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenLookUpInfoDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDateAsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseCaouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseDateAsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denationalizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="denationalizationNationalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordinanceDateAsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordinanceNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenLookUpInfoDetailData", propOrder = {
    "birthDateAsText",
    "civilId",
    "civilStatusName",
    "deceaseAimagCityName",
    "deceaseCaouseName",
    "deceaseDateAsText",
    "deceaseSoumDistrictName",
    "denationalizationName",
    "denationalizationNationalityName",
    "fatherRegnum",
    "firstname",
    "fullAddress",
    "gender",
    "lastname",
    "motherRegnum",
    "nationality",
    "ordinanceDateAsText",
    "ordinanceNum",
    "originName",
    "regnum",
    "surname"
})
public class CitizenLookUpInfoDetailData {

    protected String birthDateAsText;
    protected String civilId;
    protected String civilStatusName;
    protected String deceaseAimagCityName;
    protected String deceaseCaouseName;
    protected String deceaseDateAsText;
    protected String deceaseSoumDistrictName;
    protected String denationalizationName;
    protected String denationalizationNationalityName;
    protected String fatherRegnum;
    protected String firstname;
    protected String fullAddress;
    protected String gender;
    protected String lastname;
    protected String motherRegnum;
    protected String nationality;
    protected String ordinanceDateAsText;
    protected String ordinanceNum;
    protected String originName;
    protected String regnum;
    protected String surname;

    /**
     * Gets the value of the birthDateAsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDateAsText() {
        return birthDateAsText;
    }

    /**
     * Sets the value of the birthDateAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDateAsText(String value) {
        this.birthDateAsText = value;
    }

    /**
     * Gets the value of the civilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilId(String value) {
        this.civilId = value;
    }

    /**
     * Gets the value of the civilStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatusName() {
        return civilStatusName;
    }

    /**
     * Sets the value of the civilStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatusName(String value) {
        this.civilStatusName = value;
    }

    /**
     * Gets the value of the deceaseAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseAimagCityName() {
        return deceaseAimagCityName;
    }

    /**
     * Sets the value of the deceaseAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseAimagCityName(String value) {
        this.deceaseAimagCityName = value;
    }

    /**
     * Gets the value of the deceaseCaouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCaouseName() {
        return deceaseCaouseName;
    }

    /**
     * Sets the value of the deceaseCaouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCaouseName(String value) {
        this.deceaseCaouseName = value;
    }

    /**
     * Gets the value of the deceaseDateAsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseDateAsText() {
        return deceaseDateAsText;
    }

    /**
     * Sets the value of the deceaseDateAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseDateAsText(String value) {
        this.deceaseDateAsText = value;
    }

    /**
     * Gets the value of the deceaseSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseSoumDistrictName() {
        return deceaseSoumDistrictName;
    }

    /**
     * Sets the value of the deceaseSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseSoumDistrictName(String value) {
        this.deceaseSoumDistrictName = value;
    }

    /**
     * Gets the value of the denationalizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenationalizationName() {
        return denationalizationName;
    }

    /**
     * Sets the value of the denationalizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenationalizationName(String value) {
        this.denationalizationName = value;
    }

    /**
     * Gets the value of the denationalizationNationalityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDenationalizationNationalityName() {
        return denationalizationNationalityName;
    }

    /**
     * Sets the value of the denationalizationNationalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDenationalizationNationalityName(String value) {
        this.denationalizationNationalityName = value;
    }

    /**
     * Gets the value of the fatherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherRegnum() {
        return fatherRegnum;
    }

    /**
     * Sets the value of the fatherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherRegnum(String value) {
        this.fatherRegnum = value;
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
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     * Gets the value of the motherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegnum() {
        return motherRegnum;
    }

    /**
     * Sets the value of the motherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegnum(String value) {
        this.motherRegnum = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the ordinanceDateAsText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinanceDateAsText() {
        return ordinanceDateAsText;
    }

    /**
     * Sets the value of the ordinanceDateAsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinanceDateAsText(String value) {
        this.ordinanceDateAsText = value;
    }

    /**
     * Gets the value of the ordinanceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinanceNum() {
        return ordinanceNum;
    }

    /**
     * Sets the value of the ordinanceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinanceNum(String value) {
        this.ordinanceNum = value;
    }

    /**
     * Gets the value of the originName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginName() {
        return originName;
    }

    /**
     * Sets the value of the originName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginName(String value) {
        this.originName = value;
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

}
