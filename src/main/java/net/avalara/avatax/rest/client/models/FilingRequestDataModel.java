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
 * Represents a commitment to file a tax return on a recurring basis.
* Only used if you subscribe to Avalara Returns.
 */
public class FilingRequestDataModel {


    private Long companyReturnId;

    /**
     * Getter for companyReturnId
     *
     * The company return ID if requesting an update.
     */
    public Long getCompanyReturnId() {
        return this.companyReturnId;
    }

    /**
     * Setter for companyReturnId
     *
     * The company return ID if requesting an update.
     */
    public void setCompanyReturnId(Long value) {
        this.companyReturnId = value;
    }


    private String returnName;

    /**
     * Getter for returnName
     *
     * DEPRECATED - The legacy return name of the requested calendar.
     */
    public String getReturnName() {
        return this.returnName;
    }

    /**
     * Setter for returnName
     *
     * DEPRECATED - The legacy return name of the requested calendar.
     */
    public void setReturnName(String value) {
        this.returnName = value;
    }


    private String taxFormCode;

    /**
     * Getter for taxFormCode
     *
     * The Avalara standard tax form code of the tax form for this filing calendar. The first two characters of the tax form code
    * are the ISO 3166 country code of the country that issued this form.
     */
    public String getTaxFormCode() {
        return this.taxFormCode;
    }

    /**
     * Setter for taxFormCode
     *
     * The Avalara standard tax form code of the tax form for this filing calendar. The first two characters of the tax form code
    * are the ISO 3166 country code of the country that issued this form.
     */
    public void setTaxFormCode(String value) {
        this.taxFormCode = value;
    }


    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId
     *
     * The filing frequency of the request
     */
    public FilingFrequencyId getFilingFrequencyId() {
        return this.filingFrequencyId;
    }

    /**
     * Setter for filingFrequencyId
     *
     * The filing frequency of the request
     */
    public void setFilingFrequencyId(FilingFrequencyId value) {
        this.filingFrequencyId = value;
    }


    private String registrationId;

    /**
     * Getter for registrationId
     *
     * State registration ID of the company requesting the filing calendar.
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * Setter for registrationId
     *
     * State registration ID of the company requesting the filing calendar.
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }


    private Short months;

    /**
     * Getter for months
     *
     * The months of the request
     */
    public Short getMonths() {
        return this.months;
    }

    /**
     * Setter for months
     *
     * The months of the request
     */
    public void setMonths(Short value) {
        this.months = value;
    }


    private MatchingTaxType taxTypeId;

    /**
     * Getter for taxTypeId
     *
     * The type of tax to report on this return.
     */
    public MatchingTaxType getTaxTypeId() {
        return this.taxTypeId;
    }

    /**
     * Setter for taxTypeId
     *
     * The type of tax to report on this return.
     */
    public void setTaxTypeId(MatchingTaxType value) {
        this.taxTypeId = value;
    }


    private String locationCode;

    /**
     * Getter for locationCode
     *
     * Location code of the request
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * Setter for locationCode
     *
     * Location code of the request
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }


    private Date effDate;

    /**
     * Getter for effDate
     *
     * Filing cycle effective date of the request
     */
    public Date getEffDate() {
        return this.effDate;
    }

    /**
     * Setter for effDate
     *
     * Filing cycle effective date of the request
     */
    public void setEffDate(Date value) {
        this.effDate = value;
    }


    private Date endDate;

    /**
     * Getter for endDate
     *
     * Filing cycle end date of the request
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate
     *
     * Filing cycle end date of the request
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }


    private Boolean isClone;

    /**
     * Getter for isClone
     *
     * Flag if the request is a clone of a current filing calendar
     */
    public Boolean getIsClone() {
        return this.isClone;
    }

    /**
     * Setter for isClone
     *
     * Flag if the request is a clone of a current filing calendar
     */
    public void setIsClone(Boolean value) {
        this.isClone = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * The two character ISO 3166 country code of the country that issued the tax form for this filing calendar.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The two character ISO 3166 country code of the country that issued the tax form for this filing calendar.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * The two or three character ISO 3166 code of the region / state / province that issued the tax form for this filing calendar.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The two or three character ISO 3166 code of the region / state / province that issued the tax form for this filing calendar.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The tax authority id of the return
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The tax authority id of the return
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName
     *
     * The tax authority name on the return
     */
    public String getTaxAuthorityName() {
        return this.taxAuthorityName;
    }

    /**
     * Setter for taxAuthorityName
     *
     * The tax authority name on the return
     */
    public void setTaxAuthorityName(String value) {
        this.taxAuthorityName = value;
    }


    private ArrayList<FilingAnswerModel> answers;

    /**
     * Getter for answers
     *
     * Filing question answers
     */
    public ArrayList<FilingAnswerModel> getAnswers() {
        return this.answers;
    }

    /**
     * Setter for answers
     *
     * Filing question answers
     */
    public void setAnswers(ArrayList<FilingAnswerModel> value) {
        this.answers = value;
    }


    /**
     * Returns a JSON string representation of FilingRequestDataModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
