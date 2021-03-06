//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.16 at 12:26:13 PM SGT 
//


package my.com.tm.dice.ipay.microservices.generated.customerprofileretrieve;

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
 *         &lt;element name="CustomerAccount" type="{http://hsbbportal.tm.com/xml/CustomerProfileRetrieve}CustomerAccount"/>
 *         &lt;element name="ConsumerDemographics" type="{http://hsbbportal.tm.com/xml/CustomerProfileRetrieve}ConsumerDemographics" minOccurs="0"/>
 *         &lt;element name="NonConsumerDemographics" type="{http://hsbbportal.tm.com/xml/CustomerProfileRetrieve}NonConsumerDemographics" minOccurs="0"/>
 *         &lt;element name="BillingList" type="{http://hsbbportal.tm.com/xml/CustomerProfileRetrieve}BillingList"/>
 *         &lt;element name="ContactList" type="{http://hsbbportal.tm.com/xml/CustomerProfileRetrieve}ContactList"/>
 *         &lt;element name="CommitmentPeriodList" type="{http://hsbbportal.tm.com/xml/CustomerProfileRetrieve}CommitmentPeriodList"/>
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
    "customerAccount",
    "consumerDemographics",
    "nonConsumerDemographics",
    "billingList",
    "contactList",
    "commitmentPeriodList"
})
public class Response {

    @XmlElement(name = "CustomerAccount", required = true)
    protected CustomerAccount customerAccount;
    @XmlElement(name = "ConsumerDemographics")
    protected ConsumerDemographics consumerDemographics;
    @XmlElement(name = "NonConsumerDemographics")
    protected NonConsumerDemographics nonConsumerDemographics;
    @XmlElement(name = "BillingList", required = true)
    protected BillingList billingList;
    @XmlElement(name = "ContactList", required = true)
    protected ContactList contactList;
    @XmlElement(name = "CommitmentPeriodList", required = true)
    protected CommitmentPeriodList commitmentPeriodList;

    /**
     * Gets the value of the customerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAccount }
     *     
     */
    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Sets the value of the customerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAccount }
     *     
     */
    public void setCustomerAccount(CustomerAccount value) {
        this.customerAccount = value;
    }

    /**
     * Gets the value of the consumerDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link ConsumerDemographics }
     *     
     */
    public ConsumerDemographics getConsumerDemographics() {
        return consumerDemographics;
    }

    /**
     * Sets the value of the consumerDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsumerDemographics }
     *     
     */
    public void setConsumerDemographics(ConsumerDemographics value) {
        this.consumerDemographics = value;
    }

    /**
     * Gets the value of the nonConsumerDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link NonConsumerDemographics }
     *     
     */
    public NonConsumerDemographics getNonConsumerDemographics() {
        return nonConsumerDemographics;
    }

    /**
     * Sets the value of the nonConsumerDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonConsumerDemographics }
     *     
     */
    public void setNonConsumerDemographics(NonConsumerDemographics value) {
        this.nonConsumerDemographics = value;
    }

    /**
     * Gets the value of the billingList property.
     * 
     * @return
     *     possible object is
     *     {@link BillingList }
     *     
     */
    public BillingList getBillingList() {
        return billingList;
    }

    /**
     * Sets the value of the billingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingList }
     *     
     */
    public void setBillingList(BillingList value) {
        this.billingList = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactList }
     *     
     */
    public ContactList getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactList }
     *     
     */
    public void setContactList(ContactList value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the commitmentPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentPeriodList }
     *     
     */
    public CommitmentPeriodList getCommitmentPeriodList() {
        return commitmentPeriodList;
    }

    /**
     * Sets the value of the commitmentPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentPeriodList }
     *     
     */
    public void setCommitmentPeriodList(CommitmentPeriodList value) {
        this.commitmentPeriodList = value;
    }

}
