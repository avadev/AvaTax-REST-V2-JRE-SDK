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
 * Response DTO for Permission Category that includes associated permissions
* This is used for API responses that need the full permission category with its permissions
 */
public class PermissionCategoryResponseDto {


    private String permissionCategoryId;

    /**
     * Getter for permissionCategoryId
     *
     * The unique identifier for the permission category (as string for OpenAPI spec)
     */
    public String getPermissionCategoryId() {
        return this.permissionCategoryId;
    }

    /**
     * Setter for permissionCategoryId
     *
     * The unique identifier for the permission category (as string for OpenAPI spec)
     */
    public void setPermissionCategoryId(String value) {
        this.permissionCategoryId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Name of the permission category
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Name of the permission category
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Description of the permission category
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of the permission category
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private ArrayList<PermissionCategoryPermissionDto> permissions;

    /**
     * Getter for permissions
     *
     * List of permissions associated with this category
    * NOTE: This property does NOT exist in the database entity (EntityPermissionCategory)
    * It is populated by joining with the Permission table where Permission.PermissionCategoryId matches this category's ID
     */
    public ArrayList<PermissionCategoryPermissionDto> getPermissions() {
        return this.permissions;
    }

    /**
     * Setter for permissions
     *
     * List of permissions associated with this category
    * NOTE: This property does NOT exist in the database entity (EntityPermissionCategory)
    * It is populated by joining with the Permission table where Permission.PermissionCategoryId matches this category's ID
     */
    public void setPermissions(ArrayList<PermissionCategoryPermissionDto> value) {
        this.permissions = value;
    }

    /**
     * Returns a JSON string representation of PermissionCategoryResponseDto
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
