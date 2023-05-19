
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for citizenWasCriminalLiabilityDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenWasCriminalLiabilityDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endPunishment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exemptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalActDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punishmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="punishmentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punishmentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punishmentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="punishmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releasedDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenWasCriminalLiabilityDetailData", propOrder = {
    "country",
    "courtName",
    "decreeNumber",
    "description",
    "endPunishment",
    "exemptDate",
    "familyName",
    "firstName",
    "lastName",
    "legalAct",
    "legalActDesc",
    "punishmentDate",
    "punishmentDesc",
    "punishmentLevel",
    "punishmentTime",
    "punishmentType",
    "regnum",
    "releasedDesc",
    "statusId"
})
public class CitizenWasCriminalLiabilityDetailData {

    protected String country;
    protected String courtName;
    protected String decreeNumber;
    protected String description;
    protected String endPunishment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exemptDate;
    protected String familyName;
    protected String firstName;
    protected String lastName;
    protected String legalAct;
    protected String legalActDesc;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar punishmentDate;
    protected String punishmentDesc;
    protected String punishmentLevel;
    protected String punishmentTime;
    protected String punishmentType;
    protected String regnum;
    protected String releasedDesc;
    protected String statusId;

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
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

    /**
     * Gets the value of the decreeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecreeNumber() {
        return decreeNumber;
    }

    /**
     * Sets the value of the decreeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecreeNumber(String value) {
        this.decreeNumber = value;
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
     * Gets the value of the endPunishment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPunishment() {
        return endPunishment;
    }

    /**
     * Sets the value of the endPunishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPunishment(String value) {
        this.endPunishment = value;
    }

    /**
     * Gets the value of the exemptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExemptDate() {
        return exemptDate;
    }

    /**
     * Sets the value of the exemptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExemptDate(XMLGregorianCalendar value) {
        this.exemptDate = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the legalAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalAct() {
        return legalAct;
    }

    /**
     * Sets the value of the legalAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalAct(String value) {
        this.legalAct = value;
    }

    /**
     * Gets the value of the legalActDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActDesc() {
        return legalActDesc;
    }

    /**
     * Sets the value of the legalActDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActDesc(String value) {
        this.legalActDesc = value;
    }

    /**
     * Gets the value of the punishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPunishmentDate() {
        return punishmentDate;
    }

    /**
     * Sets the value of the punishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPunishmentDate(XMLGregorianCalendar value) {
        this.punishmentDate = value;
    }

    /**
     * Gets the value of the punishmentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentDesc() {
        return punishmentDesc;
    }

    /**
     * Sets the value of the punishmentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentDesc(String value) {
        this.punishmentDesc = value;
    }

    /**
     * Gets the value of the punishmentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentLevel() {
        return punishmentLevel;
    }

    /**
     * Sets the value of the punishmentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentLevel(String value) {
        this.punishmentLevel = value;
    }

    /**
     * Gets the value of the punishmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentTime() {
        return punishmentTime;
    }

    /**
     * Sets the value of the punishmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentTime(String value) {
        this.punishmentTime = value;
    }

    /**
     * Gets the value of the punishmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentType() {
        return punishmentType;
    }

    /**
     * Sets the value of the punishmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentType(String value) {
        this.punishmentType = value;
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
     * Gets the value of the releasedDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleasedDesc() {
        return releasedDesc;
    }

    /**
     * Sets the value of the releasedDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleasedDesc(String value) {
        this.releasedDesc = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusId(String value) {
        this.statusId = value;
    }

}
