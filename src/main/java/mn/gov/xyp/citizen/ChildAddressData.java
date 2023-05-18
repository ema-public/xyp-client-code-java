
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childAddressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressRegionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="doorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="townCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childAddressData", propOrder = {
    "addressRegionCode",
    "aimagCityCode",
    "apartmentCode",
    "bagKhorooCode",
    "doorNumber",
    "soumDistrictCode",
    "streetCode",
    "townCode"
})
public class ChildAddressData {

    protected String addressRegionCode;
    protected String aimagCityCode;
    protected String apartmentCode;
    protected String bagKhorooCode;
    protected String doorNumber;
    protected String soumDistrictCode;
    protected String streetCode;
    protected String townCode;

    /**
     * Gets the value of the addressRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegionCode() {
        return addressRegionCode;
    }

    /**
     * Sets the value of the addressRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegionCode(String value) {
        this.addressRegionCode = value;
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
     * Gets the value of the apartmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentCode() {
        return apartmentCode;
    }

    /**
     * Sets the value of the apartmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentCode(String value) {
        this.apartmentCode = value;
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
     * Gets the value of the streetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetCode() {
        return streetCode;
    }

    /**
     * Sets the value of the streetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetCode(String value) {
        this.streetCode = value;
    }

    /**
     * Gets the value of the townCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTownCode() {
        return townCode;
    }

    /**
     * Sets the value of the townCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTownCode(String value) {
        this.townCode = value;
    }

}
