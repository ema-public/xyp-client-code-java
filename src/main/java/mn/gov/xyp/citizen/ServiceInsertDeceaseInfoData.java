
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for serviceInsertDeceaseInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceInsertDeceaseInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthCase" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="citizenType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathDiagDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deathReason1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathReason2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deathReason3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decaseTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decceaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deceaseCauseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceasePlaceCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deceaseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceInsertDeceaseInfoData", propOrder = {
    "aimagCityCode",
    "aimagCityName",
    "birthCase",
    "birthType",
    "citizenType",
    "civilId",
    "countryName",
    "createdUser",
    "deathDiagDate",
    "deathReason1",
    "deathReason2",
    "deathReason3",
    "decaseTime",
    "decceaseDate",
    "deceaseCauseCode",
    "deceaseCauseName",
    "deceasePlaceCode",
    "deceaseType",
    "firstname",
    "fullAddress",
    "lastname",
    "regnum",
    "sexCode",
    "soumDistrictCode",
    "soumDistrictName"
})
public class ServiceInsertDeceaseInfoData {

    protected String aimagCityCode;
    protected String aimagCityName;
    protected int birthCase;
    protected int birthType;
    protected int citizenType;
    protected int civilId;
    protected String countryName;
    protected String createdUser;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deathDiagDate;
    protected String deathReason1;
    protected String deathReason2;
    protected String deathReason3;
    protected String decaseTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decceaseDate;
    protected String deceaseCauseCode;
    protected String deceaseCauseName;
    protected int deceasePlaceCode;
    protected String deceaseType;
    protected String firstname;
    protected String fullAddress;
    protected String lastname;
    protected String regnum;
    protected int sexCode;
    protected String soumDistrictCode;
    protected String soumDistrictName;

    /**
     * Gets the value of the aimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityCode() {
        return aimagCityCode;
    }

    /**
     * Sets the value of the aimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityCode(String value) {
        this.aimagCityCode = value;
    }

    /**
     * Gets the value of the aimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityName() {
        return aimagCityName;
    }

    /**
     * Sets the value of the aimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityName(String value) {
        this.aimagCityName = value;
    }

    /**
     * Gets the value of the birthCase property.
     * 
     */
    public int getBirthCase() {
        return birthCase;
    }

    /**
     * Sets the value of the birthCase property.
     * 
     */
    public void setBirthCase(int value) {
        this.birthCase = value;
    }

    /**
     * Gets the value of the birthType property.
     * 
     */
    public int getBirthType() {
        return birthType;
    }

    /**
     * Sets the value of the birthType property.
     * 
     */
    public void setBirthType(int value) {
        this.birthType = value;
    }

    /**
     * Gets the value of the citizenType property.
     * 
     */
    public int getCitizenType() {
        return citizenType;
    }

    /**
     * Sets the value of the citizenType property.
     * 
     */
    public void setCitizenType(int value) {
        this.citizenType = value;
    }

    /**
     * Gets the value of the civilId property.
     * 
     */
    public int getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     */
    public void setCivilId(int value) {
        this.civilId = value;
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
     * Gets the value of the createdUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUser() {
        return createdUser;
    }

    /**
     * Sets the value of the createdUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUser(String value) {
        this.createdUser = value;
    }

    /**
     * Gets the value of the deathDiagDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeathDiagDate() {
        return deathDiagDate;
    }

    /**
     * Sets the value of the deathDiagDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeathDiagDate(XMLGregorianCalendar value) {
        this.deathDiagDate = value;
    }

    /**
     * Gets the value of the deathReason1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathReason1() {
        return deathReason1;
    }

    /**
     * Sets the value of the deathReason1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathReason1(String value) {
        this.deathReason1 = value;
    }

    /**
     * Gets the value of the deathReason2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathReason2() {
        return deathReason2;
    }

    /**
     * Sets the value of the deathReason2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathReason2(String value) {
        this.deathReason2 = value;
    }

    /**
     * Gets the value of the deathReason3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathReason3() {
        return deathReason3;
    }

    /**
     * Sets the value of the deathReason3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathReason3(String value) {
        this.deathReason3 = value;
    }

    /**
     * Gets the value of the decaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecaseTime() {
        return decaseTime;
    }

    /**
     * Sets the value of the decaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecaseTime(String value) {
        this.decaseTime = value;
    }

    /**
     * Gets the value of the decceaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecceaseDate() {
        return decceaseDate;
    }

    /**
     * Sets the value of the decceaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecceaseDate(XMLGregorianCalendar value) {
        this.decceaseDate = value;
    }

    /**
     * Gets the value of the deceaseCauseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCauseCode() {
        return deceaseCauseCode;
    }

    /**
     * Sets the value of the deceaseCauseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCauseCode(String value) {
        this.deceaseCauseCode = value;
    }

    /**
     * Gets the value of the deceaseCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCauseName() {
        return deceaseCauseName;
    }

    /**
     * Sets the value of the deceaseCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCauseName(String value) {
        this.deceaseCauseName = value;
    }

    /**
     * Gets the value of the deceasePlaceCode property.
     * 
     */
    public int getDeceasePlaceCode() {
        return deceasePlaceCode;
    }

    /**
     * Sets the value of the deceasePlaceCode property.
     * 
     */
    public void setDeceasePlaceCode(int value) {
        this.deceasePlaceCode = value;
    }

    /**
     * Gets the value of the deceaseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseType() {
        return deceaseType;
    }

    /**
     * Sets the value of the deceaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseType(String value) {
        this.deceaseType = value;
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
     * Gets the value of the sexCode property.
     * 
     */
    public int getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     */
    public void setSexCode(int value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the soumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictCode() {
        return soumDistrictCode;
    }

    /**
     * Sets the value of the soumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictCode(String value) {
        this.soumDistrictCode = value;
    }

    /**
     * Gets the value of the soumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictName() {
        return soumDistrictName;
    }

    /**
     * Sets the value of the soumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictName(String value) {
        this.soumDistrictName = value;
    }

}
