//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.appointmentAvailablity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppointmentAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppointmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EarliestStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LatestStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RNORegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentAvailability", propOrder = {
    "appointmentID",
    "earliestStartDate",
    "latestStartDate",
    "rnoRegion",
    "addressIndicator"
})
public class AppointmentAvailability {

    @XmlElement(name = "AppointmentID")
    protected String appointmentID;
    @XmlElement(name = "EarliestStartDate")
    protected String earliestStartDate;
    @XmlElement(name = "LatestStartDate")
    protected String latestStartDate;
    @XmlElement(name = "RNORegion")
    protected String rnoRegion;
    @XmlElement(name = "AddressIndicator")
    protected String addressIndicator;

    /**
     * Gets the value of the appointmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentID() {
        return appointmentID;
    }

    /**
     * Sets the value of the appointmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentID(String value) {
        this.appointmentID = value;
    }

    /**
     * Gets the value of the earliestStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEarliestStartDate() {
        return earliestStartDate;
    }

    /**
     * Sets the value of the earliestStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestStartDate(String value) {
        this.earliestStartDate = value;
    }

    /**
     * Gets the value of the latestStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatestStartDate() {
        return latestStartDate;
    }

    /**
     * Sets the value of the latestStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestStartDate(String value) {
        this.latestStartDate = value;
    }

    /**
     * Gets the value of the rnoRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNORegion() {
        return rnoRegion;
    }

    /**
     * Sets the value of the rnoRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNORegion(String value) {
        this.rnoRegion = value;
    }

    /**
     * Gets the value of the addressIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressIndicator() {
        return addressIndicator;
    }

    /**
     * Sets the value of the addressIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressIndicator(String value) {
        this.addressIndicator = value;
    }

}
