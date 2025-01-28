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
 * Input model of the HS code classification.
 */
public class ItemHSCodeClassificationInputModel {


    private Long itemId;

    /**
     * Getter for itemId
     *
     * The unique item ID.
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * Setter for itemId
     *
     * The unique item ID.
     */
    public void setItemId(Long value) {
        this.itemId = value;
    }

    private ArrayList<String> countryOfDestinations;

    /**
     * Getter for countryOfDestinations
     *
     * Country of destination for this HS code classification.
     */
    public ArrayList<String> getCountryOfDestinations() {
        return this.countryOfDestinations;
    }

    /**
     * Setter for countryOfDestinations
     *
     * Country of destination for this HS code classification.
     */
    public void setCountryOfDestinations(ArrayList<String> value) {
        this.countryOfDestinations = value;
    }

    private Boolean isPremiumClassification;

    /**
     * Getter for isPremiumClassification
     *
     * Used for checking the premium classification status.
     */
    public Boolean getIsPremiumClassification() {
        return this.isPremiumClassification;
    }

    /**
     * Setter for isPremiumClassification
     *
     * Used for checking the premium classification status.
     */
    public void setIsPremiumClassification(Boolean value) {
        this.isPremiumClassification = value;
    }

    private Boolean isReclassification;

    /**
     * Getter for isReclassification
     *
     * A field for checking whether this is a reclassification.
     */
    public Boolean getIsReclassification() {
        return this.isReclassification;
    }

    /**
     * Setter for isReclassification
     *
     * A field for checking whether this is a reclassification.
     */
    public void setIsReclassification(Boolean value) {
        this.isReclassification = value;
    }

    private Boolean isDisputed;

    /**
     * Getter for isDisputed
     *
     * Whether this item classification is disputed.
     */
    public Boolean getIsDisputed() {
        return this.isDisputed;
    }

    /**
     * Setter for isDisputed
     *
     * Whether this item classification is disputed.
     */
    public void setIsDisputed(Boolean value) {
        this.isDisputed = value;
    }

    private Boolean isPriority;

    /**
     * Getter for isPriority
     *
     * Whether this item classification is a priority classification.
     */
    public Boolean getIsPriority() {
        return this.isPriority;
    }

    /**
     * Setter for isPriority
     *
     * Whether this item classification is a priority classification.
     */
    public void setIsPriority(Boolean value) {
        this.isPriority = value;
    }

    private Boolean isExport;

    /**
     * Getter for isExport
     *
     * the item is exported to other countries.
     */
    public Boolean getIsExport() {
        return this.isExport;
    }

    /**
     * Setter for isExport
     *
     * the item is exported to other countries.
     */
    public void setIsExport(Boolean value) {
        this.isExport = value;
    }

    private Boolean isExportControl;

    /**
     * Getter for isExportControl
     *
     * IsExportControl flag to identify cross border classification
     */
    public Boolean getIsExportControl() {
        return this.isExportControl;
    }

    /**
     * Setter for isExportControl
     *
     * IsExportControl flag to identify cross border classification
     */
    public void setIsExportControl(Boolean value) {
        this.isExportControl = value;
    }

    private String instructions;

    /**
     * Getter for instructions
     *
     * Instructions related to this item classification.
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * Setter for instructions
     *
     * Instructions related to this item classification.
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    private String language;

    /**
     * Getter for language
     *
     * The language used in this item classification.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for language
     *
     * The language used in this item classification.
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Returns a JSON string representation of ItemHSCodeClassificationInputModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
