//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.resourcereserve;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfTmPrevExtendedXaIntegration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfTmPrevExtendedXaIntegration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TmPrevExtendedXaIntegration" type="{http://www.siebel.com/xml/TMResourceReserveCheck}TmPrevExtendedXaIntegration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfTmPrevExtendedXaIntegration", propOrder = {
    "tmPrevExtendedXaIntegration"
})
public class ListOfTmPrevExtendedXaIntegration {

    @XmlElement(name = "TmPrevExtendedXaIntegration")
    protected List<TmPrevExtendedXaIntegration> tmPrevExtendedXaIntegration;

    /**
     * Gets the value of the tmPrevExtendedXaIntegration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmPrevExtendedXaIntegration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmPrevExtendedXaIntegration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TmPrevExtendedXaIntegration }
     * 
     * 
     */
    public List<TmPrevExtendedXaIntegration> getTmPrevExtendedXaIntegration() {
        if (tmPrevExtendedXaIntegration == null) {
            tmPrevExtendedXaIntegration = new ArrayList<TmPrevExtendedXaIntegration>();
        }
        return this.tmPrevExtendedXaIntegration;
    }

}
