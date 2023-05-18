
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101134_CitizenDoingCriminalLiabiltyEngInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101134_CitizenDoingCriminalLiabiltyEngInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}citizenCriminalLiabilityEngRequestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101134_CitizenDoingCriminalLiabiltyEngInfo", propOrder = {
    "request"
})
public class WS101134CitizenDoingCriminalLiabiltyEngInfo {

    protected CitizenCriminalLiabilityEngRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenCriminalLiabilityEngRequestData }
     *     
     */
    public CitizenCriminalLiabilityEngRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenCriminalLiabilityEngRequestData }
     *     
     */
    public void setRequest(CitizenCriminalLiabilityEngRequestData value) {
        this.request = value;
    }

}
