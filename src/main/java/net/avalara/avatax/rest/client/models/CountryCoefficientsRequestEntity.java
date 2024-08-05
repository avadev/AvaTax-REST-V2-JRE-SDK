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
 * Represents the Country coefficients request input model, using which tax rules rates can be modified dynamically for CB transaciotns while applying tax rules
* in order to reduce the variance for all the transactions at country level.
 */
public class CountryCoefficientsRequestEntity {


    private Integer accountId;

    /**
     * Getter for accountId
     *
     * AccountId
     */
    public Integer getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * AccountId
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    private ArrayList<CountryCoefficientsRequestModel> coefficientDetails;

    /**
     * Getter for coefficientDetails
     *
     * CountryCoefficientsRequestModel list
     */
    public ArrayList<CountryCoefficientsRequestModel> getCoefficientDetails() {
        return this.coefficientDetails;
    }

    /**
     * Setter for coefficientDetails
     *
     * CountryCoefficientsRequestModel list
     */
    public void setCoefficientDetails(ArrayList<CountryCoefficientsRequestModel> value) {
        this.coefficientDetails = value;
    }

    /**
     * Returns a JSON string representation of CountryCoefficientsRequestEntity
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
