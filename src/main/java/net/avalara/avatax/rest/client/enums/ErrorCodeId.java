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
 * Swagger name: AvaTaxClient
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
    InvalidAuthenticationType(29),

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
    DisableAuthenticationForSamlBasedAccounts(101),

    /** 
     * 
     */
    DisableResetPasswordForSamlBasedAccounts(102),

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
    InvalidPageKey(170),

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
     *  New batch error codes continue at 2501
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
     * 
     */
    BatchCannotBeDeletedWhileProcessing(208),

    /** 
     * BizTech error
     */
    InternalServerError(209),

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
    FetchLimit(308),

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
    LineFetchLimitExceeded(314),

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
     * Represents a FEIN in incorrect format.
     */
    FEINFormatError(402),

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
    AccountNotWhitelisted(603),

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
     * 
     */
    LicenseKeyNameAlreadyExistsForAccount(612),

    /** 
     * 
     */
    UserAlreadyExists(613),

    /** 
     * 
     */
    UserNotFound(614),

    /** 
     * 
     */
    UserManagementException(615),

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
     * 
     */
    ShipToRegionRequiredWithDataSource(1106),

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
    MultiDocumentTransactionAlreadyExists(1304),

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
     * 
     */
    CannotModifySstNexus(1503),

    /** 
     * 
     */
    InvalidLocalNexusTypeId(1504),

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
    CannotUpdateAccountTypeId(1713),

    /** 
     * 
     */
    TaxpayerNumberIsRequired(1714),

    /** 
     * 
     */
    RequestLimitExceeded(1715),

    /** 
     * 
     */
    ConcurrentRequestLimitExceeded(1716),

    /** 
     * 
     */
    InvalidDocumentTypeForInspect(1717),

    /** 
     * 
     */
    ServiceNotReady(1718),

    /** 
     * 
     */
    UpdateLocationRemittanceMismatchTypeAndCategory(1719),

    /** 
     * 
     */
    UpdateLocationRemittanceCheckExistingEffectiveDateError(1720),

    /** 
     * 
     */
    UpdateLocationRemittanceCheckExistingEndDateError(1721),

    /** 
     * 
     */
    ErrorCountLimitExceededError(1722),

    /** 
     * 
     */
    RateLimitExceededError(1723),

    /** 
     * 
     */
    TaxCodeAndTaxCodeIdMissing(1724),

    /** 
     * 
     */
    NexusAlreadyExists(1725),

    /** 
     * 
     */
    InvalidAddressTypeAndMarketPlaceOusideUsaFlag(1726),

    /** 
     * 
     */
    InvalidSettingSet(1727),

    /** 
     * 
     */
    InvalidSettingName(1728),

    /** 
     * 
     */
    InvalidSettingValue(1729),

    /** 
     * 
     */
    TooManyUserDefinedFields(1730),

    /** 
     * 
     */
    DuplicateUserDefinedFieldsFound(1731),

    /** 
     * 
     */
    InvalidNameForUserDefinedField(1732),

    /** 
     * 
     */
    InvalidRestrictionType(1733),

    /** 
     * 
     */
    InvalidParameter(1734),

    /** 
     * 
     */
    InvalidSystemCode(1735),

    /** 
     * 
     */
    NoItemsForClassification(1736),

    /** 
     * 
     */
    InvalidFileName(1737),

    /** 
     * 
     */
    NoClassificationForSameHsCode(1738),

    /** 
     * 
     */
    InvalidValueError(1739),

    /** 
     * 
     */
    ItemDualWriteParameterValueMismatchError(1740),

    /** 
     * 
     */
    DuplicateItemIdsInTaxCodeClassificationRequest(1741),

    /** 
     * 
     */
    TooManyItemIdsInTaxCodeClassificationRequest(1742),

    /** 
     * 
     */
    InvalidProductCodeLength(1743),

    /** 
     * 
     */
    InvalidProductCodeFormat(1744),

    /** 
     * 
     */
    InvalidCountryAssignment(1745),

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
     * Item and Nexus parameter errors
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
    InvalidFirmSubscriptions(2106),

    /** 
     * Certify Company Errors
     */
    GenericTaxCodeForItem(2200),

    /** 
     * 
     */
    CannotCertifyCompany(2201),

    /** 
     * 
     */
    NoVoidedDocuments(2202),

    /** 
     * 
     */
    InadequateCommittedDocuments(2203),

    /** 
     * 
     */
    DocumentCodeIsGuid(2204),

    /** 
     * 
     */
    CustomerVendorCodeIsGuid(2205),

    /** 
     * 
     */
    InadequateDocumentLineCount(2206),

    /** 
     * 
     */
    SameDocumentDescription(2207),

    /** 
     * 
     */
    NoExemptionNoOrCustomerUsageType(2208),

    /** 
     * 
     */
    InadequateUniqueAddresses(2209),

    /** 
     * 
     */
    ItemCodesAreAllSame(2210),

    /** 
     * 
     */
    TaxCodesAreAllSame(2211),

    /** 
     * 
     */
    LocationCodeNotUsed(2212),

    /** 
     * 
     */
    RepeatedLinesInDocument(2213),

    /** 
     * 
     */
    TaxDateOverrideAndNegativeLineAmount(2214),

    /** 
     * 
     */
    AllUSDCurrencyCodes(2215),

    /** 
     * 
     */
    NoVATBuyerId(2216),

    /** 
     * 
     */
    AllUSCountryCodes(2217),

    /** 
     * 
     */
    NoDocumentsToTest(2218),

    /** 
     * 
     */
    NoShippingCharge(2219),

    /** 
     * Company Controller Related Errors
     */
    FailedToUpdateCompanyLocation(2314),

    /** 
     * 
     */
    CompanyLocationDateRangeOverlap(2315),

    /** 
     * Generic validation errors
     */
    FieldLengthError(2400),

    /** 
     * 
     */
    InputContainsBlacklistedCharacters(2401),

    /** 
     * 
     */
    CannotCreateNestedObjects(2402),

    /** 
     * 
     */
    InvalidUsername(2403),

    /** 
     * User's SubjectId not updated by DB query
     */
    UserSubjectIdNotUpdated(2500),

    /** 
     * Batch errors
     *  For other batch errors, see: 200 - 208 above
     */
    BatchTransactionTypeError(2501),

    /** 
     * 
     */
    BatchTransactionLineLimitExceeded(2502),

    /** 
     * 
     */
    BatchCompanyIdAndCompanyCodeMismatch(2503),

    /** 
     * 
     */
    BatchCannotBeCancelledStatusError(2504),

    /** 
     * 
     */
    BatchCannotBeCancelledFormatError(2505),

    /** 
     * 
     */
    BatchTypeNotSupported(2506),

    /** 
     * Parameter related errors
     */
    InvalidParameterDataType(2600),

    /** 
     * Tags related error
     */
    TagDoesNotExist(2620),

    /** 
     * Object deleted message
     */
    ObjectDeleted(2660),

    /** 
     * 
     */
    AssociatedObjectsDeleted(2661),

    /** 
     * Additional report related errors
     */
    CannotDownloadReport(2700),

    /** 
     * AVT-10699 - Multi-tax custom Tax Rules (Phase 1)
     */
    InvalidUnitOfBasis(2800),

    /** 
     * 
     */
    NotApplicableUnitOfBasis(2801),

    /** 
     * 
     */
    InvalidRateTypeTaxTypeMapping(2802),

    /** 
     * 
     */
    InvalidTaxTypeGroup(2803),

    /** 
     * 
     */
    InvalidTaxSubType(2804),

    /** 
     * 
     */
    InvalidProductTypeId(2805),

    /** 
     * 
     */
    InvalidTaxRuleType(2806),

    /** 
     * 
     */
    InvalidHsCode(2807),

    /** 
     * 
     */
    NotApplicableTaxType(2808),

    /** 
     * 
     */
    InvalidTaxTypeCode(2809),

    /** 
     * 
     */
    ContentAccessDenied(2810),

    /** 
     * 
     */
    ContentNotFound(2811),

    /** 
     * 
     */
    RegistrationNumberNotFound(2812),

    /** 
     * 
     */
    InvalidCostCenter(2813),

    /** 
     * Sync flow restricts one record for Item model
     */
    TooManyItemsInSyncFlowRequest(2814),

    /** 
     * IMS-2096: Recommendation status update rule
     */
    InvalidTaxCodeIdInRecommendationStatusUpdate(2815),

    /** 
     * ECM communication certificates error
     */
    CommunicationCertificatesError(2816),

    /** 
     * Invalid currency and aggrement type combination
     */
    InvalidCurrencyAggrementType(2817),

    /** 
     * ItemTaxCodeRecommendation Status can't be set without particular state of recommendation
     */
    InvalidTaxCodeRecommendationStatusUpdate(2818),

    /** 
     * Filing Request Error Codes
     */
    DuplicateFilingRequest(2819),

    /** 
     * Occurs when a Header value is incorrect or invalid in some way
     */
    InvalidHTTPHeader(3000),

    /** 
     * 
     */
    SCSServiceUnreachable(3001),

    /** 
     * 
     */
    DuplicateContactCode(3002),

    /** 
     * 
     */
    SCSServerError(3003),

    /** 
     * Occurs when user reconciliation happens and unable to create user at AvaTax
     */
    UserReconciliationError(3004),

    /** 
     * Occurs when a patch operation is attempted on a field that is not allowed to be patched
     */
    InvalidHttpPatchRequest(3005),

    /** 
     * Occurs when a patch operation other than 'given' operation is performed for the fields
     */
    UnsupportedPatchOperationError(3006),

    /** 
     * Occurs when system code and country code does not have active mapping.
     */
    SystemCodeAndCountryCodeMismatch(3007),

    /** 
     * Occurs when multiple entries for system code and country code exists.
     */
    DuplicateSystemAndCountryForItem(3008),

    /** 
     * 
     */
    InvalidHsCodeClassificationStatusOverride(3009),

    /** 
     * Occurs when the field name provided in the request isn't valid.
     */
    InvalidField(3010),

    /** 
     * 
     */
    DuplicatePatchOperation(3011),

    /** 
     * Avalara Gateway errors:
     */
    NotFound(4001),

    /** 
     * 
     */
    Unexpected(4002),

    /** 
     * 
     */
    NoHostFound(4003),

    /** 
     * 
     */
    UnexpectedAuth(4004),

    /** 
     * 
     */
    SiteSelectionFailed(4006),

    /** 
     * 
     */
    DropDefaultUsername(4007),

    /** 
     * 
     */
    DropDefaultNotMigrated(4008),

    /** 
     * 
     */
    DropBearerAuth(4009),

    /** 
     * 
     */
    SiteSelectionError(4010),

    /** 
     * 
     */
    RateLimitExceeded(4011),

    /** 
     * 
     */
    NoHealthySite(4012),

    /** 
     * 
     */
    ClientDisconnected(4013),

    /** 
     * 
     */
    ServiceDisconnected(4014),

    /** 
     * 
     */
    ServiceTimeout(4015),

    /** 
     * File Validation Service (FVS) Errors
     */
    UnsupportedMediaType(4016),

    /** 
     * 
     */
    InvalidMediaType(4017),

    /** 
     * 
     */
    FileSizeLimitExceeded(4018),

    /** 
     * 
     */
    InvalidImage(4019),

    /** 
     * 
     */
    ImageAlreadyLinked(4020),

    /** 
     * 
     */
    ItemIdMismatch(4021),

    /** 
     * Error string from the service unknown
     */
    UnexpectedError(-1);

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
