//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.resourcereserve;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmPrevExtendedXaIntegration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmPrevExtendedXaIntegration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TMPrevExtendedAttributeValue" type="{http://www.siebel.com/xml/TMResourceReserveCheck}string100" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmPrevExtendedXaIntegration", propOrder = {
    "tmPrevExtendedAttributeValue"
})
public class TmPrevExtendedXaIntegration {

    @XmlElement(name = "TMPrevExtendedAttributeValue")
    protected String tmPrevExtendedAttributeValue;

    /**
     * Gets the value of the tmPrevExtendedAttributeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMPrevExtendedAttributeValue() {
        return tmPrevExtendedAttributeValue;
    }

    /**
     * Sets the value of the tmPrevExtendedAttributeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMPrevExtendedAttributeValue(String value) {
        this.tmPrevExtendedAttributeValue = value;
    }

}
