
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for covid19NatData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covid19NatData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="institution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specimensType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="testTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="testType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covid19NatData", propOrder = {
    "institution",
    "result",
    "specimensType",
    "testTime",
    "testType",
    "timezone"
})
public class Covid19NatData {

    protected String institution;
    protected String result;
    protected int specimensType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar testTime;
    protected int testType;
    protected int timezone;

    /**
     * Gets the value of the institution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * Sets the value of the institution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitution(String value) {
        this.institution = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the specimensType property.
     * 
     */
    public int getSpecimensType() {
        return specimensType;
    }

    /**
     * Sets the value of the specimensType property.
     * 
     */
    public void setSpecimensType(int value) {
        this.specimensType = value;
    }

    /**
     * Gets the value of the testTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTestTime() {
        return testTime;
    }

    /**
     * Sets the value of the testTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTestTime(XMLGregorianCalendar value) {
        this.testTime = value;
    }

    /**
     * Gets the value of the testType property.
     * 
     */
    public int getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     */
    public void setTestType(int value) {
        this.testType = value;
    }

    /**
     * Gets the value of the timezone property.
     * 
     */
    public int getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     * 
     */
    public void setTimezone(int value) {
        this.timezone = value;
    }

}
