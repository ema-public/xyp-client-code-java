
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childrenStatisticDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childrenStatisticDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age014" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age014Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age014Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age1519" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age1519Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age1519Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2024" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2024Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2024Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2529" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2529Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2529Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age3034" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age3034Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age3034Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age3539" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age3539Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age3539Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age4044" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age4044Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age4044Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age4549" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age4549Female" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age4549Male" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age50Plus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age50PlusFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age50PlusMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="district" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inHospital" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inHospitalFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inHospitalMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalChildren" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childrenStatisticDetailData", propOrder = {
    "age014",
    "age014Female",
    "age014Male",
    "age1519",
    "age1519Female",
    "age1519Male",
    "age2024",
    "age2024Female",
    "age2024Male",
    "age2529",
    "age2529Female",
    "age2529Male",
    "age3034",
    "age3034Female",
    "age3034Male",
    "age3539",
    "age3539Female",
    "age3539Male",
    "age4044",
    "age4044Female",
    "age4044Male",
    "age4549",
    "age4549Female",
    "age4549Male",
    "age50Plus",
    "age50PlusFemale",
    "age50PlusMale",
    "district",
    "inHospital",
    "inHospitalFemale",
    "inHospitalMale",
    "province",
    "totalChildren",
    "totalFemale",
    "totalMale"
})
public class ChildrenStatisticDetailData {

    protected String age014;
    protected String age014Female;
    protected String age014Male;
    protected String age1519;
    protected String age1519Female;
    protected String age1519Male;
    protected String age2024;
    protected String age2024Female;
    protected String age2024Male;
    protected String age2529;
    protected String age2529Female;
    protected String age2529Male;
    protected String age3034;
    protected String age3034Female;
    protected String age3034Male;
    protected String age3539;
    protected String age3539Female;
    protected String age3539Male;
    protected String age4044;
    protected String age4044Female;
    protected String age4044Male;
    protected String age4549;
    protected String age4549Female;
    protected String age4549Male;
    protected String age50Plus;
    protected String age50PlusFemale;
    protected String age50PlusMale;
    protected String district;
    protected String inHospital;
    protected String inHospitalFemale;
    protected String inHospitalMale;
    protected String province;
    protected String totalChildren;
    protected String totalFemale;
    protected String totalMale;

    /**
     * Gets the value of the age014 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge014() {
        return age014;
    }

    /**
     * Sets the value of the age014 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge014(String value) {
        this.age014 = value;
    }

    /**
     * Gets the value of the age014Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge014Female() {
        return age014Female;
    }

    /**
     * Sets the value of the age014Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge014Female(String value) {
        this.age014Female = value;
    }

    /**
     * Gets the value of the age014Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge014Male() {
        return age014Male;
    }

    /**
     * Sets the value of the age014Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge014Male(String value) {
        this.age014Male = value;
    }

    /**
     * Gets the value of the age1519 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge1519() {
        return age1519;
    }

    /**
     * Sets the value of the age1519 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge1519(String value) {
        this.age1519 = value;
    }

    /**
     * Gets the value of the age1519Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge1519Female() {
        return age1519Female;
    }

    /**
     * Sets the value of the age1519Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge1519Female(String value) {
        this.age1519Female = value;
    }

    /**
     * Gets the value of the age1519Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge1519Male() {
        return age1519Male;
    }

    /**
     * Sets the value of the age1519Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge1519Male(String value) {
        this.age1519Male = value;
    }

    /**
     * Gets the value of the age2024 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2024() {
        return age2024;
    }

    /**
     * Sets the value of the age2024 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2024(String value) {
        this.age2024 = value;
    }

    /**
     * Gets the value of the age2024Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2024Female() {
        return age2024Female;
    }

    /**
     * Sets the value of the age2024Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2024Female(String value) {
        this.age2024Female = value;
    }

    /**
     * Gets the value of the age2024Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2024Male() {
        return age2024Male;
    }

    /**
     * Sets the value of the age2024Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2024Male(String value) {
        this.age2024Male = value;
    }

    /**
     * Gets the value of the age2529 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2529() {
        return age2529;
    }

    /**
     * Sets the value of the age2529 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2529(String value) {
        this.age2529 = value;
    }

    /**
     * Gets the value of the age2529Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2529Female() {
        return age2529Female;
    }

    /**
     * Sets the value of the age2529Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2529Female(String value) {
        this.age2529Female = value;
    }

    /**
     * Gets the value of the age2529Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2529Male() {
        return age2529Male;
    }

    /**
     * Sets the value of the age2529Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2529Male(String value) {
        this.age2529Male = value;
    }

    /**
     * Gets the value of the age3034 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge3034() {
        return age3034;
    }

    /**
     * Sets the value of the age3034 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge3034(String value) {
        this.age3034 = value;
    }

    /**
     * Gets the value of the age3034Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge3034Female() {
        return age3034Female;
    }

    /**
     * Sets the value of the age3034Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge3034Female(String value) {
        this.age3034Female = value;
    }

    /**
     * Gets the value of the age3034Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge3034Male() {
        return age3034Male;
    }

    /**
     * Sets the value of the age3034Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge3034Male(String value) {
        this.age3034Male = value;
    }

    /**
     * Gets the value of the age3539 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge3539() {
        return age3539;
    }

    /**
     * Sets the value of the age3539 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge3539(String value) {
        this.age3539 = value;
    }

    /**
     * Gets the value of the age3539Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge3539Female() {
        return age3539Female;
    }

    /**
     * Sets the value of the age3539Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge3539Female(String value) {
        this.age3539Female = value;
    }

    /**
     * Gets the value of the age3539Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge3539Male() {
        return age3539Male;
    }

    /**
     * Sets the value of the age3539Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge3539Male(String value) {
        this.age3539Male = value;
    }

    /**
     * Gets the value of the age4044 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge4044() {
        return age4044;
    }

    /**
     * Sets the value of the age4044 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge4044(String value) {
        this.age4044 = value;
    }

    /**
     * Gets the value of the age4044Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge4044Female() {
        return age4044Female;
    }

    /**
     * Sets the value of the age4044Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge4044Female(String value) {
        this.age4044Female = value;
    }

    /**
     * Gets the value of the age4044Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge4044Male() {
        return age4044Male;
    }

    /**
     * Sets the value of the age4044Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge4044Male(String value) {
        this.age4044Male = value;
    }

    /**
     * Gets the value of the age4549 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge4549() {
        return age4549;
    }

    /**
     * Sets the value of the age4549 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge4549(String value) {
        this.age4549 = value;
    }

    /**
     * Gets the value of the age4549Female property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge4549Female() {
        return age4549Female;
    }

    /**
     * Sets the value of the age4549Female property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge4549Female(String value) {
        this.age4549Female = value;
    }

    /**
     * Gets the value of the age4549Male property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge4549Male() {
        return age4549Male;
    }

    /**
     * Sets the value of the age4549Male property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge4549Male(String value) {
        this.age4549Male = value;
    }

    /**
     * Gets the value of the age50Plus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge50Plus() {
        return age50Plus;
    }

    /**
     * Sets the value of the age50Plus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge50Plus(String value) {
        this.age50Plus = value;
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
     * Gets the value of the inHospital property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHospital() {
        return inHospital;
    }

    /**
     * Sets the value of the inHospital property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHospital(String value) {
        this.inHospital = value;
    }

    /**
     * Gets the value of the inHospitalFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHospitalFemale() {
        return inHospitalFemale;
    }

    /**
     * Sets the value of the inHospitalFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHospitalFemale(String value) {
        this.inHospitalFemale = value;
    }

    /**
     * Gets the value of the inHospitalMale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInHospitalMale() {
        return inHospitalMale;
    }

    /**
     * Sets the value of the inHospitalMale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInHospitalMale(String value) {
        this.inHospitalMale = value;
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
     * Gets the value of the totalChildren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalChildren() {
        return totalChildren;
    }

    /**
     * Sets the value of the totalChildren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalChildren(String value) {
        this.totalChildren = value;
    }

    /**
     * Gets the value of the totalFemale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFemale() {
        return totalFemale;
    }

    /**
     * Sets the value of the totalFemale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFemale(String value) {
        this.totalFemale = value;
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

}
