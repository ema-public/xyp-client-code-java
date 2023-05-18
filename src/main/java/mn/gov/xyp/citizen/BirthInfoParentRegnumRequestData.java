
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for birthInfoParentRegnumRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="birthInfoParentRegnumRequestData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="parentRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "birthInfoParentRegnumRequestData", propOrder = {
    "parentRegnum",
    "regnum"
})
public class BirthInfoParentRegnumRequestData
    extends ServiceRequest
{

    protected String parentRegnum;
    protected String regnum;

    /**
     * Gets the value of the parentRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRegnum() {
        return parentRegnum;
    }

    /**
     * Sets the value of the parentRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRegnum(String value) {
        this.parentRegnum = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

}
