
package mn.gov.xyp.meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for logInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="logInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authCitizen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="authOperator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="citizenRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clientOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="requestData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serviceDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="wsEndpoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logInfoData", propOrder = {
    "authCitizen",
    "authOperator",
    "citizenRegnum",
    "clientOrg",
    "operationName",
    "operatorRegnum",
    "requestData",
    "responseData",
    "resultCode",
    "serviceDate",
    "wsEndpoint"
})
public class LogInfoData {

    protected boolean authCitizen;
    protected boolean authOperator;
    protected String citizenRegnum;
    protected String clientOrg;
    protected String operationName;
    protected String operatorRegnum;
    protected String requestData;
    protected String responseData;
    protected int resultCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceDate;
    protected String wsEndpoint;

    /**
     * Gets the value of the authCitizen property.
     * 
     */
    public boolean isAuthCitizen() {
        return authCitizen;
    }

    /**
     * Sets the value of the authCitizen property.
     * 
     */
    public void setAuthCitizen(boolean value) {
        this.authCitizen = value;
    }

    /**
     * Gets the value of the authOperator property.
     * 
     */
    public boolean isAuthOperator() {
        return authOperator;
    }

    /**
     * Sets the value of the authOperator property.
     * 
     */
    public void setAuthOperator(boolean value) {
        this.authOperator = value;
    }

    /**
     * Gets the value of the citizenRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenRegnum() {
        return citizenRegnum;
    }

    /**
     * Sets the value of the citizenRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenRegnum(String value) {
        this.citizenRegnum = value;
    }

    /**
     * Gets the value of the clientOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientOrg() {
        return clientOrg;
    }

    /**
     * Sets the value of the clientOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientOrg(String value) {
        this.clientOrg = value;
    }

    /**
     * Gets the value of the operationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the value of the operationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationName(String value) {
        this.operationName = value;
    }

    /**
     * Gets the value of the operatorRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorRegnum() {
        return operatorRegnum;
    }

    /**
     * Sets the value of the operatorRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorRegnum(String value) {
        this.operatorRegnum = value;
    }

    /**
     * Gets the value of the requestData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestData() {
        return requestData;
    }

    /**
     * Sets the value of the requestData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestData(String value) {
        this.requestData = value;
    }

    /**
     * Gets the value of the responseData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseData() {
        return responseData;
    }

    /**
     * Sets the value of the responseData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseData(String value) {
        this.responseData = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceDate(XMLGregorianCalendar value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the wsEndpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsEndpoint() {
        return wsEndpoint;
    }

    /**
     * Sets the value of the wsEndpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsEndpoint(String value) {
        this.wsEndpoint = value;
    }

}
