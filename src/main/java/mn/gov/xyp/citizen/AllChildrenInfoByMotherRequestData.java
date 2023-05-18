
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allChildrenInfoByMotherRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allChildrenInfoByMotherRequestData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}registrationBasicRequest">
 *       &lt;sequence>
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allChildrenInfoByMotherRequestData", propOrder = {
    "motherRegnum"
})
public class AllChildrenInfoByMotherRequestData
    extends RegistrationBasicRequest
{

    protected String motherRegnum;

    /**
     * Gets the value of the motherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegnum() {
        return motherRegnum;
    }

    /**
     * Sets the value of the motherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegnum(String value) {
        this.motherRegnum = value;
    }

}
