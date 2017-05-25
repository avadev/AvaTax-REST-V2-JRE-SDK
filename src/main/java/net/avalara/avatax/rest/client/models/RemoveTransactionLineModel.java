package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Model to specify lines to be removed
 */
public class RemoveTransactionLineModel {
    private String transactionCode;

    /**
     * Getter for transactionCode - Model to specify lines to be removed
     */
    public String getTransactionCode() {
        return this.transactionCode;
    }

    /**
     * Setter for transactionCode - Model to specify lines to be removed
     */
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    
    private String companyCode;

    /**
     * Getter for companyCode - Model to specify lines to be removed
     */
    public String getCompanyCode() {
        return this.companyCode;
    }

    /**
     * Setter for companyCode - Model to specify lines to be removed
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    
    private DocumentType documentType;

    /**
     * Getter for documentType - Model to specify lines to be removed
     */
    public DocumentType getDocumentType() {
        return this.documentType;
    }

    /**
     * Setter for documentType - Model to specify lines to be removed
     */
    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    
    private ArrayList<String> lines;

    /**
     * Getter for lines - Model to specify lines to be removed
     */
    public ArrayList<String> getLines() {
        return this.lines;
    }

    /**
     * Setter for lines - Model to specify lines to be removed
     */
    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    
    private Boolean renumber;

    /**
     * Getter for renumber - Model to specify lines to be removed
     */
    public Boolean getRenumber() {
        return this.renumber;
    }

    /**
     * Setter for renumber - Model to specify lines to be removed
     */
    public void setRenumber(Boolean renumber) {
        this.renumber = renumber;
    }

    


    /**
     * Returns a JSON string representation of RemoveTransactionLineModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    