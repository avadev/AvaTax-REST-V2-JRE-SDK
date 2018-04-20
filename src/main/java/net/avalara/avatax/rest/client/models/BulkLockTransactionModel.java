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
 * Bulk lock documents model
 */
public class BulkLockTransactionModel {


    private ArrayList<Long> documentIds;

    /**
     * Getter for documentIds
     *
     * List of documents to lock
     */
    public ArrayList<Long> getDocumentIds() {
        return this.documentIds;
    }

    /**
     * Setter for documentIds
     *
     * List of documents to lock
     */
    public void setDocumentIds(ArrayList<Long> value) {
        this.documentIds = value;
    }


    private Boolean isLocked;

    /**
     * Getter for isLocked
     *
     * The lock status to set for the documents designated in this API
     */
    public Boolean getIsLocked() {
        return this.isLocked;
    }

    /**
     * Setter for isLocked
     *
     * The lock status to set for the documents designated in this API
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }


    /**
     * Returns a JSON string representation of BulkLockTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
