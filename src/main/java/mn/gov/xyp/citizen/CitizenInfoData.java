
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for citizenInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressApartmentCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="addressRegionCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="addressStreetCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="addressTownCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "citizenInfoData", propOrder = {
    "addressApartmentCode",
    "addressRegionCode",
    "addressStreetCode",
    "addressTownCode",
    "aimagCityCode",
    "bagKhorooCode",
    "birthDate",
    "civilId",
    "doorNumber",
    "fatherCivilId",
    "fatherFirstname",
    "fatherLastname",
    "fatherRegnum",
    "firstname",
    "fullAddress",
    "lastname",
    "motherCivilId",
    "motherFirstname",
    "motherLastname",
    "motherRegnum",
    "regnum",
    "sex",
    "soumDistrictCode",
    "status",
    "surname"
})
public class CitizenInfoData {

    protected long addressApartmentCode;
    protected long addressRegionCode;
    protected long addressStreetCode;
    protected long addressTownCode;
    protected long aimagCityCode;
    protected long bagKhorooCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String civilId;
    protected String doorNumber;
    protected String fatherCivilId;
    protected String fatherFirstname;
    protected String fatherLastname;
    protected String fatherRegnum;
    protected String firstname;
    protected String fullAddress;
    protected String lastname;
    protected String motherCivilId;
    protected String motherFirstname;
    protected String motherLastname;
    protected String motherRegnum;
    protected String regnum;
    protected String sex;
    protected long soumDistrictCode;
    protected String status;
    protected String surname;

    /**
     * Gets the value of the addressApartmentCode property.
     * 
     */
    public long getAddressApartmentCode() {
        return addressApartmentCode;
    }

    /**
     * Sets the value of the addressApartmentCode property.
     * 
     */
    public void setAddressApartmentCode(long value) {
        this.addressApartmentCode = value;
    }

    /**
     * Gets the value of the addressRegionCode property.
     * 
     */
    public long getAddressRegionCode() {
        return addressRegionCode;
    }

    /**
     * Sets the value of the addressRegionCode property.
     * 
     */
    public void setAddressRegionCode(long value) {
        this.addressRegionCode = value;
    }

    /**
     * Gets the value of the addressStreetCode property.
     * 
     */
    public long getAddressStreetCode() {
        return addressStreetCode;
    }

    /**
     * Sets the value of the addressStreetCode property.
     * 
     */
    public void setAddressStreetCode(long value) {
        this.addressStreetCode = value;
    }

    /**
     * Gets the value of the addressTownCode property.
     * 
     */
    public long getAddressTownCode() {
        return addressTownCode;
    }

    /**
     * Sets the value of the addressTownCode property.
     * 
     */
    public void setAddressTownCode(long value) {
        this.addressTownCode = value;
    }

    /**
     * Gets the value of the aimagCityCode property.
     * 
     */
    public long getAimagCityCode() {
        return aimagCityCode;
    }

    /**
     * Sets the value of the aimagCityCode property.
     * 
     */
    public void setAimagCityCode(long value) {
        this.aimagCityCode = value;
    }

    /**
     * Gets the value of the bagKhorooCode property.
     * 
     */
    public long getBagKhorooCode() {
        return bagKhorooCode;
    }

    /**
     * Sets the value of the bagKhorooCode property.
     * 
     */
    public void setBagKhorooCode(long value) {
        this.bagKhorooCode = value;
    }

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
     * Gets the value of the doorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoorNumber() {
        return doorNumber;
    }

    /**
     * Sets the value of the doorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoorNumber(String value) {
        this.doorNumber = value;
    }

    /**
     * Gets the value of the fatherCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherCivilId() {
        return fatherCivilId;
    }

    /**
     * Sets the value of the fatherCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherCivilId(String value) {
        this.fatherCivilId = value;
    }

    /**
     * Gets the value of the fatherFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherFirstname() {
        return fatherFirstname;
    }

    /**
     * Sets the value of the fatherFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherFirstname(String value) {
        this.fatherFirstname = value;
    }

    /**
     * Gets the value of the fatherLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherLastname() {
        return fatherLastname;
    }

    /**
     * Sets the value of the fatherLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherLastname(String value) {
        this.fatherLastname = value;
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
     * Gets the value of the motherCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherCivilId() {
        return motherCivilId;
    }

    /**
     * Sets the value of the motherCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherCivilId(String value) {
        this.motherCivilId = value;
    }

    /**
     * Gets the value of the motherFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherFirstname() {
        return motherFirstname;
    }

    /**
     * Sets the value of the motherFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherFirstname(String value) {
        this.motherFirstname = value;
    }

    /**
     * Gets the value of the motherLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherLastname() {
        return motherLastname;
    }

    /**
     * Sets the value of the motherLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherLastname(String value) {
        this.motherLastname = value;
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
     * Gets the value of the soumDistrictCode property.
     * 
     */
    public long getSoumDistrictCode() {
        return soumDistrictCode;
    }

    /**
     * Sets the value of the soumDistrictCode property.
     * 
     */
    public void setSoumDistrictCode(long value) {
        this.soumDistrictCode = value;
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

}
