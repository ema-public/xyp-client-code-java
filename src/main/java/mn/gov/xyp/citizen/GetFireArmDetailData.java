
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getFireArmDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getFireArmDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barrelExtensionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dedicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fireArmSlideName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kalibrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kalibrQty" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="markName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherKalibr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getFireArmDetailData", propOrder = {
    "barrelExtensionName",
    "dedicationName",
    "fireArmSlideName",
    "kalibrName",
    "kalibrQty",
    "markName",
    "otherKalibr"
})
public class GetFireArmDetailData {

    protected String barrelExtensionName;
    protected String dedicationName;
    protected String fireArmSlideName;
    protected String kalibrName;
    protected int kalibrQty;
    protected String markName;
    protected String otherKalibr;

    /**
     * Gets the value of the barrelExtensionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarrelExtensionName() {
        return barrelExtensionName;
    }

    /**
     * Sets the value of the barrelExtensionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarrelExtensionName(String value) {
        this.barrelExtensionName = value;
    }

    /**
     * Gets the value of the dedicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicationName() {
        return dedicationName;
    }

    /**
     * Sets the value of the dedicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicationName(String value) {
        this.dedicationName = value;
    }

    /**
     * Gets the value of the fireArmSlideName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFireArmSlideName() {
        return fireArmSlideName;
    }

    /**
     * Sets the value of the fireArmSlideName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFireArmSlideName(String value) {
        this.fireArmSlideName = value;
    }

    /**
     * Gets the value of the kalibrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKalibrName() {
        return kalibrName;
    }

    /**
     * Sets the value of the kalibrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKalibrName(String value) {
        this.kalibrName = value;
    }

    /**
     * Gets the value of the kalibrQty property.
     * 
     */
    public int getKalibrQty() {
        return kalibrQty;
    }

    /**
     * Sets the value of the kalibrQty property.
     * 
     */
    public void setKalibrQty(int value) {
        this.kalibrQty = value;
    }

    /**
     * Gets the value of the markName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkName() {
        return markName;
    }

    /**
     * Sets the value of the markName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkName(String value) {
        this.markName = value;
    }

    /**
     * Gets the value of the otherKalibr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherKalibr() {
        return otherKalibr;
    }

    /**
     * Sets the value of the otherKalibr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherKalibr(String value) {
        this.otherKalibr = value;
    }

}
