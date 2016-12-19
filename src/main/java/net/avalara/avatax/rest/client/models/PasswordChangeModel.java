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
     * Getter for oldPassword - Old Password
     */
    public String getOldPassword() {
        return this.oldPassword;
    }

    /**
     * Setter for oldPassword - Old Password
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    
    private String newPassword;

    /**
     * Getter for newPassword - New Password
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * Setter for newPassword - New Password
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
    