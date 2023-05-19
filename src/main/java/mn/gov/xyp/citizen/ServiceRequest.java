
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="auth" type="{http://citizen.xyp.gov.mn/}authorizationData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "auth"
})
@XmlSeeAlso({
    ServiceAddressStreetInfoRequestData.class,
    InsertNotaryRequestData.class,
    CheckIdCardServiceRequestData.class,
    GraduateInfoByYearRequestData.class,
    ServiceChildrenInfoRequestData.class,
    ServiceGenerateRegisterNumberRequestData.class,
    CitizenRequestData.class,
    CitizenGraduateSchoolRequestData.class,
    CitizenStatisticRequestData.class,
    CitizenDenationalizationRequestData.class,
    ServiceBagKhorooInfoRequestData.class,
    ServiceInsertForeignCitizenInHotelRequestData.class,
    GetDictionaryRequestData.class,
    CitizenEducationRequestData.class,
    Covid19VaccineCertificateRequest.class,
    ChildRequestData.class,
    GetPassportIssuedRequestData.class,
    ServiceCitizenBirthInfoRequestData.class,
    ServiceCheckCitizenAddressInfoRequestData.class,
    GetTegCivilInfoRequestData.class,
    BirthInfoParentRegnumRequestData.class,
    ChildrenInfoByMotherRequestData.class,
    ServicePassortInfoRequestData.class,
    ServiceBorderPassInfoRequestData.class,
    ChildrenBasicInfoRequest.class,
    CitizenFoulDataRequest.class,
    ServiceInsertBirthInfoRequestData.class,
    ServiceAddressApartmentInfoRequestData.class,
    CitizenInfoLogByDateRequestData.class,
    CitizenCriminalLiabilityEngRequestData.class,
    Covid19InternationalCertRequestData.class,
    CitizenCriminalLiabilityRequestData.class,
    ServiceSoumDistrictInfoRequestData.class,
    ServiceCheckCitizenRegnumRequestData.class,
    InsertCitizenArchivesOrderRequestData.class,
    CovidPCRRequestData.class,
    ServiceCitizenBorderPassRequestData.class,
    ServiceCitizenDeceaseInfoRequestData.class,
    CheckCitizenInfoRequestData.class,
    CitizenReleasedInfoRequestData.class,
    GetFireArmRequestData.class,
    ServiceCitizenLookUpAddressRequestData.class,
    PassportInvalidInfoRequestData.class,
    ServiceCitizenLookUpInfoRequestData.class,
    RegistrationBasicRequest.class
})
public class ServiceRequest {

    protected AuthorizationData auth;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationData }
     *     
     */
    public AuthorizationData getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationData }
     *     
     */
    public void setAuth(AuthorizationData value) {
        this.auth = value;
    }

}
