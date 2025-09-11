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
 * Memory optimization recommendation
 */
public class MemoryRecommendation {


    private String id;

    /**
     * Getter for id
     *
     * Unique identifier for the recommendation
     */
    public String getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * Unique identifier for the recommendation
     */
    public void setId(String value) {
        this.id = value;
    }

    private String title;

    /**
     * Getter for title
     *
     * Title of the recommendation
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for title
     *
     * Title of the recommendation
     */
    public void setTitle(String value) {
        this.title = value;
    }

    private String description;

    /**
     * Getter for description
     *
     * Detailed description of the recommendation
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * Detailed description of the recommendation
     */
    public void setDescription(String value) {
        this.description = value;
    }

    private String impact;

    /**
     * Getter for impact
     *
     * Impact of implementing the recommendation
     */
    public String getImpact() {
        return this.impact;
    }

    /**
     * Setter for impact
     *
     * Impact of implementing the recommendation
     */
    public void setImpact(String value) {
        this.impact = value;
    }

    private String implementation;

    /**
     * Getter for implementation
     *
     * Implementation guidance for the recommendation
     */
    public String getImplementation() {
        return this.implementation;
    }

    /**
     * Setter for implementation
     *
     * Implementation guidance for the recommendation
     */
    public void setImplementation(String value) {
        this.implementation = value;
    }

    private MemoryRecommendationPriority priority;

    /**
     * Getter for priority
     *
     * Priority level of the recommendation
     */
    public MemoryRecommendationPriority getPriority() {
        return this.priority;
    }

    /**
     * Setter for priority
     *
     * Priority level of the recommendation
     */
    public void setPriority(MemoryRecommendationPriority value) {
        this.priority = value;
    }

    private BigDecimal estimatedMemorySavingsMB;

    /**
     * Getter for estimatedMemorySavingsMB
     *
     * Estimated memory savings in megabytes if recommendation is implemented
     */
    public BigDecimal getEstimatedMemorySavingsMB() {
        return this.estimatedMemorySavingsMB;
    }

    /**
     * Setter for estimatedMemorySavingsMB
     *
     * Estimated memory savings in megabytes if recommendation is implemented
     */
    public void setEstimatedMemorySavingsMB(BigDecimal value) {
        this.estimatedMemorySavingsMB = value;
    }

    /**
     * Returns a JSON string representation of MemoryRecommendation
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
