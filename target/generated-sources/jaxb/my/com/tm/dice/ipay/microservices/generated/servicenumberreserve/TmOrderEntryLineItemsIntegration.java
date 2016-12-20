//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.servicenumberreserve;

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
 *         &lt;element name="TMSecondaryServiceId" type="{http://www.siebel.com/xml/TMServiceNumberReserve}string100" minOccurs="0"/>
 *         &lt;element name="OrderLineItemId" type="{http://www.siebel.com/xml/TMServiceNumberReserve}string30"/>
 *         &lt;element name="ItemStatus" type="{http://www.siebel.com/xml/TMServiceNumberReserve}string30" minOccurs="0"/>
 *         &lt;element name="ServiceId" type="{http://www.siebel.com/xml/TMServiceNumberReserve}string100" minOccurs="0"/>
 *         &lt;element name="TMMessageCodeExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMReservationStatus" type="{http://www.siebel.com/xml/TMServiceNumberReserve}string30" minOccurs="0"/>
 *         &lt;element name="TMServicePointReservationId" type="{http://www.siebel.com/xml/TMServiceNumberReserve}string30" minOccurs="0"/>
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
    "tmSecondaryServiceId",
    "orderLineItemId",
    "itemStatus",
    "serviceId",
    "tmMessageCodeExt",
    "tmReservationStatus",
    "tmServicePointReservationId"
})
public class TmOrderEntryLineItemsIntegration {

    @XmlElement(name = "TMSecondaryServiceId")
    protected String tmSecondaryServiceId;
    @XmlElement(name = "OrderLineItemId", required = true)
    protected String orderLineItemId;
    @XmlElement(name = "ItemStatus")
    protected String itemStatus;
    @XmlElement(name = "ServiceId")
    protected String serviceId;
    @XmlElement(name = "TMMessageCodeExt")
    protected String tmMessageCodeExt;
    @XmlElement(name = "TMReservationStatus")
    protected String tmReservationStatus;
    @XmlElement(name = "TMServicePointReservationId")
    protected String tmServicePointReservationId;

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

    /**
     * Gets the value of the tmServicePointReservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMServicePointReservationId() {
        return tmServicePointReservationId;
    }

    /**
     * Sets the value of the tmServicePointReservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMServicePointReservationId(String value) {
        this.tmServicePointReservationId = value;
    }

}