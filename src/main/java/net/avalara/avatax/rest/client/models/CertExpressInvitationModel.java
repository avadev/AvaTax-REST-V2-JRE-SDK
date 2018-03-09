package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents an invitation for a customer to use CertExpress to self-report their own certificates.
* This invitation is delivered by your choice of method, or you can present a hyperlink to the user
* directly in your connector. Your customer will be redirected to https://app.certexpress.com/ where
* they can follow a step-by-step guide to enter information about their exemption certificates. The
* certificates entered will be recorded and automatically linked to their customer record.
 */
public class CertExpressInvitationModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this CertExpress invitation.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this CertExpress invitation.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the AvaTax company that sent this invitation.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the AvaTax company that sent this invitation.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private String recipient;

    /**
     * Getter for recipient
     *
     * The email address to which this invitation was sent. If this invitation was presented as a weblink, this value will be null.
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Setter for recipient
     *
     * The email address to which this invitation was sent. If this invitation was presented as a weblink, this value will be null.
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }


    private String customerCode;

    /**
     * Getter for customerCode
     *
     * The unique code of the customer that received this invitation.
    * Note: This field is case sensitive. To have exemption certificates apply, this value should
    * be the same as the one passed to create a customer.
     */
    public String getCustomerCode() {
        return this.customerCode;
    }

    /**
     * Setter for customerCode
     *
     * The unique code of the customer that received this invitation.
    * Note: This field is case sensitive. To have exemption certificates apply, this value should
    * be the same as the one passed to create a customer.
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }


    private CustomerModel customer;

    /**
     * Getter for customer
     *
     * The customer who received this invitation.
     */
    public CustomerModel getCustomer() {
        return this.customer;
    }

    /**
     * Setter for customer
     *
     * The customer who received this invitation.
     */
    public void setCustomer(CustomerModel value) {
        this.customer = value;
    }


    private CoverLetterModel coverLetter;

    /**
     * Getter for coverLetter
     *
     * The attached cover letter object to this request.
     */
    public CoverLetterModel getCoverLetter() {
        return this.coverLetter;
    }

    /**
     * Setter for coverLetter
     *
     * The attached cover letter object to this request.
     */
    public void setCoverLetter(CoverLetterModel value) {
        this.coverLetter = value;
    }


    private String emailStatus;

    /**
     * Getter for emailStatus
     *
     * The status of the emails associated with this invitation. If this invitation was sent via email,
    * this value will change to `Sent` when the email message has been sent.
     */
    public String getEmailStatus() {
        return this.emailStatus;
    }

    /**
     * Setter for emailStatus
     *
     * The status of the emails associated with this invitation. If this invitation was sent via email,
    * this value will change to `Sent` when the email message has been sent.
     */
    public void setEmailStatus(String value) {
        this.emailStatus = value;
    }


    private Boolean coverLettersOnly;

    /**
     * Getter for coverLettersOnly
     *
     * True if this invitation contained a cover letter only.
     */
    public Boolean getCoverLettersOnly() {
        return this.coverLettersOnly;
    }

    /**
     * Setter for coverLettersOnly
     *
     * True if this invitation contained a cover letter only.
     */
    public void setCoverLettersOnly(Boolean value) {
        this.coverLettersOnly = value;
    }


    private ArrayList<Integer> exposureZones;

    /**
     * Getter for exposureZones
     *
     * When an invitation is sent, it contains a list of exposure zones for which the customer is invited to upload
    * their exemption certificates. This list contains the ID numbers of the exposure zones identified.
    * 
    * For a list of exposure zones, please call `ListCertificateExposureZones`.
     */
    public ArrayList<Integer> getExposureZones() {
        return this.exposureZones;
    }

    /**
     * Setter for exposureZones
     *
     * When an invitation is sent, it contains a list of exposure zones for which the customer is invited to upload
    * their exemption certificates. This list contains the ID numbers of the exposure zones identified.
    * 
    * For a list of exposure zones, please call `ListCertificateExposureZones`.
     */
    public void setExposureZones(ArrayList<Integer> value) {
        this.exposureZones = value;
    }


    private ArrayList<Integer> exemptReasons;

    /**
     * Getter for exemptReasons
     *
     * The list of exemption reasons identified by this CertExpress invitation.
    * 
    * For a list of reason codes, please call `ListCertificateExemptReasons`.
     */
    public ArrayList<Integer> getExemptReasons() {
        return this.exemptReasons;
    }

    /**
     * Setter for exemptReasons
     *
     * The list of exemption reasons identified by this CertExpress invitation.
    * 
    * For a list of reason codes, please call `ListCertificateExemptReasons`.
     */
    public void setExemptReasons(ArrayList<Integer> value) {
        this.exemptReasons = value;
    }


    private CertificateRequestDeliveryMethod deliveryMethod;

    /**
     * Getter for deliveryMethod
     *
     * Indicates the method that was used to deliver this CertExpress invitation.
     */
    public CertificateRequestDeliveryMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /**
     * Setter for deliveryMethod
     *
     * Indicates the method that was used to deliver this CertExpress invitation.
     */
    public void setDeliveryMethod(CertificateRequestDeliveryMethod value) {
        this.deliveryMethod = value;
    }


    private String message;

    /**
     * Getter for message
     *
     * The custom message delivered with this invitation.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The custom message delivered with this invitation.
     */
    public void setMessage(String value) {
        this.message = value;
    }


    private Date date;

    /**
     * Getter for date
     *
     * The date of the invitation.
     */
    public Date getDate() {
        return this.date;
    }

    /**
     * Setter for date
     *
     * The date of the invitation.
     */
    public void setDate(Date value) {
        this.date = value;
    }


    private String requestLink;

    /**
     * Getter for requestLink
     *
     * The web link (URL) that a customer can click on or visit to begin using this CertExpress invitation. 
    * 
    * This value is only usable if the status of this invitation is `Ready` and the request was created with type `Download`.
     */
    public String getRequestLink() {
        return this.requestLink;
    }

    /**
     * Setter for requestLink
     *
     * The web link (URL) that a customer can click on or visit to begin using this CertExpress invitation. 
    * 
    * This value is only usable if the status of this invitation is `Ready` and the request was created with type `Download`.
     */
    public void setRequestLink(String value) {
        this.requestLink = value;
    }


    /**
     * Returns a JSON string representation of CertExpressInvitationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
