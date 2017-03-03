package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
 */
public class FreeTrialRequestModel {
    private String email;

    /**
     * Getter for email - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for email - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
    private String company;

    /**
     * Getter for company - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public String getCompany() {
        return this.company;
    }

    /**
     * Setter for company - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    
    private String lastName;

    /**
     * Getter for lastName - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for lastName - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    private String firstName;

    /**
     * Getter for firstName - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for firstName - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    private String phone;

    /**
     * Getter for phone - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for phone - Represents a request for a free trial account for AvaTax.
Free trial accounts are only available on the Sandbox environment.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    


    /**
     * Returns a JSON string representation of FreeTrialRequestModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    