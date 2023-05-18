
package mn.gov.xyp.citizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatisticMigrantProvinceDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatisticMigrantProvinceDetailData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="all" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arhangai" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bayanhongor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bayanulgii" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bulgan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="darhanuul" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dornod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dornogobi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dundgobi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gobisumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="govialtai" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="khentii" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="khovd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="khuvsgul" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orhon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="selenge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sukhbaatar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tuv" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ulaanbaatar" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="umnugobi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uvs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uvurhangai" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="zavhan" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStatisticMigrantProvinceDetailData", propOrder = {
    "aimagCityName",
    "all",
    "arhangai",
    "bayanhongor",
    "bayanulgii",
    "bulgan",
    "darhanuul",
    "dornod",
    "dornogobi",
    "dundgobi",
    "gobisumber",
    "govialtai",
    "khentii",
    "khovd",
    "khuvsgul",
    "orhon",
    "selenge",
    "sukhbaatar",
    "tuv",
    "ulaanbaatar",
    "umnugobi",
    "uvs",
    "uvurhangai",
    "zavhan"
})
public class CitizenStatisticMigrantProvinceDetailData {

    protected String aimagCityName;
    protected int all;
    protected int arhangai;
    protected int bayanhongor;
    protected int bayanulgii;
    protected int bulgan;
    protected int darhanuul;
    protected int dornod;
    protected int dornogobi;
    protected int dundgobi;
    protected int gobisumber;
    protected int govialtai;
    protected int khentii;
    protected int khovd;
    protected int khuvsgul;
    protected int orhon;
    protected int selenge;
    protected int sukhbaatar;
    protected int tuv;
    protected int ulaanbaatar;
    protected int umnugobi;
    protected int uvs;
    protected int uvurhangai;
    protected int zavhan;

    /**
     * Gets the value of the aimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityName() {
        return aimagCityName;
    }

    /**
     * Sets the value of the aimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityName(String value) {
        this.aimagCityName = value;
    }

    /**
     * Gets the value of the all property.
     * 
     */
    public int getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     */
    public void setAll(int value) {
        this.all = value;
    }

    /**
     * Gets the value of the arhangai property.
     * 
     */
    public int getArhangai() {
        return arhangai;
    }

    /**
     * Sets the value of the arhangai property.
     * 
     */
    public void setArhangai(int value) {
        this.arhangai = value;
    }

    /**
     * Gets the value of the bayanhongor property.
     * 
     */
    public int getBayanhongor() {
        return bayanhongor;
    }

    /**
     * Sets the value of the bayanhongor property.
     * 
     */
    public void setBayanhongor(int value) {
        this.bayanhongor = value;
    }

    /**
     * Gets the value of the bayanulgii property.
     * 
     */
    public int getBayanulgii() {
        return bayanulgii;
    }

    /**
     * Sets the value of the bayanulgii property.
     * 
     */
    public void setBayanulgii(int value) {
        this.bayanulgii = value;
    }

    /**
     * Gets the value of the bulgan property.
     * 
     */
    public int getBulgan() {
        return bulgan;
    }

    /**
     * Sets the value of the bulgan property.
     * 
     */
    public void setBulgan(int value) {
        this.bulgan = value;
    }

    /**
     * Gets the value of the darhanuul property.
     * 
     */
    public int getDarhanuul() {
        return darhanuul;
    }

    /**
     * Sets the value of the darhanuul property.
     * 
     */
    public void setDarhanuul(int value) {
        this.darhanuul = value;
    }

    /**
     * Gets the value of the dornod property.
     * 
     */
    public int getDornod() {
        return dornod;
    }

    /**
     * Sets the value of the dornod property.
     * 
     */
    public void setDornod(int value) {
        this.dornod = value;
    }

    /**
     * Gets the value of the dornogobi property.
     * 
     */
    public int getDornogobi() {
        return dornogobi;
    }

    /**
     * Sets the value of the dornogobi property.
     * 
     */
    public void setDornogobi(int value) {
        this.dornogobi = value;
    }

    /**
     * Gets the value of the dundgobi property.
     * 
     */
    public int getDundgobi() {
        return dundgobi;
    }

    /**
     * Sets the value of the dundgobi property.
     * 
     */
    public void setDundgobi(int value) {
        this.dundgobi = value;
    }

    /**
     * Gets the value of the gobisumber property.
     * 
     */
    public int getGobisumber() {
        return gobisumber;
    }

    /**
     * Sets the value of the gobisumber property.
     * 
     */
    public void setGobisumber(int value) {
        this.gobisumber = value;
    }

    /**
     * Gets the value of the govialtai property.
     * 
     */
    public int getGovialtai() {
        return govialtai;
    }

    /**
     * Sets the value of the govialtai property.
     * 
     */
    public void setGovialtai(int value) {
        this.govialtai = value;
    }

    /**
     * Gets the value of the khentii property.
     * 
     */
    public int getKhentii() {
        return khentii;
    }

    /**
     * Sets the value of the khentii property.
     * 
     */
    public void setKhentii(int value) {
        this.khentii = value;
    }

    /**
     * Gets the value of the khovd property.
     * 
     */
    public int getKhovd() {
        return khovd;
    }

    /**
     * Sets the value of the khovd property.
     * 
     */
    public void setKhovd(int value) {
        this.khovd = value;
    }

    /**
     * Gets the value of the khuvsgul property.
     * 
     */
    public int getKhuvsgul() {
        return khuvsgul;
    }

    /**
     * Sets the value of the khuvsgul property.
     * 
     */
    public void setKhuvsgul(int value) {
        this.khuvsgul = value;
    }

    /**
     * Gets the value of the orhon property.
     * 
     */
    public int getOrhon() {
        return orhon;
    }

    /**
     * Sets the value of the orhon property.
     * 
     */
    public void setOrhon(int value) {
        this.orhon = value;
    }

    /**
     * Gets the value of the selenge property.
     * 
     */
    public int getSelenge() {
        return selenge;
    }

    /**
     * Sets the value of the selenge property.
     * 
     */
    public void setSelenge(int value) {
        this.selenge = value;
    }

    /**
     * Gets the value of the sukhbaatar property.
     * 
     */
    public int getSukhbaatar() {
        return sukhbaatar;
    }

    /**
     * Sets the value of the sukhbaatar property.
     * 
     */
    public void setSukhbaatar(int value) {
        this.sukhbaatar = value;
    }

    /**
     * Gets the value of the tuv property.
     * 
     */
    public int getTuv() {
        return tuv;
    }

    /**
     * Sets the value of the tuv property.
     * 
     */
    public void setTuv(int value) {
        this.tuv = value;
    }

    /**
     * Gets the value of the ulaanbaatar property.
     * 
     */
    public int getUlaanbaatar() {
        return ulaanbaatar;
    }

    /**
     * Sets the value of the ulaanbaatar property.
     * 
     */
    public void setUlaanbaatar(int value) {
        this.ulaanbaatar = value;
    }

    /**
     * Gets the value of the umnugobi property.
     * 
     */
    public int getUmnugobi() {
        return umnugobi;
    }

    /**
     * Sets the value of the umnugobi property.
     * 
     */
    public void setUmnugobi(int value) {
        this.umnugobi = value;
    }

    /**
     * Gets the value of the uvs property.
     * 
     */
    public int getUvs() {
        return uvs;
    }

    /**
     * Sets the value of the uvs property.
     * 
     */
    public void setUvs(int value) {
        this.uvs = value;
    }

    /**
     * Gets the value of the uvurhangai property.
     * 
     */
    public int getUvurhangai() {
        return uvurhangai;
    }

    /**
     * Sets the value of the uvurhangai property.
     * 
     */
    public void setUvurhangai(int value) {
        this.uvurhangai = value;
    }

    /**
     * Gets the value of the zavhan property.
     * 
     */
    public int getZavhan() {
        return zavhan;
    }

    /**
     * Sets the value of the zavhan property.
     * 
     */
    public void setZavhan(int value) {
        this.zavhan = value;
    }

}
