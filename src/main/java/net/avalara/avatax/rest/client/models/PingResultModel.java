package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Ping Result Model
 */
public class PingResultModel {
    private String version;

    /**
     * Getter for version - Version number
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for version - Version number
     */
    public void setVersion(String version) {
        this.version = version;
    }

    
    private Boolean authenticated;

    /**
     * Getter for authenticated - Returns true if you provided authentication for this API call; false if you did not.
     */
    public Boolean getAuthenticated() {
        return this.authenticated;
    }

    /**
     * Setter for authenticated - Returns true if you provided authentication for this API call; false if you did not.
     */
    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    
    private AuthenticationTypeId authenticationType;

    /**
     * Getter for authenticationType - Returns the type of authentication you provided, if authenticated
     */
    public AuthenticationTypeId getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Setter for authenticationType - Returns the type of authentication you provided, if authenticated
     */
    public void setAuthenticationType(AuthenticationTypeId authenticationType) {
        this.authenticationType = authenticationType;
    }

    
    private String authenticatedUserName;

    /**
     * Getter for authenticatedUserName - The username of the currently authenticated user, if any.
     */
    public String getAuthenticatedUserName() {
        return this.authenticatedUserName;
    }

    /**
     * Setter for authenticatedUserName - The username of the currently authenticated user, if any.
     */
    public void setAuthenticatedUserName(String authenticatedUserName) {
        this.authenticatedUserName = authenticatedUserName;
    }

    


    /**
     * Returns a JSON string representation of PingResultModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    