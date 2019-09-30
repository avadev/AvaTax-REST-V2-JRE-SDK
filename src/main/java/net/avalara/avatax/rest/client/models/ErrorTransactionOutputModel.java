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
 * Error Transaction Model
 */
public class ErrorTransactionOutputModel {


    private ErrorCodeId errorCode;

    /**
     * Getter for errorCode
     *
     * Error code of the error result from transaction creation
     */
    public ErrorCodeId getErrorCode() {
        return this.errorCode;
    }

    /**
     * Setter for errorCode
     *
     * Error code of the error result from transaction creation
     */
    public void setErrorCode(ErrorCodeId value) {
        this.errorCode = value;
    }


    private String errorMessage;

    /**
     * Getter for errorMessage
     *
     * Error message of the error result from transaction creation
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for errorMessage
     *
     * Error message of the error result from transaction creation
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }


    private String avataxErrorJson;

    /**
     * Getter for avataxErrorJson
     *
     * The full JSON of the error result from transaction creation
     */
    public String getAvataxErrorJson() {
        return this.avataxErrorJson;
    }

    /**
     * Setter for avataxErrorJson
     *
     * The full JSON of the error result from transaction creation
     */
    public void setAvataxErrorJson(String value) {
        this.avataxErrorJson = value;
    }


    private String avataxCreateTransactionJson;

    /**
     * Getter for avataxCreateTransactionJson
     *
     * The full JSON of the transaction creation request
     */
    public String getAvataxCreateTransactionJson() {
        return this.avataxCreateTransactionJson;
    }

    /**
     * Setter for avataxCreateTransactionJson
     *
     * The full JSON of the transaction creation request
     */
    public void setAvataxCreateTransactionJson(String value) {
        this.avataxCreateTransactionJson = value;
    }


    private String datasource;

    /**
     * Getter for datasource
     *
     * The datasource instance that made the transaction creation call
     */
    public String getDatasource() {
        return this.datasource;
    }

    /**
     * Setter for datasource
     *
     * The datasource instance that made the transaction creation call
     */
    public void setDatasource(String value) {
        this.datasource = value;
    }


    private Date documentDate;

    /**
     * Getter for documentDate
     *
     * The date of the document
     */
    public Date getDocumentDate() {
        return this.documentDate;
    }

    /**
     * Setter for documentDate
     *
     * The date of the document
     */
    public void setDocumentDate(Date value) {
        this.documentDate = value;
    }


    private DocumentType documentType;

    /**
     * Getter for documentType
     *
     * Type of transaction of the error transaction
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
     * Returns a JSON string representation of ErrorTransactionOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
