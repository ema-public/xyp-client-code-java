
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceCheckCitizenAddressInfoRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceCheckCitizenAddressInfoRequestData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="aimagCityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bagKhorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceCheckCitizenAddressInfoRequestData", propOrder = {
    "aimagCityCode",
    "apartmentId",
    "bagKhorooCode",
    "regnum",
    "soumDistrictCode",
    "streetId"
})
public class ServiceCheckCitizenAddressInfoRequestData
    extends ServiceRequest
{

    protected String aimagCityCode;
    protected String apartmentId;
    protected String bagKhorooCode;
    protected String regnum;
    protected String soumDistrictCode;
    protected String streetId;

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

}
