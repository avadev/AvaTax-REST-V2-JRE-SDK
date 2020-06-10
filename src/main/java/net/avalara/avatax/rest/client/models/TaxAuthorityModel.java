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
 * Tax Authority Model
 */
public class TaxAuthorityModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this tax authority.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this tax authority.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * The friendly name of this tax authority.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The friendly name of this tax authority.
     */
    public void setName(String value) {
        this.name = value;
    }


    private Integer taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId
     *
     * The type of this tax authority.
     */
    public Integer getTaxAuthorityTypeId() {
        return this.taxAuthorityTypeId;
    }

    /**
     * Setter for taxAuthorityTypeId
     *
     * The type of this tax authority.
     */
    public void setTaxAuthorityTypeId(Integer value) {
        this.taxAuthorityTypeId = value;
    }


    private Integer jurisdictionId;

    /**
     * Getter for jurisdictionId
     *
     * The unique ID number of the jurisdiction for this tax authority.
     */
    public Integer getJurisdictionId() {
        return this.jurisdictionId;
    }

    /**
     * Setter for jurisdictionId
     *
     * The unique ID number of the jurisdiction for this tax authority.
     */
    public void setJurisdictionId(Integer value) {
        this.jurisdictionId = value;
    }


    /**
     * Returns a JSON string representation of TaxAuthorityModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
