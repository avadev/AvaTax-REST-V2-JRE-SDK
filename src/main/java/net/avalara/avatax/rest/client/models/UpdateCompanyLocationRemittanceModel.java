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
 * Expire a location without restriction then update with new remittance and dates.
 */
public class UpdateCompanyLocationRemittanceModel {


    private AddressCategoryId addressCategoryId;

    /**
     * Getter for addressCategoryId
     *
     * Indicates whether this location is a physical place of business or a temporary salesperson location.
	 * 
     */
    public AddressCategoryId getAddressCategoryId() {
        return this.addressCategoryId;
    }

    /**
     * Setter for addressCategoryId
     *
     * Indicates whether this location is a physical place of business or a temporary salesperson location.
     */
    public void setAddressCategoryId(AddressCategoryId value) {
        this.addressCategoryId = value;
    }

    private Date effectiveDate;

    /**
     * Getter for effectiveDate
     *
     * The date when this location was opened for business.
	 * 
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate
     *
     * The date when this location was opened for business.
     */
    public void setEffectiveDate(Date value) {
        this.effectiveDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * If this place of business has closed, the date when this location closed business. If null it'll be set to the date of 9998-12-31.
	 * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * If this place of business has closed, the date when this location closed business. If null it'll be set to the date of 9998-12-31.
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of UpdateCompanyLocationRemittanceModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
