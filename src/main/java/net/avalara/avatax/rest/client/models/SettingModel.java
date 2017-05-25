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


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this setting.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this setting.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company this setting refers to.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company this setting refers to.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private String set;

    /**
     * Getter for set;
     * A user-defined "set" containing this name-value pair.
     */
    public String getset() {;
        return this.set;;
    }

    /**
     * Setter for set;
     * A user-defined "set" containing this name-value pair.
     */
    public void setset(String value) {;
        this.set = value;;
    }


    private String name;

    /**
     * Getter for name;
     * A user-defined "name" for this name-value pair.
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * A user-defined "name" for this name-value pair.
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private String value;

    /**
     * Getter for value;
     * The value of this name-value pair.
     */
    public String getvalue() {;
        return this.value;;
    }

    /**
     * Setter for value;
     * The value of this name-value pair.
     */
    public void setvalue(String value) {;
        this.value = value;;
    }


    /**
     * Returns a JSON string representation of SettingModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
