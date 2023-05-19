
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for citizenVisaViolationCheckInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenVisaViolationCheckInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="violationinfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaViolationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenVisaViolationCheckInfoData", propOrder = {
    "status",
    "violationinfo",
    "visaViolationDate"
})
public class CitizenVisaViolationCheckInfoData {

    protected boolean status;
    protected String violationinfo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visaViolationDate;

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the violationinfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViolationinfo() {
        return violationinfo;
    }

    /**
     * Sets the value of the violationinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViolationinfo(String value) {
        this.violationinfo = value;
    }

    /**
     * Gets the value of the visaViolationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisaViolationDate() {
        return visaViolationDate;
    }

    /**
     * Sets the value of the visaViolationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisaViolationDate(XMLGregorianCalendar value) {
        this.visaViolationDate = value;
    }

}
