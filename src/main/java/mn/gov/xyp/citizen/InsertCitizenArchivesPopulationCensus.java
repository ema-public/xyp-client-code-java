
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertCitizenArchivesPopulationCensus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertCitizenArchivesPopulationCensus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disctict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="member1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="member2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertCitizenArchivesPopulationCensus", propOrder = {
    "disctict",
    "member1",
    "member2",
    "orderId",
    "type",
    "year"
})
public class InsertCitizenArchivesPopulationCensus {

    protected String disctict;
    protected String member1;
    protected String member2;
    protected int orderId;
    protected String type;
    protected int year;

    /**
     * Gets the value of the disctict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisctict() {
        return disctict;
    }

    /**
     * Sets the value of the disctict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisctict(String value) {
        this.disctict = value;
    }

    /**
     * Gets the value of the member1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMember1() {
        return member1;
    }

    /**
     * Sets the value of the member1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMember1(String value) {
        this.member1 = value;
    }

    /**
     * Gets the value of the member2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMember2() {
        return member2;
    }

    /**
     * Sets the value of the member2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMember2(String value) {
        this.member2 = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
