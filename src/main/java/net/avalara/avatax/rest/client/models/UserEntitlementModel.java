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
     * Getter for permissions - List of API names and categories that this user is permitted to access
     */
    public ArrayList<String> getPermissions() {
        return this.permissions;
    }

    /**
     * Setter for permissions - List of API names and categories that this user is permitted to access
     */
    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    
    private CompanyAccessLevel accessLevel;

    /**
     * Getter for accessLevel - What access privileges does the current user have to see companies?
     */
    public CompanyAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * Setter for accessLevel - What access privileges does the current user have to see companies?
     */
    public void setAccessLevel(CompanyAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    
    private ArrayList<Integer> companies;

    /**
     * Getter for companies - The identities of all companies this user is permitted to access
     */
    public ArrayList<Integer> getCompanies() {
        return this.companies;
    }

    /**
     * Setter for companies - The identities of all companies this user is permitted to access
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
    