
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for citizenDeceaseData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenDeceaseData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deceaseCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deceaseDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deceasePlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "citizenDeceaseData", propOrder = {
    "deceaseCauseName",
    "deceaseCity",
    "deceaseDate",
    "deceaseDistrict",
    "deceasePlaceName",
    "firstName",
    "lastName",
    "regnum"
})
public class CitizenDeceaseData {

    protected String deceaseCauseName;
    protected String deceaseCity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deceaseDate;
    protected String deceaseDistrict;
    protected String deceasePlaceName;
    protected String firstName;
    protected String lastName;
    protected String regnum;

    /**
     * Gets the value of the deceaseCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCauseName() {
        return deceaseCauseName;
    }

    /**
     * Sets the value of the deceaseCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCauseName(String value) {
        this.deceaseCauseName = value;
    }

    /**
     * Gets the value of the deceaseCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseCity() {
        return deceaseCity;
    }

    /**
     * Sets the value of the deceaseCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseCity(String value) {
        this.deceaseCity = value;
    }

    /**
     * Gets the value of the deceaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeceaseDate() {
        return deceaseDate;
    }

    /**
     * Sets the value of the deceaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeceaseDate(XMLGregorianCalendar value) {
        this.deceaseDate = value;
    }

    /**
     * Gets the value of the deceaseDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceaseDistrict() {
        return deceaseDistrict;
    }

    /**
     * Sets the value of the deceaseDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceaseDistrict(String value) {
        this.deceaseDistrict = value;
    }

    /**
     * Gets the value of the deceasePlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceasePlaceName() {
        return deceasePlaceName;
    }

    /**
     * Sets the value of the deceasePlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceasePlaceName(String value) {
        this.deceasePlaceName = value;
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
