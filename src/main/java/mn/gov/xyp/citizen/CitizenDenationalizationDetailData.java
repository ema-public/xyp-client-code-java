
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for citizenDenationalizationDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenDenationalizationDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordinanceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ordinanceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="registeredDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnumEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenDenationalizationDetailData", propOrder = {
    "birthDate",
    "civilId",
    "firstname",
    "firstnameEng",
    "lastname",
    "lastnameEng",
    "nationalityName",
    "ordinanceDate",
    "ordinanceNumber",
    "registeredDate",
    "regnum",
    "regnumEng",
    "surname",
    "surnameEng"
})
public class CitizenDenationalizationDetailData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String civilId;
    protected String firstname;
    protected String firstnameEng;
    protected String lastname;
    protected String lastnameEng;
    protected String nationalityName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordinanceDate;
    protected String ordinanceNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registeredDate;
    protected String regnum;
    protected String regnumEng;
    protected String surname;
    protected String surnameEng;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
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
     * Gets the value of the ordinanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdinanceDate() {
        return ordinanceDate;
    }

    /**
     * Sets the value of the ordinanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdinanceDate(XMLGregorianCalendar value) {
        this.ordinanceDate = value;
    }

    /**
     * Gets the value of the ordinanceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinanceNumber() {
        return ordinanceNumber;
    }

    /**
     * Sets the value of the ordinanceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinanceNumber(String value) {
        this.ordinanceNumber = value;
    }

    /**
     * Gets the value of the registeredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisteredDate() {
        return registeredDate;
    }

    /**
     * Sets the value of the registeredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisteredDate(XMLGregorianCalendar value) {
        this.registeredDate = value;
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
     * Gets the value of the regnumEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumEng() {
        return regnumEng;
    }

    /**
     * Sets the value of the regnumEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumEng(String value) {
        this.regnumEng = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
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

}
