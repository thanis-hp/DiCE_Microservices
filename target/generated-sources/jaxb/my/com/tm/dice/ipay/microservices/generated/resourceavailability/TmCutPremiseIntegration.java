//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.resourceavailability;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TmCutPremiseIntegration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TmCutPremiseIntegration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string50"/>
 *         &lt;element name="Country" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="StreetAddress2" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string100" minOccurs="0"/>
 *         &lt;element name="ApartmentNumber" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="AddressId" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="StreetAddress" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string100"/>
 *         &lt;element name="TMBuildingName" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string100" minOccurs="0"/>
 *         &lt;element name="TMFloorNo" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string100" minOccurs="0"/>
 *         &lt;element name="TMStreetType" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="TMNISAddressId" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}string30" minOccurs="0"/>
 *         &lt;element name="ListOfTmCutAssetMgmt-ServiceMeterIntegration" type="{http://www.siebel.com/xml/TMResourceAvailabilityCheck}ListOfTmCutAssetMgmt-ServiceMeterIntegration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TmCutPremiseIntegration", propOrder = {
    "id",
    "city",
    "country",
    "postalCode",
    "state",
    "streetAddress2",
    "apartmentNumber",
    "addressId",
    "streetAddress",
    "tmBuildingName",
    "tmFloorNo",
    "tmStreetType",
    "tmnisAddressId",
    "listOfTmCutAssetMgmtServiceMeterIntegration"
})
public class TmCutPremiseIntegration {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "City", required = true)
    protected String city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "StreetAddress2")
    protected String streetAddress2;
    @XmlElement(name = "ApartmentNumber")
    protected String apartmentNumber;
    @XmlElement(name = "AddressId")
    protected String addressId;
    @XmlElement(name = "StreetAddress", required = true)
    protected String streetAddress;
    @XmlElement(name = "TMBuildingName")
    protected String tmBuildingName;
    @XmlElement(name = "TMFloorNo")
    protected String tmFloorNo;
    @XmlElement(name = "TMStreetType")
    protected String tmStreetType;
    @XmlElement(name = "TMNISAddressId")
    protected String tmnisAddressId;
    @XmlElement(name = "ListOfTmCutAssetMgmt-ServiceMeterIntegration")
    protected ListOfTmCutAssetMgmtServiceMeterIntegration listOfTmCutAssetMgmtServiceMeterIntegration;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the streetAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress2() {
        return streetAddress2;
    }

    /**
     * Sets the value of the streetAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress2(String value) {
        this.streetAddress2 = value;
    }

    /**
     * Gets the value of the apartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNumber() {
        return apartmentNumber;
    }

    /**
     * Sets the value of the apartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNumber(String value) {
        this.apartmentNumber = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressId(String value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the streetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * Sets the value of the streetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetAddress(String value) {
        this.streetAddress = value;
    }

    /**
     * Gets the value of the tmBuildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMBuildingName() {
        return tmBuildingName;
    }

    /**
     * Sets the value of the tmBuildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMBuildingName(String value) {
        this.tmBuildingName = value;
    }

    /**
     * Gets the value of the tmFloorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMFloorNo() {
        return tmFloorNo;
    }

    /**
     * Sets the value of the tmFloorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMFloorNo(String value) {
        this.tmFloorNo = value;
    }

    /**
     * Gets the value of the tmStreetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMStreetType() {
        return tmStreetType;
    }

    /**
     * Sets the value of the tmStreetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMStreetType(String value) {
        this.tmStreetType = value;
    }

    /**
     * Gets the value of the tmnisAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMNISAddressId() {
        return tmnisAddressId;
    }

    /**
     * Sets the value of the tmnisAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMNISAddressId(String value) {
        this.tmnisAddressId = value;
    }

    /**
     * Gets the value of the listOfTmCutAssetMgmtServiceMeterIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfTmCutAssetMgmtServiceMeterIntegration }
     *     
     */
    public ListOfTmCutAssetMgmtServiceMeterIntegration getListOfTmCutAssetMgmtServiceMeterIntegration() {
        return listOfTmCutAssetMgmtServiceMeterIntegration;
    }

    /**
     * Sets the value of the listOfTmCutAssetMgmtServiceMeterIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfTmCutAssetMgmtServiceMeterIntegration }
     *     
     */
    public void setListOfTmCutAssetMgmtServiceMeterIntegration(ListOfTmCutAssetMgmtServiceMeterIntegration value) {
        this.listOfTmCutAssetMgmtServiceMeterIntegration = value;
    }

}
