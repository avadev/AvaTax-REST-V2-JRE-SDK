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
 * Represents a transaction/service type pair for telecommunications tax
 */
public class CommunicationsTSPairModel {


    private Integer transactionTypeId;

    /**
     * Getter for transactionTypeId
     *
     * The numeric Id of the transaction type.
     */
    public Integer getTransactionTypeId() {
        return this.transactionTypeId;
    }

    /**
     * Setter for transactionTypeId
     *
     * The numeric Id of the transaction type.
     */
    public void setTransactionTypeId(Integer value) {
        this.transactionTypeId = value;
    }


    private Integer serviceTypeId;

    /**
     * Getter for serviceTypeId
     *
     * The numeric Id of the service type.
     */
    public Integer getServiceTypeId() {
        return this.serviceTypeId;
    }

    /**
     * Setter for serviceTypeId
     *
     * The numeric Id of the service type.
     */
    public void setServiceTypeId(Integer value) {
        this.serviceTypeId = value;
    }


    private String transactionType;

    /**
     * Getter for transactionType
     *
     * The name of the transaction type.
     */
    public String getTransactionType() {
        return this.transactionType;
    }

    /**
     * Setter for transactionType
     *
     * The name of the transaction type.
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }


    private String serviceType;

    /**
     * Getter for serviceType
     *
     * The name of the service type.
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * Setter for serviceType
     *
     * The name of the service type.
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * The description of the transaction/service type pair.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of the transaction/service type pair.
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private ArrayList<String> requiredParameters;

    /**
     * Getter for requiredParameters
     *
     * List of the parameters (among Charge, Minutes and Lines) that will be used for calculation for this T/S pair.
     */
    public ArrayList<String> getRequiredParameters() {
        return this.requiredParameters;
    }

    /**
     * Setter for requiredParameters
     *
     * List of the parameters (among Charge, Minutes and Lines) that will be used for calculation for this T/S pair.
     */
    public void setRequiredParameters(ArrayList<String> value) {
        this.requiredParameters = value;
    }


    /**
     * Returns a JSON string representation of CommunicationsTSPairModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
