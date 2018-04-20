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
 * Information about a previously created transaction
 */
public class AuditTransactionModel {


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * Unique ID number of the company that created this transaction
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * Unique ID number of the company that created this transaction
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private ReconstructedApiRequestResponseModel reconstructed;

    /**
     * Getter for reconstructed
     *
     * Reconstructed API request/response
     */
    public ReconstructedApiRequestResponseModel getReconstructed() {
        return this.reconstructed;
    }

    /**
     * Setter for reconstructed
     *
     * Reconstructed API request/response
     */
    public void setReconstructed(ReconstructedApiRequestResponseModel value) {
        this.reconstructed = value;
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
     * Returns a JSON string representation of AuditTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
