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
 * Tax Profile Service Meta data information
 */
public class TaxProfileMetaDataModel {


    private String createdUser;

    /**
     * Getter for createdUser
     *
     * Created By User
     */
    public String getCreatedUser() {
        return this.createdUser;
    }

    /**
     * Setter for createdUser
     *
     * Created By User
     */
    public void setCreatedUser(String value) {
        this.createdUser = value;
    }

    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * Created Date
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * Created Date
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }

    private String modifiedUser;

    /**
     * Getter for modifiedUser
     *
     * Modified User
     */
    public String getModifiedUser() {
        return this.modifiedUser;
    }

    /**
     * Setter for modifiedUser
     *
     * Modified User
     */
    public void setModifiedUser(String value) {
        this.modifiedUser = value;
    }

    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * Modified Date
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * Modified Date
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }

    /**
     * Returns a JSON string representation of TaxProfileMetaDataModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
