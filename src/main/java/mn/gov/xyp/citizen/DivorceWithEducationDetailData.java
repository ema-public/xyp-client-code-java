
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divorceWithEducationDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divorceWithEducationDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age20To24Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bachelorFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bachelorMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="baseFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="baseMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="collegeFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="collegeMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="educationLevelFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="educationLevelMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementaryCollegeFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementaryCollegeMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementaryFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="elementaryMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="familyYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="forYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="highMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masterFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="masterMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phdFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="phdMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soumDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year10To14" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year15To19" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year1To3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year20plus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year4To6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year7To9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "divorceWithEducationDetailData", propOrder = {
    "age20To24Female",
    "aimagCityName",
    "bachelorFemale",
    "bachelorMale",
    "baseFemale",
    "baseMale",
    "collegeFemale",
    "collegeMale",
    "educationLevelFemale",
    "educationLevelMale",
    "elementaryCollegeFemale",
    "elementaryCollegeMale",
    "elementaryFemale",
    "elementaryMale",
    "familyYear",
    "forYear",
    "highFemale",
    "highMale",
    "masterFemale",
    "masterMale",
    "phdFemale",
    "phdMale",
    "soumDistrict",
    "year10To14",
    "year15To19",
    "year1To3",
    "year20Plus",
    "year4To6",
    "year7To9"
})
public class DivorceWithEducationDetailData {

    protected int age20To24Female;
    protected String aimagCityName;
    protected int bachelorFemale;
    protected int bachelorMale;
    protected int baseFemale;
    protected int baseMale;
    protected int collegeFemale;
    protected int collegeMale;
    protected int educationLevelFemale;
    protected int educationLevelMale;
    protected int elementaryCollegeFemale;
    protected int elementaryCollegeMale;
    protected int elementaryFemale;
    protected int elementaryMale;
    protected int familyYear;
    protected int forYear;
    protected int highFemale;
    protected int highMale;
    protected int masterFemale;
    protected int masterMale;
    protected int phdFemale;
    protected int phdMale;
    protected String soumDistrict;
    protected int year10To14;
    protected int year15To19;
    protected int year1To3;
    @XmlElement(name = "year20plus")
    protected int year20Plus;
    protected int year4To6;
    protected int year7To9;

    /**
     * Gets the value of the age20To24Female property.
     * 
     */
    public int getAge20To24Female() {
        return age20To24Female;
    }

    /**
     * Sets the value of the age20To24Female property.
     * 
     */
    public void setAge20To24Female(int value) {
        this.age20To24Female = value;
    }

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
     * Gets the value of the elementaryFemale property.
     * 
     */
    public int getElementaryFemale() {
        return elementaryFemale;
    }

    /**
     * Sets the value of the elementaryFemale property.
     * 
     */
    public void setElementaryFemale(int value) {
        this.elementaryFemale = value;
    }

    /**
     * Gets the value of the elementaryMale property.
     * 
     */
    public int getElementaryMale() {
        return elementaryMale;
    }

    /**
     * Sets the value of the elementaryMale property.
     * 
     */
    public void setElementaryMale(int value) {
        this.elementaryMale = value;
    }

    /**
     * Gets the value of the familyYear property.
     * 
     */
    public int getFamilyYear() {
        return familyYear;
    }

    /**
     * Sets the value of the familyYear property.
     * 
     */
    public void setFamilyYear(int value) {
        this.familyYear = value;
    }

    /**
     * Gets the value of the forYear property.
     * 
     */
    public int getForYear() {
        return forYear;
    }

    /**
     * Sets the value of the forYear property.
     * 
     */
    public void setForYear(int value) {
        this.forYear = value;
    }

    /**
     * Gets the value of the highFemale property.
     * 
     */
    public int getHighFemale() {
        return highFemale;
    }

    /**
     * Sets the value of the highFemale property.
     * 
     */
    public void setHighFemale(int value) {
        this.highFemale = value;
    }

    /**
     * Gets the value of the highMale property.
     * 
     */
    public int getHighMale() {
        return highMale;
    }

    /**
     * Sets the value of the highMale property.
     * 
     */
    public void setHighMale(int value) {
        this.highMale = value;
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
     * Gets the value of the soumDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrict() {
        return soumDistrict;
    }

    /**
     * Sets the value of the soumDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrict(String value) {
        this.soumDistrict = value;
    }

    /**
     * Gets the value of the year10To14 property.
     * 
     */
    public int getYear10To14() {
        return year10To14;
    }

    /**
     * Sets the value of the year10To14 property.
     * 
     */
    public void setYear10To14(int value) {
        this.year10To14 = value;
    }

    /**
     * Gets the value of the year15To19 property.
     * 
     */
    public int getYear15To19() {
        return year15To19;
    }

    /**
     * Sets the value of the year15To19 property.
     * 
     */
    public void setYear15To19(int value) {
        this.year15To19 = value;
    }

    /**
     * Gets the value of the year1To3 property.
     * 
     */
    public int getYear1To3() {
        return year1To3;
    }

    /**
     * Sets the value of the year1To3 property.
     * 
     */
    public void setYear1To3(int value) {
        this.year1To3 = value;
    }

    /**
     * Gets the value of the year20Plus property.
     * 
     */
    public int getYear20Plus() {
        return year20Plus;
    }

    /**
     * Sets the value of the year20Plus property.
     * 
     */
    public void setYear20Plus(int value) {
        this.year20Plus = value;
    }

    /**
     * Gets the value of the year4To6 property.
     * 
     */
    public int getYear4To6() {
        return year4To6;
    }

    /**
     * Sets the value of the year4To6 property.
     * 
     */
    public void setYear4To6(int value) {
        this.year4To6 = value;
    }

    /**
     * Gets the value of the year7To9 property.
     * 
     */
    public int getYear7To9() {
        return year7To9;
    }

    /**
     * Sets the value of the year7To9 property.
     * 
     */
    public void setYear7To9(int value) {
        this.year7To9 = value;
    }

}
