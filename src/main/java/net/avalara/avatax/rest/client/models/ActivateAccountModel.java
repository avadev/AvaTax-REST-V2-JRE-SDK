package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a request to activate an account by reading and accepting its terms and conditions.
 */
public class ActivateAccountModel {
    private Boolean acceptAvalaraTermsAndConditions;

    /**
     * Getter for acceptAvalaraTermsAndConditions - Represents a request to activate an account by reading and accepting its terms and conditions.
     */
    public Boolean getAcceptAvalaraTermsAndConditions() {
        return this.acceptAvalaraTermsAndConditions;
    }

    /**
     * Setter for acceptAvalaraTermsAndConditions - Represents a request to activate an account by reading and accepting its terms and conditions.
     */
    public void setAcceptAvalaraTermsAndConditions(Boolean acceptAvalaraTermsAndConditions) {
        this.acceptAvalaraTermsAndConditions = acceptAvalaraTermsAndConditions;
    }

    
    private Boolean haveReadAvalaraTermsAndConditions;

    /**
     * Getter for haveReadAvalaraTermsAndConditions - Represents a request to activate an account by reading and accepting its terms and conditions.
     */
    public Boolean getHaveReadAvalaraTermsAndConditions() {
        return this.haveReadAvalaraTermsAndConditions;
    }

    /**
     * Setter for haveReadAvalaraTermsAndConditions - Represents a request to activate an account by reading and accepting its terms and conditions.
     */
    public void setHaveReadAvalaraTermsAndConditions(Boolean haveReadAvalaraTermsAndConditions) {
        this.haveReadAvalaraTermsAndConditions = haveReadAvalaraTermsAndConditions;
    }

    


    /**
     * Returns a JSON string representation of ActivateAccountModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    