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
 * Rate Model
 */
public class RateModel {


    private Decimal? rate;

    /**
     * Getter for rate;
     * Rate
     */
    public Decimal? getrate() {;
        return this.rate;;
    }

    /**
     * Setter for rate;
     * Rate
     */
    public void setrate(Decimal? value) {;
        this.rate = value;;
    }


    private String name;

    /**
     * Getter for name;
     * Name
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * Name
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private JurisdictionType? type;

    /**
     * Getter for type;
     * Type
     */
    public JurisdictionType? gettype() {;
        return this.type;;
    }

    /**
     * Setter for type;
     * Type
     */
    public void settype(JurisdictionType? value) {;
        this.type = value;;
    }


    /**
     * Returns a JSON string representation of RateModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
