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
 * Swagger name: AvaTaxClient
 */

/**
 * An AvaTax account.
 */
public class CombinedHSTConfigModel {


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The unique ID number assigned to this account.
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private ArrayList<String> excludedCompanyCodes;

    /**
     * Getter for excludedCompanyCodes
     *
     * Company Codes to Exclude from change.
     */
    public ArrayList<String> getExcludedCompanyCodes() {
        return this.excludedCompanyCodes;
    }

    /**
     * Setter for excludedCompanyCodes
     *
     * Company Codes to Exclude from change.
     */
    public void setExcludedCompanyCodes(ArrayList<String> value) {
        this.excludedCompanyCodes = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * 
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of CombinedHSTConfigModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
