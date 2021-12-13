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
 * Swagger name: AvaTaxClient
 */

/**
 * A request to void a previously created transaction.
 */
public class BatchVoidTransactionModel {


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * Company Code - Specify the code of the company for this transaction.
	 * 
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * Company Code - Specify the code of the company for this transaction.
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    private String transactionCode;

    /**
     * Getter for transactionCode
     *
     * Please specify the transaction code of the transacion to void.
	 * 
     */
    public String getTransactionCode() {
        return this.transactionCode;
    }

    /**
     * Setter for transactionCode
     *
     * Please specify the transaction code of the transacion to void.
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    private String documentType;

    /**
     * Getter for documentType
     *
     * Specifies the type of document to void.
	 * 
     */
    public String getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType
     *
     * Specifies the type of document to void.
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    private VoidReasonCode code;

    /**
     * Getter for code
     *
     * Please specify the reason for voiding or cancelling this transaction.
    * To void the transaction, please specify the reason 'DocVoided'.
    * If you do not provide a reason, the void command will fail.
	 * 
     */
    public VoidReasonCode getCode() {
        return this.code;
    }

    /**
     * Setter for code
     *
     * Please specify the reason for voiding or cancelling this transaction.
    * To void the transaction, please specify the reason 'DocVoided'.
    * If you do not provide a reason, the void command will fail.
     */
    public void setCode(VoidReasonCode value) {
        this.code = value;
    }

    /**
     * Returns a JSON string representation of BatchVoidTransactionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
