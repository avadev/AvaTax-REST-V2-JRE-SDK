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
 * Cache memory usage details
 */
public class CacheMemoryUsage {


    private HashMap<String, String> caches;

    /**
     * Getter for caches
     *
     * Dictionary of cache information indexed by cache name
     */
    public HashMap<String, String> getCaches() {
        return this.caches;
    }

    /**
     * Setter for caches
     *
     * Dictionary of cache information indexed by cache name
     */
    public void setCaches(HashMap<String, String> value) {
        this.caches = value;
    }

    private Long totalCacheMemory;

    /**
     * Getter for totalCacheMemory
     *
     * Total memory used by all caches in bytes
     */
    public Long getTotalCacheMemory() {
        return this.totalCacheMemory;
    }

    /**
     * Setter for totalCacheMemory
     *
     * Total memory used by all caches in bytes
     */
    public void setTotalCacheMemory(Long value) {
        this.totalCacheMemory = value;
    }

    private BigDecimal totalCacheMemoryGB;

    /**
     * Getter for totalCacheMemoryGB
     *
     * Total memory used by all caches in GB
     */
    public BigDecimal getTotalCacheMemoryGB() {
        return this.totalCacheMemoryGB;
    }

    /**
     * Setter for totalCacheMemoryGB
     *
     * Total memory used by all caches in GB
     */
    public void setTotalCacheMemoryGB(BigDecimal value) {
        this.totalCacheMemoryGB = value;
    }

    private Integer totalCacheCount;

    /**
     * Getter for totalCacheCount
     *
     * Total number of caches monitored
     */
    public Integer getTotalCacheCount() {
        return this.totalCacheCount;
    }

    /**
     * Setter for totalCacheCount
     *
     * Total number of caches monitored
     */
    public void setTotalCacheCount(Integer value) {
        this.totalCacheCount = value;
    }

    private Date timestamp;

    /**
     * Getter for timestamp
     *
     * Timestamp when the cache memory usage was collected
     */
    public Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for timestamp
     *
     * Timestamp when the cache memory usage was collected
     */
    public void setTimestamp(Date value) {
        this.timestamp = value;
    }

    /**
     * Returns a JSON string representation of CacheMemoryUsage
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
