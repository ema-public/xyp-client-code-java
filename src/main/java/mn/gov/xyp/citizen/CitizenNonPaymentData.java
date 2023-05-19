
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for citizenNonPaymentData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenNonPaymentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseStatusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="decisionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisionTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sheetNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tollValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenNonPaymentData", propOrder = {
    "caseNum",
    "caseStatusId",
    "caseStatusName",
    "companyRegnum",
    "decisionDate",
    "decisionNum",
    "decisionTypeName",
    "personRegnum",
    "receivedDate",
    "sheetNum",
    "tollBalance",
    "tollValue"
})
public class CitizenNonPaymentData {

    protected String caseNum;
    protected String caseStatusId;
    protected String caseStatusName;
    protected String companyRegnum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar decisionDate;
    protected String decisionNum;
    protected String decisionTypeName;
    protected String personRegnum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receivedDate;
    protected String sheetNum;
    protected String tollBalance;
    protected String tollValue;

    /**
     * Gets the value of the caseNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNum() {
        return caseNum;
    }

    /**
     * Sets the value of the caseNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNum(String value) {
        this.caseNum = value;
    }

    /**
     * Gets the value of the caseStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatusId() {
        return caseStatusId;
    }

    /**
     * Sets the value of the caseStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatusId(String value) {
        this.caseStatusId = value;
    }

    /**
     * Gets the value of the caseStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseStatusName() {
        return caseStatusName;
    }

    /**
     * Sets the value of the caseStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseStatusName(String value) {
        this.caseStatusName = value;
    }

    /**
     * Gets the value of the companyRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegnum() {
        return companyRegnum;
    }

    /**
     * Sets the value of the companyRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegnum(String value) {
        this.companyRegnum = value;
    }

    /**
     * Gets the value of the decisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDecisionDate() {
        return decisionDate;
    }

    /**
     * Sets the value of the decisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDecisionDate(XMLGregorianCalendar value) {
        this.decisionDate = value;
    }

    /**
     * Gets the value of the decisionNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionNum() {
        return decisionNum;
    }

    /**
     * Sets the value of the decisionNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionNum(String value) {
        this.decisionNum = value;
    }

    /**
     * Gets the value of the decisionTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionTypeName() {
        return decisionTypeName;
    }

    /**
     * Sets the value of the decisionTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionTypeName(String value) {
        this.decisionTypeName = value;
    }

    /**
     * Gets the value of the personRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRegnum() {
        return personRegnum;
    }

    /**
     * Sets the value of the personRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRegnum(String value) {
        this.personRegnum = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceivedDate(XMLGregorianCalendar value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the sheetNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSheetNum() {
        return sheetNum;
    }

    /**
     * Sets the value of the sheetNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSheetNum(String value) {
        this.sheetNum = value;
    }

    /**
     * Gets the value of the tollBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollBalance() {
        return tollBalance;
    }

    /**
     * Sets the value of the tollBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollBalance(String value) {
        this.tollBalance = value;
    }

    /**
     * Gets the value of the tollValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTollValue() {
        return tollValue;
    }

    /**
     * Sets the value of the tollValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTollValue(String value) {
        this.tollValue = value;
    }

}
