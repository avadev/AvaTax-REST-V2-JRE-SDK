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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a commitment to file a tax return on a recurring basis.
* Only used if you subscribe to Avalara Returns.
 */
public class FilingRequestDataModel {


    private Int64? companyReturnId;

    /**
     * Getter for companyReturnId;
     * The company return ID if requesting an update.
     */
    public Int64? getcompanyReturnId() {;
        return this.companyReturnId;;
    }

    /**
     * Setter for companyReturnId;
     * The company return ID if requesting an update.
     */
    public void setcompanyReturnId(Int64? value) {;
        this.companyReturnId = value;;
    }


    private String returnName;

    /**
     * Getter for returnName;
     * The return name of the requested calendar
     */
    public String getreturnName() {;
        return this.returnName;;
    }

    /**
     * Setter for returnName;
     * The return name of the requested calendar
     */
    public void setreturnName(String value) {;
        this.returnName = value;;
    }


    private FilingFrequencyId filingFrequencyId;

    /**
     * Getter for filingFrequencyId;
     * The filing frequency of the request
     */
    public FilingFrequencyId getfilingFrequencyId() {;
        return this.filingFrequencyId;;
    }

    /**
     * Setter for filingFrequencyId;
     * The filing frequency of the request
     */
    public void setfilingFrequencyId(FilingFrequencyId value) {;
        this.filingFrequencyId = value;;
    }


    private String registrationId;

    /**
     * Getter for registrationId;
     * State registration ID of the company requesting the filing calendar.
     */
    public String getregistrationId() {;
        return this.registrationId;;
    }

    /**
     * Setter for registrationId;
     * State registration ID of the company requesting the filing calendar.
     */
    public void setregistrationId(String value) {;
        this.registrationId = value;;
    }


    private Int16 months;

    /**
     * Getter for months;
     * The months of the request
     */
    public Int16 getmonths() {;
        return this.months;;
    }

    /**
     * Setter for months;
     * The months of the request
     */
    public void setmonths(Int16 value) {;
        this.months = value;;
    }


    private MatchingTaxType? taxTypeId;

    /**
     * Getter for taxTypeId;
     * The type of tax to report on this return.
     */
    public MatchingTaxType? gettaxTypeId() {;
        return this.taxTypeId;;
    }

    /**
     * Setter for taxTypeId;
     * The type of tax to report on this return.
     */
    public void settaxTypeId(MatchingTaxType? value) {;
        this.taxTypeId = value;;
    }


    private String locationCode;

    /**
     * Getter for locationCode;
     * Location code of the request
     */
    public String getlocationCode() {;
        return this.locationCode;;
    }

    /**
     * Setter for locationCode;
     * Location code of the request
     */
    public void setlocationCode(String value) {;
        this.locationCode = value;;
    }


    private DateTime effDate;

    /**
     * Getter for effDate;
     * Filing cycle effective date of the request
     */
    public DateTime geteffDate() {;
        return this.effDate;;
    }

    /**
     * Setter for effDate;
     * Filing cycle effective date of the request
     */
    public void seteffDate(DateTime value) {;
        this.effDate = value;;
    }


    private DateTime? endDate;

    /**
     * Getter for endDate;
     * Filing cycle end date of the request
     */
    public DateTime? getendDate() {;
        return this.endDate;;
    }

    /**
     * Setter for endDate;
     * Filing cycle end date of the request
     */
    public void setendDate(DateTime? value) {;
        this.endDate = value;;
    }


    private Boolean? isClone;

    /**
     * Getter for isClone;
     * Flag if the request is a clone of a current filing calendar
     */
    public Boolean? getisClone() {;
        return this.isClone;;
    }

    /**
     * Setter for isClone;
     * Flag if the request is a clone of a current filing calendar
     */
    public void setisClone(Boolean? value) {;
        this.isClone = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The region this request is for
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The region this request is for
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private Int32? taxAuthorityId;

    /**
     * Getter for taxAuthorityId;
     * The tax authority id of the return
     */
    public Int32? gettaxAuthorityId() {;
        return this.taxAuthorityId;;
    }

    /**
     * Setter for taxAuthorityId;
     * The tax authority id of the return
     */
    public void settaxAuthorityId(Int32? value) {;
        this.taxAuthorityId = value;;
    }


    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName;
     * The tax authority name on the return
     */
    public String gettaxAuthorityName() {;
        return this.taxAuthorityName;;
    }

    /**
     * Setter for taxAuthorityName;
     * The tax authority name on the return
     */
    public void settaxAuthorityName(String value) {;
        this.taxAuthorityName = value;;
    }


    private List<FilingAnswerModel> answers;

    /**
     * Getter for answers;
     * Filing question answers
     */
    public List<FilingAnswerModel> getanswers() {;
        return this.answers;;
    }

    /**
     * Setter for answers;
     * Filing question answers
     */
    public void setanswers(List<FilingAnswerModel> value) {;
        this.answers = value;;
    }


    /**
     * Returns a JSON string representation of FilingRequestDataModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
