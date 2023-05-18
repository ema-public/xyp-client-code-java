
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for foreignCitizenBorderPassDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignCitizenBorderPassDetailData">
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
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crewMember" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryExitCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isAccompanied" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isBack" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isChildDeliveryService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDepartPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isDriver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="passDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
 *         &lt;element name="visaCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaEntries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaIssuedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaIssuedOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "foreignCitizenBorderPassDetailData", propOrder = {
    "accPersonBirthDate",
    "accPersonCountry",
    "accPersonGivenName",
    "accPersonPassportNum",
    "accPersonRegisterNum",
    "accPersonSex",
    "accPersonSurname",
    "birthDate",
    "country",
    "crewMember",
    "entryExitCountry",
    "expireDate",
    "givenName",
    "identityType",
    "isAccompanied",
    "isBack",
    "isChild",
    "isChildDeliveryService",
    "isDepartPerson",
    "isDriver",
    "isParent",
    "issuedDate",
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
    "tripPurpose",
    "visaCategory",
    "visaEntries",
    "visaIssuedDate",
    "visaIssuedOrg",
    "visaLevel",
    "visaNum",
    "visaType",
    "visaValidDate"
})
public class ForeignCitizenBorderPassDetailData {

    protected String accPersonBirthDate;
    protected String accPersonCountry;
    protected String accPersonGivenName;
    protected String accPersonPassportNum;
    protected String accPersonRegisterNum;
    protected String accPersonSex;
    protected String accPersonSurname;
    protected String birthDate;
    protected String country;
    protected String crewMember;
    protected String entryExitCountry;
    protected String expireDate;
    protected String givenName;
    protected String identityType;
    protected String isAccompanied;
    protected String isBack;
    protected String isChild;
    protected String isChildDeliveryService;
    protected String isDepartPerson;
    protected String isDriver;
    protected String isParent;
    protected String issuedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar passDateTime;
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
    protected String visaCategory;
    protected String visaEntries;
    protected String visaIssuedDate;
    protected String visaIssuedOrg;
    protected String visaLevel;
    protected String visaNum;
    protected String visaType;
    protected String visaValidDate;

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
     * Gets the value of the isAccompanied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAccompanied() {
        return isAccompanied;
    }

    /**
     * Sets the value of the isAccompanied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAccompanied(String value) {
        this.isAccompanied = value;
    }

    /**
     * Gets the value of the isBack property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsBack() {
        return isBack;
    }

    /**
     * Sets the value of the isBack property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsBack(String value) {
        this.isBack = value;
    }

    /**
     * Gets the value of the isChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsChild() {
        return isChild;
    }

    /**
     * Sets the value of the isChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsChild(String value) {
        this.isChild = value;
    }

    /**
     * Gets the value of the isChildDeliveryService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsChildDeliveryService() {
        return isChildDeliveryService;
    }

    /**
     * Sets the value of the isChildDeliveryService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsChildDeliveryService(String value) {
        this.isChildDeliveryService = value;
    }

    /**
     * Gets the value of the isDepartPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDepartPerson() {
        return isDepartPerson;
    }

    /**
     * Sets the value of the isDepartPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDepartPerson(String value) {
        this.isDepartPerson = value;
    }

    /**
     * Gets the value of the isDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDriver() {
        return isDriver;
    }

    /**
     * Sets the value of the isDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDriver(String value) {
        this.isDriver = value;
    }

    /**
     * Gets the value of the isParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsParent() {
        return isParent;
    }

    /**
     * Sets the value of the isParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsParent(String value) {
        this.isParent = value;
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
     * Gets the value of the passDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassDate() {
        return passDate;
    }

    /**
     * Sets the value of the passDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassDate(XMLGregorianCalendar value) {
        this.passDate = value;
    }

    /**
     * Gets the value of the passDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPassDateTime() {
        return passDateTime;
    }

    /**
     * Sets the value of the passDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPassDateTime(XMLGregorianCalendar value) {
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
     * Gets the value of the visaIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaIssuedDate() {
        return visaIssuedDate;
    }

    /**
     * Sets the value of the visaIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaIssuedDate(String value) {
        this.visaIssuedDate = value;
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
