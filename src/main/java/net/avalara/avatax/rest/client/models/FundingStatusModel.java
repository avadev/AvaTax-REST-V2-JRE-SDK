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


    private Int64? requestId;

    /**
     * Getter for requestId;
     * The unique ID number of this funding request
     */
    public Int64? getrequestId() {;
        return this.requestId;;
    }

    /**
     * Setter for requestId;
     * The unique ID number of this funding request
     */
    public void setrequestId(Int64? value) {;
        this.requestId = value;;
    }


    private Int32? subledgerProfileID;

    /**
     * Getter for subledgerProfileID;
     * SubledgerProfileID
     */
    public Int32? getsubledgerProfileID() {;
        return this.subledgerProfileID;;
    }

    /**
     * Setter for subledgerProfileID;
     * SubledgerProfileID
     */
    public void setsubledgerProfileID(Int32? value) {;
        this.subledgerProfileID = value;;
    }


    private String companyID;

    /**
     * Getter for companyID;
     * CompanyID
     */
    public String getcompanyID() {;
        return this.companyID;;
    }

    /**
     * Setter for companyID;
     * CompanyID
     */
    public void setcompanyID(String value) {;
        this.companyID = value;;
    }


    private String domain;

    /**
     * Getter for domain;
     * Domain
     */
    public String getdomain() {;
        return this.domain;;
    }

    /**
     * Setter for domain;
     * Domain
     */
    public void setdomain(String value) {;
        this.domain = value;;
    }


    private String recipient;

    /**
     * Getter for recipient;
     * Recipient
     */
    public String getrecipient() {;
        return this.recipient;;
    }

    /**
     * Setter for recipient;
     * Recipient
     */
    public void setrecipient(String value) {;
        this.recipient = value;;
    }


    private String sender;

    /**
     * Getter for sender;
     * Sender
     */
    public String getsender() {;
        return this.sender;;
    }

    /**
     * Setter for sender;
     * Sender
     */
    public void setsender(String value) {;
        this.sender = value;;
    }


    private String documentKey;

    /**
     * Getter for documentKey;
     * DocumentKey
     */
    public String getdocumentKey() {;
        return this.documentKey;;
    }

    /**
     * Setter for documentKey;
     * DocumentKey
     */
    public void setdocumentKey(String value) {;
        this.documentKey = value;;
    }


    private String documentType;

    /**
     * Getter for documentType;
     * DocumentType
     */
    public String getdocumentType() {;
        return this.documentType;;
    }

    /**
     * Setter for documentType;
     * DocumentType
     */
    public void setdocumentType(String value) {;
        this.documentType = value;;
    }


    private String documentName;

    /**
     * Getter for documentName;
     * DocumentName
     */
    public String getdocumentName() {;
        return this.documentName;;
    }

    /**
     * Setter for documentName;
     * DocumentName
     */
    public void setdocumentName(String value) {;
        this.documentName = value;;
    }


    private FundingESignMethodReturn methodReturn;

    /**
     * Getter for methodReturn;
     * MethodReturn
     */
    public FundingESignMethodReturn getmethodReturn() {;
        return this.methodReturn;;
    }

    /**
     * Setter for methodReturn;
     * MethodReturn
     */
    public void setmethodReturn(FundingESignMethodReturn value) {;
        this.methodReturn = value;;
    }


    private String status;

    /**
     * Getter for status;
     * Status
     */
    public String getstatus() {;
        return this.status;;
    }

    /**
     * Setter for status;
     * Status
     */
    public void setstatus(String value) {;
        this.status = value;;
    }


    private String errorMessage;

    /**
     * Getter for errorMessage;
     * ErrorMessage
     */
    public String geterrorMessage() {;
        return this.errorMessage;;
    }

    /**
     * Setter for errorMessage;
     * ErrorMessage
     */
    public void seterrorMessage(String value) {;
        this.errorMessage = value;;
    }


    private DateTime? lastPolled;

    /**
     * Getter for lastPolled;
     * LastPolled
     */
    public DateTime? getlastPolled() {;
        return this.lastPolled;;
    }

    /**
     * Setter for lastPolled;
     * LastPolled
     */
    public void setlastPolled(DateTime? value) {;
        this.lastPolled = value;;
    }


    private DateTime? lastSigned;

    /**
     * Getter for lastSigned;
     * LastSigned
     */
    public DateTime? getlastSigned() {;
        return this.lastSigned;;
    }

    /**
     * Setter for lastSigned;
     * LastSigned
     */
    public void setlastSigned(DateTime? value) {;
        this.lastSigned = value;;
    }


    private DateTime? lastActivated;

    /**
     * Getter for lastActivated;
     * LastActivated
     */
    public DateTime? getlastActivated() {;
        return this.lastActivated;;
    }

    /**
     * Setter for lastActivated;
     * LastActivated
     */
    public void setlastActivated(DateTime? value) {;
        this.lastActivated = value;;
    }


    private Int64? templateRequestId;

    /**
     * Getter for templateRequestId;
     * TemplateRequestId
     */
    public Int64? gettemplateRequestId() {;
        return this.templateRequestId;;
    }

    /**
     * Setter for templateRequestId;
     * TemplateRequestId
     */
    public void settemplateRequestId(Int64? value) {;
        this.templateRequestId = value;;
    }


    /**
     * Returns a JSON string representation of FundingStatusModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
