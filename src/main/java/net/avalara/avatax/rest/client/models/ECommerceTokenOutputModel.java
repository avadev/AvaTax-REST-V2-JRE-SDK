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
 * The resource model returned by the ECommerceTokenController's endpoints.
 */
public class ECommerceTokenOutputModel {


    private String token;

    /**
     * Getter for token
     *
     * The JWT token that authorizes the gencert tool to operate.
	 * 
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Setter for token
     *
     * The JWT token that authorizes the gencert tool to operate.
     */
    public void setToken(String value) {
        this.token = value;
    }

    private ArrayList<Long> clientIds;

    /**
     * Getter for clientIds
     *
     * The list of clients that the token is valid for.
	 * 
     */
    public ArrayList<Long> getClientIds() {
        return this.clientIds;
    }

    /**
     * Setter for clientIds
     *
     * The list of clients that the token is valid for.
     */
    public void setClientIds(ArrayList<Long> value) {
        this.clientIds = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date the token was created.
	 * 
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date the token was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private Date expirationDate;

    /**
     * Getter for expirationDate
     *
     * The date that the token will expire.
	 * 
     */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Setter for expirationDate
     *
     * The date that the token will expire.
     */
    public void setExpirationDate(Date value) {
        this.expirationDate = value;
    }

    /**
     * Returns a JSON string representation of ECommerceTokenOutputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
