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
 * (c) 2004-2017 Avalara, Inc.
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 *
 * @author     Dustin Welden <dustin.welden@avalara.com>
 * @copyright  2004-2017 Avalara, Inc.
 * @license    https://www.apache.org/licenses/LICENSE-2.0
 * @version    17.5.2-77
 * @link       https://github.com/avadev/AvaTax-REST-V2-JRE-SDK
 */

/**
 * Represents a letter received from a tax authority regarding tax filing.
* These letters often have the warning "Notice" printed at the top, which is why
* they are called "Notices".
 */
public class NoticeModel {


    private int id;

    /**
     * Getter for id
     *
     * The unique ID number of this notice.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter for id
     *
     * The unique ID number of this notice.
     */
    public void setId(int value) {
        this.id = value;
    }


    private int companyId;

    /**
     * Getter for companyId
     *
     * The unique ID number of the company to which this notice belongs.
     */
    public int getCompanyId() {
        return this.companyId;
    }

    /**
     * Setter for companyId
     *
     * The unique ID number of the company to which this notice belongs.
     */
    public void setCompanyId(int value) {
        this.companyId = value;
    }


    private int statusId;

    /**
     * Getter for statusId
     *
     * The status id of the notice
     */
    public int getStatusId() {
        return this.statusId;
    }

    /**
     * Setter for statusId
     *
     * The status id of the notice
     */
    public void setStatusId(int value) {
        this.statusId = value;
    }


    private string status;

    /**
     * Getter for status
     *
     * The status of the notice
     */
    public string getStatus() {
        return this.status;
    }

    /**
     * Setter for status
     *
     * The status of the notice
     */
    public void setStatus(string value) {
        this.status = value;
    }


    private Instant receivedDate;

    /**
     * Getter for receivedDate
     *
     * The received date of the notice
     */
    public Instant getReceivedDate() {
        return this.receivedDate;
    }

    /**
     * Setter for receivedDate
     *
     * The received date of the notice
     */
    public void setReceivedDate(Instant value) {
        this.receivedDate = value;
    }


    private Instant closedDate;

    /**
     * Getter for closedDate
     *
     * The closed date of the notice
     */
    public Instant getClosedDate() {
        return this.closedDate;
    }

    /**
     * Setter for closedDate
     *
     * The closed date of the notice
     */
    public void setClosedDate(Instant value) {
        this.closedDate = value;
    }


    private Decimal totalRemit;

    /**
     * Getter for totalRemit
     *
     * The total remmitance amount for the notice
     */
    public Decimal getTotalRemit() {
        return this.totalRemit;
    }

    /**
     * Setter for totalRemit
     *
     * The total remmitance amount for the notice
     */
    public void setTotalRemit(Decimal value) {
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


    private string country;

    /**
     * Getter for country
     *
     * The country the notice is in
     */
    public string getCountry() {
        return this.country;
    }

    /**
     * Setter for country
     *
     * The country the notice is in
     */
    public void setCountry(string value) {
        this.country = value;
    }


    private string region;

    /**
     * Getter for region
     *
     * The region the notice is for
     */
    public string getRegion() {
        return this.region;
    }

    /**
     * Setter for region
     *
     * The region the notice is for
     */
    public void setRegion(string value) {
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


    private string ticketReferenceNo;

    /**
     * Getter for ticketReferenceNo
     *
     * The ticket reference number of the notice
     */
    public string getTicketReferenceNo() {
        return this.ticketReferenceNo;
    }

    /**
     * Setter for ticketReferenceNo
     *
     * The ticket reference number of the notice
     */
    public void setTicketReferenceNo(string value) {
        this.ticketReferenceNo = value;
    }


    private string ticketReferenceUrl;

    /**
     * Getter for ticketReferenceUrl
     *
     * The ticket reference url of the notice
     */
    public string getTicketReferenceUrl() {
        return this.ticketReferenceUrl;
    }

    /**
     * Setter for ticketReferenceUrl
     *
     * The ticket reference url of the notice
     */
    public void setTicketReferenceUrl(string value) {
        this.ticketReferenceUrl = value;
    }


    private string salesForceCase;

    /**
     * Getter for salesForceCase
     *
     * The sales force case of the notice
     */
    public string getSalesForceCase() {
        return this.salesForceCase;
    }

    /**
     * Setter for salesForceCase
     *
     * The sales force case of the notice
     */
    public void setSalesForceCase(string value) {
        this.salesForceCase = value;
    }


    private string salesForceCaseUrl;

    /**
     * Getter for salesForceCaseUrl
     *
     * The URL to the sales force case
     */
    public string getSalesForceCaseUrl() {
        return this.salesForceCaseUrl;
    }

    /**
     * Setter for salesForceCaseUrl
     *
     * The URL to the sales force case
     */
    public void setSalesForceCaseUrl(string value) {
        this.salesForceCaseUrl = value;
    }


    private string taxPeriod;

    /**
     * Getter for taxPeriod
     *
     * The tax period of the notice
     */
    public string getTaxPeriod() {
        return this.taxPeriod;
    }

    /**
     * Setter for taxPeriod
     *
     * The tax period of the notice
     */
    public void setTaxPeriod(string value) {
        this.taxPeriod = value;
    }


    private int reasonId;

    /**
     * Getter for reasonId
     *
     * The notice reason id
     */
    public int getReasonId() {
        return this.reasonId;
    }

    /**
     * Setter for reasonId
     *
     * The notice reason id
     */
    public void setReasonId(int value) {
        this.reasonId = value;
    }


    private string reason;

    /**
     * Getter for reason
     *
     * The notice reason
     */
    public string getReason() {
        return this.reason;
    }

    /**
     * Setter for reason
     *
     * The notice reason
     */
    public void setReason(string value) {
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


    private string type;

    /**
     * Getter for type
     *
     * The tax notice type description
     */
    public string getType() {
        return this.type;
    }

    /**
     * Setter for type
     *
     * The tax notice type description
     */
    public void setType(string value) {
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


    private string customerComment;

    /**
     * Getter for customerComment
     *
     * Comments from the customer on this notice
     */
    public string getCustomerComment() {
        return this.customerComment;
    }

    /**
     * Setter for customerComment
     *
     * Comments from the customer on this notice
     */
    public void setCustomerComment(string value) {
        this.customerComment = value;
    }


    private boolean hideFromCustomer;

    /**
     * Getter for hideFromCustomer
     *
     * Indicator to hide from customer
     */
    public boolean getHideFromCustomer() {
        return this.hideFromCustomer;
    }

    /**
     * Setter for hideFromCustomer
     *
     * Indicator to hide from customer
     */
    public void setHideFromCustomer(boolean value) {
        this.hideFromCustomer = value;
    }


    private Instant expectedResolutionDate;

    /**
     * Getter for expectedResolutionDate
     *
     * Expected resolution date of the notice
     */
    public Instant getExpectedResolutionDate() {
        return this.expectedResolutionDate;
    }

    /**
     * Setter for expectedResolutionDate
     *
     * Expected resolution date of the notice
     */
    public void setExpectedResolutionDate(Instant value) {
        this.expectedResolutionDate = value;
    }


    private boolean showResolutionDateToCustomer;

    /**
     * Getter for showResolutionDateToCustomer
     *
     * Indicator to show customer this resolution date
     */
    public boolean getShowResolutionDateToCustomer() {
        return this.showResolutionDateToCustomer;
    }

    /**
     * Setter for showResolutionDateToCustomer
     *
     * Indicator to show customer this resolution date
     */
    public void setShowResolutionDateToCustomer(boolean value) {
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


    private string createdByUserName;

    /**
     * Getter for createdByUserName
     *
     * The user who created the notice
     */
    public string getCreatedByUserName() {
        return this.createdByUserName;
    }

    /**
     * Setter for createdByUserName
     *
     * The user who created the notice
     */
    public void setCreatedByUserName(string value) {
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


    private string description;

    /**
     * Getter for description
     *
     * The description of the notice
     */
    public string getDescription() {
        return this.description;
    }

    /**
     * Setter for description
     *
     * The description of the notice
     */
    public void setDescription(string value) {
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


    private string documentReference;

    /**
     * Getter for documentReference
     *
     * The document reference of the notice
     */
    public string getDocumentReference() {
        return this.documentReference;
    }

    /**
     * Setter for documentReference
     *
     * The document reference of the notice
     */
    public void setDocumentReference(string value) {
        this.documentReference = value;
    }


    private string jurisdictionName;

    /**
     * Getter for jurisdictionName
     *
     * The jurisdiction name of the notice
     */
    public string getJurisdictionName() {
        return this.jurisdictionName;
    }

    /**
     * Setter for jurisdictionName
     *
     * The jurisdiction name of the notice
     */
    public void setJurisdictionName(string value) {
        this.jurisdictionName = value;
    }


    private string jurisdictionType;

    /**
     * Getter for jurisdictionType
     *
     * The jurisdiction type of the notice
     */
    public string getJurisdictionType() {
        return this.jurisdictionType;
    }

    /**
     * Setter for jurisdictionType
     *
     * The jurisdiction type of the notice
     */
    public void setJurisdictionType(string value) {
        this.jurisdictionType = value;
    }


    private NoticeCommentModel[] comments;

    /**
     * Getter for comments
     *
     * Additional comments on the notice
     */
    public NoticeCommentModel[] getComments() {
        return this.comments;
    }

    /**
     * Setter for comments
     *
     * Additional comments on the notice
     */
    public void setComments(NoticeCommentModel[] value) {
        this.comments = value;
    }


    private NoticeFinanceModel[] finances;

    /**
     * Getter for finances
     *
     * Finance details of the notice
     */
    public NoticeFinanceModel[] getFinances() {
        return this.finances;
    }

    /**
     * Setter for finances
     *
     * Finance details of the notice
     */
    public void setFinances(NoticeFinanceModel[] value) {
        this.finances = value;
    }


    private NoticeResponsibilityDetailModel[] responsibility;

    /**
     * Getter for responsibility
     *
     * Notice Responsibility Details
     */
    public NoticeResponsibilityDetailModel[] getResponsibility() {
        return this.responsibility;
    }

    /**
     * Setter for responsibility
     *
     * Notice Responsibility Details
     */
    public void setResponsibility(NoticeResponsibilityDetailModel[] value) {
        this.responsibility = value;
    }


    private NoticeRootCauseDetailModel[] rootCause;

    /**
     * Getter for rootCause
     *
     * Notice Root Cause Details
     */
    public NoticeRootCauseDetailModel[] getRootCause() {
        return this.rootCause;
    }

    /**
     * Setter for rootCause
     *
     * Notice Root Cause Details
     */
    public void setRootCause(NoticeRootCauseDetailModel[] value) {
        this.rootCause = value;
    }


    private Instant createdDate;

    /**
     * Getter for createdDate
     *
     * The date when this record was created.
     */
    public Instant getCreatedDate() {
        return this.createdDate;
    }

    /**
     * Setter for createdDate
     *
     * The date when this record was created.
     */
    public void setCreatedDate(Instant value) {
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


    private Instant modifiedDate;

    /**
     * Getter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public Instant getModifiedDate() {
        return this.modifiedDate;
    }

    /**
     * Setter for modifiedDate
     *
     * The date/time when this record was last modified.
     */
    public void setModifiedDate(Instant value) {
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
