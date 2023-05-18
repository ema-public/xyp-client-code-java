
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassportIssuedDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassportIssuedDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issuedPlaceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="issuedPlaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassportIssuedDetailData", propOrder = {
    "issuedPlaceCode",
    "issuedPlaceName"
})
public class GetPassportIssuedDetailData {

    protected String issuedPlaceCode;
    protected String issuedPlaceName;

    /**
     * Gets the value of the issuedPlaceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedPlaceCode() {
        return issuedPlaceCode;
    }

    /**
     * Sets the value of the issuedPlaceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedPlaceCode(String value) {
        this.issuedPlaceCode = value;
    }

    /**
     * Gets the value of the issuedPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedPlaceName() {
        return issuedPlaceName;
    }

    /**
     * Sets the value of the issuedPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedPlaceName(String value) {
        this.issuedPlaceName = value;
    }

}
