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
 * Model to specify lines to be removed
 */
public class RemoveTransactionLineModel {


    private string companyCode;

    /**
     * Getter for companyCode
     *
     * company code
     */
    public string getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * company code
     */
    public void setCompanyCode(string value) {
        this.companyCode = value;
    }


    private string transactionCode;

    /**
     * Getter for transactionCode
     *
     * document code for the transaction to add lines
     */
    public string getTransactionCode() {
        return this.transactionCode;
    }

    /**
     * Setter for transactionCode
     *
     * document code for the transaction to add lines
     */
    public void setTransactionCode(string value) {
        this.transactionCode = value;
    }


    private DocumentType documentType;

    /**
     * Getter for documentType
     *
     * document type
     */
    public DocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType
     *
     * document type
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }


    private string[] lines;

    /**
     * Getter for lines
     *
     * List of lines to be added
     */
    public string[] getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * List of lines to be added
     */
    public void setLines(string[] value) {
        this.lines = value;
    }


    private object renumber;

    /**
     * Getter for renumber
     *
     * ption to renumber lines after removal. After renumber, the line number becomes: "1", "2", "3", ...
     */
    public object getRenumber() {
        return this.renumber;
    }

    /**
     * Setter for renumber
     *
     * ption to renumber lines after removal. After renumber, the line number becomes: "1", "2", "3", ...
     */
    public void setRenumber(object value) {
        this.renumber = value;
    }


    /**
     * Returns a JSON string representation of RemoveTransactionLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
