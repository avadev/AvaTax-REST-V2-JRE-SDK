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
 * Tariff classification criteria flags used when mode is `auto_partial`.
 */
public class ClassificationCriteriaModel {


    private Boolean noTariffCodeAssigned;

    /**
     * Getter for noTariffCodeAssigned
     *
     * When true, include items with no tariff code assigned.
     */
    public Boolean getNoTariffCodeAssigned() {
        return this.noTariffCodeAssigned;
    }

    /**
     * Setter for noTariffCodeAssigned
     *
     * When true, include items with no tariff code assigned.
     */
    public void setNoTariffCodeAssigned(Boolean value) {
        this.noTariffCodeAssigned = value;
    }

    private Boolean invalidTariffCode;

    /**
     * Getter for invalidTariffCode
     *
     * When true, include items with an invalid tariff code.
     */
    public Boolean getInvalidTariffCode() {
        return this.invalidTariffCode;
    }

    /**
     * Setter for invalidTariffCode
     *
     * When true, include items with an invalid tariff code.
     */
    public void setInvalidTariffCode(Boolean value) {
        this.invalidTariffCode = value;
    }

    private Boolean tariffCodeNeedsReview;

    /**
     * Getter for tariffCodeNeedsReview
     *
     * When true, include items whose tariff code needs review.
     */
    public Boolean getTariffCodeNeedsReview() {
        return this.tariffCodeNeedsReview;
    }

    /**
     * Setter for tariffCodeNeedsReview
     *
     * When true, include items whose tariff code needs review.
     */
    public void setTariffCodeNeedsReview(Boolean value) {
        this.tariffCodeNeedsReview = value;
    }

    /**
     * Returns a JSON string representation of ClassificationCriteriaModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
