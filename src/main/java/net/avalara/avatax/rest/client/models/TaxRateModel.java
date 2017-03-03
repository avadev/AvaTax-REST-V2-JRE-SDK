package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Tax Rate Model
 */
public class TaxRateModel {
    private BigDecimal totalRate;

    /**
     * Getter for totalRate - Tax Rate Model
     */
    public BigDecimal getTotalRate() {
        return this.totalRate;
    }

    /**
     * Setter for totalRate - Tax Rate Model
     */
    public void setTotalRate(BigDecimal totalRate) {
        this.totalRate = totalRate;
    }

    
    private ArrayList<RateModel> rates;

    /**
     * Getter for rates - Tax Rate Model
     */
    public ArrayList<RateModel> getRates() {
        return this.rates;
    }

    /**
     * Setter for rates - Tax Rate Model
     */
    public void setRates(ArrayList<RateModel> rates) {
        this.rates = rates;
    }

    


    /**
     * Returns a JSON string representation of TaxRateModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    