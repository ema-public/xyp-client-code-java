
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soumDistrictInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soumDistrictInfoData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listData" type="{http://citizen.xyp.gov.mn/}soumDistrictInfoDetailData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soumDistrictInfoData", propOrder = {
    "listData"
})
public class SoumDistrictInfoData {

    @XmlElement(nillable = true)
    protected List<SoumDistrictInfoDetailData> listData;

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
     * {@link SoumDistrictInfoDetailData }
     * 
     * 
     */
    public List<SoumDistrictInfoDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<SoumDistrictInfoDetailData>();
        }
        return this.listData;
    }

}
