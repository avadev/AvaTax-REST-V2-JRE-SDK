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
 * Swagger name: AvaTaxBeverageClient
 */

/**
 * The Result of a call to the /ageVerification/verify endpoint.
 */
public class AgeVerifyResult {


    private Boolean isOfAge;

    /**
     * Getter for isOfAge
     *
     * Describes whether the individual meets or exceeds the minimum legal drinking age.
	 * 
     */
    public Boolean getIsOfAge() {
        return this.isOfAge;
    }

    /**
     * Setter for isOfAge
     *
     * Describes whether the individual meets or exceeds the minimum legal drinking age.
     */
    public void setIsOfAge(Boolean value) {
        this.isOfAge = value;
    }

    private ArrayList<AgeVerifyResult> failureCodes;

    /**
     * Getter for failureCodes
     *
     * A list of failure codes describing why a *false* age determination was made.
	 * 
     */
    public ArrayList<AgeVerifyResult> getFailureCodes() {
        return this.failureCodes;
    }

    /**
     * Setter for failureCodes
     *
     * A list of failure codes describing why a *false* age determination was made.
     */
    public void setFailureCodes(ArrayList<AgeVerifyResult> value) {
        this.failureCodes = value;
    }

    /**
     * Returns a JSON string representation of AgeVerifyResult
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
