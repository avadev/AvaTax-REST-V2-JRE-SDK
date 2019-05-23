package net.avalara.avatax.rest.client.enums;
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
 * Represents a error code message
 */
public enum ErrorCodeId {
    /** 
     * Server has a configuration or setup problem
     */
    ServerConfiguration(1),

    /** 
     * User doesn't have rights to this account or company
     */
    AccountInvalidException(2),

    /** 
     * 
     */
    CompanyInvalidException(3),

    /** 
     * Use this error message when the user is trying to fetch a single object and the object either does not exist or cannot be seen by the current user.
     */
    EntityNotFoundError(4),

    /** 
     * 
     */
    ValueRequiredError(5),

    /** 
     * 
     */
    RangeError(6),

    /** 
     * 
     */
    RangeCompareError(7),

    /** 
     * 
     */
    RangeSetError(8),

    /** 
     * 
     */
    TaxpayerNumberRequired(9),

    /** 
     * 
     */
    EntityLimitExceeded(10),

    /** 
     * 
     */
    CommonPassword(11),

    /** 
     * 
     */
    WeakPassword(12),

    /** 
     * 
     */
    StringLengthError(13),

    /** 
     * 
     */
    MaxStringLengthError(14),

    /** 
     * 
     */
    EmailValidationError(15),

    /** 
     * 
     */
    EmailMissingError(16),

    /** 
     * 
     */
    InvalidQueryField(17),

    /** 
     * 
     */
    InvalidQueryValue(18),

    /** 
     * 
     */
    SyntaxError(19),

    /** 
     * 
     */
    TooManyParametersError(20),

    /** 
     * 
     */
    UnterminatedValueError(21),

    /** 
     * 
     */
    DeleteUserSelfError(22),

    /** 
     * 
     */
    OldPasswordInvalid(23),

    /** 
     * 
     */
    CannotChangePassword(24),

    /** 
     * 
     */
    ReadOnly(25),

    /** 
     * 
     */
    DateFormatError(26),

    /** 
     * 
     */
    NoDefaultCompany(27),

    /** 
     * 
     */
    AccountTypeNotSupported(28),

    /** 
     * 
     */
    InvalidFirmClientOffer(29),

    /** 
     * 
     */
    AuthenticationException(30),

    /** 
     * 
     */
    AuthorizationException(31),

    /** 
     * 
     */
    ValidationException(32),

    /** 
     * 
     */
    InactiveUserError(33),

    /** 
     * 
     */
    AuthenticationIncomplete(34),

    /** 
     * 
     */
    BasicAuthIncorrect(35),

    /** 
     * 
     */
    IdentityServerError(36),

    /** 
     * 
     */
    BearerTokenInvalid(37),

    /** 
     * 
     */
    ModelRequiredException(38),

    /** 
     * 
     */
    AccountExpiredException(39),

    /** 
     * 
     */
    BearerTokenNotSupported(41),

    /** 
     * 
     */
    InvalidSecurityRole(42),

    /** 
     * 
     */
    InvalidRegistrarAction(43),

    /** 
     * 
     */
    RemoteServerError(44),

    /** 
     * 
     */
    NoFilterCriteriaException(45),

    /** 
     * 
     */
    OpenClauseException(46),

    /** 
     * 
     */
    JsonFormatError(47),

    /** 
     * 
     */
    InvalidDecimalValue(48),

    /** 
     * 
     */
    PermissionRequired(49),

    /** 
     * 
     */
    UnhandledException(50),

    /** 
     * 
     */
    InactiveAccount(51),

    /** 
     * 
     */
    LinkageNotAllowed(52),

    /** 
     * 
     */
    LinkageStatusUpdateNotSupported(53),

    /** 
     * 
     */
    ReportingCompanyMustHaveContactsError(60),

    /** 
     * 
     */
    CompanyProfileNotSet(61),

    /** 
     * 
     */
    CannotAssignUserToCompany(62),

    /** 
     * 
     */
    MustAssignUserToCompany(63),

    /** 
     * 
     */
    InvalidTaxTypeMapping(64),

    /** 
     * 
     */
    ModelStateInvalid(70),

    /** 
     * 
     */
    DateRangeError(80),

    /** 
     * 
     */
    InvalidDateRangeError(81),

    /** 
     * 
     */
    RuleMustHaveTaxCode(82),

    /** 
     * 
     */
    RuleTypeRestricted(83),

    /** 
     * 
     */
    AllJurisRuleLimits(84),

    /** 
     * 
     */
    InvalidCompanyLocationSetting(85),

    /** 
     * 
     */
    InvalidAdjustmentType(99),

    /** 
     * 
     */
    DeleteInformation(100),

    /** 
     * 
     */
    OutOfRange(118),

    /** 
     * 
     */
    UnspecifiedTimeZone(119),

    /** 
     * 
     */
    CannotCreateDeletedObjects(120),

    /** 
     * 
     */
    CannotModifyDeletedObjects(121),

    /** 
     * 
     */
    ReturnNameNotFound(122),

    /** 
     * 
     */
    InvalidAddressTypeAndCategory(123),

    /** 
     * 
     */
    DefaultCompanyLocation(124),

    /** 
     * 
     */
    InvalidCountry(125),

    /** 
     * 
     */
    InvalidCountryRegion(126),

    /** 
     * 
     */
    BrazilValidationError(127),

    /** 
     * 
     */
    BrazilExemptValidationError(128),

    /** 
     * 
     */
    BrazilPisCofinsError(129),

    /** 
     * 
     */
    JurisdictionNotFoundError(130),

    /** 
     * 
     */
    MedicalExciseError(131),

    /** 
     * 
     */
    RateDependsTaxabilityError(132),

    /** 
     * 
     */
    RateDependsEuropeError(133),

    /** 
     * 
     */
    InvalidRateTypeCode(134),

    /** 
     * 
     */
    RateTypeNotSupported(135),

    /** 
     * 
     */
    CannotUpdateNestedObjects(136),

    /** 
     * 
     */
    UPCCodeInvalidChars(137),

    /** 
     * 
     */
    UPCCodeInvalidLength(138),

    /** 
     * 
     */
    IncorrectPathError(139),

    /** 
     * 
     */
    InvalidJurisdictionType(140),

    /** 
     * 
     */
    MustConfirmResetLicenseKey(141),

    /** 
     * 
     */
    DuplicateCompanyCode(142),

    /** 
     * 
     */
    TINFormatError(143),

    /** 
     * 
     */
    DuplicateNexusError(144),

    /** 
     * 
     */
    UnknownNexusError(145),

    /** 
     * 
     */
    ParentNexusNotFound(146),

    /** 
     * 
     */
    InvalidTaxCodeType(147),

    /** 
     * 
     */
    CannotActivateCompany(148),

    /** 
     * 
     */
    DuplicateEntityProperty(149),

    /** 
     * 
     */
    ReportingEntityError(150),

    /** 
     * 
     */
    InvalidReturnOperationError(151),

    /** 
     * 
     */
    CannotDeleteCompany(152),

    /** 
     * 
     */
    CountryOverridesNotAvailable(153),

    /** 
     * 
     */
    JurisdictionOverrideMismatch(154),

    /** 
     * 
     */
    DuplicateSystemTaxCode(155),

    /** 
     * 
     */
    SSTOverridesNotAvailable(156),

    /** 
     * 
     */
    NexusDateMismatch(157),

    /** 
     * 
     */
    NexusParentDateMismatch(159),

    /** 
     * 
     */
    BearerTokenParseUserIdError(160),

    /** 
     * 
     */
    RetrieveUserError(161),

    /** 
     * 
     */
    InvalidConfigurationSetting(162),

    /** 
     * 
     */
    InvalidConfigurationValue(163),

    /** 
     * 
     */
    InvalidEnumValue(164),

    /** 
     * 
     */
    TaxCodeAssociatedTaxRule(165),

    /** 
     * 
     */
    CannotSwitchAccountId(166),

    /** 
     * 
     */
    RequestIncomplete(167),

    /** 
     * 
     */
    AccountNotNew(168),

    /** 
     * 
     */
    PasswordLengthInvalid(169),

    /** 
     * 
     */
    LocalNexusConflict(170),

    /** 
     * 
     */
    InvalidEcmsOverrideCode(171),

    /** 
     * 
     */
    AccountDoesNotExist(172),

    /** 
     * 
     */
    InvalidTaxType(173),

    /** 
     * 
     */
    IncorrectFieldValue(174),

    /** 
     * 
     */
    LeadingOrTrailingException(175),

    /** 
     * 
     */
    NotEnoughAddressesInfo(176),

    /** 
     * 
     */
    ReportNotInitiated(177),

    /** 
     * 
     */
    FailedToBuildReport(178),

    /** 
     * 
     */
    ReportNotFinished(179),

    /** 
     * 
     */
    FailedToDownloadReport(181),

    /** 
     * 
     */
    MalformedFilterException(182),

    /** 
     * 
     */
    ExpectedConjunctionError(183),

    /** 
     * 
     */
    CriteriaNotSupportedError(184),

    /** 
     * 
     */
    CompanyAccountAndParentAccountMismatch(185),

    /** 
     * 
     */
    InvalidFileContentType(186),

    /** 
     * 
     */
    RequestTooLarge(187),

    /** 
     * 
     */
    EcmsDisabled(188),

    /** 
     * 
     */
    UnknownConjunctionError(189),

    /** 
     * 
     */
    NoLinesDiscounted(190),

    /** 
     * 
     */
    FailedToDelete(191),

    /** 
     * 
     */
    CircularCompanyHierarchies(192),

    /** 
     * 
     */
    DuplicateEntry(193),

    /** 
     * 
     */
    DuplicateFieldNameInOrderBy(194),

    /** 
     * 
     */
    CannotAdjustDocumentType(195),

    /** 
     * 
     */
    UserNoAccess(196),

    /** 
     * 
     */
    InvalidEntry(197),

    /** 
     * 
     */
    TransactionAlreadyCancelled(198),

    /** 
     * 
     */
    QueryParameterOutOfRange(199),

    /** 
     * Batch errors
     */
    BatchSalesAuditMustBeZippedError(200),

    /** 
     * 
     */
    BatchZipMustContainOneFileError(201),

    /** 
     * 
     */
    BatchInvalidFileTypeError(202),

    /** 
     * 
     */
    BatchCannotSaveBatchFile(203),

    /** 
     * 
     */
    BatchCannotGetBatchFile(204),

    /** 
     * 
     */
    BatchCannotDeleteBatchFile(205),

    /** 
     * 
     */
    BatchMustContainOneFile(206),

    /** 
     * 
     */
    MissingBatchFileContent(207),

    /** 
     * Point Of Sale API exceptions
     */
    PointOfSaleFileSize(250),

    /** 
     * 
     */
    PointOfSaleSetup(251),

    /** 
     * 
     */
    InvalidInputDate(252),

    /** 
     * Errors in Soap V1 Passthrough / GetTax calls
     */
    GetTaxError(300),

    /** 
     * 
     */
    AddressConflictException(301),

    /** 
     * 
     */
    DocumentCodeConflict(303),

    /** 
     * 
     */
    MissingAddress(304),

    /** 
     * 
     */
    InvalidParameterValue(306),

    /** 
     * 
     */
    DocumentFetchLimit(308),

    /** 
     * 
     */
    InvalidAddress(309),

    /** 
     * 
     */
    AddressLocationNotFound(310),

    /** 
     * 
     */
    MissingLine(311),

    /** 
     * 
     */
    InvalidAddressTextCase(312),

    /** 
     * 
     */
    DocumentNotCommitted(313),

    /** 
     * 
     */
    InvalidDocumentTypesToFetch(315),

    /** 
     * 
     */
    TimeoutRequested(316),

    /** 
     * 
     */
    InvalidPostalCode(317),

    /** 
     * Subscription error codes
     */
    InvalidSubscriptionDescription(318),

    /** 
     * 
     */
    InvalidSubscriptionTypeId(319),

    /** 
     * Represents a malformed document fetch command
     */
    CannotChangeFilingStatus(401),

    /** 
     * Represents a SQL server timeout error / deadlock error
     */
    ServerUnreachable(500),

    /** 
     * Partner API error codes
     */
    SubscriptionRequired(600),

    /** 
     * 
     */
    AccountExists(601),

    /** 
     * 
     */
    InvitationOnly(602),

    /** 
     * 
     */
    FreeTrialNotAvailable(606),

    /** 
     * 
     */
    AccountExistsDifferentEmail(607),

    /** 
     * 
     */
    AvalaraIdentityApiError(608),

    /** 
     * 
     */
    InvalidIPAddress(609),

    /** 
     * 
     */
    OfferCodeAlreadyApplied(610),

    /** 
     * 
     */
    AccountAlreadyExists(611),

    /** 
     * Refund API error codes
     */
    RefundTypeAndPercentageMismatch(701),

    /** 
     * 
     */
    InvalidDocumentTypeForRefund(702),

    /** 
     * 
     */
    RefundTypeAndLineMismatch(703),

    /** 
     * 
     */
    RefundLinesRequired(704),

    /** 
     * 
     */
    InvalidRefundType(705),

    /** 
     * 
     */
    RefundPercentageForTaxOnly(706),

    /** 
     * 
     */
    LineNoOutOfRange(707),

    /** 
     * 
     */
    RefundPercentageOutOfRange(708),

    /** 
     * 
     */
    RefundPercentageMissing(709),

    /** 
     * Free API error codes
     */
    MustUseCreateTransaction(800),

    /** 
     * 
     */
    MustAcceptTermsAndConditions(801),

    /** 
     * Filing Calendar Error Codes
     */
    FilingCalendarCannotBeDeleted(900),

    /** 
     * 
     */
    InvalidEffectiveDate(901),

    /** 
     * 
     */
    NonOutletForm(902),

    /** 
     * 
     */
    OverlappingFilingCalendar(903),

    /** 
     * 
     */
    FilingCalendarCannotBeEdited(904),

    /** 
     * Create or update transaction error codes
     */
    CannotModifyLockedTransaction(1100),

    /** 
     * 
     */
    LineAlreadyExists(1101),

    /** 
     * 
     */
    LineDoesNotExist(1102),

    /** 
     * 
     */
    LinesNotSpecified(1103),

    /** 
     * 
     */
    LineDetailsDoesNotExist(1104),

    /** 
     * 
     */
    CannotCreateTransactionWithDeletedDataSource(1105),

    /** 
     * Exempt cert error codes
     */
    InvalidBusinessType(1200),

    /** 
     * 
     */
    CannotModifyExemptCert(1201),

    /** 
     * 
     */
    CertificatesError(1203),

    /** 
     * 
     */
    MissingRequiredFields(1204),

    /** 
     * 
     */
    CertificatesNotSetup(1205),

    /** 
     * 
     */
    AddRelationshipsError(1206),

    /** 
     * 
     */
    ConflictingExposureZone(1208),

    /** 
     * 
     */
    MissingFieldToCreateExposureZone(1209),

    /** 
     * 
     */
    MissingExemptReason(1210),

    /** 
     * 
     */
    InvalidExemptReason(1211),

    /** 
     * 
     */
    InvalidExemptionOperation(1212),

    /** 
     * 
     */
    ConflictingFields(1213),

    /** 
     * 
     */
    InvalidPdfOrImageFile(1214),

    /** 
     * 
     */
    InvalidCoverLetterTitle(1215),

    /** 
     * 
     */
    AccountNotProvisioned(1216),

    /** 
     * 
     */
    InvalidRequestContentType(1217),

    /** 
     * 
     */
    ExemptionPaginationLimits(1218),

    /** 
     * 
     */
    ExemptionSortLimits(1219),

    /** 
     * 
     */
    CustomerCantBeBothShipToAndBillTo(1220),

    /** 
     * 
     */
    BillToCustomerExpected(1221),

    /** 
     * 
     */
    ShipToCustomerExpected(1222),

    /** 
     * 
     */
    EcmsSstCertsRequired(1223),

    /** 
     * Multi document error codes
     */
    TransactionNotCancelled(1300),

    /** 
     * 
     */
    TooManyTransactions(1301),

    /** 
     * 
     */
    OnlyTaxDateOverrideIsAllowed(1302),

    /** 
     * 
     */
    TransactionAlreadyExists(1303),

    /** 
     * 
     */
    DateMismatch(1305),

    /** 
     * 
     */
    InvalidDocumentStatusForVerify(1306),

    /** 
     * 
     */
    TotalAmountMismatch(1307),

    /** 
     * 
     */
    TotalTaxMismatch(1308),

    /** 
     * 
     */
    InvalidDocumentType(1310),

    /** 
     * 
     */
    MultiDocumentPartiallyLocked(1312),

    /** 
     * 
     */
    TransactionIsCommitted(1313),

    /** 
     * 
     */
    InvalidDocumentStatus(1314),

    /** 
     * Communications Tax error codes
     */
    CommsConfigClientIdMissing(1400),

    /** 
     * 
     */
    CommsConfigClientIdBadValue(1401),

    /** 
     * Account Activate error codes
     */
    AccountInNewStatusException(1404),

    /** 
     * Worksheet Exception
     */
    WorksheetException(1405),

    /** 
     * 
     */
    InvalidAccountOverride(1406),

    /** 
     * 
     */
    AccountOverrideNotAuthorized(1407),

    /** 
     * 
     */
    FieldNotQueryableError(1408),

    /** 
     * 
     */
    UsernameRequired(1409),

    /** 
     * 
     */
    InvalidAuditMessage(1410),

    /** 
     * 
     */
    FieldNotOrderableError(1411),

    /** 
     * Nexus validation error codes
     */
    CannotDeleteParentBeforeChildNexus(1500),

    /** 
     * 
     */
    NexusChildDateMismatch(1501),

    /** 
     * Remote validation Error
     */
    RemoteValidationError(1502),

    /** 
     * Advanced rule errors
     */
    AdvancedRuleRequestRuleError(1602),

    /** 
     * 
     */
    AdvancedRuleResponseRuleError(1603),

    /** 
     * 
     */
    AdvancedRuleError(1605),

    /** 
     * Miscellaneous
     */
    TaxRuleRequiresNexus(1701),

    /** 
     * 
     */
    UPCCodeNotUnique(1702),

    /** 
     * 
     */
    TaxCodeAssociatedWithItemCodeNotFound(1704),

    /** 
     * 
     */
    DuplicateSystemForItem(1705),

    /** 
     * 
     */
    CannotDismissGlobalNotification(1706),

    /** 
     * 
     */
    GenericTaxCodeForItem(1707),

    /** 
     * 
     */
    CannotCertifyCompany(1708),

    /** 
     * 
     */
    NoVoidedDocuments(1709),

    /** 
     * 
     */
    InadequateCommittedDocuments(1710),

    /** 
     * 
     */
    DocumentCodeIsGuid(1711),

    /** 
     * 
     */
    CustomerVendorCodeIsGuid(1712),

    /** 
     * 
     */
    CannotUpdateAccountTypeId(1713),

    /** 
     * 
     */
    InadequateDocumentLineCount(1714),

    /** 
     * SendSales API errors
     */
    UnsupportedFileFormat(1800),

    /** 
     * 
     */
    UnsupportedOutputFileType(1801),

    /** 
     * TaxProfile API errors
     */
    TaxProfileNotProvided(1900),

    /** 
     * 
     */
    InvalidTaxProfile(1901),

    /** 
     * 
     */
    CompanyTaxProfileEntryRequired(1902),

    /** 
     * 
     */
    ErrorReadingTaxProfileEntry(1903),

    /** 
     * AuditAccount API errors
     */
    TraceDataNotAvailable(2000),

    /** 
     * Item parameter errors
     */
    InvalidParameterUnitMeasurementType(2100),

    /** 
     * 
     */
    ParameterUnitRequired(2101),

    /** 
     * 
     */
    InvalidParameterValueDataType(2102),

    /** 
     * 
     */
    InvalidParameterAttributeType(2103),

    /** 
     * 
     */
    SubscriptionRequiredForParameter(2104),

    /** 
     * Accounting Firm errors
     */
    InvalidAccountType(2105),

    /** 
     * 
     */
    NoExemptionNoOrCustomerUsageType(2208);

    private int value;
	private static HashMap map = new HashMap<>();
	
	private ErrorCodeId(int value) {
		this.value = value;
	}
	
	static {
		for (ErrorCodeId enumName : ErrorCodeId.values()) {
			map.put(enumName.value, enumName);
		}
	}
	
	public static ErrorCodeId valueOf(int intValue) {
		return (ErrorCodeId) map.get(intValue);
	}
	
	public int getValue() {
		return value;
	}
}
