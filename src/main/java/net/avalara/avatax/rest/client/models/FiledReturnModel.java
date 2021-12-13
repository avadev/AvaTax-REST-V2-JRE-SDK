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
 * Filing Returns Model
 */
public class FiledReturnModel {


    private Long companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company filing return.
	 * 
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company filing return.
     */
    public void setCompanyId(Long value) {
        this.companyId = value;
    }

    private Integer endPeriodMonth;

    /**
     * Getter for endPeriodMonth
     *
     * The month of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
	 * 
     */
    public Integer getEndPeriodMonth() {
        return this.endPeriodMonth;
    }

    /**
     * Setter for endPeriodMonth
     *
     * The month of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setEndPeriodMonth(Integer value) {
        this.endPeriodMonth = value;
    }

    private Short endPeriodYear;

    /**
     * Getter for endPeriodYear
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
	 * 
     */
    public Short getEndPeriodYear() {
        return this.endPeriodYear;
    }

    /**
     * Setter for endPeriodYear
     *
     * The year of the filing period for this tax filing.
    * The filing period represents the year and month of the last day of taxes being reported on this filing.
    * For example, an annual tax filing for Jan-Dec 2015 would have a filing period of Dec 2015.
     */
    public void setEndPeriodYear(Short value) {
        this.endPeriodYear = value;
    }

    private String taxformCode;

    /**
     * Getter for taxformCode
     *
     * The unique code of the form.
	 * 
     */
    public String getTaxformCode() {
        return this.taxformCode;
    }

    /**
     * Setter for taxformCode
     *
     * The unique code of the form.
     */
    public void setTaxformCode(String value) {
        this.taxformCode = value;
    }

    /**
     * Returns a JSON string representation of FiledReturnModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
