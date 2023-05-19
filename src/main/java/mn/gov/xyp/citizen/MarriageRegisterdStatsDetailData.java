
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marriageRegisterdStatsDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marriageRegisterdStatsDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bachelorFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bachelorMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="baseFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="baseMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="collegeFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="collegeMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="divorceFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="divorceMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="educationLevelFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="educationLevelMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementaryCollegeFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementaryCollegeMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementarySchoolFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementarySchoolMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highSchoolFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highSchoolMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masterFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masterMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noMarriageMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phdFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phdMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unEducationFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unEducationMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="widow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="widower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marriageRegisterdStatsDetailData", propOrder = {
    "aimagCityName",
    "bachelorFemale",
    "bachelorMale",
    "baseFemale",
    "baseMale",
    "collegeFemale",
    "collegeMale",
    "divorceFemale",
    "divorceMale",
    "educationLevelFemale",
    "educationLevelMale",
    "elementaryCollegeFemale",
    "elementaryCollegeMale",
    "elementarySchoolFemale",
    "elementarySchoolMale",
    "highSchoolFemale",
    "highSchoolMale",
    "masterFemale",
    "masterMale",
    "noMarriageFemale",
    "noMarriageMale",
    "phdFemale",
    "phdMale",
    "soumDistrictName",
    "unEducationFemale",
    "unEducationMale",
    "widow",
    "widower"
})
public class MarriageRegisterdStatsDetailData {

    protected String aimagCityName;
    protected int bachelorFemale;
    protected int bachelorMale;
    protected int baseFemale;
    protected int baseMale;
    protected int collegeFemale;
    protected int collegeMale;
    protected int divorceFemale;
    protected int divorceMale;
    protected int educationLevelFemale;
    protected int educationLevelMale;
    protected int elementaryCollegeFemale;
    protected int elementaryCollegeMale;
    protected int elementarySchoolFemale;
    protected int elementarySchoolMale;
    protected int highSchoolFemale;
    protected int highSchoolMale;
    protected int masterFemale;
    protected int masterMale;
    protected int noMarriageFemale;
    protected int noMarriageMale;
    protected int phdFemale;
    protected int phdMale;
    protected String soumDistrictName;
    protected int unEducationFemale;
    protected int unEducationMale;
    protected int widow;
    protected int widower;

    /**
     * Gets the value of the aimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityName() {
        return aimagCityName;
    }

    /**
     * Sets the value of the aimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityName(String value) {
        this.aimagCityName = value;
    }

    /**
     * Gets the value of the bachelorFemale property.
     * 
     */
    public int getBachelorFemale() {
        return bachelorFemale;
    }

    /**
     * Sets the value of the bachelorFemale property.
     * 
     */
    public void setBachelorFemale(int value) {
        this.bachelorFemale = value;
    }

    /**
     * Gets the value of the bachelorMale property.
     * 
     */
    public int getBachelorMale() {
        return bachelorMale;
    }

    /**
     * Sets the value of the bachelorMale property.
     * 
     */
    public void setBachelorMale(int value) {
        this.bachelorMale = value;
    }

    /**
     * Gets the value of the baseFemale property.
     * 
     */
    public int getBaseFemale() {
        return baseFemale;
    }

    /**
     * Sets the value of the baseFemale property.
     * 
     */
    public void setBaseFemale(int value) {
        this.baseFemale = value;
    }

    /**
     * Gets the value of the baseMale property.
     * 
     */
    public int getBaseMale() {
        return baseMale;
    }

    /**
     * Sets the value of the baseMale property.
     * 
     */
    public void setBaseMale(int value) {
        this.baseMale = value;
    }

    /**
     * Gets the value of the collegeFemale property.
     * 
     */
    public int getCollegeFemale() {
        return collegeFemale;
    }

    /**
     * Sets the value of the collegeFemale property.
     * 
     */
    public void setCollegeFemale(int value) {
        this.collegeFemale = value;
    }

    /**
     * Gets the value of the collegeMale property.
     * 
     */
    public int getCollegeMale() {
        return collegeMale;
    }

    /**
     * Sets the value of the collegeMale property.
     * 
     */
    public void setCollegeMale(int value) {
        this.collegeMale = value;
    }

    /**
     * Gets the value of the divorceFemale property.
     * 
     */
    public int getDivorceFemale() {
        return divorceFemale;
    }

    /**
     * Sets the value of the divorceFemale property.
     * 
     */
    public void setDivorceFemale(int value) {
        this.divorceFemale = value;
    }

    /**
     * Gets the value of the divorceMale property.
     * 
     */
    public int getDivorceMale() {
        return divorceMale;
    }

    /**
     * Sets the value of the divorceMale property.
     * 
     */
    public void setDivorceMale(int value) {
        this.divorceMale = value;
    }

    /**
     * Gets the value of the educationLevelFemale property.
     * 
     */
    public int getEducationLevelFemale() {
        return educationLevelFemale;
    }

    /**
     * Sets the value of the educationLevelFemale property.
     * 
     */
    public void setEducationLevelFemale(int value) {
        this.educationLevelFemale = value;
    }

    /**
     * Gets the value of the educationLevelMale property.
     * 
     */
    public int getEducationLevelMale() {
        return educationLevelMale;
    }

    /**
     * Sets the value of the educationLevelMale property.
     * 
     */
    public void setEducationLevelMale(int value) {
        this.educationLevelMale = value;
    }

    /**
     * Gets the value of the elementaryCollegeFemale property.
     * 
     */
    public int getElementaryCollegeFemale() {
        return elementaryCollegeFemale;
    }

    /**
     * Sets the value of the elementaryCollegeFemale property.
     * 
     */
    public void setElementaryCollegeFemale(int value) {
        this.elementaryCollegeFemale = value;
    }

    /**
     * Gets the value of the elementaryCollegeMale property.
     * 
     */
    public int getElementaryCollegeMale() {
        return elementaryCollegeMale;
    }

    /**
     * Sets the value of the elementaryCollegeMale property.
     * 
     */
    public void setElementaryCollegeMale(int value) {
        this.elementaryCollegeMale = value;
    }

    /**
     * Gets the value of the elementarySchoolFemale property.
     * 
     */
    public int getElementarySchoolFemale() {
        return elementarySchoolFemale;
    }

    /**
     * Sets the value of the elementarySchoolFemale property.
     * 
     */
    public void setElementarySchoolFemale(int value) {
        this.elementarySchoolFemale = value;
    }

    /**
     * Gets the value of the elementarySchoolMale property.
     * 
     */
    public int getElementarySchoolMale() {
        return elementarySchoolMale;
    }

    /**
     * Sets the value of the elementarySchoolMale property.
     * 
     */
    public void setElementarySchoolMale(int value) {
        this.elementarySchoolMale = value;
    }

    /**
     * Gets the value of the highSchoolFemale property.
     * 
     */
    public int getHighSchoolFemale() {
        return highSchoolFemale;
    }

    /**
     * Sets the value of the highSchoolFemale property.
     * 
     */
    public void setHighSchoolFemale(int value) {
        this.highSchoolFemale = value;
    }

    /**
     * Gets the value of the highSchoolMale property.
     * 
     */
    public int getHighSchoolMale() {
        return highSchoolMale;
    }

    /**
     * Sets the value of the highSchoolMale property.
     * 
     */
    public void setHighSchoolMale(int value) {
        this.highSchoolMale = value;
    }

    /**
     * Gets the value of the masterFemale property.
     * 
     */
    public int getMasterFemale() {
        return masterFemale;
    }

    /**
     * Sets the value of the masterFemale property.
     * 
     */
    public void setMasterFemale(int value) {
        this.masterFemale = value;
    }

    /**
     * Gets the value of the masterMale property.
     * 
     */
    public int getMasterMale() {
        return masterMale;
    }

    /**
     * Sets the value of the masterMale property.
     * 
     */
    public void setMasterMale(int value) {
        this.masterMale = value;
    }

    /**
     * Gets the value of the noMarriageFemale property.
     * 
     */
    public int getNoMarriageFemale() {
        return noMarriageFemale;
    }

    /**
     * Sets the value of the noMarriageFemale property.
     * 
     */
    public void setNoMarriageFemale(int value) {
        this.noMarriageFemale = value;
    }

    /**
     * Gets the value of the noMarriageMale property.
     * 
     */
    public int getNoMarriageMale() {
        return noMarriageMale;
    }

    /**
     * Sets the value of the noMarriageMale property.
     * 
     */
    public void setNoMarriageMale(int value) {
        this.noMarriageMale = value;
    }

    /**
     * Gets the value of the phdFemale property.
     * 
     */
    public int getPhdFemale() {
        return phdFemale;
    }

    /**
     * Sets the value of the phdFemale property.
     * 
     */
    public void setPhdFemale(int value) {
        this.phdFemale = value;
    }

    /**
     * Gets the value of the phdMale property.
     * 
     */
    public int getPhdMale() {
        return phdMale;
    }

    /**
     * Sets the value of the phdMale property.
     * 
     */
    public void setPhdMale(int value) {
        this.phdMale = value;
    }

    /**
     * Gets the value of the soumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictName() {
        return soumDistrictName;
    }

    /**
     * Sets the value of the soumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictName(String value) {
        this.soumDistrictName = value;
    }

    /**
     * Gets the value of the unEducationFemale property.
     * 
     */
    public int getUnEducationFemale() {
        return unEducationFemale;
    }

    /**
     * Sets the value of the unEducationFemale property.
     * 
     */
    public void setUnEducationFemale(int value) {
        this.unEducationFemale = value;
    }

    /**
     * Gets the value of the unEducationMale property.
     * 
     */
    public int getUnEducationMale() {
        return unEducationMale;
    }

    /**
     * Sets the value of the unEducationMale property.
     * 
     */
    public void setUnEducationMale(int value) {
        this.unEducationMale = value;
    }

    /**
     * Gets the value of the widow property.
     * 
     */
    public int getWidow() {
        return widow;
    }

    /**
     * Sets the value of the widow property.
     * 
     */
    public void setWidow(int value) {
        this.widow = value;
    }

    /**
     * Gets the value of the widower property.
     * 
     */
    public int getWidower() {
        return widower;
    }

    /**
     * Sets the value of the widower property.
     * 
     */
    public void setWidower(int value) {
        this.widower = value;
    }

}
