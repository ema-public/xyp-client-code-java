
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for covid19InternationalCertData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covid19InternationalCertData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="covid19NatData" type="{http://citizen.xyp.gov.mn/}covid19NatData" minOccurs="0"/>
 *         &lt;element name="covid19PersonalData" type="{http://citizen.xyp.gov.mn/}covid19PersonalData" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listVaccineData" type="{http://citizen.xyp.gov.mn/}vaccineData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="medicalCertificateData" type="{http://citizen.xyp.gov.mn/}medicalCertificateData" minOccurs="0"/>
 *         &lt;element name="qrCodeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vaccineData" type="{http://citizen.xyp.gov.mn/}covid19VaccineData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covid19InternationalCertData", propOrder = {
    "countryCode",
    "covid19NatData",
    "covid19PersonalData",
    "id",
    "listVaccineData",
    "medicalCertificateData",
    "qrCodeTime",
    "signature",
    "timeZone",
    "vaccineData"
})
public class Covid19InternationalCertData {

    protected String countryCode;
    protected Covid19NatData covid19NatData;
    protected Covid19PersonalData covid19PersonalData;
    protected String id;
    @XmlElement(nillable = true)
    protected List<VaccineData> listVaccineData;
    protected MedicalCertificateData medicalCertificateData;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qrCodeTime;
    protected String signature;
    protected int timeZone;
    protected Covid19VaccineData vaccineData;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the covid19NatData property.
     * 
     * @return
     *     possible object is
     *     {@link Covid19NatData }
     *     
     */
    public Covid19NatData getCovid19NatData() {
        return covid19NatData;
    }

    /**
     * Sets the value of the covid19NatData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Covid19NatData }
     *     
     */
    public void setCovid19NatData(Covid19NatData value) {
        this.covid19NatData = value;
    }

    /**
     * Gets the value of the covid19PersonalData property.
     * 
     * @return
     *     possible object is
     *     {@link Covid19PersonalData }
     *     
     */
    public Covid19PersonalData getCovid19PersonalData() {
        return covid19PersonalData;
    }

    /**
     * Sets the value of the covid19PersonalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Covid19PersonalData }
     *     
     */
    public void setCovid19PersonalData(Covid19PersonalData value) {
        this.covid19PersonalData = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the listVaccineData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listVaccineData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListVaccineData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VaccineData }
     * 
     * 
     */
    public List<VaccineData> getListVaccineData() {
        if (listVaccineData == null) {
            listVaccineData = new ArrayList<VaccineData>();
        }
        return this.listVaccineData;
    }

    /**
     * Gets the value of the medicalCertificateData property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalCertificateData }
     *     
     */
    public MedicalCertificateData getMedicalCertificateData() {
        return medicalCertificateData;
    }

    /**
     * Sets the value of the medicalCertificateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalCertificateData }
     *     
     */
    public void setMedicalCertificateData(MedicalCertificateData value) {
        this.medicalCertificateData = value;
    }

    /**
     * Gets the value of the qrCodeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQrCodeTime() {
        return qrCodeTime;
    }

    /**
     * Sets the value of the qrCodeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQrCodeTime(XMLGregorianCalendar value) {
        this.qrCodeTime = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
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
     * Gets the value of the vaccineData property.
     * 
     * @return
     *     possible object is
     *     {@link Covid19VaccineData }
     *     
     */
    public Covid19VaccineData getVaccineData() {
        return vaccineData;
    }

    /**
     * Sets the value of the vaccineData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Covid19VaccineData }
     *     
     */
    public void setVaccineData(Covid19VaccineData value) {
        this.vaccineData = value;
    }

}
