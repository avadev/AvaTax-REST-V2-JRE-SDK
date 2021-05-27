package net.avalara.avatax.rest.client.models;

public class UserConfiguration {
    public int timeOutInMinute;
    public int maxRetryAttempt;

    public UserConfiguration(){
        this.timeOutInMinute=2;
        this.maxRetryAttempt=0;
    }

    public UserConfiguration(int timeOutInMinute, int maxRetryAttempt){
        this.timeOutInMinute=timeOutInMinute;
        this.maxRetryAttempt=maxRetryAttempt;
    }
}
