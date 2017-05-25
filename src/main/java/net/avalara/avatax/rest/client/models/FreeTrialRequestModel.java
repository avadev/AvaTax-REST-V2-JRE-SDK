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
 * Represents a request for a free trial account for AvaTax.
* Free trial accounts are only available on the Sandbox environment.
 */
public class FreeTrialRequestModel {


    private String firstName;

    /**
     * Getter for firstName;
     * The first or given name of the user requesting a free trial.
     */
    public String getfirstName() {;
        return this.firstName;;
    }

    /**
     * Setter for firstName;
     * The first or given name of the user requesting a free trial.
     */
    public void setfirstName(String value) {;
        this.firstName = value;;
    }


    private String lastName;

    /**
     * Getter for lastName;
     * The last or family name of the user requesting a free trial.
     */
    public String getlastName() {;
        return this.lastName;;
    }

    /**
     * Setter for lastName;
     * The last or family name of the user requesting a free trial.
     */
    public void setlastName(String value) {;
        this.lastName = value;;
    }


    private String email;

    /**
     * Getter for email;
     * The email address of the user requesting a free trial.
     */
    public String getemail() {;
        return this.email;;
    }

    /**
     * Setter for email;
     * The email address of the user requesting a free trial.
     */
    public void setemail(String value) {;
        this.email = value;;
    }


    private String company;

    /**
     * Getter for company;
     * The company or organizational name for this free trial. If this account is for personal use, it is acceptable 
    * to use your full name here.
     */
    public String getcompany() {;
        return this.company;;
    }

    /**
     * Setter for company;
     * The company or organizational name for this free trial. If this account is for personal use, it is acceptable 
    * to use your full name here.
     */
    public void setcompany(String value) {;
        this.company = value;;
    }


    private String phone;

    /**
     * Getter for phone;
     * The phone number of the person requesting the free trial.
     */
    public String getphone() {;
        return this.phone;;
    }

    /**
     * Setter for phone;
     * The phone number of the person requesting the free trial.
     */
    public void setphone(String value) {;
        this.phone = value;;
    }


    /**
     * Returns a JSON string representation of FreeTrialRequestModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
