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
 * Coordinate Info
 */
public class CoordinateInfo {


    private Decimal? latitude;

    /**
     * Getter for latitude;
     * Latitude
     */
    public Decimal? getlatitude() {;
        return this.latitude;;
    }

    /**
     * Setter for latitude;
     * Latitude
     */
    public void setlatitude(Decimal? value) {;
        this.latitude = value;;
    }


    private Decimal? longitude;

    /**
     * Getter for longitude;
     * Longitude
     */
    public Decimal? getlongitude() {;
        return this.longitude;;
    }

    /**
     * Setter for longitude;
     * Longitude
     */
    public void setlongitude(Decimal? value) {;
        this.longitude = value;;
    }


    /**
     * Returns a JSON string representation of CoordinateInfo
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
