package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.AvaTaxClientException;

public class AvaTaxServerError extends AvaTaxClientException
{
    public AvaTaxServerError(ErrorResult errorResult, Object erroneousRequest) {
        super(errorResult, erroneousRequest);
    }
}