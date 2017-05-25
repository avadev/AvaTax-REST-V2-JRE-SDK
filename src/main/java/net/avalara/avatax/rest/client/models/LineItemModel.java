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
 * Represents one line item in a transaction
 */
public class LineItemModel {


    private String number;

    /**
     * Getter for number;
     * Line number within this document
     */
    public String getnumber() {;
        return this.number;;
    }

    /**
     * Setter for number;
     * Line number within this document
     */
    public void setnumber(String value) {;
        this.number = value;;
    }


    private Decimal quantity;

    /**
     * Getter for quantity;
     * Quantity of items in this line
     */
    public Decimal getquantity() {;
        return this.quantity;;
    }

    /**
     * Setter for quantity;
     * Quantity of items in this line
     */
    public void setquantity(Decimal value) {;
        this.quantity = value;;
    }


    private Decimal amount;

    /**
     * Getter for amount;
     * Total amount for this line
     */
    public Decimal getamount() {;
        return this.amount;;
    }

    /**
     * Setter for amount;
     * Total amount for this line
     */
    public void setamount(Decimal value) {;
        this.amount = value;;
    }


    private AddressesModel addresses;

    /**
     * Getter for addresses;
     * Specify any differences for addresses between this line and the rest of the document
     */
    public AddressesModel getaddresses() {;
        return this.addresses;;
    }

    /**
     * Setter for addresses;
     * Specify any differences for addresses between this line and the rest of the document
     */
    public void setaddresses(AddressesModel value) {;
        this.addresses = value;;
    }


    private String taxCode;

    /**
     * Getter for taxCode;
     * Tax Code - System or Custom Tax Code.
     */
    public String gettaxCode() {;
        return this.taxCode;;
    }

    /**
     * Setter for taxCode;
     * Tax Code - System or Custom Tax Code.
     */
    public void settaxCode(String value) {;
        this.taxCode = value;;
    }


    private String customerUsageType;

    /**
     * Getter for customerUsageType;
     * Customer Usage Type - The client application customer or usage type.
     */
    public String getcustomerUsageType() {;
        return this.customerUsageType;;
    }

    /**
     * Setter for customerUsageType;
     * Customer Usage Type - The client application customer or usage type.
     */
    public void setcustomerUsageType(String value) {;
        this.customerUsageType = value;;
    }


    private String itemCode;

    /**
     * Getter for itemCode;
     * Item Code (SKU)
     */
    public String getitemCode() {;
        return this.itemCode;;
    }

    /**
     * Setter for itemCode;
     * Item Code (SKU)
     */
    public void setitemCode(String value) {;
        this.itemCode = value;;
    }


    private String exemptionCode;

    /**
     * Getter for exemptionCode;
     * Exemption number for this line
     */
    public String getexemptionCode() {;
        return this.exemptionCode;;
    }

    /**
     * Setter for exemptionCode;
     * Exemption number for this line
     */
    public void setexemptionCode(String value) {;
        this.exemptionCode = value;;
    }


    private Boolean? discounted;

    /**
     * Getter for discounted;
     * True if the document discount should be applied to this line
     */
    public Boolean? getdiscounted() {;
        return this.discounted;;
    }

    /**
     * Setter for discounted;
     * True if the document discount should be applied to this line
     */
    public void setdiscounted(Boolean? value) {;
        this.discounted = value;;
    }


    private Boolean? taxIncluded;

    /**
     * Getter for taxIncluded;
     * Indicates if line has Tax Included; defaults to false
     */
    public Boolean? gettaxIncluded() {;
        return this.taxIncluded;;
    }

    /**
     * Setter for taxIncluded;
     * Indicates if line has Tax Included; defaults to false
     */
    public void settaxIncluded(Boolean? value) {;
        this.taxIncluded = value;;
    }


    private String revenueAccount;

    /**
     * Getter for revenueAccount;
     * Revenue Account
     */
    public String getrevenueAccount() {;
        return this.revenueAccount;;
    }

    /**
     * Setter for revenueAccount;
     * Revenue Account
     */
    public void setrevenueAccount(String value) {;
        this.revenueAccount = value;;
    }


    private String ref1;

    /**
     * Getter for ref1;
     * Reference 1 - Client specific reference field
     */
    public String getref1() {;
        return this.ref1;;
    }

    /**
     * Setter for ref1;
     * Reference 1 - Client specific reference field
     */
    public void setref1(String value) {;
        this.ref1 = value;;
    }


    private String ref2;

    /**
     * Getter for ref2;
     * Reference 2 - Client specific reference field
     */
    public String getref2() {;
        return this.ref2;;
    }

    /**
     * Setter for ref2;
     * Reference 2 - Client specific reference field
     */
    public void setref2(String value) {;
        this.ref2 = value;;
    }


    private String description;

    /**
     * Getter for description;
     * Item description. This is required for SST transactions if an unmapped ItemCode is used.
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * Item description. This is required for SST transactions if an unmapped ItemCode is used.
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private String businessIdentificationNo;

    /**
     * Getter for businessIdentificationNo;
     * VAT business identification number for the customer for this line item. If you leave this field empty,
    * this line item will use whatever business identification number you provided at the transaction level.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public String getbusinessIdentificationNo() {;
        return this.businessIdentificationNo;;
    }

    /**
     * Setter for businessIdentificationNo;
     * VAT business identification number for the customer for this line item. If you leave this field empty,
    * this line item will use whatever business identification number you provided at the transaction level.
    * 
    * If you specify a VAT business identification number for the customer in this transaction and you have also set up
    * a business identification number for your company during company setup, this transaction will be treated as a 
    * business-to-business transaction for VAT purposes and it will be calculated according to VAT tax rules.
     */
    public void setbusinessIdentificationNo(String value) {;
        this.businessIdentificationNo = value;;
    }


    private TaxOverrideModel taxOverride;

    /**
     * Getter for taxOverride;
     * Specifies a tax override for this line
     */
    public TaxOverrideModel gettaxOverride() {;
        return this.taxOverride;;
    }

    /**
     * Setter for taxOverride;
     * Specifies a tax override for this line
     */
    public void settaxOverride(TaxOverrideModel value) {;
        this.taxOverride = value;;
    }


    private Dictionary<string, string> parameters;

    /**
     * Getter for parameters;
     * Special parameters that apply to this line within this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public Dictionary<string, string> getparameters() {;
        return this.parameters;;
    }

    /**
     * Setter for parameters;
     * Special parameters that apply to this line within this transaction.
    * To get a full list of available parameters, please use the /api/v2/definitions/parameters endpoint.
     */
    public void setparameters(Dictionary<string, string> value) {;
        this.parameters = value;;
    }


    /**
     * Returns a JSON string representation of LineItemModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
