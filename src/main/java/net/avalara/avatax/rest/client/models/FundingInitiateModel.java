package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * 
 */
public class FundingInitiateModel {
    private Boolean requestEmail;

    /**
     * Getter for requestEmail - 
     */
    public Boolean getRequestEmail() {
        return this.requestEmail;
    }

    /**
     * Setter for requestEmail - 
     */
    public void setRequestEmail(Boolean requestEmail) {
        this.requestEmail = requestEmail;
    }

    
    private String fundingEmailRecipient;

    /**
     * Getter for fundingEmailRecipient - 
     */
    public String getFundingEmailRecipient() {
        return this.fundingEmailRecipient;
    }

    /**
     * Setter for fundingEmailRecipient - 
     */
    public void setFundingEmailRecipient(String fundingEmailRecipient) {
        this.fundingEmailRecipient = fundingEmailRecipient;
    }

    
    private Boolean requestWidget;

    /**
     * Getter for requestWidget - 
     */
    public Boolean getRequestWidget() {
        return this.requestWidget;
    }

    /**
     * Setter for requestWidget - 
     */
    public void setRequestWidget(Boolean requestWidget) {
        this.requestWidget = requestWidget;
    }

    


    /**
     * Returns a JSON string representation of FundingInitiateModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    