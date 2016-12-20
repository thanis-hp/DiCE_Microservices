//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.bookinginfosendswift;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmCutAssetMgmt-ServiceMeterIntegration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmCutAssetMgmt-ServiceMeterIntegration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServicePointInstanceId" type="{http://www.siebel.com/xml/TMOrderCreateNew}string30" minOccurs="0"/>
 *         &lt;element name="InstallDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServicePointId" type="{http://www.siebel.com/xml/TMOrderCreateNew}string100" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{http://www.siebel.com/xml/TMOrderCreateNew}string30" minOccurs="0"/>
 *         &lt;element name="Status2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMReservationId" type="{http://www.siebel.com/xml/TMOrderCreateNew}string30" minOccurs="0"/>
 *         &lt;element name="UninstallDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMBTUCollectionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMEquipmentManufacturer" type="{http://www.siebel.com/xml/TMOrderCreateNew}string50" minOccurs="0"/>
 *         &lt;element name="TMEquipmentModel" type="{http://www.siebel.com/xml/TMOrderCreateNew}string50" minOccurs="0"/>
 *         &lt;element name="TMNewBTUFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TMServiceInstanceId" type="{http://www.siebel.com/xml/TMOrderCreateNew}string30" minOccurs="0"/>
 *         &lt;element name="TMMACAddress" type="{http://www.siebel.com/xml/TMOrderCreateNew}string50" minOccurs="0"/>
 *         &lt;element name="ListOfTmAssetMgmt-AssetXaIntegration" type="{http://www.siebel.com/xml/TMOrderCreateNew}ListOfTmAssetMgmt-AssetXaIntegration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmCutAssetMgmt-ServiceMeterIntegration", propOrder = {
    "servicePointInstanceId",
    "installDate",
    "productName",
    "servicePointId",
    "serviceType",
    "status2",
    "tmReservationId",
    "uninstallDate",
    "tmbtuCollectionFlag",
    "tmEquipmentManufacturer",
    "tmEquipmentModel",
    "tmNewBTUFlag",
    "tmServiceInstanceId",
    "tmmacAddress",
    "listOfTmAssetMgmtAssetXaIntegration"
})
public class TmCutAssetMgmtServiceMeterIntegration {

    @XmlElement(name = "ServicePointInstanceId")
    protected String servicePointInstanceId;
    @XmlElement(name = "InstallDate")
    protected String installDate;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "ServicePointId")
    protected String servicePointId;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "Status2")
    protected String status2;
    @XmlElement(name = "TMReservationId")
    protected String tmReservationId;
    @XmlElement(name = "UninstallDate")
    protected String uninstallDate;
    @XmlElement(name = "TMBTUCollectionFlag")
    protected String tmbtuCollectionFlag;
    @XmlElement(name = "TMEquipmentManufacturer")
    protected String tmEquipmentManufacturer;
    @XmlElement(name = "TMEquipmentModel")
    protected String tmEquipmentModel;
    @XmlElement(name = "TMNewBTUFlag")
    protected String tmNewBTUFlag;
    @XmlElement(name = "TMServiceInstanceId")
    protected String tmServiceInstanceId;
    @XmlElement(name = "TMMACAddress")
    protected String tmmacAddress;
    @XmlElement(name = "ListOfTmAssetMgmt-AssetXaIntegration")
    protected ListOfTmAssetMgmtAssetXaIntegration listOfTmAssetMgmtAssetXaIntegration;

    /**
     * Gets the value of the servicePointInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePointInstanceId() {
        return servicePointInstanceId;
    }

    /**
     * Sets the value of the servicePointInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePointInstanceId(String value) {
        this.servicePointInstanceId = value;
    }

    /**
     * Gets the value of the installDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallDate() {
        return installDate;
    }

    /**
     * Sets the value of the installDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallDate(String value) {
        this.installDate = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the servicePointId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePointId() {
        return servicePointId;
    }

    /**
     * Sets the value of the servicePointId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePointId(String value) {
        this.servicePointId = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the status2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus2() {
        return status2;
    }

    /**
     * Sets the value of the status2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus2(String value) {
        this.status2 = value;
    }

    /**
     * Gets the value of the tmReservationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMReservationId() {
        return tmReservationId;
    }

    /**
     * Sets the value of the tmReservationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMReservationId(String value) {
        this.tmReservationId = value;
    }

    /**
     * Gets the value of the uninstallDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUninstallDate() {
        return uninstallDate;
    }

    /**
     * Sets the value of the uninstallDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUninstallDate(String value) {
        this.uninstallDate = value;
    }

    /**
     * Gets the value of the tmbtuCollectionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMBTUCollectionFlag() {
        return tmbtuCollectionFlag;
    }

    /**
     * Sets the value of the tmbtuCollectionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMBTUCollectionFlag(String value) {
        this.tmbtuCollectionFlag = value;
    }

    /**
     * Gets the value of the tmEquipmentManufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMEquipmentManufacturer() {
        return tmEquipmentManufacturer;
    }

    /**
     * Sets the value of the tmEquipmentManufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMEquipmentManufacturer(String value) {
        this.tmEquipmentManufacturer = value;
    }

    /**
     * Gets the value of the tmEquipmentModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMEquipmentModel() {
        return tmEquipmentModel;
    }

    /**
     * Sets the value of the tmEquipmentModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMEquipmentModel(String value) {
        this.tmEquipmentModel = value;
    }

    /**
     * Gets the value of the tmNewBTUFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMNewBTUFlag() {
        return tmNewBTUFlag;
    }

    /**
     * Sets the value of the tmNewBTUFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMNewBTUFlag(String value) {
        this.tmNewBTUFlag = value;
    }

    /**
     * Gets the value of the tmServiceInstanceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMServiceInstanceId() {
        return tmServiceInstanceId;
    }

    /**
     * Sets the value of the tmServiceInstanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMServiceInstanceId(String value) {
        this.tmServiceInstanceId = value;
    }

    /**
     * Gets the value of the tmmacAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMMACAddress() {
        return tmmacAddress;
    }

    /**
     * Sets the value of the tmmacAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMMACAddress(String value) {
        this.tmmacAddress = value;
    }

    /**
     * Gets the value of the listOfTmAssetMgmtAssetXaIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfTmAssetMgmtAssetXaIntegration }
     *     
     */
    public ListOfTmAssetMgmtAssetXaIntegration getListOfTmAssetMgmtAssetXaIntegration() {
        return listOfTmAssetMgmtAssetXaIntegration;
    }

    /**
     * Sets the value of the listOfTmAssetMgmtAssetXaIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfTmAssetMgmtAssetXaIntegration }
     *     
     */
    public void setListOfTmAssetMgmtAssetXaIntegration(ListOfTmAssetMgmtAssetXaIntegration value) {
        this.listOfTmAssetMgmtAssetXaIntegration = value;
    }

}