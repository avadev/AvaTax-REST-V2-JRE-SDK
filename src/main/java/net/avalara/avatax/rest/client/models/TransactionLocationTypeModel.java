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
 * Information about a location type
 */
public class TransactionLocationTypeModel {


    private Int64? documentLocationTypeId;

    /**
     * Getter for documentLocationTypeId;
     * Location type ID for this location type in transaction
     */
    public Int64? getdocumentLocationTypeId() {;
        return this.documentLocationTypeId;;
    }

    /**
     * Setter for documentLocationTypeId;
     * Location type ID for this location type in transaction
     */
    public void setdocumentLocationTypeId(Int64? value) {;
        this.documentLocationTypeId = value;;
    }


    private Int64? documentId;

    /**
     * Getter for documentId;
     * Transaction ID
     */
    public Int64? getdocumentId() {;
        return this.documentId;;
    }

    /**
     * Setter for documentId;
     * Transaction ID
     */
    public void setdocumentId(Int64? value) {;
        this.documentId = value;;
    }


    private Int64? documentAddressId;

    /**
     * Getter for documentAddressId;
     * Address ID for the transaction
     */
    public Int64? getdocumentAddressId() {;
        return this.documentAddressId;;
    }

    /**
     * Setter for documentAddressId;
     * Address ID for the transaction
     */
    public void setdocumentAddressId(Int64? value) {;
        this.documentAddressId = value;;
    }


    private String locationTypeCode;

    /**
     * Getter for locationTypeCode;
     * Location type code
     */
    public String getlocationTypeCode() {;
        return this.locationTypeCode;;
    }

    /**
     * Setter for locationTypeCode;
     * Location type code
     */
    public void setlocationTypeCode(String value) {;
        this.locationTypeCode = value;;
    }


    /**
     * Returns a JSON string representation of TransactionLocationTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
