
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allChildrenInfoByMotherDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allChildrenInfoByMotherDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adoptionInvalidDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adoptionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMotherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newMotherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldMotherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldMotherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allChildrenInfoByMotherDetailData", propOrder = {
    "adoptionInvalidDate",
    "adoptionStatus",
    "civilId",
    "civilStatus",
    "firstname",
    "lastname",
    "motherCivilId",
    "motherRegnum",
    "newMotherCivilId",
    "newMotherRegnum",
    "oldMotherCivilId",
    "oldMotherRegnum",
    "oldRegnum",
    "regDate",
    "registryType",
    "regnum"
})
public class AllChildrenInfoByMotherDetailData {

    protected String adoptionInvalidDate;
    protected String adoptionStatus;
    protected String civilId;
    protected String civilStatus;
    protected String firstname;
    protected String lastname;
    protected String motherCivilId;
    protected String motherRegnum;
    protected String newMotherCivilId;
    protected String newMotherRegnum;
    protected String oldMotherCivilId;
    protected String oldMotherRegnum;
    protected String oldRegnum;
    protected String regDate;
    protected String registryType;
    protected String regnum;

    /**
     * Gets the value of the adoptionInvalidDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdoptionInvalidDate() {
        return adoptionInvalidDate;
    }

    /**
     * Sets the value of the adoptionInvalidDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdoptionInvalidDate(String value) {
        this.adoptionInvalidDate = value;
    }

    /**
     * Gets the value of the adoptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdoptionStatus() {
        return adoptionStatus;
    }

    /**
     * Sets the value of the adoptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdoptionStatus(String value) {
        this.adoptionStatus = value;
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
     * Gets the value of the civilStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * Sets the value of the civilStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatus(String value) {
        this.civilStatus = value;
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
     * Gets the value of the newMotherCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMotherCivilId() {
        return newMotherCivilId;
    }

    /**
     * Sets the value of the newMotherCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMotherCivilId(String value) {
        this.newMotherCivilId = value;
    }

    /**
     * Gets the value of the newMotherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMotherRegnum() {
        return newMotherRegnum;
    }

    /**
     * Sets the value of the newMotherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMotherRegnum(String value) {
        this.newMotherRegnum = value;
    }

    /**
     * Gets the value of the oldMotherCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMotherCivilId() {
        return oldMotherCivilId;
    }

    /**
     * Sets the value of the oldMotherCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMotherCivilId(String value) {
        this.oldMotherCivilId = value;
    }

    /**
     * Gets the value of the oldMotherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldMotherRegnum() {
        return oldMotherRegnum;
    }

    /**
     * Sets the value of the oldMotherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldMotherRegnum(String value) {
        this.oldMotherRegnum = value;
    }

    /**
     * Gets the value of the oldRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldRegnum() {
        return oldRegnum;
    }

    /**
     * Sets the value of the oldRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldRegnum(String value) {
        this.oldRegnum = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the registryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryType() {
        return registryType;
    }

    /**
     * Sets the value of the registryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryType(String value) {
        this.registryType = value;
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

}
