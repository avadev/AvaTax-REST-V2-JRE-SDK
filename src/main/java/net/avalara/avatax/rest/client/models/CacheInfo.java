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
 * Individual cache information
 */
public class CacheInfo {


    private String name;

    /**
     * Getter for name
     *
     * Name of the cache
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for name
     *
     * Name of the cache
     */
    public void setName(String value) {
        this.name = value;
    }

    private Long memorySizeBytes;

    /**
     * Getter for memorySizeBytes
     *
     * Memory size of the cache in bytes
     */
    public Long getMemorySizeBytes() {
        return this.memorySizeBytes;
    }

    /**
     * Setter for memorySizeBytes
     *
     * Memory size of the cache in bytes
     */
    public void setMemorySizeBytes(Long value) {
        this.memorySizeBytes = value;
    }

    private BigDecimal memorySizeMB;

    /**
     * Getter for memorySizeMB
     *
     * Memory size of the cache in megabytes
     */
    public BigDecimal getMemorySizeMB() {
        return this.memorySizeMB;
    }

    /**
     * Setter for memorySizeMB
     *
     * Memory size of the cache in megabytes
     */
    public void setMemorySizeMB(BigDecimal value) {
        this.memorySizeMB = value;
    }

    private BigDecimal memorySizeGB;

    /**
     * Getter for memorySizeGB
     *
     * Memory size of the cache in GB
     */
    public BigDecimal getMemorySizeGB() {
        return this.memorySizeGB;
    }

    /**
     * Setter for memorySizeGB
     *
     * Memory size of the cache in GB
     */
    public void setMemorySizeGB(BigDecimal value) {
        this.memorySizeGB = value;
    }

    private Integer itemCount;

    /**
     * Getter for itemCount
     *
     * Number of items in the cache
     */
    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * Setter for itemCount
     *
     * Number of items in the cache
     */
    public void setItemCount(Integer value) {
        this.itemCount = value;
    }

    private Boolean isLoaded;

    /**
     * Getter for isLoaded
     *
     * Whether the cache is currently loaded
     */
    public Boolean getIsLoaded() {
        return this.isLoaded;
    }

    /**
     * Setter for isLoaded
     *
     * Whether the cache is currently loaded
     */
    public void setIsLoaded(Boolean value) {
        this.isLoaded = value;
    }

    private Date lastRefreshTime;

    /**
     * Getter for lastRefreshTime
     *
     * Time when the cache was last refreshed
     */
    public Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    /**
     * Setter for lastRefreshTime
     *
     * Time when the cache was last refreshed
     */
    public void setLastRefreshTime(Date value) {
        this.lastRefreshTime = value;
    }

    private String lastRefreshDuration;

    /**
     * Getter for lastRefreshDuration
     *
     * Duration of the last cache refresh operation
     */
    public String getLastRefreshDuration() {
        return this.lastRefreshDuration;
    }

    /**
     * Setter for lastRefreshDuration
     *
     * Duration of the last cache refresh operation
     */
    public void setLastRefreshDuration(String value) {
        this.lastRefreshDuration = value;
    }

    /**
     * Returns a JSON string representation of CacheInfo
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
