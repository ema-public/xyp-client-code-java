
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100117_checkCitizenAddressInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100117_checkCitizenAddressInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}serviceCheckCitizenAddressInfoRequestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100117_checkCitizenAddressInfo", propOrder = {
    "request"
})
public class WS100117CheckCitizenAddressInfo {

    protected ServiceCheckCitizenAddressInfoRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCheckCitizenAddressInfoRequestData }
     *     
     */
    public ServiceCheckCitizenAddressInfoRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCheckCitizenAddressInfoRequestData }
     *     
     */
    public void setRequest(ServiceCheckCitizenAddressInfoRequestData value) {
        this.request = value;
    }

}
