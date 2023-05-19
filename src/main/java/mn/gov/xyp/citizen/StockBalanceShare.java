
package mn.gov.xyp.citizen;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stockBalanceShare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stockBalanceShare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="bdcName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shareName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockBalanceShare", propOrder = {
    "balance",
    "bdcName",
    "rowNumber",
    "shareName"
})
public class StockBalanceShare {

    protected BigDecimal balance;
    protected String bdcName;
    protected String rowNumber;
    protected String shareName;

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the bdcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdcName() {
        return bdcName;
    }

    /**
     * Sets the value of the bdcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdcName(String value) {
        this.bdcName = value;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowNumber(String value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the shareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareName() {
        return shareName;
    }

    /**
     * Sets the value of the shareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareName(String value) {
        this.shareName = value;
    }

}
