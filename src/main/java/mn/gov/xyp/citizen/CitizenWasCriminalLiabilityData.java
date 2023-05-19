
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for citizenWasCriminalLiabilityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenWasCriminalLiabilityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listData" type="{http://citizen.xyp.gov.mn/}citizenWasCriminalLiabilityDetailData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="punishmentCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenWasCriminalLiabilityData", propOrder = {
    "listData",
    "punishmentCount"
})
public class CitizenWasCriminalLiabilityData {

    @XmlElement(nillable = true)
    protected List<CitizenWasCriminalLiabilityDetailData> listData;
    protected int punishmentCount;

    /**
     * Gets the value of the listData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenWasCriminalLiabilityDetailData }
     * 
     * 
     */
    public List<CitizenWasCriminalLiabilityDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<CitizenWasCriminalLiabilityDetailData>();
        }
        return this.listData;
    }

    /**
     * Gets the value of the punishmentCount property.
     * 
     */
    public int getPunishmentCount() {
        return punishmentCount;
    }

    /**
     * Sets the value of the punishmentCount property.
     * 
     */
    public void setPunishmentCount(int value) {
        this.punishmentCount = value;
    }

}
