
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenGunOwnerDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenGunOwnerDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="certificateNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devitionUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gunBarrel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gunLockNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gunName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCitizen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isCoOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isGun" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provinceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="undified" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenGunOwnerDetailData", propOrder = {
    "certificateNum",
    "coOwner",
    "devitionUnitName",
    "districtName",
    "firstname",
    "gunBarrel",
    "gunLockNum",
    "gunName",
    "isCitizen",
    "isCoOwner",
    "isGun",
    "lastname",
    "mark",
    "ownerType",
    "provinceName",
    "regnum",
    "undified"
})
public class CitizenGunOwnerDetailData {

    protected String certificateNum;
    protected String coOwner;
    protected String devitionUnitName;
    protected String districtName;
    protected String firstname;
    protected String gunBarrel;
    protected String gunLockNum;
    protected String gunName;
    protected String isCitizen;
    protected String isCoOwner;
    protected String isGun;
    protected String lastname;
    protected String mark;
    protected String ownerType;
    protected String provinceName;
    protected String regnum;
    protected String undified;

    /**
     * Gets the value of the certificateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * Sets the value of the certificateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNum(String value) {
        this.certificateNum = value;
    }

    /**
     * Gets the value of the coOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoOwner() {
        return coOwner;
    }

    /**
     * Sets the value of the coOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoOwner(String value) {
        this.coOwner = value;
    }

    /**
     * Gets the value of the devitionUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevitionUnitName() {
        return devitionUnitName;
    }

    /**
     * Sets the value of the devitionUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevitionUnitName(String value) {
        this.devitionUnitName = value;
    }

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
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
     * Gets the value of the gunBarrel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGunBarrel() {
        return gunBarrel;
    }

    /**
     * Sets the value of the gunBarrel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGunBarrel(String value) {
        this.gunBarrel = value;
    }

    /**
     * Gets the value of the gunLockNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGunLockNum() {
        return gunLockNum;
    }

    /**
     * Sets the value of the gunLockNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGunLockNum(String value) {
        this.gunLockNum = value;
    }

    /**
     * Gets the value of the gunName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGunName() {
        return gunName;
    }

    /**
     * Sets the value of the gunName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGunName(String value) {
        this.gunName = value;
    }

    /**
     * Gets the value of the isCitizen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCitizen() {
        return isCitizen;
    }

    /**
     * Sets the value of the isCitizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCitizen(String value) {
        this.isCitizen = value;
    }

    /**
     * Gets the value of the isCoOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCoOwner() {
        return isCoOwner;
    }

    /**
     * Sets the value of the isCoOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCoOwner(String value) {
        this.isCoOwner = value;
    }

    /**
     * Gets the value of the isGun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsGun() {
        return isGun;
    }

    /**
     * Sets the value of the isGun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsGun(String value) {
        this.isGun = value;
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
     * Gets the value of the mark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMark() {
        return mark;
    }

    /**
     * Sets the value of the mark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMark(String value) {
        this.mark = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the provinceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * Sets the value of the provinceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvinceName(String value) {
        this.provinceName = value;
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
     * Gets the value of the undified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndified() {
        return undified;
    }

    /**
     * Sets the value of the undified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndified(String value) {
        this.undified = value;
    }

}
