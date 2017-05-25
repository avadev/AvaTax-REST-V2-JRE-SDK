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
 * Represents an item in your company's product catalog.
 */
public class ItemModel {


    private Int64 id;

    /**
     * Getter for id;
     * The unique ID number of this item.
     */
    public Int64 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this item.
     */
    public void setid(Int64 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company that owns this item.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company that owns this item.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String itemCode;

    /**
     * Getter for itemCode;
     * A unique code representing this item.
     */
    public String getitemCode() {;
        return this.itemCode;;
    }

    /**
     * Setter for itemCode;
     * A unique code representing this item.
     */
    public void setitemCode(String value) {;
        this.itemCode = value;;
    }


    private Int32? taxCodeId;

    /**
     * Getter for taxCodeId;
     * The unique ID number of the tax code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public Int32? gettaxCodeId() {;
        return this.taxCodeId;;
    }

    /**
     * Setter for taxCodeId;
     * The unique ID number of the tax code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public void settaxCodeId(Int32? value) {;
        this.taxCodeId = value;;
    }


    private String taxCode;

    /**
     * Getter for taxCode;
     * The unique code string of the Tax Code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public String gettaxCode() {;
        return this.taxCode;;
    }

    /**
     * Setter for taxCode;
     * The unique code string of the Tax Code that is applied when selling this item.
    * When creating or updating an item, you can either specify the Tax Code ID number or the Tax Code string; you do not need to specify both values.
     */
    public void settaxCode(String value) {;
        this.taxCode = value;;
    }


    private String description;

    /**
     * Getter for description;
     * A friendly description of this item in your product catalog.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * A friendly description of this item in your product catalog.
     */
    public void setdescription(String value) {;
        this.description = value;;
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
     * Returns a JSON string representation of ItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
