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
 * One tax type + subtype combination for a jurisdiction.
 */
public class JurisdictionTaxTypesAndSubTypesModel {


    private String taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * ID of the tax type.
     */
    public String getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * ID of the tax type.
     */
    public void setTaxTypeId(String value) {
        this.taxTypeId = value;
    }

    private String taxTypeDescription;

    /**
     * Getter for taxTypeDescription
     *
     * Text description of the tax type.
     */
    public String getTaxTypeDescription() {
        return this.taxTypeDescription;
    }

    /**
     * Setter for taxTypeDescription
     *
     * Text description of the tax type.
     */
    public void setTaxTypeDescription(String value) {
        this.taxTypeDescription = value;
    }

    private String taxSubTypeId;

    /**
     * Getter for taxSubTypeId
     *
     * ID of the tax subtype.
     */
    public String getTaxSubTypeId() {
        return this.taxSubTypeId;
    }

    /**
     * Setter for taxSubTypeId
     *
     * ID of the tax subtype.
     */
    public void setTaxSubTypeId(String value) {
        this.taxSubTypeId = value;
    }

    private String taxSubTypeDescription;

    /**
     * Getter for taxSubTypeDescription
     *
     * Text description of the tax subtype.
     */
    public String getTaxSubTypeDescription() {
        return this.taxSubTypeDescription;
    }

    /**
     * Setter for taxSubTypeDescription
     *
     * Text description of the tax subtype.
     */
    public void setTaxSubTypeDescription(String value) {
        this.taxSubTypeDescription = value;
    }

    private String jurisdictionTaxTypeSubtypeDescription;

    /**
     * Getter for jurisdictionTaxTypeSubtypeDescription
     *
     * Summary tax type display name derived from tax type and subtype.
     */
    public String getJurisdictionTaxTypeSubtypeDescription() {
        return this.jurisdictionTaxTypeSubtypeDescription;
    }

    /**
     * Setter for jurisdictionTaxTypeSubtypeDescription
     *
     * Summary tax type display name derived from tax type and subtype.
     */
    public void setJurisdictionTaxTypeSubtypeDescription(String value) {
        this.jurisdictionTaxTypeSubtypeDescription = value;
    }

    private ArrayList<RateTypesModel> rateTypes;

    /**
     * Getter for rateTypes
     *
     * Populated when `$includeRateTypes=true` (default). Empty when rate types are omitted.
     */
    public ArrayList<RateTypesModel> getRateTypes() {
        return this.rateTypes;
    }

    /**
     * Setter for rateTypes
     *
     * Populated when `$includeRateTypes=true` (default). Empty when rate types are omitted.
     */
    public void setRateTypes(ArrayList<RateTypesModel> value) {
        this.rateTypes = value;
    }

    /**
     * Returns a JSON string representation of JurisdictionTaxTypesAndSubTypesModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
