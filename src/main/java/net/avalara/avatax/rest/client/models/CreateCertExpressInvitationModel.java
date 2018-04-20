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
public class CreateCertExpressInvitationModel {


    private String recipient;

    /**
     * Getter for recipient
     *
     * If the value of `deliveryMethod` is set to `Email`, please specify the email address of the recipient 
    * for the request.
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Setter for recipient
     *
     * If the value of `deliveryMethod` is set to `Email`, please specify the email address of the recipient 
    * for the request.
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }


    private String coverLetterTitle;

    /**
     * Getter for coverLetterTitle
     *
     * If this invitation is sent via email or download, please specify the cover letter to use when building this
    * invitation. For a list of cover letters, please call `ListCoverLetters`.
     */
    public String getCoverLetterTitle() {
        return this.coverLetterTitle;
    }

    /**
     * Setter for coverLetterTitle
     *
     * If this invitation is sent via email or download, please specify the cover letter to use when building this
    * invitation. For a list of cover letters, please call `ListCoverLetters`.
     */
    public void setCoverLetterTitle(String value) {
        this.coverLetterTitle = value;
    }


    private ArrayList<Integer> exposureZones;

    /**
     * Getter for exposureZones
     *
     * You may optionally specify a list of exposure zones to request in this CertExpress invitation. If you list 
    * more than one exposure zone, the customer will be prompted to provide an exemption certificate for each one. 
    * If you do not provide a list of exposure zones, the customer will be prompted to select an exposure zone.
    * 
    * For a list of available exposure zones, please call `ListCertificateExposureZones`.
     */
    public ArrayList<Integer> getExposureZones() {
        return this.exposureZones;
    }

    /**
     * Setter for exposureZones
     *
     * You may optionally specify a list of exposure zones to request in this CertExpress invitation. If you list 
    * more than one exposure zone, the customer will be prompted to provide an exemption certificate for each one. 
    * If you do not provide a list of exposure zones, the customer will be prompted to select an exposure zone.
    * 
    * For a list of available exposure zones, please call `ListCertificateExposureZones`.
     */
    public void setExposureZones(ArrayList<Integer> value) {
        this.exposureZones = value;
    }


    private ArrayList<Integer> exemptReasons;

    /**
     * Getter for exemptReasons
     *
     * You may optionally specify a list of exemption reasons to pre-populate in this CertExpress invitation.
    * If you list exemption reasons, the customer will have part of their form already filled in when they visit
    * the CertExpress website. 
    * 
    * For a list of available exemption reasons, please call `ListCertificateExemptReasons`.
     */
    public ArrayList<Integer> getExemptReasons() {
        return this.exemptReasons;
    }

    /**
     * Setter for exemptReasons
     *
     * You may optionally specify a list of exemption reasons to pre-populate in this CertExpress invitation.
    * If you list exemption reasons, the customer will have part of their form already filled in when they visit
    * the CertExpress website. 
    * 
    * For a list of available exemption reasons, please call `ListCertificateExemptReasons`.
     */
    public void setExemptReasons(ArrayList<Integer> value) {
        this.exemptReasons = value;
    }


    private CertificateRequestDeliveryMethod deliveryMethod;

    /**
     * Getter for deliveryMethod
     *
     * Specify the type of invitation. CertExpress invitations can be delivered via email, web link, or
    * facsimile. 
    * 
    * * If you specify `Email`, the invitation will be delivered via email. Please ask the customer to ensure that 
    * * If you specify `Fax`, the invitation will be sent via fax to the customer's fax number on file.
    * * If you specify `Download`, the invitation will be prepared as a web link that you can display to the customer.
     */
    public CertificateRequestDeliveryMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    /**
     * Setter for deliveryMethod
     *
     * Specify the type of invitation. CertExpress invitations can be delivered via email, web link, or
    * facsimile. 
    * 
    * * If you specify `Email`, the invitation will be delivered via email. Please ask the customer to ensure that 
    * * If you specify `Fax`, the invitation will be sent via fax to the customer's fax number on file.
    * * If you specify `Download`, the invitation will be prepared as a web link that you can display to the customer.
     */
    public void setDeliveryMethod(CertificateRequestDeliveryMethod value) {
        this.deliveryMethod = value;
    }


    /**
     * Returns a JSON string representation of CreateCertExpressInvitationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
