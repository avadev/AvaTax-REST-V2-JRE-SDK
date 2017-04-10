package net.avalara.avatax.rest.client.models;

import net.avalara.avatax.rest.client.enums.*;
import net.avalara.avatax.rest.client.serializer.JsonSerializer;

import java.lang.Override;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
 */
public class NoticeModel {
    private Integer complianceContactId;

    /**
     * Getter for complianceContactId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getComplianceContactId() {
        return this.complianceContactId;
    }

    /**
     * Setter for complianceContactId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setComplianceContactId(Integer complianceContactId) {
        this.complianceContactId = complianceContactId;
    }

    
    private Integer avaFileFormId;

    /**
     * Getter for avaFileFormId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getAvaFileFormId() {
        return this.avaFileFormId;
    }

    /**
     * Setter for avaFileFormId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setAvaFileFormId(Integer avaFileFormId) {
        this.avaFileFormId = avaFileFormId;
    }

    
    private NoticeCustomerType customerTypeId;

    /**
     * Getter for customerTypeId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public NoticeCustomerType getCustomerTypeId() {
        return this.customerTypeId;
    }

    /**
     * Setter for customerTypeId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCustomerTypeId(NoticeCustomerType customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    
    private String customerComment;

    /**
     * Getter for customerComment - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getCustomerComment() {
        return this.customerComment;
    }

    /**
     * Setter for customerComment - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    
    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setFilingFrequency(FilingFrequencyId filingFrequency) {
        this.filingFrequency = filingFrequency;
    }

    
    private Integer closedByUserId;

    /**
     * Getter for closedByUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getClosedByUserId() {
        return this.closedByUserId;
    }

    /**
     * Setter for closedByUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setClosedByUserId(Integer closedByUserId) {
        this.closedByUserId = closedByUserId;
    }

    
    private String createdByUserName;

    /**
     * Getter for createdByUserName - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getCreatedByUserName() {
        return this.createdByUserName;
    }

    /**
     * Setter for createdByUserName - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    
    private ArrayList<NoticeFinanceModel> finances;

    /**
     * Getter for finances - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public ArrayList<NoticeFinanceModel> getFinances() {
        return this.finances;
    }

    /**
     * Setter for finances - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setFinances(ArrayList<NoticeFinanceModel> finances) {
        this.finances = finances;
    }

    
    private String description;

    /**
     * Getter for description - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private ArrayList<NoticeResponsibilityDetailModel> responsibility;

    /**
     * Getter for responsibility - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public ArrayList<NoticeResponsibilityDetailModel> getResponsibility() {
        return this.responsibility;
    }

    /**
     * Setter for responsibility - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setResponsibility(ArrayList<NoticeResponsibilityDetailModel> responsibility) {
        this.responsibility = responsibility;
    }

    
    private FundingOption customerFundingOptionId;

    /**
     * Getter for customerFundingOptionId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public FundingOption getCustomerFundingOptionId() {
        return this.customerFundingOptionId;
    }

    /**
     * Setter for customerFundingOptionId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCustomerFundingOptionId(FundingOption customerFundingOptionId) {
        this.customerFundingOptionId = customerFundingOptionId;
    }

    
    private String ticketReferenceNo;

    /**
     * Getter for ticketReferenceNo - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getTicketReferenceNo() {
        return this.ticketReferenceNo;
    }

    /**
     * Setter for ticketReferenceNo - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setTicketReferenceNo(String ticketReferenceNo) {
        this.ticketReferenceNo = ticketReferenceNo;
    }

    
    private FilingTypeId filingTypeId;

    /**
     * Getter for filingTypeId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public FilingTypeId getFilingTypeId() {
        return this.filingTypeId;
    }

    /**
     * Setter for filingTypeId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setFilingTypeId(FilingTypeId filingTypeId) {
        this.filingTypeId = filingTypeId;
    }

    
    private String salesForceCase;

    /**
     * Getter for salesForceCase - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getSalesForceCase() {
        return this.salesForceCase;
    }

    /**
     * Setter for salesForceCase - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setSalesForceCase(String salesForceCase) {
        this.salesForceCase = salesForceCase;
    }

    
    private Integer revenueContactId;

    /**
     * Getter for revenueContactId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getRevenueContactId() {
        return this.revenueContactId;
    }

    /**
     * Setter for revenueContactId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setRevenueContactId(Integer revenueContactId) {
        this.revenueContactId = revenueContactId;
    }

    
    private String country;

    /**
     * Getter for country - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Integer typeId;

    /**
     * Getter for typeId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getTypeId() {
        return this.typeId;
    }

    /**
     * Setter for typeId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    
    private String reason;

    /**
     * Getter for reason - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    
    private String salesForceCaseUrl;

    /**
     * Getter for salesForceCaseUrl - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getSalesForceCaseUrl() {
        return this.salesForceCaseUrl;
    }

    /**
     * Setter for salesForceCaseUrl - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setSalesForceCaseUrl(String salesForceCaseUrl) {
        this.salesForceCaseUrl = salesForceCaseUrl;
    }

    
    private Date expectedResolutionDate;

    /**
     * Getter for expectedResolutionDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Date getExpectedResolutionDate() {
        return this.expectedResolutionDate;
    }

    /**
     * Setter for expectedResolutionDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setExpectedResolutionDate(Date expectedResolutionDate) {
        this.expectedResolutionDate = expectedResolutionDate;
    }

    
    private Integer id;

    /**
     * Getter for id - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String ticketReferenceUrl;

    /**
     * Getter for ticketReferenceUrl - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getTicketReferenceUrl() {
        return this.ticketReferenceUrl;
    }

    /**
     * Setter for ticketReferenceUrl - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setTicketReferenceUrl(String ticketReferenceUrl) {
        this.ticketReferenceUrl = ticketReferenceUrl;
    }

    
    private String documentReference;

    /**
     * Getter for documentReference - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getDocumentReference() {
        return this.documentReference;
    }

    /**
     * Setter for documentReference - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setDocumentReference(String documentReference) {
        this.documentReference = documentReference;
    }

    
    private Date closedDate;

    /**
     * Getter for closedDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Date getClosedDate() {
        return this.closedDate;
    }

    /**
     * Setter for closedDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    
    private Boolean showResolutionDateToCustomer;

    /**
     * Getter for showResolutionDateToCustomer - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Boolean getShowResolutionDateToCustomer() {
        return this.showResolutionDateToCustomer;
    }

    /**
     * Setter for showResolutionDateToCustomer - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setShowResolutionDateToCustomer(Boolean showResolutionDateToCustomer) {
        this.showResolutionDateToCustomer = showResolutionDateToCustomer;
    }

    
    private Integer statusId;

    /**
     * Getter for statusId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getStatusId() {
        return this.statusId;
    }

    /**
     * Setter for statusId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String status;

    /**
     * Getter for status - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
    private Integer reasonId;

    /**
     * Getter for reasonId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getReasonId() {
        return this.reasonId;
    }

    /**
     * Setter for reasonId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    
    private Integer ownedByUserId;

    /**
     * Getter for ownedByUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getOwnedByUserId() {
        return this.ownedByUserId;
    }

    /**
     * Setter for ownedByUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setOwnedByUserId(Integer ownedByUserId) {
        this.ownedByUserId = ownedByUserId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String jurisdictionType;

    /**
     * Getter for jurisdictionType - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setJurisdictionType(String jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    
    private String type;

    /**
     * Getter for type - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setType(String type) {
        this.type = type;
    }

    
    private String taxPeriod;

    /**
     * Getter for taxPeriod - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getTaxPeriod() {
        return this.taxPeriod;
    }

    /**
     * Setter for taxPeriod - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setTaxPeriod(String taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    
    private String jurisdictionName;

    /**
     * Getter for jurisdictionName - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    
    private ArrayList<NoticeRootCauseDetailModel> rootCause;

    /**
     * Getter for rootCause - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public ArrayList<NoticeRootCauseDetailModel> getRootCause() {
        return this.rootCause;
    }

    /**
     * Setter for rootCause - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setRootCause(ArrayList<NoticeRootCauseDetailModel> rootCause) {
        this.rootCause = rootCause;
    }

    
    private Boolean hideFromCustomer;

    /**
     * Getter for hideFromCustomer - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Boolean getHideFromCustomer() {
        return this.hideFromCustomer;
    }

    /**
     * Setter for hideFromCustomer - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setHideFromCustomer(Boolean hideFromCustomer) {
        this.hideFromCustomer = hideFromCustomer;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date receivedDate;

    /**
     * Getter for receivedDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Date getReceivedDate() {
        return this.receivedDate;
    }

    /**
     * Setter for receivedDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    
    private ArrayList<NoticeCommentModel> comments;

    /**
     * Getter for comments - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public ArrayList<NoticeCommentModel> getComments() {
        return this.comments;
    }

    /**
     * Setter for comments - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setComments(ArrayList<NoticeCommentModel> comments) {
        this.comments = comments;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private NoticePriorityId priorityId;

    /**
     * Getter for priorityId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public NoticePriorityId getPriorityId() {
        return this.priorityId;
    }

    /**
     * Setter for priorityId - Represents a letter received from a tax authority regarding tax filing.
These letters often have the warning "Notice" printed at the top, which is why
they are called "Notices".
     */
    public void setPriorityId(NoticePriorityId priorityId) {
        this.priorityId = priorityId;
    }

    


    /**
     * Returns a JSON string representation of NoticeModel.
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
    