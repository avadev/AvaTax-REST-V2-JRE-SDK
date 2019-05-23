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
 * Represents a fixup change
 */
public class TransactionReferenceFieldModel {


    private Long documentId;

    /**
     * Getter for documentId
     *
     * The id of the transaction
     */
    public Long getDocumentId() {
        return this.documentId;
    }

    /**
     * Setter for documentId
     *
     * The id of the transaction
     */
    public void setDocumentId(Long value) {
        this.documentId = value;
    }


    private String reportingLocationCode;

    /**
     * Getter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
    *  
    * This value is used by Avalara Managed Returns to group documents together by reporting locations
    * for tax authorities that require location-based reporting.
     */
    public String getReportingLocationCode() {
        return this.reportingLocationCode;
    }

    /**
     * Setter for reportingLocationCode
     *
     * Sets the sale location code (Outlet ID) for reporting this document to the tax authority.
    *  
    * This value is used by Avalara Managed Returns to group documents together by reporting locations
    * for tax authorities that require location-based reporting.
     */
    public void setReportingLocationCode(String value) {
        this.reportingLocationCode = value;
    }


    private ArrayList<LineDetailSERCodeModel> lineDetailSerCodes;

    /**
     * Getter for lineDetailSerCodes
     *
     * Reference field of the line details
     */
    public ArrayList<LineDetailSERCodeModel> getLineDetailSerCodes() {
        return this.lineDetailSerCodes;
    }

    /**
     * Setter for lineDetailSerCodes
     *
     * Reference field of the line details
     */
    public void setLineDetailSerCodes(ArrayList<LineDetailSERCodeModel> value) {
        this.lineDetailSerCodes = value;
    }


    /**
     * Returns a JSON string representation of TransactionReferenceFieldModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
