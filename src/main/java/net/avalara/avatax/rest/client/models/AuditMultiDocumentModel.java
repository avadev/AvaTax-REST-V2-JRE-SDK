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
 * Information about a previously created MultiDocument transaction
 */
public class AuditMultiDocumentModel {


    private ReconstructedMultiDocumentModel reconstructed;

    /**
     * Getter for reconstructed
     *
     * Reconstructed API request/response pair that can be used to adjust or re-create this MultiDocument transaction.
     */
    public ReconstructedMultiDocumentModel getReconstructed() {
        return this.reconstructed;
    }

    /**
     * Setter for reconstructed
     *
     * Reconstructed API request/response pair that can be used to adjust or re-create this MultiDocument transaction.
     */
    public void setReconstructed(ReconstructedMultiDocumentModel value) {
        this.reconstructed = value;
    }


    private String code;

    /**
     * Getter for code
     *
     * Represents the unique code of this MultiDocument transaction.
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Represents the unique code of this MultiDocument transaction.
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private DocumentType type;

    /**
     * Getter for type
     *
     * Represents the document type of this MultiDocument transaction. For more information about
    * document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/).
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Represents the document type of this MultiDocument transaction. For more information about
    * document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/).
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private Date serverTimestamp;

    /**
     * Getter for serverTimestamp
     *
     * Server timestamp, in UTC, of the date/time when the original transaction was created
     */
    public Date getServerTimestamp() {
        return this.serverTimestamp;
    }

    /**
     * Setter for serverTimestamp
     *
     * Server timestamp, in UTC, of the date/time when the original transaction was created
     */
    public void setServerTimestamp(Date value) {
        this.serverTimestamp = value;
    }


    private Date serverDuration;

    /**
     * Getter for serverDuration
     *
     * Length of time the original API call took
     */
    public Date getServerDuration() {
        return this.serverDuration;
    }

    /**
     * Setter for serverDuration
     *
     * Length of time the original API call took
     */
    public void setServerDuration(Date value) {
        this.serverDuration = value;
    }


    private ApiCallStatus apiCallStatus;

    /**
     * Getter for apiCallStatus
     *
     * api call status
     */
    public ApiCallStatus getApiCallStatus() {
        return this.apiCallStatus;
    }

    /**
     * Setter for apiCallStatus
     *
     * api call status
     */
    public void setApiCallStatus(ApiCallStatus value) {
        this.apiCallStatus = value;
    }


    private OriginalApiRequestResponseModel original;

    /**
     * Getter for original
     *
     * Original API request/response
     */
    public OriginalApiRequestResponseModel getOriginal() {
        return this.original;
    }

    /**
     * Setter for original
     *
     * Original API request/response
     */
    public void setOriginal(OriginalApiRequestResponseModel value) {
        this.original = value;
    }


    /**
     * Returns a JSON string representation of AuditMultiDocumentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
