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
 * NoticeResponsibility Model
 */
public class NoticeResponsibilityModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this notice responsibility.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this notice responsibility.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * The description name of this notice responsibility
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description name of this notice responsibility
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Boolean isActive;

    /**
     * Getter for isActive
     *
     * Defines if the responsibility is active
     */
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * Setter for isActive
     *
     * Defines if the responsibility is active
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }


    private Integer sortOrder;

    /**
     * Getter for sortOrder
     *
     * The sort order of this responsibility
     */
    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * Setter for sortOrder
     *
     * The sort order of this responsibility
     */
    public void setSortOrder(Integer value) {
        this.sortOrder = value;
    }


    /**
     * Returns a JSON string representation of NoticeResponsibilityModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
