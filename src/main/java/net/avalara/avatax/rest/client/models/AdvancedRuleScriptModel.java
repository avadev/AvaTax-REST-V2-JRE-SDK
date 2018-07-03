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
 * Represents an advanced rule script
 */
public class AdvancedRuleScriptModel {


    private Long id;

    /**
     * Getter for id
     *
     * The unique ID of the script
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID of the script
     */
    public void setId(Long value) {
        this.id = value;
    }


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * Account ID
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * Account ID
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }


    private AdvancedRuleCrashBehavior crashBehavior;

    /**
     * Getter for crashBehavior
     *
     * How to proceed if the rule crashes
     */
    public AdvancedRuleCrashBehavior getCrashBehavior() {
        return this.crashBehavior;
    }

    /**
     * Setter for crashBehavior
     *
     * How to proceed if the rule crashes
     */
    public void setCrashBehavior(AdvancedRuleCrashBehavior value) {
        this.crashBehavior = value;
    }


    private AdvancedRuleScriptType scriptType;

    /**
     * Getter for scriptType
     *
     * The type of script - request or response
     */
    public AdvancedRuleScriptType getScriptType() {
        return this.scriptType;
    }

    /**
     * Setter for scriptType
     *
     * The type of script - request or response
     */
    public void setScriptType(AdvancedRuleScriptType value) {
        this.scriptType = value;
    }


    private String script;

    /**
     * Getter for script
     *
     * The JavaScript rule
     */
    public String getScript() {
        return this.script;
    }

    /**
     * Setter for script
     *
     * The JavaScript rule
     */
    public void setScript(String value) {
        this.script = value;
    }


    private Boolean isApproved;

    /**
     * Getter for isApproved
     *
     * The rule has been approved
     */
    public Boolean getIsApproved() {
        return this.isApproved;
    }

    /**
     * Setter for isApproved
     *
     * The rule has been approved
     */
    public void setIsApproved(Boolean value) {
        this.isApproved = value;
    }


    private Boolean isDisabled;

    /**
     * Getter for isDisabled
     *
     * The rule has been disabled
     */
    public Boolean getIsDisabled() {
        return this.isDisabled;
    }

    /**
     * Setter for isDisabled
     *
     * The rule has been disabled
     */
    public void setIsDisabled(Boolean value) {
        this.isDisabled = value;
    }


    /**
     * Returns a JSON string representation of AdvancedRuleScriptModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
