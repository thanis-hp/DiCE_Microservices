//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.validatefraudcamsaccount;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmCamsAccountVbc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmCamsAccountVbc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BANumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BlacklistType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CPBR" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DelinquentAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmCamsAccountVbc", propOrder = {
    "customerID",
    "baNumber",
    "blacklistType",
    "cpbr",
    "delinquentAmount"
})
public class TmCamsAccountVbc {

    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "BANumber", required = true)
    protected String baNumber;
    @XmlElement(name = "BlacklistType", required = true)
    protected String blacklistType;
    @XmlElement(name = "CPBR", required = true)
    protected String cpbr;
    @XmlElement(name = "DelinquentAmount", required = true)
    protected String delinquentAmount;

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the baNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBANumber() {
        return baNumber;
    }

    /**
     * Sets the value of the baNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBANumber(String value) {
        this.baNumber = value;
    }

    /**
     * Gets the value of the blacklistType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlacklistType() {
        return blacklistType;
    }

    /**
     * Sets the value of the blacklistType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlacklistType(String value) {
        this.blacklistType = value;
    }

    /**
     * Gets the value of the cpbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPBR() {
        return cpbr;
    }

    /**
     * Sets the value of the cpbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPBR(String value) {
        this.cpbr = value;
    }

    /**
     * Gets the value of the delinquentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelinquentAmount() {
        return delinquentAmount;
    }

    /**
     * Sets the value of the delinquentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelinquentAmount(String value) {
        this.delinquentAmount = value;
    }

}
