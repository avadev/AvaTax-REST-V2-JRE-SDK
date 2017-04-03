package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Information about Avalara-defined tax code types.
This list is used when creating tax codes and tax rules.
 */
public class TaxCodeTypesModel {
    private HashMap<String, String> types;

    /**
     * Getter for types - Information about Avalara-defined tax code types.
This list is used when creating tax codes and tax rules.
     */
    public HashMap<String, String> getTypes() {
        return this.types;
    }

    /**
     * Setter for types - Information about Avalara-defined tax code types.
This list is used when creating tax codes and tax rules.
     */
    public void setTypes(HashMap<String, String> types) {
        this.types = types;
    }

    


    /**
     * Returns a JSON string representation of TaxCodeTypesModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    