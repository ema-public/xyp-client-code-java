
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatsDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatsDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age18To19Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age18To19Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age20To24Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age20To24Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age25To29Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age25To29Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age30To34Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age30To34Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age35To39Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age35To39Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age40To44Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age40To44Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age45To49Female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age45To49Male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age50plusFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="age50plusMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sumMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStatsDetailData", propOrder = {
    "age18To19Female",
    "age18To19Male",
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
    "age50PlusFemale",
    "age50PlusMale",
    "aimagCityName",
    "soumDistrictName",
    "sumFemale",
    "sumMale"
})
public class CitizenStatsDetailData {

    protected int age18To19Female;
    protected int age18To19Male;
    protected int age20To24Female;
    protected int age20To24Male;
    protected int age25To29Female;
    protected int age25To29Male;
    protected int age30To34Female;
    protected int age30To34Male;
    protected int age35To39Female;
    protected int age35To39Male;
    protected int age40To44Female;
    protected int age40To44Male;
    protected int age45To49Female;
    protected int age45To49Male;
    @XmlElement(name = "age50plusFemale")
    protected int age50PlusFemale;
    @XmlElement(name = "age50plusMale")
    protected int age50PlusMale;
    protected String aimagCityName;
    protected String soumDistrictName;
    protected int sumFemale;
    protected int sumMale;

    /**
     * Gets the value of the age18To19Female property.
     * 
     */
    public int getAge18To19Female() {
        return age18To19Female;
    }

    /**
     * Sets the value of the age18To19Female property.
     * 
     */
    public void setAge18To19Female(int value) {
        this.age18To19Female = value;
    }

    /**
     * Gets the value of the age18To19Male property.
     * 
     */
    public int getAge18To19Male() {
        return age18To19Male;
    }

    /**
     * Sets the value of the age18To19Male property.
     * 
     */
    public void setAge18To19Male(int value) {
        this.age18To19Male = value;
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
     * Gets the value of the age50PlusFemale property.
     * 
     */
    public int getAge50PlusFemale() {
        return age50PlusFemale;
    }

    /**
     * Sets the value of the age50PlusFemale property.
     * 
     */
    public void setAge50PlusFemale(int value) {
        this.age50PlusFemale = value;
    }

    /**
     * Gets the value of the age50PlusMale property.
     * 
     */
    public int getAge50PlusMale() {
        return age50PlusMale;
    }

    /**
     * Sets the value of the age50PlusMale property.
     * 
     */
    public void setAge50PlusMale(int value) {
        this.age50PlusMale = value;
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
     * Gets the value of the sumFemale property.
     * 
     */
    public int getSumFemale() {
        return sumFemale;
    }

    /**
     * Sets the value of the sumFemale property.
     * 
     */
    public void setSumFemale(int value) {
        this.sumFemale = value;
    }

    /**
     * Gets the value of the sumMale property.
     * 
     */
    public int getSumMale() {
        return sumMale;
    }

    /**
     * Sets the value of the sumMale property.
     * 
     */
    public void setSumMale(int value) {
        this.sumMale = value;
    }

}
