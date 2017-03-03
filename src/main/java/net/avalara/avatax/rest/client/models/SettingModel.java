package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
 */
public class SettingModel {
    private String name;

    /**
     * Getter for name - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public void setName(String name) {
        this.name = name;
    }

    
    private String set;

    /**
     * Getter for set - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public String getSet() {
        return this.set;
    }

    /**
     * Setter for set - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public void setSet(String set) {
        this.set = set;
    }

    
    private Integer id;

    /**
     * Getter for id - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String value;

    /**
     * Getter for value - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public void setValue(String value) {
        this.value = value;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - This object is used to keep track of custom information about a company.
A setting can refer to any type of data you need to remember about this company object.
When creating this object, you may define your own "set", "name", and "value" parameters.
To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    


    /**
     * Returns a JSON string representation of SettingModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    