
# ErrorResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **Integer** |  |  [optional]
**code** | [**CodeEnum**](#CodeEnum) |  |  [optional]
**message** | **String** |  |  [optional]
**detailedMessage** | **String** |  |  [optional]
**items** | [**List&lt;ErrorDetailBase&gt;**](ErrorDetailBase.md) |  |  [optional]
**moreInfo** | **String** |  |  [optional]


<a name="CodeEnum"></a>
## Enum: CodeEnum
Name | Value
---- | -----
UNKNOWN | &quot;Unknown&quot;
VERSIONNOTFOUND | &quot;VersionNotFound&quot;
INSTRUMENTNOTFOUND | &quot;InstrumentNotFound&quot;
PROPERTYNOTFOUND | &quot;PropertyNotFound&quot;
PORTFOLIORECURSIONDEPTH | &quot;PortfolioRecursionDepth&quot;
GROUPNOTFOUND | &quot;GroupNotFound&quot;
PORTFOLIONOTFOUND | &quot;PortfolioNotFound&quot;
PROPERTYSCHEMANOTFOUND | &quot;PropertySchemaNotFound&quot;
PORTFOLIOANCESTRYNOTFOUND | &quot;PortfolioAncestryNotFound&quot;
PORTFOLIOWITHIDALREADYEXISTS | &quot;PortfolioWithIdAlreadyExists&quot;
ORPHANEDPORTFOLIO | &quot;OrphanedPortfolio&quot;
MISSINGBASECLAIMS | &quot;MissingBaseClaims&quot;
PROPERTYNOTDEFINED | &quot;PropertyNotDefined&quot;
CANNOTDELETESYSTEMPROPERTY | &quot;CannotDeleteSystemProperty&quot;
CANNOTMODIFYIMMUTABLEPROPERTYFIELD | &quot;CannotModifyImmutablePropertyField&quot;
PROPERTYALREADYEXISTS | &quot;PropertyAlreadyExists&quot;
INVALIDPROPERTYLIFETIME | &quot;InvalidPropertyLifeTime&quot;
CANNOTMODIFYDEFAULTDATATYPE | &quot;CannotModifyDefaultDataType&quot;
GROUPALREADYEXISTS | &quot;GroupAlreadyExists&quot;
NOSUCHDATATYPE | &quot;NoSuchDataType&quot;
VALIDATIONERROR | &quot;ValidationError&quot;
LOOPDETECTEDINGROUPHIERARCHY | &quot;LoopDetectedInGroupHierarchy&quot;
SUBGROUPALREADYEXISTS | &quot;SubGroupAlreadyExists&quot;
PRICESOURCENOTFOUND | &quot;PriceSourceNotFound&quot;
ANALYTICSTORENOTFOUND | &quot;AnalyticStoreNotFound&quot;
ANALYTICSTOREALREADYEXISTS | &quot;AnalyticStoreAlreadyExists&quot;
CLIENTINSTRUMENTALREADYEXISTS | &quot;ClientInstrumentAlreadyExists&quot;
DUPLICATEINPARAMETERSET | &quot;DuplicateInParameterSet&quot;
RESULTSNOTFOUND | &quot;ResultsNotFound&quot;
ORDERFIELDNOTINRESULTSET | &quot;OrderFieldNotInResultSet&quot;
OPERATIONFAILED | &quot;OperationFailed&quot;
ELASTICSEARCHERROR | &quot;ElasticSearchError&quot;
INVALIDPARAMETERVALUE | &quot;InvalidParameterValue&quot;
COMMANDPROCESSINGFAILURE | &quot;CommandProcessingFailure&quot;
ENTITYSTATECONSTRUCTIONFAILURE | &quot;EntityStateConstructionFailure&quot;
ENTITYTIMELINEDOESNOTEXIST | &quot;EntityTimelineDoesNotExist&quot;
EVENTPUBLISHFAILURE | &quot;EventPublishFailure&quot;
INVALIDREQUESTFAILURE | &quot;InvalidRequestFailure&quot;
EVENTPUBLISHUNKNOWN | &quot;EventPublishUnknown&quot;
EVENTQUERYFAILURE | &quot;EventQueryFailure&quot;
BLOBDIDNOTEXISTFAILURE | &quot;BlobDidNotExistFailure&quot;
SUBSYSTEMREQUESTFAILURE | &quot;SubSystemRequestFailure&quot;
SUBSYSTEMCONFIGURATIONFAILURE | &quot;SubSystemConfigurationFailure&quot;
FAILEDTODELETE | &quot;FailedToDelete&quot;
UPSERTCLIENTINSTRUMENTFAILURE | &quot;UpsertClientInstrumentFailure&quot;
ILLEGALASATINTERVAL | &quot;IllegalAsAtInterval&quot;
ILLEGALBITEMPORALQUERY | &quot;IllegalBitemporalQuery&quot;
INVALIDALTERNATEID | &quot;InvalidAlternateId&quot;
CANNOTADDSOURCEPORTFOLIOPROPERTYEXPLICITLY | &quot;CannotAddSourcePortfolioPropertyExplicitly&quot;
ENTITYALREADYEXISTSINGROUP | &quot;EntityAlreadyExistsInGroup&quot;
ENTITYWITHIDALREADYEXISTS | &quot;EntityWithIdAlreadyExists&quot;
PORTFOLIODETAILSDONOTEXIST | &quot;PortfolioDetailsDoNotExist&quot;
PORTFOLIOWITHNAMEALREADYEXISTS | &quot;PortfolioWithNameAlreadyExists&quot;
INVALIDTRANSACTIONS | &quot;InvalidTransactions&quot;
REFERENCEPORTFOLIONOTFOUND | &quot;ReferencePortfolioNotFound&quot;
DUPLICATEIDFAILURE | &quot;DuplicateIdFailure&quot;
COMMANDRETRIEVALFAILURE | &quot;CommandRetrievalFailure&quot;
DATAFILTERAPPLICATIONFAILURE | &quot;DataFilterApplicationFailure&quot;
SEARCHFAILED | &quot;SearchFailed&quot;
MOVEMENTSENGINECONFIGURATIONKEYFAILURE | &quot;MovementsEngineConfigurationKeyFailure&quot;
FXRATESOURCENOTFOUND | &quot;FxRateSourceNotFound&quot;
ACCRUALSOURCENOTFOUND | &quot;AccrualSourceNotFound&quot;
ENTITLEMENTSFAILURE | &quot;EntitlementsFailure&quot;
INVALIDIDENTITYTOKEN | &quot;InvalidIdentityToken&quot;
INVALIDREQUESTHEADERS | &quot;InvalidRequestHeaders&quot;
PRICENOTFOUND | &quot;PriceNotFound&quot;
INVALIDSUBHOLDINGKEYSPROVIDED | &quot;InvalidSubHoldingKeysProvided&quot;
DUPLICATESUBHOLDINGKEYSPROVIDED | &quot;DuplicateSubHoldingKeysProvided&quot;
CUTDEFINITIONNOTFOUND | &quot;CutDefinitionNotFound&quot;
CUTDEFINITIONINVALID | &quot;CutDefinitionInvalid&quot;
SERVERCONFIGURATIONERROR | &quot;ServerConfigurationError&quot;
INVALIDUNITFORDATATYPE | &quot;InvalidUnitForDataType&quot;
INVALIDTYPEFORDATATYPE | &quot;InvalidTypeForDataType&quot;
INVALIDVALUEFORDATATYPE | &quot;InvalidValueForDataType&quot;
UNITNOTDEFINEDFORDATATYPE | &quot;UnitNotDefinedForDataType&quot;
UNITSNOTSUPPORTEDONDATATYPE | &quot;UnitsNotSupportedOnDataType&quot;
CANNOTSPECIFYUNITSONDATATYPE | &quot;CannotSpecifyUnitsOnDataType&quot;
UNITSCHEMAINCONSISTENTWITHDATATYPE | &quot;UnitSchemaInconsistentWithDataType&quot;
UNITDEFINITIONNOTSPECIFIED | &quot;UnitDefinitionNotSpecified&quot;
DUPLICATEUNITDEFINITIONSSPECIFIED | &quot;DuplicateUnitDefinitionsSpecified&quot;
INVALIDUNITSDEFINITION | &quot;InvalidUnitsDefinition&quot;
INVALIDINSTRUMENTIDENTIFIERUNIT | &quot;InvalidInstrumentIdentifierUnit&quot;
HOLDINGSADJUSTMENTDOESNOTEXIST | &quot;HoldingsAdjustmentDoesNotExist&quot;
COULDNOTBUILDEXCELURL | &quot;CouldNotBuildExcelUrl&quot;
COULDNOTGETEXCELVERSION | &quot;CouldNotGetExcelVersion&quot;
INSTRUMENTBYCODENOTFOUND | &quot;InstrumentByCodeNotFound&quot;
ENTITYSCHEMADOESNOTEXIST | &quot;EntitySchemaDoesNotExist&quot;
FEATURENOTSUPPORTEDONPORTFOLIOTYPE | &quot;FeatureNotSupportedOnPortfolioType&quot;
QUOTENOTFOUNDFAILURE | &quot;QuoteNotFoundFailure&quot;
REFERENCEPORTFOLIOREQUESTNOTSUPPORTED | &quot;ReferencePortfolioRequestNotSupported&quot;
TRANSACTIONPORTFOLIOREQUESTNOTSUPPORTED | &quot;TransactionPortfolioRequestNotSupported&quot;
INVALIDINSTRUMENTDEFINITION | &quot;InvalidInstrumentDefinition&quot;
INSTRUMENTUPSERTFAILURE | &quot;InstrumentUpsertFailure&quot;
TRANSACTIONTYPENOTFOUND | &quot;TransactionTypeNotFound&quot;
TRANSACTIONTYPEDUPLICATION | &quot;TransactionTypeDuplication&quot;
INVALIDPROPERTYVALUEASSIGNMENT | &quot;InvalidPropertyValueAssignment&quot;
PORTFOLIODOESNOTEXISTATGIVENDATE | &quot;PortfolioDoesNotExistAtGivenDate&quot;
QUERYPARSERFAILURE | &quot;QueryParserFailure&quot;
DUPLICATECONSTITUENTFAILURE | &quot;DuplicateConstituentFailure&quot;
UNRESOLVEDINSTRUMENTCONSTITUENTFAILURE | &quot;UnresolvedInstrumentConstituentFailure&quot;
UNRESOLVEDINSTRUMENTINTRANSITIONFAILURE | &quot;UnresolvedInstrumentInTransitionFailure&quot;
MISSINGRECIPEFAILURE | &quot;MissingRecipeFailure&quot;
DEPENDENCIESFAILURE | &quot;DependenciesFailure&quot;
PORTFOLIOPREPROCESSFAILURE | &quot;PortfolioPreprocessFailure&quot;
VALUATIONENGINEFAILURE | &quot;ValuationEngineFailure&quot;
TASKFACTORYFAILURE | &quot;TaskFactoryFailure&quot;
TASKEVALUATIONFAILURE | &quot;TaskEvaluationFailure&quot;
INSTRUMENTFAILURE | &quot;InstrumentFailure&quot;
CASHFLOWSFAILURE | &quot;CashFlowsFailure&quot;
RESULTRETRIEVALFAILURE | &quot;ResultRetrievalFailure&quot;
RESULTPROCESSINGFAILURE | &quot;ResultProcessingFailure&quot;
VENDORRESULTPROCESSINGFAILURE | &quot;VendorResultProcessingFailure&quot;
CANNOTSUPPLYTIMESWITHPORTFOLIOSQUERY | &quot;CannotSupplyTimesWithPortfoliosQuery&quot;
ATTEMPTTOUPSERTDUPLICATEQUOTES | &quot;AttemptToUpsertDuplicateQuotes&quot;



