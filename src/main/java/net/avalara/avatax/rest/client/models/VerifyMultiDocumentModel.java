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
 * Verify that a MultiDocument object matches the information in your accounting system.
* 
* If all attributes of the MultiDocument object match the values in your request, the
* MultiDocument object will be moved to the document status `Posted`.
* 
* For more information on document status, see [DocumentStatus](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentStatus/).
 */
public class VerifyMultiDocumentModel {


    private String code;

    /**
     * Getter for code
     *
     * Represents the unique code of this MultiDocument transaction.
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Represents the unique code of this MultiDocument transaction.
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public void setCode(String value) {
        this.code = value;
    }


    private DocumentType type;

    /**
     * Getter for type
     *
     * Represents the document type of this MultiDocument transaction. For more information about
    * document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/).
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public DocumentType getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * Represents the document type of this MultiDocument transaction. For more information about
    * document types, see [DocumentType](https://developer.avalara.com/api-reference/avatax/rest/v2/models/enums/DocumentType/).
    * 
    * A MultiDocument transaction is uniquely identified by its `accountId`, `code`, and `type`.
     */
    public void setType(DocumentType value) {
        this.type = value;
    }


    private Date verifyTransactionDate;

    /**
     * Getter for verifyTransactionDate
     *
     * Set this value if you wish to verify a match between `verifyTransactionDate` and
    * the `documentDate` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public Date getVerifyTransactionDate() {
        return this.verifyTransactionDate;
    }

    /**
     * Setter for verifyTransactionDate
     *
     * Set this value if you wish to verify a match between `verifyTransactionDate` and
    * the `documentDate` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public void setVerifyTransactionDate(Date value) {
        this.verifyTransactionDate = value;
    }


    private BigDecimal verifyTotalAmount;

    /**
     * Getter for verifyTotalAmount
     *
     * Set this value if you wish to verify a match between `verifyTotalAmount` and
    * the `totalAmount` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public BigDecimal getVerifyTotalAmount() {
        return this.verifyTotalAmount;
    }

    /**
     * Setter for verifyTotalAmount
     *
     * Set this value if you wish to verify a match between `verifyTotalAmount` and
    * the `totalAmount` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public void setVerifyTotalAmount(BigDecimal value) {
        this.verifyTotalAmount = value;
    }


    private BigDecimal verifyTotalTax;

    /**
     * Getter for verifyTotalTax
     *
     * Set this value if you wish to verify a match between `verifyTotalTax` and
    * the `totalTax` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public BigDecimal getVerifyTotalTax() {
        return this.verifyTotalTax;
    }

    /**
     * Setter for verifyTotalTax
     *
     * Set this value if you wish to verify a match between `verifyTotalTax` and
    * the `totalTax` value on the transaction recorded in AvaTax.
    * 
    * If you leave this field empty, we will skip verification for this field.
     */
    public void setVerifyTotalTax(BigDecimal value) {
        this.verifyTotalTax = value;
    }


    /**
     * Returns a JSON string representation of VerifyMultiDocumentModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
