
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenMarriageStatisticDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenMarriageStatisticDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age18to19Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age18to19Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age20to24Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age20to24Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age25to29Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age25to29Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age30to34Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age30to34Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age35to39Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age35to39Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age40to44Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age40to44Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age45to49Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age45to49Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age50PlusFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age50PlusMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fifthMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fifthMarriageMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstMarriageMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fourthMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fourthMarriageMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriageCountFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="marriageCountMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondMarriageMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdMarriageMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMarriageFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenMarriageStatisticDetailData", propOrder = {
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
    "district",
    "fifthMarriageFemale",
    "fifthMarriageMale",
    "firstMarriageFemale",
    "firstMarriageMale",
    "fourthMarriageFemale",
    "fourthMarriageMale",
    "marriageCountFemale",
    "marriageCountMale",
    "province",
    "secondMarriageFemale",
    "secondMarriageMale",
    "thirdMarriageFemale",
    "thirdMarriageMale",
    "totalMale",
    "totalMarriageFemale"
})
public class CitizenMarriageStatisticDetailData {

    @XmlElement(name = "age18to19Female")
    protected String age18To19Female;
    @XmlElement(name = "age18to19Male")
    protected String age18To19Male;
    @XmlElement(name = "age20to24Female")
    protected String age20To24Female;
    @XmlElement(name = "age20to24Male")
    protected String age20To24Male;
    @XmlElement(name = "age25to29Female")
    protected String age25To29Female;
    @XmlElement(name = "age25to29Male")
    protected String age25To29Male;
    @XmlElement(name = "age30to34Female")
    protected String age30To34Female;
    @XmlElement(name = "age30to34Male")
    protected String age30To34Male;
    @XmlElement(name = "age35to39Female")
    protected String age35To39Female;
    @XmlElement(name = "age35to39Male")
    protected String age35To39Male;
    @XmlElement(name = "age40to44Female")
    protected String age40To44Female;
    @XmlElement(name = "age40to44Male")
    protected String age40To44Male;
    @XmlElement(name = "age45to49Female")
    protected String age45To49Female;
    @XmlElement(name = "age45to49Male")
    protected String age45To49Male;
    protected String age50PlusFemale;
    protected String age50PlusMale;
    protected String district;
    protected String fifthMarriageFemale;
    protected String fifthMarriageMale;
    protected String firstMarriageFemale;
    protected String firstMarriageMale;
    protected String fourthMarriageFemale;
    protected String fourthMarriageMale;
    protected String marriageCountFemale;
    protected String marriageCountMale;
    protected String province;
    protected String secondMarriageFemale;
    protected String secondMarriageMale;
    protected String thirdMarriageFemale;
    protected String thirdMarriageMale;
    protected String totalMale;
    protected String totalMarriageFemale;

    /**
     * Gets the value of the age18To19Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge18To19Female() {
        return age18To19Female;
    }

    /**
     * Sets the value of the age18To19Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge18To19Female(String value) {
        this.age18To19Female = value;
    }

    /**
     * Gets the value of the age18To19Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge18To19Male() {
        return age18To19Male;
    }

    /**
     * Sets the value of the age18To19Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge18To19Male(String value) {
        this.age18To19Male = value;
    }

    /**
     * Gets the value of the age20To24Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge20To24Female() {
        return age20To24Female;
    }

    /**
     * Sets the value of the age20To24Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge20To24Female(String value) {
        this.age20To24Female = value;
    }

    /**
     * Gets the value of the age20To24Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge20To24Male() {
        return age20To24Male;
    }

    /**
     * Sets the value of the age20To24Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge20To24Male(String value) {
        this.age20To24Male = value;
    }

    /**
     * Gets the value of the age25To29Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge25To29Female() {
        return age25To29Female;
    }

    /**
     * Sets the value of the age25To29Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge25To29Female(String value) {
        this.age25To29Female = value;
    }

    /**
     * Gets the value of the age25To29Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge25To29Male() {
        return age25To29Male;
    }

    /**
     * Sets the value of the age25To29Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge25To29Male(String value) {
        this.age25To29Male = value;
    }

    /**
     * Gets the value of the age30To34Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge30To34Female() {
        return age30To34Female;
    }

    /**
     * Sets the value of the age30To34Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge30To34Female(String value) {
        this.age30To34Female = value;
    }

    /**
     * Gets the value of the age30To34Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge30To34Male() {
        return age30To34Male;
    }

    /**
     * Sets the value of the age30To34Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge30To34Male(String value) {
        this.age30To34Male = value;
    }

    /**
     * Gets the value of the age35To39Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge35To39Female() {
        return age35To39Female;
    }

    /**
     * Sets the value of the age35To39Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge35To39Female(String value) {
        this.age35To39Female = value;
    }

    /**
     * Gets the value of the age35To39Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge35To39Male() {
        return age35To39Male;
    }

    /**
     * Sets the value of the age35To39Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge35To39Male(String value) {
        this.age35To39Male = value;
    }

    /**
     * Gets the value of the age40To44Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge40To44Female() {
        return age40To44Female;
    }

    /**
     * Sets the value of the age40To44Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge40To44Female(String value) {
        this.age40To44Female = value;
    }

    /**
     * Gets the value of the age40To44Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge40To44Male() {
        return age40To44Male;
    }

    /**
     * Sets the value of the age40To44Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge40To44Male(String value) {
        this.age40To44Male = value;
    }

    /**
     * Gets the value of the age45To49Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge45To49Female() {
        return age45To49Female;
    }

    /**
     * Sets the value of the age45To49Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge45To49Female(String value) {
        this.age45To49Female = value;
    }

    /**
     * Gets the value of the age45To49Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge45To49Male() {
        return age45To49Male;
    }

    /**
     * Sets the value of the age45To49Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge45To49Male(String value) {
        this.age45To49Male = value;
    }

    /**
     * Gets the value of the age50PlusFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge50PlusFemale() {
        return age50PlusFemale;
    }

    /**
     * Sets the value of the age50PlusFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge50PlusFemale(String value) {
        this.age50PlusFemale = value;
    }

    /**
     * Gets the value of the age50PlusMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge50PlusMale() {
        return age50PlusMale;
    }

    /**
     * Sets the value of the age50PlusMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge50PlusMale(String value) {
        this.age50PlusMale = value;
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
     * Gets the value of the fifthMarriageFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFifthMarriageFemale() {
        return fifthMarriageFemale;
    }

    /**
     * Sets the value of the fifthMarriageFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFifthMarriageFemale(String value) {
        this.fifthMarriageFemale = value;
    }

    /**
     * Gets the value of the fifthMarriageMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFifthMarriageMale() {
        return fifthMarriageMale;
    }

    /**
     * Sets the value of the fifthMarriageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFifthMarriageMale(String value) {
        this.fifthMarriageMale = value;
    }

    /**
     * Gets the value of the firstMarriageFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstMarriageFemale() {
        return firstMarriageFemale;
    }

    /**
     * Sets the value of the firstMarriageFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstMarriageFemale(String value) {
        this.firstMarriageFemale = value;
    }

    /**
     * Gets the value of the firstMarriageMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstMarriageMale() {
        return firstMarriageMale;
    }

    /**
     * Sets the value of the firstMarriageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstMarriageMale(String value) {
        this.firstMarriageMale = value;
    }

    /**
     * Gets the value of the fourthMarriageFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthMarriageFemale() {
        return fourthMarriageFemale;
    }

    /**
     * Sets the value of the fourthMarriageFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthMarriageFemale(String value) {
        this.fourthMarriageFemale = value;
    }

    /**
     * Gets the value of the fourthMarriageMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFourthMarriageMale() {
        return fourthMarriageMale;
    }

    /**
     * Sets the value of the fourthMarriageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFourthMarriageMale(String value) {
        this.fourthMarriageMale = value;
    }

    /**
     * Gets the value of the marriageCountFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageCountFemale() {
        return marriageCountFemale;
    }

    /**
     * Sets the value of the marriageCountFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageCountFemale(String value) {
        this.marriageCountFemale = value;
    }

    /**
     * Gets the value of the marriageCountMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageCountMale() {
        return marriageCountMale;
    }

    /**
     * Sets the value of the marriageCountMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageCountMale(String value) {
        this.marriageCountMale = value;
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
     * Gets the value of the secondMarriageFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondMarriageFemale() {
        return secondMarriageFemale;
    }

    /**
     * Sets the value of the secondMarriageFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondMarriageFemale(String value) {
        this.secondMarriageFemale = value;
    }

    /**
     * Gets the value of the secondMarriageMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondMarriageMale() {
        return secondMarriageMale;
    }

    /**
     * Sets the value of the secondMarriageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondMarriageMale(String value) {
        this.secondMarriageMale = value;
    }

    /**
     * Gets the value of the thirdMarriageFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdMarriageFemale() {
        return thirdMarriageFemale;
    }

    /**
     * Sets the value of the thirdMarriageFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdMarriageFemale(String value) {
        this.thirdMarriageFemale = value;
    }

    /**
     * Gets the value of the thirdMarriageMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdMarriageMale() {
        return thirdMarriageMale;
    }

    /**
     * Sets the value of the thirdMarriageMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdMarriageMale(String value) {
        this.thirdMarriageMale = value;
    }

    /**
     * Gets the value of the totalMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMale() {
        return totalMale;
    }

    /**
     * Sets the value of the totalMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMale(String value) {
        this.totalMale = value;
    }

    /**
     * Gets the value of the totalMarriageFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalMarriageFemale() {
        return totalMarriageFemale;
    }

    /**
     * Sets the value of the totalMarriageFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalMarriageFemale(String value) {
        this.totalMarriageFemale = value;
    }

}
