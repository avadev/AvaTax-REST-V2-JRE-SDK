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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a license key reset request.
 */
public class ResetLicenseKeyModel {


    private Int32 accountId;

    /**
     * Getter for accountId;
     * The primary key of the account ID to reset
     */
    public Int32 getaccountId() {;
        return this.accountId;;
    }

    /**
     * Setter for accountId;
     * The primary key of the account ID to reset
     */
    public void setaccountId(Int32 value) {;
        this.accountId = value;;
    }


    private Boolean confirmResetLicenseKey;

    /**
     * Getter for confirmResetLicenseKey;
     * Set this value to true to reset the license key for this account.
    * This license key reset function will only work when called using the credentials of the account administrator of this account.
     */
    public Boolean getconfirmResetLicenseKey() {;
        return this.confirmResetLicenseKey;;
    }

    /**
     * Setter for confirmResetLicenseKey;
     * Set this value to true to reset the license key for this account.
    * This license key reset function will only work when called using the credentials of the account administrator of this account.
     */
    public void setconfirmResetLicenseKey(Boolean value) {;
        this.confirmResetLicenseKey = value;;
    }


    /**
     * Returns a JSON string representation of ResetLicenseKeyModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
