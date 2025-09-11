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
 * Memory usage trend data
 */
public class MemoryUsageTrend {


    private ArrayList<MemoryUsageStats> dataPoints;

    /**
     * Getter for dataPoints
     *
     * List of memory usage data points over time
     */
    public ArrayList<MemoryUsageStats> getDataPoints() {
        return this.dataPoints;
    }

    /**
     * Setter for dataPoints
     *
     * List of memory usage data points over time
     */
    public void setDataPoints(ArrayList<MemoryUsageStats> value) {
        this.dataPoints = value;
    }

    private String duration;

    /**
     * Getter for duration
     *
     * Duration of the trend analysis period
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * Setter for duration
     *
     * Duration of the trend analysis period
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    private BigDecimal averageMemoryUsage;

    /**
     * Getter for averageMemoryUsage
     *
     * Average memory usage percentage over the trend period
     */
    public BigDecimal getAverageMemoryUsage() {
        return this.averageMemoryUsage;
    }

    /**
     * Setter for averageMemoryUsage
     *
     * Average memory usage percentage over the trend period
     */
    public void setAverageMemoryUsage(BigDecimal value) {
        this.averageMemoryUsage = value;
    }

    private BigDecimal peakMemoryUsage;

    /**
     * Getter for peakMemoryUsage
     *
     * Peak memory usage percentage during the trend period
     */
    public BigDecimal getPeakMemoryUsage() {
        return this.peakMemoryUsage;
    }

    /**
     * Setter for peakMemoryUsage
     *
     * Peak memory usage percentage during the trend period
     */
    public void setPeakMemoryUsage(BigDecimal value) {
        this.peakMemoryUsage = value;
    }

    private BigDecimal lowMemoryUsage;

    /**
     * Getter for lowMemoryUsage
     *
     * Lowest memory usage percentage during the trend period
     */
    public BigDecimal getLowMemoryUsage() {
        return this.lowMemoryUsage;
    }

    /**
     * Setter for lowMemoryUsage
     *
     * Lowest memory usage percentage during the trend period
     */
    public void setLowMemoryUsage(BigDecimal value) {
        this.lowMemoryUsage = value;
    }

    /**
     * Returns a JSON string representation of MemoryUsageTrend
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
