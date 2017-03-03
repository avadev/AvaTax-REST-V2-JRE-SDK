package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Password Change Model
 */
public class PasswordChangeModel {
    private String oldPassword;

    /**
     * Getter for oldPassword - Password Change Model
     */
    public String getOldPassword() {
        return this.oldPassword;
    }

    /**
     * Setter for oldPassword - Password Change Model
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    
    private String newPassword;

    /**
     * Getter for newPassword - Password Change Model
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * Setter for newPassword - Password Change Model
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    


    /**
     * Returns a JSON string representation of PasswordChangeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    