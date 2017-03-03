package net.avalara.avatax.rest.client;

import net.avalara.avatax.rest.client.models.ErrorResult;

public class AvaTaxClientException extends Exception {
    private ErrorResult errorResult = null;

    public AvaTaxClientException(String message) {
        super(message);
    }

    public AvaTaxClientException(ErrorResult errorResult) {
        super(errorResult.toString());
        this.errorResult = errorResult;
    }

    public ErrorResult getErrorResult() {
        return this.errorResult;
    }
}
