package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Set Password Model
 */
public class SetPasswordModel {
    private String newPassword;

    /**
     * Getter for newPassword - Set Password Model
     */
    public String getNewPassword() {
        return this.newPassword;
    }

    /**
     * Setter for newPassword - Set Password Model
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    


    /**
     * Returns a JSON string representation of SetPasswordModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    