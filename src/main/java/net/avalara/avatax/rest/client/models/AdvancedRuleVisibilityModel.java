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
 * Model for toggling visibility of an advanced rule for an account
 */
public class AdvancedRuleVisibilityModel {


    private Boolean isVisible;

    /**
     * Getter for isVisible
     *
     * Should the rule be visible or not visible
	 * 
     */
    public Boolean getIsVisible() {
        return this.isVisible;
    }

    /**
     * Setter for isVisible
     *
     * Should the rule be visible or not visible
     */
    public void setIsVisible(Boolean value) {
        this.isVisible = value;
    }

    private Integer accountId;

    /**
     * Getter for accountId
     *
     * The account Id for which the rule is to be visible/not visible
	 * 
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * The account Id for which the rule is to be visible/not visible
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    /**
     * Returns a JSON string representation of AdvancedRuleVisibilityModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
