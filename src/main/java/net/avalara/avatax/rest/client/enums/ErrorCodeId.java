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
    CannotChangeCompanyCode,

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
    DeleteInformation,

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
    TechSupportAuditRequired,

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
    FailedToUploadReport,

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
     * 
     */
    RequestedFileNotExist,

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
    InvalidParameter,

    /** 
     * 
     */
    InvalidParameterValue,

    /** 
     * 
     */
    CompanyCodeConflict,

    /** 
     * 
     */
    DocumentFetchLimit,

    /** 
     * 
     */
    AddressIncomplete,

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
    MultiDocumentTypesError,

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
    InvalidAddress,

    /** 
     * 
     */
    InvalidPostalCode,

    /** 
     * Represents a malformed document fetch command
     */
    BadDocumentFetch,

    /** 
     * 
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
     * Location error codes
     */
    QuestionNotNeededForThisAddress,

    /** 
     * 
     */
    QuestionNotValidForThisAddress,

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
    CertCaptureFieldValidationError,

    /** 
     * 
     */
    CertCaptureError,

    /** 
     * 
     */
    MissingRequiredFields,

    /** 
     * 
     */
    CertCaptureNotConfiguredError,

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
    InvalidCertCaptureOperation,

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
     * BizTech API error codes
     */
    BizTechCustomerAccountFailure,

    /** 
     * 
     */
    BizTechOpportunityCreationFailure,

    /** 
     * Account Activate error codes
     */
    AccountInNewStatusException,

    /** 
     * Worksheet Exception
     */
    WorksheetException,

}
    