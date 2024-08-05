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
 * Tax Code Recommendation Output Model
 */
public class TaxCodeRecommendationsOutputModel {


    private String taxCode;

    /**
     * Getter for taxCode
     *
     * Recommended TaxCode
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * Setter for taxCode
     *
     * Recommended TaxCode
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    private String level;

    /**
     * Getter for level
     *
     * Recommended TaxCode Level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * Setter for level
     *
     * Recommended TaxCode Level
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Returns a JSON string representation of TaxCodeRecommendationsOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
