
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatisticAdoptedChildrenDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatisticAdoptedChildrenDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cooperativeFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cooperativeMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employerFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employerMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="houseHoldFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="houseHoldMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="labourFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="labourMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="otherFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="otherMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="privateFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="privateMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salaryFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="salarymale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unemployedFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="unemployedMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStatisticAdoptedChildrenDetailData", propOrder = {
    "aimagCityName",
    "cooperativeFemale",
    "cooperativeMale",
    "employerFemale",
    "employerMale",
    "houseHoldFemale",
    "houseHoldMale",
    "labourFemale",
    "labourMale",
    "otherFemale",
    "otherMale",
    "privateFemale",
    "privateMale",
    "salaryFemale",
    "salarymale",
    "soumDistrictName",
    "unemployedFemale",
    "unemployedMale"
})
public class CitizenStatisticAdoptedChildrenDetailData {

    protected String aimagCityName;
    protected int cooperativeFemale;
    protected int cooperativeMale;
    protected int employerFemale;
    protected int employerMale;
    protected int houseHoldFemale;
    protected int houseHoldMale;
    protected int labourFemale;
    protected int labourMale;
    protected int otherFemale;
    protected int otherMale;
    protected int privateFemale;
    protected int privateMale;
    protected int salaryFemale;
    protected int salarymale;
    protected String soumDistrictName;
    protected int unemployedFemale;
    protected int unemployedMale;

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
     * Gets the value of the cooperativeFemale property.
     * 
     */
    public int getCooperativeFemale() {
        return cooperativeFemale;
    }

    /**
     * Sets the value of the cooperativeFemale property.
     * 
     */
    public void setCooperativeFemale(int value) {
        this.cooperativeFemale = value;
    }

    /**
     * Gets the value of the cooperativeMale property.
     * 
     */
    public int getCooperativeMale() {
        return cooperativeMale;
    }

    /**
     * Sets the value of the cooperativeMale property.
     * 
     */
    public void setCooperativeMale(int value) {
        this.cooperativeMale = value;
    }

    /**
     * Gets the value of the employerFemale property.
     * 
     */
    public int getEmployerFemale() {
        return employerFemale;
    }

    /**
     * Sets the value of the employerFemale property.
     * 
     */
    public void setEmployerFemale(int value) {
        this.employerFemale = value;
    }

    /**
     * Gets the value of the employerMale property.
     * 
     */
    public int getEmployerMale() {
        return employerMale;
    }

    /**
     * Sets the value of the employerMale property.
     * 
     */
    public void setEmployerMale(int value) {
        this.employerMale = value;
    }

    /**
     * Gets the value of the houseHoldFemale property.
     * 
     */
    public int getHouseHoldFemale() {
        return houseHoldFemale;
    }

    /**
     * Sets the value of the houseHoldFemale property.
     * 
     */
    public void setHouseHoldFemale(int value) {
        this.houseHoldFemale = value;
    }

    /**
     * Gets the value of the houseHoldMale property.
     * 
     */
    public int getHouseHoldMale() {
        return houseHoldMale;
    }

    /**
     * Sets the value of the houseHoldMale property.
     * 
     */
    public void setHouseHoldMale(int value) {
        this.houseHoldMale = value;
    }

    /**
     * Gets the value of the labourFemale property.
     * 
     */
    public int getLabourFemale() {
        return labourFemale;
    }

    /**
     * Sets the value of the labourFemale property.
     * 
     */
    public void setLabourFemale(int value) {
        this.labourFemale = value;
    }

    /**
     * Gets the value of the labourMale property.
     * 
     */
    public int getLabourMale() {
        return labourMale;
    }

    /**
     * Sets the value of the labourMale property.
     * 
     */
    public void setLabourMale(int value) {
        this.labourMale = value;
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
     * Gets the value of the otherMale property.
     * 
     */
    public int getOtherMale() {
        return otherMale;
    }

    /**
     * Sets the value of the otherMale property.
     * 
     */
    public void setOtherMale(int value) {
        this.otherMale = value;
    }

    /**
     * Gets the value of the privateFemale property.
     * 
     */
    public int getPrivateFemale() {
        return privateFemale;
    }

    /**
     * Sets the value of the privateFemale property.
     * 
     */
    public void setPrivateFemale(int value) {
        this.privateFemale = value;
    }

    /**
     * Gets the value of the privateMale property.
     * 
     */
    public int getPrivateMale() {
        return privateMale;
    }

    /**
     * Sets the value of the privateMale property.
     * 
     */
    public void setPrivateMale(int value) {
        this.privateMale = value;
    }

    /**
     * Gets the value of the salaryFemale property.
     * 
     */
    public int getSalaryFemale() {
        return salaryFemale;
    }

    /**
     * Sets the value of the salaryFemale property.
     * 
     */
    public void setSalaryFemale(int value) {
        this.salaryFemale = value;
    }

    /**
     * Gets the value of the salarymale property.
     * 
     */
    public int getSalarymale() {
        return salarymale;
    }

    /**
     * Sets the value of the salarymale property.
     * 
     */
    public void setSalarymale(int value) {
        this.salarymale = value;
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
     * Gets the value of the unemployedFemale property.
     * 
     */
    public int getUnemployedFemale() {
        return unemployedFemale;
    }

    /**
     * Sets the value of the unemployedFemale property.
     * 
     */
    public void setUnemployedFemale(int value) {
        this.unemployedFemale = value;
    }

    /**
     * Gets the value of the unemployedMale property.
     * 
     */
    public int getUnemployedMale() {
        return unemployedMale;
    }

    /**
     * Sets the value of the unemployedMale property.
     * 
     */
    public void setUnemployedMale(int value) {
        this.unemployedMale = value;
    }

}
