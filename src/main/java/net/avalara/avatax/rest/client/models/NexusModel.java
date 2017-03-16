package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a declaration of nexus within a particular taxing jurisdiction.
 */
public class NexusModel {
    private Date endDate;

    /**
     * Getter for endDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Date getEndDate() {
        return this.endDate;
    }

    /**
     * Setter for endDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    
    private String jurisCode;

    /**
     * Getter for jurisCode - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getJurisCode() {
        return this.jurisCode;
    }

    /**
     * Setter for jurisCode - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setJurisCode(String jurisCode) {
        this.jurisCode = jurisCode;
    }

    
    private Boolean streamlinedSalesTax;

    /**
     * Getter for streamlinedSalesTax - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Boolean getStreamlinedSalesTax() {
        return this.streamlinedSalesTax;
    }

    /**
     * Setter for streamlinedSalesTax - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setStreamlinedSalesTax(Boolean streamlinedSalesTax) {
        this.streamlinedSalesTax = streamlinedSalesTax;
    }

    
    private NexusTypeId nexusTypeId;

    /**
     * Getter for nexusTypeId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public NexusTypeId getNexusTypeId() {
        return this.nexusTypeId;
    }

    /**
     * Setter for nexusTypeId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setNexusTypeId(NexusTypeId nexusTypeId) {
        this.nexusTypeId = nexusTypeId;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private Sourcing sourcing;

    /**
     * Getter for sourcing - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Sourcing getSourcing() {
        return this.sourcing;
    }

    /**
     * Setter for sourcing - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setSourcing(Sourcing sourcing) {
        this.sourcing = sourcing;
    }

    
    private LocalNexusTypeId localNexusTypeId;

    /**
     * Getter for localNexusTypeId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public LocalNexusTypeId getLocalNexusTypeId() {
        return this.localNexusTypeId;
    }

    /**
     * Setter for localNexusTypeId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setLocalNexusTypeId(LocalNexusTypeId localNexusTypeId) {
        this.localNexusTypeId = localNexusTypeId;
    }

    
    private String country;

    /**
     * Getter for country - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Boolean hasLocalNexus;

    /**
     * Getter for hasLocalNexus - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Boolean getHasLocalNexus() {
        return this.hasLocalNexus;
    }

    /**
     * Setter for hasLocalNexus - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setHasLocalNexus(Boolean hasLocalNexus) {
        this.hasLocalNexus = hasLocalNexus;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private Boolean hasPermanentEstablishment;

    /**
     * Getter for hasPermanentEstablishment - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Boolean getHasPermanentEstablishment() {
        return this.hasPermanentEstablishment;
    }

    /**
     * Setter for hasPermanentEstablishment - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setHasPermanentEstablishment(Boolean hasPermanentEstablishment) {
        this.hasPermanentEstablishment = hasPermanentEstablishment;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Date effectiveDate;

    /**
     * Getter for effectiveDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * Setter for effectiveDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String stateAssignedNo;

    /**
     * Getter for stateAssignedNo - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getStateAssignedNo() {
        return this.stateAssignedNo;
    }

    /**
     * Setter for stateAssignedNo - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setStateAssignedNo(String stateAssignedNo) {
        this.stateAssignedNo = stateAssignedNo;
    }

    
    private String shortName;

    /**
     * Getter for shortName - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getShortName() {
        return this.shortName;
    }

    /**
     * Setter for shortName - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    
    private String jurisName;

    /**
     * Getter for jurisName - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getJurisName() {
        return this.jurisName;
    }

    /**
     * Setter for jurisName - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setJurisName(String jurisName) {
        this.jurisName = jurisName;
    }

    
    private JurisTypeId jurisTypeId;

    /**
     * Getter for jurisTypeId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public JurisTypeId getJurisTypeId() {
        return this.jurisTypeId;
    }

    /**
     * Setter for jurisTypeId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setJurisTypeId(JurisTypeId jurisTypeId) {
        this.jurisTypeId = jurisTypeId;
    }

    
    private String signatureCode;

    /**
     * Getter for signatureCode - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getSignatureCode() {
        return this.signatureCode;
    }

    /**
     * Setter for signatureCode - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private String taxId;

    /**
     * Getter for taxId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public String getTaxId() {
        return this.taxId;
    }

    /**
     * Setter for taxId - Represents a declaration of nexus within a particular taxing jurisdiction.
     */
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    


    /**
     * Returns a JSON string representation of NexusModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    