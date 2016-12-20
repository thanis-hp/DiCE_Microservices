package my.com.tm.dice.ipay.microservices.util;

/**
 * A static class that has the list of XML/XSD specific Strings in one place so it's easy to manage.
 * 
 * All xml namespaces go here.They are in class file and not in properties file because changing them will break stuff and we want people to
 * realize that changing this breaks things. <br>
 * 1. Any changes here should be driven by the changes in the corresponding XSDs. <br>
 * 2. Hence should result in new java classes getting generated from JAXB. <br>
 * 3. Hence you should have a compilation error, most likely. <br>
 * 4. So, this should be the last place you should be changing it. <br>
 * <br>
 * Naming convention
 * <ul>
 * <li><code>NS</code> - Namespace</li>
 * <li><code>RE</code> - Root Element.</li>
 * <li><code>BE</code> - Business Event
 * </ul>
 * 
 * 
 * @author prabharangopalan
 * 
 */
public class EaiXmlConstants {

    private EaiXmlConstants() {
        // prevent instantiation. This is meant to be accessed statically.
    }

    public static final String NS_SERVICE_POINT_CREATE = "http://hsbbportal.tm.com/xml/ServicePointCreateR2";
    public static final String BE_SERVICE_POINT_CREATE = "ServicePointCreate";
    public static final String RE_SERVICE_POINT_CREATE = "PortalMessage";

    public static final String NS_SIEBEL_ADDRESS_CREATE = "";
    public static final String BE_SIEBEL_ADDRESS_CREATE = "";
    public static final String RE_SIEBEL_ADDRESS_CREATE = "";

    public static final String NS_SIEBEL_ADDRESS_RETRIEVE = "";
    public static final String BE_SIEBEL_ADDRESS_RETRIEVE = "";
    public static final String RE_SIEBEL_ADDRESS_RETRIEVE = "";

    public static final String NS_SERVICEABILITY_CHECK = "";
    public static final String BE_SERVICEABILITY_CHECK = "ServiceabilityCheck";
    public static final String RE_SERVICEABILITY_CHECK = "SiebelMessage";

    public static final String NS_RESOURCEABILITY_CHECK = "";
    public static final String BE_RESOURCEABILITY_CHECK = "ResourceAvailabilityCheck";
    public static final String RE_RESOURCEABILITY_CHECK = "SiebelMessage";

    public static final String INT_OBJECT_FORMAT = "PORTAL";
    public static final String INT_OBJECT_NAME = "PORTAL";
    public static final String MSG_TYPE = "PORTAL";

    public static final String REQUEST = "Request";
    public static final String TM_SERVICE_INSTANCE_ID = "PORTAL";
}
