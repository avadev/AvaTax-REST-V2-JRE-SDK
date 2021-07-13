package net.avalara.avatax.rest.client.models;

public class UserConfiguration {
    private int timeOutInMinute;
    private int maxRetryAttempt;

    public UserConfiguration() {
        this.timeOutInMinute = 2;
        this.maxRetryAttempt = 0;
    }

    public UserConfiguration(int timeOutInMinute, int maxRetryAttempt) {
        if (maxRetryAttempt < 0) {
            maxRetryAttempt = 0;
        }
        if (timeOutInMinute <= 0) {
            timeOutInMinute = 2;
        }
        this.timeOutInMinute = timeOutInMinute;
        this.maxRetryAttempt = maxRetryAttempt;
    }

    public int getTimeOutInMinute() {
        return this.timeOutInMinute;
    }

    public int getMaxRetryAttempt() {
        return this.maxRetryAttempt;
    }
}