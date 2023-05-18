
package mn.gov.xyp.citizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStockBalanceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStockBalanceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listDataHishigt" type="{http://citizen.xyp.gov.mn/}stockBalanceHishigt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listDataSain" type="{http://citizen.xyp.gov.mn/}stockBalanceHishigt" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listDataShares" type="{http://citizen.xyp.gov.mn/}stockBalanceShare" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStockBalanceData", propOrder = {
    "firstName",
    "info",
    "lastName",
    "listDataHishigt",
    "listDataSain",
    "listDataShares",
    "regnum"
})
public class CitizenStockBalanceData {

    protected String firstName;
    protected String info;
    protected String lastName;
    @XmlElement(nillable = true)
    protected List<StockBalanceHishigt> listDataHishigt;
    @XmlElement(nillable = true)
    protected List<StockBalanceHishigt> listDataSain;
    @XmlElement(nillable = true)
    protected List<StockBalanceShare> listDataShares;
    protected String regnum;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the listDataHishigt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDataHishigt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDataHishigt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockBalanceHishigt }
     * 
     * 
     */
    public List<StockBalanceHishigt> getListDataHishigt() {
        if (listDataHishigt == null) {
            listDataHishigt = new ArrayList<StockBalanceHishigt>();
        }
        return this.listDataHishigt;
    }

    /**
     * Gets the value of the listDataSain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDataSain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDataSain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockBalanceHishigt }
     * 
     * 
     */
    public List<StockBalanceHishigt> getListDataSain() {
        if (listDataSain == null) {
            listDataSain = new ArrayList<StockBalanceHishigt>();
        }
        return this.listDataSain;
    }

    /**
     * Gets the value of the listDataShares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listDataShares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListDataShares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StockBalanceShare }
     * 
     * 
     */
    public List<StockBalanceShare> getListDataShares() {
        if (listDataShares == null) {
            listDataShares = new ArrayList<StockBalanceShare>();
        }
        return this.listDataShares;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

}
