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
     * Getter for latitude - Coordinate Info
     */
    public BigDecimal getLatitude() {
        return this.latitude;
    }

    /**
     * Setter for latitude - Coordinate Info
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    
    private BigDecimal longitude;

    /**
     * Getter for longitude - Coordinate Info
     */
    public BigDecimal getLongitude() {
        return this.longitude;
    }

    /**
     * Setter for longitude - Coordinate Info
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
    