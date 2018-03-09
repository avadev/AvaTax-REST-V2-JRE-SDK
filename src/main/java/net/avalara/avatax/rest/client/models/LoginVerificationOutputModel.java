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
 * This is the output model coming from skyscraper services
 */
public class LoginVerificationOutputModel {


    private Integer jobId;

    /**
     * Getter for jobId
     *
     * The job Id returned from skyscraper
     */
    public Integer getJobId() {
        return this.jobId;
    }

    /**
     * Setter for jobId
     *
     * The job Id returned from skyscraper
     */
    public void setJobId(Integer value) {
        this.jobId = value;
    }


    private String operationStatus;

    /**
     * Getter for operationStatus
     *
     * The operation status of the job
     */
    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * Setter for operationStatus
     *
     * The operation status of the job
     */
    public void setOperationStatus(String value) {
        this.operationStatus = value;
    }


    private String message;

    /**
     * Getter for message
     *
     * The message returned from the job
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * The message returned from the job
     */
    public void setMessage(String value) {
        this.message = value;
    }


    private Boolean loginSuccess;

    /**
     * Getter for loginSuccess
     *
     * Indicates if the login was successful
     */
    public Boolean getLoginSuccess() {
        return this.loginSuccess;
    }

    /**
     * Setter for loginSuccess
     *
     * Indicates if the login was successful
     */
    public void setLoginSuccess(Boolean value) {
        this.loginSuccess = value;
    }


    /**
     * Returns a JSON string representation of LoginVerificationOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
