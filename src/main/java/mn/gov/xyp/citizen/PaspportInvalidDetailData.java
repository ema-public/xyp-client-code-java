
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paspportInvalidDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paspportInvalidDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forenameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forenameMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givennameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="givennameMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportInvCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnumENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regnumMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameENG" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surnameMN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paspportInvalidDetailData", propOrder = {
    "birthDate",
    "forenameENG",
    "forenameMN",
    "givennameENG",
    "givennameMN",
    "passportInvCauseName",
    "passportNum",
    "passportTypeCode",
    "regDate",
    "regnumENG",
    "regnumMN",
    "surnameENG",
    "surnameMN"
})
public class PaspportInvalidDetailData {

    protected String birthDate;
    protected String forenameENG;
    protected String forenameMN;
    protected String givennameENG;
    protected String givennameMN;
    protected String passportInvCauseName;
    protected String passportNum;
    protected String passportTypeCode;
    protected String regDate;
    protected String regnumENG;
    protected String regnumMN;
    protected String surnameENG;
    protected String surnameMN;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the forenameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForenameENG() {
        return forenameENG;
    }

    /**
     * Sets the value of the forenameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForenameENG(String value) {
        this.forenameENG = value;
    }

    /**
     * Gets the value of the forenameMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForenameMN() {
        return forenameMN;
    }

    /**
     * Sets the value of the forenameMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForenameMN(String value) {
        this.forenameMN = value;
    }

    /**
     * Gets the value of the givennameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivennameENG() {
        return givennameENG;
    }

    /**
     * Sets the value of the givennameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivennameENG(String value) {
        this.givennameENG = value;
    }

    /**
     * Gets the value of the givennameMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivennameMN() {
        return givennameMN;
    }

    /**
     * Sets the value of the givennameMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivennameMN(String value) {
        this.givennameMN = value;
    }

    /**
     * Gets the value of the passportInvCauseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportInvCauseName() {
        return passportInvCauseName;
    }

    /**
     * Sets the value of the passportInvCauseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportInvCauseName(String value) {
        this.passportInvCauseName = value;
    }

    /**
     * Gets the value of the passportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNum() {
        return passportNum;
    }

    /**
     * Sets the value of the passportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNum(String value) {
        this.passportNum = value;
    }

    /**
     * Gets the value of the passportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportTypeCode() {
        return passportTypeCode;
    }

    /**
     * Sets the value of the passportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportTypeCode(String value) {
        this.passportTypeCode = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the regnumENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumENG() {
        return regnumENG;
    }

    /**
     * Sets the value of the regnumENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumENG(String value) {
        this.regnumENG = value;
    }

    /**
     * Gets the value of the regnumMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumMN() {
        return regnumMN;
    }

    /**
     * Sets the value of the regnumMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumMN(String value) {
        this.regnumMN = value;
    }

    /**
     * Gets the value of the surnameENG property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameENG() {
        return surnameENG;
    }

    /**
     * Sets the value of the surnameENG property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameENG(String value) {
        this.surnameENG = value;
    }

    /**
     * Gets the value of the surnameMN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnameMN() {
        return surnameMN;
    }

    /**
     * Sets the value of the surnameMN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnameMN(String value) {
        this.surnameMN = value;
    }

}
