//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.bookinginfosendswift;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfTmOrderCreateNew complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfTmOrderCreateNew">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TmOrderEntry-OrdersIntegration" type="{http://www.siebel.com/xml/TMOrderCreateNew}TmOrderEntry-OrdersIntegration" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfTmOrderCreateNew", propOrder = {
    "tmOrderEntryOrdersIntegration"
})
public class ListOfTmOrderCreateNew {

    @XmlElement(name = "TmOrderEntry-OrdersIntegration")
    protected List<TmOrderEntryOrdersIntegration> tmOrderEntryOrdersIntegration;

    /**
     * Gets the value of the tmOrderEntryOrdersIntegration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tmOrderEntryOrdersIntegration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmOrderEntryOrdersIntegration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TmOrderEntryOrdersIntegration }
     * 
     * 
     */
    public List<TmOrderEntryOrdersIntegration> getTmOrderEntryOrdersIntegration() {
        if (tmOrderEntryOrdersIntegration == null) {
            tmOrderEntryOrdersIntegration = new ArrayList<TmOrderEntryOrdersIntegration>();
        }
        return this.tmOrderEntryOrdersIntegration;
    }

}
