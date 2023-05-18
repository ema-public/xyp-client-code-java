
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100145_insertArchivesDetailPopulationCensus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100145_insertArchivesDetailPopulationCensus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}insertCitizenArchivesPopulationCensus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100145_insertArchivesDetailPopulationCensus", propOrder = {
    "request"
})
public class WS100145InsertArchivesDetailPopulationCensus {

    protected InsertCitizenArchivesPopulationCensus request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCitizenArchivesPopulationCensus }
     *     
     */
    public InsertCitizenArchivesPopulationCensus getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCitizenArchivesPopulationCensus }
     *     
     */
    public void setRequest(InsertCitizenArchivesPopulationCensus value) {
        this.request = value;
    }

}
