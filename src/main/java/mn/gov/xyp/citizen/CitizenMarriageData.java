
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenMarriageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenMarriageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="husband" type="{http://citizen.xyp.gov.mn/}citizenMarriageBriefData" minOccurs="0"/>
 *         &lt;element name="married" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="marriedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wife" type="{http://citizen.xyp.gov.mn/}citizenMarriageBriefData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenMarriageData", propOrder = {
    "husband",
    "married",
    "marriedDate",
    "registeredCity",
    "registeredDate",
    "registeredDistrict",
    "registeredId",
    "wife"
})
public class CitizenMarriageData {

    protected CitizenMarriageBriefData husband;
    protected boolean married;
    protected String marriedDate;
    protected String registeredCity;
    protected String registeredDate;
    protected String registeredDistrict;
    protected String registeredId;
    protected CitizenMarriageBriefData wife;

    /**
     * Gets the value of the husband property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public CitizenMarriageBriefData getHusband() {
        return husband;
    }

    /**
     * Sets the value of the husband property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public void setHusband(CitizenMarriageBriefData value) {
        this.husband = value;
    }

    /**
     * Gets the value of the married property.
     * 
     */
    public boolean isMarried() {
        return married;
    }

    /**
     * Sets the value of the married property.
     * 
     */
    public void setMarried(boolean value) {
        this.married = value;
    }

    /**
     * Gets the value of the marriedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedDate() {
        return marriedDate;
    }

    /**
     * Sets the value of the marriedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedDate(String value) {
        this.marriedDate = value;
    }

    /**
     * Gets the value of the registeredCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredCity() {
        return registeredCity;
    }

    /**
     * Sets the value of the registeredCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredCity(String value) {
        this.registeredCity = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredDate(String value) {
        this.registeredDate = value;
    }

    /**
     * Gets the value of the registeredDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredDistrict() {
        return registeredDistrict;
    }

    /**
     * Sets the value of the registeredDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredDistrict(String value) {
        this.registeredDistrict = value;
    }

    /**
     * Gets the value of the registeredId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredId() {
        return registeredId;
    }

    /**
     * Sets the value of the registeredId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredId(String value) {
        this.registeredId = value;
    }

    /**
     * Gets the value of the wife property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public CitizenMarriageBriefData getWife() {
        return wife;
    }

    /**
     * Sets the value of the wife property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public void setWife(CitizenMarriageBriefData value) {
        this.wife = value;
    }

}
