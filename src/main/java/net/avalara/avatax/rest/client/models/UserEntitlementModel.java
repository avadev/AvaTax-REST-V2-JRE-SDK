package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * User Entitlement Model
 */
public class UserEntitlementModel {
    private ArrayList<String> permissions;

    /**
     * Getter for permissions - User Entitlement Model
     */
    public ArrayList<String> getPermissions() {
        return this.permissions;
    }

    /**
     * Setter for permissions - User Entitlement Model
     */
    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    
    private CompanyAccessLevel accessLevel;

    /**
     * Getter for accessLevel - User Entitlement Model
     */
    public CompanyAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * Setter for accessLevel - User Entitlement Model
     */
    public void setAccessLevel(CompanyAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    
    private ArrayList<Integer> companies;

    /**
     * Getter for companies - User Entitlement Model
     */
    public ArrayList<Integer> getCompanies() {
        return this.companies;
    }

    /**
     * Setter for companies - User Entitlement Model
     */
    public void setCompanies(ArrayList<Integer> companies) {
        this.companies = companies;
    }

    


    /**
     * Returns a JSON string representation of UserEntitlementModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    