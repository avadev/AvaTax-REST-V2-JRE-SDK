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
 * Represents a request to activate an account by reading and accepting its terms and conditions.
 */
public class ActivateAccountModel {


    private Boolean acceptAvalaraTermsAndConditions;

    /**
     * Getter for acceptAvalaraTermsAndConditions
     *
     * Set this to true if and only if you accept Avalara's terms and conditions for your account.
     */
    public Boolean getAcceptAvalaraTermsAndConditions() {
        return this.acceptAvalaraTermsAndConditions;
    }

    /**
     * Setter for acceptAvalaraTermsAndConditions
     *
     * Set this to true if and only if you accept Avalara's terms and conditions for your account.
     */
    public void setAcceptAvalaraTermsAndConditions(Boolean value) {
        this.acceptAvalaraTermsAndConditions = value;
    }


    private Boolean haveReadAvalaraTermsAndConditions;

    /**
     * Getter for haveReadAvalaraTermsAndConditions
     *
     * Set this to true if and only if you have fully read Avalara's terms and conditions for your account.
     */
    public Boolean getHaveReadAvalaraTermsAndConditions() {
        return this.haveReadAvalaraTermsAndConditions;
    }

    /**
     * Setter for haveReadAvalaraTermsAndConditions
     *
     * Set this to true if and only if you have fully read Avalara's terms and conditions for your account.
     */
    public void setHaveReadAvalaraTermsAndConditions(Boolean value) {
        this.haveReadAvalaraTermsAndConditions = value;
    }


    /**
     * Returns a JSON string representation of ActivateAccountModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
