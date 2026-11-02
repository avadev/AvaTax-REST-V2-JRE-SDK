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
 * Represents a permission within a custom security role response (matches OpenAPI spec)
 */
public class CustomSecurityRolePermissionDto {


    private String permissionId;

    /**
     * Getter for permissionId
     *
     * Permission identifier
     */
    public String getPermissionId() {
        return this.permissionId;
    }

    /**
     * Setter for permissionId
     *
     * Permission identifier
     */
    public void setPermissionId(String value) {
        this.permissionId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Permission name (dbo.Permission.Name)
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Permission name (dbo.Permission.Name)
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Permission description (dbo.Permission.Description)
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Permission description (dbo.Permission.Description)
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Returns a JSON string representation of CustomSecurityRolePermissionDto
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
