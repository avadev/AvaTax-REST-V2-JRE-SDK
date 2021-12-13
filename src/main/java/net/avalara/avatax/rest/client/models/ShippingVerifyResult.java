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
 * Swagger name: AvaTaxBeverageClient
 */

/**
 * The Response of the /shippingverify endpoint. Describes the result of checking all applicable shipping rules against each line in the transaction.
 */
public class ShippingVerifyResult {


    private Boolean compliant;

    /**
     * Getter for compliant
     *
     * Whether every line in the transaction is compliant.
	 * 
     */
    public Boolean getCompliant() {
        return this.compliant;
    }

    /**
     * Setter for compliant
     *
     * Whether every line in the transaction is compliant.
     */
    public void setCompliant(Boolean value) {
        this.compliant = value;
    }

    private String message;

    /**
     * Getter for message
     *
     * A short description of the result of the compliance check.
	 * 
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Setter for message
     *
     * A short description of the result of the compliance check.
     */
    public void setMessage(String value) {
        this.message = value;
    }

    private String successMessages;

    /**
     * Getter for successMessages
     *
     * A detailed description of the result of each of the passed checks made against this transaction, separated by line.
	 * 
     */
    public String getSuccessMessages() {
        return this.successMessages;
    }

    /**
     * Setter for successMessages
     *
     * A detailed description of the result of each of the passed checks made against this transaction, separated by line.
     */
    public void setSuccessMessages(String value) {
        this.successMessages = value;
    }

    private String failureMessages;

    /**
     * Getter for failureMessages
     *
     * A detailed description of the result of each of the failed checks made against this transaction, separated by line.
	 * 
     */
    public String getFailureMessages() {
        return this.failureMessages;
    }

    /**
     * Setter for failureMessages
     *
     * A detailed description of the result of each of the failed checks made against this transaction, separated by line.
     */
    public void setFailureMessages(String value) {
        this.failureMessages = value;
    }

    private ArrayList<String> failureCodes;

    /**
     * Getter for failureCodes
     *
     * An enumeration of all the failure codes received across all lines.
	 * 
     */
    public ArrayList<String> getFailureCodes() {
        return this.failureCodes;
    }

    /**
     * Setter for failureCodes
     *
     * An enumeration of all the failure codes received across all lines.
     */
    public void setFailureCodes(ArrayList<String> value) {
        this.failureCodes = value;
    }

    private ArrayList<String> warningCodes;

    /**
     * Getter for warningCodes
     *
     * An enumeration of all the warning codes received across all lines that a determination could not be made for.
	 * 
     */
    public ArrayList<String> getWarningCodes() {
        return this.warningCodes;
    }

    /**
     * Setter for warningCodes
     *
     * An enumeration of all the warning codes received across all lines that a determination could not be made for.
     */
    public void setWarningCodes(ArrayList<String> value) {
        this.warningCodes = value;
    }

    private ArrayList<HashMap<String, String>> lines;

    /**
     * Getter for lines
     *
     * Describes the results of the checks made for each line in the transaction.
	 * 
     */
    public ArrayList<HashMap<String, String>> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * Describes the results of the checks made for each line in the transaction.
     */
    public void setLines(ArrayList<HashMap<String, String>> value) {
        this.lines = value;
    }

    /**
     * Returns a JSON string representation of ShippingVerifyResult
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
