
package mn.gov.xyp.meta;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mockSubData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mockSubData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subData1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subData2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subData3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mockSubData", propOrder = {
    "subData1",
    "subData2",
    "subData3"
})
public class MockSubData {

    protected String subData1;
    protected String subData2;
    protected int subData3;

    /**
     * Gets the value of the subData1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubData1() {
        return subData1;
    }

    /**
     * Sets the value of the subData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubData1(String value) {
        this.subData1 = value;
    }

    /**
     * Gets the value of the subData2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubData2() {
        return subData2;
    }

    /**
     * Sets the value of the subData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubData2(String value) {
        this.subData2 = value;
    }

    /**
     * Gets the value of the subData3 property.
     * 
     */
    public int getSubData3() {
        return subData3;
    }

    /**
     * Sets the value of the subData3 property.
     * 
     */
    public void setSubData3(int value) {
        this.subData3 = value;
    }

}
