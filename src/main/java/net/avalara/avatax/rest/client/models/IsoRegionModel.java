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
 * Represents a region, province, or state within a country
 */
public class IsoRegionModel {


    private String countryCode;

    /**
     * Getter for countryCode;
     * The two-character ISO 3166 country code this region belongs to
     */
    public String getcountryCode() {;
        return this.countryCode;;
    }

    /**
     * Setter for countryCode;
     * The two-character ISO 3166 country code this region belongs to
     */
    public void setcountryCode(String value) {;
        this.countryCode = value;;
    }


    private String code;

    /**
     * Getter for code;
     * The three character ISO 3166 region code
     */
    public String getcode() {;
        return this.code;;
    }

    /**
     * Setter for code;
     * The three character ISO 3166 region code
     */
    public void setcode(String value) {;
        this.code = value;;
    }


    private String name;

    /**
     * Getter for name;
     * The full name, using localized characters, for this region
     */
    public String getname() {;
        return this.name;;
    }

    /**
     * Setter for name;
     * The full name, using localized characters, for this region
     */
    public void setname(String value) {;
        this.name = value;;
    }


    private String classification;

    /**
     * Getter for classification;
     * The word in the local language that classifies what type of a region this represents
     */
    public String getclassification() {;
        return this.classification;;
    }

    /**
     * Setter for classification;
     * The word in the local language that classifies what type of a region this represents
     */
    public void setclassification(String value) {;
        this.classification = value;;
    }


    private Boolean? streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax;
     * For the United States, this flag indicates whether a U.S. State participates in the Streamlined
    * Sales Tax program. For countries other than the US, this flag is null.
     */
    public Boolean? getstreamlinedSalesTax() {;
        return this.streamlinedSalesTax;;
    }

    /**
     * Setter for streamlinedSalesTax;
     * For the United States, this flag indicates whether a U.S. State participates in the Streamlined
    * Sales Tax program. For countries other than the US, this flag is null.
     */
    public void setstreamlinedSalesTax(Boolean? value) {;
        this.streamlinedSalesTax = value;;
    }


    /**
     * Returns a JSON string representation of IsoRegionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
