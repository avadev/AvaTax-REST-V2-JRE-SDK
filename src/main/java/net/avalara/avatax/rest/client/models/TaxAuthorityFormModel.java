package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a form that can be filed with a tax authority.
 */
public class TaxAuthorityFormModel {
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Represents a form that can be filed with a tax authority.
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Represents a form that can be filed with a tax authority.
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String formName;

    /**
     * Getter for formName - Represents a form that can be filed with a tax authority.
     */
    public String getFormName() {
        return this.formName;
    }

    /**
     * Setter for formName - Represents a form that can be filed with a tax authority.
     */
    public void setFormName(String formName) {
        this.formName = formName;
    }

    


    /**
     * Returns a JSON string representation of TaxAuthorityFormModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    