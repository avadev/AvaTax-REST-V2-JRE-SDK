package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Identifies all nexus that match a particular tax form
 */
public class NexusByTaxFormModel {
    private String formCode;

    /**
     * Getter for formCode - Identifies all nexus that match a particular tax form
     */
    public String getFormCode() {
        return this.formCode;
    }

    /**
     * Setter for formCode - Identifies all nexus that match a particular tax form
     */
    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Identifies all nexus that match a particular tax form
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Identifies all nexus that match a particular tax form
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private ArrayList<NexusModel> nexusDefinitions;

    /**
     * Getter for nexusDefinitions - Identifies all nexus that match a particular tax form
     */
    public ArrayList<NexusModel> getNexusDefinitions() {
        return this.nexusDefinitions;
    }

    /**
     * Setter for nexusDefinitions - Identifies all nexus that match a particular tax form
     */
    public void setNexusDefinitions(ArrayList<NexusModel> nexusDefinitions) {
        this.nexusDefinitions = nexusDefinitions;
    }

    
    private ArrayList<NexusModel> companyNexus;

    /**
     * Getter for companyNexus - Identifies all nexus that match a particular tax form
     */
    public ArrayList<NexusModel> getCompanyNexus() {
        return this.companyNexus;
    }

    /**
     * Setter for companyNexus - Identifies all nexus that match a particular tax form
     */
    public void setCompanyNexus(ArrayList<NexusModel> companyNexus) {
        this.companyNexus = companyNexus;
    }

    


    /**
     * Returns a JSON string representation of NexusByTaxFormModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    