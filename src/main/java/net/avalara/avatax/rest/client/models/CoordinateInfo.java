package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Coordinate Info
 */
public class CoordinateInfo {
    private BigDecimal latitude;

    /**
     * Getter for latitude - Latitude
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for latitude - Latitude
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    
    private BigDecimal longitude;

    /**
     * Getter for longitude - Longitude
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for longitude - Longitude
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    


    /**
     * Returns a JSON string representation of CoordinateInfo.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    