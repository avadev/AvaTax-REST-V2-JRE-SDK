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
 */

/**
 * An exemption reason defines why a certificate allows a customer to be exempt
* for purposes of tax calculation. For a full list of defined exemption reasons,
* please call the `ListCertificateExemptionReasons` API.
 */
public class ExemptionReasonModel {


    private Integer id;

    /**
     * Getter for id
     *
     * A unique ID number representing this exemption reason.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * A unique ID number representing this exemption reason.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String name;

    /**
     * Getter for name
     *
     * A friendly name describing this exemption reason.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * A friendly name describing this exemption reason.
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * Returns a JSON string representation of ExemptionReasonModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
