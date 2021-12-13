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
 * A model used to request the refresh of a CertCapture eCommerce token.
 */
public class RefreshECommerceTokenInputModel {


    private String token;

    /**
     * Getter for token
     *
     * The token that requires its expiration to be extended.
	 * 
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Setter for token
     *
     * The token that requires its expiration to be extended.
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Returns a JSON string representation of RefreshECommerceTokenInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
