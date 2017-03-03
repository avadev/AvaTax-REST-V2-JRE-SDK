package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Approve a set of filings.
 */
public class ApproveFilingsModel {
    private Boolean approve;

    /**
     * Getter for approve - Approve a set of filings.
     */
    public Boolean getApprove() {
        return this.approve;
    }

    /**
     * Setter for approve - Approve a set of filings.
     */
    public void setApprove(Boolean approve) {
        this.approve = approve;
    }

    


    /**
     * Returns a JSON string representation of ApproveFilingsModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    