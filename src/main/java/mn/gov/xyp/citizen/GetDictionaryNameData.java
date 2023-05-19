
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDictionaryNameData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDictionaryNameData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastnameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastnameNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameMGL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameNM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDictionaryNameData", propOrder = {
    "lastnameENG",
    "lastnameMGL",
    "lastnameNM",
    "nameENG",
    "nameMGL",
    "nameNM"
})
public class GetDictionaryNameData {

    protected String lastnameENG;
    protected String lastnameMGL;
    protected String lastnameNM;
    protected String nameENG;
    protected String nameMGL;
    protected String nameNM;

    /**
     * Gets the value of the lastnameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameENG() {
        return lastnameENG;
    }

    /**
     * Sets the value of the lastnameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameENG(String value) {
        this.lastnameENG = value;
    }

    /**
     * Gets the value of the lastnameMGL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameMGL() {
        return lastnameMGL;
    }

    /**
     * Sets the value of the lastnameMGL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameMGL(String value) {
        this.lastnameMGL = value;
    }

    /**
     * Gets the value of the lastnameNM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastnameNM() {
        return lastnameNM;
    }

    /**
     * Sets the value of the lastnameNM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastnameNM(String value) {
        this.lastnameNM = value;
    }

    /**
     * Gets the value of the nameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameENG() {
        return nameENG;
    }

    /**
     * Sets the value of the nameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameENG(String value) {
        this.nameENG = value;
    }

    /**
     * Gets the value of the nameMGL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameMGL() {
        return nameMGL;
    }

    /**
     * Sets the value of the nameMGL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameMGL(String value) {
        this.nameMGL = value;
    }

    /**
     * Gets the value of the nameNM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNM() {
        return nameNM;
    }

    /**
     * Sets the value of the nameNM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameNM(String value) {
        this.nameNM = value;
    }

}
