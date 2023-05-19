
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for serviceInsertBirthInfoRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceInsertBirthInfoRequestData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="birthAimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="birthHeadCircle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthPlaceCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthPlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthShoulderCircle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthSoumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthWeeks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="birthWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="citizenType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAlive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isTwin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motherAimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherAimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherCivilId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherFullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherSoumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherSoumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceInsertBirthInfoRequestData", propOrder = {
    "birthAimagCityCode",
    "birthDate",
    "birthHeadCircle",
    "birthHeight",
    "birthPlaceCode",
    "birthPlaceName",
    "birthShoulderCircle",
    "birthSoumDistrictCode",
    "birthTime",
    "birthType",
    "birthWeeks",
    "birthWeight",
    "citizenType",
    "countryName",
    "createdUser",
    "isAlive",
    "isTwin",
    "motherAimagCityCode",
    "motherAimagCityName",
    "motherCivilId",
    "motherFirstName",
    "motherFullAddress",
    "motherLastName",
    "motherRegnum",
    "motherSoumDistrictCode",
    "motherSoumDistrictName",
    "regnum",
    "sexCode"
})
public class ServiceInsertBirthInfoRequestData
    extends ServiceRequest
{

    protected String birthAimagCityCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected int birthHeadCircle;
    protected int birthHeight;
    protected int birthPlaceCode;
    protected String birthPlaceName;
    protected int birthShoulderCircle;
    protected String birthSoumDistrictCode;
    protected String birthTime;
    protected int birthType;
    protected int birthWeeks;
    protected int birthWeight;
    protected int citizenType;
    protected String countryName;
    protected String createdUser;
    protected int isAlive;
    protected int isTwin;
    protected String motherAimagCityCode;
    protected String motherAimagCityName;
    protected int motherCivilId;
    protected String motherFirstName;
    protected String motherFullAddress;
    protected String motherLastName;
    protected String motherRegnum;
    protected String motherSoumDistrictCode;
    protected String motherSoumDistrictName;
    protected String regnum;
    protected int sexCode;

    /**
     * Gets the value of the birthAimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthAimagCityCode() {
        return birthAimagCityCode;
    }

    /**
     * Sets the value of the birthAimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthAimagCityCode(String value) {
        this.birthAimagCityCode = value;
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
     * Gets the value of the birthHeadCircle property.
     * 
     */
    public int getBirthHeadCircle() {
        return birthHeadCircle;
    }

    /**
     * Sets the value of the birthHeadCircle property.
     * 
     */
    public void setBirthHeadCircle(int value) {
        this.birthHeadCircle = value;
    }

    /**
     * Gets the value of the birthHeight property.
     * 
     */
    public int getBirthHeight() {
        return birthHeight;
    }

    /**
     * Sets the value of the birthHeight property.
     * 
     */
    public void setBirthHeight(int value) {
        this.birthHeight = value;
    }

    /**
     * Gets the value of the birthPlaceCode property.
     * 
     */
    public int getBirthPlaceCode() {
        return birthPlaceCode;
    }

    /**
     * Sets the value of the birthPlaceCode property.
     * 
     */
    public void setBirthPlaceCode(int value) {
        this.birthPlaceCode = value;
    }

    /**
     * Gets the value of the birthPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceName() {
        return birthPlaceName;
    }

    /**
     * Sets the value of the birthPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceName(String value) {
        this.birthPlaceName = value;
    }

    /**
     * Gets the value of the birthShoulderCircle property.
     * 
     */
    public int getBirthShoulderCircle() {
        return birthShoulderCircle;
    }

    /**
     * Sets the value of the birthShoulderCircle property.
     * 
     */
    public void setBirthShoulderCircle(int value) {
        this.birthShoulderCircle = value;
    }

    /**
     * Gets the value of the birthSoumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthSoumDistrictCode() {
        return birthSoumDistrictCode;
    }

    /**
     * Sets the value of the birthSoumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthSoumDistrictCode(String value) {
        this.birthSoumDistrictCode = value;
    }

    /**
     * Gets the value of the birthTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthTime() {
        return birthTime;
    }

    /**
     * Sets the value of the birthTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthTime(String value) {
        this.birthTime = value;
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
     * Gets the value of the birthWeeks property.
     * 
     */
    public int getBirthWeeks() {
        return birthWeeks;
    }

    /**
     * Sets the value of the birthWeeks property.
     * 
     */
    public void setBirthWeeks(int value) {
        this.birthWeeks = value;
    }

    /**
     * Gets the value of the birthWeight property.
     * 
     */
    public int getBirthWeight() {
        return birthWeight;
    }

    /**
     * Sets the value of the birthWeight property.
     * 
     */
    public void setBirthWeight(int value) {
        this.birthWeight = value;
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
     * Gets the value of the isAlive property.
     * 
     */
    public int getIsAlive() {
        return isAlive;
    }

    /**
     * Sets the value of the isAlive property.
     * 
     */
    public void setIsAlive(int value) {
        this.isAlive = value;
    }

    /**
     * Gets the value of the isTwin property.
     * 
     */
    public int getIsTwin() {
        return isTwin;
    }

    /**
     * Sets the value of the isTwin property.
     * 
     */
    public void setIsTwin(int value) {
        this.isTwin = value;
    }

    /**
     * Gets the value of the motherAimagCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherAimagCityCode() {
        return motherAimagCityCode;
    }

    /**
     * Sets the value of the motherAimagCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherAimagCityCode(String value) {
        this.motherAimagCityCode = value;
    }

    /**
     * Gets the value of the motherAimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherAimagCityName() {
        return motherAimagCityName;
    }

    /**
     * Sets the value of the motherAimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherAimagCityName(String value) {
        this.motherAimagCityName = value;
    }

    /**
     * Gets the value of the motherCivilId property.
     * 
     */
    public int getMotherCivilId() {
        return motherCivilId;
    }

    /**
     * Sets the value of the motherCivilId property.
     * 
     */
    public void setMotherCivilId(int value) {
        this.motherCivilId = value;
    }

    /**
     * Gets the value of the motherFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherFirstName() {
        return motherFirstName;
    }

    /**
     * Sets the value of the motherFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherFirstName(String value) {
        this.motherFirstName = value;
    }

    /**
     * Gets the value of the motherFullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherFullAddress() {
        return motherFullAddress;
    }

    /**
     * Sets the value of the motherFullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherFullAddress(String value) {
        this.motherFullAddress = value;
    }

    /**
     * Gets the value of the motherLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherLastName() {
        return motherLastName;
    }

    /**
     * Sets the value of the motherLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherLastName(String value) {
        this.motherLastName = value;
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
     * Gets the value of the motherSoumDistrictCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherSoumDistrictCode() {
        return motherSoumDistrictCode;
    }

    /**
     * Sets the value of the motherSoumDistrictCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherSoumDistrictCode(String value) {
        this.motherSoumDistrictCode = value;
    }

    /**
     * Gets the value of the motherSoumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherSoumDistrictName() {
        return motherSoumDistrictName;
    }

    /**
     * Sets the value of the motherSoumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherSoumDistrictName(String value) {
        this.motherSoumDistrictName = value;
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

}
