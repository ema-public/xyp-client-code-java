
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatisticMigrantReasonDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatisticMigrantReasonDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="female" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="graduateFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="graduateMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guardianFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="guardianMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="improveLivingConditionFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="improveLivingConditionMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="male" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="otherMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="studyFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="studyMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workAppointmentFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workAppointmentMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workProfessionallyFemale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="workProfessionallyMale" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStatisticMigrantReasonDetailData", propOrder = {
    "all",
    "female",
    "graduateFemale",
    "graduateMale",
    "guardianFemale",
    "guardianMale",
    "improveLivingConditionFemale",
    "improveLivingConditionMale",
    "male",
    "name",
    "otherFemale",
    "otherMale",
    "studyFemale",
    "studyMale",
    "workAppointmentFemale",
    "workAppointmentMale",
    "workProfessionallyFemale",
    "workProfessionallyMale"
})
public class CitizenStatisticMigrantReasonDetailData {

    protected int all;
    protected int female;
    protected int graduateFemale;
    protected int graduateMale;
    protected int guardianFemale;
    protected int guardianMale;
    protected int improveLivingConditionFemale;
    protected int improveLivingConditionMale;
    protected int male;
    protected String name;
    protected int otherFemale;
    protected int otherMale;
    protected int studyFemale;
    protected int studyMale;
    protected int workAppointmentFemale;
    protected int workAppointmentMale;
    protected int workProfessionallyFemale;
    protected int workProfessionallyMale;

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
     * Gets the value of the graduateFemale property.
     * 
     */
    public int getGraduateFemale() {
        return graduateFemale;
    }

    /**
     * Sets the value of the graduateFemale property.
     * 
     */
    public void setGraduateFemale(int value) {
        this.graduateFemale = value;
    }

    /**
     * Gets the value of the graduateMale property.
     * 
     */
    public int getGraduateMale() {
        return graduateMale;
    }

    /**
     * Sets the value of the graduateMale property.
     * 
     */
    public void setGraduateMale(int value) {
        this.graduateMale = value;
    }

    /**
     * Gets the value of the guardianFemale property.
     * 
     */
    public int getGuardianFemale() {
        return guardianFemale;
    }

    /**
     * Sets the value of the guardianFemale property.
     * 
     */
    public void setGuardianFemale(int value) {
        this.guardianFemale = value;
    }

    /**
     * Gets the value of the guardianMale property.
     * 
     */
    public int getGuardianMale() {
        return guardianMale;
    }

    /**
     * Sets the value of the guardianMale property.
     * 
     */
    public void setGuardianMale(int value) {
        this.guardianMale = value;
    }

    /**
     * Gets the value of the improveLivingConditionFemale property.
     * 
     */
    public int getImproveLivingConditionFemale() {
        return improveLivingConditionFemale;
    }

    /**
     * Sets the value of the improveLivingConditionFemale property.
     * 
     */
    public void setImproveLivingConditionFemale(int value) {
        this.improveLivingConditionFemale = value;
    }

    /**
     * Gets the value of the improveLivingConditionMale property.
     * 
     */
    public int getImproveLivingConditionMale() {
        return improveLivingConditionMale;
    }

    /**
     * Sets the value of the improveLivingConditionMale property.
     * 
     */
    public void setImproveLivingConditionMale(int value) {
        this.improveLivingConditionMale = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the studyFemale property.
     * 
     */
    public int getStudyFemale() {
        return studyFemale;
    }

    /**
     * Sets the value of the studyFemale property.
     * 
     */
    public void setStudyFemale(int value) {
        this.studyFemale = value;
    }

    /**
     * Gets the value of the studyMale property.
     * 
     */
    public int getStudyMale() {
        return studyMale;
    }

    /**
     * Sets the value of the studyMale property.
     * 
     */
    public void setStudyMale(int value) {
        this.studyMale = value;
    }

    /**
     * Gets the value of the workAppointmentFemale property.
     * 
     */
    public int getWorkAppointmentFemale() {
        return workAppointmentFemale;
    }

    /**
     * Sets the value of the workAppointmentFemale property.
     * 
     */
    public void setWorkAppointmentFemale(int value) {
        this.workAppointmentFemale = value;
    }

    /**
     * Gets the value of the workAppointmentMale property.
     * 
     */
    public int getWorkAppointmentMale() {
        return workAppointmentMale;
    }

    /**
     * Sets the value of the workAppointmentMale property.
     * 
     */
    public void setWorkAppointmentMale(int value) {
        this.workAppointmentMale = value;
    }

    /**
     * Gets the value of the workProfessionallyFemale property.
     * 
     */
    public int getWorkProfessionallyFemale() {
        return workProfessionallyFemale;
    }

    /**
     * Sets the value of the workProfessionallyFemale property.
     * 
     */
    public void setWorkProfessionallyFemale(int value) {
        this.workProfessionallyFemale = value;
    }

    /**
     * Gets the value of the workProfessionallyMale property.
     * 
     */
    public int getWorkProfessionallyMale() {
        return workProfessionallyMale;
    }

    /**
     * Sets the value of the workProfessionallyMale property.
     * 
     */
    public void setWorkProfessionallyMale(int value) {
        this.workProfessionallyMale = value;
    }

}
