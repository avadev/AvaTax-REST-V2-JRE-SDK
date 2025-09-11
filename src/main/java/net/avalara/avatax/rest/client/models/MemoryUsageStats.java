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
 * Memory usage statistics
 */
public class MemoryUsageStats {


    private Long totalPhysicalMemory;

    /**
     * Getter for totalPhysicalMemory
     *
     * Total physical memory available on the system in bytes
     */
    public Long getTotalPhysicalMemory() {
        return this.totalPhysicalMemory;
    }

    /**
     * Setter for totalPhysicalMemory
     *
     * Total physical memory available on the system in bytes
     */
    public void setTotalPhysicalMemory(Long value) {
        this.totalPhysicalMemory = value;
    }

    private BigDecimal totalPhysicalMemoryGB;

    /**
     * Getter for totalPhysicalMemoryGB
     *
     * Total physical memory available on the system in GB
     */
    public BigDecimal getTotalPhysicalMemoryGB() {
        return this.totalPhysicalMemoryGB;
    }

    /**
     * Setter for totalPhysicalMemoryGB
     *
     * Total physical memory available on the system in GB
     */
    public void setTotalPhysicalMemoryGB(BigDecimal value) {
        this.totalPhysicalMemoryGB = value;
    }

    private Long availablePhysicalMemory;

    /**
     * Getter for availablePhysicalMemory
     *
     * Available physical memory on the system in bytes
     */
    public Long getAvailablePhysicalMemory() {
        return this.availablePhysicalMemory;
    }

    /**
     * Setter for availablePhysicalMemory
     *
     * Available physical memory on the system in bytes
     */
    public void setAvailablePhysicalMemory(Long value) {
        this.availablePhysicalMemory = value;
    }

    private BigDecimal availablePhysicalMemoryGB;

    /**
     * Getter for availablePhysicalMemoryGB
     *
     * Available physical memory on the system in GB
     */
    public BigDecimal getAvailablePhysicalMemoryGB() {
        return this.availablePhysicalMemoryGB;
    }

    /**
     * Setter for availablePhysicalMemoryGB
     *
     * Available physical memory on the system in GB
     */
    public void setAvailablePhysicalMemoryGB(BigDecimal value) {
        this.availablePhysicalMemoryGB = value;
    }

    private Long usedPhysicalMemory;

    /**
     * Getter for usedPhysicalMemory
     *
     * Used physical memory on the system in bytes
     */
    public Long getUsedPhysicalMemory() {
        return this.usedPhysicalMemory;
    }

    /**
     * Setter for usedPhysicalMemory
     *
     * Used physical memory on the system in bytes
     */
    public void setUsedPhysicalMemory(Long value) {
        this.usedPhysicalMemory = value;
    }

    private BigDecimal usedPhysicalMemoryGB;

    /**
     * Getter for usedPhysicalMemoryGB
     *
     * Used physical memory on the system in GB
     */
    public BigDecimal getUsedPhysicalMemoryGB() {
        return this.usedPhysicalMemoryGB;
    }

    /**
     * Setter for usedPhysicalMemoryGB
     *
     * Used physical memory on the system in GB
     */
    public void setUsedPhysicalMemoryGB(BigDecimal value) {
        this.usedPhysicalMemoryGB = value;
    }

    private BigDecimal physicalMemoryUsagePercentage;

    /**
     * Getter for physicalMemoryUsagePercentage
     *
     * Percentage of physical memory currently in use
     */
    public BigDecimal getPhysicalMemoryUsagePercentage() {
        return this.physicalMemoryUsagePercentage;
    }

    /**
     * Setter for physicalMemoryUsagePercentage
     *
     * Percentage of physical memory currently in use
     */
    public void setPhysicalMemoryUsagePercentage(BigDecimal value) {
        this.physicalMemoryUsagePercentage = value;
    }

    private Long totalVirtualMemory;

    /**
     * Getter for totalVirtualMemory
     *
     * Total virtual memory available to the process in bytes
     */
    public Long getTotalVirtualMemory() {
        return this.totalVirtualMemory;
    }

    /**
     * Setter for totalVirtualMemory
     *
     * Total virtual memory available to the process in bytes
     */
    public void setTotalVirtualMemory(Long value) {
        this.totalVirtualMemory = value;
    }

    private BigDecimal totalVirtualMemoryGB;

    /**
     * Getter for totalVirtualMemoryGB
     *
     * Total virtual memory available to the process in GB
     */
    public BigDecimal getTotalVirtualMemoryGB() {
        return this.totalVirtualMemoryGB;
    }

    /**
     * Setter for totalVirtualMemoryGB
     *
     * Total virtual memory available to the process in GB
     */
    public void setTotalVirtualMemoryGB(BigDecimal value) {
        this.totalVirtualMemoryGB = value;
    }

    private Long availableVirtualMemory;

    /**
     * Getter for availableVirtualMemory
     *
     * Available virtual memory to the process in bytes
     */
    public Long getAvailableVirtualMemory() {
        return this.availableVirtualMemory;
    }

    /**
     * Setter for availableVirtualMemory
     *
     * Available virtual memory to the process in bytes
     */
    public void setAvailableVirtualMemory(Long value) {
        this.availableVirtualMemory = value;
    }

    private BigDecimal availableVirtualMemoryGB;

    /**
     * Getter for availableVirtualMemoryGB
     *
     * Available virtual memory to the process in GB
     */
    public BigDecimal getAvailableVirtualMemoryGB() {
        return this.availableVirtualMemoryGB;
    }

    /**
     * Setter for availableVirtualMemoryGB
     *
     * Available virtual memory to the process in GB
     */
    public void setAvailableVirtualMemoryGB(BigDecimal value) {
        this.availableVirtualMemoryGB = value;
    }

    private Long usedVirtualMemory;

    /**
     * Getter for usedVirtualMemory
     *
     * Used virtual memory by the process in bytes
     */
    public Long getUsedVirtualMemory() {
        return this.usedVirtualMemory;
    }

    /**
     * Setter for usedVirtualMemory
     *
     * Used virtual memory by the process in bytes
     */
    public void setUsedVirtualMemory(Long value) {
        this.usedVirtualMemory = value;
    }

    private BigDecimal usedVirtualMemoryGB;

    /**
     * Getter for usedVirtualMemoryGB
     *
     * Used virtual memory by the process in GB
     */
    public BigDecimal getUsedVirtualMemoryGB() {
        return this.usedVirtualMemoryGB;
    }

    /**
     * Setter for usedVirtualMemoryGB
     *
     * Used virtual memory by the process in GB
     */
    public void setUsedVirtualMemoryGB(BigDecimal value) {
        this.usedVirtualMemoryGB = value;
    }

    private BigDecimal virtualMemoryUsagePercentage;

    /**
     * Getter for virtualMemoryUsagePercentage
     *
     * Percentage of virtual memory currently in use
     */
    public BigDecimal getVirtualMemoryUsagePercentage() {
        return this.virtualMemoryUsagePercentage;
    }

    /**
     * Setter for virtualMemoryUsagePercentage
     *
     * Percentage of virtual memory currently in use
     */
    public void setVirtualMemoryUsagePercentage(BigDecimal value) {
        this.virtualMemoryUsagePercentage = value;
    }

    private Long managedHeapSize;

    /**
     * Getter for managedHeapSize
     *
     * Total size of the managed heap in bytes
     */
    public Long getManagedHeapSize() {
        return this.managedHeapSize;
    }

    /**
     * Setter for managedHeapSize
     *
     * Total size of the managed heap in bytes
     */
    public void setManagedHeapSize(Long value) {
        this.managedHeapSize = value;
    }

    private BigDecimal managedHeapSizeGB;

    /**
     * Getter for managedHeapSizeGB
     *
     * Total size of the managed heap in GB
     */
    public BigDecimal getManagedHeapSizeGB() {
        return this.managedHeapSizeGB;
    }

    /**
     * Setter for managedHeapSizeGB
     *
     * Total size of the managed heap in GB
     */
    public void setManagedHeapSizeGB(BigDecimal value) {
        this.managedHeapSizeGB = value;
    }

    private Long managedHeapUsed;

    /**
     * Getter for managedHeapUsed
     *
     * Used portion of the managed heap in bytes
     */
    public Long getManagedHeapUsed() {
        return this.managedHeapUsed;
    }

    /**
     * Setter for managedHeapUsed
     *
     * Used portion of the managed heap in bytes
     */
    public void setManagedHeapUsed(Long value) {
        this.managedHeapUsed = value;
    }

    private BigDecimal managedHeapUsedGB;

    /**
     * Getter for managedHeapUsedGB
     *
     * Used portion of the managed heap in GB
     */
    public BigDecimal getManagedHeapUsedGB() {
        return this.managedHeapUsedGB;
    }

    /**
     * Setter for managedHeapUsedGB
     *
     * Used portion of the managed heap in GB
     */
    public void setManagedHeapUsedGB(BigDecimal value) {
        this.managedHeapUsedGB = value;
    }

    private Long managedHeapFree;

    /**
     * Getter for managedHeapFree
     *
     * Free portion of the managed heap in bytes
     */
    public Long getManagedHeapFree() {
        return this.managedHeapFree;
    }

    /**
     * Setter for managedHeapFree
     *
     * Free portion of the managed heap in bytes
     */
    public void setManagedHeapFree(Long value) {
        this.managedHeapFree = value;
    }

    private BigDecimal managedHeapFreeGB;

    /**
     * Getter for managedHeapFreeGB
     *
     * Free portion of the managed heap in GB
     */
    public BigDecimal getManagedHeapFreeGB() {
        return this.managedHeapFreeGB;
    }

    /**
     * Setter for managedHeapFreeGB
     *
     * Free portion of the managed heap in GB
     */
    public void setManagedHeapFreeGB(BigDecimal value) {
        this.managedHeapFreeGB = value;
    }

    private BigDecimal managedHeapUsagePercentage;

    /**
     * Getter for managedHeapUsagePercentage
     *
     * Percentage of managed heap currently in use
     */
    public BigDecimal getManagedHeapUsagePercentage() {
        return this.managedHeapUsagePercentage;
    }

    /**
     * Setter for managedHeapUsagePercentage
     *
     * Percentage of managed heap currently in use
     */
    public void setManagedHeapUsagePercentage(BigDecimal value) {
        this.managedHeapUsagePercentage = value;
    }

    private Long workingSetSize;

    /**
     * Getter for workingSetSize
     *
     * Current working set size of the process in bytes
     */
    public Long getWorkingSetSize() {
        return this.workingSetSize;
    }

    /**
     * Setter for workingSetSize
     *
     * Current working set size of the process in bytes
     */
    public void setWorkingSetSize(Long value) {
        this.workingSetSize = value;
    }

    private BigDecimal workingSetSizeGB;

    /**
     * Getter for workingSetSizeGB
     *
     * Current working set size of the process in GB
     */
    public BigDecimal getWorkingSetSizeGB() {
        return this.workingSetSizeGB;
    }

    /**
     * Setter for workingSetSizeGB
     *
     * Current working set size of the process in GB
     */
    public void setWorkingSetSizeGB(BigDecimal value) {
        this.workingSetSizeGB = value;
    }

    private Long privateMemorySize;

    /**
     * Getter for privateMemorySize
     *
     * Private memory size of the process in bytes
     */
    public Long getPrivateMemorySize() {
        return this.privateMemorySize;
    }

    /**
     * Setter for privateMemorySize
     *
     * Private memory size of the process in bytes
     */
    public void setPrivateMemorySize(Long value) {
        this.privateMemorySize = value;
    }

    private BigDecimal privateMemorySizeGB;

    /**
     * Getter for privateMemorySizeGB
     *
     * Private memory size of the process in GB
     */
    public BigDecimal getPrivateMemorySizeGB() {
        return this.privateMemorySizeGB;
    }

    /**
     * Setter for privateMemorySizeGB
     *
     * Private memory size of the process in GB
     */
    public void setPrivateMemorySizeGB(BigDecimal value) {
        this.privateMemorySizeGB = value;
    }

    private Long peakWorkingSetSize;

    /**
     * Getter for peakWorkingSetSize
     *
     * Peak working set size of the process in bytes
     */
    public Long getPeakWorkingSetSize() {
        return this.peakWorkingSetSize;
    }

    /**
     * Setter for peakWorkingSetSize
     *
     * Peak working set size of the process in bytes
     */
    public void setPeakWorkingSetSize(Long value) {
        this.peakWorkingSetSize = value;
    }

    private BigDecimal peakWorkingSetSizeGB;

    /**
     * Getter for peakWorkingSetSizeGB
     *
     * Peak working set size of the process in GB
     */
    public BigDecimal getPeakWorkingSetSizeGB() {
        return this.peakWorkingSetSizeGB;
    }

    /**
     * Setter for peakWorkingSetSizeGB
     *
     * Peak working set size of the process in GB
     */
    public void setPeakWorkingSetSizeGB(BigDecimal value) {
        this.peakWorkingSetSizeGB = value;
    }

    private Long peakVirtualMemorySize;

    /**
     * Getter for peakVirtualMemorySize
     *
     * Peak virtual memory size of the process in bytes
     */
    public Long getPeakVirtualMemorySize() {
        return this.peakVirtualMemorySize;
    }

    /**
     * Setter for peakVirtualMemorySize
     *
     * Peak virtual memory size of the process in bytes
     */
    public void setPeakVirtualMemorySize(Long value) {
        this.peakVirtualMemorySize = value;
    }

    private BigDecimal peakVirtualMemorySizeGB;

    /**
     * Getter for peakVirtualMemorySizeGB
     *
     * Peak virtual memory size of the process in GB
     */
    public BigDecimal getPeakVirtualMemorySizeGB() {
        return this.peakVirtualMemorySizeGB;
    }

    /**
     * Setter for peakVirtualMemorySizeGB
     *
     * Peak virtual memory size of the process in GB
     */
    public void setPeakVirtualMemorySizeGB(BigDecimal value) {
        this.peakVirtualMemorySizeGB = value;
    }

    private Integer garbageCollectionGen0Count;

    /**
     * Getter for garbageCollectionGen0Count
     *
     * Number of Gen0 garbage collections performed
     */
    public Integer getGarbageCollectionGen0Count() {
        return this.garbageCollectionGen0Count;
    }

    /**
     * Setter for garbageCollectionGen0Count
     *
     * Number of Gen0 garbage collections performed
     */
    public void setGarbageCollectionGen0Count(Integer value) {
        this.garbageCollectionGen0Count = value;
    }

    private Integer garbageCollectionGen1Count;

    /**
     * Getter for garbageCollectionGen1Count
     *
     * Number of Gen1 garbage collections performed
     */
    public Integer getGarbageCollectionGen1Count() {
        return this.garbageCollectionGen1Count;
    }

    /**
     * Setter for garbageCollectionGen1Count
     *
     * Number of Gen1 garbage collections performed
     */
    public void setGarbageCollectionGen1Count(Integer value) {
        this.garbageCollectionGen1Count = value;
    }

    private Integer garbageCollectionGen2Count;

    /**
     * Getter for garbageCollectionGen2Count
     *
     * Number of Gen2 garbage collections performed
     */
    public Integer getGarbageCollectionGen2Count() {
        return this.garbageCollectionGen2Count;
    }

    /**
     * Setter for garbageCollectionGen2Count
     *
     * Number of Gen2 garbage collections performed
     */
    public void setGarbageCollectionGen2Count(Integer value) {
        this.garbageCollectionGen2Count = value;
    }

    private Date timestamp;

    /**
     * Getter for timestamp
     *
     * Timestamp when the memory statistics were collected
     */
    public Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * Setter for timestamp
     *
     * Timestamp when the memory statistics were collected
     */
    public void setTimestamp(Date value) {
        this.timestamp = value;
    }

    private String machineName;

    /**
     * Getter for machineName
     *
     * Name of the machine where the process is running
     */
    public String getMachineName() {
        return this.machineName;
    }

    /**
     * Setter for machineName
     *
     * Name of the machine where the process is running
     */
    public void setMachineName(String value) {
        this.machineName = value;
    }

    private String processName;

    /**
     * Getter for processName
     *
     * Name of the process
     */
    public String getProcessName() {
        return this.processName;
    }

    /**
     * Setter for processName
     *
     * Name of the process
     */
    public void setProcessName(String value) {
        this.processName = value;
    }

    private Integer processId;

    /**
     * Getter for processId
     *
     * Process ID
     */
    public Integer getProcessId() {
        return this.processId;
    }

    /**
     * Setter for processId
     *
     * Process ID
     */
    public void setProcessId(Integer value) {
        this.processId = value;
    }

    /**
     * Returns a JSON string representation of MemoryUsageStats
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
