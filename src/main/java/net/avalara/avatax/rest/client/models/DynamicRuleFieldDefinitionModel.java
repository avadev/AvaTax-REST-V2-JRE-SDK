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
 * Represents the a field available in the Dynamic Rules interface.
 */
public class DynamicRuleFieldDefinitionModel {


    private String name;

    /**
     * Getter for name
     *
     * The internal name of the field. This is also the field's name as it appears in tokens.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * The internal name of the field. This is also the field's name as it appears in tokens.
     */
    public void setName(String value) {
        this.name = value;
    }

    private String title;

    /**
     * Getter for title
     *
     * Formatted display or "nice" name of the field.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Formatted display or "nice" name of the field.
     */
    public void setTitle(String value) {
        this.title = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * A description of the field's usage and purpose.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * A description of the field's usage and purpose.
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String category;

    /**
     * Getter for category
     *
     * The category of the field; useful for filtering.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Setter for category
     *
     * The category of the field; useful for filtering.
     */
    public void setCategory(String value) {
        this.category = value;
    }

    private DynamicRuleFieldLevelDefinitionModel documentLevel;

    /**
     * Getter for documentLevel
     *
     * 
     */
    public DynamicRuleFieldLevelDefinitionModel getDocumentLevel() {
        return this.documentLevel;
    }

    /**
     * Setter for documentLevel
     *
     * 
     */
    public void setDocumentLevel(DynamicRuleFieldLevelDefinitionModel value) {
        this.documentLevel = value;
    }

    private DynamicRuleFieldLevelDefinitionModel lineLevel;

    /**
     * Getter for lineLevel
     *
     * 
     */
    public DynamicRuleFieldLevelDefinitionModel getLineLevel() {
        return this.lineLevel;
    }

    /**
     * Setter for lineLevel
     *
     * 
     */
    public void setLineLevel(DynamicRuleFieldLevelDefinitionModel value) {
        this.lineLevel = value;
    }

    /**
     * Returns a JSON string representation of DynamicRuleFieldDefinitionModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
