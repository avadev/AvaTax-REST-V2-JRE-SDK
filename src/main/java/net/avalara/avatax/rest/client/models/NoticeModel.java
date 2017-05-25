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


    private Int32 id;

    /**
     * Getter for id;
     * The unique ID number of this notice.
     */
    public Int32 getid() {;
        return this.id;;
    }

    /**
     * Setter for id;
     * The unique ID number of this notice.
     */
    public void setid(Int32 value) {;
        this.id = value;;
    }


    private Int32 companyId;

    /**
     * Getter for companyId;
     * The unique ID number of the company to which this notice belongs.
     */
    public Int32 getcompanyId() {;
        return this.companyId;;
    }

    /**
     * Setter for companyId;
     * The unique ID number of the company to which this notice belongs.
     */
    public void setcompanyId(Int32 value) {;
        this.companyId = value;;
    }


    private Int32 statusId;

    /**
     * Getter for statusId;
     * The status id of the notice
     */
    public Int32 getstatusId() {;
        return this.statusId;;
    }

    /**
     * Setter for statusId;
     * The status id of the notice
     */
    public void setstatusId(Int32 value) {;
        this.statusId = value;;
    }


    private String status;

    /**
     * Getter for status;
     * The status of the notice
     */
    public String getstatus() {;
        return this.status;;
    }

    /**
     * Setter for status;
     * The status of the notice
     */
    public void setstatus(String value) {;
        this.status = value;;
    }


    private DateTime receivedDate;

    /**
     * Getter for receivedDate;
     * The received date of the notice
     */
    public DateTime getreceivedDate() {;
        return this.receivedDate;;
    }

    /**
     * Setter for receivedDate;
     * The received date of the notice
     */
    public void setreceivedDate(DateTime value) {;
        this.receivedDate = value;;
    }


    private DateTime? closedDate;

    /**
     * Getter for closedDate;
     * The closed date of the notice
     */
    public DateTime? getclosedDate() {;
        return this.closedDate;;
    }

    /**
     * Setter for closedDate;
     * The closed date of the notice
     */
    public void setclosedDate(DateTime? value) {;
        this.closedDate = value;;
    }


    private Decimal? totalRemit;

    /**
     * Getter for totalRemit;
     * The total remmitance amount for the notice
     */
    public Decimal? gettotalRemit() {;
        return this.totalRemit;;
    }

    /**
     * Setter for totalRemit;
     * The total remmitance amount for the notice
     */
    public void settotalRemit(Decimal? value) {;
        this.totalRemit = value;;
    }


    private NoticeCustomerType customerTypeId;

    /**
     * Getter for customerTypeId;
     * NoticeCustomerTypeID can be retrieved from the definitions API
     */
    public NoticeCustomerType getcustomerTypeId() {;
        return this.customerTypeId;;
    }

    /**
     * Setter for customerTypeId;
     * NoticeCustomerTypeID can be retrieved from the definitions API
     */
    public void setcustomerTypeId(NoticeCustomerType value) {;
        this.customerTypeId = value;;
    }


    private String country;

    /**
     * Getter for country;
     * The country the notice is in
     */
    public String getcountry() {;
        return this.country;;
    }

    /**
     * Setter for country;
     * The country the notice is in
     */
    public void setcountry(String value) {;
        this.country = value;;
    }


    private String region;

    /**
     * Getter for region;
     * The region the notice is for
     */
    public String getregion() {;
        return this.region;;
    }

    /**
     * Setter for region;
     * The region the notice is for
     */
    public void setregion(String value) {;
        this.region = value;;
    }


    private Int32? taxAuthorityId;

    /**
     * Getter for taxAuthorityId;
     * The tax authority id of the notice
     */
    public Int32? gettaxAuthorityId() {;
        return this.taxAuthorityId;;
    }

    /**
     * Setter for taxAuthorityId;
     * The tax authority id of the notice
     */
    public void settaxAuthorityId(Int32? value) {;
        this.taxAuthorityId = value;;
    }


    private FilingFrequencyId? filingFrequency;

    /**
     * Getter for filingFrequency;
     * The filing frequency of the notice
     */
    public FilingFrequencyId? getfilingFrequency() {;
        return this.filingFrequency;;
    }

    /**
     * Setter for filingFrequency;
     * The filing frequency of the notice
     */
    public void setfilingFrequency(FilingFrequencyId? value) {;
        this.filingFrequency = value;;
    }


    private FilingTypeId? filingTypeId;

    /**
     * Getter for filingTypeId;
     * The filing type of the notice
     */
    public FilingTypeId? getfilingTypeId() {;
        return this.filingTypeId;;
    }

    /**
     * Setter for filingTypeId;
     * The filing type of the notice
     */
    public void setfilingTypeId(FilingTypeId? value) {;
        this.filingTypeId = value;;
    }


    private String ticketReferenceNo;

    /**
     * Getter for ticketReferenceNo;
     * The ticket reference number of the notice
     */
    public String getticketReferenceNo() {;
        return this.ticketReferenceNo;;
    }

    /**
     * Setter for ticketReferenceNo;
     * The ticket reference number of the notice
     */
    public void setticketReferenceNo(String value) {;
        this.ticketReferenceNo = value;;
    }


    private String ticketReferenceUrl;

    /**
     * Getter for ticketReferenceUrl;
     * The ticket reference url of the notice
     */
    public String getticketReferenceUrl() {;
        return this.ticketReferenceUrl;;
    }

    /**
     * Setter for ticketReferenceUrl;
     * The ticket reference url of the notice
     */
    public void setticketReferenceUrl(String value) {;
        this.ticketReferenceUrl = value;;
    }


    private String salesForceCase;

    /**
     * Getter for salesForceCase;
     * The sales force case of the notice
     */
    public String getsalesForceCase() {;
        return this.salesForceCase;;
    }

    /**
     * Setter for salesForceCase;
     * The sales force case of the notice
     */
    public void setsalesForceCase(String value) {;
        this.salesForceCase = value;;
    }


    private String salesForceCaseUrl;

    /**
     * Getter for salesForceCaseUrl;
     * The URL to the sales force case
     */
    public String getsalesForceCaseUrl() {;
        return this.salesForceCaseUrl;;
    }

    /**
     * Setter for salesForceCaseUrl;
     * The URL to the sales force case
     */
    public void setsalesForceCaseUrl(String value) {;
        this.salesForceCaseUrl = value;;
    }


    private String taxPeriod;

    /**
     * Getter for taxPeriod;
     * The tax period of the notice
     */
    public String gettaxPeriod() {;
        return this.taxPeriod;;
    }

    /**
     * Setter for taxPeriod;
     * The tax period of the notice
     */
    public void settaxPeriod(String value) {;
        this.taxPeriod = value;;
    }


    private Int32 reasonId;

    /**
     * Getter for reasonId;
     * The notice reason id
     */
    public Int32 getreasonId() {;
        return this.reasonId;;
    }

    /**
     * Setter for reasonId;
     * The notice reason id
     */
    public void setreasonId(Int32 value) {;
        this.reasonId = value;;
    }


    private String reason;

    /**
     * Getter for reason;
     * The notice reason
     */
    public String getreason() {;
        return this.reason;;
    }

    /**
     * Setter for reason;
     * The notice reason
     */
    public void setreason(String value) {;
        this.reason = value;;
    }


    private Int32? typeId;

    /**
     * Getter for typeId;
     * The tax notice type id
     */
    public Int32? gettypeId() {;
        return this.typeId;;
    }

    /**
     * Setter for typeId;
     * The tax notice type id
     */
    public void settypeId(Int32? value) {;
        this.typeId = value;;
    }


    private String type;

    /**
     * Getter for type;
     * The tax notice type description
     */
    public String gettype() {;
        return this.type;;
    }

    /**
     * Setter for type;
     * The tax notice type description
     */
    public void settype(String value) {;
        this.type = value;;
    }


    private FundingOption? customerFundingOptionId;

    /**
     * Getter for customerFundingOptionId;
     * The notice customer funding options
     */
    public FundingOption? getcustomerFundingOptionId() {;
        return this.customerFundingOptionId;;
    }

    /**
     * Setter for customerFundingOptionId;
     * The notice customer funding options
     */
    public void setcustomerFundingOptionId(FundingOption? value) {;
        this.customerFundingOptionId = value;;
    }


    private NoticePriorityId priorityId;

    /**
     * Getter for priorityId;
     * The priority of the notice
     */
    public NoticePriorityId getpriorityId() {;
        return this.priorityId;;
    }

    /**
     * Setter for priorityId;
     * The priority of the notice
     */
    public void setpriorityId(NoticePriorityId value) {;
        this.priorityId = value;;
    }


    private String customerComment;

    /**
     * Getter for customerComment;
     * Comments from the customer on this notice
     */
    public String getcustomerComment() {;
        return this.customerComment;;
    }

    /**
     * Setter for customerComment;
     * Comments from the customer on this notice
     */
    public void setcustomerComment(String value) {;
        this.customerComment = value;;
    }


    private Boolean hideFromCustomer;

    /**
     * Getter for hideFromCustomer;
     * Indicator to hide from customer
     */
    public Boolean gethideFromCustomer() {;
        return this.hideFromCustomer;;
    }

    /**
     * Setter for hideFromCustomer;
     * Indicator to hide from customer
     */
    public void sethideFromCustomer(Boolean value) {;
        this.hideFromCustomer = value;;
    }


    private DateTime? expectedResolutionDate;

    /**
     * Getter for expectedResolutionDate;
     * Expected resolution date of the notice
     */
    public DateTime? getexpectedResolutionDate() {;
        return this.expectedResolutionDate;;
    }

    /**
     * Setter for expectedResolutionDate;
     * Expected resolution date of the notice
     */
    public void setexpectedResolutionDate(DateTime? value) {;
        this.expectedResolutionDate = value;;
    }


    private Boolean showResolutionDateToCustomer;

    /**
     * Getter for showResolutionDateToCustomer;
     * Indicator to show customer this resolution date
     */
    public Boolean getshowResolutionDateToCustomer() {;
        return this.showResolutionDateToCustomer;;
    }

    /**
     * Setter for showResolutionDateToCustomer;
     * Indicator to show customer this resolution date
     */
    public void setshowResolutionDateToCustomer(Boolean value) {;
        this.showResolutionDateToCustomer = value;;
    }


    private Int32? closedByUserId;

    /**
     * Getter for closedByUserId;
     * The unique ID number of the user that closed the notice
     */
    public Int32? getclosedByUserId() {;
        return this.closedByUserId;;
    }

    /**
     * Setter for closedByUserId;
     * The unique ID number of the user that closed the notice
     */
    public void setclosedByUserId(Int32? value) {;
        this.closedByUserId = value;;
    }


    private String createdByUserName;

    /**
     * Getter for createdByUserName;
     * The user who created the notice
     */
    public String getcreatedByUserName() {;
        return this.createdByUserName;;
    }

    /**
     * Setter for createdByUserName;
     * The user who created the notice
     */
    public void setcreatedByUserName(String value) {;
        this.createdByUserName = value;;
    }


    private Int32? ownedByUserId;

    /**
     * Getter for ownedByUserId;
     * The unique ID number of the user that owns the notice
     */
    public Int32? getownedByUserId() {;
        return this.ownedByUserId;;
    }

    /**
     * Setter for ownedByUserId;
     * The unique ID number of the user that owns the notice
     */
    public void setownedByUserId(Int32? value) {;
        this.ownedByUserId = value;;
    }


    private String description;

    /**
     * Getter for description;
     * The description of the notice
     */
    public String getdescription() {;
        return this.description;;
    }

    /**
     * Setter for description;
     * The description of the notice
     */
    public void setdescription(String value) {;
        this.description = value;;
    }


    private Int32? avaFileFormId;

    /**
     * Getter for avaFileFormId;
     * The ava file form id of the notice
     */
    public Int32? getavaFileFormId() {;
        return this.avaFileFormId;;
    }

    /**
     * Setter for avaFileFormId;
     * The ava file form id of the notice
     */
    public void setavaFileFormId(Int32? value) {;
        this.avaFileFormId = value;;
    }


    private Int32? revenueContactId;

    /**
     * Getter for revenueContactId;
     * The id of the revenue contact
     */
    public Int32? getrevenueContactId() {;
        return this.revenueContactId;;
    }

    /**
     * Setter for revenueContactId;
     * The id of the revenue contact
     */
    public void setrevenueContactId(Int32? value) {;
        this.revenueContactId = value;;
    }


    private Int32? complianceContactId;

    /**
     * Getter for complianceContactId;
     * The id of the compliance contact
     */
    public Int32? getcomplianceContactId() {;
        return this.complianceContactId;;
    }

    /**
     * Setter for complianceContactId;
     * The id of the compliance contact
     */
    public void setcomplianceContactId(Int32? value) {;
        this.complianceContactId = value;;
    }


    private String documentReference;

    /**
     * Getter for documentReference;
     * The document reference of the notice
     */
    public String getdocumentReference() {;
        return this.documentReference;;
    }

    /**
     * Setter for documentReference;
     * The document reference of the notice
     */
    public void setdocumentReference(String value) {;
        this.documentReference = value;;
    }


    private String jurisdictionName;

    /**
     * Getter for jurisdictionName;
     * The jurisdiction name of the notice
     */
    public String getjurisdictionName() {;
        return this.jurisdictionName;;
    }

    /**
     * Setter for jurisdictionName;
     * The jurisdiction name of the notice
     */
    public void setjurisdictionName(String value) {;
        this.jurisdictionName = value;;
    }


    private String jurisdictionType;

    /**
     * Getter for jurisdictionType;
     * The jurisdiction type of the notice
     */
    public String getjurisdictionType() {;
        return this.jurisdictionType;;
    }

    /**
     * Setter for jurisdictionType;
     * The jurisdiction type of the notice
     */
    public void setjurisdictionType(String value) {;
        this.jurisdictionType = value;;
    }


    private List<NoticeCommentModel> comments;

    /**
     * Getter for comments;
     * Additional comments on the notice
     */
    public List<NoticeCommentModel> getcomments() {;
        return this.comments;;
    }

    /**
     * Setter for comments;
     * Additional comments on the notice
     */
    public void setcomments(List<NoticeCommentModel> value) {;
        this.comments = value;;
    }


    private List<NoticeFinanceModel> finances;

    /**
     * Getter for finances;
     * Finance details of the notice
     */
    public List<NoticeFinanceModel> getfinances() {;
        return this.finances;;
    }

    /**
     * Setter for finances;
     * Finance details of the notice
     */
    public void setfinances(List<NoticeFinanceModel> value) {;
        this.finances = value;;
    }


    private List<NoticeResponsibilityDetailModel> responsibility;

    /**
     * Getter for responsibility;
     * Notice Responsibility Details
     */
    public List<NoticeResponsibilityDetailModel> getresponsibility() {;
        return this.responsibility;;
    }

    /**
     * Setter for responsibility;
     * Notice Responsibility Details
     */
    public void setresponsibility(List<NoticeResponsibilityDetailModel> value) {;
        this.responsibility = value;;
    }


    private List<NoticeRootCauseDetailModel> rootCause;

    /**
     * Getter for rootCause;
     * Notice Root Cause Details
     */
    public List<NoticeRootCauseDetailModel> getrootCause() {;
        return this.rootCause;;
    }

    /**
     * Setter for rootCause;
     * Notice Root Cause Details
     */
    public void setrootCause(List<NoticeRootCauseDetailModel> value) {;
        this.rootCause = value;;
    }


    private DateTime? createdDate;

    /**
     * Getter for createdDate;
     * The date when this record was created.
     */
    public DateTime? getcreatedDate() {;
        return this.createdDate;;
    }

    /**
     * Setter for createdDate;
     * The date when this record was created.
     */
    public void setcreatedDate(DateTime? value) {;
        this.createdDate = value;;
    }


    private Int32? createdUserId;

    /**
     * Getter for createdUserId;
     * The User ID of the user who created this record.
     */
    public Int32? getcreatedUserId() {;
        return this.createdUserId;;
    }

    /**
     * Setter for createdUserId;
     * The User ID of the user who created this record.
     */
    public void setcreatedUserId(Int32? value) {;
        this.createdUserId = value;;
    }


    private DateTime? modifiedDate;

    /**
     * Getter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public DateTime? getmodifiedDate() {;
        return this.modifiedDate;;
    }

    /**
     * Setter for modifiedDate;
     * The date/time when this record was last modified.
     */
    public void setmodifiedDate(DateTime? value) {;
        this.modifiedDate = value;;
    }


    private Int32? modifiedUserId;

    /**
     * Getter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public Int32? getmodifiedUserId() {;
        return this.modifiedUserId;;
    }

    /**
     * Setter for modifiedUserId;
     * The user ID of the user who last modified this record.
     */
    public void setmodifiedUserId(Int32? value) {;
        this.modifiedUserId = value;;
    }


    /**
     * Returns a JSON string representation of NoticeModel
     */
    @Override
    public String toString() {
        return JsonSerializer.SerializeObject(this);
    }
}
