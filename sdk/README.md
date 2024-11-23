<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://www.lusid.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AborApi* | [**addDiaryEntry**](docs/AborApi.md#adddiaryentry) | **POST** /api/abor/{scope}/{code}/accountingdiary | [EXPERIMENTAL] AddDiaryEntry: Add a diary entry to the specified Abor.
*AborApi* | [**closePeriod**](docs/AborApi.md#closeperiod) | **POST** /api/abor/{scope}/{code}/accountingdiary/$closeperiod | [EXPERIMENTAL] ClosePeriod: Closes or locks the current period for the given Abor.
*AborApi* | [**createAbor**](docs/AborApi.md#createabor) | **POST** /api/abor/{scope} | [EXPERIMENTAL] CreateAbor: Create an Abor.
*AborApi* | [**deleteAbor**](docs/AborApi.md#deleteabor) | **DELETE** /api/abor/{scope}/{code} | [EXPERIMENTAL] DeleteAbor: Delete an Abor.
*AborApi* | [**getAbor**](docs/AborApi.md#getabor) | **GET** /api/abor/{scope}/{code} | [EXPERIMENTAL] GetAbor: Get Abor.
*AborApi* | [**getJournalEntryLines**](docs/AborApi.md#getjournalentrylines) | **POST** /api/abor/{scope}/{code}/journalentrylines/$query | [EXPERIMENTAL] GetJournalEntryLines: Get the Journal Entry lines for the given Abor.
*AborApi* | [**getTrialBalance**](docs/AborApi.md#gettrialbalance) | **POST** /api/abor/{scope}/{code}/trialbalance/$query | [EXPERIMENTAL] GetTrialBalance: Get the Trial Balance for the given Abor.
*AborApi* | [**listAbors**](docs/AborApi.md#listabors) | **GET** /api/abor | [EXPERIMENTAL] ListAbors: List Abors.
*AborApi* | [**listDiaryEntries**](docs/AborApi.md#listdiaryentries) | **GET** /api/abor/{scope}/{code}/accountingdiary | [EXPERIMENTAL] ListDiaryEntries: List diary entries.
*AborApi* | [**lockPeriod**](docs/AborApi.md#lockperiod) | **POST** /api/abor/{scope}/{code}/accountingdiary/$lockperiod | [EXPERIMENTAL] LockPeriod: Locks the last Closed or given Closed Period.
*AborApi* | [**patchAbor**](docs/AborApi.md#patchabor) | **PATCH** /api/abor/{scope}/{code} | [EXPERIMENTAL] PatchAbor: Patch Abor.
*AborApi* | [**reOpenPeriods**](docs/AborApi.md#reopenperiods) | **POST** /api/abor/{scope}/{code}/accountingdiary/$reopenperiods | [EXPERIMENTAL] ReOpenPeriods: Reopen periods from a seed Diary Entry Code or when not specified, the last Closed Period for the given Abor.
*AborApi* | [**upsertAborProperties**](docs/AborApi.md#upsertaborproperties) | **POST** /api/abor/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertAborProperties: Upsert Abor properties
*AborConfigurationApi* | [**createAborConfiguration**](docs/AborConfigurationApi.md#createaborconfiguration) | **POST** /api/aborconfiguration/{scope} | [EXPERIMENTAL] CreateAborConfiguration: Create an AborConfiguration.
*AborConfigurationApi* | [**deleteAborConfiguration**](docs/AborConfigurationApi.md#deleteaborconfiguration) | **DELETE** /api/aborconfiguration/{scope}/{code} | [EXPERIMENTAL] DeleteAborConfiguration: Delete an AborConfiguration.
*AborConfigurationApi* | [**getAborConfiguration**](docs/AborConfigurationApi.md#getaborconfiguration) | **GET** /api/aborconfiguration/{scope}/{code} | [EXPERIMENTAL] GetAborConfiguration: Get AborConfiguration.
*AborConfigurationApi* | [**listAborConfigurations**](docs/AborConfigurationApi.md#listaborconfigurations) | **GET** /api/aborconfiguration | [EXPERIMENTAL] ListAborConfigurations: List AborConfiguration.
*AborConfigurationApi* | [**upsertAborConfigurationProperties**](docs/AborConfigurationApi.md#upsertaborconfigurationproperties) | **POST** /api/aborconfiguration/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertAborConfigurationProperties: Upsert AborConfiguration properties
*AddressKeyDefinitionApi* | [**createAddressKeyDefinition**](docs/AddressKeyDefinitionApi.md#createaddresskeydefinition) | **POST** /api/addresskeydefinitions | [EARLY ACCESS] CreateAddressKeyDefinition: Create an AddressKeyDefinition.
*AddressKeyDefinitionApi* | [**getAddressKeyDefinition**](docs/AddressKeyDefinitionApi.md#getaddresskeydefinition) | **GET** /api/addresskeydefinitions/{key} | [EARLY ACCESS] GetAddressKeyDefinition: Get an AddressKeyDefinition.
*AddressKeyDefinitionApi* | [**listAddressKeyDefinitions**](docs/AddressKeyDefinitionApi.md#listaddresskeydefinitions) | **GET** /api/addresskeydefinitions | [EARLY ACCESS] ListAddressKeyDefinitions: List AddressKeyDefinitions.
*AggregationApi* | [**generateConfigurationRecipe**](docs/AggregationApi.md#generateconfigurationrecipe) | **POST** /api/aggregation/{scope}/{code}/$generateconfigurationrecipe | [EXPERIMENTAL] GenerateConfigurationRecipe: Generates a recipe sufficient to perform valuations for the given portfolio.
*AggregationApi* | [**getQueryableKeys**](docs/AggregationApi.md#getqueryablekeys) | **GET** /api/results/queryable/keys | GetQueryableKeys: Query the set of supported \"addresses\" that can be queried from the aggregation endpoint.
*AggregationApi* | [**getValuation**](docs/AggregationApi.md#getvaluation) | **POST** /api/aggregation/$valuation | GetValuation: Perform valuation for a list of portfolios and/or portfolio groups
*AggregationApi* | [**getValuationOfWeightedInstruments**](docs/AggregationApi.md#getvaluationofweightedinstruments) | **POST** /api/aggregation/$valuationinlined | GetValuationOfWeightedInstruments: Perform valuation for an inlined portfolio
*AllocationsApi* | [**deleteAllocation**](docs/AllocationsApi.md#deleteallocation) | **DELETE** /api/allocations/{scope}/{code} | [EARLY ACCESS] DeleteAllocation: Delete allocation
*AllocationsApi* | [**getAllocation**](docs/AllocationsApi.md#getallocation) | **GET** /api/allocations/{scope}/{code} | [EARLY ACCESS] GetAllocation: Get Allocation
*AllocationsApi* | [**listAllocations**](docs/AllocationsApi.md#listallocations) | **GET** /api/allocations | ListAllocations: List Allocations
*AllocationsApi* | [**upsertAllocations**](docs/AllocationsApi.md#upsertallocations) | **POST** /api/allocations | UpsertAllocations: Upsert Allocations
*AmortisationRuleSetsApi* | [**createAmortisationRuleSet**](docs/AmortisationRuleSetsApi.md#createamortisationruleset) | **POST** /api/amortisation/rulesets/{scope} | [EXPERIMENTAL] CreateAmortisationRuleSet: Create an amortisation rule set.
*AmortisationRuleSetsApi* | [**deleteAmortisationRuleset**](docs/AmortisationRuleSetsApi.md#deleteamortisationruleset) | **DELETE** /api/amortisation/rulesets/{scope}/{code} | [EXPERIMENTAL] DeleteAmortisationRuleset: Delete an amortisation rule set.
*AmortisationRuleSetsApi* | [**getAmortisationRuleSet**](docs/AmortisationRuleSetsApi.md#getamortisationruleset) | **GET** /api/amortisation/rulesets/{scope}/{code} | [EXPERIMENTAL] GetAmortisationRuleSet: Retrieve the definition of a single amortisation rule set
*AmortisationRuleSetsApi* | [**listAmortisationRuleSets**](docs/AmortisationRuleSetsApi.md#listamortisationrulesets) | **GET** /api/amortisation/rulesets | [EXPERIMENTAL] ListAmortisationRuleSets: List amortisation rule sets.
*AmortisationRuleSetsApi* | [**setAmortisationRules**](docs/AmortisationRuleSetsApi.md#setamortisationrules) | **PUT** /api/amortisation/rulesets/{scope}/{code}/rules | [EXPERIMENTAL] SetAmortisationRules: Set Amortisation Rules on an existing Amortisation Rule Set.
*AmortisationRuleSetsApi* | [**updateAmortisationRuleSetDetails**](docs/AmortisationRuleSetsApi.md#updateamortisationrulesetdetails) | **PUT** /api/amortisation/rulesets/{scope}/{code}/details | [EXPERIMENTAL] UpdateAmortisationRuleSetDetails: Update an amortisation rule set.
*ApplicationMetadataApi* | [**getExcelAddin**](docs/ApplicationMetadataApi.md#getexceladdin) | **GET** /api/metadata/downloads/exceladdin | GetExcelAddin: Download Excel Addin
*ApplicationMetadataApi* | [**getLusidVersions**](docs/ApplicationMetadataApi.md#getlusidversions) | **GET** /api/metadata/versions | GetLusidVersions: Get LUSID versions
*ApplicationMetadataApi* | [**listAccessControlledResources**](docs/ApplicationMetadataApi.md#listaccesscontrolledresources) | **GET** /api/metadata/access/resources | ListAccessControlledResources: Get resources available for access control
*BlocksApi* | [**deleteBlock**](docs/BlocksApi.md#deleteblock) | **DELETE** /api/blocks/{scope}/{code} | [EARLY ACCESS] DeleteBlock: Delete block
*BlocksApi* | [**getBlock**](docs/BlocksApi.md#getblock) | **GET** /api/blocks/{scope}/{code} | [EARLY ACCESS] GetBlock: Get Block
*BlocksApi* | [**listBlocks**](docs/BlocksApi.md#listblocks) | **GET** /api/blocks | [EARLY ACCESS] ListBlocks: List Blocks
*BlocksApi* | [**upsertBlocks**](docs/BlocksApi.md#upsertblocks) | **POST** /api/blocks | [EARLY ACCESS] UpsertBlocks: Upsert Block
*CalendarsApi* | [**addBusinessDaysToDate**](docs/CalendarsApi.md#addbusinessdaystodate) | **POST** /api/calendars/businessday/{scope}/add | [EARLY ACCESS] AddBusinessDaysToDate: Adds the requested number of Business Days to the provided date.
*CalendarsApi* | [**addDateToCalendar**](docs/CalendarsApi.md#adddatetocalendar) | **PUT** /api/calendars/generic/{scope}/{code}/dates | AddDateToCalendar: Add a date to a calendar
*CalendarsApi* | [**batchUpsertDatesForCalendar**](docs/CalendarsApi.md#batchupsertdatesforcalendar) | **POST** /api/calendars/generic/{scope}/{code}/dates/$batchUpsert | BatchUpsertDatesForCalendar: Batch upsert dates to a calendar
*CalendarsApi* | [**createCalendar**](docs/CalendarsApi.md#createcalendar) | **POST** /api/calendars/generic | [EARLY ACCESS] CreateCalendar: Create a calendar in its generic form
*CalendarsApi* | [**deleteCalendar**](docs/CalendarsApi.md#deletecalendar) | **DELETE** /api/calendars/generic/{scope}/{code} | [EARLY ACCESS] DeleteCalendar: Delete a calendar
*CalendarsApi* | [**deleteDateFromCalendar**](docs/CalendarsApi.md#deletedatefromcalendar) | **DELETE** /api/calendars/generic/{scope}/{code}/dates/{dateId} | DeleteDateFromCalendar: Remove a date from a calendar
*CalendarsApi* | [**deleteDatesFromCalendar**](docs/CalendarsApi.md#deletedatesfromcalendar) | **POST** /api/calendars/generic/{scope}/{code}/dates/$delete | DeleteDatesFromCalendar: Delete dates from a calendar
*CalendarsApi* | [**generateSchedule**](docs/CalendarsApi.md#generateschedule) | **POST** /api/calendars/schedule/{scope} | [EARLY ACCESS] GenerateSchedule: Generate an ordered schedule of dates.
*CalendarsApi* | [**getCalendar**](docs/CalendarsApi.md#getcalendar) | **GET** /api/calendars/generic/{scope}/{code} | GetCalendar: Get a calendar in its generic form
*CalendarsApi* | [**getDates**](docs/CalendarsApi.md#getdates) | **GET** /api/calendars/generic/{scope}/{code}/dates | [EARLY ACCESS] GetDates: Get dates for a specific calendar
*CalendarsApi* | [**isBusinessDateTime**](docs/CalendarsApi.md#isbusinessdatetime) | **GET** /api/calendars/businessday/{scope}/{code} | [EARLY ACCESS] IsBusinessDateTime: Check whether a DateTime is a \"Business DateTime\"
*CalendarsApi* | [**listCalendars**](docs/CalendarsApi.md#listcalendars) | **GET** /api/calendars/generic | [EARLY ACCESS] ListCalendars: List Calendars
*CalendarsApi* | [**listCalendarsInScope**](docs/CalendarsApi.md#listcalendarsinscope) | **GET** /api/calendars/generic/{scope} | ListCalendarsInScope: List all calenders in a specified scope
*CalendarsApi* | [**updateCalendar**](docs/CalendarsApi.md#updatecalendar) | **POST** /api/calendars/generic/{scope}/{code} | [EARLY ACCESS] UpdateCalendar: Update a calendar
*ChartOfAccountsApi* | [**createChartOfAccounts**](docs/ChartOfAccountsApi.md#createchartofaccounts) | **POST** /api/chartofaccounts/{scope} | [EXPERIMENTAL] CreateChartOfAccounts: Create a Chart of Accounts
*ChartOfAccountsApi* | [**createCleardownModule**](docs/ChartOfAccountsApi.md#createcleardownmodule) | **POST** /api/chartofaccounts/{scope}/{code}/cleardownmodules | [EXPERIMENTAL] CreateCleardownModule: Create a Cleardown Module
*ChartOfAccountsApi* | [**createGeneralLedgerProfile**](docs/ChartOfAccountsApi.md#creategeneralledgerprofile) | **POST** /api/chartofaccounts/{scope}/{code}/generalledgerprofile | [EXPERIMENTAL] CreateGeneralLedgerProfile: Create a General Ledger Profile.
*ChartOfAccountsApi* | [**createPostingModule**](docs/ChartOfAccountsApi.md#createpostingmodule) | **POST** /api/chartofaccounts/{scope}/{code}/postingmodules | [EXPERIMENTAL] CreatePostingModule: Create a Posting Module
*ChartOfAccountsApi* | [**deleteAccounts**](docs/ChartOfAccountsApi.md#deleteaccounts) | **POST** /api/chartofaccounts/{scope}/{code}/accounts/$delete | [EXPERIMENTAL] DeleteAccounts: Soft or hard delete multiple accounts
*ChartOfAccountsApi* | [**deleteChartOfAccounts**](docs/ChartOfAccountsApi.md#deletechartofaccounts) | **DELETE** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] DeleteChartOfAccounts: Delete a Chart of Accounts
*ChartOfAccountsApi* | [**deleteCleardownModule**](docs/ChartOfAccountsApi.md#deletecleardownmodule) | **DELETE** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] DeleteCleardownModule: Delete a Cleardown Module.
*ChartOfAccountsApi* | [**deleteGeneralLedgerProfile**](docs/ChartOfAccountsApi.md#deletegeneralledgerprofile) | **DELETE** /api/chartofaccounts/{scope}/{code}/generalledgerprofile/{generalLedgerProfileCode} | [EXPERIMENTAL] DeleteGeneralLedgerProfile: Delete a General Ledger Profile.
*ChartOfAccountsApi* | [**deletePostingModule**](docs/ChartOfAccountsApi.md#deletepostingmodule) | **DELETE** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] DeletePostingModule: Delete a Posting Module.
*ChartOfAccountsApi* | [**getAccount**](docs/ChartOfAccountsApi.md#getaccount) | **GET** /api/chartofaccounts/{scope}/{code}/accounts/{accountCode} | [EXPERIMENTAL] GetAccount: Get Account
*ChartOfAccountsApi* | [**getChartOfAccounts**](docs/ChartOfAccountsApi.md#getchartofaccounts) | **GET** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] GetChartOfAccounts: Get ChartOfAccounts
*ChartOfAccountsApi* | [**getCleardownModule**](docs/ChartOfAccountsApi.md#getcleardownmodule) | **GET** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] GetCleardownModule: Get a Cleardown Module
*ChartOfAccountsApi* | [**getGeneralLedgerProfile**](docs/ChartOfAccountsApi.md#getgeneralledgerprofile) | **GET** /api/chartofaccounts/{scope}/{code}/generalledgerprofile/{generalLedgerProfileCode} | [EXPERIMENTAL] GetGeneralLedgerProfile: Get a General Ledger Profile.
*ChartOfAccountsApi* | [**getPostingModule**](docs/ChartOfAccountsApi.md#getpostingmodule) | **GET** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] GetPostingModule: Get a Posting Module
*ChartOfAccountsApi* | [**listAccounts**](docs/ChartOfAccountsApi.md#listaccounts) | **GET** /api/chartofaccounts/{scope}/{code}/accounts | [EXPERIMENTAL] ListAccounts: List Accounts
*ChartOfAccountsApi* | [**listChartsOfAccounts**](docs/ChartOfAccountsApi.md#listchartsofaccounts) | **GET** /api/chartofaccounts | [EXPERIMENTAL] ListChartsOfAccounts: List Charts of Accounts
*ChartOfAccountsApi* | [**listCleardownModuleRules**](docs/ChartOfAccountsApi.md#listcleardownmodulerules) | **GET** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode}/cleardownrules | [EXPERIMENTAL] ListCleardownModuleRules: List Cleardown Module Rules
*ChartOfAccountsApi* | [**listCleardownModules**](docs/ChartOfAccountsApi.md#listcleardownmodules) | **GET** /api/chartofaccounts/{scope}/{code}/cleardownmodules | [EXPERIMENTAL] ListCleardownModules: List Cleardown Modules
*ChartOfAccountsApi* | [**listGeneralLedgerProfiles**](docs/ChartOfAccountsApi.md#listgeneralledgerprofiles) | **GET** /api/chartofaccounts/{scope}/{code}/generalledgerprofile | [EXPERIMENTAL] ListGeneralLedgerProfiles: List General Ledger Profiles.
*ChartOfAccountsApi* | [**listPostingModuleRules**](docs/ChartOfAccountsApi.md#listpostingmodulerules) | **GET** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode}/postingrules | [EXPERIMENTAL] ListPostingModuleRules: List Posting Module Rules
*ChartOfAccountsApi* | [**listPostingModules**](docs/ChartOfAccountsApi.md#listpostingmodules) | **GET** /api/chartofaccounts/{scope}/{code}/postingmodules | [EXPERIMENTAL] ListPostingModules: List Posting Modules
*ChartOfAccountsApi* | [**patchChartOfAccounts**](docs/ChartOfAccountsApi.md#patchchartofaccounts) | **PATCH** /api/chartofaccounts/{scope}/{code} | [EXPERIMENTAL] PatchChartOfAccounts: Patch a Chart of Accounts.
*ChartOfAccountsApi* | [**patchCleardownModule**](docs/ChartOfAccountsApi.md#patchcleardownmodule) | **PATCH** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] PatchCleardownModule: Patch a Cleardown Module
*ChartOfAccountsApi* | [**patchPostingModule**](docs/ChartOfAccountsApi.md#patchpostingmodule) | **PATCH** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] PatchPostingModule: Patch a Posting Module
*ChartOfAccountsApi* | [**setCleardownModuleDetails**](docs/ChartOfAccountsApi.md#setcleardownmoduledetails) | **PUT** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode} | [EXPERIMENTAL] SetCleardownModuleDetails: Set the details of a Cleardown Module
*ChartOfAccountsApi* | [**setCleardownModuleRules**](docs/ChartOfAccountsApi.md#setcleardownmodulerules) | **PUT** /api/chartofaccounts/{scope}/{code}/cleardownmodules/{cleardownModuleCode}/cleardownrules | [EXPERIMENTAL] SetCleardownModuleRules: Set the rules of a Cleardown Module
*ChartOfAccountsApi* | [**setGeneralLedgerProfileMappings**](docs/ChartOfAccountsApi.md#setgeneralledgerprofilemappings) | **PUT** /api/chartofaccounts/{scope}/{code}/generalledgerprofile/{generalLedgerProfileCode}/mappings | [EXPERIMENTAL] SetGeneralLedgerProfileMappings: Sets the General Ledger Profile Mappings.
*ChartOfAccountsApi* | [**setPostingModuleDetails**](docs/ChartOfAccountsApi.md#setpostingmoduledetails) | **PUT** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode} | [EXPERIMENTAL] SetPostingModuleDetails: Set the details of a Posting Module
*ChartOfAccountsApi* | [**setPostingModuleRules**](docs/ChartOfAccountsApi.md#setpostingmodulerules) | **PUT** /api/chartofaccounts/{scope}/{code}/postingmodules/{postingModuleCode}/postingrules | [EXPERIMENTAL] SetPostingModuleRules: Set the rules of a Posting Module
*ChartOfAccountsApi* | [**upsertAccountProperties**](docs/ChartOfAccountsApi.md#upsertaccountproperties) | **POST** /api/chartofaccounts/{scope}/{code}/accounts/{accountCode}/properties/$upsert | [EXPERIMENTAL] UpsertAccountProperties: Upsert account properties
*ChartOfAccountsApi* | [**upsertAccounts**](docs/ChartOfAccountsApi.md#upsertaccounts) | **POST** /api/chartofaccounts/{scope}/{code}/accounts | [EXPERIMENTAL] UpsertAccounts: Upsert Accounts
*ChartOfAccountsApi* | [**upsertChartOfAccountsProperties**](docs/ChartOfAccountsApi.md#upsertchartofaccountsproperties) | **POST** /api/chartofaccounts/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertChartOfAccountsProperties: Upsert Chart of Accounts properties
*ComplexMarketDataApi* | [**deleteComplexMarketData**](docs/ComplexMarketDataApi.md#deletecomplexmarketdata) | **POST** /api/complexmarketdata/{scope}/$delete | [EARLY ACCESS] DeleteComplexMarketData: Delete one or more items of complex market data, assuming they are present.
*ComplexMarketDataApi* | [**getComplexMarketData**](docs/ComplexMarketDataApi.md#getcomplexmarketdata) | **POST** /api/complexmarketdata/{scope}/$get | [EARLY ACCESS] GetComplexMarketData: Get complex market data
*ComplexMarketDataApi* | [**listComplexMarketData**](docs/ComplexMarketDataApi.md#listcomplexmarketdata) | **GET** /api/complexmarketdata | [EXPERIMENTAL] ListComplexMarketData: List the set of ComplexMarketData
*ComplexMarketDataApi* | [**upsertComplexMarketData**](docs/ComplexMarketDataApi.md#upsertcomplexmarketdata) | **POST** /api/complexmarketdata/{scope} | UpsertComplexMarketData: Upsert a set of complex market data items. This creates or updates the data in Lusid.
*ComplianceApi* | [**createComplianceTemplate**](docs/ComplianceApi.md#createcompliancetemplate) | **POST** /api/compliance/templates/{scope} | [EARLY ACCESS] CreateComplianceTemplate: Create a Compliance Rule Template
*ComplianceApi* | [**deleteComplianceRule**](docs/ComplianceApi.md#deletecompliancerule) | **DELETE** /api/compliance/rules/{scope}/{code} | [EARLY ACCESS] DeleteComplianceRule: Delete compliance rule.
*ComplianceApi* | [**deleteComplianceTemplate**](docs/ComplianceApi.md#deletecompliancetemplate) | **DELETE** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] DeleteComplianceTemplate: Delete a ComplianceRuleTemplate
*ComplianceApi* | [**getComplianceRule**](docs/ComplianceApi.md#getcompliancerule) | **GET** /api/compliance/rules/{scope}/{code} | [EARLY ACCESS] GetComplianceRule: Get compliance rule.
*ComplianceApi* | [**getComplianceRuleResult**](docs/ComplianceApi.md#getcomplianceruleresult) | **GET** /api/compliance/runs/summary/{runScope}/{runCode}/{ruleScope}/{ruleCode} | [EARLY ACCESS] GetComplianceRuleResult: Get detailed results for a specific rule within a compliance run.
*ComplianceApi* | [**getComplianceTemplate**](docs/ComplianceApi.md#getcompliancetemplate) | **GET** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] GetComplianceTemplate: Get the requested compliance template.
*ComplianceApi* | [**getDecoratedComplianceRunSummary**](docs/ComplianceApi.md#getdecoratedcompliancerunsummary) | **GET** /api/compliance/runs/summary/{scope}/{code}/$decorate | [EARLY ACCESS] GetDecoratedComplianceRunSummary: Get decorated summary results for a specific compliance run.
*ComplianceApi* | [**listComplianceRules**](docs/ComplianceApi.md#listcompliancerules) | **GET** /api/compliance/rules | [EARLY ACCESS] ListComplianceRules: List compliance rules.
*ComplianceApi* | [**listComplianceRuns**](docs/ComplianceApi.md#listcomplianceruns) | **GET** /api/compliance/runs | [EARLY ACCESS] ListComplianceRuns: List historical compliance run identifiers.
*ComplianceApi* | [**listComplianceTemplates**](docs/ComplianceApi.md#listcompliancetemplates) | **GET** /api/compliance/templates | [EARLY ACCESS] ListComplianceTemplates: List compliance templates.
*ComplianceApi* | [**runCompliance**](docs/ComplianceApi.md#runcompliance) | **POST** /api/compliance/runs | [EARLY ACCESS] RunCompliance: Run a compliance check.
*ComplianceApi* | [**runCompliancePreview**](docs/ComplianceApi.md#runcompliancepreview) | **POST** /api/compliance/preview/runs | [EARLY ACCESS] RunCompliancePreview: Run a compliance check.
*ComplianceApi* | [**updateComplianceTemplate**](docs/ComplianceApi.md#updatecompliancetemplate) | **PUT** /api/compliance/templates/{scope}/{code} | [EARLY ACCESS] UpdateComplianceTemplate: Update a ComplianceRuleTemplate
*ComplianceApi* | [**upsertComplianceRule**](docs/ComplianceApi.md#upsertcompliancerule) | **POST** /api/compliance/rules | [EARLY ACCESS] UpsertComplianceRule: Upsert a compliance rule.
*ComplianceApi* | [**upsertComplianceRunSummary**](docs/ComplianceApi.md#upsertcompliancerunsummary) | **POST** /api/compliance/runs/summary | [EARLY ACCESS] UpsertComplianceRunSummary: Upsert a compliance run summary.
*ConfigurationRecipeApi* | [**deleteConfigurationRecipe**](docs/ConfigurationRecipeApi.md#deleteconfigurationrecipe) | **DELETE** /api/recipes/{scope}/{code} | DeleteConfigurationRecipe: Delete a Configuration Recipe, assuming that it is present.
*ConfigurationRecipeApi* | [**deleteRecipeComposer**](docs/ConfigurationRecipeApi.md#deleterecipecomposer) | **DELETE** /api/recipes/composer/{scope}/{code} | [EXPERIMENTAL] DeleteRecipeComposer: Delete a Recipe Composer, assuming that it is present.
*ConfigurationRecipeApi* | [**getConfigurationRecipe**](docs/ConfigurationRecipeApi.md#getconfigurationrecipe) | **GET** /api/recipes/{scope}/{code} | GetConfigurationRecipe: Get Configuration Recipe
*ConfigurationRecipeApi* | [**getDerivedRecipe**](docs/ConfigurationRecipeApi.md#getderivedrecipe) | **GET** /api/recipes/derived/{scope}/{code} | [EXPERIMENTAL] GetDerivedRecipe: Get Configuration Recipe either from the store or expanded from a Recipe Composer.
*ConfigurationRecipeApi* | [**getRecipeComposer**](docs/ConfigurationRecipeApi.md#getrecipecomposer) | **GET** /api/recipes/composer/{scope}/{code} | [EXPERIMENTAL] GetRecipeComposer: Get Recipe Composer
*ConfigurationRecipeApi* | [**getRecipeComposerResolvedInline**](docs/ConfigurationRecipeApi.md#getrecipecomposerresolvedinline) | **POST** /api/recipes/composer/resolvedinline$ | [EXPERIMENTAL] GetRecipeComposerResolvedInline: Given a Recipe Composer, this endpoint expands into a Configuration Recipe without persistence. Primarily used for testing purposes.
*ConfigurationRecipeApi* | [**listConfigurationRecipes**](docs/ConfigurationRecipeApi.md#listconfigurationrecipes) | **GET** /api/recipes | ListConfigurationRecipes: List the set of Configuration Recipes
*ConfigurationRecipeApi* | [**listDerivedRecipes**](docs/ConfigurationRecipeApi.md#listderivedrecipes) | **GET** /api/recipes/derived | [EXPERIMENTAL] ListDerivedRecipes: List the complete set of all Configuration Recipes, both from the configuration recipe store and also from expanded recipe composers.
*ConfigurationRecipeApi* | [**listRecipeComposers**](docs/ConfigurationRecipeApi.md#listrecipecomposers) | **GET** /api/recipes/composer | [EXPERIMENTAL] ListRecipeComposers: List the set of Recipe Composers
*ConfigurationRecipeApi* | [**upsertConfigurationRecipe**](docs/ConfigurationRecipeApi.md#upsertconfigurationrecipe) | **POST** /api/recipes | UpsertConfigurationRecipe: Upsert a Configuration Recipe. This creates or updates the data in Lusid.
*ConfigurationRecipeApi* | [**upsertRecipeComposer**](docs/ConfigurationRecipeApi.md#upsertrecipecomposer) | **POST** /api/recipes/composer | [EXPERIMENTAL] UpsertRecipeComposer: Upsert a Recipe Composer. This creates or updates the data in Lusid.
*ConventionsApi* | [**deleteCdsFlowConventions**](docs/ConventionsApi.md#deletecdsflowconventions) | **DELETE** /api/conventions/credit/conventions/{scope}/{code} | [BETA] DeleteCdsFlowConventions: Delete the CDS Flow Conventions of given scope and code, assuming that it is present.
*ConventionsApi* | [**deleteFlowConventions**](docs/ConventionsApi.md#deleteflowconventions) | **DELETE** /api/conventions/rates/flowconventions/{scope}/{code} | [BETA] DeleteFlowConventions: Delete the Flow Conventions of given scope and code, assuming that it is present.
*ConventionsApi* | [**deleteIndexConvention**](docs/ConventionsApi.md#deleteindexconvention) | **DELETE** /api/conventions/rates/indexconventions/{scope}/{code} | [BETA] DeleteIndexConvention: Delete the Index Convention of given scope and code, assuming that it is present.
*ConventionsApi* | [**getCdsFlowConventions**](docs/ConventionsApi.md#getcdsflowconventions) | **GET** /api/conventions/credit/conventions/{scope}/{code} | [BETA] GetCdsFlowConventions: Get CDS Flow Conventions
*ConventionsApi* | [**getFlowConventions**](docs/ConventionsApi.md#getflowconventions) | **GET** /api/conventions/rates/flowconventions/{scope}/{code} | [BETA] GetFlowConventions: Get Flow Conventions
*ConventionsApi* | [**getIndexConvention**](docs/ConventionsApi.md#getindexconvention) | **GET** /api/conventions/rates/indexconventions/{scope}/{code} | [BETA] GetIndexConvention: Get Index Convention
*ConventionsApi* | [**listCdsFlowConventions**](docs/ConventionsApi.md#listcdsflowconventions) | **GET** /api/conventions/credit/conventions | [BETA] ListCdsFlowConventions: List the set of CDS Flow Conventions
*ConventionsApi* | [**listFlowConventions**](docs/ConventionsApi.md#listflowconventions) | **GET** /api/conventions/rates/flowconventions | [BETA] ListFlowConventions: List the set of Flow Conventions
*ConventionsApi* | [**listIndexConvention**](docs/ConventionsApi.md#listindexconvention) | **GET** /api/conventions/rates/indexconventions | [BETA] ListIndexConvention: List the set of Index Conventions
*ConventionsApi* | [**upsertCdsFlowConventions**](docs/ConventionsApi.md#upsertcdsflowconventions) | **POST** /api/conventions/credit/conventions | [BETA] UpsertCdsFlowConventions: Upsert a set of CDS Flow Conventions. This creates or updates the data in Lusid.
*ConventionsApi* | [**upsertFlowConventions**](docs/ConventionsApi.md#upsertflowconventions) | **POST** /api/conventions/rates/flowconventions | [BETA] UpsertFlowConventions: Upsert Flow Conventions. This creates or updates the data in Lusid.
*ConventionsApi* | [**upsertIndexConvention**](docs/ConventionsApi.md#upsertindexconvention) | **POST** /api/conventions/rates/indexconventions | [BETA] UpsertIndexConvention: Upsert a set of Index Convention. This creates or updates the data in Lusid.
*CorporateActionSourcesApi* | [**batchUpsertCorporateActions**](docs/CorporateActionSourcesApi.md#batchupsertcorporateactions) | **POST** /api/corporateactionsources/{scope}/{code}/corporateactions | [EARLY ACCESS] BatchUpsertCorporateActions: Batch upsert corporate actions (instrument transition events) to corporate action source.
*CorporateActionSourcesApi* | [**createCorporateActionSource**](docs/CorporateActionSourcesApi.md#createcorporateactionsource) | **POST** /api/corporateactionsources | [EARLY ACCESS] CreateCorporateActionSource: Create corporate action source
*CorporateActionSourcesApi* | [**deleteCorporateActionSource**](docs/CorporateActionSourcesApi.md#deletecorporateactionsource) | **DELETE** /api/corporateactionsources/{scope}/{code} | [BETA] DeleteCorporateActionSource: Delete corporate actions (instrument transition events) from the corporate action source.
*CorporateActionSourcesApi* | [**deleteCorporateActions**](docs/CorporateActionSourcesApi.md#deletecorporateactions) | **DELETE** /api/corporateactionsources/{scope}/{code}/corporateactions | [EARLY ACCESS] DeleteCorporateActions: Delete corporate actions
*CorporateActionSourcesApi* | [**deleteInstrumentEvents**](docs/CorporateActionSourcesApi.md#deleteinstrumentevents) | **DELETE** /api/corporateactionsources/{scope}/{code}/instrumentevents | [EARLY ACCESS] DeleteInstrumentEvents: Delete corporate actions (instrument transition events) from the corporate action source.
*CorporateActionSourcesApi* | [**getCorporateActions**](docs/CorporateActionSourcesApi.md#getcorporateactions) | **GET** /api/corporateactionsources/{scope}/{code}/corporateactions | [EARLY ACCESS] GetCorporateActions: List corporate actions (instrument transition events) from the corporate action source.
*CorporateActionSourcesApi* | [**getInstrumentEvents**](docs/CorporateActionSourcesApi.md#getinstrumentevents) | **GET** /api/corporateactionsources/{scope}/{code}/instrumentevents | [EARLY ACCESS] GetInstrumentEvents: Get extrinsic instrument events out of a given corporate actions source.
*CorporateActionSourcesApi* | [**listCorporateActionSources**](docs/CorporateActionSourcesApi.md#listcorporateactionsources) | **GET** /api/corporateactionsources | [EARLY ACCESS] ListCorporateActionSources: List corporate action sources
*CorporateActionSourcesApi* | [**upsertInstrumentEvents**](docs/CorporateActionSourcesApi.md#upsertinstrumentevents) | **POST** /api/corporateactionsources/{scope}/{code}/instrumentevents | [EARLY ACCESS] UpsertInstrumentEvents: Upsert instrument events to the provided corporate actions source.
*CounterpartiesApi* | [**deleteCounterpartyAgreement**](docs/CounterpartiesApi.md#deletecounterpartyagreement) | **DELETE** /api/counterparties/counterpartyagreements/{scope}/{code} | [EARLY ACCESS] DeleteCounterpartyAgreement: Delete the Counterparty Agreement of given scope and code
*CounterpartiesApi* | [**deleteCreditSupportAnnex**](docs/CounterpartiesApi.md#deletecreditsupportannex) | **DELETE** /api/counterparties/creditsupportannexes/{scope}/{code} | [EARLY ACCESS] DeleteCreditSupportAnnex: Delete the Credit Support Annex of given scope and code
*CounterpartiesApi* | [**getCounterpartyAgreement**](docs/CounterpartiesApi.md#getcounterpartyagreement) | **GET** /api/counterparties/counterpartyagreements/{scope}/{code} | [EARLY ACCESS] GetCounterpartyAgreement: Get Counterparty Agreement
*CounterpartiesApi* | [**getCreditSupportAnnex**](docs/CounterpartiesApi.md#getcreditsupportannex) | **GET** /api/counterparties/creditsupportannexes/{scope}/{code} | [EARLY ACCESS] GetCreditSupportAnnex: Get Credit Support Annex
*CounterpartiesApi* | [**listCounterpartyAgreements**](docs/CounterpartiesApi.md#listcounterpartyagreements) | **GET** /api/counterparties/counterpartyagreements | [EARLY ACCESS] ListCounterpartyAgreements: List the set of Counterparty Agreements
*CounterpartiesApi* | [**listCreditSupportAnnexes**](docs/CounterpartiesApi.md#listcreditsupportannexes) | **GET** /api/counterparties/creditsupportannexes | [EARLY ACCESS] ListCreditSupportAnnexes: List the set of Credit Support Annexes
*CounterpartiesApi* | [**upsertCounterpartyAgreement**](docs/CounterpartiesApi.md#upsertcounterpartyagreement) | **POST** /api/counterparties/counterpartyagreements | [EARLY ACCESS] UpsertCounterpartyAgreement: Upsert Counterparty Agreement
*CounterpartiesApi* | [**upsertCreditSupportAnnex**](docs/CounterpartiesApi.md#upsertcreditsupportannex) | **POST** /api/counterparties/creditsupportannexes | [EARLY ACCESS] UpsertCreditSupportAnnex: Upsert Credit Support Annex
*CustomEntitiesApi* | [**deleteCustomEntity**](docs/CustomEntitiesApi.md#deletecustomentity) | **DELETE** /api/customentities/{entityType}/{identifierType}/{identifierValue} | DeleteCustomEntity: Delete a Custom Entity instance.
*CustomEntitiesApi* | [**deleteCustomEntityAccessMetadata**](docs/CustomEntitiesApi.md#deletecustomentityaccessmetadata) | **DELETE** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey} | [EARLY ACCESS] DeleteCustomEntityAccessMetadata: Delete a Custom Entity Access Metadata entry
*CustomEntitiesApi* | [**getAllCustomEntityAccessMetadata**](docs/CustomEntitiesApi.md#getallcustomentityaccessmetadata) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata | [EARLY ACCESS] GetAllCustomEntityAccessMetadata: Get all the Access Metadata rules for a Custom Entity
*CustomEntitiesApi* | [**getCustomEntity**](docs/CustomEntitiesApi.md#getcustomentity) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue} | GetCustomEntity: Get a Custom Entity instance.
*CustomEntitiesApi* | [**getCustomEntityAccessMetadataByKey**](docs/CustomEntitiesApi.md#getcustomentityaccessmetadatabykey) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey} | [EARLY ACCESS] GetCustomEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Custom Entity
*CustomEntitiesApi* | [**getCustomEntityRelationships**](docs/CustomEntitiesApi.md#getcustomentityrelationships) | **GET** /api/customentities/{entityType}/{identifierType}/{identifierValue}/relationships | [EARLY ACCESS] GetCustomEntityRelationships: Get Relationships for Custom Entity
*CustomEntitiesApi* | [**listCustomEntities**](docs/CustomEntitiesApi.md#listcustomentities) | **GET** /api/customentities/{entityType} | ListCustomEntities: List Custom Entities of the specified entityType.
*CustomEntitiesApi* | [**patchCustomEntityAccessMetadata**](docs/CustomEntitiesApi.md#patchcustomentityaccessmetadata) | **PATCH** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata | [EARLY ACCESS] PatchCustomEntityAccessMetadata: Patch Access Metadata rules for a Custom Entity.
*CustomEntitiesApi* | [**upsertCustomEntities**](docs/CustomEntitiesApi.md#upsertcustomentities) | **POST** /api/customentities/{entityType}/$batchUpsert | [EARLY ACCESS] UpsertCustomEntities: Batch upsert instances of Custom Entities
*CustomEntitiesApi* | [**upsertCustomEntity**](docs/CustomEntitiesApi.md#upsertcustomentity) | **POST** /api/customentities/{entityType} | UpsertCustomEntity: Upsert a Custom Entity instance
*CustomEntitiesApi* | [**upsertCustomEntityAccessMetadata**](docs/CustomEntitiesApi.md#upsertcustomentityaccessmetadata) | **PUT** /api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey} | [EARLY ACCESS] UpsertCustomEntityAccessMetadata: Upsert a Custom Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
*CustomEntityDefinitionsApi* | [**createCustomEntityDefinition**](docs/CustomEntityDefinitionsApi.md#createcustomentitydefinition) | **POST** /api/customentities/entitytypes | [EARLY ACCESS] CreateCustomEntityDefinition: Define a new Custom Entity type.
*CustomEntityDefinitionsApi* | [**getDefinition**](docs/CustomEntityDefinitionsApi.md#getdefinition) | **GET** /api/customentities/entitytypes/{entityType} | [EARLY ACCESS] GetDefinition: Get a Custom Entity type definition.
*CustomEntityDefinitionsApi* | [**listCustomEntityDefinitions**](docs/CustomEntityDefinitionsApi.md#listcustomentitydefinitions) | **GET** /api/customentities/entitytypes | [EARLY ACCESS] ListCustomEntityDefinitions: List the Custom Entity type definitions
*CustomEntityDefinitionsApi* | [**updateCustomEntityDefinition**](docs/CustomEntityDefinitionsApi.md#updatecustomentitydefinition) | **PUT** /api/customentities/entitytypes/{entityType} | [EARLY ACCESS] UpdateCustomEntityDefinition: Modify an existing Custom Entity type.
*CustomEntityTypesApi* | [**createCustomEntityType**](docs/CustomEntityTypesApi.md#createcustomentitytype) | **POST** /api/customentitytypes | [EARLY ACCESS] CreateCustomEntityType: Define a new Custom Entity Type.
*CustomEntityTypesApi* | [**getCustomEntityType**](docs/CustomEntityTypesApi.md#getcustomentitytype) | **GET** /api/customentitytypes/{entityType} | [EARLY ACCESS] GetCustomEntityType: Get a Custom Entity Type.
*CustomEntityTypesApi* | [**listCustomEntityTypes**](docs/CustomEntityTypesApi.md#listcustomentitytypes) | **GET** /api/customentitytypes | [EARLY ACCESS] ListCustomEntityTypes: List Custom Entity Types.
*CustomEntityTypesApi* | [**updateCustomEntityType**](docs/CustomEntityTypesApi.md#updatecustomentitytype) | **PUT** /api/customentitytypes/{entityType} | [EARLY ACCESS] UpdateCustomEntityType: Modify an existing Custom Entity Type.
*CutLabelDefinitionsApi* | [**createCutLabelDefinition**](docs/CutLabelDefinitionsApi.md#createcutlabeldefinition) | **POST** /api/systemconfiguration/cutlabels | CreateCutLabelDefinition: Create a Cut Label
*CutLabelDefinitionsApi* | [**deleteCutLabelDefinition**](docs/CutLabelDefinitionsApi.md#deletecutlabeldefinition) | **DELETE** /api/systemconfiguration/cutlabels/{code} | DeleteCutLabelDefinition: Delete a Cut Label
*CutLabelDefinitionsApi* | [**getCutLabelDefinition**](docs/CutLabelDefinitionsApi.md#getcutlabeldefinition) | **GET** /api/systemconfiguration/cutlabels/{code} | GetCutLabelDefinition: Get a Cut Label
*CutLabelDefinitionsApi* | [**listCutLabelDefinitions**](docs/CutLabelDefinitionsApi.md#listcutlabeldefinitions) | **GET** /api/systemconfiguration/cutlabels | ListCutLabelDefinitions: List Existing Cut Labels
*CutLabelDefinitionsApi* | [**updateCutLabelDefinition**](docs/CutLabelDefinitionsApi.md#updatecutlabeldefinition) | **PUT** /api/systemconfiguration/cutlabels/{code} | UpdateCutLabelDefinition: Update a Cut Label
*DataTypesApi* | [**createDataType**](docs/DataTypesApi.md#createdatatype) | **POST** /api/datatypes | [EARLY ACCESS] CreateDataType: Create data type definition
*DataTypesApi* | [**deleteDataType**](docs/DataTypesApi.md#deletedatatype) | **DELETE** /api/datatypes/{scope}/{code} | DeleteDataType: Delete a data type definition.
*DataTypesApi* | [**getDataType**](docs/DataTypesApi.md#getdatatype) | **GET** /api/datatypes/{scope}/{code} | GetDataType: Get data type definition
*DataTypesApi* | [**getUnitsFromDataType**](docs/DataTypesApi.md#getunitsfromdatatype) | **GET** /api/datatypes/{scope}/{code}/units | [EARLY ACCESS] GetUnitsFromDataType: Get units from data type
*DataTypesApi* | [**listDataTypeSummaries**](docs/DataTypesApi.md#listdatatypesummaries) | **GET** /api/datatypes | [EARLY ACCESS] ListDataTypeSummaries: List all data type summaries, without the reference data
*DataTypesApi* | [**listDataTypes**](docs/DataTypesApi.md#listdatatypes) | **GET** /api/datatypes/{scope} | ListDataTypes: List data types
*DataTypesApi* | [**updateDataType**](docs/DataTypesApi.md#updatedatatype) | **PUT** /api/datatypes/{scope}/{code} | [EARLY ACCESS] UpdateDataType: Update data type definition
*DataTypesApi* | [**updateReferenceData**](docs/DataTypesApi.md#updatereferencedata) | **PUT** /api/datatypes/{scope}/{code}/referencedata | [EARLY ACCESS] UpdateReferenceData: Update all reference data on a data type, includes the reference values, the field definitions, field values
*DataTypesApi* | [**updateReferenceValues**](docs/DataTypesApi.md#updatereferencevalues) | **PUT** /api/datatypes/{scope}/{code}/referencedatavalues | [EARLY ACCESS] UpdateReferenceValues: Update reference data on a data type
*DerivedTransactionPortfoliosApi* | [**createDerivedPortfolio**](docs/DerivedTransactionPortfoliosApi.md#createderivedportfolio) | **POST** /api/derivedtransactionportfolios/{scope} | CreateDerivedPortfolio: Create derived portfolio
*DerivedTransactionPortfoliosApi* | [**deleteDerivedPortfolioDetails**](docs/DerivedTransactionPortfoliosApi.md#deletederivedportfoliodetails) | **DELETE** /api/derivedtransactionportfolios/{scope}/{code}/details | [EARLY ACCESS] DeleteDerivedPortfolioDetails: Delete derived portfolio details
*EntitiesApi* | [**getCustomEntityByEntityUniqueId**](docs/EntitiesApi.md#getcustomentitybyentityuniqueid) | **GET** /api/entities/customentities/{entityUniqueId} | [EXPERIMENTAL] GetCustomEntityByEntityUniqueId: Get a Custom Entity instance by its EntityUniqueId
*EntitiesApi* | [**getDataTypeByEntityUniqueId**](docs/EntitiesApi.md#getdatatypebyentityuniqueid) | **GET** /api/entities/datatypes/{entityUniqueId} | [EXPERIMENTAL] GetDataTypeByEntityUniqueId: Get DataType by EntityUniqueId
*EntitiesApi* | [**getEntityHistory**](docs/EntitiesApi.md#getentityhistory) | **GET** /api/entities/{entityType}/{entityUniqueId}/history | [EXPERIMENTAL] GetEntityHistory: List an entity's history information
*EntitiesApi* | [**getInstrumentByEntityUniqueId**](docs/EntitiesApi.md#getinstrumentbyentityuniqueid) | **GET** /api/entities/instruments/{entityUniqueId} | [EXPERIMENTAL] GetInstrumentByEntityUniqueId: Get instrument by EntityUniqueId
*EntitiesApi* | [**getPortfolioByEntityUniqueId**](docs/EntitiesApi.md#getportfoliobyentityuniqueid) | **GET** /api/entities/portfolios/{entityUniqueId} | [EXPERIMENTAL] GetPortfolioByEntityUniqueId: Get portfolio by EntityUniqueId
*EntitiesApi* | [**getPortfolioChanges**](docs/EntitiesApi.md#getportfoliochanges) | **GET** /api/entities/changes/portfolios | GetPortfolioChanges: Get the next change to each portfolio in a scope.
*EntitiesApi* | [**getPropertyDefinitionByEntityUniqueId**](docs/EntitiesApi.md#getpropertydefinitionbyentityuniqueid) | **GET** /api/entities/propertydefinitions/{entityUniqueId} | [EXPERIMENTAL] GetPropertyDefinitionByEntityUniqueId: Get property definition by EntityUniqueId
*ExecutionsApi* | [**deleteExecution**](docs/ExecutionsApi.md#deleteexecution) | **DELETE** /api/executions/{scope}/{code} | [EARLY ACCESS] DeleteExecution: Delete execution
*ExecutionsApi* | [**getExecution**](docs/ExecutionsApi.md#getexecution) | **GET** /api/executions/{scope}/{code} | [EARLY ACCESS] GetExecution: Get Execution
*ExecutionsApi* | [**listExecutions**](docs/ExecutionsApi.md#listexecutions) | **GET** /api/executions | ListExecutions: List Executions
*ExecutionsApi* | [**upsertExecutions**](docs/ExecutionsApi.md#upsertexecutions) | **POST** /api/executions | UpsertExecutions: Upsert Execution
*FeeTypesApi* | [**createFeeType**](docs/FeeTypesApi.md#createfeetype) | **POST** /api/feetypes/{scope} | [EXPERIMENTAL] CreateFeeType: Create a FeeType.
*FeeTypesApi* | [**deleteFeeType**](docs/FeeTypesApi.md#deletefeetype) | **DELETE** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] DeleteFeeType: Delete a FeeType.
*FeeTypesApi* | [**getFeeTemplateSpecifications**](docs/FeeTypesApi.md#getfeetemplatespecifications) | **GET** /api/feetypes/feetransactiontemplatespecification | [EXPERIMENTAL] GetFeeTemplateSpecifications: Get FeeTemplateSpecifications used in the FeeType.
*FeeTypesApi* | [**getFeeType**](docs/FeeTypesApi.md#getfeetype) | **GET** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] GetFeeType: Get a FeeType
*FeeTypesApi* | [**listFeeTypes**](docs/FeeTypesApi.md#listfeetypes) | **GET** /api/feetypes | [EXPERIMENTAL] ListFeeTypes: List FeeTypes
*FeeTypesApi* | [**updateFeeType**](docs/FeeTypesApi.md#updatefeetype) | **PUT** /api/feetypes/{scope}/{code} | [EXPERIMENTAL] UpdateFeeType: Update a FeeType.
*FundConfigurationApi* | [**createFundConfiguration**](docs/FundConfigurationApi.md#createfundconfiguration) | **POST** /api/fundconfigurations/{scope} | [EXPERIMENTAL] CreateFundConfiguration: Create a FundConfiguration.
*FundConfigurationApi* | [**deleteFundConfiguration**](docs/FundConfigurationApi.md#deletefundconfiguration) | **DELETE** /api/fundconfigurations/{scope}/{code} | [EXPERIMENTAL] DeleteFundConfiguration: Delete a FundConfiguration.
*FundConfigurationApi* | [**getFundConfiguration**](docs/FundConfigurationApi.md#getfundconfiguration) | **GET** /api/fundconfigurations/{scope}/{code} | [EXPERIMENTAL] GetFundConfiguration: Get FundConfiguration.
*FundConfigurationApi* | [**listFundConfigurations**](docs/FundConfigurationApi.md#listfundconfigurations) | **GET** /api/fundconfigurations | [EXPERIMENTAL] ListFundConfigurations: List FundConfiguration.
*FundConfigurationApi* | [**patchFundConfiguration**](docs/FundConfigurationApi.md#patchfundconfiguration) | **PATCH** /api/fundconfigurations/{scope}/{code} | [EXPERIMENTAL] PatchFundConfiguration: Patch Fund Configuration.
*FundConfigurationApi* | [**upsertFundConfigurationProperties**](docs/FundConfigurationApi.md#upsertfundconfigurationproperties) | **POST** /api/fundconfigurations/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertFundConfigurationProperties: Upsert FundConfiguration properties
*FundsApi* | [**acceptEstimateValuationPoint**](docs/FundsApi.md#acceptestimatevaluationpoint) | **POST** /api/funds/{scope}/{code}/valuationpoints/$acceptestimate | [EXPERIMENTAL] AcceptEstimateValuationPoint: Accepts an Estimate Valuation Point.
*FundsApi* | [**createFee**](docs/FundsApi.md#createfee) | **POST** /api/funds/{scope}/{code}/fees | [EXPERIMENTAL] CreateFee: Create a Fee.
*FundsApi* | [**createFund**](docs/FundsApi.md#createfund) | **POST** /api/funds/{scope} | [EXPERIMENTAL] CreateFund: Create a Fund.
*FundsApi* | [**deleteFee**](docs/FundsApi.md#deletefee) | **DELETE** /api/funds/{scope}/{code}/fees/{feeCode} | [EXPERIMENTAL] DeleteFee: Delete a Fee.
*FundsApi* | [**deleteFund**](docs/FundsApi.md#deletefund) | **DELETE** /api/funds/{scope}/{code} | [EXPERIMENTAL] DeleteFund: Delete a Fund.
*FundsApi* | [**deleteValuationPoint**](docs/FundsApi.md#deletevaluationpoint) | **DELETE** /api/funds/{scope}/{code}/valuationpoints/{diaryEntryCode} | [EXPERIMENTAL] DeleteValuationPoint: Delete a Valuation Point.
*FundsApi* | [**finaliseCandidateValuationPoint**](docs/FundsApi.md#finalisecandidatevaluationpoint) | **POST** /api/funds/{scope}/{code}/valuationpoints/$finalisecandidate | [EXPERIMENTAL] FinaliseCandidateValuationPoint: Finalise Candidate.
*FundsApi* | [**getFee**](docs/FundsApi.md#getfee) | **GET** /api/funds/{scope}/{code}/fees/{feeCode} | [EXPERIMENTAL] GetFee: Get a Fee for a specified Fund.
*FundsApi* | [**getFund**](docs/FundsApi.md#getfund) | **GET** /api/funds/{scope}/{code} | [EXPERIMENTAL] GetFund: Get a Fund.
*FundsApi* | [**getValuationPointData**](docs/FundsApi.md#getvaluationpointdata) | **POST** /api/funds/{scope}/{code}/valuationpoints/$query | [EXPERIMENTAL] GetValuationPointData: Get Valuation Point Data for a Fund.
*FundsApi* | [**getValuationPointJournalEntryLines**](docs/FundsApi.md#getvaluationpointjournalentrylines) | **POST** /api/funds/{scope}/{code}/valuationpoints/journalentrylines/$query | [EXPERIMENTAL] GetValuationPointJournalEntryLines: Get the Journal Entry lines for the given Fund.
*FundsApi* | [**getValuationPointTrialBalance**](docs/FundsApi.md#getvaluationpointtrialbalance) | **POST** /api/funds/{scope}/{code}/valuationpoints/trialbalance/$query | [EXPERIMENTAL] GetValuationPointTrialBalance: Get Trial Balance for the given Fund.
*FundsApi* | [**listFees**](docs/FundsApi.md#listfees) | **GET** /api/funds/{scope}/{code}/fees | [EXPERIMENTAL] ListFees: List Fees for a specified Fund.
*FundsApi* | [**listFunds**](docs/FundsApi.md#listfunds) | **GET** /api/funds | [EXPERIMENTAL] ListFunds: List Funds.
*FundsApi* | [**listValuationPointOverview**](docs/FundsApi.md#listvaluationpointoverview) | **GET** /api/funds/{scope}/{code}/valuationPointOverview | [EXPERIMENTAL] ListValuationPointOverview: List Valuation Points Overview for a given Fund.
*FundsApi* | [**patchFee**](docs/FundsApi.md#patchfee) | **PATCH** /api/funds/{scope}/{code}/fees/{feeCode} | [EXPERIMENTAL] PatchFee: Patch Fee.
*FundsApi* | [**patchFund**](docs/FundsApi.md#patchfund) | **PATCH** /api/funds/{scope}/{code} | [EXPERIMENTAL] PatchFund: Patch a Fund.
*FundsApi* | [**setShareClassInstruments**](docs/FundsApi.md#setshareclassinstruments) | **PUT** /api/funds/{scope}/{code}/shareclasses | [EXPERIMENTAL] SetShareClassInstruments: Set the ShareClass Instruments on a fund.
*FundsApi* | [**upsertDiaryEntryTypeValuationPoint**](docs/FundsApi.md#upsertdiaryentrytypevaluationpoint) | **POST** /api/funds/{scope}/{code}/valuationpoints | [EXPERIMENTAL] UpsertDiaryEntryTypeValuationPoint: Upsert Valuation Point.
*FundsApi* | [**upsertFeeProperties**](docs/FundsApi.md#upsertfeeproperties) | **POST** /api/funds/{scope}/{code}/fees/{feeCode}/properties/$upsert | [EXPERIMENTAL] UpsertFeeProperties: Upsert Fee properties.
*FundsApi* | [**upsertFundProperties**](docs/FundsApi.md#upsertfundproperties) | **POST** /api/funds/{scope}/{code}/properties/$upsert | [EXPERIMENTAL] UpsertFundProperties: Upsert Fund properties.
*GroupReconciliationsApi* | [**batchUpdateComparisonResults**](docs/GroupReconciliationsApi.md#batchupdatecomparisonresults) | **POST** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code}/comparisonresults/$batchReview | [EXPERIMENTAL] BatchUpdateComparisonResults: Add User Review entries for a range of comparison results related to a specific GroupReconciliationDefinition.
*GroupReconciliationsApi* | [**createComparisonRuleset**](docs/GroupReconciliationsApi.md#createcomparisonruleset) | **POST** /api/reconciliations/comparisonrulesets | [EXPERIMENTAL] CreateComparisonRuleset: Create a Group Reconciliation Comparison Ruleset
*GroupReconciliationsApi* | [**createGroupReconciliationDefinition**](docs/GroupReconciliationsApi.md#creategroupreconciliationdefinition) | **POST** /api/reconciliations/groupreconciliationdefinitions | [EXPERIMENTAL] CreateGroupReconciliationDefinition: Create Group Reconciliation Definition
*GroupReconciliationsApi* | [**deleteComparisonRuleset**](docs/GroupReconciliationsApi.md#deletecomparisonruleset) | **DELETE** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] DeleteComparisonRuleset: Deletes a particular Group Reconciliation Comparison Ruleset
*GroupReconciliationsApi* | [**deleteGroupReconciliationDefinition**](docs/GroupReconciliationsApi.md#deletegroupreconciliationdefinition) | **DELETE** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteGroupReconciliationDefinition: Delete Group Reconciliation Definition
*GroupReconciliationsApi* | [**getComparisonResult**](docs/GroupReconciliationsApi.md#getcomparisonresult) | **GET** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code}/{resultId} | [EXPERIMENTAL] GetComparisonResult: Get a single Group Reconciliation Comparison Result by scope and code.
*GroupReconciliationsApi* | [**getComparisonRuleset**](docs/GroupReconciliationsApi.md#getcomparisonruleset) | **GET** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] GetComparisonRuleset: Get a single Group Reconciliation Comparison Ruleset by scope and code.
*GroupReconciliationsApi* | [**getGroupReconciliationDefinition**](docs/GroupReconciliationsApi.md#getgroupreconciliationdefinition) | **GET** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code} | [EXPERIMENTAL] GetGroupReconciliationDefinition: Get group reconciliation definition
*GroupReconciliationsApi* | [**listComparisonResults**](docs/GroupReconciliationsApi.md#listcomparisonresults) | **GET** /api/reconciliations/comparisonresults | [EXPERIMENTAL] ListComparisonResults: Get a set of Group Reconciliation Comparison Results.
*GroupReconciliationsApi* | [**listComparisonRulesets**](docs/GroupReconciliationsApi.md#listcomparisonrulesets) | **GET** /api/reconciliations/comparisonrulesets | [EXPERIMENTAL] ListComparisonRulesets: Get a set of Group Reconciliation Comparison Rulesets
*GroupReconciliationsApi* | [**listGroupReconciliationDefinitions**](docs/GroupReconciliationsApi.md#listgroupreconciliationdefinitions) | **GET** /api/reconciliations/groupreconciliationdefinitions | [EXPERIMENTAL] ListGroupReconciliationDefinitions: List group reconciliation definitions
*GroupReconciliationsApi* | [**runReconciliation**](docs/GroupReconciliationsApi.md#runreconciliation) | **POST** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code}/$run | [EXPERIMENTAL] RunReconciliation: Runs a Group Reconciliation
*GroupReconciliationsApi* | [**updateComparisonRuleset**](docs/GroupReconciliationsApi.md#updatecomparisonruleset) | **PUT** /api/reconciliations/comparisonrulesets/{scope}/{code} | [EXPERIMENTAL] UpdateComparisonRuleset: Update Group Reconciliation Comparison Ruleset defined by scope and code
*GroupReconciliationsApi* | [**updateGroupReconciliationDefinition**](docs/GroupReconciliationsApi.md#updategroupreconciliationdefinition) | **PUT** /api/reconciliations/groupreconciliationdefinitions/{scope}/{code} | [EXPERIMENTAL] UpdateGroupReconciliationDefinition: Update group reconciliation definition
*InstrumentEventTypesApi* | [**createTransactionTemplate**](docs/InstrumentEventTypesApi.md#createtransactiontemplate) | **POST** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] CreateTransactionTemplate: Create Transaction Template
*InstrumentEventTypesApi* | [**deleteTransactionTemplate**](docs/InstrumentEventTypesApi.md#deletetransactiontemplate) | **DELETE** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] DeleteTransactionTemplate: Delete Transaction Template
*InstrumentEventTypesApi* | [**getTransactionTemplate**](docs/InstrumentEventTypesApi.md#gettransactiontemplate) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] GetTransactionTemplate: Get Transaction Template
*InstrumentEventTypesApi* | [**getTransactionTemplateSpecification**](docs/InstrumentEventTypesApi.md#gettransactiontemplatespecification) | **GET** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplatespecification | [EXPERIMENTAL] GetTransactionTemplateSpecification: Get Transaction Template Specification.
*InstrumentEventTypesApi* | [**listTransactionTemplateSpecifications**](docs/InstrumentEventTypesApi.md#listtransactiontemplatespecifications) | **GET** /api/instrumenteventtypes/transactiontemplatespecifications | [EXPERIMENTAL] ListTransactionTemplateSpecifications: List Transaction Template Specifications.
*InstrumentEventTypesApi* | [**listTransactionTemplates**](docs/InstrumentEventTypesApi.md#listtransactiontemplates) | **GET** /api/instrumenteventtypes/transactiontemplates | [EXPERIMENTAL] ListTransactionTemplates: List Transaction Templates
*InstrumentEventTypesApi* | [**updateTransactionTemplate**](docs/InstrumentEventTypesApi.md#updatetransactiontemplate) | **PUT** /api/instrumenteventtypes/{instrumentEventType}/transactiontemplates/{instrumentType}/{scope} | [EXPERIMENTAL] UpdateTransactionTemplate: Update Transaction Template
*InstrumentEventsApi* | [**queryApplicableInstrumentEvents**](docs/InstrumentEventsApi.md#queryapplicableinstrumentevents) | **POST** /api/instrumentevents/$queryApplicableInstrumentEvents | [EXPERIMENTAL] QueryApplicableInstrumentEvents: Returns a list of applicable instrument events based on the holdings of the portfolios and date range specified in the query.
*InstrumentEventsApi* | [**queryBucketedCashFlows**](docs/InstrumentEventsApi.md#querybucketedcashflows) | **POST** /api/instrumentevents/$queryBucketedCashFlows | QueryBucketedCashFlows: Returns bucketed cashflows based on the holdings of the portfolios and date range specified in the query.
*InstrumentEventsApi* | [**queryCashFlows**](docs/InstrumentEventsApi.md#querycashflows) | **POST** /api/instrumentevents/$queryCashFlows | [EXPERIMENTAL] QueryCashFlows: Returns a list of cashflows based on the holdings of the portfolios and date range specified in the query.
*InstrumentEventsApi* | [**queryInstrumentEvents**](docs/InstrumentEventsApi.md#queryinstrumentevents) | **POST** /api/instrumentevents/$query | [EARLY ACCESS] QueryInstrumentEvents: Returns a list of instrument events based on the holdings of the portfolios and date range specified in the query.
*InstrumentEventsApi* | [**queryTradeTickets**](docs/InstrumentEventsApi.md#querytradetickets) | **POST** /api/instrumentevents/$queryTradeTickets | [EXPERIMENTAL] QueryTradeTickets: Returns a list of trade tickets based on the holdings of the portfolios and date range specified in the query.
*InstrumentsApi* | [**batchUpsertInstrumentProperties**](docs/InstrumentsApi.md#batchupsertinstrumentproperties) | **POST** /api/instruments/$batchupsertproperties | BatchUpsertInstrumentProperties: Batch upsert instruments properties
*InstrumentsApi* | [**calculateSettlementDate**](docs/InstrumentsApi.md#calculatesettlementdate) | **GET** /api/instruments/{identifierType}/{identifier}/settlementdate | [EARLY ACCESS] CalculateSettlementDate: Get the settlement date for an instrument.
*InstrumentsApi* | [**deleteInstrument**](docs/InstrumentsApi.md#deleteinstrument) | **DELETE** /api/instruments/{identifierType}/{identifier} | DeleteInstrument: Soft delete a single instrument
*InstrumentsApi* | [**deleteInstrumentProperties**](docs/InstrumentsApi.md#deleteinstrumentproperties) | **POST** /api/instruments/{identifierType}/{identifier}/properties/$delete | [EARLY ACCESS] DeleteInstrumentProperties: Delete instrument properties
*InstrumentsApi* | [**deleteInstruments**](docs/InstrumentsApi.md#deleteinstruments) | **POST** /api/instruments/$delete | DeleteInstruments: Soft or hard delete multiple instruments
*InstrumentsApi* | [**getAllPossibleFeatures**](docs/InstrumentsApi.md#getallpossiblefeatures) | **GET** /api/instruments/{instrumentType}/allfeatures | [EXPERIMENTAL] GetAllPossibleFeatures: Provides list of all possible features for instrument type.
*InstrumentsApi* | [**getExistingInstrumentCapabilities**](docs/InstrumentsApi.md#getexistinginstrumentcapabilities) | **GET** /api/instruments/{identifier}/capabilities | [EXPERIMENTAL] GetExistingInstrumentCapabilities: Retrieve capabilities of an existing instrument identified by LUID. These include instrument features, and if model is provided it also includes supported address keys and economic dependencies.  Given an lusid instrument id provides instrument capabilities, outlining features, and, given the model, the capabilities also include supported addresses as well as economic dependencies.
*InstrumentsApi* | [**getExistingInstrumentModels**](docs/InstrumentsApi.md#getexistinginstrumentmodels) | **GET** /api/instruments/{identifier}/models | GetExistingInstrumentModels: Retrieve supported pricing models for an existing instrument identified by LUID.
*InstrumentsApi* | [**getInstrument**](docs/InstrumentsApi.md#getinstrument) | **GET** /api/instruments/{identifierType}/{identifier} | GetInstrument: Get instrument
*InstrumentsApi* | [**getInstrumentIdentifierTypes**](docs/InstrumentsApi.md#getinstrumentidentifiertypes) | **GET** /api/instruments/identifierTypes | GetInstrumentIdentifierTypes: Get instrument identifier types
*InstrumentsApi* | [**getInstrumentPaymentDiary**](docs/InstrumentsApi.md#getinstrumentpaymentdiary) | **GET** /api/instruments/{identifierType}/{identifier}/paymentdiary | [EXPERIMENTAL] GetInstrumentPaymentDiary: Get instrument payment diary
*InstrumentsApi* | [**getInstrumentProperties**](docs/InstrumentsApi.md#getinstrumentproperties) | **GET** /api/instruments/{identifierType}/{identifier}/properties | GetInstrumentProperties: Get instrument properties
*InstrumentsApi* | [**getInstrumentPropertyTimeSeries**](docs/InstrumentsApi.md#getinstrumentpropertytimeseries) | **GET** /api/instruments/{identifierType}/{identifier}/properties/time-series | GetInstrumentPropertyTimeSeries: Get instrument property time series
*InstrumentsApi* | [**getInstrumentRelationships**](docs/InstrumentsApi.md#getinstrumentrelationships) | **GET** /api/instruments/{identifierType}/{identifier}/relationships | [EARLY ACCESS] GetInstrumentRelationships: Get Instrument relationships
*InstrumentsApi* | [**getInstruments**](docs/InstrumentsApi.md#getinstruments) | **POST** /api/instruments/$get | GetInstruments: Get instruments
*InstrumentsApi* | [**listInstrumentProperties**](docs/InstrumentsApi.md#listinstrumentproperties) | **GET** /api/instruments/{identifierType}/{identifier}/properties/list | [EARLY ACCESS] ListInstrumentProperties: Get instrument properties (with Pagination)
*InstrumentsApi* | [**listInstruments**](docs/InstrumentsApi.md#listinstruments) | **GET** /api/instruments | ListInstruments: List instruments
*InstrumentsApi* | [**queryInstrumentCapabilities**](docs/InstrumentsApi.md#queryinstrumentcapabilities) | **POST** /api/instruments/capabilities | [EXPERIMENTAL] QueryInstrumentCapabilities: Query capabilities of a particular instrument in advance of creating it. These include instrument features, and if model is provided it also includes supported address keys and economic dependencies.
*InstrumentsApi* | [**updateInstrumentIdentifier**](docs/InstrumentsApi.md#updateinstrumentidentifier) | **POST** /api/instruments/{identifierType}/{identifier} | UpdateInstrumentIdentifier: Update instrument identifier
*InstrumentsApi* | [**upsertInstruments**](docs/InstrumentsApi.md#upsertinstruments) | **POST** /api/instruments | UpsertInstruments: Upsert instruments
*InstrumentsApi* | [**upsertInstrumentsProperties**](docs/InstrumentsApi.md#upsertinstrumentsproperties) | **POST** /api/instruments/$upsertproperties | UpsertInstrumentsProperties: Upsert instruments properties
*LegacyComplianceApi* | [**deleteLegacyComplianceRule**](docs/LegacyComplianceApi.md#deletelegacycompliancerule) | **DELETE** /api/legacy/compliance/rules/{scope}/{code} | [EXPERIMENTAL] DeleteLegacyComplianceRule: Deletes a compliance rule.
*LegacyComplianceApi* | [**getLegacyBreachedOrdersInfo**](docs/LegacyComplianceApi.md#getlegacybreachedordersinfo) | **GET** /api/legacy/compliance/runs/breached/{runId} | [EXPERIMENTAL] GetLegacyBreachedOrdersInfo: Get the Ids of Breached orders in a given compliance run and the corresponding list of rules that could have caused it.
*LegacyComplianceApi* | [**getLegacyComplianceRule**](docs/LegacyComplianceApi.md#getlegacycompliancerule) | **GET** /api/legacy/compliance/rules/{scope}/{code} | [EXPERIMENTAL] GetLegacyComplianceRule: Retrieve the definition of single compliance rule.
*LegacyComplianceApi* | [**getLegacyComplianceRunResults**](docs/LegacyComplianceApi.md#getlegacycompliancerunresults) | **GET** /api/legacy/compliance/runs/{runId} | [EXPERIMENTAL] GetLegacyComplianceRunResults: Get the details of a single compliance run.
*LegacyComplianceApi* | [**listLegacyComplianceRules**](docs/LegacyComplianceApi.md#listlegacycompliancerules) | **GET** /api/legacy/compliance/rules | [EXPERIMENTAL] ListLegacyComplianceRules: List compliance rules, with optional filtering.
*LegacyComplianceApi* | [**listLegacyComplianceRunInfo**](docs/LegacyComplianceApi.md#listlegacycomplianceruninfo) | **GET** /api/legacy/compliance/runs | [EXPERIMENTAL] ListLegacyComplianceRunInfo: List historical compliance run ids.
*LegacyComplianceApi* | [**runLegacyCompliance**](docs/LegacyComplianceApi.md#runlegacycompliance) | **POST** /api/legacy/compliance/runs | [EXPERIMENTAL] RunLegacyCompliance: Kick off the compliance check process
*LegacyComplianceApi* | [**upsertLegacyComplianceRules**](docs/LegacyComplianceApi.md#upsertlegacycompliancerules) | **POST** /api/legacy/compliance/rules | [EXPERIMENTAL] UpsertLegacyComplianceRules: Upsert compliance rules.
*LegalEntitiesApi* | [**deleteLegalEntity**](docs/LegalEntitiesApi.md#deletelegalentity) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | DeleteLegalEntity: Delete Legal Entity
*LegalEntitiesApi* | [**deleteLegalEntityAccessMetadata**](docs/LegalEntitiesApi.md#deletelegalentityaccessmetadata) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | DeleteLegalEntityAccessMetadata: Delete a Legal Entity Access Metadata entry
*LegalEntitiesApi* | [**deleteLegalEntityIdentifiers**](docs/LegalEntitiesApi.md#deletelegalentityidentifiers) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] DeleteLegalEntityIdentifiers: Delete Legal Entity Identifiers
*LegalEntitiesApi* | [**deleteLegalEntityProperties**](docs/LegalEntitiesApi.md#deletelegalentityproperties) | **DELETE** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] DeleteLegalEntityProperties: Delete Legal Entity Properties
*LegalEntitiesApi* | [**getAllLegalEntityAccessMetadata**](docs/LegalEntitiesApi.md#getalllegalentityaccessmetadata) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata | GetAllLegalEntityAccessMetadata: Get Access Metadata rules for a Legal Entity
*LegalEntitiesApi* | [**getLegalEntity**](docs/LegalEntitiesApi.md#getlegalentity) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code} | GetLegalEntity: Get Legal Entity
*LegalEntitiesApi* | [**getLegalEntityAccessMetadataByKey**](docs/LegalEntitiesApi.md#getlegalentityaccessmetadatabykey) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetLegalEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Legal Entity
*LegalEntitiesApi* | [**getLegalEntityPropertyTimeSeries**](docs/LegalEntitiesApi.md#getlegalentitypropertytimeseries) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties/time-series | GetLegalEntityPropertyTimeSeries: Get Legal Entity Property Time Series
*LegalEntitiesApi* | [**getLegalEntityRelations**](docs/LegalEntitiesApi.md#getlegalentityrelations) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/relations | GetLegalEntityRelations: Get Relations for Legal Entity
*LegalEntitiesApi* | [**getLegalEntityRelationships**](docs/LegalEntitiesApi.md#getlegalentityrelationships) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/relationships | GetLegalEntityRelationships: Get Relationships for Legal Entity
*LegalEntitiesApi* | [**listAllLegalEntities**](docs/LegalEntitiesApi.md#listalllegalentities) | **GET** /api/legalentities | ListAllLegalEntities: List Legal Entities
*LegalEntitiesApi* | [**listLegalEntities**](docs/LegalEntitiesApi.md#listlegalentities) | **GET** /api/legalentities/{idTypeScope}/{idTypeCode} | ListLegalEntities: List Legal Entities
*LegalEntitiesApi* | [**patchLegalEntityAccessMetadata**](docs/LegalEntitiesApi.md#patchlegalentityaccessmetadata) | **PATCH** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] PatchLegalEntityAccessMetadata: Patch Access Metadata rules for a Legal Entity.
*LegalEntitiesApi* | [**setLegalEntityIdentifiers**](docs/LegalEntitiesApi.md#setlegalentityidentifiers) | **POST** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] SetLegalEntityIdentifiers: Set Legal Entity Identifiers
*LegalEntitiesApi* | [**setLegalEntityProperties**](docs/LegalEntitiesApi.md#setlegalentityproperties) | **POST** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/properties | SetLegalEntityProperties: Set Legal Entity Properties
*LegalEntitiesApi* | [**upsertLegalEntities**](docs/LegalEntitiesApi.md#upsertlegalentities) | **POST** /api/legalentities/$batchUpsert | [EARLY ACCESS] UpsertLegalEntities: Pluralised upsert of Legal Entities
*LegalEntitiesApi* | [**upsertLegalEntity**](docs/LegalEntitiesApi.md#upsertlegalentity) | **POST** /api/legalentities | UpsertLegalEntity: Upsert Legal Entity
*LegalEntitiesApi* | [**upsertLegalEntityAccessMetadata**](docs/LegalEntitiesApi.md#upsertlegalentityaccessmetadata) | **PUT** /api/legalentities/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | UpsertLegalEntityAccessMetadata: Upsert a Legal Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
*OrderGraphApi* | [**listOrderGraphBlocks**](docs/OrderGraphApi.md#listordergraphblocks) | **GET** /api/ordergraph/blocks | ListOrderGraphBlocks: Lists blocks that pass the filter provided, and builds a summary picture of the state of their associated order entities.
*OrderGraphApi* | [**listOrderGraphPlacementChildren**](docs/OrderGraphApi.md#listordergraphplacementchildren) | **GET** /api/ordergraph/placementchildren/{scope}/{code} | [EARLY ACCESS] ListOrderGraphPlacementChildren: Lists all placements for the parent placement specified by the scope and code, and builds a summary picture of the state of their associated order entities.
*OrderGraphApi* | [**listOrderGraphPlacements**](docs/OrderGraphApi.md#listordergraphplacements) | **GET** /api/ordergraph/placements | ListOrderGraphPlacements: Lists placements that pass the filter provided, and builds a summary picture of the state of their associated order entities.
*OrderInstructionsApi* | [**deleteOrderInstruction**](docs/OrderInstructionsApi.md#deleteorderinstruction) | **DELETE** /api/orderinstructions/{scope}/{code} | [EXPERIMENTAL] DeleteOrderInstruction: Delete orderInstruction
*OrderInstructionsApi* | [**getOrderInstruction**](docs/OrderInstructionsApi.md#getorderinstruction) | **GET** /api/orderinstructions/{scope}/{code} | [EXPERIMENTAL] GetOrderInstruction: Get OrderInstruction
*OrderInstructionsApi* | [**listOrderInstructions**](docs/OrderInstructionsApi.md#listorderinstructions) | **GET** /api/orderinstructions | [EXPERIMENTAL] ListOrderInstructions: List OrderInstructions
*OrderInstructionsApi* | [**upsertOrderInstructions**](docs/OrderInstructionsApi.md#upsertorderinstructions) | **POST** /api/orderinstructions | [EXPERIMENTAL] UpsertOrderInstructions: Upsert OrderInstruction
*OrderManagementApi* | [**bookTransactions**](docs/OrderManagementApi.md#booktransactions) | **POST** /api/ordermanagement/booktransactions | [EXPERIMENTAL] BookTransactions: Books transactions using specific allocations as a source.
*OrderManagementApi* | [**cancelOrders**](docs/OrderManagementApi.md#cancelorders) | **POST** /api/ordermanagement/cancelorders | [EARLY ACCESS] CancelOrders: Cancel existing orders
*OrderManagementApi* | [**cancelOrdersAndMoveRemaining**](docs/OrderManagementApi.md#cancelordersandmoveremaining) | **POST** /api/ordermanagement/cancelordersandmoveremaining | [EARLY ACCESS] CancelOrdersAndMoveRemaining: Cancel existing orders and move any unplaced quantities to new orders in new blocks
*OrderManagementApi* | [**cancelPlacements**](docs/OrderManagementApi.md#cancelplacements) | **POST** /api/ordermanagement/$cancelplacements | [EARLY ACCESS] CancelPlacements: Cancel existing placements
*OrderManagementApi* | [**createOrders**](docs/OrderManagementApi.md#createorders) | **POST** /api/ordermanagement/createorders | [EARLY ACCESS] CreateOrders: Upsert a Block and associated orders
*OrderManagementApi* | [**getOrderHistory**](docs/OrderManagementApi.md#getorderhistory) | **GET** /api/ordermanagement/order/{scope}/{code}/$history | [EXPERIMENTAL] GetOrderHistory: Get the history of an order and related entity changes
*OrderManagementApi* | [**moveOrders**](docs/OrderManagementApi.md#moveorders) | **POST** /api/ordermanagement/moveorders | [EARLY ACCESS] MoveOrders: Move orders to new or existing block
*OrderManagementApi* | [**placeBlocks**](docs/OrderManagementApi.md#placeblocks) | **POST** /api/ordermanagement/placeblocks | [EARLY ACCESS] PlaceBlocks: Places blocks for a given list of placement requests.
*OrderManagementApi* | [**runAllocationService**](docs/OrderManagementApi.md#runallocationservice) | **POST** /api/ordermanagement/allocate | [EXPERIMENTAL] RunAllocationService: Runs the Allocation Service
*OrderManagementApi* | [**updateOrders**](docs/OrderManagementApi.md#updateorders) | **POST** /api/ordermanagement/updateorders | [EARLY ACCESS] UpdateOrders: Update existing orders
*OrderManagementApi* | [**updatePlacements**](docs/OrderManagementApi.md#updateplacements) | **POST** /api/ordermanagement/$updateplacements | [EARLY ACCESS] UpdatePlacements: Update existing placements
*OrdersApi* | [**deleteOrder**](docs/OrdersApi.md#deleteorder) | **DELETE** /api/orders/{scope}/{code} | [EARLY ACCESS] DeleteOrder: Delete order
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getorder) | **GET** /api/orders/{scope}/{code} | [EARLY ACCESS] GetOrder: Get Order
*OrdersApi* | [**listOrders**](docs/OrdersApi.md#listorders) | **GET** /api/orders | ListOrders: List Orders
*OrdersApi* | [**upsertOrders**](docs/OrdersApi.md#upsertorders) | **POST** /api/orders | UpsertOrders: Upsert Order
*PackagesApi* | [**deletePackage**](docs/PackagesApi.md#deletepackage) | **DELETE** /api/packages/{scope}/{code} | [EXPERIMENTAL] DeletePackage: Delete package
*PackagesApi* | [**getPackage**](docs/PackagesApi.md#getpackage) | **GET** /api/packages/{scope}/{code} | [EXPERIMENTAL] GetPackage: Get Package
*PackagesApi* | [**listPackages**](docs/PackagesApi.md#listpackages) | **GET** /api/packages | [EXPERIMENTAL] ListPackages: List Packages
*PackagesApi* | [**upsertPackages**](docs/PackagesApi.md#upsertpackages) | **POST** /api/packages | [EXPERIMENTAL] UpsertPackages: Upsert Package
*ParticipationsApi* | [**deleteParticipation**](docs/ParticipationsApi.md#deleteparticipation) | **DELETE** /api/participations/{scope}/{code} | [EARLY ACCESS] DeleteParticipation: Delete participation
*ParticipationsApi* | [**getParticipation**](docs/ParticipationsApi.md#getparticipation) | **GET** /api/participations/{scope}/{code} | [EARLY ACCESS] GetParticipation: Get Participation
*ParticipationsApi* | [**listParticipations**](docs/ParticipationsApi.md#listparticipations) | **GET** /api/participations | [EARLY ACCESS] ListParticipations: List Participations
*ParticipationsApi* | [**upsertParticipations**](docs/ParticipationsApi.md#upsertparticipations) | **POST** /api/participations | [EARLY ACCESS] UpsertParticipations: Upsert Participation
*PersonsApi* | [**deletePerson**](docs/PersonsApi.md#deleteperson) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code} | DeletePerson: Delete person
*PersonsApi* | [**deletePersonAccessMetadata**](docs/PersonsApi.md#deletepersonaccessmetadata) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry
*PersonsApi* | [**deletePersonIdentifiers**](docs/PersonsApi.md#deletepersonidentifiers) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] DeletePersonIdentifiers: Delete Person Identifiers
*PersonsApi* | [**deletePersonProperties**](docs/PersonsApi.md#deletepersonproperties) | **DELETE** /api/persons/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] DeletePersonProperties: Delete Person Properties
*PersonsApi* | [**getAllPersonAccessMetadata**](docs/PersonsApi.md#getallpersonaccessmetadata) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person
*PersonsApi* | [**getPerson**](docs/PersonsApi.md#getperson) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code} | [EARLY ACCESS] GetPerson: Get Person
*PersonsApi* | [**getPersonAccessMetadataByKey**](docs/PersonsApi.md#getpersonaccessmetadatabykey) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person
*PersonsApi* | [**getPersonPropertyTimeSeries**](docs/PersonsApi.md#getpersonpropertytimeseries) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/properties/time-series | [EARLY ACCESS] GetPersonPropertyTimeSeries: Get Person Property Time Series
*PersonsApi* | [**getPersonRelations**](docs/PersonsApi.md#getpersonrelations) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/relations | [EARLY ACCESS] GetPersonRelations: Get Relations for Person
*PersonsApi* | [**getPersonRelationships**](docs/PersonsApi.md#getpersonrelationships) | **GET** /api/persons/{idTypeScope}/{idTypeCode}/{code}/relationships | [EARLY ACCESS] GetPersonRelationships: Get Relationships for Person
*PersonsApi* | [**listAllPersons**](docs/PersonsApi.md#listallpersons) | **GET** /api/persons | [EARLY ACCESS] ListAllPersons: List All Persons
*PersonsApi* | [**listPersons**](docs/PersonsApi.md#listpersons) | **GET** /api/persons/{idTypeScope}/{idTypeCode} | [EARLY ACCESS] ListPersons: List Persons
*PersonsApi* | [**patchPersonAccessMetadata**](docs/PersonsApi.md#patchpersonaccessmetadata) | **PATCH** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata | [EARLY ACCESS] PatchPersonAccessMetadata: Patch Access Metadata rules for a Person.
*PersonsApi* | [**setPersonIdentifiers**](docs/PersonsApi.md#setpersonidentifiers) | **POST** /api/persons/{idTypeScope}/{idTypeCode}/{code}/identifiers | [EARLY ACCESS] SetPersonIdentifiers: Set Person Identifiers
*PersonsApi* | [**setPersonProperties**](docs/PersonsApi.md#setpersonproperties) | **POST** /api/persons/{idTypeScope}/{idTypeCode}/{code}/properties | [EARLY ACCESS] SetPersonProperties: Set Person Properties
*PersonsApi* | [**upsertPerson**](docs/PersonsApi.md#upsertperson) | **POST** /api/persons | UpsertPerson: Upsert Person
*PersonsApi* | [**upsertPersonAccessMetadata**](docs/PersonsApi.md#upsertpersonaccessmetadata) | **PUT** /api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey} | [EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
*PersonsApi* | [**upsertPersons**](docs/PersonsApi.md#upsertpersons) | **POST** /api/persons/$batchUpsert | [EARLY ACCESS] UpsertPersons: Pluralised Upsert of Persons
*PlacementsApi* | [**deletePlacement**](docs/PlacementsApi.md#deleteplacement) | **DELETE** /api/placements/{scope}/{code} | [EARLY ACCESS] DeletePlacement: Delete placement
*PlacementsApi* | [**getPlacement**](docs/PlacementsApi.md#getplacement) | **GET** /api/placements/{scope}/{code} | [EARLY ACCESS] GetPlacement: Get Placement
*PlacementsApi* | [**listPlacements**](docs/PlacementsApi.md#listplacements) | **GET** /api/placements | [EARLY ACCESS] ListPlacements: List Placements
*PlacementsApi* | [**upsertPlacements**](docs/PlacementsApi.md#upsertplacements) | **POST** /api/placements | [EARLY ACCESS] UpsertPlacements: Upsert Placement
*PortfolioGroupsApi* | [**addPortfolioToGroup**](docs/PortfolioGroupsApi.md#addportfoliotogroup) | **POST** /api/portfoliogroups/{scope}/{code}/portfolios | [EARLY ACCESS] AddPortfolioToGroup: Add portfolio to group
*PortfolioGroupsApi* | [**addSubGroupToGroup**](docs/PortfolioGroupsApi.md#addsubgrouptogroup) | **POST** /api/portfoliogroups/{scope}/{code}/subgroups | [EARLY ACCESS] AddSubGroupToGroup: Add sub group to group
*PortfolioGroupsApi* | [**buildTransactionsForPortfolioGroup**](docs/PortfolioGroupsApi.md#buildtransactionsforportfoliogroup) | **POST** /api/portfoliogroups/{scope}/{code}/transactions/$build | BuildTransactionsForPortfolioGroup: Build transactions for transaction portfolios in a portfolio group
*PortfolioGroupsApi* | [**createPortfolioGroup**](docs/PortfolioGroupsApi.md#createportfoliogroup) | **POST** /api/portfoliogroups/{scope} | CreatePortfolioGroup: Create portfolio group
*PortfolioGroupsApi* | [**deleteGroupProperties**](docs/PortfolioGroupsApi.md#deletegroupproperties) | **POST** /api/portfoliogroups/{scope}/{code}/properties/$delete | [EARLY ACCESS] DeleteGroupProperties: Delete group properties
*PortfolioGroupsApi* | [**deleteKeyFromPortfolioGroupAccessMetadata**](docs/PortfolioGroupsApi.md#deletekeyfromportfoliogroupaccessmetadata) | **DELETE** /api/portfoliogroups/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] DeleteKeyFromPortfolioGroupAccessMetadata: Delete a Portfolio Group Access Metadata entry
*PortfolioGroupsApi* | [**deletePortfolioFromGroup**](docs/PortfolioGroupsApi.md#deleteportfoliofromgroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode} | [EARLY ACCESS] DeletePortfolioFromGroup: Delete portfolio from group
*PortfolioGroupsApi* | [**deletePortfolioGroup**](docs/PortfolioGroupsApi.md#deleteportfoliogroup) | **DELETE** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] DeletePortfolioGroup: Delete portfolio group
*PortfolioGroupsApi* | [**deleteSubGroupFromGroup**](docs/PortfolioGroupsApi.md#deletesubgroupfromgroup) | **DELETE** /api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode} | [EARLY ACCESS] DeleteSubGroupFromGroup: Delete sub group from group
*PortfolioGroupsApi* | [**getA2BDataForPortfolioGroup**](docs/PortfolioGroupsApi.md#geta2bdataforportfoliogroup) | **GET** /api/portfoliogroups/{scope}/{code}/a2b | [EARLY ACCESS] GetA2BDataForPortfolioGroup: Get A2B data for a Portfolio Group
*PortfolioGroupsApi* | [**getGroupProperties**](docs/PortfolioGroupsApi.md#getgroupproperties) | **GET** /api/portfoliogroups/{scope}/{code}/properties | [EARLY ACCESS] GetGroupProperties: Get group properties
*PortfolioGroupsApi* | [**getHoldingsForPortfolioGroup**](docs/PortfolioGroupsApi.md#getholdingsforportfoliogroup) | **GET** /api/portfoliogroups/{scope}/{code}/holdings | GetHoldingsForPortfolioGroup: Get holdings for transaction portfolios in portfolio group
*PortfolioGroupsApi* | [**getPortfolioGroup**](docs/PortfolioGroupsApi.md#getportfoliogroup) | **GET** /api/portfoliogroups/{scope}/{code} | GetPortfolioGroup: Get portfolio group
*PortfolioGroupsApi* | [**getPortfolioGroupAccessMetadataByKey**](docs/PortfolioGroupsApi.md#getportfoliogroupaccessmetadatabykey) | **GET** /api/portfoliogroups/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPortfolioGroupAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Portfolio Group
*PortfolioGroupsApi* | [**getPortfolioGroupCommands**](docs/PortfolioGroupsApi.md#getportfoliogroupcommands) | **GET** /api/portfoliogroups/{scope}/{code}/commands | GetPortfolioGroupCommands: Get portfolio group commands
*PortfolioGroupsApi* | [**getPortfolioGroupExpansion**](docs/PortfolioGroupsApi.md#getportfoliogroupexpansion) | **GET** /api/portfoliogroups/{scope}/{code}/expansion | [EARLY ACCESS] GetPortfolioGroupExpansion: Get portfolio group expansion
*PortfolioGroupsApi* | [**getPortfolioGroupMetadata**](docs/PortfolioGroupsApi.md#getportfoliogroupmetadata) | **GET** /api/portfoliogroups/{scope}/{code}/metadata | [EARLY ACCESS] GetPortfolioGroupMetadata: Get Access Metadata rules for Portfolio Group
*PortfolioGroupsApi* | [**getPortfolioGroupPropertyTimeSeries**](docs/PortfolioGroupsApi.md#getportfoliogrouppropertytimeseries) | **GET** /api/portfoliogroups/{scope}/{code}/properties/time-series | [EARLY ACCESS] GetPortfolioGroupPropertyTimeSeries: Get the time series of a portfolio group property
*PortfolioGroupsApi* | [**getPortfolioGroupRelations**](docs/PortfolioGroupsApi.md#getportfoliogrouprelations) | **GET** /api/portfoliogroups/{scope}/{code}/relations | [EXPERIMENTAL] GetPortfolioGroupRelations: Get Relations for Portfolio Group
*PortfolioGroupsApi* | [**getPortfolioGroupRelationships**](docs/PortfolioGroupsApi.md#getportfoliogrouprelationships) | **GET** /api/portfoliogroups/{scope}/{code}/relationships | [EARLY ACCESS] GetPortfolioGroupRelationships: Get Relationships for Portfolio Group
*PortfolioGroupsApi* | [**getTransactionsForPortfolioGroup**](docs/PortfolioGroupsApi.md#gettransactionsforportfoliogroup) | **GET** /api/portfoliogroups/{scope}/{code}/transactions | GetTransactionsForPortfolioGroup: Get transactions for transaction portfolios in a portfolio group
*PortfolioGroupsApi* | [**listPortfolioGroups**](docs/PortfolioGroupsApi.md#listportfoliogroups) | **GET** /api/portfoliogroups/{scope} | ListPortfolioGroups: List portfolio groups
*PortfolioGroupsApi* | [**patchPortfolioGroupAccessMetadata**](docs/PortfolioGroupsApi.md#patchportfoliogroupaccessmetadata) | **PATCH** /api/portfoliogroups/{scope}/{code}/metadata | [EARLY ACCESS] PatchPortfolioGroupAccessMetadata: Patch Access Metadata rules for a Portfolio Group.
*PortfolioGroupsApi* | [**updatePortfolioGroup**](docs/PortfolioGroupsApi.md#updateportfoliogroup) | **PUT** /api/portfoliogroups/{scope}/{code} | [EARLY ACCESS] UpdatePortfolioGroup: Update portfolio group
*PortfolioGroupsApi* | [**upsertGroupProperties**](docs/PortfolioGroupsApi.md#upsertgroupproperties) | **POST** /api/portfoliogroups/{scope}/{code}/properties/$upsert | [EARLY ACCESS] UpsertGroupProperties: Upsert group properties
*PortfolioGroupsApi* | [**upsertPortfolioGroupAccessMetadata**](docs/PortfolioGroupsApi.md#upsertportfoliogroupaccessmetadata) | **PUT** /api/portfoliogroups/{scope}/{code}/metadata/{metadataKey} | UpsertPortfolioGroupAccessMetadata: Upsert a Portfolio Group Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
*PortfoliosApi* | [**batchUpsertPortfolioAccessMetadata**](docs/PortfoliosApi.md#batchupsertportfolioaccessmetadata) | **PUT** /api/portfolios/metadata | [EARLY ACCESS] BatchUpsertPortfolioAccessMetadata: Upsert multiple Portfolio Access Metadata Rules to multiple Portfolios
*PortfoliosApi* | [**deleteInstrumentEventInstruction**](docs/PortfoliosApi.md#deleteinstrumenteventinstruction) | **DELETE** /api/portfolios/{scope}/{code}/instrumenteventinstructions/{instrumentEventInstructionId} | [EARLY ACCESS] DeleteInstrumentEventInstruction: Delete Instrument Event Instruction
*PortfoliosApi* | [**deleteKeyFromPortfolioAccessMetadata**](docs/PortfoliosApi.md#deletekeyfromportfolioaccessmetadata) | **DELETE** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | DeleteKeyFromPortfolioAccessMetadata: Delete a Portfolio Access Metadata Rule
*PortfoliosApi* | [**deletePortfolio**](docs/PortfoliosApi.md#deleteportfolio) | **DELETE** /api/portfolios/{scope}/{code} | DeletePortfolio: Delete portfolio
*PortfoliosApi* | [**deletePortfolioProperties**](docs/PortfoliosApi.md#deleteportfolioproperties) | **DELETE** /api/portfolios/{scope}/{code}/properties | DeletePortfolioProperties: Delete portfolio properties
*PortfoliosApi* | [**deletePortfolioReturns**](docs/PortfoliosApi.md#deleteportfolioreturns) | **DELETE** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode}/$delete | [EARLY ACCESS] DeletePortfolioReturns: Delete Returns
*PortfoliosApi* | [**getAggregatedReturnsDispersionMetrics**](docs/PortfoliosApi.md#getaggregatedreturnsdispersionmetrics) | **POST** /api/portfolios/{scope}/{code}/returns/dispersion/$aggregated | [EARLY ACCESS] GetAggregatedReturnsDispersionMetrics: Get the Aggregated Returns Dispersion metric
*PortfoliosApi* | [**getCompositeBreakdown**](docs/PortfoliosApi.md#getcompositebreakdown) | **POST** /api/portfolios/{scope}/{code}/returns/breakdown | [EARLY ACCESS] GetCompositeBreakdown: Get the Composite Breakdown on how the composite Returns are calculated
*PortfoliosApi* | [**getInstrumentEventInstruction**](docs/PortfoliosApi.md#getinstrumenteventinstruction) | **GET** /api/portfolios/{scope}/{code}/instrumenteventinstructions/{instrumentEventInstructionId} | [EARLY ACCESS] GetInstrumentEventInstruction: Get Instrument Event Instruction
*PortfoliosApi* | [**getPortfolio**](docs/PortfoliosApi.md#getportfolio) | **GET** /api/portfolios/{scope}/{code} | GetPortfolio: Get portfolio
*PortfoliosApi* | [**getPortfolioAggregateReturns**](docs/PortfoliosApi.md#getportfolioaggregatereturns) | **GET** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode}/aggregated | [DEPRECATED] GetPortfolioAggregateReturns: Aggregate Returns (This is a deprecated endpoint).
*PortfoliosApi* | [**getPortfolioAggregatedReturns**](docs/PortfoliosApi.md#getportfolioaggregatedreturns) | **POST** /api/portfolios/{scope}/{code}/returns/$aggregated | GetPortfolioAggregatedReturns: Aggregated Returns
*PortfoliosApi* | [**getPortfolioCommands**](docs/PortfoliosApi.md#getportfoliocommands) | **GET** /api/portfolios/{scope}/{code}/commands | GetPortfolioCommands: Get portfolio commands
*PortfoliosApi* | [**getPortfolioMetadata**](docs/PortfoliosApi.md#getportfoliometadata) | **GET** /api/portfolios/{scope}/{code}/metadata | GetPortfolioMetadata: Get access metadata rules for a portfolio
*PortfoliosApi* | [**getPortfolioProperties**](docs/PortfoliosApi.md#getportfolioproperties) | **GET** /api/portfolios/{scope}/{code}/properties | GetPortfolioProperties: Get portfolio properties
*PortfoliosApi* | [**getPortfolioPropertyTimeSeries**](docs/PortfoliosApi.md#getportfoliopropertytimeseries) | **GET** /api/portfolios/{scope}/{code}/properties/time-series | GetPortfolioPropertyTimeSeries: Get portfolio property time series
*PortfoliosApi* | [**getPortfolioRelations**](docs/PortfoliosApi.md#getportfoliorelations) | **GET** /api/portfolios/{scope}/{code}/relations | [EXPERIMENTAL] GetPortfolioRelations: Get portfolio relations
*PortfoliosApi* | [**getPortfolioRelationships**](docs/PortfoliosApi.md#getportfoliorelationships) | **GET** /api/portfolios/{scope}/{code}/relationships | GetPortfolioRelationships: Get portfolio relationships
*PortfoliosApi* | [**getPortfolioReturns**](docs/PortfoliosApi.md#getportfolioreturns) | **GET** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode} | GetPortfolioReturns: Get Returns
*PortfoliosApi* | [**getPortfoliosAccessMetadataByKey**](docs/PortfoliosApi.md#getportfoliosaccessmetadatabykey) | **GET** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | [EARLY ACCESS] GetPortfoliosAccessMetadataByKey: Get an entry identified by a metadataKey in the access metadata object
*PortfoliosApi* | [**listInstrumentEventInstructions**](docs/PortfoliosApi.md#listinstrumenteventinstructions) | **GET** /api/portfolios/{scope}/{code}/instrumenteventinstructions | [EARLY ACCESS] ListInstrumentEventInstructions: List Instrument Event Instructions
*PortfoliosApi* | [**listPortfolioProperties**](docs/PortfoliosApi.md#listportfolioproperties) | **GET** /api/portfolios/{scope}/{code}/properties/list | [EARLY ACCESS] ListPortfolioProperties: Get portfolio properties
*PortfoliosApi* | [**listPortfolios**](docs/PortfoliosApi.md#listportfolios) | **GET** /api/portfolios | ListPortfolios: List portfolios
*PortfoliosApi* | [**listPortfoliosForScope**](docs/PortfoliosApi.md#listportfoliosforscope) | **GET** /api/portfolios/{scope} | ListPortfoliosForScope: List portfolios for scope
*PortfoliosApi* | [**patchPortfolio**](docs/PortfoliosApi.md#patchportfolio) | **PATCH** /api/portfolios/{scope}/{code} | PatchPortfolio: Patch portfolio.
*PortfoliosApi* | [**patchPortfolioAccessMetadata**](docs/PortfoliosApi.md#patchportfolioaccessmetadata) | **PATCH** /api/portfolios/{scope}/{code}/metadata | [EARLY ACCESS] PatchPortfolioAccessMetadata: Patch Access Metadata rules for a Portfolio.
*PortfoliosApi* | [**updatePortfolio**](docs/PortfoliosApi.md#updateportfolio) | **PUT** /api/portfolios/{scope}/{code} | UpdatePortfolio: Update portfolio
*PortfoliosApi* | [**upsertInstrumentEventInstructions**](docs/PortfoliosApi.md#upsertinstrumenteventinstructions) | **POST** /api/portfolios/{scope}/{code}/instrumenteventinstructions | [EARLY ACCESS] UpsertInstrumentEventInstructions: Upsert Instrument Event Instructions
*PortfoliosApi* | [**upsertPortfolioAccessMetadata**](docs/PortfoliosApi.md#upsertportfolioaccessmetadata) | **PUT** /api/portfolios/{scope}/{code}/metadata/{metadataKey} | UpsertPortfolioAccessMetadata: Upsert a Portfolio Access Metadata Rule associated with specific metadataKey. This creates or updates the data in LUSID.
*PortfoliosApi* | [**upsertPortfolioProperties**](docs/PortfoliosApi.md#upsertportfolioproperties) | **POST** /api/portfolios/{scope}/{code}/properties | UpsertPortfolioProperties: Upsert portfolio properties
*PortfoliosApi* | [**upsertPortfolioReturns**](docs/PortfoliosApi.md#upsertportfolioreturns) | **POST** /api/portfolios/{scope}/{code}/returns/{returnScope}/{returnCode} | UpsertPortfolioReturns: Upsert Returns
*PropertyDefinitionsApi* | [**createDerivedPropertyDefinition**](docs/PropertyDefinitionsApi.md#createderivedpropertydefinition) | **POST** /api/propertydefinitions/derived | [EARLY ACCESS] CreateDerivedPropertyDefinition: Create derived property definition
*PropertyDefinitionsApi* | [**createPropertyDefinition**](docs/PropertyDefinitionsApi.md#createpropertydefinition) | **POST** /api/propertydefinitions | CreatePropertyDefinition: Create property definition
*PropertyDefinitionsApi* | [**deletePropertyDefinition**](docs/PropertyDefinitionsApi.md#deletepropertydefinition) | **DELETE** /api/propertydefinitions/{domain}/{scope}/{code} | DeletePropertyDefinition: Delete property definition
*PropertyDefinitionsApi* | [**deletePropertyDefinitionProperties**](docs/PropertyDefinitionsApi.md#deletepropertydefinitionproperties) | **POST** /api/propertydefinitions/{domain}/{scope}/{code}/properties/$delete | [EARLY ACCESS] DeletePropertyDefinitionProperties: Delete property definition properties
*PropertyDefinitionsApi* | [**getMultiplePropertyDefinitions**](docs/PropertyDefinitionsApi.md#getmultiplepropertydefinitions) | **GET** /api/propertydefinitions | GetMultiplePropertyDefinitions: Get multiple property definitions
*PropertyDefinitionsApi* | [**getPropertyDefinition**](docs/PropertyDefinitionsApi.md#getpropertydefinition) | **GET** /api/propertydefinitions/{domain}/{scope}/{code} | GetPropertyDefinition: Get property definition
*PropertyDefinitionsApi* | [**getPropertyDefinitionPropertyTimeSeries**](docs/PropertyDefinitionsApi.md#getpropertydefinitionpropertytimeseries) | **GET** /api/propertydefinitions/{domain}/{scope}/{code}/properties/time-series | [EARLY ACCESS] GetPropertyDefinitionPropertyTimeSeries: Get Property Definition Property Time Series
*PropertyDefinitionsApi* | [**listPropertyDefinitions**](docs/PropertyDefinitionsApi.md#listpropertydefinitions) | **GET** /api/propertydefinitions/$list | ListPropertyDefinitions: List property definitions
*PropertyDefinitionsApi* | [**updateDerivedPropertyDefinition**](docs/PropertyDefinitionsApi.md#updatederivedpropertydefinition) | **PUT** /api/propertydefinitions/derived/{domain}/{scope}/{code} | [EARLY ACCESS] UpdateDerivedPropertyDefinition: Update a pre-existing derived property definition
*PropertyDefinitionsApi* | [**updatePropertyDefinition**](docs/PropertyDefinitionsApi.md#updatepropertydefinition) | **PUT** /api/propertydefinitions/{domain}/{scope}/{code} | UpdatePropertyDefinition: Update property definition
*PropertyDefinitionsApi* | [**upsertPropertyDefinitionProperties**](docs/PropertyDefinitionsApi.md#upsertpropertydefinitionproperties) | **POST** /api/propertydefinitions/{domain}/{scope}/{code}/properties | UpsertPropertyDefinitionProperties: Upsert properties to a property definition
*QueryableKeysApi* | [**getAllQueryableKeys**](docs/QueryableKeysApi.md#getallqueryablekeys) | **GET** /api/queryablekeys | [EARLY ACCESS] GetAllQueryableKeys: Query the set of supported \"addresses\" that can be queried from all endpoints.
*QuotesApi* | [**deleteQuoteAccessMetadataRule**](docs/QuotesApi.md#deletequoteaccessmetadatarule) | **DELETE** /api/metadata/quotes/rules/{scope} | [EXPERIMENTAL] DeleteQuoteAccessMetadataRule: Delete a Quote Access Metadata Rule
*QuotesApi* | [**deleteQuotes**](docs/QuotesApi.md#deletequotes) | **POST** /api/quotes/{scope}/$delete | DeleteQuotes: Delete quotes
*QuotesApi* | [**getQuotes**](docs/QuotesApi.md#getquotes) | **POST** /api/quotes/{scope}/$get | GetQuotes: Get quotes
*QuotesApi* | [**getQuotesAccessMetadataRule**](docs/QuotesApi.md#getquotesaccessmetadatarule) | **GET** /api/metadata/quotes/rules | [EXPERIMENTAL] GetQuotesAccessMetadataRule: Get a quote access metadata rule
*QuotesApi* | [**listQuotes**](docs/QuotesApi.md#listquotes) | **GET** /api/quotes/{scope}/$deprecated | [DEPRECATED] ListQuotes: List quotes
*QuotesApi* | [**listQuotesAccessMetadataRules**](docs/QuotesApi.md#listquotesaccessmetadatarules) | **GET** /api/metadata/quotes/rules/{scope} | [EXPERIMENTAL] ListQuotesAccessMetadataRules: List all quote access metadata rules in a scope
*QuotesApi* | [**listQuotesForScope**](docs/QuotesApi.md#listquotesforscope) | **GET** /api/quotes/{scope} | ListQuotesForScope: List quotes for scope
*QuotesApi* | [**upsertQuoteAccessMetadataRule**](docs/QuotesApi.md#upsertquoteaccessmetadatarule) | **POST** /api/metadata/quotes/rules/{scope} | [EXPERIMENTAL] UpsertQuoteAccessMetadataRule: Upsert a Quote Access Metadata Rule. This creates or updates the data in LUSID.
*QuotesApi* | [**upsertQuotes**](docs/QuotesApi.md#upsertquotes) | **POST** /api/quotes/{scope} | UpsertQuotes: Upsert quotes
*ReconciliationsApi* | [**createScheduledReconciliation**](docs/ReconciliationsApi.md#createscheduledreconciliation) | **POST** /api/portfolios/$scheduledReconciliations/{scope} | [EXPERIMENTAL] CreateScheduledReconciliation: Create a scheduled reconciliation
*ReconciliationsApi* | [**deleteReconciliation**](docs/ReconciliationsApi.md#deletereconciliation) | **DELETE** /api/portfolios/$scheduledReconciliations/{scope}/{code} | [EXPERIMENTAL] DeleteReconciliation: Delete scheduled reconciliation
*ReconciliationsApi* | [**deleteReconciliationMapping**](docs/ReconciliationsApi.md#deletereconciliationmapping) | **DELETE** /api/portfolios/mapping/{scope}/{code} | [EARLY ACCESS] DeleteReconciliationMapping: Delete a mapping
*ReconciliationsApi* | [**getReconciliation**](docs/ReconciliationsApi.md#getreconciliation) | **GET** /api/portfolios/$scheduledReconciliations/{scope}/{code} | [EXPERIMENTAL] GetReconciliation: Get scheduled reconciliation
*ReconciliationsApi* | [**getReconciliationMapping**](docs/ReconciliationsApi.md#getreconciliationmapping) | **GET** /api/portfolios/mapping/{scope}/{code} | [EARLY ACCESS] GetReconciliationMapping: Get a mapping
*ReconciliationsApi* | [**listReconciliationMappings**](docs/ReconciliationsApi.md#listreconciliationmappings) | **GET** /api/portfolios/mapping | [EARLY ACCESS] ListReconciliationMappings: List the reconciliation mappings
*ReconciliationsApi* | [**listReconciliations**](docs/ReconciliationsApi.md#listreconciliations) | **GET** /api/portfolios/$scheduledReconciliations | [EXPERIMENTAL] ListReconciliations: List scheduled reconciliations
*ReconciliationsApi* | [**reconcileGeneric**](docs/ReconciliationsApi.md#reconcilegeneric) | **POST** /api/portfolios/$reconcileGeneric | ReconcileGeneric: Reconcile either holdings or valuations performed on one or two sets of holdings using one or two configuration recipes.     The output is configurable for various types of comparisons, to allow tolerances on numerical and date-time data or case-insensitivity on strings,  and elision of resulting differences where they are 'empty' or null or zero.
*ReconciliationsApi* | [**reconcileHoldings**](docs/ReconciliationsApi.md#reconcileholdings) | **POST** /api/portfolios/$reconcileholdings | [EARLY ACCESS] ReconcileHoldings: Reconcile portfolio holdings
*ReconciliationsApi* | [**reconcileInline**](docs/ReconciliationsApi.md#reconcileinline) | **POST** /api/portfolios/$reconcileInline | ReconcileInline: Reconcile valuations performed on one or two sets of inline instruments using one or two configuration recipes.
*ReconciliationsApi* | [**reconcileTransactions**](docs/ReconciliationsApi.md#reconciletransactions) | **POST** /api/portfolios/$reconcileTransactions | [EARLY ACCESS] ReconcileTransactions: Perform a Transactions Reconciliation.
*ReconciliationsApi* | [**reconcileTransactionsV2**](docs/ReconciliationsApi.md#reconciletransactionsv2) | **POST** /api/portfolios/$reconcileTransactionsV2 | [EXPERIMENTAL] ReconcileTransactionsV2: Perform a Transactions Reconciliation.
*ReconciliationsApi* | [**reconcileValuation**](docs/ReconciliationsApi.md#reconcilevaluation) | **POST** /api/portfolios/$reconcileValuation | ReconcileValuation: Reconcile valuations performed on one or two sets of holdings using one or two configuration recipes.
*ReconciliationsApi* | [**updateReconciliation**](docs/ReconciliationsApi.md#updatereconciliation) | **POST** /api/portfolios/$scheduledReconciliations/{scope}/{code} | [EXPERIMENTAL] UpdateReconciliation: Update scheduled reconciliation
*ReconciliationsApi* | [**upsertReconciliationMapping**](docs/ReconciliationsApi.md#upsertreconciliationmapping) | **POST** /api/portfolios/mapping | [EARLY ACCESS] UpsertReconciliationMapping: Create or update a mapping
*ReferenceListsApi* | [**deleteReferenceList**](docs/ReferenceListsApi.md#deletereferencelist) | **DELETE** /api/referencelists/{scope}/{code} | [EARLY ACCESS] DeleteReferenceList: Delete Reference List
*ReferenceListsApi* | [**getReferenceList**](docs/ReferenceListsApi.md#getreferencelist) | **GET** /api/referencelists/{scope}/{code} | GetReferenceList: Get Reference List
*ReferenceListsApi* | [**listReferenceLists**](docs/ReferenceListsApi.md#listreferencelists) | **GET** /api/referencelists | [EARLY ACCESS] ListReferenceLists: List Reference Lists
*ReferenceListsApi* | [**upsertReferenceList**](docs/ReferenceListsApi.md#upsertreferencelist) | **POST** /api/referencelists | [EARLY ACCESS] UpsertReferenceList: Upsert Reference List
*ReferencePortfolioApi* | [**createReferencePortfolio**](docs/ReferencePortfolioApi.md#createreferenceportfolio) | **POST** /api/referenceportfolios/{scope} | CreateReferencePortfolio: Create reference portfolio
*ReferencePortfolioApi* | [**getReferencePortfolioConstituents**](docs/ReferencePortfolioApi.md#getreferenceportfolioconstituents) | **GET** /api/referenceportfolios/{scope}/{code}/constituents | GetReferencePortfolioConstituents: Get reference portfolio constituents
*ReferencePortfolioApi* | [**listConstituentsAdjustments**](docs/ReferencePortfolioApi.md#listconstituentsadjustments) | **GET** /api/referenceportfolios/{scope}/{code}/constituentsadjustments | ListConstituentsAdjustments: List constituents adjustments
*ReferencePortfolioApi* | [**upsertReferencePortfolioConstituentProperties**](docs/ReferencePortfolioApi.md#upsertreferenceportfolioconstituentproperties) | **POST** /api/referenceportfolios/{scope}/{code}/constituents/properties | [EARLY ACCESS] UpsertReferencePortfolioConstituentProperties: Upsert constituent properties
*ReferencePortfolioApi* | [**upsertReferencePortfolioConstituents**](docs/ReferencePortfolioApi.md#upsertreferenceportfolioconstituents) | **POST** /api/referenceportfolios/{scope}/{code}/constituents | UpsertReferencePortfolioConstituents: Upsert reference portfolio constituents
*RelationDefinitionsApi* | [**createRelationDefinition**](docs/RelationDefinitionsApi.md#createrelationdefinition) | **POST** /api/relationdefinitions | [EXPERIMENTAL] CreateRelationDefinition: Create a relation definition
*RelationDefinitionsApi* | [**deleteRelationDefinition**](docs/RelationDefinitionsApi.md#deleterelationdefinition) | **DELETE** /api/relationdefinitions/{scope}/{code} | [EXPERIMENTAL] DeleteRelationDefinition: Delete relation definition
*RelationDefinitionsApi* | [**getRelationDefinition**](docs/RelationDefinitionsApi.md#getrelationdefinition) | **GET** /api/relationdefinitions/{scope}/{code} | [EXPERIMENTAL] GetRelationDefinition: Get relation definition
*RelationsApi* | [**createRelation**](docs/RelationsApi.md#createrelation) | **POST** /api/relations/{scope}/{code} | [EXPERIMENTAL] CreateRelation: Create Relation
*RelationsApi* | [**deleteRelation**](docs/RelationsApi.md#deleterelation) | **POST** /api/relations/{scope}/{code}/$delete | [EXPERIMENTAL] DeleteRelation: Delete a relation
*RelationshipDefinitionsApi* | [**createRelationshipDefinition**](docs/RelationshipDefinitionsApi.md#createrelationshipdefinition) | **POST** /api/relationshipdefinitions | [EARLY ACCESS] CreateRelationshipDefinition: Create Relationship Definition
*RelationshipDefinitionsApi* | [**deleteRelationshipDefinition**](docs/RelationshipDefinitionsApi.md#deleterelationshipdefinition) | **DELETE** /api/relationshipdefinitions/{scope}/{code} | [EARLY ACCESS] DeleteRelationshipDefinition: Delete Relationship Definition
*RelationshipDefinitionsApi* | [**getRelationshipDefinition**](docs/RelationshipDefinitionsApi.md#getrelationshipdefinition) | **GET** /api/relationshipdefinitions/{scope}/{code} | [EARLY ACCESS] GetRelationshipDefinition: Get relationship definition
*RelationshipDefinitionsApi* | [**listRelationshipDefinitions**](docs/RelationshipDefinitionsApi.md#listrelationshipdefinitions) | **GET** /api/relationshipdefinitions | [EARLY ACCESS] ListRelationshipDefinitions: List relationship definitions
*RelationshipDefinitionsApi* | [**updateRelationshipDefinition**](docs/RelationshipDefinitionsApi.md#updaterelationshipdefinition) | **PUT** /api/relationshipdefinitions/{scope}/{code} | [EARLY ACCESS] UpdateRelationshipDefinition: Update Relationship Definition
*RelationshipsApi* | [**createRelationship**](docs/RelationshipsApi.md#createrelationship) | **POST** /api/relationshipdefinitions/{scope}/{code}/relationships | CreateRelationship: Create Relationship
*RelationshipsApi* | [**deleteRelationship**](docs/RelationshipsApi.md#deleterelationship) | **POST** /api/relationshipdefinitions/{scope}/{code}/relationships/$delete | [EARLY ACCESS] DeleteRelationship: Delete Relationship
*SchemasApi* | [**getEntitySchema**](docs/SchemasApi.md#getentityschema) | **GET** /api/schemas/entities/{entity} | [EARLY ACCESS] GetEntitySchema: Get schema
*SchemasApi* | [**getPropertySchema**](docs/SchemasApi.md#getpropertyschema) | **GET** /api/schemas/properties | [EARLY ACCESS] GetPropertySchema: Get property schema
*SchemasApi* | [**getValueTypes**](docs/SchemasApi.md#getvaluetypes) | **GET** /api/schemas/types | [EARLY ACCESS] GetValueTypes: Get value types
*SchemasApi* | [**listEntities**](docs/SchemasApi.md#listentities) | **GET** /api/schemas/entities | [EARLY ACCESS] ListEntities: List entities
*ScopesApi* | [**listEntityScopes**](docs/ScopesApi.md#listentityscopes) | **GET** /api/scopes/{entityType} | ListEntityScopes: List Entity Scopes
*ScopesApi* | [**listScopes**](docs/ScopesApi.md#listscopes) | **GET** /api/scopes | ListScopes: List Scopes
*ScriptedTranslationApi* | [**getTranslationDialect**](docs/ScriptedTranslationApi.md#gettranslationdialect) | **GET** /api/scriptedtranslation/dialects/{scope}/{vendor}/{sourceSystem}/{entityType}/{serialisationFormat}/{version} | [EARLY ACCESS] GetTranslationDialect: Get a dialect.
*ScriptedTranslationApi* | [**getTranslationScript**](docs/ScriptedTranslationApi.md#gettranslationscript) | **GET** /api/scriptedtranslation/scripts/{scope}/{code}/{version} | [EARLY ACCESS] GetTranslationScript: Retrieve a translation script by its identifier.
*ScriptedTranslationApi* | [**listDialectIds**](docs/ScriptedTranslationApi.md#listdialectids) | **GET** /api/scriptedtranslation/dialects/ids | [EARLY ACCESS] ListDialectIds: List dialect identifiers matching an optional filter.
*ScriptedTranslationApi* | [**listTranslationScriptIds**](docs/ScriptedTranslationApi.md#listtranslationscriptids) | **GET** /api/scriptedtranslation/scripts/ids | [EARLY ACCESS] ListTranslationScriptIds: List translation script identifiers.
*ScriptedTranslationApi* | [**translateEntities**](docs/ScriptedTranslationApi.md#translateentities) | **POST** /api/scriptedtranslation/translateentities | [EARLY ACCESS] TranslateEntities: Translate a collection of entities with a specified translation script.
*ScriptedTranslationApi* | [**translateEntitiesInlined**](docs/ScriptedTranslationApi.md#translateentitiesinlined) | **POST** /api/scriptedtranslation/translateentitiesinlined | [EARLY ACCESS] TranslateEntitiesInlined: Translate a collection of entities, inlining the body of the translation script.
*ScriptedTranslationApi* | [**upsertTranslationDialect**](docs/ScriptedTranslationApi.md#upserttranslationdialect) | **POST** /api/scriptedtranslation/dialects | [EARLY ACCESS] UpsertTranslationDialect: Upsert a Dialect.
*ScriptedTranslationApi* | [**upsertTranslationScript**](docs/ScriptedTranslationApi.md#upserttranslationscript) | **POST** /api/scriptedtranslation/scripts | [EARLY ACCESS] UpsertTranslationScript: Upsert a translation script.
*SearchApi* | [**instrumentsSearch**](docs/SearchApi.md#instrumentssearch) | **POST** /api/search/instruments | [EARLY ACCESS] InstrumentsSearch: Instruments search
*SearchApi* | [**searchPortfolioGroups**](docs/SearchApi.md#searchportfoliogroups) | **GET** /api/search/portfoliogroups | SearchPortfolioGroups: Search Portfolio Groups
*SearchApi* | [**searchPortfolios**](docs/SearchApi.md#searchportfolios) | **GET** /api/search/portfolios | SearchPortfolios: Search Portfolios
*SearchApi* | [**searchProperties**](docs/SearchApi.md#searchproperties) | **GET** /api/search/propertydefinitions | SearchProperties: Search Property Definitions
*SequencesApi* | [**createSequence**](docs/SequencesApi.md#createsequence) | **POST** /api/sequences/{scope} | [EARLY ACCESS] CreateSequence: Create a new sequence
*SequencesApi* | [**getSequence**](docs/SequencesApi.md#getsequence) | **GET** /api/sequences/{scope}/{code} | [EARLY ACCESS] GetSequence: Get a specified sequence
*SequencesApi* | [**listSequences**](docs/SequencesApi.md#listsequences) | **GET** /api/sequences | [EARLY ACCESS] ListSequences: List Sequences
*SequencesApi* | [**next**](docs/SequencesApi.md#next) | **GET** /api/sequences/{scope}/{code}/next | [EARLY ACCESS] Next: Get next values from sequence
*StagedModificationsApi* | [**addDecision**](docs/StagedModificationsApi.md#adddecision) | **POST** /api/stagedmodifications/{id}/decision | [EXPERIMENTAL] AddDecision: AddDecision
*StagedModificationsApi* | [**getStagedModification**](docs/StagedModificationsApi.md#getstagedmodification) | **GET** /api/stagedmodifications/{id} | [EXPERIMENTAL] GetStagedModification: GetStagedModification
*StagedModificationsApi* | [**listRequestedChanges**](docs/StagedModificationsApi.md#listrequestedchanges) | **GET** /api/stagedmodifications/{id}/requestedChanges | [EXPERIMENTAL] ListRequestedChanges: ListRequestedChanges
*StagedModificationsApi* | [**listStagedModifications**](docs/StagedModificationsApi.md#liststagedmodifications) | **GET** /api/stagedmodifications | [EXPERIMENTAL] ListStagedModifications: ListStagedModifications
*StagingRuleSetApi* | [**createStagingRuleSet**](docs/StagingRuleSetApi.md#createstagingruleset) | **POST** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] CreateStagingRuleSet: Create a StagingRuleSet
*StagingRuleSetApi* | [**deleteStagingRuleSet**](docs/StagingRuleSetApi.md#deletestagingruleset) | **DELETE** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] DeleteStagingRuleSet: Delete a StagingRuleSet
*StagingRuleSetApi* | [**getStagingRuleSet**](docs/StagingRuleSetApi.md#getstagingruleset) | **GET** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] GetStagingRuleSet: Get a StagingRuleSet
*StagingRuleSetApi* | [**listStagingRuleSets**](docs/StagingRuleSetApi.md#liststagingrulesets) | **GET** /api/stagingrulesets | [EXPERIMENTAL] ListStagingRuleSets: List StagingRuleSets
*StagingRuleSetApi* | [**updateStagingRuleSet**](docs/StagingRuleSetApi.md#updatestagingruleset) | **PUT** /api/stagingrulesets/{entityType} | [EXPERIMENTAL] UpdateStagingRuleSet: Update a StagingRuleSet
*StructuredResultDataApi* | [**createDataMap**](docs/StructuredResultDataApi.md#createdatamap) | **POST** /api/unitresults/datamap/{scope} | CreateDataMap: Create data map
*StructuredResultDataApi* | [**deleteStructuredResultData**](docs/StructuredResultDataApi.md#deletestructuredresultdata) | **POST** /api/unitresults/{scope}/$delete | [EXPERIMENTAL] DeleteStructuredResultData: Delete structured result data
*StructuredResultDataApi* | [**getAddressKeyDefinitionsForDocument**](docs/StructuredResultDataApi.md#getaddresskeydefinitionsfordocument) | **GET** /api/unitresults/virtualdocument/{scope}/{code}/{source}/{resultType}/addresskeydefinitions | [EARLY ACCESS] GetAddressKeyDefinitionsForDocument: Get AddressKeyDefinitions for a virtual document.
*StructuredResultDataApi* | [**getDataMap**](docs/StructuredResultDataApi.md#getdatamap) | **POST** /api/unitresults/datamap/{scope}/$get | [EXPERIMENTAL] GetDataMap: Get data map
*StructuredResultDataApi* | [**getStructuredResultData**](docs/StructuredResultDataApi.md#getstructuredresultdata) | **POST** /api/unitresults/{scope}/$get | GetStructuredResultData: Get structured result data
*StructuredResultDataApi* | [**getVirtualDocument**](docs/StructuredResultDataApi.md#getvirtualdocument) | **POST** /api/unitresults/virtualdocument/{scope}/$get | [EXPERIMENTAL] GetVirtualDocument: Get Virtual Documents
*StructuredResultDataApi* | [**getVirtualDocumentRows**](docs/StructuredResultDataApi.md#getvirtualdocumentrows) | **GET** /api/unitresults/virtualdocument/{scope}/{code}/{source}/{resultType} | [EARLY ACCESS] GetVirtualDocumentRows: Get Virtual Document Rows
*StructuredResultDataApi* | [**upsertResultValue**](docs/StructuredResultDataApi.md#upsertresultvalue) | **POST** /api/unitresults/resultvalue/{scope} | [EXPERIMENTAL] UpsertResultValue: Upsert result value
*StructuredResultDataApi* | [**upsertStructuredResultData**](docs/StructuredResultDataApi.md#upsertstructuredresultdata) | **POST** /api/unitresults/{scope} | UpsertStructuredResultData: Upsert structured result data
*SystemConfigurationApi* | [**createConfigurationTransactionType**](docs/SystemConfigurationApi.md#createconfigurationtransactiontype) | **POST** /api/systemconfiguration/transactions/type | [EARLY ACCESS] CreateConfigurationTransactionType: Create transaction type
*SystemConfigurationApi* | [**createSideDefinition**](docs/SystemConfigurationApi.md#createsidedefinition) | **POST** /api/systemconfiguration/transactions/side | [EXPERIMENTAL] CreateSideDefinition: Create side definition
*SystemConfigurationApi* | [**deleteTransactionConfigurationSource**](docs/SystemConfigurationApi.md#deletetransactionconfigurationsource) | **DELETE** /api/systemconfiguration/transactions/type/{source} | [EXPERIMENTAL] DeleteTransactionConfigurationSource: Delete all transaction configurations for a source
*SystemConfigurationApi* | [**getTransactionConfigurationSource**](docs/SystemConfigurationApi.md#gettransactionconfigurationsource) | **GET** /api/systemconfiguration/transactions/type/{source} | [EXPERIMENTAL] GetTransactionConfigurationSource: Get all transaction configurations for a source
*SystemConfigurationApi* | [**listConfigurationTransactionTypes**](docs/SystemConfigurationApi.md#listconfigurationtransactiontypes) | **GET** /api/systemconfiguration/transactions | [EARLY ACCESS] ListConfigurationTransactionTypes: List transaction types
*SystemConfigurationApi* | [**setConfigurationTransactionTypes**](docs/SystemConfigurationApi.md#setconfigurationtransactiontypes) | **PUT** /api/systemconfiguration/transactions | [EXPERIMENTAL] SetConfigurationTransactionTypes: Set transaction types
*SystemConfigurationApi* | [**setTransactionConfigurationSource**](docs/SystemConfigurationApi.md#settransactionconfigurationsource) | **PUT** /api/systemconfiguration/transactions/type/{source} | [EXPERIMENTAL] SetTransactionConfigurationSource: Set transaction types for a source
*TaxRuleSetsApi* | [**createTaxRuleSet**](docs/TaxRuleSetsApi.md#createtaxruleset) | **POST** /api/tax/rulesets | [EXPERIMENTAL] CreateTaxRuleSet: Create a tax rule set.
*TaxRuleSetsApi* | [**deleteTaxRuleSet**](docs/TaxRuleSetsApi.md#deletetaxruleset) | **DELETE** /api/tax/rulesets/{scope}/{code} | [EXPERIMENTAL] DeleteTaxRuleSet: Delete a tax rule set.
*TaxRuleSetsApi* | [**getTaxRuleSet**](docs/TaxRuleSetsApi.md#gettaxruleset) | **GET** /api/tax/rulesets/{scope}/{code} | [EXPERIMENTAL] GetTaxRuleSet: Retrieve the definition of single tax rule set.
*TaxRuleSetsApi* | [**listTaxRuleSets**](docs/TaxRuleSetsApi.md#listtaxrulesets) | **GET** /api/tax/rulesets | [EXPERIMENTAL] ListTaxRuleSets: List tax rule sets.
*TaxRuleSetsApi* | [**updateTaxRuleSet**](docs/TaxRuleSetsApi.md#updatetaxruleset) | **PUT** /api/tax/rulesets/{scope}/{code} | [EXPERIMENTAL] UpdateTaxRuleSet: Update a tax rule set.
*TimelinesApi* | [**createTimeline**](docs/TimelinesApi.md#createtimeline) | **POST** /api/timelines | [EXPERIMENTAL] CreateTimeline: Create a Timeline
*TimelinesApi* | [**deleteTimeline**](docs/TimelinesApi.md#deletetimeline) | **DELETE** /api/timelines/{scope}/{code} | [EXPERIMENTAL] DeleteTimeline: Deletes a particular Timeline
*TimelinesApi* | [**getTimeline**](docs/TimelinesApi.md#gettimeline) | **GET** /api/timelines/{scope}/{code} | [EXPERIMENTAL] GetTimeline: Get a single Timeline by scope and code.
*TimelinesApi* | [**updateTimeline**](docs/TimelinesApi.md#updatetimeline) | **PUT** /api/timelines/{scope}/{code} | [EXPERIMENTAL] UpdateTimeline: Update Timeline defined by scope and code
*TransactionConfigurationApi* | [**deleteSideDefinition**](docs/TransactionConfigurationApi.md#deletesidedefinition) | **DELETE** /api/transactionconfiguration/sides/{side}/$delete | DeleteSideDefinition: Delete the given side definition
*TransactionConfigurationApi* | [**deleteTransactionType**](docs/TransactionConfigurationApi.md#deletetransactiontype) | **DELETE** /api/transactionconfiguration/types/{source}/{type} | DeleteTransactionType: Delete a transaction type
*TransactionConfigurationApi* | [**deleteTransactionTypeSource**](docs/TransactionConfigurationApi.md#deletetransactiontypesource) | **DELETE** /api/transactionconfiguration/types/{source}/$delete | DeleteTransactionTypeSource: Delete all transaction types for the given source and scope
*TransactionConfigurationApi* | [**getSideDefinition**](docs/TransactionConfigurationApi.md#getsidedefinition) | **GET** /api/transactionconfiguration/sides/{side} | GetSideDefinition: Get the side definition for a given side name( or label)
*TransactionConfigurationApi* | [**getTransactionType**](docs/TransactionConfigurationApi.md#gettransactiontype) | **GET** /api/transactionconfiguration/types/{source}/{type} | GetTransactionType: Get a single transaction configuration type
*TransactionConfigurationApi* | [**listSideDefinitions**](docs/TransactionConfigurationApi.md#listsidedefinitions) | **GET** /api/transactionconfiguration/sides | ListSideDefinitions: List the side definitions
*TransactionConfigurationApi* | [**listTransactionTypes**](docs/TransactionConfigurationApi.md#listtransactiontypes) | **GET** /api/transactionconfiguration/types | ListTransactionTypes: List transaction types
*TransactionConfigurationApi* | [**setSideDefinition**](docs/TransactionConfigurationApi.md#setsidedefinition) | **PUT** /api/transactionconfiguration/sides/{side} | SetSideDefinition: Set a side definition
*TransactionConfigurationApi* | [**setSideDefinitions**](docs/TransactionConfigurationApi.md#setsidedefinitions) | **PUT** /api/transactionconfiguration/sides | SetSideDefinitions: Set the given side definitions
*TransactionConfigurationApi* | [**setTransactionType**](docs/TransactionConfigurationApi.md#settransactiontype) | **PUT** /api/transactionconfiguration/types/{source}/{type} | SetTransactionType: Set a specific transaction type
*TransactionConfigurationApi* | [**setTransactionTypeSource**](docs/TransactionConfigurationApi.md#settransactiontypesource) | **PUT** /api/transactionconfiguration/types/{source} | SetTransactionTypeSource: Set the transaction types for the given source and scope
*TransactionFeesApi* | [**deleteTransactionFeeRule**](docs/TransactionFeesApi.md#deletetransactionfeerule) | **DELETE** /api/transactions/fees/rules/{code} | [EXPERIMENTAL] DeleteTransactionFeeRule: Deletes a fee rule.
*TransactionFeesApi* | [**getApplicableTransactionFees**](docs/TransactionFeesApi.md#getapplicabletransactionfees) | **POST** /api/transactions/fees/$GetApplicableFees | [EXPERIMENTAL] GetApplicableTransactionFees: Get the Fees and Commissions that may be applicable to a transaction.
*TransactionFeesApi* | [**getTransactionFeeRule**](docs/TransactionFeesApi.md#gettransactionfeerule) | **GET** /api/transactions/fees/rules/{code} | [EXPERIMENTAL] GetTransactionFeeRule: Retrieve the definition of single fee rule.
*TransactionFeesApi* | [**listTransactionFeeRules**](docs/TransactionFeesApi.md#listtransactionfeerules) | **GET** /api/transactions/fees/rules | [EXPERIMENTAL] ListTransactionFeeRules: List fee rules, with optional filtering.
*TransactionFeesApi* | [**upsertTransactionFeeRules**](docs/TransactionFeesApi.md#upserttransactionfeerules) | **POST** /api/transactions/fees/rules | [EXPERIMENTAL] UpsertTransactionFeeRules: Upsert fee rules.
*TransactionPortfoliosApi* | [**adjustHoldings**](docs/TransactionPortfoliosApi.md#adjustholdings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings | AdjustHoldings: Adjust holdings
*TransactionPortfoliosApi* | [**batchAdjustHoldings**](docs/TransactionPortfoliosApi.md#batchadjustholdings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/$batchAdjust | [EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings
*TransactionPortfoliosApi* | [**batchCreateTradeTickets**](docs/TransactionPortfoliosApi.md#batchcreatetradetickets) | **POST** /api/transactionportfolios/{scope}/{code}/$batchtradetickets | [EARLY ACCESS] BatchCreateTradeTickets: Batch Create Trade Tickets
*TransactionPortfoliosApi* | [**batchSetHoldings**](docs/TransactionPortfoliosApi.md#batchsetholdings) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/$batchSet | [EARLY ACCESS] BatchSetHoldings: Batch set holdings
*TransactionPortfoliosApi* | [**batchUpsertTransactions**](docs/TransactionPortfoliosApi.md#batchupserttransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$batchUpsert | [EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions
*TransactionPortfoliosApi* | [**buildTransactions**](docs/TransactionPortfoliosApi.md#buildtransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/$build | BuildTransactions: Build transactions
*TransactionPortfoliosApi* | [**cancelAdjustHoldings**](docs/TransactionPortfoliosApi.md#canceladjustholdings) | **DELETE** /api/transactionportfolios/{scope}/{code}/holdings | CancelAdjustHoldings: Cancel adjust holdings
*TransactionPortfoliosApi* | [**cancelTransactions**](docs/TransactionPortfoliosApi.md#canceltransactions) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions | CancelTransactions: Cancel transactions
*TransactionPortfoliosApi* | [**createPortfolio**](docs/TransactionPortfoliosApi.md#createportfolio) | **POST** /api/transactionportfolios/{scope} | CreatePortfolio: Create portfolio
*TransactionPortfoliosApi* | [**createTradeTicket**](docs/TransactionPortfoliosApi.md#createtradeticket) | **POST** /api/transactionportfolios/{scope}/{code}/$tradeticket | [EARLY ACCESS] CreateTradeTicket: Create Trade Ticket
*TransactionPortfoliosApi* | [**deleteCustodianAccounts**](docs/TransactionPortfoliosApi.md#deletecustodianaccounts) | **POST** /api/transactionportfolios/{scope}/{code}/custodianaccounts/$delete | [EXPERIMENTAL] DeleteCustodianAccounts: Soft or hard delete multiple custodian accounts
*TransactionPortfoliosApi* | [**deletePropertiesFromTransaction**](docs/TransactionPortfoliosApi.md#deletepropertiesfromtransaction) | **DELETE** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | DeletePropertiesFromTransaction: Delete properties from transaction
*TransactionPortfoliosApi* | [**getA2BData**](docs/TransactionPortfoliosApi.md#geta2bdata) | **GET** /api/transactionportfolios/{scope}/{code}/a2b | GetA2BData: Get A2B data
*TransactionPortfoliosApi* | [**getA2BMovements**](docs/TransactionPortfoliosApi.md#geta2bmovements) | **GET** /api/transactionportfolios/{scope}/{code}/a2bmovements | GetA2BMovements: Get an A2B report at the movement level for the given portfolio.
*TransactionPortfoliosApi* | [**getBucketedCashFlows**](docs/TransactionPortfoliosApi.md#getbucketedcashflows) | **POST** /api/transactionportfolios/{scope}/{code}/bucketedCashFlows | [EXPERIMENTAL] GetBucketedCashFlows: Get bucketed cash flows from a list of portfolios
*TransactionPortfoliosApi* | [**getCustodianAccount**](docs/TransactionPortfoliosApi.md#getcustodianaccount) | **GET** /api/transactionportfolios/{scope}/{code}/custodianaccounts/{custodianAccountScope}/{custodianAccountCode} | [EXPERIMENTAL] GetCustodianAccount: Get Custodian Account
*TransactionPortfoliosApi* | [**getDetails**](docs/TransactionPortfoliosApi.md#getdetails) | **GET** /api/transactionportfolios/{scope}/{code}/details | GetDetails: Get details
*TransactionPortfoliosApi* | [**getHoldingContributors**](docs/TransactionPortfoliosApi.md#getholdingcontributors) | **GET** /api/transactionportfolios/{scope}/{code}/holdings/{holdingId}/contributors | [EARLY ACCESS] GetHoldingContributors: Get Holdings Contributors
*TransactionPortfoliosApi* | [**getHoldings**](docs/TransactionPortfoliosApi.md#getholdings) | **GET** /api/transactionportfolios/{scope}/{code}/holdings | GetHoldings: Get holdings
*TransactionPortfoliosApi* | [**getHoldingsAdjustment**](docs/TransactionPortfoliosApi.md#getholdingsadjustment) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt} | GetHoldingsAdjustment: Get holdings adjustment
*TransactionPortfoliosApi* | [**getHoldingsWithOrders**](docs/TransactionPortfoliosApi.md#getholdingswithorders) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsWithOrders | [EXPERIMENTAL] GetHoldingsWithOrders: Get holdings with orders
*TransactionPortfoliosApi* | [**getMultipleHoldingContributors**](docs/TransactionPortfoliosApi.md#getmultipleholdingcontributors) | **POST** /api/transactionportfolios/{scope}/{code}/holdings/contributors/$get | [EARLY ACCESS] GetMultipleHoldingContributors: Get Multiple Holding Contributors
*TransactionPortfoliosApi* | [**getPortfolioCashFlows**](docs/TransactionPortfoliosApi.md#getportfoliocashflows) | **GET** /api/transactionportfolios/{scope}/{code}/cashflows | GetPortfolioCashFlows: Get portfolio cash flows
*TransactionPortfoliosApi* | [**getPortfolioCashLadder**](docs/TransactionPortfoliosApi.md#getportfoliocashladder) | **GET** /api/transactionportfolios/{scope}/{code}/cashladder | GetPortfolioCashLadder: Get portfolio cash ladder
*TransactionPortfoliosApi* | [**getPortfolioCashStatement**](docs/TransactionPortfoliosApi.md#getportfoliocashstatement) | **GET** /api/transactionportfolios/{scope}/{code}/cashstatement | GetPortfolioCashStatement: Get portfolio cash statement
*TransactionPortfoliosApi* | [**getTransactionHistory**](docs/TransactionPortfoliosApi.md#gettransactionhistory) | **GET** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/history | GetTransactionHistory: Get the history of a transaction
*TransactionPortfoliosApi* | [**getTransactions**](docs/TransactionPortfoliosApi.md#gettransactions) | **GET** /api/transactionportfolios/{scope}/{code}/transactions | GetTransactions: Get transactions
*TransactionPortfoliosApi* | [**getUpsertablePortfolioCashFlows**](docs/TransactionPortfoliosApi.md#getupsertableportfoliocashflows) | **GET** /api/transactionportfolios/{scope}/{code}/upsertablecashflows | GetUpsertablePortfolioCashFlows: Get upsertable portfolio cash flows.
*TransactionPortfoliosApi* | [**listCustodianAccounts**](docs/TransactionPortfoliosApi.md#listcustodianaccounts) | **GET** /api/transactionportfolios/{scope}/{code}/custodianaccounts | [EXPERIMENTAL] ListCustodianAccounts: List Custodian Accounts
*TransactionPortfoliosApi* | [**listHoldingsAdjustments**](docs/TransactionPortfoliosApi.md#listholdingsadjustments) | **GET** /api/transactionportfolios/{scope}/{code}/holdingsadjustments | ListHoldingsAdjustments: List holdings adjustments
*TransactionPortfoliosApi* | [**patchPortfolioDetails**](docs/TransactionPortfoliosApi.md#patchportfoliodetails) | **PATCH** /api/transactionportfolios/{scope}/{code}/details | PatchPortfolioDetails: Patch portfolio details
*TransactionPortfoliosApi* | [**previewTransaction**](docs/TransactionPortfoliosApi.md#previewtransaction) | **POST** /api/transactionportfolios/{scope}/{code}/previewTransaction | [EARLY ACCESS] PreviewTransaction: Preview a transaction
*TransactionPortfoliosApi* | [**resolveInstrument**](docs/TransactionPortfoliosApi.md#resolveinstrument) | **POST** /api/transactionportfolios/{scope}/{code}/$resolve | ResolveInstrument: Resolve instrument
*TransactionPortfoliosApi* | [**setHoldings**](docs/TransactionPortfoliosApi.md#setholdings) | **PUT** /api/transactionportfolios/{scope}/{code}/holdings | SetHoldings: Set holdings
*TransactionPortfoliosApi* | [**upsertCustodianAccounts**](docs/TransactionPortfoliosApi.md#upsertcustodianaccounts) | **POST** /api/transactionportfolios/{scope}/{code}/custodianaccounts | [EXPERIMENTAL] UpsertCustodianAccounts: Upsert Custodian Accounts
*TransactionPortfoliosApi* | [**upsertCustodianAccountsProperties**](docs/TransactionPortfoliosApi.md#upsertcustodianaccountsproperties) | **POST** /api/transactionportfolios/{scope}/{code}/custodianaccounts/{custodianAccountScope}/{custodianAccountCode}/properties/$upsert | [EXPERIMENTAL] UpsertCustodianAccountsProperties: Upsert custodian accounts properties
*TransactionPortfoliosApi* | [**upsertPortfolioDetails**](docs/TransactionPortfoliosApi.md#upsertportfoliodetails) | **POST** /api/transactionportfolios/{scope}/{code}/details | UpsertPortfolioDetails: Upsert portfolio details
*TransactionPortfoliosApi* | [**upsertTransactionProperties**](docs/TransactionPortfoliosApi.md#upserttransactionproperties) | **POST** /api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties | UpsertTransactionProperties: Upsert transaction properties
*TransactionPortfoliosApi* | [**upsertTransactions**](docs/TransactionPortfoliosApi.md#upserttransactions) | **POST** /api/transactionportfolios/{scope}/{code}/transactions | UpsertTransactions: Upsert transactions
*TranslationApi* | [**translateInstrumentDefinitions**](docs/TranslationApi.md#translateinstrumentdefinitions) | **POST** /api/translation/instrumentdefinitions | [EXPERIMENTAL] TranslateInstrumentDefinitions: Translate instruments
*TranslationApi* | [**translateTradeTickets**](docs/TranslationApi.md#translatetradetickets) | **POST** /api/translation/tradetickets | [EXPERIMENTAL] TranslateTradeTickets: Translate trade ticket
*WorkspaceApi* | [**createPersonalItem**](docs/WorkspaceApi.md#createpersonalitem) | **POST** /api/workspaces/personal/{workspaceName}/items | [EXPERIMENTAL] CreatePersonalItem: Create a new item in a personal workspace.
*WorkspaceApi* | [**createPersonalWorkspace**](docs/WorkspaceApi.md#createpersonalworkspace) | **POST** /api/workspaces/personal | [EXPERIMENTAL] CreatePersonalWorkspace: Create a new personal workspace.
*WorkspaceApi* | [**createSharedItem**](docs/WorkspaceApi.md#createshareditem) | **POST** /api/workspaces/shared/{workspaceName}/items | [EXPERIMENTAL] CreateSharedItem: Create a new item in a shared workspace.
*WorkspaceApi* | [**createSharedWorkspace**](docs/WorkspaceApi.md#createsharedworkspace) | **POST** /api/workspaces/shared | [EXPERIMENTAL] CreateSharedWorkspace: Create a new shared workspace.
*WorkspaceApi* | [**deletePersonalItem**](docs/WorkspaceApi.md#deletepersonalitem) | **DELETE** /api/workspaces/personal/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] DeletePersonalItem: Delete an item from a personal workspace.
*WorkspaceApi* | [**deletePersonalWorkspace**](docs/WorkspaceApi.md#deletepersonalworkspace) | **DELETE** /api/workspaces/personal/{workspaceName} | [EXPERIMENTAL] DeletePersonalWorkspace: Delete a personal workspace.
*WorkspaceApi* | [**deleteSharedItem**](docs/WorkspaceApi.md#deleteshareditem) | **DELETE** /api/workspaces/shared/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] DeleteSharedItem: Delete an item from a shared workspace.
*WorkspaceApi* | [**deleteSharedWorkspace**](docs/WorkspaceApi.md#deletesharedworkspace) | **DELETE** /api/workspaces/shared/{workspaceName} | [EXPERIMENTAL] DeleteSharedWorkspace: Delete a shared workspace.
*WorkspaceApi* | [**getPersonalItem**](docs/WorkspaceApi.md#getpersonalitem) | **GET** /api/workspaces/personal/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] GetPersonalItem: Get a single personal workspace item.
*WorkspaceApi* | [**getPersonalWorkspace**](docs/WorkspaceApi.md#getpersonalworkspace) | **GET** /api/workspaces/personal/{workspaceName} | [EXPERIMENTAL] GetPersonalWorkspace: Get a personal workspace.
*WorkspaceApi* | [**getSharedItem**](docs/WorkspaceApi.md#getshareditem) | **GET** /api/workspaces/shared/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] GetSharedItem: Get a single shared workspace item.
*WorkspaceApi* | [**getSharedWorkspace**](docs/WorkspaceApi.md#getsharedworkspace) | **GET** /api/workspaces/shared/{workspaceName} | [EXPERIMENTAL] GetSharedWorkspace: Get a shared workspace.
*WorkspaceApi* | [**listPersonalItems**](docs/WorkspaceApi.md#listpersonalitems) | **GET** /api/workspaces/personal/{workspaceName}/items | [EXPERIMENTAL] ListPersonalItems: List the items in a personal workspace.
*WorkspaceApi* | [**listPersonalWorkspaces**](docs/WorkspaceApi.md#listpersonalworkspaces) | **GET** /api/workspaces/personal | [EXPERIMENTAL] ListPersonalWorkspaces: List personal workspaces.
*WorkspaceApi* | [**listSharedItems**](docs/WorkspaceApi.md#listshareditems) | **GET** /api/workspaces/shared/{workspaceName}/items | [EXPERIMENTAL] ListSharedItems: List the items in a shared workspace.
*WorkspaceApi* | [**listSharedWorkspaces**](docs/WorkspaceApi.md#listsharedworkspaces) | **GET** /api/workspaces/shared | [EXPERIMENTAL] ListSharedWorkspaces: List shared workspaces.
*WorkspaceApi* | [**updatePersonalItem**](docs/WorkspaceApi.md#updatepersonalitem) | **PUT** /api/workspaces/personal/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] UpdatePersonalItem: Update an item in a personal workspace.
*WorkspaceApi* | [**updatePersonalWorkspace**](docs/WorkspaceApi.md#updatepersonalworkspace) | **PUT** /api/workspaces/personal/{workspaceName} | [EXPERIMENTAL] UpdatePersonalWorkspace: Update a personal workspace.
*WorkspaceApi* | [**updateSharedItem**](docs/WorkspaceApi.md#updateshareditem) | **PUT** /api/workspaces/shared/{workspaceName}/items/{groupName}/{itemName} | [EXPERIMENTAL] UpdateSharedItem: Update an item in a shared workspace.
*WorkspaceApi* | [**updateSharedWorkspace**](docs/WorkspaceApi.md#updatesharedworkspace) | **PUT** /api/workspaces/shared/{workspaceName} | [EXPERIMENTAL] UpdateSharedWorkspace: Update a shared workspace.


<a id="documentation-for-models"></a>
## Documentation for Models

 - [A2BBreakdown](docs/A2BBreakdown.md)
 - [A2BCategory](docs/A2BCategory.md)
 - [A2BDataRecord](docs/A2BDataRecord.md)
 - [A2BMovementRecord](docs/A2BMovementRecord.md)
 - [Abor](docs/Abor.md)
 - [AborConfiguration](docs/AborConfiguration.md)
 - [AborConfigurationProperties](docs/AborConfigurationProperties.md)
 - [AborConfigurationRequest](docs/AborConfigurationRequest.md)
 - [AborProperties](docs/AborProperties.md)
 - [AborRequest](docs/AborRequest.md)
 - [AcceptEstimateValuationPointResponse](docs/AcceptEstimateValuationPointResponse.md)
 - [AccessControlledAction](docs/AccessControlledAction.md)
 - [AccessControlledResource](docs/AccessControlledResource.md)
 - [AccessMetadataOperation](docs/AccessMetadataOperation.md)
 - [AccessMetadataValue](docs/AccessMetadataValue.md)
 - [Account](docs/Account.md)
 - [AccountProperties](docs/AccountProperties.md)
 - [AccountingMethod](docs/AccountingMethod.md)
 - [AccountsUpsertResponse](docs/AccountsUpsertResponse.md)
 - [AccumulationEvent](docs/AccumulationEvent.md)
 - [ActionId](docs/ActionId.md)
 - [AddBusinessDaysToDateRequest](docs/AddBusinessDaysToDateRequest.md)
 - [AddBusinessDaysToDateResponse](docs/AddBusinessDaysToDateResponse.md)
 - [AdditionalPayment](docs/AdditionalPayment.md)
 - [AddressDefinition](docs/AddressDefinition.md)
 - [AddressKeyComplianceParameter](docs/AddressKeyComplianceParameter.md)
 - [AddressKeyDefinition](docs/AddressKeyDefinition.md)
 - [AddressKeyFilter](docs/AddressKeyFilter.md)
 - [AddressKeyList](docs/AddressKeyList.md)
 - [AddressKeyListComplianceParameter](docs/AddressKeyListComplianceParameter.md)
 - [AddressKeyOptionDefinition](docs/AddressKeyOptionDefinition.md)
 - [AdjustGlobalCommitmentEvent](docs/AdjustGlobalCommitmentEvent.md)
 - [AdjustHolding](docs/AdjustHolding.md)
 - [AdjustHoldingForDateRequest](docs/AdjustHoldingForDateRequest.md)
 - [AdjustHoldingRequest](docs/AdjustHoldingRequest.md)
 - [AggregateSpec](docs/AggregateSpec.md)
 - [AggregatedReturn](docs/AggregatedReturn.md)
 - [AggregatedReturnsDispersionRequest](docs/AggregatedReturnsDispersionRequest.md)
 - [AggregatedReturnsRequest](docs/AggregatedReturnsRequest.md)
 - [AggregatedReturnsResponse](docs/AggregatedReturnsResponse.md)
 - [AggregatedTransactionsRequest](docs/AggregatedTransactionsRequest.md)
 - [AggregationContext](docs/AggregationContext.md)
 - [AggregationMeasureFailureDetail](docs/AggregationMeasureFailureDetail.md)
 - [AggregationOp](docs/AggregationOp.md)
 - [AggregationOptions](docs/AggregationOptions.md)
 - [AggregationQuery](docs/AggregationQuery.md)
 - [AggregationType](docs/AggregationType.md)
 - [Allocation](docs/Allocation.md)
 - [AllocationRequest](docs/AllocationRequest.md)
 - [AllocationServiceRunResponse](docs/AllocationServiceRunResponse.md)
 - [AllocationSetRequest](docs/AllocationSetRequest.md)
 - [AmortisationEvent](docs/AmortisationEvent.md)
 - [AmortisationRule](docs/AmortisationRule.md)
 - [AmortisationRuleSet](docs/AmortisationRuleSet.md)
 - [Amount](docs/Amount.md)
 - [AnnulQuotesResponse](docs/AnnulQuotesResponse.md)
 - [AnnulSingleStructuredDataResponse](docs/AnnulSingleStructuredDataResponse.md)
 - [AnnulStructuredDataResponse](docs/AnnulStructuredDataResponse.md)
 - [ApplicableInstrumentEvent](docs/ApplicableInstrumentEvent.md)
 - [AssetClass](docs/AssetClass.md)
 - [AssetLeg](docs/AssetLeg.md)
 - [Barrier](docs/Barrier.md)
 - [Basket](docs/Basket.md)
 - [BasketIdentifier](docs/BasketIdentifier.md)
 - [BatchAdjustHoldingsResponse](docs/BatchAdjustHoldingsResponse.md)
 - [BatchUpdateUserReviewForComparisonResultRequest](docs/BatchUpdateUserReviewForComparisonResultRequest.md)
 - [BatchUpdateUserReviewForComparisonResultResponse](docs/BatchUpdateUserReviewForComparisonResultResponse.md)
 - [BatchUpsertDatesForCalendarResponse](docs/BatchUpsertDatesForCalendarResponse.md)
 - [BatchUpsertInstrumentPropertiesResponse](docs/BatchUpsertInstrumentPropertiesResponse.md)
 - [BatchUpsertPortfolioAccessMetadataRequest](docs/BatchUpsertPortfolioAccessMetadataRequest.md)
 - [BatchUpsertPortfolioAccessMetadataResponse](docs/BatchUpsertPortfolioAccessMetadataResponse.md)
 - [BatchUpsertPortfolioAccessMetadataResponseItem](docs/BatchUpsertPortfolioAccessMetadataResponseItem.md)
 - [BatchUpsertPortfolioTransactionsResponse](docs/BatchUpsertPortfolioTransactionsResponse.md)
 - [BatchUpsertPropertyDefinitionPropertiesResponse](docs/BatchUpsertPropertyDefinitionPropertiesResponse.md)
 - [Block](docs/Block.md)
 - [BlockAndOrderIdRequest](docs/BlockAndOrderIdRequest.md)
 - [BlockAndOrders](docs/BlockAndOrders.md)
 - [BlockAndOrdersCreateRequest](docs/BlockAndOrdersCreateRequest.md)
 - [BlockAndOrdersRequest](docs/BlockAndOrdersRequest.md)
 - [BlockRequest](docs/BlockRequest.md)
 - [BlockSetRequest](docs/BlockSetRequest.md)
 - [BlockedOrderRequest](docs/BlockedOrderRequest.md)
 - [Bond](docs/Bond.md)
 - [BondConversionEntry](docs/BondConversionEntry.md)
 - [BondConversionSchedule](docs/BondConversionSchedule.md)
 - [BondCouponEvent](docs/BondCouponEvent.md)
 - [BondDefaultEvent](docs/BondDefaultEvent.md)
 - [BondPrincipalEvent](docs/BondPrincipalEvent.md)
 - [BonusIssueEvent](docs/BonusIssueEvent.md)
 - [BookTransactionsRequest](docs/BookTransactionsRequest.md)
 - [BookTransactionsResponse](docs/BookTransactionsResponse.md)
 - [BoolComplianceParameter](docs/BoolComplianceParameter.md)
 - [BoolListComplianceParameter](docs/BoolListComplianceParameter.md)
 - [BranchStep](docs/BranchStep.md)
 - [BranchStepRequest](docs/BranchStepRequest.md)
 - [BreakCodeSource](docs/BreakCodeSource.md)
 - [BucketedCashFlowRequest](docs/BucketedCashFlowRequest.md)
 - [BucketedCashFlowResponse](docs/BucketedCashFlowResponse.md)
 - [BucketingSchedule](docs/BucketingSchedule.md)
 - [CalculationInfo](docs/CalculationInfo.md)
 - [Calendar](docs/Calendar.md)
 - [CalendarDate](docs/CalendarDate.md)
 - [CalendarDependency](docs/CalendarDependency.md)
 - [CallOnIntermediateSecuritiesEvent](docs/CallOnIntermediateSecuritiesEvent.md)
 - [CancelOrderAndMoveRemainingResult](docs/CancelOrderAndMoveRemainingResult.md)
 - [CancelOrdersAndMoveRemainingRequest](docs/CancelOrdersAndMoveRemainingRequest.md)
 - [CancelOrdersAndMoveRemainingResponse](docs/CancelOrdersAndMoveRemainingResponse.md)
 - [CancelOrdersResponse](docs/CancelOrdersResponse.md)
 - [CancelPlacementsResponse](docs/CancelPlacementsResponse.md)
 - [CancelledOrderResult](docs/CancelledOrderResult.md)
 - [CancelledPlacementResult](docs/CancelledPlacementResult.md)
 - [CapFloor](docs/CapFloor.md)
 - [CapitalDistributionEvent](docs/CapitalDistributionEvent.md)
 - [Cash](docs/Cash.md)
 - [CashAndSecurityOfferElection](docs/CashAndSecurityOfferElection.md)
 - [CashDependency](docs/CashDependency.md)
 - [CashDividendEvent](docs/CashDividendEvent.md)
 - [CashElection](docs/CashElection.md)
 - [CashFlowEvent](docs/CashFlowEvent.md)
 - [CashFlowLineage](docs/CashFlowLineage.md)
 - [CashFlowValue](docs/CashFlowValue.md)
 - [CashFlowValueSet](docs/CashFlowValueSet.md)
 - [CashLadderRecord](docs/CashLadderRecord.md)
 - [CashOfferElection](docs/CashOfferElection.md)
 - [CashPerpetual](docs/CashPerpetual.md)
 - [CdsCreditEvent](docs/CdsCreditEvent.md)
 - [CdsFlowConventions](docs/CdsFlowConventions.md)
 - [CdsIndex](docs/CdsIndex.md)
 - [CdsProtectionDetailSpecification](docs/CdsProtectionDetailSpecification.md)
 - [CdxCreditEvent](docs/CdxCreditEvent.md)
 - [Change](docs/Change.md)
 - [ChangeHistory](docs/ChangeHistory.md)
 - [ChangeHistoryAction](docs/ChangeHistoryAction.md)
 - [ChangeInterval](docs/ChangeInterval.md)
 - [ChangeIntervalWithOrderManagementDetail](docs/ChangeIntervalWithOrderManagementDetail.md)
 - [ChangeItem](docs/ChangeItem.md)
 - [ChartOfAccounts](docs/ChartOfAccounts.md)
 - [ChartOfAccountsProperties](docs/ChartOfAccountsProperties.md)
 - [ChartOfAccountsRequest](docs/ChartOfAccountsRequest.md)
 - [CheckStep](docs/CheckStep.md)
 - [CheckStepRequest](docs/CheckStepRequest.md)
 - [CleardownModuleDetails](docs/CleardownModuleDetails.md)
 - [CleardownModuleRequest](docs/CleardownModuleRequest.md)
 - [CleardownModuleResponse](docs/CleardownModuleResponse.md)
 - [CleardownModuleRule](docs/CleardownModuleRule.md)
 - [CleardownModuleRulesUpdatedResponse](docs/CleardownModuleRulesUpdatedResponse.md)
 - [Client](docs/Client.md)
 - [CloseEvent](docs/CloseEvent.md)
 - [ClosePeriodDiaryEntryRequest](docs/ClosePeriodDiaryEntryRequest.md)
 - [ComparisonAttributeValuePair](docs/ComparisonAttributeValuePair.md)
 - [CompletePortfolio](docs/CompletePortfolio.md)
 - [CompleteRelation](docs/CompleteRelation.md)
 - [CompleteRelationship](docs/CompleteRelationship.md)
 - [ComplexBond](docs/ComplexBond.md)
 - [ComplexMarketData](docs/ComplexMarketData.md)
 - [ComplexMarketDataId](docs/ComplexMarketDataId.md)
 - [ComplianceBreachedOrderInfo](docs/ComplianceBreachedOrderInfo.md)
 - [ComplianceParameter](docs/ComplianceParameter.md)
 - [ComplianceParameterType](docs/ComplianceParameterType.md)
 - [ComplianceRule](docs/ComplianceRule.md)
 - [ComplianceRuleBreakdown](docs/ComplianceRuleBreakdown.md)
 - [ComplianceRuleBreakdownRequest](docs/ComplianceRuleBreakdownRequest.md)
 - [ComplianceRuleResponse](docs/ComplianceRuleResponse.md)
 - [ComplianceRuleResult](docs/ComplianceRuleResult.md)
 - [ComplianceRuleResultDetail](docs/ComplianceRuleResultDetail.md)
 - [ComplianceRuleResultPortfolioDetail](docs/ComplianceRuleResultPortfolioDetail.md)
 - [ComplianceRuleResultV2](docs/ComplianceRuleResultV2.md)
 - [ComplianceRuleTemplate](docs/ComplianceRuleTemplate.md)
 - [ComplianceRuleUpsertRequest](docs/ComplianceRuleUpsertRequest.md)
 - [ComplianceRuleUpsertResponse](docs/ComplianceRuleUpsertResponse.md)
 - [ComplianceRunConfiguration](docs/ComplianceRunConfiguration.md)
 - [ComplianceRunInfo](docs/ComplianceRunInfo.md)
 - [ComplianceRunInfoV2](docs/ComplianceRunInfoV2.md)
 - [ComplianceStep](docs/ComplianceStep.md)
 - [ComplianceStepRequest](docs/ComplianceStepRequest.md)
 - [ComplianceStepType](docs/ComplianceStepType.md)
 - [ComplianceStepTypeRequest](docs/ComplianceStepTypeRequest.md)
 - [ComplianceSummaryRuleResult](docs/ComplianceSummaryRuleResult.md)
 - [ComplianceSummaryRuleResultRequest](docs/ComplianceSummaryRuleResultRequest.md)
 - [ComplianceTemplate](docs/ComplianceTemplate.md)
 - [ComplianceTemplateParameter](docs/ComplianceTemplateParameter.md)
 - [ComplianceTemplateVariation](docs/ComplianceTemplateVariation.md)
 - [ComplianceTemplateVariationDto](docs/ComplianceTemplateVariationDto.md)
 - [ComplianceTemplateVariationRequest](docs/ComplianceTemplateVariationRequest.md)
 - [ComponentFilter](docs/ComponentFilter.md)
 - [ComponentTransaction](docs/ComponentTransaction.md)
 - [CompositeBreakdown](docs/CompositeBreakdown.md)
 - [CompositeBreakdownRequest](docs/CompositeBreakdownRequest.md)
 - [CompositeBreakdownResponse](docs/CompositeBreakdownResponse.md)
 - [CompositeDispersion](docs/CompositeDispersion.md)
 - [CompositeDispersionResponse](docs/CompositeDispersionResponse.md)
 - [Compounding](docs/Compounding.md)
 - [ConfigurationRecipe](docs/ConfigurationRecipe.md)
 - [ConstantVolatilitySurface](docs/ConstantVolatilitySurface.md)
 - [ConstituentsAdjustmentHeader](docs/ConstituentsAdjustmentHeader.md)
 - [ContractDetails](docs/ContractDetails.md)
 - [ContractForDifference](docs/ContractForDifference.md)
 - [ContractInitialisationEvent](docs/ContractInitialisationEvent.md)
 - [ContributionToNonPassingRuleDetail](docs/ContributionToNonPassingRuleDetail.md)
 - [CorporateAction](docs/CorporateAction.md)
 - [CorporateActionSource](docs/CorporateActionSource.md)
 - [CorporateActionTransition](docs/CorporateActionTransition.md)
 - [CorporateActionTransitionComponent](docs/CorporateActionTransitionComponent.md)
 - [CorporateActionTransitionComponentRequest](docs/CorporateActionTransitionComponentRequest.md)
 - [CorporateActionTransitionRequest](docs/CorporateActionTransitionRequest.md)
 - [CounterpartyAgreement](docs/CounterpartyAgreement.md)
 - [CounterpartyRiskInformation](docs/CounterpartyRiskInformation.md)
 - [CounterpartySignatory](docs/CounterpartySignatory.md)
 - [CreateAddressKeyDefinitionRequest](docs/CreateAddressKeyDefinitionRequest.md)
 - [CreateAmortisationRuleSetRequest](docs/CreateAmortisationRuleSetRequest.md)
 - [CreateCalendarRequest](docs/CreateCalendarRequest.md)
 - [CreateComplianceTemplateRequest](docs/CreateComplianceTemplateRequest.md)
 - [CreateCorporateActionSourceRequest](docs/CreateCorporateActionSourceRequest.md)
 - [CreateCustomEntityTypeRequest](docs/CreateCustomEntityTypeRequest.md)
 - [CreateCutLabelDefinitionRequest](docs/CreateCutLabelDefinitionRequest.md)
 - [CreateDataMapRequest](docs/CreateDataMapRequest.md)
 - [CreateDataTypeRequest](docs/CreateDataTypeRequest.md)
 - [CreateDateRequest](docs/CreateDateRequest.md)
 - [CreateDerivedPropertyDefinitionRequest](docs/CreateDerivedPropertyDefinitionRequest.md)
 - [CreateDerivedTransactionPortfolioRequest](docs/CreateDerivedTransactionPortfolioRequest.md)
 - [CreateGroupReconciliationComparisonRulesetRequest](docs/CreateGroupReconciliationComparisonRulesetRequest.md)
 - [CreateGroupReconciliationDefinitionRequest](docs/CreateGroupReconciliationDefinitionRequest.md)
 - [CreatePortfolioDetails](docs/CreatePortfolioDetails.md)
 - [CreatePortfolioGroupRequest](docs/CreatePortfolioGroupRequest.md)
 - [CreatePropertyDefinitionRequest](docs/CreatePropertyDefinitionRequest.md)
 - [CreateRecipeRequest](docs/CreateRecipeRequest.md)
 - [CreateReconciliationRequest](docs/CreateReconciliationRequest.md)
 - [CreateReferencePortfolioRequest](docs/CreateReferencePortfolioRequest.md)
 - [CreateRelationDefinitionRequest](docs/CreateRelationDefinitionRequest.md)
 - [CreateRelationRequest](docs/CreateRelationRequest.md)
 - [CreateRelationshipDefinitionRequest](docs/CreateRelationshipDefinitionRequest.md)
 - [CreateRelationshipRequest](docs/CreateRelationshipRequest.md)
 - [CreateSequenceRequest](docs/CreateSequenceRequest.md)
 - [CreateStagingRuleSetRequest](docs/CreateStagingRuleSetRequest.md)
 - [CreateTaxRuleSetRequest](docs/CreateTaxRuleSetRequest.md)
 - [CreateTimelineRequest](docs/CreateTimelineRequest.md)
 - [CreateTradeTicketsResponse](docs/CreateTradeTicketsResponse.md)
 - [CreateTransactionPortfolioRequest](docs/CreateTransactionPortfolioRequest.md)
 - [CreateUnitDefinition](docs/CreateUnitDefinition.md)
 - [CreditDefaultSwap](docs/CreditDefaultSwap.md)
 - [CreditPremiumCashFlowEvent](docs/CreditPremiumCashFlowEvent.md)
 - [CreditRating](docs/CreditRating.md)
 - [CreditSpreadCurveData](docs/CreditSpreadCurveData.md)
 - [CreditSupportAnnex](docs/CreditSupportAnnex.md)
 - [CriterionType](docs/CriterionType.md)
 - [CurrencyAndAmount](docs/CurrencyAndAmount.md)
 - [CurveOptions](docs/CurveOptions.md)
 - [CustodianAccount](docs/CustodianAccount.md)
 - [CustodianAccountProperties](docs/CustodianAccountProperties.md)
 - [CustodianAccountRequest](docs/CustodianAccountRequest.md)
 - [CustodianAccountsUpsertResponse](docs/CustodianAccountsUpsertResponse.md)
 - [CustomEntityDefinition](docs/CustomEntityDefinition.md)
 - [CustomEntityDefinitionRequest](docs/CustomEntityDefinitionRequest.md)
 - [CustomEntityEntity](docs/CustomEntityEntity.md)
 - [CustomEntityField](docs/CustomEntityField.md)
 - [CustomEntityFieldDefinition](docs/CustomEntityFieldDefinition.md)
 - [CustomEntityId](docs/CustomEntityId.md)
 - [CustomEntityRequest](docs/CustomEntityRequest.md)
 - [CustomEntityResponse](docs/CustomEntityResponse.md)
 - [CustomEntityType](docs/CustomEntityType.md)
 - [CutLabelDefinition](docs/CutLabelDefinition.md)
 - [CutLocalTime](docs/CutLocalTime.md)
 - [DataDefinition](docs/DataDefinition.md)
 - [DataMapKey](docs/DataMapKey.md)
 - [DataMapping](docs/DataMapping.md)
 - [DataScope](docs/DataScope.md)
 - [DataType](docs/DataType.md)
 - [DataTypeEntity](docs/DataTypeEntity.md)
 - [DataTypeSummary](docs/DataTypeSummary.md)
 - [DataTypeValueRange](docs/DataTypeValueRange.md)
 - [DateAttributes](docs/DateAttributes.md)
 - [DateOrDiaryEntry](docs/DateOrDiaryEntry.md)
 - [DateRange](docs/DateRange.md)
 - [DateTimeComparisonType](docs/DateTimeComparisonType.md)
 - [DateTimeComplianceParameter](docs/DateTimeComplianceParameter.md)
 - [DateTimeListComplianceParameter](docs/DateTimeListComplianceParameter.md)
 - [DayMonth](docs/DayMonth.md)
 - [DayOfWeek](docs/DayOfWeek.md)
 - [DecimalComplianceParameter](docs/DecimalComplianceParameter.md)
 - [DecimalList](docs/DecimalList.md)
 - [DecimalListComplianceParameter](docs/DecimalListComplianceParameter.md)
 - [DecoratedComplianceRunSummary](docs/DecoratedComplianceRunSummary.md)
 - [DeleteAccountsResponse](docs/DeleteAccountsResponse.md)
 - [DeleteCustodianAccountsResponse](docs/DeleteCustodianAccountsResponse.md)
 - [DeleteInstrumentPropertiesResponse](docs/DeleteInstrumentPropertiesResponse.md)
 - [DeleteInstrumentResponse](docs/DeleteInstrumentResponse.md)
 - [DeleteInstrumentsResponse](docs/DeleteInstrumentsResponse.md)
 - [DeleteModes](docs/DeleteModes.md)
 - [DeleteRelationRequest](docs/DeleteRelationRequest.md)
 - [DeleteRelationshipRequest](docs/DeleteRelationshipRequest.md)
 - [DeletedEntityResponse](docs/DeletedEntityResponse.md)
 - [DependencySourceFilter](docs/DependencySourceFilter.md)
 - [DescribedAddressKey](docs/DescribedAddressKey.md)
 - [Dialect](docs/Dialect.md)
 - [DialectId](docs/DialectId.md)
 - [DialectSchema](docs/DialectSchema.md)
 - [DiaryEntry](docs/DiaryEntry.md)
 - [DiaryEntryRequest](docs/DiaryEntryRequest.md)
 - [DiscountFactorCurveData](docs/DiscountFactorCurveData.md)
 - [DiscountingDependency](docs/DiscountingDependency.md)
 - [DiscountingMethod](docs/DiscountingMethod.md)
 - [DividendOptionEvent](docs/DividendOptionEvent.md)
 - [DividendReinvestmentEvent](docs/DividendReinvestmentEvent.md)
 - [DrawdownEvent](docs/DrawdownEvent.md)
 - [EarlyRedemptionElection](docs/EarlyRedemptionElection.md)
 - [EarlyRedemptionEvent](docs/EarlyRedemptionEvent.md)
 - [EconomicDependency](docs/EconomicDependency.md)
 - [EconomicDependencyType](docs/EconomicDependencyType.md)
 - [EconomicDependencyWithComplexMarketData](docs/EconomicDependencyWithComplexMarketData.md)
 - [EconomicDependencyWithQuote](docs/EconomicDependencyWithQuote.md)
 - [EffectiveRange](docs/EffectiveRange.md)
 - [ElectionSpecification](docs/ElectionSpecification.md)
 - [EligibilityCalculation](docs/EligibilityCalculation.md)
 - [EmptyModelOptions](docs/EmptyModelOptions.md)
 - [EntityIdentifier](docs/EntityIdentifier.md)
 - [Equity](docs/Equity.md)
 - [EquityAllOfIdentifiers](docs/EquityAllOfIdentifiers.md)
 - [EquityCurveByPricesData](docs/EquityCurveByPricesData.md)
 - [EquityCurveDependency](docs/EquityCurveDependency.md)
 - [EquityModelOptions](docs/EquityModelOptions.md)
 - [EquityOption](docs/EquityOption.md)
 - [EquitySwap](docs/EquitySwap.md)
 - [EquityVolDependency](docs/EquityVolDependency.md)
 - [EquityVolSurfaceData](docs/EquityVolSurfaceData.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [EventDateRange](docs/EventDateRange.md)
 - [ExDividendConfiguration](docs/ExDividendConfiguration.md)
 - [ExchangeTradedOption](docs/ExchangeTradedOption.md)
 - [ExchangeTradedOptionContractDetails](docs/ExchangeTradedOptionContractDetails.md)
 - [Execution](docs/Execution.md)
 - [ExecutionRequest](docs/ExecutionRequest.md)
 - [ExecutionSetRequest](docs/ExecutionSetRequest.md)
 - [ExerciseEvent](docs/ExerciseEvent.md)
 - [ExoticInstrument](docs/ExoticInstrument.md)
 - [ExpandedGroup](docs/ExpandedGroup.md)
 - [ExpiryEvent](docs/ExpiryEvent.md)
 - [ExternalFeeComponentFilter](docs/ExternalFeeComponentFilter.md)
 - [Fee](docs/Fee.md)
 - [FeeAccrual](docs/FeeAccrual.md)
 - [FeeProperties](docs/FeeProperties.md)
 - [FeeRequest](docs/FeeRequest.md)
 - [FeeRule](docs/FeeRule.md)
 - [FeeRuleUpsertRequest](docs/FeeRuleUpsertRequest.md)
 - [FeeRuleUpsertResponse](docs/FeeRuleUpsertResponse.md)
 - [FeeTransactionTemplateSpecification](docs/FeeTransactionTemplateSpecification.md)
 - [FeeType](docs/FeeType.md)
 - [FeeTypeRequest](docs/FeeTypeRequest.md)
 - [FieldDefinition](docs/FieldDefinition.md)
 - [FieldSchema](docs/FieldSchema.md)
 - [FieldValue](docs/FieldValue.md)
 - [FileResponse](docs/FileResponse.md)
 - [FilterPredicateComplianceParameter](docs/FilterPredicateComplianceParameter.md)
 - [FilterStep](docs/FilterStep.md)
 - [FilterStepRequest](docs/FilterStepRequest.md)
 - [FixedLeg](docs/FixedLeg.md)
 - [FixedLegAllOfOverrides](docs/FixedLegAllOfOverrides.md)
 - [FixedSchedule](docs/FixedSchedule.md)
 - [FlexibleDeposit](docs/FlexibleDeposit.md)
 - [FlexibleLoan](docs/FlexibleLoan.md)
 - [FloatSchedule](docs/FloatSchedule.md)
 - [FloatingLeg](docs/FloatingLeg.md)
 - [FlowConventionName](docs/FlowConventionName.md)
 - [FlowConventions](docs/FlowConventions.md)
 - [ForwardRateAgreement](docs/ForwardRateAgreement.md)
 - [FromRecipe](docs/FromRecipe.md)
 - [Fund](docs/Fund.md)
 - [FundAmount](docs/FundAmount.md)
 - [FundConfiguration](docs/FundConfiguration.md)
 - [FundConfigurationProperties](docs/FundConfigurationProperties.md)
 - [FundConfigurationRequest](docs/FundConfigurationRequest.md)
 - [FundDetails](docs/FundDetails.md)
 - [FundIdList](docs/FundIdList.md)
 - [FundPnlBreakdown](docs/FundPnlBreakdown.md)
 - [FundPreviousNAV](docs/FundPreviousNAV.md)
 - [FundProperties](docs/FundProperties.md)
 - [FundRequest](docs/FundRequest.md)
 - [FundShareClass](docs/FundShareClass.md)
 - [FundValuationPointData](docs/FundValuationPointData.md)
 - [FundingLeg](docs/FundingLeg.md)
 - [FundingLegOptions](docs/FundingLegOptions.md)
 - [Future](docs/Future.md)
 - [FutureExpiryEvent](docs/FutureExpiryEvent.md)
 - [FutureMarkToMarketEvent](docs/FutureMarkToMarketEvent.md)
 - [FuturesContractDetails](docs/FuturesContractDetails.md)
 - [FxConventions](docs/FxConventions.md)
 - [FxDependency](docs/FxDependency.md)
 - [FxForward](docs/FxForward.md)
 - [FxForwardCurveByQuoteReference](docs/FxForwardCurveByQuoteReference.md)
 - [FxForwardCurveData](docs/FxForwardCurveData.md)
 - [FxForwardModelOptions](docs/FxForwardModelOptions.md)
 - [FxForwardPipsCurveData](docs/FxForwardPipsCurveData.md)
 - [FxForwardSettlementEvent](docs/FxForwardSettlementEvent.md)
 - [FxForwardTenorCurveData](docs/FxForwardTenorCurveData.md)
 - [FxForwardTenorPipsCurveData](docs/FxForwardTenorPipsCurveData.md)
 - [FxForwardsDependency](docs/FxForwardsDependency.md)
 - [FxLinkedNotionalSchedule](docs/FxLinkedNotionalSchedule.md)
 - [FxOption](docs/FxOption.md)
 - [FxRateSchedule](docs/FxRateSchedule.md)
 - [FxSwap](docs/FxSwap.md)
 - [FxTenorConvention](docs/FxTenorConvention.md)
 - [FxVolDependency](docs/FxVolDependency.md)
 - [FxVolSurfaceData](docs/FxVolSurfaceData.md)
 - [GeneralLedgerProfileMapping](docs/GeneralLedgerProfileMapping.md)
 - [GeneralLedgerProfileRequest](docs/GeneralLedgerProfileRequest.md)
 - [GeneralLedgerProfileResponse](docs/GeneralLedgerProfileResponse.md)
 - [GeneratedEventDiagnostics](docs/GeneratedEventDiagnostics.md)
 - [GetCdsFlowConventionsResponse](docs/GetCdsFlowConventionsResponse.md)
 - [GetComplexMarketDataResponse](docs/GetComplexMarketDataResponse.md)
 - [GetCounterpartyAgreementResponse](docs/GetCounterpartyAgreementResponse.md)
 - [GetCreditSupportAnnexResponse](docs/GetCreditSupportAnnexResponse.md)
 - [GetDataMapResponse](docs/GetDataMapResponse.md)
 - [GetFlowConventionsResponse](docs/GetFlowConventionsResponse.md)
 - [GetIndexConventionResponse](docs/GetIndexConventionResponse.md)
 - [GetInstrumentsResponse](docs/GetInstrumentsResponse.md)
 - [GetQuotesResponse](docs/GetQuotesResponse.md)
 - [GetRecipeComposerResponse](docs/GetRecipeComposerResponse.md)
 - [GetRecipeResponse](docs/GetRecipeResponse.md)
 - [GetReferencePortfolioConstituentsResponse](docs/GetReferencePortfolioConstituentsResponse.md)
 - [GetStructuredResultDataResponse](docs/GetStructuredResultDataResponse.md)
 - [GetVirtualDocumentResponse](docs/GetVirtualDocumentResponse.md)
 - [GroupBySelectorComplianceParameter](docs/GroupBySelectorComplianceParameter.md)
 - [GroupByStep](docs/GroupByStep.md)
 - [GroupByStepRequest](docs/GroupByStepRequest.md)
 - [GroupCalculationComplianceParameter](docs/GroupCalculationComplianceParameter.md)
 - [GroupFilterPredicateComplianceParameter](docs/GroupFilterPredicateComplianceParameter.md)
 - [GroupFilterStep](docs/GroupFilterStep.md)
 - [GroupFilterStepRequest](docs/GroupFilterStepRequest.md)
 - [GroupOfMarketDataKeyRules](docs/GroupOfMarketDataKeyRules.md)
 - [GroupReconciliationAggregateAttributeRule](docs/GroupReconciliationAggregateAttributeRule.md)
 - [GroupReconciliationAggregateAttributeValues](docs/GroupReconciliationAggregateAttributeValues.md)
 - [GroupReconciliationAggregateComparisonRuleOperand](docs/GroupReconciliationAggregateComparisonRuleOperand.md)
 - [GroupReconciliationComparisonResult](docs/GroupReconciliationComparisonResult.md)
 - [GroupReconciliationComparisonRuleStringValueMap](docs/GroupReconciliationComparisonRuleStringValueMap.md)
 - [GroupReconciliationComparisonRuleTolerance](docs/GroupReconciliationComparisonRuleTolerance.md)
 - [GroupReconciliationComparisonRuleset](docs/GroupReconciliationComparisonRuleset.md)
 - [GroupReconciliationCoreAttributeRule](docs/GroupReconciliationCoreAttributeRule.md)
 - [GroupReconciliationCoreAttributeValues](docs/GroupReconciliationCoreAttributeValues.md)
 - [GroupReconciliationCoreComparisonRuleOperand](docs/GroupReconciliationCoreComparisonRuleOperand.md)
 - [GroupReconciliationDatePair](docs/GroupReconciliationDatePair.md)
 - [GroupReconciliationDates](docs/GroupReconciliationDates.md)
 - [GroupReconciliationDefinition](docs/GroupReconciliationDefinition.md)
 - [GroupReconciliationDefinitionComparisonRulesetIds](docs/GroupReconciliationDefinitionComparisonRulesetIds.md)
 - [GroupReconciliationDefinitionCurrencies](docs/GroupReconciliationDefinitionCurrencies.md)
 - [GroupReconciliationDefinitionPortfolioEntityIds](docs/GroupReconciliationDefinitionPortfolioEntityIds.md)
 - [GroupReconciliationDefinitionRecipeIds](docs/GroupReconciliationDefinitionRecipeIds.md)
 - [GroupReconciliationInstanceId](docs/GroupReconciliationInstanceId.md)
 - [GroupReconciliationResultStatuses](docs/GroupReconciliationResultStatuses.md)
 - [GroupReconciliationResultTypes](docs/GroupReconciliationResultTypes.md)
 - [GroupReconciliationReviewStatuses](docs/GroupReconciliationReviewStatuses.md)
 - [GroupReconciliationRunDetails](docs/GroupReconciliationRunDetails.md)
 - [GroupReconciliationRunRequest](docs/GroupReconciliationRunRequest.md)
 - [GroupReconciliationRunResponse](docs/GroupReconciliationRunResponse.md)
 - [GroupReconciliationSummary](docs/GroupReconciliationSummary.md)
 - [GroupReconciliationUserReview](docs/GroupReconciliationUserReview.md)
 - [GroupReconciliationUserReviewAdd](docs/GroupReconciliationUserReviewAdd.md)
 - [GroupReconciliationUserReviewBreakCode](docs/GroupReconciliationUserReviewBreakCode.md)
 - [GroupReconciliationUserReviewComment](docs/GroupReconciliationUserReviewComment.md)
 - [GroupReconciliationUserReviewMatchKey](docs/GroupReconciliationUserReviewMatchKey.md)
 - [GroupReconciliationUserReviewRemove](docs/GroupReconciliationUserReviewRemove.md)
 - [GroupedResultOfAddressKey](docs/GroupedResultOfAddressKey.md)
 - [HoldingAdjustment](docs/HoldingAdjustment.md)
 - [HoldingAdjustmentWithDate](docs/HoldingAdjustmentWithDate.md)
 - [HoldingContext](docs/HoldingContext.md)
 - [HoldingContributor](docs/HoldingContributor.md)
 - [HoldingIdsRequest](docs/HoldingIdsRequest.md)
 - [HoldingPricingInfo](docs/HoldingPricingInfo.md)
 - [HoldingsAdjustment](docs/HoldingsAdjustment.md)
 - [HoldingsAdjustmentHeader](docs/HoldingsAdjustmentHeader.md)
 - [IUnitDefinitionDto](docs/IUnitDefinitionDto.md)
 - [IdSelectorDefinition](docs/IdSelectorDefinition.md)
 - [IdentifierPartSchema](docs/IdentifierPartSchema.md)
 - [IndexConvention](docs/IndexConvention.md)
 - [IndexModelOptions](docs/IndexModelOptions.md)
 - [IndexProjectionDependency](docs/IndexProjectionDependency.md)
 - [IndustryClassifier](docs/IndustryClassifier.md)
 - [InflationFixingDependency](docs/InflationFixingDependency.md)
 - [InflationIndexConventions](docs/InflationIndexConventions.md)
 - [InflationLeg](docs/InflationLeg.md)
 - [InflationLinkedBond](docs/InflationLinkedBond.md)
 - [InflationSwap](docs/InflationSwap.md)
 - [InformationalErrorEvent](docs/InformationalErrorEvent.md)
 - [InformationalEvent](docs/InformationalEvent.md)
 - [InlineValuationRequest](docs/InlineValuationRequest.md)
 - [InlineValuationsReconciliationRequest](docs/InlineValuationsReconciliationRequest.md)
 - [InputTransition](docs/InputTransition.md)
 - [Instrument](docs/Instrument.md)
 - [InstrumentCapabilities](docs/InstrumentCapabilities.md)
 - [InstrumentCashFlow](docs/InstrumentCashFlow.md)
 - [InstrumentDefinition](docs/InstrumentDefinition.md)
 - [InstrumentDefinitionFormat](docs/InstrumentDefinitionFormat.md)
 - [InstrumentDeleteModes](docs/InstrumentDeleteModes.md)
 - [InstrumentEntity](docs/InstrumentEntity.md)
 - [InstrumentEvent](docs/InstrumentEvent.md)
 - [InstrumentEventConfiguration](docs/InstrumentEventConfiguration.md)
 - [InstrumentEventHolder](docs/InstrumentEventHolder.md)
 - [InstrumentEventInstruction](docs/InstrumentEventInstruction.md)
 - [InstrumentEventInstructionRequest](docs/InstrumentEventInstructionRequest.md)
 - [InstrumentEventInstructionsResponse](docs/InstrumentEventInstructionsResponse.md)
 - [InstrumentEventType](docs/InstrumentEventType.md)
 - [InstrumentIdTypeDescriptor](docs/InstrumentIdTypeDescriptor.md)
 - [InstrumentIdValue](docs/InstrumentIdValue.md)
 - [InstrumentLeg](docs/InstrumentLeg.md)
 - [InstrumentList](docs/InstrumentList.md)
 - [InstrumentListComplianceParameter](docs/InstrumentListComplianceParameter.md)
 - [InstrumentMatch](docs/InstrumentMatch.md)
 - [InstrumentModels](docs/InstrumentModels.md)
 - [InstrumentPaymentDiary](docs/InstrumentPaymentDiary.md)
 - [InstrumentPaymentDiaryLeg](docs/InstrumentPaymentDiaryLeg.md)
 - [InstrumentPaymentDiaryRow](docs/InstrumentPaymentDiaryRow.md)
 - [InstrumentProperties](docs/InstrumentProperties.md)
 - [InstrumentResolutionDetail](docs/InstrumentResolutionDetail.md)
 - [InstrumentSearchProperty](docs/InstrumentSearchProperty.md)
 - [InstrumentType](docs/InstrumentType.md)
 - [InterestRateSwap](docs/InterestRateSwap.md)
 - [InterestRateSwaption](docs/InterestRateSwaption.md)
 - [IntermediateComplianceStep](docs/IntermediateComplianceStep.md)
 - [IntermediateComplianceStepRequest](docs/IntermediateComplianceStepRequest.md)
 - [IntermediateSecuritiesDistributionEvent](docs/IntermediateSecuritiesDistributionEvent.md)
 - [IrVolCubeData](docs/IrVolCubeData.md)
 - [IrVolDependency](docs/IrVolDependency.md)
 - [IsBusinessDayResponse](docs/IsBusinessDayResponse.md)
 - [JournalEntryLine](docs/JournalEntryLine.md)
 - [JournalEntryLinesQueryParameters](docs/JournalEntryLinesQueryParameters.md)
 - [LabelValueSet](docs/LabelValueSet.md)
 - [LapseElection](docs/LapseElection.md)
 - [LegDefinition](docs/LegDefinition.md)
 - [LegalEntity](docs/LegalEntity.md)
 - [LevelStep](docs/LevelStep.md)
 - [LifeCycleEventLineage](docs/LifeCycleEventLineage.md)
 - [LifeCycleEventValue](docs/LifeCycleEventValue.md)
 - [LineageMember](docs/LineageMember.md)
 - [Link](docs/Link.md)
 - [ListAggregationReconciliation](docs/ListAggregationReconciliation.md)
 - [ListAggregationResponse](docs/ListAggregationResponse.md)
 - [ListComplexMarketDataWithMetaDataResponse](docs/ListComplexMarketDataWithMetaDataResponse.md)
 - [LoanFacility](docs/LoanFacility.md)
 - [LoanPeriod](docs/LoanPeriod.md)
 - [LockPeriodDiaryEntryRequest](docs/LockPeriodDiaryEntryRequest.md)
 - [LusidInstrument](docs/LusidInstrument.md)
 - [LusidProblemDetails](docs/LusidProblemDetails.md)
 - [LusidTradeTicket](docs/LusidTradeTicket.md)
 - [LusidUniqueId](docs/LusidUniqueId.md)
 - [LusidValidationProblemDetails](docs/LusidValidationProblemDetails.md)
 - [MappedString](docs/MappedString.md)
 - [Mapping](docs/Mapping.md)
 - [MappingRule](docs/MappingRule.md)
 - [MarketContext](docs/MarketContext.md)
 - [MarketContextSuppliers](docs/MarketContextSuppliers.md)
 - [MarketDataKeyRule](docs/MarketDataKeyRule.md)
 - [MarketDataOptions](docs/MarketDataOptions.md)
 - [MarketDataOptionsType](docs/MarketDataOptionsType.md)
 - [MarketDataOverrides](docs/MarketDataOverrides.md)
 - [MarketDataSpecificRule](docs/MarketDataSpecificRule.md)
 - [MarketDataType](docs/MarketDataType.md)
 - [MarketObservableType](docs/MarketObservableType.md)
 - [MarketOptions](docs/MarketOptions.md)
 - [MarketQuote](docs/MarketQuote.md)
 - [MasteredInstrument](docs/MasteredInstrument.md)
 - [MatchCriterion](docs/MatchCriterion.md)
 - [MaturityEvent](docs/MaturityEvent.md)
 - [MbsCouponEvent](docs/MbsCouponEvent.md)
 - [MbsInterestDeferralEvent](docs/MbsInterestDeferralEvent.md)
 - [MbsInterestShortfallEvent](docs/MbsInterestShortfallEvent.md)
 - [MbsPrincipalEvent](docs/MbsPrincipalEvent.md)
 - [MbsPrincipalWriteOffEvent](docs/MbsPrincipalWriteOffEvent.md)
 - [MergerEvent](docs/MergerEvent.md)
 - [MetricValue](docs/MetricValue.md)
 - [ModelOptions](docs/ModelOptions.md)
 - [ModelOptionsType](docs/ModelOptionsType.md)
 - [ModelPackage](docs/ModelPackage.md)
 - [ModelSelection](docs/ModelSelection.md)
 - [MoveOrdersToDifferentBlocksRequest](docs/MoveOrdersToDifferentBlocksRequest.md)
 - [MovedOrderToDifferentBlockResponse](docs/MovedOrderToDifferentBlockResponse.md)
 - [MovementType](docs/MovementType.md)
 - [MultiCurrencyAmounts](docs/MultiCurrencyAmounts.md)
 - [NewInstrument](docs/NewInstrument.md)
 - [NextValueInSequenceResponse](docs/NextValueInSequenceResponse.md)
 - [NumericComparisonType](docs/NumericComparisonType.md)
 - [OpaqueDependency](docs/OpaqueDependency.md)
 - [OpaqueMarketData](docs/OpaqueMarketData.md)
 - [OpaqueModelOptions](docs/OpaqueModelOptions.md)
 - [OpenEvent](docs/OpenEvent.md)
 - [OperandType](docs/OperandType.md)
 - [Operation](docs/Operation.md)
 - [OperationType](docs/OperationType.md)
 - [Operator](docs/Operator.md)
 - [OptionEntry](docs/OptionEntry.md)
 - [OptionExerciseCashEvent](docs/OptionExerciseCashEvent.md)
 - [OptionExerciseElection](docs/OptionExerciseElection.md)
 - [OptionExercisePhysicalEvent](docs/OptionExercisePhysicalEvent.md)
 - [OptionalitySchedule](docs/OptionalitySchedule.md)
 - [Order](docs/Order.md)
 - [OrderBySpec](docs/OrderBySpec.md)
 - [OrderFlowConfiguration](docs/OrderFlowConfiguration.md)
 - [OrderGraphBlock](docs/OrderGraphBlock.md)
 - [OrderGraphBlockAllocationDetail](docs/OrderGraphBlockAllocationDetail.md)
 - [OrderGraphBlockAllocationSynopsis](docs/OrderGraphBlockAllocationSynopsis.md)
 - [OrderGraphBlockExecutionDetail](docs/OrderGraphBlockExecutionDetail.md)
 - [OrderGraphBlockExecutionSynopsis](docs/OrderGraphBlockExecutionSynopsis.md)
 - [OrderGraphBlockOrderDetail](docs/OrderGraphBlockOrderDetail.md)
 - [OrderGraphBlockOrderSynopsis](docs/OrderGraphBlockOrderSynopsis.md)
 - [OrderGraphBlockPlacementDetail](docs/OrderGraphBlockPlacementDetail.md)
 - [OrderGraphBlockPlacementSynopsis](docs/OrderGraphBlockPlacementSynopsis.md)
 - [OrderGraphBlockTransactionDetail](docs/OrderGraphBlockTransactionDetail.md)
 - [OrderGraphBlockTransactionSynopsis](docs/OrderGraphBlockTransactionSynopsis.md)
 - [OrderGraphPlacement](docs/OrderGraphPlacement.md)
 - [OrderGraphPlacementAllocationDetail](docs/OrderGraphPlacementAllocationDetail.md)
 - [OrderGraphPlacementAllocationSynopsis](docs/OrderGraphPlacementAllocationSynopsis.md)
 - [OrderGraphPlacementChildPlacementDetail](docs/OrderGraphPlacementChildPlacementDetail.md)
 - [OrderGraphPlacementExecutionDetail](docs/OrderGraphPlacementExecutionDetail.md)
 - [OrderGraphPlacementExecutionSynopsis](docs/OrderGraphPlacementExecutionSynopsis.md)
 - [OrderGraphPlacementOrderDetail](docs/OrderGraphPlacementOrderDetail.md)
 - [OrderGraphPlacementOrderSynopsis](docs/OrderGraphPlacementOrderSynopsis.md)
 - [OrderGraphPlacementPlacementSynopsis](docs/OrderGraphPlacementPlacementSynopsis.md)
 - [OrderInstruction](docs/OrderInstruction.md)
 - [OrderInstructionRequest](docs/OrderInstructionRequest.md)
 - [OrderInstructionSetRequest](docs/OrderInstructionSetRequest.md)
 - [OrderRequest](docs/OrderRequest.md)
 - [OrderSetRequest](docs/OrderSetRequest.md)
 - [OrderUpdateRequest](docs/OrderUpdateRequest.md)
 - [OtcConfirmation](docs/OtcConfirmation.md)
 - [OutputTransaction](docs/OutputTransaction.md)
 - [OutputTransition](docs/OutputTransition.md)
 - [PackageRequest](docs/PackageRequest.md)
 - [PackageSetRequest](docs/PackageSetRequest.md)
 - [PagedResourceListOfAbor](docs/PagedResourceListOfAbor.md)
 - [PagedResourceListOfAborConfiguration](docs/PagedResourceListOfAborConfiguration.md)
 - [PagedResourceListOfAccount](docs/PagedResourceListOfAccount.md)
 - [PagedResourceListOfAddressKeyDefinition](docs/PagedResourceListOfAddressKeyDefinition.md)
 - [PagedResourceListOfAllocation](docs/PagedResourceListOfAllocation.md)
 - [PagedResourceListOfAmortisationRuleSet](docs/PagedResourceListOfAmortisationRuleSet.md)
 - [PagedResourceListOfBlock](docs/PagedResourceListOfBlock.md)
 - [PagedResourceListOfCalendar](docs/PagedResourceListOfCalendar.md)
 - [PagedResourceListOfChartOfAccounts](docs/PagedResourceListOfChartOfAccounts.md)
 - [PagedResourceListOfCleardownModuleResponse](docs/PagedResourceListOfCleardownModuleResponse.md)
 - [PagedResourceListOfCleardownModuleRule](docs/PagedResourceListOfCleardownModuleRule.md)
 - [PagedResourceListOfComplianceRuleResponse](docs/PagedResourceListOfComplianceRuleResponse.md)
 - [PagedResourceListOfComplianceRunInfoV2](docs/PagedResourceListOfComplianceRunInfoV2.md)
 - [PagedResourceListOfComplianceTemplate](docs/PagedResourceListOfComplianceTemplate.md)
 - [PagedResourceListOfCorporateActionSource](docs/PagedResourceListOfCorporateActionSource.md)
 - [PagedResourceListOfCustodianAccount](docs/PagedResourceListOfCustodianAccount.md)
 - [PagedResourceListOfCustomEntityDefinition](docs/PagedResourceListOfCustomEntityDefinition.md)
 - [PagedResourceListOfCustomEntityResponse](docs/PagedResourceListOfCustomEntityResponse.md)
 - [PagedResourceListOfCustomEntityType](docs/PagedResourceListOfCustomEntityType.md)
 - [PagedResourceListOfCutLabelDefinition](docs/PagedResourceListOfCutLabelDefinition.md)
 - [PagedResourceListOfDataTypeSummary](docs/PagedResourceListOfDataTypeSummary.md)
 - [PagedResourceListOfDialectId](docs/PagedResourceListOfDialectId.md)
 - [PagedResourceListOfDiaryEntry](docs/PagedResourceListOfDiaryEntry.md)
 - [PagedResourceListOfExecution](docs/PagedResourceListOfExecution.md)
 - [PagedResourceListOfFee](docs/PagedResourceListOfFee.md)
 - [PagedResourceListOfFeeType](docs/PagedResourceListOfFeeType.md)
 - [PagedResourceListOfFund](docs/PagedResourceListOfFund.md)
 - [PagedResourceListOfFundConfiguration](docs/PagedResourceListOfFundConfiguration.md)
 - [PagedResourceListOfGeneralLedgerProfileResponse](docs/PagedResourceListOfGeneralLedgerProfileResponse.md)
 - [PagedResourceListOfGroupReconciliationComparisonResult](docs/PagedResourceListOfGroupReconciliationComparisonResult.md)
 - [PagedResourceListOfGroupReconciliationComparisonRuleset](docs/PagedResourceListOfGroupReconciliationComparisonRuleset.md)
 - [PagedResourceListOfGroupReconciliationDefinition](docs/PagedResourceListOfGroupReconciliationDefinition.md)
 - [PagedResourceListOfInstrument](docs/PagedResourceListOfInstrument.md)
 - [PagedResourceListOfInstrumentEventHolder](docs/PagedResourceListOfInstrumentEventHolder.md)
 - [PagedResourceListOfInstrumentEventInstruction](docs/PagedResourceListOfInstrumentEventInstruction.md)
 - [PagedResourceListOfLegalEntity](docs/PagedResourceListOfLegalEntity.md)
 - [PagedResourceListOfOrder](docs/PagedResourceListOfOrder.md)
 - [PagedResourceListOfOrderGraphBlock](docs/PagedResourceListOfOrderGraphBlock.md)
 - [PagedResourceListOfOrderGraphPlacement](docs/PagedResourceListOfOrderGraphPlacement.md)
 - [PagedResourceListOfOrderInstruction](docs/PagedResourceListOfOrderInstruction.md)
 - [PagedResourceListOfPackage](docs/PagedResourceListOfPackage.md)
 - [PagedResourceListOfParticipation](docs/PagedResourceListOfParticipation.md)
 - [PagedResourceListOfPerson](docs/PagedResourceListOfPerson.md)
 - [PagedResourceListOfPlacement](docs/PagedResourceListOfPlacement.md)
 - [PagedResourceListOfPortfolioGroup](docs/PagedResourceListOfPortfolioGroup.md)
 - [PagedResourceListOfPortfolioGroupSearchResult](docs/PagedResourceListOfPortfolioGroupSearchResult.md)
 - [PagedResourceListOfPortfolioSearchResult](docs/PagedResourceListOfPortfolioSearchResult.md)
 - [PagedResourceListOfPostingModuleResponse](docs/PagedResourceListOfPostingModuleResponse.md)
 - [PagedResourceListOfPostingModuleRule](docs/PagedResourceListOfPostingModuleRule.md)
 - [PagedResourceListOfPropertyDefinition](docs/PagedResourceListOfPropertyDefinition.md)
 - [PagedResourceListOfPropertyDefinitionSearchResult](docs/PagedResourceListOfPropertyDefinitionSearchResult.md)
 - [PagedResourceListOfReconciliation](docs/PagedResourceListOfReconciliation.md)
 - [PagedResourceListOfReferenceListResponse](docs/PagedResourceListOfReferenceListResponse.md)
 - [PagedResourceListOfRelationshipDefinition](docs/PagedResourceListOfRelationshipDefinition.md)
 - [PagedResourceListOfSequenceDefinition](docs/PagedResourceListOfSequenceDefinition.md)
 - [PagedResourceListOfStagedModification](docs/PagedResourceListOfStagedModification.md)
 - [PagedResourceListOfStagedModificationsRequestedChangeInterval](docs/PagedResourceListOfStagedModificationsRequestedChangeInterval.md)
 - [PagedResourceListOfStagingRuleSet](docs/PagedResourceListOfStagingRuleSet.md)
 - [PagedResourceListOfTransactionTemplate](docs/PagedResourceListOfTransactionTemplate.md)
 - [PagedResourceListOfTransactionTemplateSpecification](docs/PagedResourceListOfTransactionTemplateSpecification.md)
 - [PagedResourceListOfTranslationScriptId](docs/PagedResourceListOfTranslationScriptId.md)
 - [PagedResourceListOfValuationPointOverview](docs/PagedResourceListOfValuationPointOverview.md)
 - [PagedResourceListOfVirtualRow](docs/PagedResourceListOfVirtualRow.md)
 - [PagedResourceListOfWorkspace](docs/PagedResourceListOfWorkspace.md)
 - [PagedResourceListOfWorkspaceItem](docs/PagedResourceListOfWorkspaceItem.md)
 - [Participation](docs/Participation.md)
 - [ParticipationRequest](docs/ParticipationRequest.md)
 - [ParticipationSetRequest](docs/ParticipationSetRequest.md)
 - [PercentCheckStep](docs/PercentCheckStep.md)
 - [PercentCheckStepRequest](docs/PercentCheckStepRequest.md)
 - [PerformanceReturn](docs/PerformanceReturn.md)
 - [PerformanceReturnsMetric](docs/PerformanceReturnsMetric.md)
 - [PeriodDiaryEntriesReopenedResponse](docs/PeriodDiaryEntriesReopenedResponse.md)
 - [PeriodType](docs/PeriodType.md)
 - [PerpetualEntityState](docs/PerpetualEntityState.md)
 - [PerpetualProperty](docs/PerpetualProperty.md)
 - [Person](docs/Person.md)
 - [PlaceBlocksRequest](docs/PlaceBlocksRequest.md)
 - [Placement](docs/Placement.md)
 - [PlacementRequest](docs/PlacementRequest.md)
 - [PlacementSetRequest](docs/PlacementSetRequest.md)
 - [PlacementUpdateRequest](docs/PlacementUpdateRequest.md)
 - [Portfolio](docs/Portfolio.md)
 - [PortfolioCashFlow](docs/PortfolioCashFlow.md)
 - [PortfolioCashLadder](docs/PortfolioCashLadder.md)
 - [PortfolioDetails](docs/PortfolioDetails.md)
 - [PortfolioEntity](docs/PortfolioEntity.md)
 - [PortfolioEntityId](docs/PortfolioEntityId.md)
 - [PortfolioGroup](docs/PortfolioGroup.md)
 - [PortfolioGroupIdComplianceParameter](docs/PortfolioGroupIdComplianceParameter.md)
 - [PortfolioGroupIdList](docs/PortfolioGroupIdList.md)
 - [PortfolioGroupIdListComplianceParameter](docs/PortfolioGroupIdListComplianceParameter.md)
 - [PortfolioGroupProperties](docs/PortfolioGroupProperties.md)
 - [PortfolioGroupSearchResult](docs/PortfolioGroupSearchResult.md)
 - [PortfolioHolding](docs/PortfolioHolding.md)
 - [PortfolioIdComplianceParameter](docs/PortfolioIdComplianceParameter.md)
 - [PortfolioIdList](docs/PortfolioIdList.md)
 - [PortfolioIdListComplianceParameter](docs/PortfolioIdListComplianceParameter.md)
 - [PortfolioProperties](docs/PortfolioProperties.md)
 - [PortfolioReconciliationRequest](docs/PortfolioReconciliationRequest.md)
 - [PortfolioResultDataKeyRule](docs/PortfolioResultDataKeyRule.md)
 - [PortfolioReturnBreakdown](docs/PortfolioReturnBreakdown.md)
 - [PortfolioSearchResult](docs/PortfolioSearchResult.md)
 - [PortfolioTradeTicket](docs/PortfolioTradeTicket.md)
 - [PortfolioType](docs/PortfolioType.md)
 - [PortfolioWithoutHref](docs/PortfolioWithoutHref.md)
 - [PortfoliosReconciliationRequest](docs/PortfoliosReconciliationRequest.md)
 - [PostingModuleDetails](docs/PostingModuleDetails.md)
 - [PostingModuleRequest](docs/PostingModuleRequest.md)
 - [PostingModuleResponse](docs/PostingModuleResponse.md)
 - [PostingModuleRule](docs/PostingModuleRule.md)
 - [PostingModuleRulesUpdatedResponse](docs/PostingModuleRulesUpdatedResponse.md)
 - [PreTradeConfiguration](docs/PreTradeConfiguration.md)
 - [Premium](docs/Premium.md)
 - [PreviousFundValuationPointData](docs/PreviousFundValuationPointData.md)
 - [PreviousNAV](docs/PreviousNAV.md)
 - [PreviousShareClassBreakdown](docs/PreviousShareClassBreakdown.md)
 - [PricingContext](docs/PricingContext.md)
 - [PricingModel](docs/PricingModel.md)
 - [PricingOptions](docs/PricingOptions.md)
 - [ProcessedCommand](docs/ProcessedCommand.md)
 - [Property](docs/Property.md)
 - [PropertyDefinition](docs/PropertyDefinition.md)
 - [PropertyDefinitionEntity](docs/PropertyDefinitionEntity.md)
 - [PropertyDefinitionSearchResult](docs/PropertyDefinitionSearchResult.md)
 - [PropertyDefinitionType](docs/PropertyDefinitionType.md)
 - [PropertyDomain](docs/PropertyDomain.md)
 - [PropertyFilter](docs/PropertyFilter.md)
 - [PropertyInterval](docs/PropertyInterval.md)
 - [PropertyKeyComplianceParameter](docs/PropertyKeyComplianceParameter.md)
 - [PropertyKeyListComplianceParameter](docs/PropertyKeyListComplianceParameter.md)
 - [PropertyLifeTime](docs/PropertyLifeTime.md)
 - [PropertyList](docs/PropertyList.md)
 - [PropertyListComplianceParameter](docs/PropertyListComplianceParameter.md)
 - [PropertySchema](docs/PropertySchema.md)
 - [PropertyType](docs/PropertyType.md)
 - [PropertyValue](docs/PropertyValue.md)
 - [PropertyValueEquals](docs/PropertyValueEquals.md)
 - [PropertyValueIn](docs/PropertyValueIn.md)
 - [ProtectionPayoutCashFlowEvent](docs/ProtectionPayoutCashFlowEvent.md)
 - [QueryApplicableInstrumentEventsRequest](docs/QueryApplicableInstrumentEventsRequest.md)
 - [QueryBucketedCashFlowsRequest](docs/QueryBucketedCashFlowsRequest.md)
 - [QueryCashFlowsRequest](docs/QueryCashFlowsRequest.md)
 - [QueryInstrumentEventsRequest](docs/QueryInstrumentEventsRequest.md)
 - [QueryTradeTicketsRequest](docs/QueryTradeTicketsRequest.md)
 - [QueryableKey](docs/QueryableKey.md)
 - [Quote](docs/Quote.md)
 - [QuoteAccessMetadataRule](docs/QuoteAccessMetadataRule.md)
 - [QuoteAccessMetadataRuleId](docs/QuoteAccessMetadataRuleId.md)
 - [QuoteDependency](docs/QuoteDependency.md)
 - [QuoteId](docs/QuoteId.md)
 - [QuoteInstrumentIdType](docs/QuoteInstrumentIdType.md)
 - [QuoteSeriesId](docs/QuoteSeriesId.md)
 - [QuoteType](docs/QuoteType.md)
 - [RawVendorEvent](docs/RawVendorEvent.md)
 - [ReOpenPeriodDiaryEntryRequest](docs/ReOpenPeriodDiaryEntryRequest.md)
 - [RealisedGainLoss](docs/RealisedGainLoss.md)
 - [RecipeBlock](docs/RecipeBlock.md)
 - [RecipeComposer](docs/RecipeComposer.md)
 - [RecipeValue](docs/RecipeValue.md)
 - [RecombineStep](docs/RecombineStep.md)
 - [ReconcileDateTimeRule](docs/ReconcileDateTimeRule.md)
 - [ReconcileNumericRule](docs/ReconcileNumericRule.md)
 - [ReconcileStringRule](docs/ReconcileStringRule.md)
 - [ReconciledTransaction](docs/ReconciledTransaction.md)
 - [Reconciliation](docs/Reconciliation.md)
 - [ReconciliationBreak](docs/ReconciliationBreak.md)
 - [ReconciliationConfiguration](docs/ReconciliationConfiguration.md)
 - [ReconciliationId](docs/ReconciliationId.md)
 - [ReconciliationLeftRightAddressKeyPair](docs/ReconciliationLeftRightAddressKeyPair.md)
 - [ReconciliationLine](docs/ReconciliationLine.md)
 - [ReconciliationRequest](docs/ReconciliationRequest.md)
 - [ReconciliationResponse](docs/ReconciliationResponse.md)
 - [ReconciliationRule](docs/ReconciliationRule.md)
 - [ReconciliationRuleType](docs/ReconciliationRuleType.md)
 - [ReconciliationSideConfiguration](docs/ReconciliationSideConfiguration.md)
 - [ReconciliationTransactions](docs/ReconciliationTransactions.md)
 - [ReferenceData](docs/ReferenceData.md)
 - [ReferenceInstrument](docs/ReferenceInstrument.md)
 - [ReferenceList](docs/ReferenceList.md)
 - [ReferenceListRequest](docs/ReferenceListRequest.md)
 - [ReferenceListResponse](docs/ReferenceListResponse.md)
 - [ReferenceListType](docs/ReferenceListType.md)
 - [ReferencePortfolioConstituent](docs/ReferencePortfolioConstituent.md)
 - [ReferencePortfolioConstituentRequest](docs/ReferencePortfolioConstituentRequest.md)
 - [ReferencePortfolioWeightType](docs/ReferencePortfolioWeightType.md)
 - [RelatedEntity](docs/RelatedEntity.md)
 - [Relation](docs/Relation.md)
 - [RelationDefinition](docs/RelationDefinition.md)
 - [Relationship](docs/Relationship.md)
 - [RelationshipDefinition](docs/RelationshipDefinition.md)
 - [RelativeDateOffset](docs/RelativeDateOffset.md)
 - [Repo](docs/Repo.md)
 - [RequestedChanges](docs/RequestedChanges.md)
 - [ResetEvent](docs/ResetEvent.md)
 - [ResourceId](docs/ResourceId.md)
 - [ResourceListOfAccessControlledResource](docs/ResourceListOfAccessControlledResource.md)
 - [ResourceListOfAccessMetadataValueOf](docs/ResourceListOfAccessMetadataValueOf.md)
 - [ResourceListOfAddressKeyDefinition](docs/ResourceListOfAddressKeyDefinition.md)
 - [ResourceListOfAggregatedReturn](docs/ResourceListOfAggregatedReturn.md)
 - [ResourceListOfAggregationQuery](docs/ResourceListOfAggregationQuery.md)
 - [ResourceListOfAllocation](docs/ResourceListOfAllocation.md)
 - [ResourceListOfApplicableInstrumentEvent](docs/ResourceListOfApplicableInstrumentEvent.md)
 - [ResourceListOfBlock](docs/ResourceListOfBlock.md)
 - [ResourceListOfBlockAndOrders](docs/ResourceListOfBlockAndOrders.md)
 - [ResourceListOfCalendarDate](docs/ResourceListOfCalendarDate.md)
 - [ResourceListOfChange](docs/ResourceListOfChange.md)
 - [ResourceListOfChangeHistory](docs/ResourceListOfChangeHistory.md)
 - [ResourceListOfChangeInterval](docs/ResourceListOfChangeInterval.md)
 - [ResourceListOfChangeIntervalWithOrderManagementDetail](docs/ResourceListOfChangeIntervalWithOrderManagementDetail.md)
 - [ResourceListOfComplianceBreachedOrderInfo](docs/ResourceListOfComplianceBreachedOrderInfo.md)
 - [ResourceListOfComplianceRule](docs/ResourceListOfComplianceRule.md)
 - [ResourceListOfComplianceRuleResult](docs/ResourceListOfComplianceRuleResult.md)
 - [ResourceListOfComplianceRunInfo](docs/ResourceListOfComplianceRunInfo.md)
 - [ResourceListOfConstituentsAdjustmentHeader](docs/ResourceListOfConstituentsAdjustmentHeader.md)
 - [ResourceListOfCorporateAction](docs/ResourceListOfCorporateAction.md)
 - [ResourceListOfDataType](docs/ResourceListOfDataType.md)
 - [ResourceListOfExecution](docs/ResourceListOfExecution.md)
 - [ResourceListOfFeeRule](docs/ResourceListOfFeeRule.md)
 - [ResourceListOfGetCdsFlowConventionsResponse](docs/ResourceListOfGetCdsFlowConventionsResponse.md)
 - [ResourceListOfGetCounterpartyAgreementResponse](docs/ResourceListOfGetCounterpartyAgreementResponse.md)
 - [ResourceListOfGetCreditSupportAnnexResponse](docs/ResourceListOfGetCreditSupportAnnexResponse.md)
 - [ResourceListOfGetFlowConventionsResponse](docs/ResourceListOfGetFlowConventionsResponse.md)
 - [ResourceListOfGetIndexConventionResponse](docs/ResourceListOfGetIndexConventionResponse.md)
 - [ResourceListOfGetRecipeComposerResponse](docs/ResourceListOfGetRecipeComposerResponse.md)
 - [ResourceListOfGetRecipeResponse](docs/ResourceListOfGetRecipeResponse.md)
 - [ResourceListOfHoldingsAdjustmentHeader](docs/ResourceListOfHoldingsAdjustmentHeader.md)
 - [ResourceListOfIUnitDefinitionDto](docs/ResourceListOfIUnitDefinitionDto.md)
 - [ResourceListOfInstrumentCashFlow](docs/ResourceListOfInstrumentCashFlow.md)
 - [ResourceListOfInstrumentEventHolder](docs/ResourceListOfInstrumentEventHolder.md)
 - [ResourceListOfInstrumentIdTypeDescriptor](docs/ResourceListOfInstrumentIdTypeDescriptor.md)
 - [ResourceListOfLegalEntity](docs/ResourceListOfLegalEntity.md)
 - [ResourceListOfListComplexMarketDataWithMetaDataResponse](docs/ResourceListOfListComplexMarketDataWithMetaDataResponse.md)
 - [ResourceListOfMapping](docs/ResourceListOfMapping.md)
 - [ResourceListOfMovedOrderToDifferentBlockResponse](docs/ResourceListOfMovedOrderToDifferentBlockResponse.md)
 - [ResourceListOfOrder](docs/ResourceListOfOrder.md)
 - [ResourceListOfOrderInstruction](docs/ResourceListOfOrderInstruction.md)
 - [ResourceListOfOutputTransaction](docs/ResourceListOfOutputTransaction.md)
 - [ResourceListOfPackage](docs/ResourceListOfPackage.md)
 - [ResourceListOfParticipation](docs/ResourceListOfParticipation.md)
 - [ResourceListOfPerformanceReturn](docs/ResourceListOfPerformanceReturn.md)
 - [ResourceListOfPerson](docs/ResourceListOfPerson.md)
 - [ResourceListOfPlacement](docs/ResourceListOfPlacement.md)
 - [ResourceListOfPortfolio](docs/ResourceListOfPortfolio.md)
 - [ResourceListOfPortfolioCashFlow](docs/ResourceListOfPortfolioCashFlow.md)
 - [ResourceListOfPortfolioCashLadder](docs/ResourceListOfPortfolioCashLadder.md)
 - [ResourceListOfPortfolioTradeTicket](docs/ResourceListOfPortfolioTradeTicket.md)
 - [ResourceListOfProcessedCommand](docs/ResourceListOfProcessedCommand.md)
 - [ResourceListOfProperty](docs/ResourceListOfProperty.md)
 - [ResourceListOfPropertyDefinition](docs/ResourceListOfPropertyDefinition.md)
 - [ResourceListOfPropertyInterval](docs/ResourceListOfPropertyInterval.md)
 - [ResourceListOfQueryableKey](docs/ResourceListOfQueryableKey.md)
 - [ResourceListOfQuote](docs/ResourceListOfQuote.md)
 - [ResourceListOfQuoteAccessMetadataRule](docs/ResourceListOfQuoteAccessMetadataRule.md)
 - [ResourceListOfReconciliationBreak](docs/ResourceListOfReconciliationBreak.md)
 - [ResourceListOfRelation](docs/ResourceListOfRelation.md)
 - [ResourceListOfRelationship](docs/ResourceListOfRelationship.md)
 - [ResourceListOfScopeDefinition](docs/ResourceListOfScopeDefinition.md)
 - [ResourceListOfSideDefinition](docs/ResourceListOfSideDefinition.md)
 - [ResourceListOfString](docs/ResourceListOfString.md)
 - [ResourceListOfTaxRuleSet](docs/ResourceListOfTaxRuleSet.md)
 - [ResourceListOfTransaction](docs/ResourceListOfTransaction.md)
 - [ResourceListOfTransactionType](docs/ResourceListOfTransactionType.md)
 - [ResourceListOfValueType](docs/ResourceListOfValueType.md)
 - [ResponseMetaData](docs/ResponseMetaData.md)
 - [ResultDataKeyRule](docs/ResultDataKeyRule.md)
 - [ResultDataSchema](docs/ResultDataSchema.md)
 - [ResultKeyRule](docs/ResultKeyRule.md)
 - [ResultKeyRuleType](docs/ResultKeyRuleType.md)
 - [ResultValue](docs/ResultValue.md)
 - [ResultValue0D](docs/ResultValue0D.md)
 - [ResultValueBool](docs/ResultValueBool.md)
 - [ResultValueCurrency](docs/ResultValueCurrency.md)
 - [ResultValueDateTimeOffset](docs/ResultValueDateTimeOffset.md)
 - [ResultValueDecimal](docs/ResultValueDecimal.md)
 - [ResultValueDictionary](docs/ResultValueDictionary.md)
 - [ResultValueInt](docs/ResultValueInt.md)
 - [ResultValueString](docs/ResultValueString.md)
 - [ResultValueType](docs/ResultValueType.md)
 - [ReturnZeroPvOptions](docs/ReturnZeroPvOptions.md)
 - [ReverseStockSplitEvent](docs/ReverseStockSplitEvent.md)
 - [RoundingConfiguration](docs/RoundingConfiguration.md)
 - [RoundingConfigurationComponent](docs/RoundingConfigurationComponent.md)
 - [RoundingConvention](docs/RoundingConvention.md)
 - [RulesInterval](docs/RulesInterval.md)
 - [ScalingMethodology](docs/ScalingMethodology.md)
 - [Schedule](docs/Schedule.md)
 - [ScheduleType](docs/ScheduleType.md)
 - [Schema](docs/Schema.md)
 - [ScopeDefinition](docs/ScopeDefinition.md)
 - [ScripDividendEvent](docs/ScripDividendEvent.md)
 - [ScriptMapReference](docs/ScriptMapReference.md)
 - [SecurityElection](docs/SecurityElection.md)
 - [SecurityOfferElection](docs/SecurityOfferElection.md)
 - [SequenceDefinition](docs/SequenceDefinition.md)
 - [SetAmortisationRulesRequest](docs/SetAmortisationRulesRequest.md)
 - [SetLegalEntityIdentifiersRequest](docs/SetLegalEntityIdentifiersRequest.md)
 - [SetLegalEntityPropertiesRequest](docs/SetLegalEntityPropertiesRequest.md)
 - [SetPersonIdentifiersRequest](docs/SetPersonIdentifiersRequest.md)
 - [SetPersonPropertiesRequest](docs/SetPersonPropertiesRequest.md)
 - [SetShareClassInstrumentsRequest](docs/SetShareClassInstrumentsRequest.md)
 - [SetTransactionConfigurationAlias](docs/SetTransactionConfigurationAlias.md)
 - [SetTransactionConfigurationSourceRequest](docs/SetTransactionConfigurationSourceRequest.md)
 - [SettlementCycle](docs/SettlementCycle.md)
 - [SettlementSchedule](docs/SettlementSchedule.md)
 - [ShareClassAmount](docs/ShareClassAmount.md)
 - [ShareClassBreakdown](docs/ShareClassBreakdown.md)
 - [ShareClassData](docs/ShareClassData.md)
 - [ShareClassDealingBreakdown](docs/ShareClassDealingBreakdown.md)
 - [ShareClassDetails](docs/ShareClassDetails.md)
 - [ShareClassPnlBreakdown](docs/ShareClassPnlBreakdown.md)
 - [SideConfigurationData](docs/SideConfigurationData.md)
 - [SideConfigurationDataRequest](docs/SideConfigurationDataRequest.md)
 - [SideDefinition](docs/SideDefinition.md)
 - [SideDefinitionRequest](docs/SideDefinitionRequest.md)
 - [SidesDefinitionRequest](docs/SidesDefinitionRequest.md)
 - [SimpleCashFlowLoan](docs/SimpleCashFlowLoan.md)
 - [SimpleInstrument](docs/SimpleInstrument.md)
 - [SimpleRoundingConvention](docs/SimpleRoundingConvention.md)
 - [SortOrder](docs/SortOrder.md)
 - [SpecificHoldingPricingInfo](docs/SpecificHoldingPricingInfo.md)
 - [SpinOffEvent](docs/SpinOffEvent.md)
 - [StagedModification](docs/StagedModification.md)
 - [StagedModificationDecision](docs/StagedModificationDecision.md)
 - [StagedModificationDecisionRequest](docs/StagedModificationDecisionRequest.md)
 - [StagedModificationEffectiveRange](docs/StagedModificationEffectiveRange.md)
 - [StagedModificationStagingRule](docs/StagedModificationStagingRule.md)
 - [StagedModificationsEntityHrefs](docs/StagedModificationsEntityHrefs.md)
 - [StagedModificationsInfo](docs/StagedModificationsInfo.md)
 - [StagedModificationsRequestedChangeInterval](docs/StagedModificationsRequestedChangeInterval.md)
 - [StagingRule](docs/StagingRule.md)
 - [StagingRuleApprovalCriteria](docs/StagingRuleApprovalCriteria.md)
 - [StagingRuleMatchCriteria](docs/StagingRuleMatchCriteria.md)
 - [StagingRuleSet](docs/StagingRuleSet.md)
 - [StepSchedule](docs/StepSchedule.md)
 - [StockDividendEvent](docs/StockDividendEvent.md)
 - [StockSplitEvent](docs/StockSplitEvent.md)
 - [Strategy](docs/Strategy.md)
 - [Stream](docs/Stream.md)
 - [StringComparisonType](docs/StringComparisonType.md)
 - [StringComplianceParameter](docs/StringComplianceParameter.md)
 - [StringList](docs/StringList.md)
 - [StringListComplianceParameter](docs/StringListComplianceParameter.md)
 - [StructuredResultData](docs/StructuredResultData.md)
 - [StructuredResultDataId](docs/StructuredResultDataId.md)
 - [SubHoldingKeyValueEquals](docs/SubHoldingKeyValueEquals.md)
 - [SwapCashFlowEvent](docs/SwapCashFlowEvent.md)
 - [SwapPrincipalEvent](docs/SwapPrincipalEvent.md)
 - [TargetTaxLot](docs/TargetTaxLot.md)
 - [TargetTaxLotRequest](docs/TargetTaxLotRequest.md)
 - [TaxRule](docs/TaxRule.md)
 - [TaxRuleSet](docs/TaxRuleSet.md)
 - [TemplateField](docs/TemplateField.md)
 - [TenderEvent](docs/TenderEvent.md)
 - [TermDeposit](docs/TermDeposit.md)
 - [TermDepositInterestEvent](docs/TermDepositInterestEvent.md)
 - [TermDepositPrincipalEvent](docs/TermDepositPrincipalEvent.md)
 - [Timeline](docs/Timeline.md)
 - [TotalReturnSwap](docs/TotalReturnSwap.md)
 - [Touch](docs/Touch.md)
 - [TradeTicket](docs/TradeTicket.md)
 - [TradeTicketType](docs/TradeTicketType.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionConfigurationData](docs/TransactionConfigurationData.md)
 - [TransactionConfigurationDataRequest](docs/TransactionConfigurationDataRequest.md)
 - [TransactionConfigurationMovementData](docs/TransactionConfigurationMovementData.md)
 - [TransactionConfigurationMovementDataRequest](docs/TransactionConfigurationMovementDataRequest.md)
 - [TransactionConfigurationTypeAlias](docs/TransactionConfigurationTypeAlias.md)
 - [TransactionCurrencyAndAmount](docs/TransactionCurrencyAndAmount.md)
 - [TransactionDateWindows](docs/TransactionDateWindows.md)
 - [TransactionDiagnostics](docs/TransactionDiagnostics.md)
 - [TransactionFieldMap](docs/TransactionFieldMap.md)
 - [TransactionPrice](docs/TransactionPrice.md)
 - [TransactionPriceAndType](docs/TransactionPriceAndType.md)
 - [TransactionPriceType](docs/TransactionPriceType.md)
 - [TransactionPropertyMap](docs/TransactionPropertyMap.md)
 - [TransactionPropertyMapping](docs/TransactionPropertyMapping.md)
 - [TransactionPropertyMappingRequest](docs/TransactionPropertyMappingRequest.md)
 - [TransactionQueryMode](docs/TransactionQueryMode.md)
 - [TransactionQueryParameters](docs/TransactionQueryParameters.md)
 - [TransactionReconciliationRequest](docs/TransactionReconciliationRequest.md)
 - [TransactionReconciliationRequestV2](docs/TransactionReconciliationRequestV2.md)
 - [TransactionRequest](docs/TransactionRequest.md)
 - [TransactionRoles](docs/TransactionRoles.md)
 - [TransactionSetConfigurationData](docs/TransactionSetConfigurationData.md)
 - [TransactionSetConfigurationDataRequest](docs/TransactionSetConfigurationDataRequest.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionTemplate](docs/TransactionTemplate.md)
 - [TransactionTemplateRequest](docs/TransactionTemplateRequest.md)
 - [TransactionTemplateSpecification](docs/TransactionTemplateSpecification.md)
 - [TransactionType](docs/TransactionType.md)
 - [TransactionTypeAlias](docs/TransactionTypeAlias.md)
 - [TransactionTypeCalculation](docs/TransactionTypeCalculation.md)
 - [TransactionTypeDetails](docs/TransactionTypeDetails.md)
 - [TransactionTypeMovement](docs/TransactionTypeMovement.md)
 - [TransactionTypePropertyMapping](docs/TransactionTypePropertyMapping.md)
 - [TransactionTypeRequest](docs/TransactionTypeRequest.md)
 - [TransactionsReconciliationsResponse](docs/TransactionsReconciliationsResponse.md)
 - [TransitionEvent](docs/TransitionEvent.md)
 - [TranslateEntitiesInlinedRequest](docs/TranslateEntitiesInlinedRequest.md)
 - [TranslateEntitiesRequest](docs/TranslateEntitiesRequest.md)
 - [TranslateEntitiesResponse](docs/TranslateEntitiesResponse.md)
 - [TranslateInstrumentDefinitionsRequest](docs/TranslateInstrumentDefinitionsRequest.md)
 - [TranslateInstrumentDefinitionsResponse](docs/TranslateInstrumentDefinitionsResponse.md)
 - [TranslateTradeTicketRequest](docs/TranslateTradeTicketRequest.md)
 - [TranslateTradeTicketsResponse](docs/TranslateTradeTicketsResponse.md)
 - [TranslationContext](docs/TranslationContext.md)
 - [TranslationInput](docs/TranslationInput.md)
 - [TranslationResult](docs/TranslationResult.md)
 - [TranslationScript](docs/TranslationScript.md)
 - [TranslationScriptId](docs/TranslationScriptId.md)
 - [TrialBalance](docs/TrialBalance.md)
 - [TrialBalanceQueryParameters](docs/TrialBalanceQueryParameters.md)
 - [TriggerEvent](docs/TriggerEvent.md)
 - [TypedResourceId](docs/TypedResourceId.md)
 - [UnitSchema](docs/UnitSchema.md)
 - [UnitisationData](docs/UnitisationData.md)
 - [UnitsRatio](docs/UnitsRatio.md)
 - [UnmatchedHoldingMethod](docs/UnmatchedHoldingMethod.md)
 - [UpdateAmortisationRuleSetDetailsRequest](docs/UpdateAmortisationRuleSetDetailsRequest.md)
 - [UpdateCalendarRequest](docs/UpdateCalendarRequest.md)
 - [UpdateComplianceTemplateRequest](docs/UpdateComplianceTemplateRequest.md)
 - [UpdateCustomEntityDefinitionRequest](docs/UpdateCustomEntityDefinitionRequest.md)
 - [UpdateCustomEntityTypeRequest](docs/UpdateCustomEntityTypeRequest.md)
 - [UpdateCutLabelDefinitionRequest](docs/UpdateCutLabelDefinitionRequest.md)
 - [UpdateDataTypeRequest](docs/UpdateDataTypeRequest.md)
 - [UpdateDerivedPropertyDefinitionRequest](docs/UpdateDerivedPropertyDefinitionRequest.md)
 - [UpdateFeeTypeRequest](docs/UpdateFeeTypeRequest.md)
 - [UpdateGroupReconciliationComparisonRulesetRequest](docs/UpdateGroupReconciliationComparisonRulesetRequest.md)
 - [UpdateGroupReconciliationDefinitionRequest](docs/UpdateGroupReconciliationDefinitionRequest.md)
 - [UpdateInstrumentIdentifierRequest](docs/UpdateInstrumentIdentifierRequest.md)
 - [UpdateOrdersResponse](docs/UpdateOrdersResponse.md)
 - [UpdatePlacementsResponse](docs/UpdatePlacementsResponse.md)
 - [UpdatePortfolioGroupRequest](docs/UpdatePortfolioGroupRequest.md)
 - [UpdatePortfolioRequest](docs/UpdatePortfolioRequest.md)
 - [UpdatePropertyDefinitionRequest](docs/UpdatePropertyDefinitionRequest.md)
 - [UpdateReconciliationRequest](docs/UpdateReconciliationRequest.md)
 - [UpdateReferenceDataRequest](docs/UpdateReferenceDataRequest.md)
 - [UpdateRelationshipDefinitionRequest](docs/UpdateRelationshipDefinitionRequest.md)
 - [UpdateStagingRuleSetRequest](docs/UpdateStagingRuleSetRequest.md)
 - [UpdateTaxRuleSetRequest](docs/UpdateTaxRuleSetRequest.md)
 - [UpdateTimelineRequest](docs/UpdateTimelineRequest.md)
 - [UpdateUnitRequest](docs/UpdateUnitRequest.md)
 - [UpsertCdsFlowConventionsRequest](docs/UpsertCdsFlowConventionsRequest.md)
 - [UpsertComplexMarketDataRequest](docs/UpsertComplexMarketDataRequest.md)
 - [UpsertComplianceRuleRequest](docs/UpsertComplianceRuleRequest.md)
 - [UpsertComplianceRunSummaryRequest](docs/UpsertComplianceRunSummaryRequest.md)
 - [UpsertComplianceRunSummaryResult](docs/UpsertComplianceRunSummaryResult.md)
 - [UpsertCorporateActionRequest](docs/UpsertCorporateActionRequest.md)
 - [UpsertCorporateActionsResponse](docs/UpsertCorporateActionsResponse.md)
 - [UpsertCounterpartyAgreementRequest](docs/UpsertCounterpartyAgreementRequest.md)
 - [UpsertCreditSupportAnnexRequest](docs/UpsertCreditSupportAnnexRequest.md)
 - [UpsertCustomEntitiesResponse](docs/UpsertCustomEntitiesResponse.md)
 - [UpsertCustomEntityAccessMetadataRequest](docs/UpsertCustomEntityAccessMetadataRequest.md)
 - [UpsertDialectRequest](docs/UpsertDialectRequest.md)
 - [UpsertFlowConventionsRequest](docs/UpsertFlowConventionsRequest.md)
 - [UpsertIndexConventionRequest](docs/UpsertIndexConventionRequest.md)
 - [UpsertInstrumentEventRequest](docs/UpsertInstrumentEventRequest.md)
 - [UpsertInstrumentEventsResponse](docs/UpsertInstrumentEventsResponse.md)
 - [UpsertInstrumentPropertiesResponse](docs/UpsertInstrumentPropertiesResponse.md)
 - [UpsertInstrumentPropertyRequest](docs/UpsertInstrumentPropertyRequest.md)
 - [UpsertInstrumentsResponse](docs/UpsertInstrumentsResponse.md)
 - [UpsertLegalEntitiesResponse](docs/UpsertLegalEntitiesResponse.md)
 - [UpsertLegalEntityAccessMetadataRequest](docs/UpsertLegalEntityAccessMetadataRequest.md)
 - [UpsertLegalEntityRequest](docs/UpsertLegalEntityRequest.md)
 - [UpsertPersonAccessMetadataRequest](docs/UpsertPersonAccessMetadataRequest.md)
 - [UpsertPersonRequest](docs/UpsertPersonRequest.md)
 - [UpsertPersonsResponse](docs/UpsertPersonsResponse.md)
 - [UpsertPortfolioAccessMetadataRequest](docs/UpsertPortfolioAccessMetadataRequest.md)
 - [UpsertPortfolioGroupAccessMetadataRequest](docs/UpsertPortfolioGroupAccessMetadataRequest.md)
 - [UpsertPortfolioTransactionsResponse](docs/UpsertPortfolioTransactionsResponse.md)
 - [UpsertQuoteAccessMetadataRuleRequest](docs/UpsertQuoteAccessMetadataRuleRequest.md)
 - [UpsertQuoteRequest](docs/UpsertQuoteRequest.md)
 - [UpsertQuotesResponse](docs/UpsertQuotesResponse.md)
 - [UpsertRecipeComposerRequest](docs/UpsertRecipeComposerRequest.md)
 - [UpsertRecipeRequest](docs/UpsertRecipeRequest.md)
 - [UpsertReferencePortfolioConstituentPropertiesRequest](docs/UpsertReferencePortfolioConstituentPropertiesRequest.md)
 - [UpsertReferencePortfolioConstituentPropertiesResponse](docs/UpsertReferencePortfolioConstituentPropertiesResponse.md)
 - [UpsertReferencePortfolioConstituentsRequest](docs/UpsertReferencePortfolioConstituentsRequest.md)
 - [UpsertReferencePortfolioConstituentsResponse](docs/UpsertReferencePortfolioConstituentsResponse.md)
 - [UpsertResultValuesDataRequest](docs/UpsertResultValuesDataRequest.md)
 - [UpsertReturnsResponse](docs/UpsertReturnsResponse.md)
 - [UpsertSingleStructuredDataResponse](docs/UpsertSingleStructuredDataResponse.md)
 - [UpsertStructuredDataResponse](docs/UpsertStructuredDataResponse.md)
 - [UpsertStructuredResultDataRequest](docs/UpsertStructuredResultDataRequest.md)
 - [UpsertTransactionPropertiesResponse](docs/UpsertTransactionPropertiesResponse.md)
 - [UpsertTranslationScriptRequest](docs/UpsertTranslationScriptRequest.md)
 - [UpsertValuationPointRequest](docs/UpsertValuationPointRequest.md)
 - [User](docs/User.md)
 - [ValuationPointDataQueryParameters](docs/ValuationPointDataQueryParameters.md)
 - [ValuationPointDataRequest](docs/ValuationPointDataRequest.md)
 - [ValuationPointDataResponse](docs/ValuationPointDataResponse.md)
 - [ValuationPointOverview](docs/ValuationPointOverview.md)
 - [ValuationPointResourceListOfJournalEntryLine](docs/ValuationPointResourceListOfJournalEntryLine.md)
 - [ValuationPointResourceListOfTrialBalance](docs/ValuationPointResourceListOfTrialBalance.md)
 - [ValuationRequest](docs/ValuationRequest.md)
 - [ValuationSchedule](docs/ValuationSchedule.md)
 - [ValuationsReconciliationRequest](docs/ValuationsReconciliationRequest.md)
 - [ValueType](docs/ValueType.md)
 - [VendorDependency](docs/VendorDependency.md)
 - [VendorLibrary](docs/VendorLibrary.md)
 - [VendorModelRule](docs/VendorModelRule.md)
 - [Version](docs/Version.md)
 - [VersionSummaryDto](docs/VersionSummaryDto.md)
 - [VersionedResourceListOfA2BDataRecord](docs/VersionedResourceListOfA2BDataRecord.md)
 - [VersionedResourceListOfA2BMovementRecord](docs/VersionedResourceListOfA2BMovementRecord.md)
 - [VersionedResourceListOfHoldingContributor](docs/VersionedResourceListOfHoldingContributor.md)
 - [VersionedResourceListOfJournalEntryLine](docs/VersionedResourceListOfJournalEntryLine.md)
 - [VersionedResourceListOfOutputTransaction](docs/VersionedResourceListOfOutputTransaction.md)
 - [VersionedResourceListOfPortfolioHolding](docs/VersionedResourceListOfPortfolioHolding.md)
 - [VersionedResourceListOfTransaction](docs/VersionedResourceListOfTransaction.md)
 - [VersionedResourceListOfTrialBalance](docs/VersionedResourceListOfTrialBalance.md)
 - [VersionedResourceListWithWarningsOfPortfolioHolding](docs/VersionedResourceListWithWarningsOfPortfolioHolding.md)
 - [VirtualDocument](docs/VirtualDocument.md)
 - [VirtualDocumentRow](docs/VirtualDocumentRow.md)
 - [VirtualRow](docs/VirtualRow.md)
 - [Warning](docs/Warning.md)
 - [WeekendMask](docs/WeekendMask.md)
 - [WeightedInstrument](docs/WeightedInstrument.md)
 - [WeightedInstrumentInLineLookupIdentifiers](docs/WeightedInstrumentInLineLookupIdentifiers.md)
 - [WeightedInstruments](docs/WeightedInstruments.md)
 - [Workspace](docs/Workspace.md)
 - [WorkspaceCreationRequest](docs/WorkspaceCreationRequest.md)
 - [WorkspaceItem](docs/WorkspaceItem.md)
 - [WorkspaceItemCreationRequest](docs/WorkspaceItemCreationRequest.md)
 - [WorkspaceItemUpdateRequest](docs/WorkspaceItemUpdateRequest.md)
 - [WorkspaceUpdateRequest](docs/WorkspaceUpdateRequest.md)
 - [YieldCurveData](docs/YieldCurveData.md)

