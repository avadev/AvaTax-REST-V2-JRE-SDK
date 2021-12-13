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
 * Account Linkage Input model
 */
public class FirmClientLinkageInputModel {


    private Integer clientAccountId;

    /**
     * Getter for clientAccountId
     *
     * Client AccountId that needs to be linked to the firm
	 * 
     */
    public Integer getClientAccountId() {
        return this.clientAccountId;
    }

    /**
     * Setter for clientAccountId
     *
     * Client AccountId that needs to be linked to the firm
     */
    public void setClientAccountId(Integer value) {
        this.clientAccountId = value;
    }

    private String clientAccountName;

    /**
     * Getter for clientAccountName
     *
     * Client AccountName that needs to be linked to the firm
	 * 
     */
    public String getClientAccountName() {
        return this.clientAccountName;
    }

    /**
     * Setter for clientAccountName
     *
     * Client AccountName that needs to be linked to the firm
     */
    public void setClientAccountName(String value) {
        this.clientAccountName = value;
    }

    /**
     * Returns a JSON string representation of FirmClientLinkageInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
