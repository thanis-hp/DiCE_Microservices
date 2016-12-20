//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.novaIdResetSwift;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiebelMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiebelMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfTmSwiftOrderIdReset" type="{http://www.siebel.com/xml/NovaIdResetSwift}ListOfTmSwiftOrderIdReset"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BusinessEvent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IntObjectFormat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IntObjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MessageId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiebelMessage", propOrder = {
    "listOfTmSwiftOrderIdReset"
})
public class SiebelMessage {

    @XmlElement(name = "ListOfTmSwiftOrderIdReset", required = true)
    protected ListOfTmSwiftOrderIdReset listOfTmSwiftOrderIdReset;
    @XmlAttribute(name = "BusinessEvent")
    protected String businessEvent;
    @XmlAttribute(name = "IntObjectFormat")
    protected String intObjectFormat;
    @XmlAttribute(name = "IntObjectName")
    protected String intObjectName;
    @XmlAttribute(name = "MessageId")
    protected String messageId;
    @XmlAttribute(name = "Timestamp")
    protected String timestamp;
    @XmlAttribute(name = "ErrorMessage")
    protected String errorMessage;
    @XmlAttribute(name = "ErrorCode")
    protected String errorCode;

    /**
     * Gets the value of the listOfTmSwiftOrderIdReset property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfTmSwiftOrderIdReset }
     *     
     */
    public ListOfTmSwiftOrderIdReset getListOfTmSwiftOrderIdReset() {
        return listOfTmSwiftOrderIdReset;
    }

    /**
     * Sets the value of the listOfTmSwiftOrderIdReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfTmSwiftOrderIdReset }
     *     
     */
    public void setListOfTmSwiftOrderIdReset(ListOfTmSwiftOrderIdReset value) {
        this.listOfTmSwiftOrderIdReset = value;
    }

    /**
     * Gets the value of the businessEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEvent() {
        return businessEvent;
    }

    /**
     * Sets the value of the businessEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEvent(String value) {
        this.businessEvent = value;
    }

    /**
     * Gets the value of the intObjectFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntObjectFormat() {
        return intObjectFormat;
    }

    /**
     * Sets the value of the intObjectFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntObjectFormat(String value) {
        this.intObjectFormat = value;
    }

    /**
     * Gets the value of the intObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntObjectName() {
        return intObjectName;
    }

    /**
     * Sets the value of the intObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntObjectName(String value) {
        this.intObjectName = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestamp(String value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

}
