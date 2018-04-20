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
 * Information about a location type
 */
public class TransactionLocationTypeModel {


    private Long documentLocationTypeId;

    /**
     * Getter for documentLocationTypeId
     *
     * Location type ID for this location type in transaction
     */
    public Long getDocumentLocationTypeId() {
        return this.documentLocationTypeId;
    }

    /**
     * Setter for documentLocationTypeId
     *
     * Location type ID for this location type in transaction
     */
    public void setDocumentLocationTypeId(Long value) {
        this.documentLocationTypeId = value;
    }


    private Long documentId;

    /**
     * Getter for documentId
     *
     * Transaction ID
     */
    public Long getDocumentId() {
        return this.documentId;
    }

    /**
     * Setter for documentId
     *
     * Transaction ID
     */
    public void setDocumentId(Long value) {
        this.documentId = value;
    }


    private Long documentAddressId;

    /**
     * Getter for documentAddressId
     *
     * Address ID for the transaction
     */
    public Long getDocumentAddressId() {
        return this.documentAddressId;
    }

    /**
     * Setter for documentAddressId
     *
     * Address ID for the transaction
     */
    public void setDocumentAddressId(Long value) {
        this.documentAddressId = value;
    }


    private String locationTypeCode;

    /**
     * Getter for locationTypeCode
     *
     * Location type code
     */
    public String getLocationTypeCode() {
        return this.locationTypeCode;
    }

    /**
     * Setter for locationTypeCode
     *
     * Location type code
     */
    public void setLocationTypeCode(String value) {
        this.locationTypeCode = value;
    }


    /**
     * Returns a JSON string representation of TransactionLocationTypeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
