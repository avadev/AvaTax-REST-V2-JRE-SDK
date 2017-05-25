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
 * Cycle Safe Expiration results.
 */
public class FilingsCheckupAuthorityModel {


    private Int32? taxAuthorityId;

    /**
     * Getter for taxAuthorityId;
     * Unique ID of the tax authority
     */
    public Int32? gettaxAuthorityId() {;
        return this.taxAuthorityId;;
    }

    /**
     * Setter for taxAuthorityId;
     * Unique ID of the tax authority
     */
    public void settaxAuthorityId(Int32? value) {;
        this.taxAuthorityId = value;;
    }


    private String locationCode;

    /**
     * Getter for locationCode;
     * Location Code of the tax authority
     */
    public String getlocationCode() {;
        return this.locationCode;;
    }

    /**
     * Setter for locationCode;
     * Location Code of the tax authority
     */
    public void setlocationCode(String value) {;
        this.locationCode = value;;
    }


    private String taxAuthorityName;

    /**
     * Getter for taxAuthorityName;
     * Name of the tax authority
     */
    public String gettaxAuthorityName() {;
        return this.taxAuthorityName;;
    }

    /**
     * Setter for taxAuthorityName;
     * Name of the tax authority
     */
    public void settaxAuthorityName(String value) {;
        this.taxAuthorityName = value;;
    }


    private Int32? taxAuthorityTypeId;

    /**
     * Getter for taxAuthorityTypeId;
     * Type Id of the tax authority
     */
    public Int32? gettaxAuthorityTypeId() {;
        return this.taxAuthorityTypeId;;
    }

    /**
     * Setter for taxAuthorityTypeId;
     * Type Id of the tax authority
     */
    public void settaxAuthorityTypeId(Int32? value) {;
        this.taxAuthorityTypeId = value;;
    }


    private Int32? jurisdictionId;

    /**
     * Getter for jurisdictionId;
     * Jurisdiction Id of the tax authority
     */
    public Int32? getjurisdictionId() {;
        return this.jurisdictionId;;
    }

    /**
     * Setter for jurisdictionId;
     * Jurisdiction Id of the tax authority
     */
    public void setjurisdictionId(Int32? value) {;
        this.jurisdictionId = value;;
    }


    private Decimal? tax;

    /**
     * Getter for tax;
     * Amount of tax collected in this tax authority
     */
    public Decimal? gettax() {;
        return this.tax;;
    }

    /**
     * Setter for tax;
     * Amount of tax collected in this tax authority
     */
    public void settax(Decimal? value) {;
        this.tax = value;;
    }


    private String taxTypeId;

    /**
     * Getter for taxTypeId;
     * Tax Type collected in the tax authority
     */
    public String gettaxTypeId() {;
        return this.taxTypeId;;
    }

    /**
     * Setter for taxTypeId;
     * Tax Type collected in the tax authority
     */
    public void settaxTypeId(String value) {;
        this.taxTypeId = value;;
    }


    private List<FilingsCheckupSuggestedFormModel> suggestedForms;

    /**
     * Getter for suggestedForms;
     * Suggested forms to file due to tax collected
     */
    public List<FilingsCheckupSuggestedFormModel> getsuggestedForms() {;
        return this.suggestedForms;;
    }

    /**
     * Setter for suggestedForms;
     * Suggested forms to file due to tax collected
     */
    public void setsuggestedForms(List<FilingsCheckupSuggestedFormModel> value) {;
        this.suggestedForms = value;;
    }


    /**
     * Returns a JSON string representation of FilingsCheckupAuthorityModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
