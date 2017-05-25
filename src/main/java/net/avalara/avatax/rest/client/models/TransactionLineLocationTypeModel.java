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
 * Represents information about location types stored in a line
 */
public class TransactionLineLocationTypeModel {


    private Int64? documentLineLocationTypeId;

    /**
     * Getter for documentLineLocationTypeId;
     * The unique ID number of this line location address model
     */
    public Int64? getdocumentLineLocationTypeId() {;
        return this.documentLineLocationTypeId;;
    }

    /**
     * Setter for documentLineLocationTypeId;
     * The unique ID number of this line location address model
     */
    public void setdocumentLineLocationTypeId(Int64? value) {;
        this.documentLineLocationTypeId = value;;
    }


    private Int64? documentLineId;

    /**
     * Getter for documentLineId;
     * The unique ID number of the document line associated with this line location address model
     */
    public Int64? getdocumentLineId() {;
        return this.documentLineId;;
    }

    /**
     * Setter for documentLineId;
     * The unique ID number of the document line associated with this line location address model
     */
    public void setdocumentLineId(Int64? value) {;
        this.documentLineId = value;;
    }


    private Int64? documentAddressId;

    /**
     * Getter for documentAddressId;
     * The address ID corresponding to this model
     */
    public Int64? getdocumentAddressId() {;
        return this.documentAddressId;;
    }

    /**
     * Setter for documentAddressId;
     * The address ID corresponding to this model
     */
    public void setdocumentAddressId(Int64? value) {;
        this.documentAddressId = value;;
    }


    private String locationTypeCode;

    /**
     * Getter for locationTypeCode;
     * The location type code corresponding to this model
     */
    public String getlocationTypeCode() {;
        return this.locationTypeCode;;
    }

    /**
     * Setter for locationTypeCode;
     * The location type code corresponding to this model
     */
    public void setlocationTypeCode(String value) {;
        this.locationTypeCode = value;;
    }


    /**
     * Returns a JSON string representation of TransactionLineLocationTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
