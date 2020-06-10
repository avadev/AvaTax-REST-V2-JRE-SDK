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
 * Represents information about location types stored in a line
 */
public class TransactionLineLocationTypeModel {


    private Long documentLineLocationTypeId;

    /**
     * Getter for documentLineLocationTypeId
     *
     * The unique ID number of this line location address model
     */
    public Long getDocumentLineLocationTypeId() {
        return this.documentLineLocationTypeId;
    }

    /**
     * Setter for documentLineLocationTypeId
     *
     * The unique ID number of this line location address model
     */
    public void setDocumentLineLocationTypeId(Long value) {
        this.documentLineLocationTypeId = value;
    }


    private Long documentLineId;

    /**
     * Getter for documentLineId
     *
     * The unique ID number of the document line associated with this line location address model
     */
    public Long getDocumentLineId() {
        return this.documentLineId;
    }

    /**
     * Setter for documentLineId
     *
     * The unique ID number of the document line associated with this line location address model
     */
    public void setDocumentLineId(Long value) {
        this.documentLineId = value;
    }


    private Long documentAddressId;

    /**
     * Getter for documentAddressId
     *
     * The address ID corresponding to this model
     */
    public Long getDocumentAddressId() {
        return this.documentAddressId;
    }

    /**
     * Setter for documentAddressId
     *
     * The address ID corresponding to this model
     */
    public void setDocumentAddressId(Long value) {
        this.documentAddressId = value;
    }


    private String locationTypeCode;

    /**
     * Getter for locationTypeCode
     *
     * The location type code corresponding to this model
     */
    public String getLocationTypeCode() {
        return this.locationTypeCode;
    }

    /**
     * Setter for locationTypeCode
     *
     * The location type code corresponding to this model
     */
    public void setLocationTypeCode(String value) {
        this.locationTypeCode = value;
    }


    /**
     * Returns a JSON string representation of TransactionLineLocationTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
