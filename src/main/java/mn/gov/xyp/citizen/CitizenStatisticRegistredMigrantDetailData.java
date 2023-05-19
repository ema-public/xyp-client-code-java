
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatisticRegistredMigrantDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatisticRegistredMigrantDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age0to4female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age0to4male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age10to14female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age10to14male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age15to19female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age15to19male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age20to24female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age20to24male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age25to29female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age25to29male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age30to34female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age30to34male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age35to39female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age35to39male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age40to44female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age40to44male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age45to49female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age45to49male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age50to54female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age50to54male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age55toOldFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age55toOldMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age5to9female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age5to9male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="otherFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "citizenStatisticRegistredMigrantDetailData", propOrder = {
    "age0To4Female",
    "age0To4Male",
    "age10To14Female",
    "age10To14Male",
    "age15To19Female",
    "age15To19Male",
    "age20To24Female",
    "age20To24Male",
    "age25To29Female",
    "age25To29Male",
    "age30To34Female",
    "age30To34Male",
    "age35To39Female",
    "age35To39Male",
    "age40To44Female",
    "age40To44Male",
    "age45To49Female",
    "age45To49Male",
    "age50To54Female",
    "age50To54Male",
    "age55ToOldFemale",
    "age55ToOldMale",
    "age5To9Female",
    "age5To9Male",
    "aimagCityName",
    "all",
    "female",
    "male",
    "otherFemale",
    "soumDistrictName"
})
public class CitizenStatisticRegistredMigrantDetailData {

    @XmlElement(name = "age0to4female")
    protected int age0To4Female;
    @XmlElement(name = "age0to4male")
    protected int age0To4Male;
    @XmlElement(name = "age10to14female")
    protected int age10To14Female;
    @XmlElement(name = "age10to14male")
    protected int age10To14Male;
    @XmlElement(name = "age15to19female")
    protected int age15To19Female;
    @XmlElement(name = "age15to19male")
    protected int age15To19Male;
    @XmlElement(name = "age20to24female")
    protected int age20To24Female;
    @XmlElement(name = "age20to24male")
    protected int age20To24Male;
    @XmlElement(name = "age25to29female")
    protected int age25To29Female;
    @XmlElement(name = "age25to29male")
    protected int age25To29Male;
    @XmlElement(name = "age30to34female")
    protected int age30To34Female;
    @XmlElement(name = "age30to34male")
    protected int age30To34Male;
    @XmlElement(name = "age35to39female")
    protected int age35To39Female;
    @XmlElement(name = "age35to39male")
    protected int age35To39Male;
    @XmlElement(name = "age40to44female")
    protected int age40To44Female;
    @XmlElement(name = "age40to44male")
    protected int age40To44Male;
    @XmlElement(name = "age45to49female")
    protected int age45To49Female;
    @XmlElement(name = "age45to49male")
    protected int age45To49Male;
    @XmlElement(name = "age50to54female")
    protected int age50To54Female;
    @XmlElement(name = "age50to54male")
    protected int age50To54Male;
    @XmlElement(name = "age55toOldFemale")
    protected int age55ToOldFemale;
    @XmlElement(name = "age55toOldMale")
    protected int age55ToOldMale;
    @XmlElement(name = "age5to9female")
    protected int age5To9Female;
    @XmlElement(name = "age5to9male")
    protected int age5To9Male;
    protected String aimagCityName;
    protected int all;
    protected int female;
    protected int male;
    protected int otherFemale;
    protected String soumDistrictName;

    /**
     * Gets the value of the age0To4Female property.
     * 
     */
    public int getAge0To4Female() {
        return age0To4Female;
    }

    /**
     * Sets the value of the age0To4Female property.
     * 
     */
    public void setAge0To4Female(int value) {
        this.age0To4Female = value;
    }

    /**
     * Gets the value of the age0To4Male property.
     * 
     */
    public int getAge0To4Male() {
        return age0To4Male;
    }

    /**
     * Sets the value of the age0To4Male property.
     * 
     */
    public void setAge0To4Male(int value) {
        this.age0To4Male = value;
    }

    /**
     * Gets the value of the age10To14Female property.
     * 
     */
    public int getAge10To14Female() {
        return age10To14Female;
    }

    /**
     * Sets the value of the age10To14Female property.
     * 
     */
    public void setAge10To14Female(int value) {
        this.age10To14Female = value;
    }

    /**
     * Gets the value of the age10To14Male property.
     * 
     */
    public int getAge10To14Male() {
        return age10To14Male;
    }

    /**
     * Sets the value of the age10To14Male property.
     * 
     */
    public void setAge10To14Male(int value) {
        this.age10To14Male = value;
    }

    /**
     * Gets the value of the age15To19Female property.
     * 
     */
    public int getAge15To19Female() {
        return age15To19Female;
    }

    /**
     * Sets the value of the age15To19Female property.
     * 
     */
    public void setAge15To19Female(int value) {
        this.age15To19Female = value;
    }

    /**
     * Gets the value of the age15To19Male property.
     * 
     */
    public int getAge15To19Male() {
        return age15To19Male;
    }

    /**
     * Sets the value of the age15To19Male property.
     * 
     */
    public void setAge15To19Male(int value) {
        this.age15To19Male = value;
    }

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
     * Gets the value of the age20To24Male property.
     * 
     */
    public int getAge20To24Male() {
        return age20To24Male;
    }

    /**
     * Sets the value of the age20To24Male property.
     * 
     */
    public void setAge20To24Male(int value) {
        this.age20To24Male = value;
    }

    /**
     * Gets the value of the age25To29Female property.
     * 
     */
    public int getAge25To29Female() {
        return age25To29Female;
    }

    /**
     * Sets the value of the age25To29Female property.
     * 
     */
    public void setAge25To29Female(int value) {
        this.age25To29Female = value;
    }

    /**
     * Gets the value of the age25To29Male property.
     * 
     */
    public int getAge25To29Male() {
        return age25To29Male;
    }

    /**
     * Sets the value of the age25To29Male property.
     * 
     */
    public void setAge25To29Male(int value) {
        this.age25To29Male = value;
    }

    /**
     * Gets the value of the age30To34Female property.
     * 
     */
    public int getAge30To34Female() {
        return age30To34Female;
    }

    /**
     * Sets the value of the age30To34Female property.
     * 
     */
    public void setAge30To34Female(int value) {
        this.age30To34Female = value;
    }

    /**
     * Gets the value of the age30To34Male property.
     * 
     */
    public int getAge30To34Male() {
        return age30To34Male;
    }

    /**
     * Sets the value of the age30To34Male property.
     * 
     */
    public void setAge30To34Male(int value) {
        this.age30To34Male = value;
    }

    /**
     * Gets the value of the age35To39Female property.
     * 
     */
    public int getAge35To39Female() {
        return age35To39Female;
    }

    /**
     * Sets the value of the age35To39Female property.
     * 
     */
    public void setAge35To39Female(int value) {
        this.age35To39Female = value;
    }

    /**
     * Gets the value of the age35To39Male property.
     * 
     */
    public int getAge35To39Male() {
        return age35To39Male;
    }

    /**
     * Sets the value of the age35To39Male property.
     * 
     */
    public void setAge35To39Male(int value) {
        this.age35To39Male = value;
    }

    /**
     * Gets the value of the age40To44Female property.
     * 
     */
    public int getAge40To44Female() {
        return age40To44Female;
    }

    /**
     * Sets the value of the age40To44Female property.
     * 
     */
    public void setAge40To44Female(int value) {
        this.age40To44Female = value;
    }

    /**
     * Gets the value of the age40To44Male property.
     * 
     */
    public int getAge40To44Male() {
        return age40To44Male;
    }

    /**
     * Sets the value of the age40To44Male property.
     * 
     */
    public void setAge40To44Male(int value) {
        this.age40To44Male = value;
    }

    /**
     * Gets the value of the age45To49Female property.
     * 
     */
    public int getAge45To49Female() {
        return age45To49Female;
    }

    /**
     * Sets the value of the age45To49Female property.
     * 
     */
    public void setAge45To49Female(int value) {
        this.age45To49Female = value;
    }

    /**
     * Gets the value of the age45To49Male property.
     * 
     */
    public int getAge45To49Male() {
        return age45To49Male;
    }

    /**
     * Sets the value of the age45To49Male property.
     * 
     */
    public void setAge45To49Male(int value) {
        this.age45To49Male = value;
    }

    /**
     * Gets the value of the age50To54Female property.
     * 
     */
    public int getAge50To54Female() {
        return age50To54Female;
    }

    /**
     * Sets the value of the age50To54Female property.
     * 
     */
    public void setAge50To54Female(int value) {
        this.age50To54Female = value;
    }

    /**
     * Gets the value of the age50To54Male property.
     * 
     */
    public int getAge50To54Male() {
        return age50To54Male;
    }

    /**
     * Sets the value of the age50To54Male property.
     * 
     */
    public void setAge50To54Male(int value) {
        this.age50To54Male = value;
    }

    /**
     * Gets the value of the age55ToOldFemale property.
     * 
     */
    public int getAge55ToOldFemale() {
        return age55ToOldFemale;
    }

    /**
     * Sets the value of the age55ToOldFemale property.
     * 
     */
    public void setAge55ToOldFemale(int value) {
        this.age55ToOldFemale = value;
    }

    /**
     * Gets the value of the age55ToOldMale property.
     * 
     */
    public int getAge55ToOldMale() {
        return age55ToOldMale;
    }

    /**
     * Sets the value of the age55ToOldMale property.
     * 
     */
    public void setAge55ToOldMale(int value) {
        this.age55ToOldMale = value;
    }

    /**
     * Gets the value of the age5To9Female property.
     * 
     */
    public int getAge5To9Female() {
        return age5To9Female;
    }

    /**
     * Sets the value of the age5To9Female property.
     * 
     */
    public void setAge5To9Female(int value) {
        this.age5To9Female = value;
    }

    /**
     * Gets the value of the age5To9Male property.
     * 
     */
    public int getAge5To9Male() {
        return age5To9Male;
    }

    /**
     * Sets the value of the age5To9Male property.
     * 
     */
    public void setAge5To9Male(int value) {
        this.age5To9Male = value;
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
     * Gets the value of the female property.
     * 
     */
    public int getFemale() {
        return female;
    }

    /**
     * Sets the value of the female property.
     * 
     */
    public void setFemale(int value) {
        this.female = value;
    }

    /**
     * Gets the value of the male property.
     * 
     */
    public int getMale() {
        return male;
    }

    /**
     * Sets the value of the male property.
     * 
     */
    public void setMale(int value) {
        this.male = value;
    }

    /**
     * Gets the value of the otherFemale property.
     * 
     */
    public int getOtherFemale() {
        return otherFemale;
    }

    /**
     * Sets the value of the otherFemale property.
     * 
     */
    public void setOtherFemale(int value) {
        this.otherFemale = value;
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
