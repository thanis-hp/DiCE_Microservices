//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.sbladdressretrieve;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.com.tm.microservices.generated.sbladdressretrieve package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PortalMessage_QNAME = new QName("http://hsbbportal.tm.com/xml/SBLAddressRetrieve", "PortalMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.com.tm.microservices.generated.sbladdressretrieve
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link PortalMessage }
     * 
     */
    public PortalMessage createPortalMessage() {
        return new PortalMessage();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Request }
     * 
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link OrderList }
     * 
     */
    public OrderList createOrderList() {
        return new OrderList();
    }

    /**
     * Create an instance of {@link Response.SiebelAddress }
     * 
     */
    public Response.SiebelAddress createResponseSiebelAddress() {
        return new Response.SiebelAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://hsbbportal.tm.com/xml/SBLAddressRetrieve", name = "PortalMessage")
    public JAXBElement<PortalMessage> createPortalMessage(PortalMessage value) {
        return new JAXBElement<PortalMessage>(_PortalMessage_QNAME, PortalMessage.class, null, value);
    }

}
