//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.novaIdResetSwift;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the my.com.tm.microservices.generated.novaIdResetSwift package. 
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

    private final static QName _SiebelMessage_QNAME = new QName("http://www.siebel.com/xml/NovaIdResetSwift", "SiebelMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: my.com.tm.microservices.generated.novaIdResetSwift
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SiebelMessage }
     * 
     */
    public SiebelMessage createSiebelMessage() {
        return new SiebelMessage();
    }

    /**
     * Create an instance of {@link ListOfTmSwiftOrderIdReset }
     * 
     */
    public ListOfTmSwiftOrderIdReset createListOfTmSwiftOrderIdReset() {
        return new ListOfTmSwiftOrderIdReset();
    }

    /**
     * Create an instance of {@link ListOfTmOrderEntryOrdersIntegration }
     * 
     */
    public ListOfTmOrderEntryOrdersIntegration createListOfTmOrderEntryOrdersIntegration() {
        return new ListOfTmOrderEntryOrdersIntegration();
    }

    /**
     * Create an instance of {@link TmActionIntegration }
     * 
     */
    public TmActionIntegration createTmActionIntegration() {
        return new TmActionIntegration();
    }

    /**
     * Create an instance of {@link TmOrderEntryOrdersIntegration }
     * 
     */
    public TmOrderEntryOrdersIntegration createTmOrderEntryOrdersIntegration() {
        return new TmOrderEntryOrdersIntegration();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiebelMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.siebel.com/xml/NovaIdResetSwift", name = "SiebelMessage")
    public JAXBElement<SiebelMessage> createSiebelMessage(SiebelMessage value) {
        return new JAXBElement<SiebelMessage>(_SiebelMessage_QNAME, SiebelMessage.class, null, value);
    }

}
