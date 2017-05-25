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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * This object is used to keep track of custom information about a company.
* A setting can refer to any type of data you need to remember about this company object.
* When creating this object, you may define your own "set", "name", and "value" parameters.
* To define your own values, please choose a "set" name that begins with "X-" to indicate an extension.
 */
public class SettingModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this setting.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this setting.
     */
    public void setId(int value) {
        this.id = value;
    }


    private int companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company this setting refers to.
     */
    public int getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company this setting refers to.
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }


    private string set;

    /**
     * Getter for set
     *
     * A user-defined "set" containing this name-value pair.
     */
    public string getSet() {
        return this.set;
    }

    /**
     * Setter for set
     *
     * A user-defined "set" containing this name-value pair.
     */
    public void setSet(string value) {
        this.set = value;
    }


    private string name;

    /**
     * Getter for name
     *
     * A user-defined "name" for this name-value pair.
     */
    public string getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A user-defined "name" for this name-value pair.
     */
    public void setName(string value) {
        this.name = value;
    }


    private string value;

    /**
     * Getter for value
     *
     * The value of this name-value pair.
     */
    public string getValue() {
        return this.value;
    }

    /**
     * Setter for value
     *
     * The value of this name-value pair.
     */
    public void setValue(string value) {
        this.value = value;
    }


    /**
     * Returns a JSON string representation of SettingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
