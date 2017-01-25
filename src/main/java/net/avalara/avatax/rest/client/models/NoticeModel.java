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
     * Getter for complianceContactId - complianceContactId
     */
    public Integer getComplianceContactId() {
        return this.complianceContactId;
    }

    /**
     * Setter for complianceContactId - complianceContactId
     */
    public void setComplianceContactId(Integer complianceContactId) {
        this.complianceContactId = complianceContactId;
    }

    
    private Integer avaFileFormId;

    /**
     * Getter for avaFileFormId - avaFileFormId
     */
    public Integer getAvaFileFormId() {
        return this.avaFileFormId;
    }

    /**
     * Setter for avaFileFormId - avaFileFormId
     */
    public void setAvaFileFormId(Integer avaFileFormId) {
        this.avaFileFormId = avaFileFormId;
    }

    
    private Integer customerTypeId;

    /**
     * Getter for customerTypeId - TaxNoticeCustomerTypeId
     */
    public Integer getCustomerTypeId() {
        return this.customerTypeId;
    }

    /**
     * Setter for customerTypeId - TaxNoticeCustomerTypeId
     */
    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    
    private String customerComment;

    /**
     * Getter for customerComment - CustomerComment
     */
    public String getCustomerComment() {
        return this.customerComment;
    }

    /**
     * Setter for customerComment - CustomerComment
     */
    public void setCustomerComment(String customerComment) {
        this.customerComment = customerComment;
    }

    
    private String priority;

    /**
     * Getter for priority - taxNoticePriorityId
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * Setter for priority - taxNoticePriorityId
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    
    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency - taxNoticeFilingFrequencyId
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency - taxNoticeFilingFrequencyId
     */
    public void setFilingFrequency(FilingFrequencyId filingFrequency) {
        this.filingFrequency = filingFrequency;
    }

    
    private Integer closedByUserId;

    /**
     * Getter for closedByUserId - The unique ID number of the user that closed the notice
     */
    public Integer getClosedByUserId() {
        return this.closedByUserId;
    }

    /**
     * Setter for closedByUserId - The unique ID number of the user that closed the notice
     */
    public void setClosedByUserId(Integer closedByUserId) {
        this.closedByUserId = closedByUserId;
    }

    
    private String createdByUserName;

    /**
     * Getter for createdByUserName - createdByUser
     */
    public String getCreatedByUserName() {
        return this.createdByUserName;
    }

    /**
     * Setter for createdByUserName - createdByUser
     */
    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    
    private ArrayList<NoticeFinanceModel> finances;

    /**
     * Getter for finances - taxNoticeFinanceDetails
     */
    public ArrayList<NoticeFinanceModel> getFinances() {
        return this.finances;
    }

    /**
     * Setter for finances - taxNoticeFinanceDetails
     */
    public void setFinances(ArrayList<NoticeFinanceModel> finances) {
        this.finances = finances;
    }

    
    private String description;

    /**
     * Getter for description - description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description - description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    
    private Date modifiedDate;

    /**
     * Getter for modifiedDate - The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate - The date/time when this record was last modified.
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
    private String filingType;

    /**
     * Getter for filingType - taxNoticeFilingTypeId
     */
    public String getFilingType() {
        return this.filingType;
    }

    /**
     * Setter for filingType - taxNoticeFilingTypeId
     */
    public void setFilingType(String filingType) {
        this.filingType = filingType;
    }

    
    private Integer customerFundingOptionId;

    /**
     * Getter for customerFundingOptionId - taxNoticeCustomerFundingOptionId
     */
    public Integer getCustomerFundingOptionId() {
        return this.customerFundingOptionId;
    }

    /**
     * Setter for customerFundingOptionId - taxNoticeCustomerFundingOptionId
     */
    public void setCustomerFundingOptionId(Integer customerFundingOptionId) {
        this.customerFundingOptionId = customerFundingOptionId;
    }

    
    private String ticketReferenceNo;

    /**
     * Getter for ticketReferenceNo - ticketReferenceNo
     */
    public String getTicketReferenceNo() {
        return this.ticketReferenceNo;
    }

    /**
     * Setter for ticketReferenceNo - ticketReferenceNo
     */
    public void setTicketReferenceNo(String ticketReferenceNo) {
        this.ticketReferenceNo = ticketReferenceNo;
    }

    
    private Integer taxNoticeMailCheckToId;

    /**
     * Getter for taxNoticeMailCheckToId - taxNoticeMailCheckToId
     */
    public Integer getTaxNoticeMailCheckToId() {
        return this.taxNoticeMailCheckToId;
    }

    /**
     * Setter for taxNoticeMailCheckToId - taxNoticeMailCheckToId
     */
    public void setTaxNoticeMailCheckToId(Integer taxNoticeMailCheckToId) {
        this.taxNoticeMailCheckToId = taxNoticeMailCheckToId;
    }

    
    private Integer filingTypeId;

    /**
     * Getter for filingTypeId - taxNoticeFilingTypeId
     */
    public Integer getFilingTypeId() {
        return this.filingTypeId;
    }

    /**
     * Setter for filingTypeId - taxNoticeFilingTypeId
     */
    public void setFilingTypeId(Integer filingTypeId) {
        this.filingTypeId = filingTypeId;
    }

    
    private String salesForceCase;

    /**
     * Getter for salesForceCase - salesForceCaseNo
     */
    public String getSalesForceCase() {
        return this.salesForceCase;
    }

    /**
     * Setter for salesForceCase - salesForceCaseNo
     */
    public void setSalesForceCase(String salesForceCase) {
        this.salesForceCase = salesForceCase;
    }

    
    private Integer revenueContactId;

    /**
     * Getter for revenueContactId - revenueContactId
     */
    public Integer getRevenueContactId() {
        return this.revenueContactId;
    }

    /**
     * Setter for revenueContactId - revenueContactId
     */
    public void setRevenueContactId(Integer revenueContactId) {
        this.revenueContactId = revenueContactId;
    }

    
    private String customerType;

    /**
     * Getter for customerType - TaxNoticeCustomerTypeId
     */
    public String getCustomerType() {
        return this.customerType;
    }

    /**
     * Setter for customerType - TaxNoticeCustomerTypeId
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    
    private String country;

    /**
     * Getter for country - taxNoticeCountry
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country - taxNoticeCountry
     */
    public void setCountry(String country) {
        this.country = country;
    }

    
    private Integer typeId;

    /**
     * Getter for typeId - taxNoticeTypeId
     */
    public Integer getTypeId() {
        return this.typeId;
    }

    /**
     * Setter for typeId - taxNoticeTypeId
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    
    private String reason;

    /**
     * Getter for reason - taxNoticeReason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason - taxNoticeReason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    
    private String salesForceCaseUrl;

    /**
     * Getter for salesForceCaseUrl - SalesForceCaseUrl
     */
    public String getSalesForceCaseUrl() {
        return this.salesForceCaseUrl;
    }

    /**
     * Setter for salesForceCaseUrl - SalesForceCaseUrl
     */
    public void setSalesForceCaseUrl(String salesForceCaseUrl) {
        this.salesForceCaseUrl = salesForceCaseUrl;
    }

    
    private Date expectedResolutionDate;

    /**
     * Getter for expectedResolutionDate - expectedResolutionDate
     */
    public Date getExpectedResolutionDate() {
        return this.expectedResolutionDate;
    }

    /**
     * Setter for expectedResolutionDate - expectedResolutionDate
     */
    public void setExpectedResolutionDate(Date expectedResolutionDate) {
        this.expectedResolutionDate = expectedResolutionDate;
    }

    
    private Integer id;

    /**
     * Getter for id - The unique ID number of this notice.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id - The unique ID number of this notice.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    
    private String ticketReferenceUrl;

    /**
     * Getter for ticketReferenceUrl - ticketReferenceUrl
     */
    public String getTicketReferenceUrl() {
        return this.ticketReferenceUrl;
    }

    /**
     * Setter for ticketReferenceUrl - ticketReferenceUrl
     */
    public void setTicketReferenceUrl(String ticketReferenceUrl) {
        this.ticketReferenceUrl = ticketReferenceUrl;
    }

    
    private String downloadAttachmentsUrl;

    /**
     * Getter for downloadAttachmentsUrl - salesForceCaseNo
     */
    public String getDownloadAttachmentsUrl() {
        return this.downloadAttachmentsUrl;
    }

    /**
     * Setter for downloadAttachmentsUrl - salesForceCaseNo
     */
    public void setDownloadAttachmentsUrl(String downloadAttachmentsUrl) {
        this.downloadAttachmentsUrl = downloadAttachmentsUrl;
    }

    
    private String customerFundingOption;

    /**
     * Getter for customerFundingOption - taxNoticeCustomerFundingOptionId
     */
    public String getCustomerFundingOption() {
        return this.customerFundingOption;
    }

    /**
     * Setter for customerFundingOption - taxNoticeCustomerFundingOptionId
     */
    public void setCustomerFundingOption(String customerFundingOption) {
        this.customerFundingOption = customerFundingOption;
    }

    
    private String documentReference;

    /**
     * Getter for documentReference - documentReference
     */
    public String getDocumentReference() {
        return this.documentReference;
    }

    /**
     * Setter for documentReference - documentReference
     */
    public void setDocumentReference(String documentReference) {
        this.documentReference = documentReference;
    }

    
    private Date closedDate;

    /**
     * Getter for closedDate - closedDate
     */
    public Date getClosedDate() {
        return this.closedDate;
    }

    /**
     * Setter for closedDate - closedDate
     */
    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    
    private Boolean showResolutionDateToCustomer;

    /**
     * Getter for showResolutionDateToCustomer - showResolutionDateToCustomer
     */
    public Boolean getShowResolutionDateToCustomer() {
        return this.showResolutionDateToCustomer;
    }

    /**
     * Setter for showResolutionDateToCustomer - showResolutionDateToCustomer
     */
    public void setShowResolutionDateToCustomer(Boolean showResolutionDateToCustomer) {
        this.showResolutionDateToCustomer = showResolutionDateToCustomer;
    }

    
    private Integer statusId;

    /**
     * Getter for statusId - taxNoticeStatusId
     */
    public Integer getStatusId() {
        return this.statusId;
    }

    /**
     * Setter for statusId - taxNoticeStatusId
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    
    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId - taxNoticeTaxAuthorityId
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId - taxNoticeTaxAuthorityId
     */
    public void setTaxAuthorityId(Integer taxAuthorityId) {
        this.taxAuthorityId = taxAuthorityId;
    }

    
    private String status;

    /**
     * Getter for status - taxNoticeStatus
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status - taxNoticeStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    
    private Integer reasonId;

    /**
     * Getter for reasonId - taxNoticeReasonId
     */
    public Integer getReasonId() {
        return this.reasonId;
    }

    /**
     * Setter for reasonId - taxNoticeReasonId
     */
    public void setReasonId(Integer reasonId) {
        this.reasonId = reasonId;
    }

    
    private Integer ownedByUserId;

    /**
     * Getter for ownedByUserId - The unique ID number of the user that owns the notice
     */
    public Integer getOwnedByUserId() {
        return this.ownedByUserId;
    }

    /**
     * Setter for ownedByUserId - The unique ID number of the user that owns the notice
     */
    public void setOwnedByUserId(Integer ownedByUserId) {
        this.ownedByUserId = ownedByUserId;
    }

    
    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId - The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    
    private Integer createdUserId;

    /**
     * Getter for createdUserId - The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId - The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    
    private String region;

    /**
     * Getter for region - taxNoticeState
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region - taxNoticeState
     */
    public void setRegion(String region) {
        this.region = region;
    }

    
    private String jurisdictionType;

    /**
     * Getter for jurisdictionType - jurisdictionType
     */
    public String getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType - jurisdictionType
     */
    public void setJurisdictionType(String jurisdictionType) {
        this.jurisdictionType = jurisdictionType;
    }

    
    private String type;

    /**
     * Getter for type - taxNoticeTypeId
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type - taxNoticeTypeId
     */
    public void setType(String type) {
        this.type = type;
    }

    
    private String taxPeriod;

    /**
     * Getter for taxPeriod - TaxPeriod
     */
    public String getTaxPeriod() {
        return this.taxPeriod;
    }

    /**
     * Setter for taxPeriod - TaxPeriod
     */
    public void setTaxPeriod(String taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    
    private String jurisdictionName;

    /**
     * Getter for jurisdictionName - jurisdictionName
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName - jurisdictionName
     */
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }

    
    private Boolean hideFromCustomer;

    /**
     * Getter for hideFromCustomer - hideFromCustomer
     */
    public Boolean getHideFromCustomer() {
        return this.hideFromCustomer;
    }

    /**
     * Setter for hideFromCustomer - hideFromCustomer
     */
    public void setHideFromCustomer(Boolean hideFromCustomer) {
        this.hideFromCustomer = hideFromCustomer;
    }

    
    private Integer companyId;

    /**
     * Getter for companyId - The unique ID number of the company to which this notice belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId - The unique ID number of the company to which this notice belongs.
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    
    private Date receivedDate;

    /**
     * Getter for receivedDate - receivedDate
     */
    public Date getReceivedDate() {
        return this.receivedDate;
    }

    /**
     * Setter for receivedDate - receivedDate
     */
    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    
    private ArrayList<NoticeCommentModel> comments;

    /**
     * Getter for comments - taxNoticeComments
     */
    public ArrayList<NoticeCommentModel> getComments() {
        return this.comments;
    }

    /**
     * Setter for comments - taxNoticeComments
     */
    public void setComments(ArrayList<NoticeCommentModel> comments) {
        this.comments = comments;
    }

    
    private Date createdDate;

    /**
     * Getter for createdDate - The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate - The date when this record was created.
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    
    private Integer priorityId;

    /**
     * Getter for priorityId - taxNoticePriorityId
     */
    public Integer getPriorityId() {
        return this.priorityId;
    }

    /**
     * Setter for priorityId - taxNoticePriorityId
     */
    public void setPriorityId(Integer priorityId) {
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
    