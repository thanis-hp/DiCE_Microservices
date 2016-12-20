//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.sblopenordercheck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackagePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourcePortal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomerAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppointmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderList", propOrder = {
    "orderID",
    "createDate",
    "orderType",
    "status",
    "packagePlan",
    "sourcePortal",
    "customerAccountName",
    "appointmentDate"
})
public class OrderList {

    @XmlElement(name = "OrderID", required = true)
    protected String orderID;
    @XmlElement(name = "CreateDate")
    protected String createDate;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "PackagePlan")
    protected String packagePlan;
    @XmlElement(name = "SourcePortal", required = true)
    protected String sourcePortal;
    @XmlElement(name = "CustomerAccountName", required = true)
    protected String customerAccountName;
    @XmlElement(name = "AppointmentDate")
    protected String appointmentDate;

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the packagePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackagePlan() {
        return packagePlan;
    }

    /**
     * Sets the value of the packagePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackagePlan(String value) {
        this.packagePlan = value;
    }

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
     * Gets the value of the customerAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountName() {
        return customerAccountName;
    }

    /**
     * Sets the value of the customerAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountName(String value) {
        this.customerAccountName = value;
    }

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentDate(String value) {
        this.appointmentDate = value;
    }

}
