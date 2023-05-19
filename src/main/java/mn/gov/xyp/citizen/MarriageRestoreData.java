
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for marriageRestoreData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marriageRestoreData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="husbandCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="husbandCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="husbandFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="husbandLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="husbandRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="husbandStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="husbandSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriageDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="regCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="regDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeCivilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wifeSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marriageRestoreData", propOrder = {
    "husbandCivilId",
    "husbandCountry",
    "husbandFirstname",
    "husbandLastname",
    "husbandRegnum",
    "husbandStatus",
    "husbandSurname",
    "marriageDate",
    "regCity",
    "regDate",
    "regDistrict",
    "regId",
    "wifeCivilId",
    "wifeCountry",
    "wifeFirstname",
    "wifeLastname",
    "wifeRegnum",
    "wifeStatus",
    "wifeSurname"
})
public class MarriageRestoreData {

    protected String husbandCivilId;
    protected String husbandCountry;
    protected String husbandFirstname;
    protected String husbandLastname;
    protected String husbandRegnum;
    protected String husbandStatus;
    protected String husbandSurname;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar marriageDate;
    protected String regCity;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    protected String regDistrict;
    protected String regId;
    protected String wifeCivilId;
    protected String wifeCountry;
    protected String wifeFirstname;
    protected String wifeLastname;
    protected String wifeRegnum;
    protected String wifeStatus;
    protected String wifeSurname;

    /**
     * Gets the value of the husbandCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandCivilId() {
        return husbandCivilId;
    }

    /**
     * Sets the value of the husbandCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandCivilId(String value) {
        this.husbandCivilId = value;
    }

    /**
     * Gets the value of the husbandCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandCountry() {
        return husbandCountry;
    }

    /**
     * Sets the value of the husbandCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandCountry(String value) {
        this.husbandCountry = value;
    }

    /**
     * Gets the value of the husbandFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandFirstname() {
        return husbandFirstname;
    }

    /**
     * Sets the value of the husbandFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandFirstname(String value) {
        this.husbandFirstname = value;
    }

    /**
     * Gets the value of the husbandLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandLastname() {
        return husbandLastname;
    }

    /**
     * Sets the value of the husbandLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandLastname(String value) {
        this.husbandLastname = value;
    }

    /**
     * Gets the value of the husbandRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandRegnum() {
        return husbandRegnum;
    }

    /**
     * Sets the value of the husbandRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandRegnum(String value) {
        this.husbandRegnum = value;
    }

    /**
     * Gets the value of the husbandStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandStatus() {
        return husbandStatus;
    }

    /**
     * Sets the value of the husbandStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandStatus(String value) {
        this.husbandStatus = value;
    }

    /**
     * Gets the value of the husbandSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHusbandSurname() {
        return husbandSurname;
    }

    /**
     * Sets the value of the husbandSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHusbandSurname(String value) {
        this.husbandSurname = value;
    }

    /**
     * Gets the value of the marriageDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarriageDate() {
        return marriageDate;
    }

    /**
     * Sets the value of the marriageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarriageDate(XMLGregorianCalendar value) {
        this.marriageDate = value;
    }

    /**
     * Gets the value of the regCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegCity() {
        return regCity;
    }

    /**
     * Sets the value of the regCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegCity(String value) {
        this.regCity = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the regDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDistrict() {
        return regDistrict;
    }

    /**
     * Sets the value of the regDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDistrict(String value) {
        this.regDistrict = value;
    }

    /**
     * Gets the value of the regId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegId() {
        return regId;
    }

    /**
     * Sets the value of the regId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegId(String value) {
        this.regId = value;
    }

    /**
     * Gets the value of the wifeCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeCivilId() {
        return wifeCivilId;
    }

    /**
     * Sets the value of the wifeCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeCivilId(String value) {
        this.wifeCivilId = value;
    }

    /**
     * Gets the value of the wifeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeCountry() {
        return wifeCountry;
    }

    /**
     * Sets the value of the wifeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeCountry(String value) {
        this.wifeCountry = value;
    }

    /**
     * Gets the value of the wifeFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeFirstname() {
        return wifeFirstname;
    }

    /**
     * Sets the value of the wifeFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeFirstname(String value) {
        this.wifeFirstname = value;
    }

    /**
     * Gets the value of the wifeLastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeLastname() {
        return wifeLastname;
    }

    /**
     * Sets the value of the wifeLastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeLastname(String value) {
        this.wifeLastname = value;
    }

    /**
     * Gets the value of the wifeRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeRegnum() {
        return wifeRegnum;
    }

    /**
     * Sets the value of the wifeRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeRegnum(String value) {
        this.wifeRegnum = value;
    }

    /**
     * Gets the value of the wifeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeStatus() {
        return wifeStatus;
    }

    /**
     * Sets the value of the wifeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeStatus(String value) {
        this.wifeStatus = value;
    }

    /**
     * Gets the value of the wifeSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWifeSurname() {
        return wifeSurname;
    }

    /**
     * Sets the value of the wifeSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWifeSurname(String value) {
        this.wifeSurname = value;
    }

}
