package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Model to add specific lines to exising transaction
 */
public class AddTransactionLineModel {
    private String transactionCode;

    /**
     * Getter for transactionCode - Model to add specific lines to exising transaction
     */
    public String getTransactionCode() {
        return this.transactionCode;
    }

    /**
     * Setter for transactionCode - Model to add specific lines to exising transaction
     */
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Model to add specific lines to exising transaction
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Model to add specific lines to exising transaction
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private DocumentType documentType;

    /**
     * Getter for documentType - Model to add specific lines to exising transaction
     */
    public DocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType - Model to add specific lines to exising transaction
     */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    
    private ArrayList<LineItemModel> lines;

    /**
     * Getter for lines - Model to add specific lines to exising transaction
     */
    public ArrayList<LineItemModel> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines - Model to add specific lines to exising transaction
     */
    public void setLines(ArrayList<LineItemModel> lines) {
        this.lines = lines;
    }

    
    private Boolean renumber;

    /**
     * Getter for renumber - Model to add specific lines to exising transaction
     */
    public Boolean getRenumber() {
        return this.renumber;
    }

    /**
     * Setter for renumber - Model to add specific lines to exising transaction
     */
    public void setRenumber(Boolean renumber) {
        this.renumber = renumber;
    }

    


    /**
     * Returns a JSON string representation of AddTransactionLineModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    