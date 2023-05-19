
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenBorderPassDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenBorderPassDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accPersonBirthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accPersonCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accPersonGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accPersonPassportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accPersonRegisterNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accPersonSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accPersonSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accompanied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="back" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="child" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="childDeliveryService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryExitCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stayDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tripPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenBorderPassDetailData", propOrder = {
    "accPersonBirthDate",
    "accPersonCountry",
    "accPersonGivenName",
    "accPersonPassportNum",
    "accPersonRegisterNum",
    "accPersonSex",
    "accPersonSurname",
    "accompanied",
    "back",
    "birthDate",
    "child",
    "childDeliveryService",
    "country",
    "crewMember",
    "departPerson",
    "driver",
    "entryExitCountry",
    "expireDate",
    "givenName",
    "identityType",
    "issuedDate",
    "parent",
    "passDate",
    "passDateTime",
    "passDirection",
    "passportNum",
    "passportType",
    "portName",
    "registerNum",
    "registerType",
    "sexName",
    "stayDays",
    "surname",
    "transport",
    "tripNum",
    "tripPurpose"
})
public class CitizenBorderPassDetailData {

    protected String accPersonBirthDate;
    protected String accPersonCountry;
    protected String accPersonGivenName;
    protected String accPersonPassportNum;
    protected String accPersonRegisterNum;
    protected String accPersonSex;
    protected String accPersonSurname;
    protected String accompanied;
    protected String back;
    protected String birthDate;
    protected String child;
    protected String childDeliveryService;
    protected String country;
    protected String crewMember;
    protected String departPerson;
    protected String driver;
    protected String entryExitCountry;
    protected String expireDate;
    protected String givenName;
    protected String identityType;
    protected String issuedDate;
    protected String parent;
    protected String passDate;
    protected String passDateTime;
    protected String passDirection;
    protected String passportNum;
    protected String passportType;
    protected String portName;
    protected String registerNum;
    protected String registerType;
    protected String sexName;
    protected String stayDays;
    protected String surname;
    protected String transport;
    protected String tripNum;
    protected String tripPurpose;

    /**
     * Gets the value of the accPersonBirthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonBirthDate() {
        return accPersonBirthDate;
    }

    /**
     * Sets the value of the accPersonBirthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonBirthDate(String value) {
        this.accPersonBirthDate = value;
    }

    /**
     * Gets the value of the accPersonCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonCountry() {
        return accPersonCountry;
    }

    /**
     * Sets the value of the accPersonCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonCountry(String value) {
        this.accPersonCountry = value;
    }

    /**
     * Gets the value of the accPersonGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonGivenName() {
        return accPersonGivenName;
    }

    /**
     * Sets the value of the accPersonGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonGivenName(String value) {
        this.accPersonGivenName = value;
    }

    /**
     * Gets the value of the accPersonPassportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonPassportNum() {
        return accPersonPassportNum;
    }

    /**
     * Sets the value of the accPersonPassportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonPassportNum(String value) {
        this.accPersonPassportNum = value;
    }

    /**
     * Gets the value of the accPersonRegisterNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonRegisterNum() {
        return accPersonRegisterNum;
    }

    /**
     * Sets the value of the accPersonRegisterNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonRegisterNum(String value) {
        this.accPersonRegisterNum = value;
    }

    /**
     * Gets the value of the accPersonSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonSex() {
        return accPersonSex;
    }

    /**
     * Sets the value of the accPersonSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonSex(String value) {
        this.accPersonSex = value;
    }

    /**
     * Gets the value of the accPersonSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccPersonSurname() {
        return accPersonSurname;
    }

    /**
     * Sets the value of the accPersonSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccPersonSurname(String value) {
        this.accPersonSurname = value;
    }

    /**
     * Gets the value of the accompanied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccompanied() {
        return accompanied;
    }

    /**
     * Sets the value of the accompanied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccompanied(String value) {
        this.accompanied = value;
    }

    /**
     * Gets the value of the back property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBack() {
        return back;
    }

    /**
     * Sets the value of the back property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBack(String value) {
        this.back = value;
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
     * Gets the value of the child property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChild() {
        return child;
    }

    /**
     * Sets the value of the child property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChild(String value) {
        this.child = value;
    }

    /**
     * Gets the value of the childDeliveryService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildDeliveryService() {
        return childDeliveryService;
    }

    /**
     * Sets the value of the childDeliveryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildDeliveryService(String value) {
        this.childDeliveryService = value;
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
     * Gets the value of the crewMember property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrewMember() {
        return crewMember;
    }

    /**
     * Sets the value of the crewMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrewMember(String value) {
        this.crewMember = value;
    }

    /**
     * Gets the value of the departPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartPerson() {
        return departPerson;
    }

    /**
     * Sets the value of the departPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartPerson(String value) {
        this.departPerson = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the entryExitCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryExitCountry() {
        return entryExitCountry;
    }

    /**
     * Sets the value of the entryExitCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryExitCountry(String value) {
        this.entryExitCountry = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
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
     * Gets the value of the issuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedDate() {
        return issuedDate;
    }

    /**
     * Sets the value of the issuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedDate(String value) {
        this.issuedDate = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
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
     * Gets the value of the portName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortName() {
        return portName;
    }

    /**
     * Sets the value of the portName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortName(String value) {
        this.portName = value;
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
     * Gets the value of the registerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterType() {
        return registerType;
    }

    /**
     * Sets the value of the registerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterType(String value) {
        this.registerType = value;
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
     * Gets the value of the stayDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayDays() {
        return stayDays;
    }

    /**
     * Sets the value of the stayDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayDays(String value) {
        this.stayDays = value;
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
     * Gets the value of the transport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransport() {
        return transport;
    }

    /**
     * Sets the value of the transport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransport(String value) {
        this.transport = value;
    }

    /**
     * Gets the value of the tripNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNum() {
        return tripNum;
    }

    /**
     * Sets the value of the tripNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNum(String value) {
        this.tripNum = value;
    }

    /**
     * Gets the value of the tripPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripPurpose() {
        return tripPurpose;
    }

    /**
     * Sets the value of the tripPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripPurpose(String value) {
        this.tripPurpose = value;
    }

}
