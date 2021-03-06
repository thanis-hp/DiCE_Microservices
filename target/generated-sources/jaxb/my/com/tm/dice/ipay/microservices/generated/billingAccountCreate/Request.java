//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.billingAccountCreate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Request">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourcePortal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerContactID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillCycle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillFrequency">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Monthly"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BillType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Detail"/>
 *               &lt;enumeration value="Summary"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PaymentType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Cash"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExchangePTT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SalesPTT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PriceList" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingEmailCC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingMobileNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillMedia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BillingAddress" type="{http://hsbbportal.tm.com/xml/BillingAccountCreateCRM}Address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Request", propOrder = {
    "sourcePortal",
    "customerAccountNo",
    "customerContactID",
    "billCycle",
    "billFrequency",
    "billType",
    "paymentType",
    "exchangePTT",
    "salesPTT",
    "currencyCode",
    "priceList",
    "billingName",
    "billingEmail",
    "billingEmailCC",
    "billingMobileNumber",
    "billMedia",
    "billLanguage",
    "billingAddress"
})
public class Request {

    @XmlElement(name = "SourcePortal", required = true)
    protected String sourcePortal;
    @XmlElement(name = "CustomerAccountNo", required = true)
    protected String customerAccountNo;
    @XmlElement(name = "CustomerContactID", required = true)
    protected String customerContactID;
    @XmlElement(name = "BillCycle", required = true)
    protected String billCycle;
    @XmlElement(name = "BillFrequency", required = true)
    protected String billFrequency;
    @XmlElement(name = "BillType", required = true)
    protected String billType;
    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
    @XmlElement(name = "ExchangePTT", required = true)
    protected String exchangePTT;
    @XmlElement(name = "SalesPTT", required = true)
    protected String salesPTT;
    @XmlElement(name = "CurrencyCode", required = true)
    protected String currencyCode;
    @XmlElement(name = "PriceList", required = true)
    protected String priceList;
    @XmlElement(name = "BillingName", required = true)
    protected String billingName;
    @XmlElement(name = "BillingEmail", required = true)
    protected String billingEmail;
    @XmlElement(name = "BillingEmailCC", required = true)
    protected String billingEmailCC;
    @XmlElement(name = "BillingMobileNumber", required = true)
    protected String billingMobileNumber;
    @XmlElement(name = "BillMedia", required = true)
    protected String billMedia;
    @XmlElement(name = "BillLanguage", required = true)
    protected String billLanguage;
    @XmlElement(name = "BillingAddress", required = true)
    protected Address billingAddress;

    /**
     * Gets the value of the sourcePortal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePortal() {
        return sourcePortal;
    }

    /**
     * Sets the value of the sourcePortal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePortal(String value) {
        this.sourcePortal = value;
    }

    /**
     * Gets the value of the customerAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountNo() {
        return customerAccountNo;
    }

    /**
     * Sets the value of the customerAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountNo(String value) {
        this.customerAccountNo = value;
    }

    /**
     * Gets the value of the customerContactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContactID() {
        return customerContactID;
    }

    /**
     * Sets the value of the customerContactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerContactID(String value) {
        this.customerContactID = value;
    }

    /**
     * Gets the value of the billCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycle() {
        return billCycle;
    }

    /**
     * Sets the value of the billCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycle(String value) {
        this.billCycle = value;
    }

    /**
     * Gets the value of the billFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillFrequency() {
        return billFrequency;
    }

    /**
     * Sets the value of the billFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillFrequency(String value) {
        this.billFrequency = value;
    }

    /**
     * Gets the value of the billType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillType() {
        return billType;
    }

    /**
     * Sets the value of the billType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillType(String value) {
        this.billType = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the exchangePTT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangePTT() {
        return exchangePTT;
    }

    /**
     * Sets the value of the exchangePTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangePTT(String value) {
        this.exchangePTT = value;
    }

    /**
     * Gets the value of the salesPTT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesPTT() {
        return salesPTT;
    }

    /**
     * Sets the value of the salesPTT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesPTT(String value) {
        this.salesPTT = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceList() {
        return priceList;
    }

    /**
     * Sets the value of the priceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceList(String value) {
        this.priceList = value;
    }

    /**
     * Gets the value of the billingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingName() {
        return billingName;
    }

    /**
     * Sets the value of the billingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingName(String value) {
        this.billingName = value;
    }

    /**
     * Gets the value of the billingEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEmail() {
        return billingEmail;
    }

    /**
     * Sets the value of the billingEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEmail(String value) {
        this.billingEmail = value;
    }

    /**
     * Gets the value of the billingEmailCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingEmailCC() {
        return billingEmailCC;
    }

    /**
     * Sets the value of the billingEmailCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingEmailCC(String value) {
        this.billingEmailCC = value;
    }

    /**
     * Gets the value of the billingMobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMobileNumber() {
        return billingMobileNumber;
    }

    /**
     * Sets the value of the billingMobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMobileNumber(String value) {
        this.billingMobileNumber = value;
    }

    /**
     * Gets the value of the billMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillMedia() {
        return billMedia;
    }

    /**
     * Sets the value of the billMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillMedia(String value) {
        this.billMedia = value;
    }

    /**
     * Gets the value of the billLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillLanguage() {
        return billLanguage;
    }

    /**
     * Sets the value of the billLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillLanguage(String value) {
        this.billLanguage = value;
    }

    /**
     * Gets the value of the billingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

}
