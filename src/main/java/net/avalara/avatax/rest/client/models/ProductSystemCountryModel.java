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
 * Represents a System Country.
 */
public class ProductSystemCountryModel {


    private Integer systemCountryId;

    /**
     * Getter for systemCountryId
     *
     * Its Integer SystemCountryId value for SystemCountry
	 * 
     */
    public Integer getSystemCountryId() {
        return this.systemCountryId;
    }

    /**
     * Setter for systemCountryId
     *
     * Its Integer SystemCountryId value for SystemCountry
     */
    public void setSystemCountryId(Integer value) {
        this.systemCountryId = value;
    }

    private Integer systemId;

    /**
     * Getter for systemId
     *
     * Its Integer SystemId value for SystemCountry
	 * 
     */
    public Integer getSystemId() {
        return this.systemId;
    }

    /**
     * Setter for systemId
     *
     * Its Integer SystemId value for SystemCountry
     */
    public void setSystemId(Integer value) {
        this.systemId = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * string value of country code for SystemCountry
	 * 
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * string value of country code for SystemCountry
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private Date effDate;

    /**
     * Getter for effDate
     *
     * DateTime as EffDate for SystemCountry
	 * 
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * DateTime as EffDate for SystemCountry
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * DateTime as EffDate for SystemCountry
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * DateTime as EffDate for SystemCountry
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of ProductSystemCountryModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
