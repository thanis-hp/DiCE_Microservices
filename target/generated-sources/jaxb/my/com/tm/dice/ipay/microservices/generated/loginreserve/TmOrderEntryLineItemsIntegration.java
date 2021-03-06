//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.loginreserve;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmOrderEntry-LineItemsIntegration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmOrderEntry-LineItemsIntegration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TMServiceIDType" type="{http://www.siebel.com/xml/TMLoginReserveUnreserve}string30" minOccurs="0"/>
 *         &lt;element name="TMSecondaryServiceId" type="{http://www.siebel.com/xml/TMLoginReserveUnreserve}string100" minOccurs="0"/>
 *         &lt;element name="OrderLineItemId" type="{http://www.siebel.com/xml/TMLoginReserveUnreserve}string30"/>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemStatus" type="{http://www.siebel.com/xml/TMLoginReserveUnreserve}string30" minOccurs="0"/>
 *         &lt;element name="OrderHeaderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Product" type="{http://www.siebel.com/xml/TMLoginReserveUnreserve}string50" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.siebel.com/xml/TMLoginReserveUnreserve}string100" minOccurs="0"/>
 *         &lt;element name="TMMessageCodeExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMReservationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmOrderEntry-LineItemsIntegration", propOrder = {
    "tmServiceIDType",
    "tmSecondaryServiceId",
    "orderLineItemId",
    "accountId",
    "itemStatus",
    "orderHeaderId",
    "product",
    "serviceId",
    "tmMessageCodeExt",
    "tmReservationStatus"
})
public class TmOrderEntryLineItemsIntegration {

    @XmlElement(name = "TMServiceIDType")
    protected String tmServiceIDType;
    @XmlElement(name = "TMSecondaryServiceId")
    protected String tmSecondaryServiceId;
    @XmlElement(name = "OrderLineItemId", required = true)
    protected String orderLineItemId;
    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "ItemStatus")
    protected String itemStatus;
    @XmlElement(name = "OrderHeaderId", required = true)
    protected String orderHeaderId;
    @XmlElement(name = "Product")
    protected String product;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "TMMessageCodeExt")
    protected String tmMessageCodeExt;
    @XmlElement(name = "TMReservationStatus")
    protected String tmReservationStatus;

    /**
     * Gets the value of the tmServiceIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMServiceIDType() {
        return tmServiceIDType;
    }

    /**
     * Sets the value of the tmServiceIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMServiceIDType(String value) {
        this.tmServiceIDType = value;
    }

    /**
     * Gets the value of the tmSecondaryServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSecondaryServiceId() {
        return tmSecondaryServiceId;
    }

    /**
     * Sets the value of the tmSecondaryServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSecondaryServiceId(String value) {
        this.tmSecondaryServiceId = value;
    }

    /**
     * Gets the value of the orderLineItemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderLineItemId() {
        return orderLineItemId;
    }

    /**
     * Sets the value of the orderLineItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderLineItemId(String value) {
        this.orderLineItemId = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the itemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemStatus() {
        return itemStatus;
    }

    /**
     * Sets the value of the itemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemStatus(String value) {
        this.itemStatus = value;
    }

    /**
     * Gets the value of the orderHeaderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sets the value of the orderHeaderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderHeaderId(String value) {
        this.orderHeaderId = value;
    }

    /**
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduct(String value) {
        this.product = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the tmMessageCodeExt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMMessageCodeExt() {
        return tmMessageCodeExt;
    }

    /**
     * Sets the value of the tmMessageCodeExt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMMessageCodeExt(String value) {
        this.tmMessageCodeExt = value;
    }

    /**
     * Gets the value of the tmReservationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMReservationStatus() {
        return tmReservationStatus;
    }

    /**
     * Sets the value of the tmReservationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMReservationStatus(String value) {
        this.tmReservationStatus = value;
    }

}
