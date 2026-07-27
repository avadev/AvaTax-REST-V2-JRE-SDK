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
 * Identity of the user that produced an export, captured at request time.
 */
public class CustomRuleExportUser {


    private Integer userId;

    /**
     * Getter for userId
     *
     * Avalara UserId of the requester.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Setter for userId
     *
     * Avalara UserId of the requester.
     */
    public void setUserId(Integer value) {
        this.userId = value;
    }

    private String userName;

    /**
     * Getter for userName
     *
     * Username (login) of the requester. May be null if not available on the
    * authenticated principal.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Setter for userName
     *
     * Username (login) of the requester. May be null if not available on the
    * authenticated principal.
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Returns a JSON string representation of CustomRuleExportUser
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
