
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPassportIssuedRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPassportIssuedRequestData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="placeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPassportIssuedRequestData", propOrder = {
    "placeType"
})
public class GetPassportIssuedRequestData
    extends ServiceRequest
{

    protected int placeType;

    /**
     * Gets the value of the placeType property.
     * 
     */
    public int getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     * 
     */
    public void setPlaceType(int value) {
        this.placeType = value;
    }

}
