
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatisticAdoptedChildrenAgeDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatisticAdoptedChildrenAgeDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age0to3All" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age0to3Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age0to3Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age10PlusFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age10PlusMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age10toPlusAll" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age4to6All" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age4to6Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age4to6Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age7to9All" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age7to9Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age7to9Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ageFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ageMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStatisticAdoptedChildrenAgeDetailData", propOrder = {
    "age0To3All",
    "age0To3Female",
    "age0To3Male",
    "age10PlusFemale",
    "age10PlusMale",
    "age10ToPlusAll",
    "age4To6All",
    "age4To6Female",
    "age4To6Male",
    "age7To9All",
    "age7To9Female",
    "age7To9Male",
    "ageFemale",
    "ageMale",
    "aimagCityName",
    "all",
    "soumDistrictName"
})
public class CitizenStatisticAdoptedChildrenAgeDetailData {

    @XmlElement(name = "age0to3All")
    protected int age0To3All;
    @XmlElement(name = "age0to3Female")
    protected int age0To3Female;
    @XmlElement(name = "age0to3Male")
    protected int age0To3Male;
    protected int age10PlusFemale;
    protected int age10PlusMale;
    @XmlElement(name = "age10toPlusAll")
    protected int age10ToPlusAll;
    @XmlElement(name = "age4to6All")
    protected int age4To6All;
    @XmlElement(name = "age4to6Female")
    protected int age4To6Female;
    @XmlElement(name = "age4to6Male")
    protected int age4To6Male;
    @XmlElement(name = "age7to9All")
    protected int age7To9All;
    @XmlElement(name = "age7to9Female")
    protected int age7To9Female;
    @XmlElement(name = "age7to9Male")
    protected int age7To9Male;
    protected int ageFemale;
    protected int ageMale;
    protected String aimagCityName;
    protected int all;
    protected String soumDistrictName;

    /**
     * Gets the value of the age0To3All property.
     * 
     */
    public int getAge0To3All() {
        return age0To3All;
    }

    /**
     * Sets the value of the age0To3All property.
     * 
     */
    public void setAge0To3All(int value) {
        this.age0To3All = value;
    }

    /**
     * Gets the value of the age0To3Female property.
     * 
     */
    public int getAge0To3Female() {
        return age0To3Female;
    }

    /**
     * Sets the value of the age0To3Female property.
     * 
     */
    public void setAge0To3Female(int value) {
        this.age0To3Female = value;
    }

    /**
     * Gets the value of the age0To3Male property.
     * 
     */
    public int getAge0To3Male() {
        return age0To3Male;
    }

    /**
     * Sets the value of the age0To3Male property.
     * 
     */
    public void setAge0To3Male(int value) {
        this.age0To3Male = value;
    }

    /**
     * Gets the value of the age10PlusFemale property.
     * 
     */
    public int getAge10PlusFemale() {
        return age10PlusFemale;
    }

    /**
     * Sets the value of the age10PlusFemale property.
     * 
     */
    public void setAge10PlusFemale(int value) {
        this.age10PlusFemale = value;
    }

    /**
     * Gets the value of the age10PlusMale property.
     * 
     */
    public int getAge10PlusMale() {
        return age10PlusMale;
    }

    /**
     * Sets the value of the age10PlusMale property.
     * 
     */
    public void setAge10PlusMale(int value) {
        this.age10PlusMale = value;
    }

    /**
     * Gets the value of the age10ToPlusAll property.
     * 
     */
    public int getAge10ToPlusAll() {
        return age10ToPlusAll;
    }

    /**
     * Sets the value of the age10ToPlusAll property.
     * 
     */
    public void setAge10ToPlusAll(int value) {
        this.age10ToPlusAll = value;
    }

    /**
     * Gets the value of the age4To6All property.
     * 
     */
    public int getAge4To6All() {
        return age4To6All;
    }

    /**
     * Sets the value of the age4To6All property.
     * 
     */
    public void setAge4To6All(int value) {
        this.age4To6All = value;
    }

    /**
     * Gets the value of the age4To6Female property.
     * 
     */
    public int getAge4To6Female() {
        return age4To6Female;
    }

    /**
     * Sets the value of the age4To6Female property.
     * 
     */
    public void setAge4To6Female(int value) {
        this.age4To6Female = value;
    }

    /**
     * Gets the value of the age4To6Male property.
     * 
     */
    public int getAge4To6Male() {
        return age4To6Male;
    }

    /**
     * Sets the value of the age4To6Male property.
     * 
     */
    public void setAge4To6Male(int value) {
        this.age4To6Male = value;
    }

    /**
     * Gets the value of the age7To9All property.
     * 
     */
    public int getAge7To9All() {
        return age7To9All;
    }

    /**
     * Sets the value of the age7To9All property.
     * 
     */
    public void setAge7To9All(int value) {
        this.age7To9All = value;
    }

    /**
     * Gets the value of the age7To9Female property.
     * 
     */
    public int getAge7To9Female() {
        return age7To9Female;
    }

    /**
     * Sets the value of the age7To9Female property.
     * 
     */
    public void setAge7To9Female(int value) {
        this.age7To9Female = value;
    }

    /**
     * Gets the value of the age7To9Male property.
     * 
     */
    public int getAge7To9Male() {
        return age7To9Male;
    }

    /**
     * Sets the value of the age7To9Male property.
     * 
     */
    public void setAge7To9Male(int value) {
        this.age7To9Male = value;
    }

    /**
     * Gets the value of the ageFemale property.
     * 
     */
    public int getAgeFemale() {
        return ageFemale;
    }

    /**
     * Sets the value of the ageFemale property.
     * 
     */
    public void setAgeFemale(int value) {
        this.ageFemale = value;
    }

    /**
     * Gets the value of the ageMale property.
     * 
     */
    public int getAgeMale() {
        return ageMale;
    }

    /**
     * Sets the value of the ageMale property.
     * 
     */
    public void setAgeMale(int value) {
        this.ageMale = value;
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
     * Gets the value of the all property.
     * 
     */
    public int getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     */
    public void setAll(int value) {
        this.all = value;
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

}
