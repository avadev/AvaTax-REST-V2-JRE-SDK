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
 */

/**
 * Represents a letter received from a tax authority regarding tax filing.
* These letters often have the warning "Notice" printed at the top, which is why
* they are called "Notices".
 */
public class NoticeModel {


    private Integer id;

    /**
     * Getter for id
     *
     * The unique ID number of this notice.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this notice.
     */
    public void setId(Integer value) {
        this.id = value;
    }


    private Integer companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which this notice belongs.
     */
    public Integer getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which this notice belongs.
     */
    public void setCompanyId(Integer value) {
        this.companyId = value;
    }


    private Integer statusId;

    /**
     * Getter for statusId
     *
     * The status id of the notice
     */
    public Integer getStatusId() {
        return this.statusId;
    }

    /**
     * Setter for statusId
     *
     * The status id of the notice
     */
    public void setStatusId(Integer value) {
        this.statusId = value;
    }


    private String status;

    /**
     * Getter for status
     *
     * The status of the notice
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the notice
     */
    public void setStatus(String value) {
        this.status = value;
    }


    private Date receivedDate;

    /**
     * Getter for receivedDate
     *
     * The received date of the notice
     */
    public Date getReceivedDate() {
        return this.receivedDate;
    }

    /**
     * Setter for receivedDate
     *
     * The received date of the notice
     */
    public void setReceivedDate(Date value) {
        this.receivedDate = value;
    }


    private Date closedDate;

    /**
     * Getter for closedDate
     *
     * The closed date of the notice
     */
    public Date getClosedDate() {
        return this.closedDate;
    }

    /**
     * Setter for closedDate
     *
     * The closed date of the notice
     */
    public void setClosedDate(Date value) {
        this.closedDate = value;
    }


    private BigDecimal totalRemit;

    /**
     * Getter for totalRemit
     *
     * The total remmitance amount for the notice
     */
    public BigDecimal getTotalRemit() {
        return this.totalRemit;
    }

    /**
     * Setter for totalRemit
     *
     * The total remmitance amount for the notice
     */
    public void setTotalRemit(BigDecimal value) {
        this.totalRemit = value;
    }


    private NoticeCustomerType customerTypeId;

    /**
     * Getter for customerTypeId
     *
     * NoticeCustomerTypeID can be retrieved from the definitions API
     */
    public NoticeCustomerType getCustomerTypeId() {
        return this.customerTypeId;
    }

    /**
     * Setter for customerTypeId
     *
     * NoticeCustomerTypeID can be retrieved from the definitions API
     */
    public void setCustomerTypeId(NoticeCustomerType value) {
        this.customerTypeId = value;
    }


    private String country;

    /**
     * Getter for country
     *
     * Name or ISO 3166 code identifying the country that sent this notice.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * Name or ISO 3166 code identifying the country that sent this notice.
    * 
    * This field supports many different country identifiers:
    *  * Two character ISO 3166 codes
    *  * Three character ISO 3166 codes
    *  * Fully spelled out names of the country in ISO supported languages
    *  * Common alternative spellings for many countries
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListCountries`.
     */
    public void setCountry(String value) {
        this.country = value;
    }


    private String region;

    /**
     * Getter for region
     *
     * Name or ISO 3166 code identifying the region within the country that sent this notice.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * Name or ISO 3166 code identifying the region within the country that sent this notice.
    * 
    * This field supports many different region identifiers:
    *  * Two and three character ISO 3166 region codes
    *  * Fully spelled out names of the region in ISO supported languages
    *  * Common alternative spellings for many regions
    * 
    * For a full list of all supported codes and names, please see the Definitions API `ListRegions`.
     */
    public void setRegion(String value) {
        this.region = value;
    }


    private Integer taxAuthorityId;

    /**
     * Getter for taxAuthorityId
     *
     * The tax authority id of the notice
     */
    public Integer getTaxAuthorityId() {
        return this.taxAuthorityId;
    }

    /**
     * Setter for taxAuthorityId
     *
     * The tax authority id of the notice
     */
    public void setTaxAuthorityId(Integer value) {
        this.taxAuthorityId = value;
    }


    private FilingFrequencyId filingFrequency;

    /**
     * Getter for filingFrequency
     *
     * The filing frequency of the notice
     */
    public FilingFrequencyId getFilingFrequency() {
        return this.filingFrequency;
    }

    /**
     * Setter for filingFrequency
     *
     * The filing frequency of the notice
     */
    public void setFilingFrequency(FilingFrequencyId value) {
        this.filingFrequency = value;
    }


    private FilingTypeId filingTypeId;

    /**
     * Getter for filingTypeId
     *
     * The filing type of the notice
     */
    public FilingTypeId getFilingTypeId() {
        return this.filingTypeId;
    }

    /**
     * Setter for filingTypeId
     *
     * The filing type of the notice
     */
    public void setFilingTypeId(FilingTypeId value) {
        this.filingTypeId = value;
    }


    private String ticketReferenceNo;

    /**
     * Getter for ticketReferenceNo
     *
     * The ticket reference number of the notice
     */
    public String getTicketReferenceNo() {
        return this.ticketReferenceNo;
    }

    /**
     * Setter for ticketReferenceNo
     *
     * The ticket reference number of the notice
     */
    public void setTicketReferenceNo(String value) {
        this.ticketReferenceNo = value;
    }


    private String ticketReferenceUrl;

    /**
     * Getter for ticketReferenceUrl
     *
     * The ticket reference url of the notice
     */
    public String getTicketReferenceUrl() {
        return this.ticketReferenceUrl;
    }

    /**
     * Setter for ticketReferenceUrl
     *
     * The ticket reference url of the notice
     */
    public void setTicketReferenceUrl(String value) {
        this.ticketReferenceUrl = value;
    }


    private String salesForceCase;

    /**
     * Getter for salesForceCase
     *
     * The sales force case of the notice
     */
    public String getSalesForceCase() {
        return this.salesForceCase;
    }

    /**
     * Setter for salesForceCase
     *
     * The sales force case of the notice
     */
    public void setSalesForceCase(String value) {
        this.salesForceCase = value;
    }


    private String salesForceCaseUrl;

    /**
     * Getter for salesForceCaseUrl
     *
     * The URL to the sales force case
     */
    public String getSalesForceCaseUrl() {
        return this.salesForceCaseUrl;
    }

    /**
     * Setter for salesForceCaseUrl
     *
     * The URL to the sales force case
     */
    public void setSalesForceCaseUrl(String value) {
        this.salesForceCaseUrl = value;
    }


    private String taxPeriod;

    /**
     * Getter for taxPeriod
     *
     * The tax period of the notice
     */
    public String getTaxPeriod() {
        return this.taxPeriod;
    }

    /**
     * Setter for taxPeriod
     *
     * The tax period of the notice
     */
    public void setTaxPeriod(String value) {
        this.taxPeriod = value;
    }


    private Integer reasonId;

    /**
     * Getter for reasonId
     *
     * The notice reason id
     */
    public Integer getReasonId() {
        return this.reasonId;
    }

    /**
     * Setter for reasonId
     *
     * The notice reason id
     */
    public void setReasonId(Integer value) {
        this.reasonId = value;
    }


    private String reason;

    /**
     * Getter for reason
     *
     * The notice reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for reason
     *
     * The notice reason
     */
    public void setReason(String value) {
        this.reason = value;
    }


    private Integer typeId;

    /**
     * Getter for typeId
     *
     * The tax notice type id
     */
    public Integer getTypeId() {
        return this.typeId;
    }

    /**
     * Setter for typeId
     *
     * The tax notice type id
     */
    public void setTypeId(Integer value) {
        this.typeId = value;
    }


    private String type;

    /**
     * Getter for type
     *
     * The tax notice type description
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The tax notice type description
     */
    public void setType(String value) {
        this.type = value;
    }


    private FundingOption customerFundingOptionId;

    /**
     * Getter for customerFundingOptionId
     *
     * The notice customer funding options
     */
    public FundingOption getCustomerFundingOptionId() {
        return this.customerFundingOptionId;
    }

    /**
     * Setter for customerFundingOptionId
     *
     * The notice customer funding options
     */
    public void setCustomerFundingOptionId(FundingOption value) {
        this.customerFundingOptionId = value;
    }


    private NoticePriorityId priorityId;

    /**
     * Getter for priorityId
     *
     * The priority of the notice
     */
    public NoticePriorityId getPriorityId() {
        return this.priorityId;
    }

    /**
     * Setter for priorityId
     *
     * The priority of the notice
     */
    public void setPriorityId(NoticePriorityId value) {
        this.priorityId = value;
    }


    private String customerComment;

    /**
     * Getter for customerComment
     *
     * Comments from the customer on this notice
     */
    public String getCustomerComment() {
        return this.customerComment;
    }

    /**
     * Setter for customerComment
     *
     * Comments from the customer on this notice
     */
    public void setCustomerComment(String value) {
        this.customerComment = value;
    }


    private Boolean hideFromCustomer;

    /**
     * Getter for hideFromCustomer
     *
     * Indicator to hide from customer
     */
    public Boolean getHideFromCustomer() {
        return this.hideFromCustomer;
    }

    /**
     * Setter for hideFromCustomer
     *
     * Indicator to hide from customer
     */
    public void setHideFromCustomer(Boolean value) {
        this.hideFromCustomer = value;
    }


    private Date expectedResolutionDate;

    /**
     * Getter for expectedResolutionDate
     *
     * Expected resolution date of the notice
     */
    public Date getExpectedResolutionDate() {
        return this.expectedResolutionDate;
    }

    /**
     * Setter for expectedResolutionDate
     *
     * Expected resolution date of the notice
     */
    public void setExpectedResolutionDate(Date value) {
        this.expectedResolutionDate = value;
    }


    private Boolean showResolutionDateToCustomer;

    /**
     * Getter for showResolutionDateToCustomer
     *
     * Indicator to show customer this resolution date
     */
    public Boolean getShowResolutionDateToCustomer() {
        return this.showResolutionDateToCustomer;
    }

    /**
     * Setter for showResolutionDateToCustomer
     *
     * Indicator to show customer this resolution date
     */
    public void setShowResolutionDateToCustomer(Boolean value) {
        this.showResolutionDateToCustomer = value;
    }


    private Integer closedByUserId;

    /**
     * Getter for closedByUserId
     *
     * The unique ID number of the user that closed the notice
     */
    public Integer getClosedByUserId() {
        return this.closedByUserId;
    }

    /**
     * Setter for closedByUserId
     *
     * The unique ID number of the user that closed the notice
     */
    public void setClosedByUserId(Integer value) {
        this.closedByUserId = value;
    }


    private String createdByUserName;

    /**
     * Getter for createdByUserName
     *
     * The user who created the notice
     */
    public String getCreatedByUserName() {
        return this.createdByUserName;
    }

    /**
     * Setter for createdByUserName
     *
     * The user who created the notice
     */
    public void setCreatedByUserName(String value) {
        this.createdByUserName = value;
    }


    private Integer ownedByUserId;

    /**
     * Getter for ownedByUserId
     *
     * The unique ID number of the user that owns the notice
     */
    public Integer getOwnedByUserId() {
        return this.ownedByUserId;
    }

    /**
     * Setter for ownedByUserId
     *
     * The unique ID number of the user that owns the notice
     */
    public void setOwnedByUserId(Integer value) {
        this.ownedByUserId = value;
    }


    private String description;

    /**
     * Getter for description
     *
     * The description of the notice
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of the notice
     */
    public void setDescription(String value) {
        this.description = value;
    }


    private Integer avaFileFormId;

    /**
     * Getter for avaFileFormId
     *
     * The ava file form id of the notice
     */
    public Integer getAvaFileFormId() {
        return this.avaFileFormId;
    }

    /**
     * Setter for avaFileFormId
     *
     * The ava file form id of the notice
     */
    public void setAvaFileFormId(Integer value) {
        this.avaFileFormId = value;
    }


    private Integer revenueContactId;

    /**
     * Getter for revenueContactId
     *
     * The id of the revenue contact
     */
    public Integer getRevenueContactId() {
        return this.revenueContactId;
    }

    /**
     * Setter for revenueContactId
     *
     * The id of the revenue contact
     */
    public void setRevenueContactId(Integer value) {
        this.revenueContactId = value;
    }


    private Integer complianceContactId;

    /**
     * Getter for complianceContactId
     *
     * The id of the compliance contact
     */
    public Integer getComplianceContactId() {
        return this.complianceContactId;
    }

    /**
     * Setter for complianceContactId
     *
     * The id of the compliance contact
     */
    public void setComplianceContactId(Integer value) {
        this.complianceContactId = value;
    }


    private String documentReference;

    /**
     * Getter for documentReference
     *
     * The document reference of the notice
     */
    public String getDocumentReference() {
        return this.documentReference;
    }

    /**
     * Setter for documentReference
     *
     * The document reference of the notice
     */
    public void setDocumentReference(String value) {
        this.documentReference = value;
    }


    private String jurisdictionName;

    /**
     * Getter for jurisdictionName
     *
     * The jurisdiction name of the notice
     */
    public String getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName
     *
     * The jurisdiction name of the notice
     */
    public void setJurisdictionName(String value) {
        this.jurisdictionName = value;
    }


    private String jurisdictionType;

    /**
     * Getter for jurisdictionType
     *
     * The jurisdiction type of the notice
     */
    public String getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType
     *
     * The jurisdiction type of the notice
     */
    public void setJurisdictionType(String value) {
        this.jurisdictionType = value;
    }


    private ArrayList<NoticeCommentModel> comments;

    /**
     * Getter for comments
     *
     * Additional comments on the notice
     */
    public ArrayList<NoticeCommentModel> getComments() {
        return this.comments;
    }

    /**
     * Setter for comments
     *
     * Additional comments on the notice
     */
    public void setComments(ArrayList<NoticeCommentModel> value) {
        this.comments = value;
    }


    private ArrayList<NoticeFinanceModel> finances;

    /**
     * Getter for finances
     *
     * Finance details of the notice
     */
    public ArrayList<NoticeFinanceModel> getFinances() {
        return this.finances;
    }

    /**
     * Setter for finances
     *
     * Finance details of the notice
     */
    public void setFinances(ArrayList<NoticeFinanceModel> value) {
        this.finances = value;
    }


    private ArrayList<NoticeResponsibilityDetailModel> responsibility;

    /**
     * Getter for responsibility
     *
     * Notice Responsibility Details
     */
    public ArrayList<NoticeResponsibilityDetailModel> getResponsibility() {
        return this.responsibility;
    }

    /**
     * Setter for responsibility
     *
     * Notice Responsibility Details
     */
    public void setResponsibility(ArrayList<NoticeResponsibilityDetailModel> value) {
        this.responsibility = value;
    }


    private ArrayList<NoticeRootCauseDetailModel> rootCause;

    /**
     * Getter for rootCause
     *
     * Notice Root Cause Details
     */
    public ArrayList<NoticeRootCauseDetailModel> getRootCause() {
        return this.rootCause;
    }

    /**
     * Setter for rootCause
     *
     * Notice Root Cause Details
     */
    public void setRootCause(ArrayList<NoticeRootCauseDetailModel> value) {
        this.rootCause = value;
    }


    private Date createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Date value) {
        this.createdDate = value;
    }


    private Integer createdUserId;

    /**
     * Getter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public Integer getCreatedUserId() {
        return this.createdUserId;
    }

    /**
     * Setter for createdUserId
     *
     * The User ID of the user who created this record.
     */
    public void setCreatedUserId(Integer value) {
        this.createdUserId = value;
    }


    private Date modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Date getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Date value) {
        this.modifiedDate = value;
    }


    private Integer modifiedUserId;

    /**
     * Getter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public Integer getModifiedUserId() {
        return this.modifiedUserId;
    }

    /**
     * Setter for modifiedUserId
     *
     * The user ID of the user who last modified this record.
     */
    public void setModifiedUserId(Integer value) {
        this.modifiedUserId = value;
    }


    /**
     * Returns a JSON string representation of NoticeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
