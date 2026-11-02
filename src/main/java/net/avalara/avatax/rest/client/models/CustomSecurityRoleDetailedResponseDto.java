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
 * Detailed response DTO for Custom Security Role that includes full permission details
* This matches CustomSecurityRoleDetailedResponse from OpenAPI spec
 */
public class CustomSecurityRoleDetailedResponseDto {


    private String customSecurityRoleId;

    /**
     * Getter for customSecurityRoleId
     *
     * The unique identifier for the custom security role (as string for OpenAPI spec)
     */
    public String getCustomSecurityRoleId() {
        return this.customSecurityRoleId;
    }

    /**
     * Setter for customSecurityRoleId
     *
     * The unique identifier for the custom security role (as string for OpenAPI spec)
     */
    public void setCustomSecurityRoleId(String value) {
        this.customSecurityRoleId = value;
    }

    private String name;

    /**
     * Getter for name
     *
     * Name of the custom security role
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Name of the custom security role
     */
    public void setName(String value) {
        this.name = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Description of the custom security role
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Description of the custom security role
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String accountId;

    /**
     * Getter for accountId
     *
     * Account ID this custom security role belongs to (as string for OpenAPI spec)
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * Setter for accountId
     *
     * Account ID this custom security role belongs to (as string for OpenAPI spec)
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    private ArrayList<CustomSecurityRolePermissionDto> permissions;

    /**
     * Getter for permissions
     *
     * List of permissions (permissionId, name, description)
     */
    public ArrayList<CustomSecurityRolePermissionDto> getPermissions() {
        return this.permissions;
    }

    /**
     * Setter for permissions
     *
     * List of permissions (permissionId, name, description)
     */
    public void setPermissions(ArrayList<CustomSecurityRolePermissionDto> value) {
        this.permissions = value;
    }

    /**
     * Returns a JSON string representation of CustomSecurityRoleDetailedResponseDto
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
