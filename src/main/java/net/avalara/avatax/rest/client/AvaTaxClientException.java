package net.avalara.avatax.rest.client;

import net.avalara.avatax.rest.client.enums.DocumentType;
import net.avalara.avatax.rest.client.models.ErrorResult;

public class AvaTaxClientException extends Exception {
    private ErrorResult errorResult = null;

    private Object erroneousRequest;

    public AvaTaxClientException(String message) {
        super(message);
    }

    public AvaTaxClientException(ErrorResult errorResult, Object erroneousRequest) {
        super(errorResult.toString());
        this.errorResult = errorResult;
        this.erroneousRequest = erroneousRequest;
    }

    public ErrorResult getErrorResult() {
        return this.errorResult;
    }

    public Object getErroneousRequest() {
        return this.erroneousRequest;
    }
}
