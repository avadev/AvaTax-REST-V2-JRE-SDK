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
 * Represents one configuration setting for this company
 */
public class CompanyConfigurationModel {


    private Int32? companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the account to which this setting applies
     */
    public Int32? getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the account to which this setting applies
     */
    public void setcompanyId(Int32? value) {;
        this.companyId = value;;
    }


    private String category;

    /**
     * Getter for category;
     * The category of the configuration setting. Avalara-defined categories include `AddressServiceConfig` and `TaxServiceConfig`. Customer-defined categories begin with `X-`.
     */
    public String getcategory() {;
        return this.category;;
    }

    /**
     * Setter for category;
     * The category of the configuration setting. Avalara-defined categories include `AddressServiceConfig` and `TaxServiceConfig`. Customer-defined categories begin with `X-`.
     */
    public void setcategory(String value) {;
        this.category = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The name of the configuration setting
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The name of the configuration setting
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private String value;

    /**
     * Getter for value;
     * The current value of the configuration setting
     */
    public String getvalue() {;
        return this.value;;
    }

    /**
     * Setter for value;
     * The current value of the configuration setting
     */
    public void setvalue(String value) {;
        this.value = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    /**
     * Returns a JSON string representation of CompanyConfigurationModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
