
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for covid19VaccineData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covid19VaccineData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstDoseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="secondDoseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="thirdDoseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vaccineSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covid19VaccineData", propOrder = {
    "brand",
    "firstDoseDate",
    "secondDoseDate",
    "thirdDoseDate",
    "timeZone",
    "type",
    "vaccineSerialNumber"
})
public class Covid19VaccineData {

    protected String brand;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstDoseDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar secondDoseDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar thirdDoseDate;
    protected int timeZone;
    protected String type;
    protected String vaccineSerialNumber;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the firstDoseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstDoseDate() {
        return firstDoseDate;
    }

    /**
     * Sets the value of the firstDoseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstDoseDate(XMLGregorianCalendar value) {
        this.firstDoseDate = value;
    }

    /**
     * Gets the value of the secondDoseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSecondDoseDate() {
        return secondDoseDate;
    }

    /**
     * Sets the value of the secondDoseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSecondDoseDate(XMLGregorianCalendar value) {
        this.secondDoseDate = value;
    }

    /**
     * Gets the value of the thirdDoseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getThirdDoseDate() {
        return thirdDoseDate;
    }

    /**
     * Sets the value of the thirdDoseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setThirdDoseDate(XMLGregorianCalendar value) {
        this.thirdDoseDate = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     */
    public int getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     */
    public void setTimeZone(int value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the vaccineSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVaccineSerialNumber() {
        return vaccineSerialNumber;
    }

    /**
     * Sets the value of the vaccineSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVaccineSerialNumber(String value) {
        this.vaccineSerialNumber = value;
    }

}
