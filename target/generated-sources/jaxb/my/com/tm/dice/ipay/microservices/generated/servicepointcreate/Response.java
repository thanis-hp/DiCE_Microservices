//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.servicepointcreate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServicePointId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceAddressRowId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServicePointInstanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReservationId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "status",
    "servicePointId",
    "serviceAddressRowId",
    "servicePointInstanceId",
    "reservationId"
})
public class Response {

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "ServicePointId", required = true)
    protected String servicePointId;
    @XmlElement(name = "ServiceAddressRowId", required = true)
    protected String serviceAddressRowId;
    @XmlElement(name = "ServicePointInstanceId", required = true)
    protected String servicePointInstanceId;
    @XmlElement(name = "ReservationId", required = true)
    protected String reservationId;

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
     * Gets the value of the servicePointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePointId() {
        return servicePointId;
    }

    /**
     * Sets the value of the servicePointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePointId(String value) {
        this.servicePointId = value;
    }

    /**
     * Gets the value of the serviceAddressRowId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAddressRowId() {
        return serviceAddressRowId;
    }

    /**
     * Sets the value of the serviceAddressRowId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAddressRowId(String value) {
        this.serviceAddressRowId = value;
    }

    /**
     * Gets the value of the servicePointInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePointInstanceId() {
        return servicePointInstanceId;
    }

    /**
     * Sets the value of the servicePointInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePointInstanceId(String value) {
        this.servicePointInstanceId = value;
    }

    /**
     * Gets the value of the reservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationId() {
        return reservationId;
    }

    /**
     * Sets the value of the reservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationId(String value) {
        this.reservationId = value;
    }

}