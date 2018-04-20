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
 * Represents information about a type of telecommunications transaction
 */
public class CommunicationsTransactionTypeModel {


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


    /**
     * Returns a JSON string representation of CommunicationsTransactionTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
