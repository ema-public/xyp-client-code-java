
package mn.gov.xyp.citizen;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stockBalanceHishigt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stockBalanceHishigt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="amountInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rownum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stockBalanceHishigt", propOrder = {
    "amount",
    "amountInfo",
    "rownum"
})
public class StockBalanceHishigt {

    protected BigDecimal amount;
    protected String amountInfo;
    protected String rownum;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the amountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountInfo() {
        return amountInfo;
    }

    /**
     * Sets the value of the amountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountInfo(String value) {
        this.amountInfo = value;
    }

    /**
     * Gets the value of the rownum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRownum() {
        return rownum;
    }

    /**
     * Sets the value of the rownum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRownum(String value) {
        this.rownum = value;
    }

}
