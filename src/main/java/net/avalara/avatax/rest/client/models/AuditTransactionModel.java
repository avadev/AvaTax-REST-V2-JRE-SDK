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
 * Information about a previously created transaction
 */
public class AuditTransactionModel {


    private Int32? companyId;

    /**
     * Getter for companyId;
     * Unique ID number of the company that created this transaction
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * Unique ID number of the company that created this transaction
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private DateTime? serverTimestamp;

    /**
     * Getter for serverTimestamp;
     * Server timestamp, in UTC, of the date/time when the original transaction was created
     */
    public DateTime? getserverTimestamp() {;
        return this.serverTimestamp;;
    }

    /**
     * Setter for serverTimestamp;
     * Server timestamp, in UTC, of the date/time when the original transaction was created
     */
    public void setserverTimestamp(DateTime? value) {;
        this.serverTimestamp = value;;
    }


    private DateTime? serverDuration;

    /**
     * Getter for serverDuration;
     * Length of time the original API call took
     */
    public DateTime? getserverDuration() {;
        return this.serverDuration;;
    }

    /**
     * Setter for serverDuration;
     * Length of time the original API call took
     */
    public void setserverDuration(DateTime? value) {;
        this.serverDuration = value;;
    }


    private ApiCallStatus? apiCallStatus;

    /**
     * Getter for apiCallStatus;
     * api call status
     */
    public ApiCallStatus? getapiCallStatus() {;
        return this.apiCallStatus;;
    }

    /**
     * Setter for apiCallStatus;
     * api call status
     */
    public void setapiCallStatus(ApiCallStatus? value) {;
        this.apiCallStatus = value;;
    }


    private OriginalApiRequestResponseModel original;

    /**
     * Getter for original;
     * Original API request/response
     */
    public OriginalApiRequestResponseModel getoriginal() {;
        return this.original;;
    }

    /**
     * Setter for original;
     * Original API request/response
     */
    public void setoriginal(OriginalApiRequestResponseModel value) {;
        this.original = value;;
    }


    private ReconstructedApiRequestResponseModel reconstructed;

    /**
     * Getter for reconstructed;
     * Reconstructed API request/response
     */
    public ReconstructedApiRequestResponseModel getreconstructed() {;
        return this.reconstructed;;
    }

    /**
     * Setter for reconstructed;
     * Reconstructed API request/response
     */
    public void setreconstructed(ReconstructedApiRequestResponseModel value) {;
        this.reconstructed = value;;
    }


    /**
     * Returns a JSON string representation of AuditTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
