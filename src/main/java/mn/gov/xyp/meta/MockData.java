
package mn.gov.xyp.meta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for mockData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mockData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param10" type="{http://www.w3.org/2001/XMLSchema}byte" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="param11" type="{http://meta.xyp.gov.mn/}mockSubData" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="param3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="param4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="param5" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="param6" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="param7" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="param8" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="param9" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mockData", propOrder = {
    "param1",
    "param10",
    "param11",
    "param2",
    "param3",
    "param4",
    "param5",
    "param6",
    "param7",
    "param8",
    "param9"
})
public class MockData {

    protected String param1;
    @XmlElement(nillable = true)
    protected List<Byte> param10;
    protected MockSubData param11;
    protected String param2;
    protected int param3;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar param4;
    protected boolean param5;
    protected Boolean param6;
    protected float param7;
    @XmlElement(nillable = true)
    protected List<String> param8;
    protected byte[] param9;

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam1(String value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param10 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param10 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Byte }
     * 
     * 
     */
    public List<Byte> getParam10() {
        if (param10 == null) {
            param10 = new ArrayList<Byte>();
        }
        return this.param10;
    }

    /**
     * Gets the value of the param11 property.
     * 
     * @return
     *     possible object is
     *     {@link MockSubData }
     *     
     */
    public MockSubData getParam11() {
        return param11;
    }

    /**
     * Sets the value of the param11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MockSubData }
     *     
     */
    public void setParam11(MockSubData value) {
        this.param11 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParam2(String value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the param3 property.
     * 
     */
    public int getParam3() {
        return param3;
    }

    /**
     * Sets the value of the param3 property.
     * 
     */
    public void setParam3(int value) {
        this.param3 = value;
    }

    /**
     * Gets the value of the param4 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getParam4() {
        return param4;
    }

    /**
     * Sets the value of the param4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setParam4(XMLGregorianCalendar value) {
        this.param4 = value;
    }

    /**
     * Gets the value of the param5 property.
     * 
     */
    public boolean isParam5() {
        return param5;
    }

    /**
     * Sets the value of the param5 property.
     * 
     */
    public void setParam5(boolean value) {
        this.param5 = value;
    }

    /**
     * Gets the value of the param6 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParam6() {
        return param6;
    }

    /**
     * Sets the value of the param6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParam6(Boolean value) {
        this.param6 = value;
    }

    /**
     * Gets the value of the param7 property.
     * 
     */
    public float getParam7() {
        return param7;
    }

    /**
     * Sets the value of the param7 property.
     * 
     */
    public void setParam7(float value) {
        this.param7 = value;
    }

    /**
     * Gets the value of the param8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the param8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParam8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParam8() {
        if (param8 == null) {
            param8 = new ArrayList<String>();
        }
        return this.param8;
    }

    /**
     * Gets the value of the param9 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParam9() {
        return param9;
    }

    /**
     * Sets the value of the param9 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setParam9(byte[] value) {
        this.param9 = value;
    }

}
