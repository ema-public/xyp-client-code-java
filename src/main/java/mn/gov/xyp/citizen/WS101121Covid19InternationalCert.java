
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101121_covid19InternationalCert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101121_covid19InternationalCert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}covid19InternationalCertRequestData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101121_covid19InternationalCert", propOrder = {
    "request"
})
public class WS101121Covid19InternationalCert {

    protected Covid19InternationalCertRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Covid19InternationalCertRequestData }
     *     
     */
    public Covid19InternationalCertRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Covid19InternationalCertRequestData }
     *     
     */
    public void setRequest(Covid19InternationalCertRequestData value) {
        this.request = value;
    }

}
