//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.appointmentCreateSbl;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ActivityInformation" type="{http://hsbbportal.tm.com/xml/SWIFTAppointmentCreateSbl}ActivityInformation" maxOccurs="unbounded" minOccurs="0"/>
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
    "activityInformation"
})
public class Response {

    @XmlElement(name = "ActivityInformation")
    protected List<ActivityInformation> activityInformation;

    /**
     * Gets the value of the activityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityInformation }
     * 
     * 
     */
    public List<ActivityInformation> getActivityInformation() {
        if (activityInformation == null) {
            activityInformation = new ArrayList<ActivityInformation>();
        }
        return this.activityInformation;
    }

}
