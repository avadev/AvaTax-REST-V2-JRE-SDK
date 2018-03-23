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
 * Model to add specific lines to exising transaction
 */
public class AddTransactionLineModel {


    private String companyCode;

    /**
     * Getter for companyCode
     *
     * company code
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode
     *
     * company code
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }


    private String transactionCode;

    /**
     * Getter for transactionCode
     *
     * document code for the transaction to add lines
     */
    public String getTransactionCode() {
        return this.transactionCode;
    }

    /**
     * Setter for transactionCode
     *
     * document code for the transaction to add lines
     */
    public void setTransactionCode(String value) {
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


    private ArrayList<LineItemModel> lines;

    /**
     * Getter for lines
     *
     * List of lines to be added
     */
    public ArrayList<LineItemModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines
     *
     * List of lines to be added
     */
    public void setLines(ArrayList<LineItemModel> value) {
        this.lines = value;
    }


    private Boolean renumber;

    /**
     * Getter for renumber
     *
     * Option to renumber lines after add. After renumber, the line number becomes: "1", "2", "3", ...
     */
    public Boolean getRenumber() {
        return this.renumber;
    }

    /**
     * Setter for renumber
     *
     * Option to renumber lines after add. After renumber, the line number becomes: "1", "2", "3", ...
     */
    public void setRenumber(Boolean value) {
        this.renumber = value;
    }


    /**
     * Returns a JSON string representation of AddTransactionLineModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
