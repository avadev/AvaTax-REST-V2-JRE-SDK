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
 * Represents the Country coefficients model, using which tax rules rates can be modified dynamically for CB transaciotns while applying tax rules
* in order to reduce the variance for all the transactions at country level.
 */
public class CountryCoefficientsRequestModel {


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * CompanyCode
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * CompanyCode
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    private String country;

    /**
     * Getter for country
     *
     * The country for which coefficient will be applied.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country for which coefficient will be applied.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    private BigDecimal coefficient;

    /**
     * Getter for coefficient
     *
     * Value by which rates need to be altered while calculating taxes.
     */
    public BigDecimal getCoefficient() {
        return this.coefficient;
    }

    /**
     * Setter for coefficient
     *
     * Value by which rates need to be altered while calculating taxes.
     */
    public void setCoefficient(BigDecimal value) {
        this.coefficient = value;
    }

    private String taxSubTypeId;

    /**
     * Getter for taxSubTypeId
     *
     * TaxSubTypeId
     */
    public String getTaxSubTypeId() {
        return this.taxSubTypeId;
    }

    /**
     * Setter for taxSubTypeId
     *
     * TaxSubTypeId
     */
    public void setTaxSubTypeId(String value) {
        this.taxSubTypeId = value;
    }

    private String currencyCode;

    /**
     * Getter for currencyCode
     *
     * CurrencyCode
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Setter for currencyCode
     *
     * CurrencyCode
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    private Integer unitOfBasisId;

    /**
     * Getter for unitOfBasisId
     *
     * UnitOfBasisId
     */
    public Integer getUnitOfBasisId() {
        return this.unitOfBasisId;
    }

    /**
     * Setter for unitOfBasisId
     *
     * UnitOfBasisId
     */
    public void setUnitOfBasisId(Integer value) {
        this.unitOfBasisId = value;
    }

    private Boolean isApplicable;

    /**
     * Getter for isApplicable
     *
     * IsApplicable
    * Flag that is being used to mark the effectiveness of the specific entry for the particular date.
     */
    public Boolean getIsApplicable() {
        return this.isApplicable;
    }

    /**
     * Setter for isApplicable
     *
     * IsApplicable
    * Flag that is being used to mark the effectiveness of the specific entry for the particular date.
     */
    public void setIsApplicable(Boolean value) {
        this.isApplicable = value;
    }

    private Date startDate;

    /**
     * Getter for startDate
     *
     * StartDate
     */
    public Date getStartDate() {
        return this.startDate;
    }

    /**
     * Setter for startDate
     *
     * StartDate
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    private Date endDate;

    /**
     * Getter for endDate
     *
     * 
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * 
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Returns a JSON string representation of CountryCoefficientsRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
