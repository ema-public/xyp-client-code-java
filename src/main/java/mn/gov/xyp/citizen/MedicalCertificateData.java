
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicalCertificateData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicalCertificateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hospitalizedBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hospitalizedEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="medicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicalCertificateData", propOrder = {
    "hospitalizedBeginDate",
    "hospitalizedEndDate",
    "medicalName"
})
public class MedicalCertificateData {

    protected String hospitalizedBeginDate;
    protected String hospitalizedEndDate;
    protected String medicalName;

    /**
     * Gets the value of the hospitalizedBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalizedBeginDate() {
        return hospitalizedBeginDate;
    }

    /**
     * Sets the value of the hospitalizedBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalizedBeginDate(String value) {
        this.hospitalizedBeginDate = value;
    }

    /**
     * Gets the value of the hospitalizedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHospitalizedEndDate() {
        return hospitalizedEndDate;
    }

    /**
     * Sets the value of the hospitalizedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHospitalizedEndDate(String value) {
        this.hospitalizedEndDate = value;
    }

    /**
     * Gets the value of the medicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalName() {
        return medicalName;
    }

    /**
     * Sets the value of the medicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalName(String value) {
        this.medicalName = value;
    }

}
