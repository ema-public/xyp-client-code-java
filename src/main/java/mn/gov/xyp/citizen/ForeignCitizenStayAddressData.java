
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foreignCitizenStayAddressData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignCitizenStayAddressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listData" type="{http://citizen.xyp.gov.mn/}foreignCitizenStayAddressDetailData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignCitizenStayAddressData", propOrder = {
    "listData"
})
public class ForeignCitizenStayAddressData {

    @XmlElement(nillable = true)
    protected List<ForeignCitizenStayAddressDetailData> listData;

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
     * {@link ForeignCitizenStayAddressDetailData }
     * 
     * 
     */
    public List<ForeignCitizenStayAddressDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<ForeignCitizenStayAddressDetailData>();
        }
        return this.listData;
    }

}
