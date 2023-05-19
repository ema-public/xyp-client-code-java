
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arrivedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="door" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fatherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstnameMgl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstnameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="khorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="khorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameMgl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameMgl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameMn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenDetailData", propOrder = {
    "addressId",
    "apartmentId",
    "apartmentName",
    "arrivedDate",
    "birthDate",
    "cityCode",
    "cityName",
    "civilId",
    "civilStatusCode",
    "civilStatusName",
    "districtCode",
    "districtName",
    "door",
    "fatherCivilId",
    "fatherRegnum",
    "firstnameEng",
    "firstnameMgl",
    "firstnameMn",
    "genderCode",
    "genderName",
    "khorooCode",
    "khorooName",
    "lastnameEng",
    "lastnameMgl",
    "lastnameMn",
    "modifiedDate",
    "motherCivilId",
    "motherRegnum",
    "nationalityCode",
    "nationalityName",
    "originCode",
    "originName",
    "regionId",
    "regionName",
    "regnum",
    "streetId",
    "streetName",
    "surnameEng",
    "surnameMgl",
    "surnameMn",
    "townId",
    "townName"
})
public class CitizenDetailData {

    protected String addressId;
    protected String apartmentId;
    protected String apartmentName;
    protected String arrivedDate;
    protected String birthDate;
    protected String cityCode;
    protected String cityName;
    protected String civilId;
    protected String civilStatusCode;
    protected String civilStatusName;
    protected String districtCode;
    protected String districtName;
    protected String door;
    protected String fatherCivilId;
    protected String fatherRegnum;
    protected String firstnameEng;
    protected String firstnameMgl;
    protected String firstnameMn;
    protected String genderCode;
    protected String genderName;
    protected String khorooCode;
    protected String khorooName;
    protected String lastnameEng;
    protected String lastnameMgl;
    protected String lastnameMn;
    protected String modifiedDate;
    protected String motherCivilId;
    protected String motherRegnum;
    protected String nationalityCode;
    protected String nationalityName;
    protected String originCode;
    protected String originName;
    protected String regionId;
    protected String regionName;
    protected String regnum;
    protected String streetId;
    protected String streetName;
    protected String surnameEng;
    protected String surnameMgl;
    protected String surnameMn;
    protected String townId;
    protected String townName;

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the apartmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentId() {
        return apartmentId;
    }

    /**
     * Sets the value of the apartmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentId(String value) {
        this.apartmentId = value;
    }

    /**
     * Gets the value of the apartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentName() {
        return apartmentName;
    }

    /**
     * Sets the value of the apartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentName(String value) {
        this.apartmentName = value;
    }

    /**
     * Gets the value of the arrivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivedDate() {
        return arrivedDate;
    }

    /**
     * Sets the value of the arrivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivedDate(String value) {
        this.arrivedDate = value;
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
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
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
     * Gets the value of the civilStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatusCode() {
        return civilStatusCode;
    }

    /**
     * Sets the value of the civilStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatusCode(String value) {
        this.civilStatusCode = value;
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
     * Gets the value of the districtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCode(String value) {
        this.districtCode = value;
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
     * Gets the value of the door property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoor() {
        return door;
    }

    /**
     * Sets the value of the door property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoor(String value) {
        this.door = value;
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
     * Gets the value of the firstnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameEng() {
        return firstnameEng;
    }

    /**
     * Sets the value of the firstnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameEng(String value) {
        this.firstnameEng = value;
    }

    /**
     * Gets the value of the firstnameMgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameMgl() {
        return firstnameMgl;
    }

    /**
     * Sets the value of the firstnameMgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameMgl(String value) {
        this.firstnameMgl = value;
    }

    /**
     * Gets the value of the firstnameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstnameMn() {
        return firstnameMn;
    }

    /**
     * Sets the value of the firstnameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstnameMn(String value) {
        this.firstnameMn = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the genderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderName() {
        return genderName;
    }

    /**
     * Sets the value of the genderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderName(String value) {
        this.genderName = value;
    }

    /**
     * Gets the value of the khorooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKhorooCode() {
        return khorooCode;
    }

    /**
     * Sets the value of the khorooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKhorooCode(String value) {
        this.khorooCode = value;
    }

    /**
     * Gets the value of the khorooName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKhorooName() {
        return khorooName;
    }

    /**
     * Sets the value of the khorooName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKhorooName(String value) {
        this.khorooName = value;
    }

    /**
     * Gets the value of the lastnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameEng() {
        return lastnameEng;
    }

    /**
     * Sets the value of the lastnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameEng(String value) {
        this.lastnameEng = value;
    }

    /**
     * Gets the value of the lastnameMgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameMgl() {
        return lastnameMgl;
    }

    /**
     * Sets the value of the lastnameMgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameMgl(String value) {
        this.lastnameMgl = value;
    }

    /**
     * Gets the value of the lastnameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameMn() {
        return lastnameMn;
    }

    /**
     * Sets the value of the lastnameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameMn(String value) {
        this.lastnameMn = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
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
     * Gets the value of the nationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Sets the value of the nationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Gets the value of the nationalityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityName() {
        return nationalityName;
    }

    /**
     * Sets the value of the nationalityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityName(String value) {
        this.nationalityName = value;
    }

    /**
     * Gets the value of the originCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCode() {
        return originCode;
    }

    /**
     * Sets the value of the originCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCode(String value) {
        this.originCode = value;
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
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionId(String value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
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
     * Gets the value of the streetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetId() {
        return streetId;
    }

    /**
     * Sets the value of the streetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetId(String value) {
        this.streetId = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the surnameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameEng() {
        return surnameEng;
    }

    /**
     * Sets the value of the surnameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameEng(String value) {
        this.surnameEng = value;
    }

    /**
     * Gets the value of the surnameMgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameMgl() {
        return surnameMgl;
    }

    /**
     * Sets the value of the surnameMgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameMgl(String value) {
        this.surnameMgl = value;
    }

    /**
     * Gets the value of the surnameMn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameMn() {
        return surnameMn;
    }

    /**
     * Sets the value of the surnameMn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameMn(String value) {
        this.surnameMn = value;
    }

    /**
     * Gets the value of the townId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownId() {
        return townId;
    }

    /**
     * Sets the value of the townId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownId(String value) {
        this.townId = value;
    }

    /**
     * Gets the value of the townName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownName() {
        return townName;
    }

    /**
     * Sets the value of the townName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownName(String value) {
        this.townName = value;
    }

}
