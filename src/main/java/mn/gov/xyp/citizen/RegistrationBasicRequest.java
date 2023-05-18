
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationBasicRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationBasicRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}serviceRequest">
 *       &lt;sequence>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationBasicRequest", propOrder = {
    "orgCode",
    "orgName",
    "orgPassword",
    "orgToken",
    "serviceCode"
})
@XmlSeeAlso({
    RegisteredChildrenRequestData.class,
    CitizenDetailRequestData.class,
    DeceaseListRequestData.class,
    CheckTwinInfoRequestsData.class,
    AllChildrenInfoByMotherRequestData.class
})
public class RegistrationBasicRequest
    extends ServiceRequest
{

    protected String orgCode;
    protected String orgName;
    protected String orgPassword;
    protected String orgToken;
    protected String serviceCode;

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgPassword() {
        return orgPassword;
    }

    /**
     * Sets the value of the orgPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgPassword(String value) {
        this.orgPassword = value;
    }

    /**
     * Gets the value of the orgToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgToken() {
        return orgToken;
    }

    /**
     * Sets the value of the orgToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgToken(String value) {
        this.orgToken = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

}
