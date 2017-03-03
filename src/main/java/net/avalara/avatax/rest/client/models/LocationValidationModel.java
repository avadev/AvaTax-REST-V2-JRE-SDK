package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tells you whether this location object has been correctly set up to the local jurisdiction's standards
 */
public class LocationValidationModel {
    private Boolean settingsValidated;

    /**
     * Getter for settingsValidated - Tells you whether this location object has been correctly set up to the local jurisdiction's standards
     */
    public Boolean getSettingsValidated() {
        return this.settingsValidated;
    }

    /**
     * Setter for settingsValidated - Tells you whether this location object has been correctly set up to the local jurisdiction's standards
     */
    public void setSettingsValidated(Boolean settingsValidated) {
        this.settingsValidated = settingsValidated;
    }

    
    private ArrayList<LocationQuestionModel> requiredSettings;

    /**
     * Getter for requiredSettings - Tells you whether this location object has been correctly set up to the local jurisdiction's standards
     */
    public ArrayList<LocationQuestionModel> getRequiredSettings() {
        return this.requiredSettings;
    }

    /**
     * Setter for requiredSettings - Tells you whether this location object has been correctly set up to the local jurisdiction's standards
     */
    public void setRequiredSettings(ArrayList<LocationQuestionModel> requiredSettings) {
        this.requiredSettings = requiredSettings;
    }

    


    /**
     * Returns a JSON string representation of LocationValidationModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    