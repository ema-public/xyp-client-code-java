
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTegCivilInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTegCivilInfoDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressApartmentId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressApartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressRegionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressRegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressStreetId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTownId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bagKhorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="faCivilId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="foreName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moCivilId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseCivilId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="surName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTegCivilInfoDetailData", propOrder = {
    "addressApartmentId",
    "addressApartmentName",
    "addressDetail",
    "addressId",
    "addressRegionId",
    "addressRegionName",
    "addressStreetId",
    "addressStreetName",
    "addressTownId",
    "addressTownName",
    "addressTypeCode",
    "addressTypeName",
    "aimagCityCode",
    "aimagCityName",
    "bagKhorooCode",
    "bagKhorooName",
    "birthDate",
    "civilId",
    "faCivilId",
    "foreName",
    "givenName",
    "moCivilId",
    "modifiedDate",
    "registeredNum",
    "regnum",
    "sexName",
    "soumDistrictCode",
    "soumDistrictName",
    "spouseCivilId",
    "surName"
})
public class GetTegCivilInfoDetailData {

    protected int addressApartmentId;
    protected String addressApartmentName;
    protected String addressDetail;
    protected int addressId;
    protected int addressRegionId;
    protected String addressRegionName;
    protected int addressStreetId;
    protected String addressStreetName;
    protected String addressTownId;
    protected String addressTownName;
    protected String addressTypeCode;
    protected String addressTypeName;
    protected String aimagCityCode;
    protected String aimagCityName;
    protected String bagKhorooCode;
    protected String bagKhorooName;
    protected String birthDate;
    protected int civilId;
    protected int faCivilId;
    protected String foreName;
    protected String givenName;
    protected int moCivilId;
    protected String modifiedDate;
    protected int registeredNum;
    protected String regnum;
    protected String sexName;
    protected String soumDistrictCode;
    protected String soumDistrictName;
    protected int spouseCivilId;
    protected String surName;

    /**
     * Gets the value of the addressApartmentId property.
     * 
     */
    public int getAddressApartmentId() {
        return addressApartmentId;
    }

    /**
     * Sets the value of the addressApartmentId property.
     * 
     */
    public void setAddressApartmentId(int value) {
        this.addressApartmentId = value;
    }

    /**
     * Gets the value of the addressApartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressApartmentName() {
        return addressApartmentName;
    }

    /**
     * Sets the value of the addressApartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressApartmentName(String value) {
        this.addressApartmentName = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDetail(String value) {
        this.addressDetail = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     */
    public void setAddressId(int value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressRegionId property.
     * 
     */
    public int getAddressRegionId() {
        return addressRegionId;
    }

    /**
     * Sets the value of the addressRegionId property.
     * 
     */
    public void setAddressRegionId(int value) {
        this.addressRegionId = value;
    }

    /**
     * Gets the value of the addressRegionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegionName() {
        return addressRegionName;
    }

    /**
     * Sets the value of the addressRegionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegionName(String value) {
        this.addressRegionName = value;
    }

    /**
     * Gets the value of the addressStreetId property.
     * 
     */
    public int getAddressStreetId() {
        return addressStreetId;
    }

    /**
     * Sets the value of the addressStreetId property.
     * 
     */
    public void setAddressStreetId(int value) {
        this.addressStreetId = value;
    }

    /**
     * Gets the value of the addressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetName() {
        return addressStreetName;
    }

    /**
     * Sets the value of the addressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetName(String value) {
        this.addressStreetName = value;
    }

    /**
     * Gets the value of the addressTownId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTownId() {
        return addressTownId;
    }

    /**
     * Sets the value of the addressTownId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTownId(String value) {
        this.addressTownId = value;
    }

    /**
     * Gets the value of the addressTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTownName() {
        return addressTownName;
    }

    /**
     * Sets the value of the addressTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTownName(String value) {
        this.addressTownName = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeCode(String value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeName() {
        return addressTypeName;
    }

    /**
     * Sets the value of the addressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeName(String value) {
        this.addressTypeName = value;
    }

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
     * Gets the value of the bagKhorooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagKhorooCode() {
        return bagKhorooCode;
    }

    /**
     * Sets the value of the bagKhorooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagKhorooCode(String value) {
        this.bagKhorooCode = value;
    }

    /**
     * Gets the value of the bagKhorooName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagKhorooName() {
        return bagKhorooName;
    }

    /**
     * Sets the value of the bagKhorooName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagKhorooName(String value) {
        this.bagKhorooName = value;
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
     * Gets the value of the faCivilId property.
     * 
     */
    public int getFaCivilId() {
        return faCivilId;
    }

    /**
     * Sets the value of the faCivilId property.
     * 
     */
    public void setFaCivilId(int value) {
        this.faCivilId = value;
    }

    /**
     * Gets the value of the foreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeName() {
        return foreName;
    }

    /**
     * Sets the value of the foreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeName(String value) {
        this.foreName = value;
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
     * Gets the value of the moCivilId property.
     * 
     */
    public int getMoCivilId() {
        return moCivilId;
    }

    /**
     * Sets the value of the moCivilId property.
     * 
     */
    public void setMoCivilId(int value) {
        this.moCivilId = value;
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
     * Gets the value of the registeredNum property.
     * 
     */
    public int getRegisteredNum() {
        return registeredNum;
    }

    /**
     * Sets the value of the registeredNum property.
     * 
     */
    public void setRegisteredNum(int value) {
        this.registeredNum = value;
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

    /**
     * Gets the value of the spouseCivilId property.
     * 
     */
    public int getSpouseCivilId() {
        return spouseCivilId;
    }

    /**
     * Sets the value of the spouseCivilId property.
     * 
     */
    public void setSpouseCivilId(int value) {
        this.spouseCivilId = value;
    }

    /**
     * Gets the value of the surName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurName() {
        return surName;
    }

    /**
     * Sets the value of the surName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurName(String value) {
        this.surName = value;
    }

}
