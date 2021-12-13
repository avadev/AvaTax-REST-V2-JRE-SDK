package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/*
 * AvaTax Software Development Kit for Java JRE based environments
 *
 * (c) 2004-2018 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2018 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 * Swagger name: AvaTaxClient
 */

/**
 * This object is used to keep track of custom information about a company.
*  
* The company settings system is a metadata system that you can use to store extra information
* about a company. Your integration or connector could use this data storage to keep track of
* preference information, reminders, or any other storage that would need to persist even if
* the customer uninstalls your application.
*  
* A setting can refer to any type of data you need to remember about this company object.
* When creating this object, you may define your own `set`, `name`, and `value` parameters.
* To define your own values, please choose a `set` name that begins with `X-` to indicate an extension.
 */
public class SettingModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this setting.
	 * 
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this setting.
     */
    public void setId(Integer value) {
        this.id = value;
    }

    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company this setting refers to.
	 * 
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company this setting refers to.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }

    private String set;

    /**
     * Getter for set
     *
     * A user-defined "set" containing this setting.
    *  
    * Avalara defines some sets that cannot be changed. To create your own set, choose a set
    * name that begins with `X-` to indicate that this is an extension value.
    *  
    * We recommend that you choose a set name that clearly identifies your application, and then
    * store data within name/value pairs within that set. For example, if you were creating an
    * application called MyApp, you might choose to create a set named `X-MyCompany-MyApp`.
	 * 
     */
    public String getSet() {
        return this.set;
    }

    /**
     * Setter for set
     *
     * A user-defined "set" containing this setting.
    *  
    * Avalara defines some sets that cannot be changed. To create your own set, choose a set
    * name that begins with `X-` to indicate that this is an extension value.
    *  
    * We recommend that you choose a set name that clearly identifies your application, and then
    * store data within name/value pairs within that set. For example, if you were creating an
    * application called MyApp, you might choose to create a set named `X-MyCompany-MyApp`.
     */
    public void setSet(String value) {
        this.set = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * A user-defined "name" for this name-value pair.
	 * 
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A user-defined "name" for this name-value pair.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String value;

    /**
     * Getter for value
     *
     * The value of this name-value pair.
	 * 
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value of this name-value pair.
     */
    public void setValue(String value) {
        this.value = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The value when the entry was last modified.
	 * 
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The value when the entry was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The value identifying who last modified the entry.
	 * 
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The value identifying who last modified the entry.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }

    /**
     * Returns a JSON string representation of SettingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
