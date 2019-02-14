package net.avalara.avatax.rest.client.enums;

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
 * Represents a error code message
 */
public enum ErrorCodeId {
    /** 
     * Server has a configuration or setup problem
     */
    ServerConfiguration,

    /** 
     * User doesn't have rights to this account or company
     */
    AccountInvalidException,

    /** 
     * 
     */
    CompanyInvalidException,

    /** 
     * Use this error message when the user is trying to fetch a single object and the object either does not exist or cannot be seen by the current user.
     */
    EntityNotFoundError,

    /** 
     * 
     */
    ValueRequiredError,

    /** 
     * 
     */
    RangeError,

    /** 
     * 
     */
    RangeCompareError,

    /** 
     * 
     */
    RangeSetError,

    /** 
     * 
     */
    TaxpayerNumberRequired,

    /** 
     * 
     */
    EntityLimitExceeded,

    /** 
     * 
     */
    CommonPassword,

    /** 
     * 
     */
    WeakPassword,

    /** 
     * 
     */
    StringLengthError,

    /** 
     * 
     */
    MaxStringLengthError,

    /** 
     * 
     */
    EmailValidationError,

    /** 
     * 
     */
    EmailMissingError,

    /** 
     * 
     */
    ParserFieldNameError,

    /** 
     * 
     */
    ParserFieldValueError,

    /** 
     * 
     */
    ParserSyntaxError,

    /** 
     * 
     */
    ParserTooManyParametersError,

    /** 
     * 
     */
    ParserUnterminatedValueError,

    /** 
     * 
     */
    DeleteUserSelfError,

    /** 
     * 
     */
    OldPasswordInvalid,

    /** 
     * 
     */
    CannotChangePassword,

    /** 
     * 
     */
    DateFormatError,

    /** 
     * 
     */
    NoDefaultCompany,

    /** 
     * 
     */
    AuthenticationException,

    /** 
     * 
     */
    AuthorizationException,

    /** 
     * 
     */
    ValidationException,

    /** 
     * 
     */
    InactiveUserError,

    /** 
     * 
     */
    AuthenticationIncomplete,

    /** 
     * 
     */
    BasicAuthIncorrect,

    /** 
     * 
     */
    IdentityServerError,

    /** 
     * 
     */
    BearerTokenInvalid,

    /** 
     * 
     */
    ModelRequiredException,

    /** 
     * 
     */
    AccountExpiredException,

    /** 
     * 
     */
    VisibilityError,

    /** 
     * 
     */
    BearerTokenNotSupported,

    /** 
     * 
     */
    InvalidSecurityRole,

    /** 
     * 
     */
    InvalidRegistrarAction,

    /** 
     * 
     */
    RemoteServerError,

    /** 
     * 
     */
    NoFilterCriteriaException,

    /** 
     * 
     */
    OpenClauseException,

    /** 
     * 
     */
    JsonFormatError,

    /** 
     * 
     */
    InvalidDecimalValue,

    /** 
     * 
     */
    UnhandledException,

    /** 
     * 
     */
    ReportingCompanyMustHaveContactsError,

    /** 
     * 
     */
    CompanyProfileNotSet,

    /** 
     * 
     */
    CannotAssignUserToCompany,

    /** 
     * 
     */
    MustAssignUserToCompany,

    /** 
     * 
     */
    ModelStateInvalid,

    /** 
     * 
     */
    DateRangeError,

    /** 
     * 
     */
    InvalidDateRangeError,

    /** 
     * 
     */
    RuleMustHaveTaxCode,

    /** 
     * 
     */
    RuleTypeRestricted,

    /** 
     * 
     */
    AllJurisRuleLimits,

    /** 
     * 
     */
    InvalidCompanyLocationSetting,

    /** 
     * 
     */
    InvalidAdjustmentType,

    /** 
     * 
     */
    DeleteInformation,

    /** 
     * 
     */
    OutOfRange,

    /** 
     * 
     */
    UnspecifiedTimeZone,

    /** 
     * 
     */
    CannotCreateDeletedObjects,

    /** 
     * 
     */
    CannotModifyDeletedObjects,

    /** 
     * 
     */
    ReturnNameNotFound,

    /** 
     * 
     */
    InvalidAddressTypeAndCategory,

    /** 
     * 
     */
    DefaultCompanyLocation,

    /** 
     * 
     */
    InvalidCountry,

    /** 
     * 
     */
    InvalidCountryRegion,

    /** 
     * 
     */
    BrazilValidationError,

    /** 
     * 
     */
    BrazilExemptValidationError,

    /** 
     * 
     */
    BrazilPisCofinsError,

    /** 
     * 
     */
    JurisdictionNotFoundError,

    /** 
     * 
     */
    MedicalExciseError,

    /** 
     * 
     */
    RateDependsTaxabilityError,

    /** 
     * 
     */
    RateDependsEuropeError,

    /** 
     * 
     */
    InvalidRateTypeCode,

    /** 
     * 
     */
    RateTypeNotSupported,

    /** 
     * 
     */
    CannotUpdateNestedObjects,

    /** 
     * 
     */
    UPCCodeInvalidChars,

    /** 
     * 
     */
    UPCCodeInvalidLength,

    /** 
     * 
     */
    IncorrectPathError,

    /** 
     * 
     */
    InvalidJurisdictionType,

    /** 
     * 
     */
    MustConfirmResetLicenseKey,

    /** 
     * 
     */
    DuplicateCompanyCode,

    /** 
     * 
     */
    TINFormatError,

    /** 
     * 
     */
    DuplicateNexusError,

    /** 
     * 
     */
    UnknownNexusError,

    /** 
     * 
     */
    ParentNexusNotFound,

    /** 
     * 
     */
    InvalidTaxCodeType,

    /** 
     * 
     */
    CannotActivateCompany,

    /** 
     * 
     */
    DuplicateEntityProperty,

    /** 
     * 
     */
    ReportingEntityError,

    /** 
     * 
     */
    InvalidReturnOperationError,

    /** 
     * 
     */
    CannotDeleteCompany,

    /** 
     * 
     */
    CountryOverridesNotAvailable,

    /** 
     * 
     */
    JurisdictionOverrideMismatch,

    /** 
     * 
     */
    DuplicateSystemTaxCode,

    /** 
     * 
     */
    SSTOverridesNotAvailable,

    /** 
     * 
     */
    NexusDateMismatch,

    /** 
     * 
     */
    NexusParentDateMismatch,

    /** 
     * 
     */
    BearerTokenParseUserIdError,

    /** 
     * 
     */
    RetrieveUserError,

    /** 
     * 
     */
    InvalidConfigurationSetting,

    /** 
     * 
     */
    InvalidConfigurationValue,

    /** 
     * 
     */
    InvalidEnumValue,

    /** 
     * 
     */
    TaxCodeAssociatedTaxRule,

    /** 
     * 
     */
    CannotSwitchAccountId,

    /** 
     * 
     */
    RequestIncomplete,

    /** 
     * 
     */
    AccountNotNew,

    /** 
     * 
     */
    PasswordLengthInvalid,

    /** 
     * 
     */
    LocalNexusConflict,

    /** 
     * 
     */
    InvalidEcmsOverrideCode,

    /** 
     * 
     */
    AccountDoesNotExist,

    /** 
     * 
     */
    InvalidTaxType,

    /** 
     * 
     */
    IncorrectFieldValue,

    /** 
     * 
     */
    LeadingOrTrailingException,

    /** 
     * 
     */
    NotEnoughAddressesInfo,

    /** 
     * 
     */
    ReportNotInitiated,

    /** 
     * 
     */
    FailedToBuildReport,

    /** 
     * 
     */
    ReportNotFinished,

    /** 
     * 
     */
    FailedToDownloadReport,

    /** 
     * 
     */
    MalformedFilterException,

    /** 
     * 
     */
    ExpectedConjunctionError,

    /** 
     * 
     */
    CriteriaNotSupportedError,

    /** 
     * 
     */
    CompanyAccountAndParentAccountMismatch,

    /** 
     * 
     */
    InvalidFileContentType,

    /** 
     * 
     */
    RequestTooLarge,

    /** 
     * 
     */
    EcmsDisabled,

    /** 
     * 
     */
    UnknownConjunctionError,

    /** 
     * 
     */
    NoLinesDiscounted,

    /** 
     * 
     */
    FailedToDelete,

    /** 
     * 
     */
    CircularCompanyHierarchies,

    /** 
     * 
     */
    DuplicateEntry,

    /** 
     * 
     */
    DuplicateFieldNameInOrderBy,

    /** 
     * 
     */
    CannotAdjustDocumentType,

    /** 
     * 
     */
    UserNoAccess,

    /** 
     * 
     */
    InvalidEntry,

    /** 
     * 
     */
    TransactionAlreadyCancelled,

    /** 
     * 
     */
    QueryParameterOutOfRange,

    /** 
     * Batch errors
     */
    BatchSalesAuditMustBeZippedError,

    /** 
     * 
     */
    BatchZipMustContainOneFileError,

    /** 
     * 
     */
    BatchInvalidFileTypeError,

    /** 
     * 
     */
    BatchCannotSaveBatchFile,

    /** 
     * 
     */
    BatchCannotGetBatchFile,

    /** 
     * 
     */
    BatchCannotDeleteBatchFile,

    /** 
     * 
     */
    BatchMustContainOneFile,

    /** 
     * 
     */
    MissingBatchFileContent,

    /** 
     * Point Of Sale API exceptions
     */
    PointOfSaleFileSize,

    /** 
     * 
     */
    PointOfSaleSetup,

    /** 
     * 
     */
    InvalidInputDate,

    /** 
     * Errors in Soap V1 Passthrough / GetTax calls
     */
    GetTaxError,

    /** 
     * 
     */
    AddressConflictException,

    /** 
     * 
     */
    DocumentCodeConflict,

    /** 
     * 
     */
    MissingAddress,

    /** 
     * 
     */
    InvalidParameterValue,

    /** 
     * 
     */
    DocumentFetchLimit,

    /** 
     * 
     */
    InvalidAddress,

    /** 
     * 
     */
    AddressLocationNotFound,

    /** 
     * 
     */
    MissingLine,

    /** 
     * 
     */
    InvalidAddressTextCase,

    /** 
     * 
     */
    DocumentNotCommitted,

    /** 
     * 
     */
    InvalidDocumentTypesToFetch,

    /** 
     * 
     */
    TimeoutRequested,

    /** 
     * 
     */
    InvalidPostalCode,

    /** 
     * Subscription error codes
     */
    InvalidSubscriptionDescription,

    /** 
     * 
     */
    InvalidSubscriptionTypeId,

    /** 
     * Represents a malformed document fetch command
     */
    CannotChangeFilingStatus,

    /** 
     * Represents a SQL server timeout error / deadlock error
     */
    ServerUnreachable,

    /** 
     * Partner API error codes
     */
    SubscriptionRequired,

    /** 
     * 
     */
    AccountExists,

    /** 
     * 
     */
    InvitationOnly,

    /** 
     * 
     */
    FreeTrialNotAvailable,

    /** 
     * 
     */
    AccountExistsDifferentEmail,

    /** 
     * 
     */
    AvalaraIdentityApiError,

    /** 
     * 
     */
    InvalidIPAddress,

    /** 
     * 
     */
    OfferCodeAlreadyApplied,

    /** 
     * Refund API error codes
     */
    InvalidDocumentStatusForRefund,

    /** 
     * 
     */
    RefundTypeAndPercentageMismatch,

    /** 
     * 
     */
    InvalidDocumentTypeForRefund,

    /** 
     * 
     */
    RefundTypeAndLineMismatch,

    /** 
     * 
     */
    RefundLinesRequired,

    /** 
     * 
     */
    InvalidRefundType,

    /** 
     * 
     */
    RefundPercentageForTaxOnly,

    /** 
     * 
     */
    LineNoOutOfRange,

    /** 
     * 
     */
    RefundPercentageOutOfRange,

    /** 
     * 
     */
    RefundPercentageMissing,

    /** 
     * Free API error codes
     */
    MustUseCreateTransaction,

    /** 
     * 
     */
    MustAcceptTermsAndConditions,

    /** 
     * Filing Calendar Error Codes
     */
    FilingCalendarCannotBeDeleted,

    /** 
     * 
     */
    InvalidEffectiveDate,

    /** 
     * 
     */
    NonOutletForm,

    /** 
     * 
     */
    OverlappingFilingCalendar,

    /** 
     * Create or update transaction error codes
     */
    CannotModifyLockedTransaction,

    /** 
     * 
     */
    LineAlreadyExists,

    /** 
     * 
     */
    LineDoesNotExist,

    /** 
     * 
     */
    LinesNotSpecified,

    /** 
     * 
     */
    LineDetailsDoesNotExist,

    /** 
     * 
     */
    CannotCreateTransactionWithDeletedDataSource,

    /** 
     * Exempt cert error codes
     */
    InvalidBusinessType,

    /** 
     * 
     */
    CannotModifyExemptCert,

    /** 
     * 
     */
    CertificatesError,

    /** 
     * 
     */
    MissingRequiredFields,

    /** 
     * 
     */
    CertificatesNotSetup,

    /** 
     * 
     */
    AddRelationshipsError,

    /** 
     * 
     */
    MissingExposureZone,

    /** 
     * 
     */
    ConflictingExposureZone,

    /** 
     * 
     */
    MissingFieldToCreateExposureZone,

    /** 
     * 
     */
    MissingExemptReason,

    /** 
     * 
     */
    InvalidExemptReason,

    /** 
     * 
     */
    InvalidExemptionOperation,

    /** 
     * 
     */
    ConflictingFields,

    /** 
     * 
     */
    InvalidPdfOrImageFile,

    /** 
     * 
     */
    InvalidCoverLetterTitle,

    /** 
     * 
     */
    AccountNotProvisioned,

    /** 
     * 
     */
    InvalidRequestContentType,

    /** 
     * 
     */
    ExemptionPaginationLimits,

    /** 
     * 
     */
    ExemptionSortLimits,

    /** 
     * 
     */
    CustomerCantBeBothShipToAndBillTo,

    /** 
     * 
     */
    BillToCustomerExpected,

    /** 
     * 
     */
    ShipToCustomerExpected,

    /** 
     * Multi document error codes
     */
    TransactionNotCancelled,

    /** 
     * 
     */
    TooManyTransactions,

    /** 
     * 
     */
    OnlyTaxDateOverrideIsAllowed,

    /** 
     * 
     */
    TransactionAlreadyExists,

    /** 
     * 
     */
    DateMismatch,

    /** 
     * 
     */
    InvalidDocumentStatusForVerify,

    /** 
     * 
     */
    TotalAmountMismatch,

    /** 
     * 
     */
    TotalTaxMismatch,

    /** 
     * 
     */
    InvalidDocumentStatusForCommit,

    /** 
     * 
     */
    InvalidDocumentType,

    /** 
     * 
     */
    MultiDocumentPartiallyLocked,

    /** 
     * 
     */
    TransactionIsCommitted,

    /** 
     * Communications Tax error codes
     */
    CommsConfigClientIdMissing,

    /** 
     * 
     */
    CommsConfigClientIdBadValue,

    /** 
     * Account Activate error codes
     */
    AccountInNewStatusException,

    /** 
     * Worksheet Exception
     */
    WorksheetException,

    /** 
     * 
     */
    InvalidAccountOverride,

    /** 
     * 
     */
    AccountOverrideNotAuthorized,

    /** 
     * 
     */
    ParserFieldNotQueryableError,

    /** 
     * 
     */
    UsernameRequired,

    /** 
     * 
     */
    InvalidAuditMessage,

    /** 
     * Nexus validation error codes
     */
    CannotDeleteParentBeforeChildNexus,

    /** 
     * 
     */
    NexusChildDateMismatch,

    /** 
     * Remote validation Error
     */
    RemoteValidationError,

    /** 
     * Advanced rule errors
     */
    AdvancedRuleBadScript,

    /** 
     * 
     */
    AdvancedRuleBadCsvTable,

    /** 
     * 
     */
    AdvancedRuleRequestRuleError,

    /** 
     * 
     */
    AdvancedRuleResponseRuleError,

    /** 
     * 
     */
    AdvancedRuleNotApproved,

    /** 
     * Miscellaneous
     */
    InvalidDocumentStatusToAddOrDeleteLines,

    /** 
     * 
     */
    TaxRuleRequiresNexus,

    /** 
     * 
     */
    UPCCodeNotUnique,

    /** 
     * 
     */
    CannotUpdateSourceOrInstance,

    /** 
     * 
     */
    TaxCodeAssociatedWithItemCodeNotFound,

    /** 
     * 
     */
    DuplicateSystemForItem,

    /** 
     * SendSales API errors
     */
    UnsupportedFileFormat,

    /** 
     * 
     */
    UnsupportedOutputFileType,

    /** 
     * TaxProfile API errors
     */
    TaxProfileNotProvided,

    /** 
     * 
     */
    InvalidTaxProfile,

    /** 
     * 
     */
    CompanyTaxProfileEntryRequired,

    /** 
     * 
     */
    ErrorReadingTaxProfileEntry,

    /** 
     * AuditAccount API errors
     */
    TraceDataNotAvailable,

    /** 
     * Item parameter errors
     */
    InvalidParameterUnitMeasurementType,

    /** 
     * 
     */
    ParameterUnitRequired,

    /** 
     * 
     */
    InvalidParameterValueDataType,

    /** 
     * 
     */
    InvalidParameterAttributeType,

    /** 
     * 
     */
    SubscriptionRequiredForParameter,

}
    