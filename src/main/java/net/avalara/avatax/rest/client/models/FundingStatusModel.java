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


    private String companyID;

    /**
     * Getter for companyID
     *
     * CompanyID
     */
    public String getCompanyID() {
        return this.companyID;
    }

    /**
     * Setter for companyID
     *
     * CompanyID
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }


    private String domain;

    /**
     * Getter for domain
     *
     * Domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Setter for domain
     *
     * Domain
     */
    public void setDomain(String value) {
        this.domain = value;
    }


    private String recipient;

    /**
     * Getter for recipient
     *
     * Recipient
     */
    public String getRecipient() {
        return this.recipient;
    }

    /**
     * Setter for recipient
     *
     * Recipient
     */
    public void setRecipient(String value) {
        this.recipient = value;
    }


    private String sender;

    /**
     * Getter for sender
     *
     * Sender
     */
    public String getSender() {
        return this.sender;
    }

    /**
     * Setter for sender
     *
     * Sender
     */
    public void setSender(String value) {
        this.sender = value;
    }


    private String documentKey;

    /**
     * Getter for documentKey
     *
     * DocumentKey
     */
    public String getDocumentKey() {
        return this.documentKey;
    }

    /**
     * Setter for documentKey
     *
     * DocumentKey
     */
    public void setDocumentKey(String value) {
        this.documentKey = value;
    }


    private String documentType;

    /**
     * Getter for documentType
     *
     * DocumentType
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType
     *
     * DocumentType
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }


    private String documentName;

    /**
     * Getter for documentName
     *
     * DocumentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * Setter for documentName
     *
     * DocumentName
     */
    public void setDocumentName(String value) {
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


    private String status;

    /**
     * Getter for status
     *
     * Status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * Status
     */
    public void setStatus(String value) {
        this.status = value;
    }


    private String errorMessage;

    /**
     * Getter for errorMessage
     *
     * ErrorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage
     *
     * ErrorMessage
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }


    private Date lastPolled;

    /**
     * Getter for lastPolled
     *
     * LastPolled
     */
    public Date getLastPolled() {
        return this.lastPolled;
    }

    /**
     * Setter for lastPolled
     *
     * LastPolled
     */
    public void setLastPolled(Date value) {
        this.lastPolled = value;
    }


    private Date lastSigned;

    /**
     * Getter for lastSigned
     *
     * LastSigned
     */
    public Date getLastSigned() {
        return this.lastSigned;
    }

    /**
     * Setter for lastSigned
     *
     * LastSigned
     */
    public void setLastSigned(Date value) {
        this.lastSigned = value;
    }


    private Date lastActivated;

    /**
     * Getter for lastActivated
     *
     * LastActivated
     */
    public Date getLastActivated() {
        return this.lastActivated;
    }

    /**
     * Setter for lastActivated
     *
     * LastActivated
     */
    public void setLastActivated(Date value) {
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
