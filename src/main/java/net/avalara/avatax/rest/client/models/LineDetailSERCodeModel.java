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
 * SER code fixup
 */
public class LineDetailSERCodeModel {


    private Long transactionLineDetailId;

    /**
     * Getter for transactionLineDetailId
     *
     * Transaction line detail Id
     */
    public Long getTransactionLineDetailId() {
        return this.transactionLineDetailId;
    }

    /**
     * Setter for transactionLineDetailId
     *
     * Transaction line detail Id
     */
    public void setTransactionLineDetailId(Long value) {
        this.transactionLineDetailId = value;
    }


    private String serCode;

    /**
     * Getter for serCode
     *
     * Updated SER code
     */
    public String getSerCode() {
        return this.serCode;
    }

    /**
     * Setter for serCode
     *
     * Updated SER code
     */
    public void setSerCode(String value) {
        this.serCode = value;
    }


    /**
     * Returns a JSON string representation of LineDetailSERCodeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
