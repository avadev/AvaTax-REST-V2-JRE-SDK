package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Rebuild a set of filings.
 */
public class RebuildFilingsModel {
    private Boolean rebuild;

    /**
     * Getter for rebuild - Set this value to true in order to rebuild the filings.
     */
    public Boolean getRebuild() {
        return this.rebuild;
    }

    /**
     * Setter for rebuild - Set this value to true in order to rebuild the filings.
     */
    public void setRebuild(Boolean rebuild) {
        this.rebuild = rebuild;
    }

    


    /**
     * Returns a JSON string representation of RebuildFilingsModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    