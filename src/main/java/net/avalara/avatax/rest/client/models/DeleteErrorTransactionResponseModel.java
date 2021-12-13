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
 * Response model of a single error transaction delete
 */
public class DeleteErrorTransactionResponseModel {


    private AvataxDeleteErrorTransactionStatus result;

    /**
     * Getter for result
     *
     * Result of the deletion
	 * 
     */
    public AvataxDeleteErrorTransactionStatus getResult() {
        return this.result;
    }

    /**
     * Setter for result
     *
     * Result of the deletion
     */
    public void setResult(AvataxDeleteErrorTransactionStatus value) {
        this.result = value;
    }

    private DocumentType documentType;

    /**
     * Getter for documentType
     *
     * Type of transaction of the error transaction
	 * 
     */
    public DocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType
     *
     * Type of transaction of the error transaction
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    private String documentCode;

    /**
     * Getter for documentCode
     *
     * The internal reference code (used by the client application) of the error transaction
	 * 
     */
    public String getDocumentCode() {
        return this.documentCode;
    }

    /**
     * Setter for documentCode
     *
     * The internal reference code (used by the client application) of the error transaction
     */
    public void setDocumentCode(String value) {
        this.documentCode = value;
    }

    /**
     * Returns a JSON string representation of DeleteErrorTransactionResponseModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
