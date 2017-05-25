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
 * Results of the Worksheet Checkup report
 */
public class FilingsCheckupModel {


    private FilingsCheckupAuthorityModel[] authorities;

    /**
     * Getter for authorities
     *
     * A collection of authorities in the report
     */
    public FilingsCheckupAuthorityModel[] getAuthorities() {
        return this.authorities;
    }

    /**
     * Setter for authorities
     *
     * A collection of authorities in the report
     */
    public void setAuthorities(FilingsCheckupAuthorityModel[] value) {
        this.authorities = value;
    }


    /**
     * Returns a JSON string representation of FilingsCheckupModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
