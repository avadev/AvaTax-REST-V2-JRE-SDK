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
 * Represents a verification request using Skyscraper for a company
 */
public class requiredFilingCalendarDataFieldModel {


    private String name;

    /**
     * Getter for name;
     * Region of the verification request
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * Region of the verification request
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private String description;

    /**
     * Getter for description;
     * Username that we are using for verification
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * Username that we are using for verification
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    /**
     * Returns a JSON string representation of requiredFilingCalendarDataFieldModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
