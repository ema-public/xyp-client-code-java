
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deceaseStatisticByEduLevelDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deceaseStatisticByEduLevelDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atHospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atTransport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atWork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bachelorDegree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="collage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementaryCollage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementarySchoolLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highSchoolLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriageDivorced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriageSeparated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterDegree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleSchoolLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noMarriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonMarried" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="outdoor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phdDegree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDeceasePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalEducationAll" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uneducated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="widow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deceaseStatisticByEduLevelDetailData", propOrder = {
    "atHome",
    "atHospital",
    "atTransport",
    "atWork",
    "bachelorDegree",
    "collage",
    "district",
    "elementaryCollage",
    "elementarySchoolLevel",
    "highSchoolLevel",
    "marriage",
    "marriageDivorced",
    "marriageSeparated",
    "masterDegree",
    "middleSchoolLevel",
    "noMarriage",
    "nonMarried",
    "other",
    "outdoor",
    "phdDegree",
    "province",
    "totalDeceasePlace",
    "totalEducationAll",
    "totalFamily",
    "uneducated",
    "widow"
})
public class DeceaseStatisticByEduLevelDetailData {

    protected String atHome;
    protected String atHospital;
    protected String atTransport;
    protected String atWork;
    protected String bachelorDegree;
    protected String collage;
    protected String district;
    protected String elementaryCollage;
    protected String elementarySchoolLevel;
    protected String highSchoolLevel;
    protected String marriage;
    protected String marriageDivorced;
    protected String marriageSeparated;
    protected String masterDegree;
    protected String middleSchoolLevel;
    protected String noMarriage;
    protected String nonMarried;
    protected String other;
    protected String outdoor;
    protected String phdDegree;
    protected String province;
    protected String totalDeceasePlace;
    protected String totalEducationAll;
    protected String totalFamily;
    protected String uneducated;
    protected String widow;

    /**
     * Gets the value of the atHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtHome() {
        return atHome;
    }

    /**
     * Sets the value of the atHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtHome(String value) {
        this.atHome = value;
    }

    /**
     * Gets the value of the atHospital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtHospital() {
        return atHospital;
    }

    /**
     * Sets the value of the atHospital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtHospital(String value) {
        this.atHospital = value;
    }

    /**
     * Gets the value of the atTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtTransport() {
        return atTransport;
    }

    /**
     * Sets the value of the atTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtTransport(String value) {
        this.atTransport = value;
    }

    /**
     * Gets the value of the atWork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtWork() {
        return atWork;
    }

    /**
     * Sets the value of the atWork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtWork(String value) {
        this.atWork = value;
    }

    /**
     * Gets the value of the bachelorDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBachelorDegree() {
        return bachelorDegree;
    }

    /**
     * Sets the value of the bachelorDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBachelorDegree(String value) {
        this.bachelorDegree = value;
    }

    /**
     * Gets the value of the collage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollage() {
        return collage;
    }

    /**
     * Sets the value of the collage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollage(String value) {
        this.collage = value;
    }

    /**
     * Gets the value of the district property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Sets the value of the district property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * Gets the value of the elementaryCollage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementaryCollage() {
        return elementaryCollage;
    }

    /**
     * Sets the value of the elementaryCollage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementaryCollage(String value) {
        this.elementaryCollage = value;
    }

    /**
     * Gets the value of the elementarySchoolLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementarySchoolLevel() {
        return elementarySchoolLevel;
    }

    /**
     * Sets the value of the elementarySchoolLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementarySchoolLevel(String value) {
        this.elementarySchoolLevel = value;
    }

    /**
     * Gets the value of the highSchoolLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighSchoolLevel() {
        return highSchoolLevel;
    }

    /**
     * Sets the value of the highSchoolLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighSchoolLevel(String value) {
        this.highSchoolLevel = value;
    }

    /**
     * Gets the value of the marriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * Sets the value of the marriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage(String value) {
        this.marriage = value;
    }

    /**
     * Gets the value of the marriageDivorced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageDivorced() {
        return marriageDivorced;
    }

    /**
     * Sets the value of the marriageDivorced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageDivorced(String value) {
        this.marriageDivorced = value;
    }

    /**
     * Gets the value of the marriageSeparated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageSeparated() {
        return marriageSeparated;
    }

    /**
     * Sets the value of the marriageSeparated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageSeparated(String value) {
        this.marriageSeparated = value;
    }

    /**
     * Gets the value of the masterDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterDegree() {
        return masterDegree;
    }

    /**
     * Sets the value of the masterDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterDegree(String value) {
        this.masterDegree = value;
    }

    /**
     * Gets the value of the middleSchoolLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleSchoolLevel() {
        return middleSchoolLevel;
    }

    /**
     * Sets the value of the middleSchoolLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleSchoolLevel(String value) {
        this.middleSchoolLevel = value;
    }

    /**
     * Gets the value of the noMarriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMarriage() {
        return noMarriage;
    }

    /**
     * Sets the value of the noMarriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMarriage(String value) {
        this.noMarriage = value;
    }

    /**
     * Gets the value of the nonMarried property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonMarried() {
        return nonMarried;
    }

    /**
     * Sets the value of the nonMarried property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonMarried(String value) {
        this.nonMarried = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the outdoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutdoor() {
        return outdoor;
    }

    /**
     * Sets the value of the outdoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutdoor(String value) {
        this.outdoor = value;
    }

    /**
     * Gets the value of the phdDegree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhdDegree() {
        return phdDegree;
    }

    /**
     * Sets the value of the phdDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhdDegree(String value) {
        this.phdDegree = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the totalDeceasePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDeceasePlace() {
        return totalDeceasePlace;
    }

    /**
     * Sets the value of the totalDeceasePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDeceasePlace(String value) {
        this.totalDeceasePlace = value;
    }

    /**
     * Gets the value of the totalEducationAll property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalEducationAll() {
        return totalEducationAll;
    }

    /**
     * Sets the value of the totalEducationAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalEducationAll(String value) {
        this.totalEducationAll = value;
    }

    /**
     * Gets the value of the totalFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFamily() {
        return totalFamily;
    }

    /**
     * Sets the value of the totalFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFamily(String value) {
        this.totalFamily = value;
    }

    /**
     * Gets the value of the uneducated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUneducated() {
        return uneducated;
    }

    /**
     * Sets the value of the uneducated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUneducated(String value) {
        this.uneducated = value;
    }

    /**
     * Gets the value of the widow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidow() {
        return widow;
    }

    /**
     * Sets the value of the widow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidow(String value) {
        this.widow = value;
    }

}
