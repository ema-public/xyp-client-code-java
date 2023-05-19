
package mn.gov.xyp.meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authorizationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authorizationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="citizen" type="{http://meta.xyp.gov.mn/}authorizationEntity" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://meta.xyp.gov.mn/}authorizationEntity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authorizationData", propOrder = {
    "citizen",
    "operator"
})
public class AuthorizationData {

    protected AuthorizationEntity citizen;
    protected AuthorizationEntity operator;

    /**
     * Gets the value of the citizen property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationEntity }
     *     
     */
    public AuthorizationEntity getCitizen() {
        return citizen;
    }

    /**
     * Sets the value of the citizen property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationEntity }
     *     
     */
    public void setCitizen(AuthorizationEntity value) {
        this.citizen = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationEntity }
     *     
     */
    public AuthorizationEntity getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationEntity }
     *     
     */
    public void setOperator(AuthorizationEntity value) {
        this.operator = value;
    }

}
