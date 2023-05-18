
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orphanInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orphanInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adoptionCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherPassportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherPassportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "orphanInfoData", propOrder = {
    "address",
    "addressCountry",
    "addressMail",
    "adoptionCountry",
    "birthDate",
    "decisionDate",
    "decisionNum",
    "description",
    "fatherBirthDate",
    "fatherCountry",
    "fatherGivenName",
    "fatherPassportNum",
    "fatherRegisterNum",
    "fatherSex",
    "fatherSurname",
    "fatherWork",
    "givenName",
    "motherBirthDate",
    "motherCountry",
    "motherGivenName",
    "motherPassportNum",
    "motherRegisterNum",
    "motherSex",
    "motherSurname",
    "motherWork",
    "newGivenName",
    "newSurname",
    "registerNum",
    "sex",
    "surname"
})
public class OrphanInfoData {

    protected String address;
    protected String addressCountry;
    protected String addressMail;
    protected String adoptionCountry;
    protected String birthDate;
    protected String decisionDate;
    protected String decisionNum;
    protected String description;
    protected String fatherBirthDate;
    protected String fatherCountry;
    protected String fatherGivenName;
    protected String fatherPassportNum;
    protected String fatherRegisterNum;
    protected String fatherSex;
    protected String fatherSurname;
    protected String fatherWork;
    protected String givenName;
    protected String motherBirthDate;
    protected String motherCountry;
    protected String motherGivenName;
    protected String motherPassportNum;
    protected String motherRegisterNum;
    protected String motherSex;
    protected String motherSurname;
    protected String motherWork;
    protected String newGivenName;
    protected String newSurname;
    protected String registerNum;
    protected String sex;
    protected String surname;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCountry() {
        return addressCountry;
    }

    /**
     * Sets the value of the addressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCountry(String value) {
        this.addressCountry = value;
    }

    /**
     * Gets the value of the addressMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressMail() {
        return addressMail;
    }

    /**
     * Sets the value of the addressMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressMail(String value) {
        this.addressMail = value;
    }

    /**
     * Gets the value of the adoptionCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdoptionCountry() {
        return adoptionCountry;
    }

    /**
     * Sets the value of the adoptionCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdoptionCountry(String value) {
        this.adoptionCountry = value;
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
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionDate(String value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNum() {
        return decisionNum;
    }

    /**
     * Sets the value of the decisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNum(String value) {
        this.decisionNum = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the fatherBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherBirthDate() {
        return fatherBirthDate;
    }

    /**
     * Sets the value of the fatherBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherBirthDate(String value) {
        this.fatherBirthDate = value;
    }

    /**
     * Gets the value of the fatherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherCountry() {
        return fatherCountry;
    }

    /**
     * Sets the value of the fatherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherCountry(String value) {
        this.fatherCountry = value;
    }

    /**
     * Gets the value of the fatherGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherGivenName() {
        return fatherGivenName;
    }

    /**
     * Sets the value of the fatherGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherGivenName(String value) {
        this.fatherGivenName = value;
    }

    /**
     * Gets the value of the fatherPassportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherPassportNum() {
        return fatherPassportNum;
    }

    /**
     * Sets the value of the fatherPassportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherPassportNum(String value) {
        this.fatherPassportNum = value;
    }

    /**
     * Gets the value of the fatherRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherRegisterNum() {
        return fatherRegisterNum;
    }

    /**
     * Sets the value of the fatherRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherRegisterNum(String value) {
        this.fatherRegisterNum = value;
    }

    /**
     * Gets the value of the fatherSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherSex() {
        return fatherSex;
    }

    /**
     * Sets the value of the fatherSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherSex(String value) {
        this.fatherSex = value;
    }

    /**
     * Gets the value of the fatherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherSurname() {
        return fatherSurname;
    }

    /**
     * Sets the value of the fatherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherSurname(String value) {
        this.fatherSurname = value;
    }

    /**
     * Gets the value of the fatherWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherWork() {
        return fatherWork;
    }

    /**
     * Sets the value of the fatherWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherWork(String value) {
        this.fatherWork = value;
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
     * Gets the value of the motherBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherBirthDate() {
        return motherBirthDate;
    }

    /**
     * Sets the value of the motherBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherBirthDate(String value) {
        this.motherBirthDate = value;
    }

    /**
     * Gets the value of the motherCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherCountry() {
        return motherCountry;
    }

    /**
     * Sets the value of the motherCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherCountry(String value) {
        this.motherCountry = value;
    }

    /**
     * Gets the value of the motherGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherGivenName() {
        return motherGivenName;
    }

    /**
     * Sets the value of the motherGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherGivenName(String value) {
        this.motherGivenName = value;
    }

    /**
     * Gets the value of the motherPassportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherPassportNum() {
        return motherPassportNum;
    }

    /**
     * Sets the value of the motherPassportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherPassportNum(String value) {
        this.motherPassportNum = value;
    }

    /**
     * Gets the value of the motherRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegisterNum() {
        return motherRegisterNum;
    }

    /**
     * Sets the value of the motherRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegisterNum(String value) {
        this.motherRegisterNum = value;
    }

    /**
     * Gets the value of the motherSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherSex() {
        return motherSex;
    }

    /**
     * Sets the value of the motherSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherSex(String value) {
        this.motherSex = value;
    }

    /**
     * Gets the value of the motherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherSurname() {
        return motherSurname;
    }

    /**
     * Sets the value of the motherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherSurname(String value) {
        this.motherSurname = value;
    }

    /**
     * Gets the value of the motherWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherWork() {
        return motherWork;
    }

    /**
     * Sets the value of the motherWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherWork(String value) {
        this.motherWork = value;
    }

    /**
     * Gets the value of the newGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewGivenName() {
        return newGivenName;
    }

    /**
     * Sets the value of the newGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewGivenName(String value) {
        this.newGivenName = value;
    }

    /**
     * Gets the value of the newSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewSurname() {
        return newSurname;
    }

    /**
     * Sets the value of the newSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewSurname(String value) {
        this.newSurname = value;
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
