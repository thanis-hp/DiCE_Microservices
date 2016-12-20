package my.com.tm.dice.ipay.microservices.util.jaxb;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.UnmarshallerHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.sax.SAXSource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import com.sun.xml.bind.marshaller.XMLWriter;

@Component
public class JaxbMarshalUtil {

    Logger logger = Logger.getLogger(JaxbMarshalUtil.class);
    @Autowired
    private Jaxb2Marshaller jaxbMarshaller;

    public <T> T unmarshal(String sXml, String namespace, Class<T> outputObjectType) throws JAXBException, SAXException {
        logger.debug("Unmarshaling  " + sXml + " \n with namespace " + namespace);
        Unmarshaller u = JAXBContext.newInstance(outputObjectType).createUnmarshaller();
        XMLReader reader = XMLReaderFactory.createXMLReader();

        NamespaceFilter inFilter = new NamespaceFilter(namespace, true);
        inFilter.setParent(reader);

        InputSource is = new InputSource(new StringReader(sXml));
        SAXSource source = new SAXSource(inFilter, is);
        JAXBElement<T> myJaxbObject = u.unmarshal(source, outputObjectType);
        return myJaxbObject.getValue();

    }

    public <T> T unmarshalWithObjFactory(String sXml, String namespace, Class<T> outputObjectType, Class objectFactoryClass) throws JAXBException,
            SAXException {
        InputSource inputSource = new InputSource(new StringReader(sXml));
        JAXBContext context = JAXBContext.newInstance(objectFactoryClass);
        UnmarshallerHandler unmarshallerHandler = context.createUnmarshaller().getUnmarshallerHandler();

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        saxParserFactory.setNamespaceAware(true);
        SAXParser saxParser = null;
        try {
            saxParser = saxParserFactory.newSAXParser();
            XMLReader xmlReader = saxParser.getXMLReader();

            XMLFilter namespacefilter = new NamespaceFilter(namespace, true);
            namespacefilter.setParent(xmlReader);
            namespacefilter.setContentHandler(unmarshallerHandler);

            namespacefilter.parse(inputSource);
        } catch (ParserConfigurationException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        } catch (IOException e) {
            logger.error(ExceptionUtils.getStackTrace(e));
        }

        JAXBElement<T> obj = (JAXBElement<T>) unmarshallerHandler.getResult();
        return obj.getValue();
    }

    /**
     * Unmarshals the given string to an XML of type specificed by the outputObjectType parameter. Useful when the incoming xml is without
     * any namespace declaration and {@link JaxbMarshalUtil#unmarshal(String, String, Class)} method behaves weirdly (have seen that happen
     * a couple of times with some sample xmls, not sure why)
     * 
     * @param sXml
     * @param elementToStartUnmarshal
     * @param outputObjectType
     * @return the object that resulted from the umarshalling, or <code>null</code> if any of the input is empty or null.
     * @throws JAXBException
     *             - if the input string can't be umarshalled successfully.
     */
    public <T> T unmarshalFullObjGraph(String sXml, String elementToStartUnmarshal, Class<T> outputObjectType) throws JAXBException {
        if (StringUtils.isEmpty(sXml) || StringUtils.isEmpty(elementToStartUnmarshal) || outputObjectType == null) {
            return null;
        }
        logger.debug("Unmarshaling  " + sXml);
        JAXBElement<T> myJaxbObject = null;
        XMLInputFactory xif = XMLInputFactory.newInstance();
        XMLStreamReader xmlReader;
        try {
            xmlReader = xif.createXMLStreamReader(new StringReader(sXml));
            int event = 0;
            // here we advance to next tag untill we find node that matches the
            // elementToStartUnmarshal
            for (event = xmlReader.next(); event != XMLStreamReader.END_DOCUMENT; event = xmlReader.next()) {
                if (event == XMLStreamReader.START_ELEMENT) {
                    logger.debug(xmlReader.getLocalName() + "--" + elementToStartUnmarshal);
                    if (xmlReader.getLocalName().equals(elementToStartUnmarshal)) {
                        logger.debug("Found the root element to unmarshal. Proceeding to do some xml-y stuff.");
                        break;
                    }
                }
            }
            if (event != XMLStreamReader.END_DOCUMENT) {
                JAXBContext jaxbContext = JAXBContext.newInstance(outputObjectType);
                myJaxbObject = jaxbContext.createUnmarshaller().unmarshal(xmlReader, outputObjectType);
            }
        } catch (XMLStreamException e) {
            throw new JAXBException("The input string is either not well-formed or there was a processing error " + e.getMessage());
        }
        return myJaxbObject == null ? null : myJaxbObject.getValue();
    }

    public String marshal(@SuppressWarnings("rawtypes") JAXBElement input) throws JAXBException {
        Marshaller m = jaxbMarshaller.getJaxbContext().createMarshaller();
        m.setProperty(Marshaller.JAXB_FRAGMENT, true);
        NamespaceFilter outFilter = new NamespaceFilter(null, false);
        StringWriter sWriter = new StringWriter();
        XMLWriter writer = new XMLWriter(sWriter, "UTF-8");
        outFilter.setContentHandler(writer);
        m.marshal(input, outFilter);
        logger.debug("Marshaled output " + sWriter.toString());
        return sWriter.toString();
    }

    public String marshalWithXmlNs(@SuppressWarnings("rawtypes") JAXBElement input) throws JAXBException {
        Marshaller m = jaxbMarshaller.getJaxbContext().createMarshaller();
        m.setProperty(Marshaller.JAXB_FRAGMENT, true);
        NamespaceFilter outFilter = new NamespaceFilter(null, false);
        StringWriter sWriter = new StringWriter();
        XMLWriter writer = new XMLWriter(sWriter, "UTF-8");
        outFilter.setContentHandler(writer);
        m.marshal(input, outFilter);
        logger.debug("Marshaled output " + sWriter.toString());
        return sWriter.toString();
    }

}
