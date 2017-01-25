package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Results of the Worksheet Checkup report
 */
public class FilingsCheckupModel {
    private ArrayList<FilingsCheckupAuthorityModel> authorities;

    /**
     * Getter for authorities - A collection of authorities in the report
     */
    public ArrayList<FilingsCheckupAuthorityModel> getAuthorities() {
        return this.authorities;
    }

    /**
     * Setter for authorities - A collection of authorities in the report
     */
    public void setAuthorities(ArrayList<FilingsCheckupAuthorityModel> authorities) {
        this.authorities = authorities;
    }

    


    /**
     * Returns a JSON string representation of FilingsCheckupModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    