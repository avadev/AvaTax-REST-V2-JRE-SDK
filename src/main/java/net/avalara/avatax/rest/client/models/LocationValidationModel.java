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
     * Getter for settingsValidated - True if the location has a value for each jurisdiction-required setting.
            The user is required to ensure that the values are correct according to the jurisdiction; this flag
            does not indicate whether the taxing jurisdiction has accepted the data you have provided.
     */
    public Boolean getSettingsValidated() {
        return this.settingsValidated;
    }

    /**
     * Setter for settingsValidated - True if the location has a value for each jurisdiction-required setting.
            The user is required to ensure that the values are correct according to the jurisdiction; this flag
            does not indicate whether the taxing jurisdiction has accepted the data you have provided.
     */
    public void setSettingsValidated(Boolean settingsValidated) {
        this.settingsValidated = settingsValidated;
    }

    
    private ArrayList<LocationQuestionModel> requiredSettings;

    /**
     * Getter for requiredSettings - A list of settings that must be defined for this location
     */
    public ArrayList<LocationQuestionModel> getRequiredSettings() {
        return this.requiredSettings;
    }

    /**
     * Setter for requiredSettings - A list of settings that must be defined for this location
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
    