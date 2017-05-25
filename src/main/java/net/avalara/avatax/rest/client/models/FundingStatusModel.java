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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Status of an Avalara Managed Returns funding configuration for a company
 */
public class FundingStatusModel {


    private Long requestId;

    /**
     * Getter for requestId
     *
     * The unique ID number of this funding request
     */
    public Long getRequestId() {
        return this.requestId;
    }

    /**
     * Setter for requestId
     *
     * The unique ID number of this funding request
     */
    public void setRequestId(Long value) {
        this.requestId = value;
    }


    private Integer subledgerProfileID;

    /**
     * Getter for subledgerProfileID
     *
     * SubledgerProfileID
     */
    public Integer getSubledgerProfileID() {
        return this.subledgerProfileID;
    }

    /**
     * Setter for subledgerProfileID
     *
     * SubledgerProfileID
     */
    public void setSubledgerProfileID(Integer value) {
        this.subledgerProfileID = value;
    }


    private string companyID;

    /**
     * Getter for companyID
     *
     * CompanyID
     */
    public string getCompanyID() {
        return this.companyID;
    }

    /**
     * Setter for companyID
     *
     * CompanyID
     */
    public void setCompanyID(string value) {
        this.companyID = value;
    }


    private string domain;

    /**
     * Getter for domain
     *
     * Domain
     */
    public string getDomain() {
        return this.domain;
    }

    /**
     * Setter for domain
     *
     * Domain
     */
    public void setDomain(string value) {
        this.domain = value;
    }


    private string recipient;

    /**
     * Getter for recipient
     *
     * Recipient
     */
    public string getRecipient() {
        return this.recipient;
    }

    /**
     * Setter for recipient
     *
     * Recipient
     */
    public void setRecipient(string value) {
        this.recipient = value;
    }


    private string sender;

    /**
     * Getter for sender
     *
     * Sender
     */
    public string getSender() {
        return this.sender;
    }

    /**
     * Setter for sender
     *
     * Sender
     */
    public void setSender(string value) {
        this.sender = value;
    }


    private string documentKey;

    /**
     * Getter for documentKey
     *
     * DocumentKey
     */
    public string getDocumentKey() {
        return this.documentKey;
    }

    /**
     * Setter for documentKey
     *
     * DocumentKey
     */
    public void setDocumentKey(string value) {
        this.documentKey = value;
    }


    private string documentType;

    /**
     * Getter for documentType
     *
     * DocumentType
     */
    public string getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType
     *
     * DocumentType
     */
    public void setDocumentType(string value) {
        this.documentType = value;
    }


    private string documentName;

    /**
     * Getter for documentName
     *
     * DocumentName
     */
    public string getDocumentName() {
        return this.documentName;
    }

    /**
     * Setter for documentName
     *
     * DocumentName
     */
    public void setDocumentName(string value) {
        this.documentName = value;
    }


    private FundingESignMethodReturn methodReturn;

    /**
     * Getter for methodReturn
     *
     * MethodReturn
     */
    public FundingESignMethodReturn getMethodReturn() {
        return this.methodReturn;
    }

    /**
     * Setter for methodReturn
     *
     * MethodReturn
     */
    public void setMethodReturn(FundingESignMethodReturn value) {
        this.methodReturn = value;
    }


    private string status;

    /**
     * Getter for status
     *
     * Status
     */
    public string getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * Status
     */
    public void setStatus(string value) {
        this.status = value;
    }


    private string errorMessage;

    /**
     * Getter for errorMessage
     *
     * ErrorMessage
     */
    public string getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage
     *
     * ErrorMessage
     */
    public void setErrorMessage(string value) {
        this.errorMessage = value;
    }


    private Instant lastPolled;

    /**
     * Getter for lastPolled
     *
     * LastPolled
     */
    public Instant getLastPolled() {
        return this.lastPolled;
    }

    /**
     * Setter for lastPolled
     *
     * LastPolled
     */
    public void setLastPolled(Instant value) {
        this.lastPolled = value;
    }


    private Instant lastSigned;

    /**
     * Getter for lastSigned
     *
     * LastSigned
     */
    public Instant getLastSigned() {
        return this.lastSigned;
    }

    /**
     * Setter for lastSigned
     *
     * LastSigned
     */
    public void setLastSigned(Instant value) {
        this.lastSigned = value;
    }


    private Instant lastActivated;

    /**
     * Getter for lastActivated
     *
     * LastActivated
     */
    public Instant getLastActivated() {
        return this.lastActivated;
    }

    /**
     * Setter for lastActivated
     *
     * LastActivated
     */
    public void setLastActivated(Instant value) {
        this.lastActivated = value;
    }


    private Long templateRequestId;

    /**
     * Getter for templateRequestId
     *
     * TemplateRequestId
     */
    public Long getTemplateRequestId() {
        return this.templateRequestId;
    }

    /**
     * Setter for templateRequestId
     *
     * TemplateRequestId
     */
    public void setTemplateRequestId(Long value) {
        this.templateRequestId = value;
    }


    /**
     * Returns a JSON string representation of FundingStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
