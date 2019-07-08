/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://api.lusid.com/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages :  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python)  # Data Model  The LUSID API has a relatively lightweight but extremely powerful data model.   One of the goals of LUSID was not to enforce on clients a single rigid data model but rather to provide a flexible foundation onto which clients can streamline their data.   One of the primary tools to extend the data model is through using properties.  Properties can be associated with amongst others: - * Transactions * Instruments * Portfolios   The LUSID data model is exposed through the LUSID APIs.  The APIs provide access to both business objects and the meta data used to configure the systems behaviours.   The key business entities are: - * **Portfolios** A portfolio is the primary container for transactions and holdings.  * **Derived Portfolios** Derived portfolios allow portfolios to be created based on other portfolios, by overriding or overlaying specific items * **Holdings** A holding is a position account for a instrument within a portfolio.  Holdings can only be adjusted via transactions. * **Transactions** A Transaction is a source of transactions used to manipulate holdings.  * **Corporate Actions** A corporate action is a market event which occurs to a instrument, for example a stock split * **Instruments**  A instrument represents a currency, tradable instrument or OTC contract that is attached to a transaction and a holding. * **Properties** Several entities allow additional user defined properties to be associated with them.   For example, a Portfolio manager may be associated with a portfolio  Meta data includes: - * **Transaction Types** Transactions are booked with a specific transaction type.  The types are client defined and are used to map the Transaction to a series of movements which update the portfolio holdings.  * **Properties Types** Types of user defined properties used within the system.  This section describes the data model that LUSID exposes via the APIs.  ## Scope  All data in LUSID is segregated at the client level.  Entities in LUSID are identifiable by a unique code.  Every entity lives within a logical data partition known as a Scope.  Scope is an identity namespace allowing two entities with the same unique code to co-exist within individual address spaces.  For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.  LUSID Clients cannot access scopes of other clients.  ## Schema  A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.  ## Instruments  LUSID has its own built-in instrument master which you can use to master your own instrument universe.  Every instrument must be created with one or more unique market identifiers, such as [FIGI](https://openfigi.com/). For any non-listed instruments (eg OTCs), you can upload an instrument against a custom ID of your choosing.  In addition, LUSID will allocate each instrument a unique 'LUSID instrument identifier'. The LUSID instrument identifier is what is used when uploading transactions, holdings, prices, etc. The API exposes an `instrument/lookup` endpoint which can be used to lookup these LUSID identifiers using their market identifiers.  Cash can be referenced using the ISO currency code prefixed with \"`CCY_`\" e.g. `CCY_GBP`  ## Instrument Prices (Analytics)  Instrument prices are stored in LUSID's Analytics Store  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | Value|decimal|Value of the analytic, eg price | | Denomination|string|Underlying unit of the analytic, eg currency, EPS etc. |   ## Instrument Data  Instrument data can be uploaded to the system using the [Instrument Properties](#tag/InstrumentProperties) endpoint.  | Field|Type|Description | | ---|---|--- |   ## Portfolios  Portfolios are the top-level entity containers within LUSID, containing transactions, corporate actions and holdings.    The transactions build up the portfolio holdings on which valuations, analytics profit & loss and risk can be calculated.     Properties can be associated with Portfolios to add in additional model data.  Portfolio properties can be changed over time as well.  For example, to allow a Portfolio Manager to be linked with a Portfolio.  Additionally, portfolios can be securitised and held by other portfolios, allowing LUSID to perform \"drill-through\" into underlying fund holdings  ### Reference Portfolios Reference portfolios are portfolios that contain only weights, as opposed to transactions, and are designed to represent entities such as indices.  ### Derived Portfolios  LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own transactions and also inherits any transactions from its parent portfolio.  Any changes made to the parent portfolio are automatically reflected in derived portfolio.  Derived portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a derived portfolio could be created a new namespace linked to the underlying live (parent) portfolio.  Analysis can then be undertaken on the derived portfolio without affecting the live portfolio.  ### Portfolio Groups Portfolio groups allow the construction of a hierarchy from portfolios and groups.  Portfolio operations on the group are executed on an aggregated set of portfolios in the hierarchy.   For example:   * Global Portfolios _(group)_   * APAC _(group)_     * Hong Kong _(portfolio)_     * Japan _(portfolio)_   * Europe _(group)_     * France _(portfolio)_     * Germany _(portfolio)_   * UK _(portfolio)_   In this example **Global Portfolios** is a group that consists of an aggregate of **Hong Kong**, **Japan**, **France**, **Germany** and **UK** portfolios.  ### Movements Engine The Movements engine sits on top of the immutable event store and is used to manage the relationship between input trading actions and their associated portfolio holdings.     The movements engine reads in the following entity types:- * Posting Transactions * Applying Corporate Actions  * Holding Adjustments  These are converted to one or more movements and used by the movements engine to calculate holdings.  At the same time it also calculates running balances, and realised P&L.  The outputs from the movements engine are holdings and transactions.  ## Transactions  A transaction represents an economic activity against a Portfolio.  Transactions are processed according to a configuration. This will tell the LUSID engine how to interpret the transaction and correctly update the holdings. LUSID comes with a set of transaction types you can use out of the box, or you can configure your own set(s) of transactions.  For more details see the [LUSID Getting Started Guide for transaction configuration.](https://support.finbourne.com/hc/en-us/articles/360016737511-Configuring-Transaction-Types)  | Field|Type|Description | | ---|---|--- | | TransactionId|string|Unique transaction identifier | | Type|string|LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | | InstrumentIdentifiers|map|Unique instrument identifiers | | InstrumentUid|string|LUSID's internal unique instrument identifier, resolved from the instrument identifiers | | TransactionDate|datetime|Transaction date | | SettlementDate|datetime|Settlement date | | Units|decimal|Quantity of trade in units of the instrument | | TransactionPrice|tradeprice|Execution price for the transaction | | TotalConsideration|currencyandamount|Total value of the transaction in settlement currency | | ExchangeRate|decimal|Rate between transaction and settlement currency | | TransactionCurrency|currency|Transaction currency | | CounterpartyId|string|Counterparty identifier | | Source|string|Where this transaction came from |   From these fields, the following values can be calculated  * **Transaction value in Transaction currency**: TotalConsideration / ExchangeRate  * **Transaction value in Portfolio currency**: Transaction value in Transaction currency * TradeToPortfolioRate  ### Example Transactions  #### A Common Purchase Example Three example transactions are shown in the table below.   They represent a purchase of USD denominated IBM shares within a Sterling denominated portfolio.   * The first two transactions are for separate buy and fx trades    * Buying 500 IBM shares for $71,480.00    * A foreign exchange conversion to fund the IBM purchase. (Buy $71,480.00 for &#163;54,846.60)  * The third transaction is an alternate version of the above trades. Buying 500 IBM shares and settling directly in Sterling.  | Column |  Buy Trade | Fx Trade | Buy Trade with foreign Settlement | | ----- | ----- | ----- | ----- | | TransactionId | FBN00001 | FBN00002 | FBN00003 | | Type | Buy | FxBuy | Buy | | InstrumentIdentifiers | { \"figi\", \"BBG000BLNNH6\" } | { \"CCY\", \"CCY_USD\" } | { \"figi\", \"BBG000BLNNH6\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | 2018-08-02 | | SettlementDate | 2018-08-06 | 2018-08-06 | 2018-08-06 | | Units | 500 | 71480 | 500 | | TransactionPrice | 142.96 | 1 | 142.96 | | TradeCurrency | USD | USD | USD | | ExchangeRate | 1 | 0.7673 | 0.7673 | | TotalConsideration.Amount | 71480.00 | 54846.60 | 54846.60 | | TotalConsideration.Currency | USD | GBP | GBP | | Trade/default/TradeToPortfolioRate&ast; | 0.7673 | 0.7673 | 0.7673 |  [&ast; This is a property field]  #### A Forward FX Example  LUSID has a flexible transaction modelling system, and there are a number of different ways of modelling forward fx trades.  The default LUSID transaction types are FwdFxBuy and FwdFxSell. Other types and behaviours can be configured as required.  Using these transaction types, the holdings query will report two forward positions. One in each currency.   Since an FX trade is an exchange of one currency for another, the following two 6 month forward transactions are equivalent:  | Column |  Forward 'Sell' Trade | Forward 'Buy' Trade | | ----- | ----- | ----- | | TransactionId | FBN00004 | FBN00005 | | Type | FwdFxSell | FwdFxBuy | | InstrumentIdentifiers | { \"CCY\", \"CCY_GBP\" } | { \"CCY\", \"CCY_USD\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | | SettlementDate | 2019-02-06 | 2019-02-06 | | Units | 10000.00 | 13142.00 | | TransactionPrice |1 | 1 | | TradeCurrency | GBP | USD | | ExchangeRate | 1.3142 | 0.760919 | | TotalConsideration.Amount | 13142.00 | 10000.00 | | TotalConsideration.Currency | USD | GBP | | Trade/default/TradeToPortfolioRate | 1.0 | 0.760919 |  ## Holdings  A holding represents a position in a instrument or cash on a given date.  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | HoldingType|string|Type of holding, eg Position, Balance, CashCommitment, Receivable, ForwardFX | | Units|decimal|Quantity of holding | | SettledUnits|decimal|Settled quantity of holding | | Cost|currencyandamount|Book cost of holding in transaction currency | | CostPortfolioCcy|currencyandamount|Book cost of holding in portfolio currency | | Transaction|Transaction|If this is commitment-type holding, the transaction behind it |   ## Corporate Actions  Corporate actions are represented within LUSID in terms of a set of instrument-specific 'transitions'.  These transitions are used to specify the participants of the corporate action, and the effect that the corporate action will have on holdings in those participants.  ### Corporate Action  | Field|Type|Description | | ---|---|--- | | CorporateActionCode|code|The unique identifier of this corporate action | | AnnouncementDate|datetime|The announcement date of the corporate action | | ExDate|datetime|The ex date of the corporate action | | RecordDate|datetime|The record date of the corporate action | | PaymentDate|datetime|The payment date of the corporate action | | Transitions|list|The transitions that result from this corporate action |   ### Transition  | Field|Type|Description | | ---|---|--- | | InputTransition|transition|Indicating the basis of the corporate action - which security and how many units | | OutputTransitions|list|What will be generated relative to the input transition |   ### Example Corporate Action Transitions  #### A Dividend Action Transition  In this example, for each share of IBM, 0.20 units (or 20 pence) of GBP are generated.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"ccy\" : \"CCY_GBP\" } | | Units Factor | 1 | 0.20 | | Cost Factor | 1 | 0 |  #### A Split Action Transition  In this example, for each share of IBM, we end up with 2 units (2 shares) of IBM, with total value unchanged.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | | Units Factor | 1 | 2 | | Cost Factor | 1 | 1 |  #### A Spinoff Action Transition  In this example, for each share of IBM, we end up with 1 unit (1 share) of IBM and 3 units (3 shares) of Celestica, with 85% of the value remaining on the IBM share, and 5% in each Celestica share (15% total).  | Column |  Input Transition | Output Transition 1 | Output Transition 2 | | ----- | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000HBGRF3\" } | | Units Factor | 1 | 1 | 3 | | Cost Factor | 1 | 0.85 | 0.15 |  ## Property  Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.  # Schemas  The following headers are returned on all responses from LUSID  | Name | Purpose | | --- | --- | | lusid-meta-duration | Duration of the request | | lusid-meta-success | Whether or not LUSID considered the request to be successful | | lusid-meta-requestId | The unique identifier for the request | | lusid-schema-url | Url of the schema for the data being returned | | lusid-property-schema-url | Url of the schema for any properties |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"102\">102</a>|VersionNotFound|  | | <a name=\"104\">104</a>|InstrumentNotFound|  | | <a name=\"105\">105</a>|PropertyNotFound|  | | <a name=\"106\">106</a>|PortfolioRecursionDepth|  | | <a name=\"108\">108</a>|GroupNotFound|  | | <a name=\"109\">109</a>|PortfolioNotFound|  | | <a name=\"110\">110</a>|PropertySchemaNotFound|  | | <a name=\"111\">111</a>|PortfolioAncestryNotFound|  | | <a name=\"112\">112</a>|PortfolioWithIdAlreadyExists|  | | <a name=\"113\">113</a>|OrphanedPortfolio|  | | <a name=\"119\">119</a>|MissingBaseClaims|  | | <a name=\"121\">121</a>|PropertyNotDefined|  | | <a name=\"122\">122</a>|CannotDeleteSystemProperty|  | | <a name=\"123\">123</a>|CannotModifyImmutablePropertyField|  | | <a name=\"124\">124</a>|PropertyAlreadyExists|  | | <a name=\"125\">125</a>|InvalidPropertyLifeTime|  | | <a name=\"127\">127</a>|CannotModifyDefaultDataType|  | | <a name=\"128\">128</a>|GroupAlreadyExists|  | | <a name=\"129\">129</a>|NoSuchDataType|  | | <a name=\"132\">132</a>|ValidationError|  | | <a name=\"133\">133</a>|LoopDetectedInGroupHierarchy|  | | <a name=\"135\">135</a>|SubGroupAlreadyExists|  | | <a name=\"138\">138</a>|PriceSourceNotFound|  | | <a name=\"139\">139</a>|AnalyticStoreNotFound|  | | <a name=\"141\">141</a>|AnalyticStoreAlreadyExists|  | | <a name=\"143\">143</a>|ClientInstrumentAlreadyExists|  | | <a name=\"144\">144</a>|DuplicateInParameterSet|  | | <a name=\"147\">147</a>|ResultsNotFound|  | | <a name=\"148\">148</a>|OrderFieldNotInResultSet|  | | <a name=\"149\">149</a>|OperationFailed|  | | <a name=\"150\">150</a>|ElasticSearchError|  | | <a name=\"151\">151</a>|InvalidParameterValue|  | | <a name=\"153\">153</a>|CommandProcessingFailure|  | | <a name=\"154\">154</a>|EntityStateConstructionFailure|  | | <a name=\"155\">155</a>|EntityTimelineDoesNotExist|  | | <a name=\"156\">156</a>|EventPublishFailure|  | | <a name=\"157\">157</a>|InvalidRequestFailure|  | | <a name=\"158\">158</a>|EventPublishUnknown|  | | <a name=\"159\">159</a>|EventQueryFailure|  | | <a name=\"160\">160</a>|BlobDidNotExistFailure|  | | <a name=\"162\">162</a>|SubSystemRequestFailure|  | | <a name=\"163\">163</a>|SubSystemConfigurationFailure|  | | <a name=\"165\">165</a>|FailedToDelete|  | | <a name=\"166\">166</a>|UpsertClientInstrumentFailure|  | | <a name=\"167\">167</a>|IllegalAsAtInterval|  | | <a name=\"168\">168</a>|IllegalBitemporalQuery|  | | <a name=\"169\">169</a>|InvalidAlternateId|  | | <a name=\"170\">170</a>|CannotAddSourcePortfolioPropertyExplicitly|  | | <a name=\"171\">171</a>|EntityAlreadyExistsInGroup|  | | <a name=\"173\">173</a>|EntityWithIdAlreadyExists|  | | <a name=\"174\">174</a>|DerivedPortfolioDetailsDoNotExist|  | | <a name=\"176\">176</a>|PortfolioWithNameAlreadyExists|  | | <a name=\"177\">177</a>|InvalidTransactions|  | | <a name=\"178\">178</a>|ReferencePortfolioNotFound|  | | <a name=\"179\">179</a>|DuplicateIdFailure|  | | <a name=\"180\">180</a>|CommandRetrievalFailure|  | | <a name=\"181\">181</a>|DataFilterApplicationFailure|  | | <a name=\"182\">182</a>|SearchFailed|  | | <a name=\"183\">183</a>|MovementsEngineConfigurationKeyFailure|  | | <a name=\"184\">184</a>|FxRateSourceNotFound|  | | <a name=\"185\">185</a>|AccrualSourceNotFound|  | | <a name=\"186\">186</a>|AccessDenied|  | | <a name=\"187\">187</a>|InvalidIdentityToken|  | | <a name=\"188\">188</a>|InvalidRequestHeaders|  | | <a name=\"189\">189</a>|PriceNotFound|  | | <a name=\"190\">190</a>|InvalidSubHoldingKeysProvided|  | | <a name=\"191\">191</a>|DuplicateSubHoldingKeysProvided|  | | <a name=\"192\">192</a>|CutDefinitionNotFound|  | | <a name=\"193\">193</a>|CutDefinitionInvalid|  | | <a name=\"200\">200</a>|InvalidUnitForDataType|  | | <a name=\"201\">201</a>|InvalidTypeForDataType|  | | <a name=\"202\">202</a>|InvalidValueForDataType|  | | <a name=\"203\">203</a>|UnitNotDefinedForDataType|  | | <a name=\"204\">204</a>|UnitsNotSupportedOnDataType|  | | <a name=\"205\">205</a>|CannotSpecifyUnitsOnDataType|  | | <a name=\"206\">206</a>|UnitSchemaInconsistentWithDataType|  | | <a name=\"207\">207</a>|UnitDefinitionNotSpecified|  | | <a name=\"208\">208</a>|DuplicateUnitDefinitionsSpecified|  | | <a name=\"209\">209</a>|InvalidUnitsDefinition|  | | <a name=\"210\">210</a>|InvalidInstrumentIdentifierUnit|  | | <a name=\"211\">211</a>|HoldingsAdjustmentDoesNotExist|  | | <a name=\"212\">212</a>|CouldNotBuildExcelUrl|  | | <a name=\"213\">213</a>|CouldNotGetExcelVersion|  | | <a name=\"214\">214</a>|InstrumentByCodeNotFound|  | | <a name=\"215\">215</a>|EntitySchemaDoesNotExist|  | | <a name=\"216\">216</a>|FeatureNotSupportedOnPortfolioType|  | | <a name=\"217\">217</a>|QuoteNotFoundFailure|  | | <a name=\"219\">219</a>|InvalidInstrumentDefinition|  | | <a name=\"221\">221</a>|InstrumentUpsertFailure|  | | <a name=\"222\">222</a>|ReferencePortfolioRequestNotSupported|  | | <a name=\"223\">223</a>|TransactionPortfolioRequestNotSupported|  | | <a name=\"224\">224</a>|InvalidPropertyValueAssignment|  | | <a name=\"230\">230</a>|TransactionTypeNotFound|  | | <a name=\"231\">231</a>|TransactionTypeDuplication|  | | <a name=\"232\">232</a>|PortfolioDoesNotExistAtGivenDate|  | | <a name=\"233\">233</a>|QueryParserFailure|  | | <a name=\"234\">234</a>|DuplicateConstituentFailure|  | | <a name=\"235\">235</a>|UnresolvedInstrumentConstituentFailure|  | | <a name=\"236\">236</a>|UnresolvedInstrumentInTransitionFailure|  | | <a name=\"300\">300</a>|MissingRecipeFailure|  | | <a name=\"301\">301</a>|DependenciesFailure|  | | <a name=\"304\">304</a>|PortfolioPreprocessFailure|  | | <a name=\"310\">310</a>|ValuationEngineFailure|  | | <a name=\"311\">311</a>|TaskFactoryFailure|  | | <a name=\"312\">312</a>|TaskEvaluationFailure|  | | <a name=\"350\">350</a>|InstrumentFailure|  | | <a name=\"351\">351</a>|CashFlowsFailure|  | | <a name=\"360\">360</a>|AggregationFailure|  | | <a name=\"370\">370</a>|ResultRetrievalFailure|  | | <a name=\"371\">371</a>|VendorPricingFailure|  | | <a name=\"371\">371</a>|VendorPricingFailure|  | | <a name=\"372\">372</a>|VendorResultProcessingFailure|  | | <a name=\"373\">373</a>|VendorResultMappingFailure|  | | <a name=\"374\">374</a>|AttemptToUpsertDuplicateQuotes|  | | <a name=\"375\">375</a>|CorporateActionSourceDoesNotExist|  | | <a name=\"376\">376</a>|InstrumentIdentifierAlreadyInUse|  | | <a name=\"377\">377</a>|CorporateActionSourceAlreadyExists|  | | <a name=\"378\">378</a>|PropertiesNotFound|  | | <a name=\"379\">379</a>|BatchOperationAborted|  | | <a name=\"-10\">-10</a>|ServerConfigurationError|  | | <a name=\"-1\">-1</a>|Unknown error|  | 
 *
 * The version of the OpenAPI document: 0.10.410
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiCallback;
import com.finbourne.lusid.ApiClient;
import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.ApiResponse;
import com.finbourne.lusid.Configuration;
import com.finbourne.lusid.Pair;
import com.finbourne.lusid.ProgressRequestBody;
import com.finbourne.lusid.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.lusid.model.AddTransactionPropertyResponse;
import com.finbourne.lusid.model.AdjustHolding;
import com.finbourne.lusid.model.AdjustHoldingRequest;
import com.finbourne.lusid.model.CreatePortfolioDetails;
import com.finbourne.lusid.model.CreateTransactionPortfolioRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.ExecutionRequest;
import com.finbourne.lusid.model.HoldingsAdjustment;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PerpetualPropertyValue;
import com.finbourne.lusid.model.Portfolio;
import com.finbourne.lusid.model.PortfolioDetails;
import com.finbourne.lusid.model.ResourceListOfHoldingsAdjustmentHeader;
import com.finbourne.lusid.model.TransactionQueryParameters;
import com.finbourne.lusid.model.TransactionRequest;
import com.finbourne.lusid.model.UpsertPortfolioExecutionsResponse;
import com.finbourne.lusid.model.UpsertPortfolioTransactionsResponse;
import com.finbourne.lusid.model.VersionedResourceListOfOutputTransaction;
import com.finbourne.lusid.model.VersionedResourceListOfPortfolioHolding;
import com.finbourne.lusid.model.VersionedResourceListOfTransaction;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionPortfoliosApi {
    private ApiClient localVarApiClient;

    public TransactionPortfoliosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionPortfoliosApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addTransactionProperty
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to upsert properties against. (required)
     * @param transactionProperties The properties with their associated values to upsert onto the              transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addTransactionPropertyCall(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactionProperties;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addTransactionPropertyValidateBeforeCall(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling addTransactionProperty(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling addTransactionProperty(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling addTransactionProperty(Async)");
        }
        
        // verify the required parameter 'transactionProperties' is set
        if (transactionProperties == null) {
            throw new ApiException("Missing the required parameter 'transactionProperties' when calling addTransactionProperty(Async)");
        }
        

        okhttp3.Call localVarCall = addTransactionPropertyCall(scope, code, transactionId, transactionProperties, _callback);
        return localVarCall;

    }

    /**
     * Add transaction property
     * Upsert one or more transaction properties to a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to upsert properties against. (required)
     * @param transactionProperties The properties with their associated values to upsert onto the              transaction. (required)
     * @return AddTransactionPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties) throws ApiException {
        ApiResponse<AddTransactionPropertyResponse> localVarResp = addTransactionPropertyWithHttpInfo(scope, code, transactionId, transactionProperties);
        return localVarResp.getData();
    }

    /**
     * Add transaction property
     * Upsert one or more transaction properties to a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to upsert properties against. (required)
     * @param transactionProperties The properties with their associated values to upsert onto the              transaction. (required)
     * @return ApiResponse&lt;AddTransactionPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddTransactionPropertyResponse> addTransactionPropertyWithHttpInfo(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties) throws ApiException {
        okhttp3.Call localVarCall = addTransactionPropertyValidateBeforeCall(scope, code, transactionId, transactionProperties, null);
        Type localVarReturnType = new TypeToken<AddTransactionPropertyResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Add transaction property (asynchronously)
     * Upsert one or more transaction properties to a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to upsert properties against. (required)
     * @param transactionProperties The properties with their associated values to upsert onto the              transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addTransactionPropertyAsync(String scope, String code, String transactionId, Map<String, PerpetualPropertyValue> transactionProperties, final ApiCallback<AddTransactionPropertyResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = addTransactionPropertyValidateBeforeCall(scope, code, transactionId, transactionProperties, _callback);
        Type localVarReturnType = new TypeToken<AddTransactionPropertyResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for adjustHoldings
     * @param scope The scope of the portfolio (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adjustHoldingsCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = holdingAdjustments;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", localVarApiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call adjustHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling adjustHoldings(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling adjustHoldings(Async)");
        }
        
        // verify the required parameter 'effectiveAt' is set
        if (effectiveAt == null) {
            throw new ApiException("Missing the required parameter 'effectiveAt' when calling adjustHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = adjustHoldingsCall(scope, code, effectiveAt, holdingAdjustments, _callback);
        return localVarCall;

    }

    /**
     * Adjust holdings
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the given effectiveAt datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (optional)
     * @return AdjustHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AdjustHolding adjustHoldings(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        ApiResponse<AdjustHolding> localVarResp = adjustHoldingsWithHttpInfo(scope, code, effectiveAt, holdingAdjustments);
        return localVarResp.getData();
    }

    /**
     * Adjust holdings
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the given effectiveAt datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (optional)
     * @return ApiResponse&lt;AdjustHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdjustHolding> adjustHoldingsWithHttpInfo(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        okhttp3.Call localVarCall = adjustHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, null);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Adjust holdings (asynchronously)
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the given effectiveAt datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adjustHoldingsAsync(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback<AdjustHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = adjustHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, _callback);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for buildTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param parameters The query parameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call buildTransactionsCall(String scope, String code, TransactionQueryParameters parameters, OffsetDateTime asAt, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = parameters;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/$build"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call buildTransactionsValidateBeforeCall(String scope, String code, TransactionQueryParameters parameters, OffsetDateTime asAt, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling buildTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling buildTransactions(Async)");
        }
        
        // verify the required parameter 'parameters' is set
        if (parameters == null) {
            throw new ApiException("Missing the required parameter 'parameters' when calling buildTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = buildTransactionsCall(scope, code, parameters, asAt, propertyKeys, filter, _callback);
        return localVarCall;

    }

    /**
     * Build transactions
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effectiveAt time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param parameters The query parameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return VersionedResourceListOfOutputTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, TransactionQueryParameters parameters, OffsetDateTime asAt, List<String> propertyKeys, String filter) throws ApiException {
        ApiResponse<VersionedResourceListOfOutputTransaction> localVarResp = buildTransactionsWithHttpInfo(scope, code, parameters, asAt, propertyKeys, filter);
        return localVarResp.getData();
    }

    /**
     * Build transactions
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effectiveAt time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param parameters The query parameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfOutputTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfOutputTransaction> buildTransactionsWithHttpInfo(String scope, String code, TransactionQueryParameters parameters, OffsetDateTime asAt, List<String> propertyKeys, String filter) throws ApiException {
        okhttp3.Call localVarCall = buildTransactionsValidateBeforeCall(scope, code, parameters, asAt, propertyKeys, filter, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Build transactions (asynchronously)
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effectiveAt time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param parameters The query parameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call buildTransactionsAsync(String scope, String code, TransactionQueryParameters parameters, OffsetDateTime asAt, List<String> propertyKeys, String filter, final ApiCallback<VersionedResourceListOfOutputTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = buildTransactionsValidateBeforeCall(scope, code, parameters, asAt, propertyKeys, filter, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelAdjustHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holding adjustments should be undone. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelAdjustHoldingsCall(String scope, String code, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", localVarApiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelAdjustHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling cancelAdjustHoldings(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling cancelAdjustHoldings(Async)");
        }
        
        // verify the required parameter 'effectiveAt' is set
        if (effectiveAt == null) {
            throw new ApiException("Missing the required parameter 'effectiveAt' when calling cancelAdjustHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = cancelAdjustHoldingsCall(scope, code, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * Cancel adjust holdings
     * Cancel all previous holding adjustments made on the specified transaction portfolio for a given effectiveAt  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holding adjustments should be undone. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse cancelAdjustHoldings(String scope, String code, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = cancelAdjustHoldingsWithHttpInfo(scope, code, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * Cancel adjust holdings
     * Cancel all previous holding adjustments made on the specified transaction portfolio for a given effectiveAt  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holding adjustments should be undone. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> cancelAdjustHoldingsWithHttpInfo(String scope, String code, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = cancelAdjustHoldingsValidateBeforeCall(scope, code, effectiveAt, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel adjust holdings (asynchronously)
     * Cancel all previous holding adjustments made on the specified transaction portfolio for a given effectiveAt  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holding adjustments should be undone. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelAdjustHoldingsAsync(String scope, String code, String effectiveAt, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelAdjustHoldingsValidateBeforeCall(scope, code, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelExecutions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelExecutionsCall(String scope, String code, List<String> executionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/executions"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (executionIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "executionIds", executionIds));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelExecutionsValidateBeforeCall(String scope, String code, List<String> executionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling cancelExecutions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling cancelExecutions(Async)");
        }
        
        // verify the required parameter 'executionIds' is set
        if (executionIds == null) {
            throw new ApiException("Missing the required parameter 'executionIds' when calling cancelExecutions(Async)");
        }
        

        okhttp3.Call localVarCall = cancelExecutionsCall(scope, code, executionIds, _callback);
        return localVarCall;

    }

    /**
     * Cancel executions
     * Cancel one or more executions from a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse cancelExecutions(String scope, String code, List<String> executionIds) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = cancelExecutionsWithHttpInfo(scope, code, executionIds);
        return localVarResp.getData();
    }

    /**
     * Cancel executions
     * Cancel one or more executions from a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> cancelExecutionsWithHttpInfo(String scope, String code, List<String> executionIds) throws ApiException {
        okhttp3.Call localVarCall = cancelExecutionsValidateBeforeCall(scope, code, executionIds, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel executions (asynchronously)
     * Cancel one or more executions from a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelExecutionsAsync(String scope, String code, List<String> executionIds, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelExecutionsValidateBeforeCall(scope, code, executionIds, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The ids of the transactions to cancel. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelTransactionsCall(String scope, String code, List<String> transactionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (transactionIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "transactionIds", transactionIds));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelTransactionsValidateBeforeCall(String scope, String code, List<String> transactionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling cancelTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling cancelTransactions(Async)");
        }
        
        // verify the required parameter 'transactionIds' is set
        if (transactionIds == null) {
            throw new ApiException("Missing the required parameter 'transactionIds' when calling cancelTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = cancelTransactionsCall(scope, code, transactionIds, _callback);
        return localVarCall;

    }

    /**
     * Cancel transactions
     * Cancel one or more transactions from the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The ids of the transactions to cancel. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse cancelTransactions(String scope, String code, List<String> transactionIds) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = cancelTransactionsWithHttpInfo(scope, code, transactionIds);
        return localVarResp.getData();
    }

    /**
     * Cancel transactions
     * Cancel one or more transactions from the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The ids of the transactions to cancel. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> cancelTransactionsWithHttpInfo(String scope, String code, List<String> transactionIds) throws ApiException {
        okhttp3.Call localVarCall = cancelTransactionsValidateBeforeCall(scope, code, transactionIds, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Cancel transactions (asynchronously)
     * Cancel one or more transactions from the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The ids of the transactions to cancel. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelTransactionsAsync(String scope, String code, List<String> transactionIds, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = cancelTransactionsValidateBeforeCall(scope, code, transactionIds, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createPortfolio
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createRequest The definition and details of the transaction portfolio. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioCall(String scope, CreateTransactionPortfolioRequest createRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPortfolioValidateBeforeCall(String scope, CreateTransactionPortfolioRequest createRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createPortfolio(Async)");
        }
        

        okhttp3.Call localVarCall = createPortfolioCall(scope, createRequest, _callback);
        return localVarCall;

    }

    /**
     * Create portfolio
     * Create a transaction portfolio in a specific scope.
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createRequest The definition and details of the transaction portfolio. (optional)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest) throws ApiException {
        ApiResponse<Portfolio> localVarResp = createPortfolioWithHttpInfo(scope, createRequest);
        return localVarResp.getData();
    }

    /**
     * Create portfolio
     * Create a transaction portfolio in a specific scope.
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createRequest The definition and details of the transaction portfolio. (optional)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Portfolio> createPortfolioWithHttpInfo(String scope, CreateTransactionPortfolioRequest createRequest) throws ApiException {
        okhttp3.Call localVarCall = createPortfolioValidateBeforeCall(scope, createRequest, null);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create portfolio (asynchronously)
     * Create a transaction portfolio in a specific scope.
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createRequest The definition and details of the transaction portfolio. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The created portfolio, with populated id </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ApiCallback<Portfolio> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPortfolioValidateBeforeCall(scope, createRequest, _callback);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePropertyFromTransaction
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param transactionPropertyKey The property key of the property value to delete from the transaction.              This must be from the \&quot;Trade\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Trade/strategy/quantsignal\&quot;. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertyFromTransactionCall(String scope, String code, String transactionId, String transactionPropertyKey, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (transactionPropertyKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transactionPropertyKey", transactionPropertyKey));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePropertyFromTransactionValidateBeforeCall(String scope, String code, String transactionId, String transactionPropertyKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deletePropertyFromTransaction(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePropertyFromTransaction(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling deletePropertyFromTransaction(Async)");
        }
        
        // verify the required parameter 'transactionPropertyKey' is set
        if (transactionPropertyKey == null) {
            throw new ApiException("Missing the required parameter 'transactionPropertyKey' when calling deletePropertyFromTransaction(Async)");
        }
        

        okhttp3.Call localVarCall = deletePropertyFromTransactionCall(scope, code, transactionId, transactionPropertyKey, _callback);
        return localVarCall;

    }

    /**
     * Delete property from transaction
     * Delete a single property value from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param transactionPropertyKey The property key of the property value to delete from the transaction.              This must be from the \&quot;Trade\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Trade/strategy/quantsignal\&quot;. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId, String transactionPropertyKey) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePropertyFromTransactionWithHttpInfo(scope, code, transactionId, transactionPropertyKey);
        return localVarResp.getData();
    }

    /**
     * Delete property from transaction
     * Delete a single property value from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param transactionPropertyKey The property key of the property value to delete from the transaction.              This must be from the \&quot;Trade\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Trade/strategy/quantsignal\&quot;. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePropertyFromTransactionWithHttpInfo(String scope, String code, String transactionId, String transactionPropertyKey) throws ApiException {
        okhttp3.Call localVarCall = deletePropertyFromTransactionValidateBeforeCall(scope, code, transactionId, transactionPropertyKey, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete property from transaction (asynchronously)
     * Delete a single property value from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param transactionPropertyKey The property key of the property value to delete from the transaction.              This must be from the \&quot;Trade\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Trade/strategy/quantsignal\&quot;. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePropertyFromTransactionValidateBeforeCall(scope, code, transactionId, transactionPropertyKey, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDetails
     * @param scope The scope of the transaction portfolio to retrieve the details for. (required)
     * @param code The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the details of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDetailsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDetailsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getDetails(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getDetails(Async)");
        }
        

        okhttp3.Call localVarCall = getDetailsCall(scope, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * Get details
     * Get the details associated with a transaction portfolio.
     * @param scope The scope of the transaction portfolio to retrieve the details for. (required)
     * @param code The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the details of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioDetails getDetails(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<PortfolioDetails> localVarResp = getDetailsWithHttpInfo(scope, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * Get details
     * Get the details associated with a transaction portfolio.
     * @param scope The scope of the transaction portfolio to retrieve the details for. (required)
     * @param code The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the details of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioDetails> getDetailsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(scope, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get details (asynchronously)
     * Get the details associated with a transaction portfolio.
     * @param scope The scope of the transaction portfolio to retrieve the details for. (required)
     * @param code The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the details of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDetailsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<PortfolioDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDetailsValidateBeforeCall(scope, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the holdings of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsCall(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (byTaxlots != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("byTaxlots", byTaxlots));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHoldingsValidateBeforeCall(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getHoldings(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = getHoldingsCall(scope, code, byTaxlots, effectiveAt, asAt, filter, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * Get holdings
     * Get the holdings of the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the holdings of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @return VersionedResourceListOfPortfolioHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfPortfolioHolding getHoldings(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<VersionedResourceListOfPortfolioHolding> localVarResp = getHoldingsWithHttpInfo(scope, code, byTaxlots, effectiveAt, asAt, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * Get holdings
     * Get the holdings of the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the holdings of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfPortfolioHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfPortfolioHolding> getHoldingsWithHttpInfo(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsValidateBeforeCall(scope, code, byTaxlots, effectiveAt, asAt, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get holdings (asynchronously)
     * Get the holdings of the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the holdings of the transaction              portfolio. Defaults to the current datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to the current datetime if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsAsync(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback<VersionedResourceListOfPortfolioHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHoldingsValidateBeforeCall(scope, code, byTaxlots, effectiveAt, asAt, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHoldingsAdjustment
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the current              datetime if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsAdjustmentCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", localVarApiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHoldingsAdjustmentValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getHoldingsAdjustment(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getHoldingsAdjustment(Async)");
        }
        
        // verify the required parameter 'effectiveAt' is set
        if (effectiveAt == null) {
            throw new ApiException("Missing the required parameter 'effectiveAt' when calling getHoldingsAdjustment(Async)");
        }
        

        okhttp3.Call localVarCall = getHoldingsAdjustmentCall(scope, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * Get holdings adjustment
     * Get a holdings adjustment made to a transaction portfolio at a specific effectiveAt datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effectiveAt datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the current              datetime if not specified. (optional)
     * @return HoldingsAdjustment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<HoldingsAdjustment> localVarResp = getHoldingsAdjustmentWithHttpInfo(scope, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * Get holdings adjustment
     * Get a holdings adjustment made to a transaction portfolio at a specific effectiveAt datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effectiveAt datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the current              datetime if not specified. (optional)
     * @return ApiResponse&lt;HoldingsAdjustment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HoldingsAdjustment> getHoldingsAdjustmentWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsAdjustmentValidateBeforeCall(scope, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<HoldingsAdjustment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get holdings adjustment (asynchronously)
     * Get a holdings adjustment made to a transaction portfolio at a specific effectiveAt datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effectiveAt datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the current              datetime if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsAdjustmentAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<HoldingsAdjustment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHoldingsAdjustmentValidateBeforeCall(scope, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<HoldingsAdjustment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effectiveAt datetime (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effectiveAt datetime (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromTransactionDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromTransactionDate", fromTransactionDate));
        }

        if (toTransactionDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toTransactionDate", toTransactionDate));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsValidateBeforeCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = getTransactionsCall(scope, code, fromTransactionDate, toTransactionDate, asAt, propertyKeys, filter, _callback);
        return localVarCall;

    }

    /**
     * Get transactions
     * Get the transactions from the specified transaction portfolio over a given interval of effectiveAt time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and ancestors) and the specified derived transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effectiveAt datetime (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effectiveAt datetime (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return VersionedResourceListOfTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfTransaction getTransactions(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> propertyKeys, String filter) throws ApiException {
        ApiResponse<VersionedResourceListOfTransaction> localVarResp = getTransactionsWithHttpInfo(scope, code, fromTransactionDate, toTransactionDate, asAt, propertyKeys, filter);
        return localVarResp.getData();
    }

    /**
     * Get transactions
     * Get the transactions from the specified transaction portfolio over a given interval of effectiveAt time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and ancestors) and the specified derived transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effectiveAt datetime (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effectiveAt datetime (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfTransaction> getTransactionsWithHttpInfo(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> propertyKeys, String filter) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, propertyKeys, filter, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get transactions (asynchronously)
     * Get the transactions from the specified transaction portfolio over a given interval of effectiveAt time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and ancestors) and the specified derived transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effectiveAt datetime (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effectiveAt datetime (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to the current              datetime if not specified. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Trade\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Trade/strategy/quantsignal\&quot;. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsAsync(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> propertyKeys, String filter, final ApiCallback<VersionedResourceListOfTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, propertyKeys, filter, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listHoldingsAdjustments
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to the              current datetime if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listHoldingsAdjustmentsCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsadjustments"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (toEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listHoldingsAdjustmentsValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listHoldingsAdjustments(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling listHoldingsAdjustments(Async)");
        }
        

        okhttp3.Call localVarCall = listHoldingsAdjustmentsCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * List holdings adjustments
     * List the holdings adjustments made to a transaction portfolio over a given interval of effectiveAt time.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to the              current datetime if not specified. (optional)
     * @return ResourceListOfHoldingsAdjustmentHeader
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<ResourceListOfHoldingsAdjustmentHeader> localVarResp = listHoldingsAdjustmentsWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * List holdings adjustments
     * List the holdings adjustments made to a transaction portfolio over a given interval of effectiveAt time.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to the              current datetime if not specified. (optional)
     * @return ApiResponse&lt;ResourceListOfHoldingsAdjustmentHeader&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = listHoldingsAdjustmentsValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<ResourceListOfHoldingsAdjustmentHeader>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List holdings adjustments (asynchronously)
     * List the holdings adjustments made to a transaction portfolio over a given interval of effectiveAt time.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effectiveAt datetime (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to the              current datetime if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listHoldingsAdjustmentsAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, final ApiCallback<ResourceListOfHoldingsAdjustmentHeader> _callback) throws ApiException {

        okhttp3.Call localVarCall = listHoldingsAdjustmentsValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfHoldingsAdjustmentHeader>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The complete set of target holdings for the transaction portfolio. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setHoldingsCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = holdingAdjustments;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", localVarApiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling setHoldings(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling setHoldings(Async)");
        }
        
        // verify the required parameter 'effectiveAt' is set
        if (effectiveAt == null) {
            throw new ApiException("Missing the required parameter 'effectiveAt' when calling setHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = setHoldingsCall(scope, code, effectiveAt, holdingAdjustments, _callback);
        return localVarCall;

    }

    /**
     * Set holdings
     * Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the given effectiveAt datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The complete set of target holdings for the transaction portfolio. (optional)
     * @return AdjustHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AdjustHolding setHoldings(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        ApiResponse<AdjustHolding> localVarResp = setHoldingsWithHttpInfo(scope, code, effectiveAt, holdingAdjustments);
        return localVarResp.getData();
    }

    /**
     * Set holdings
     * Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the given effectiveAt datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The complete set of target holdings for the transaction portfolio. (optional)
     * @return ApiResponse&lt;AdjustHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdjustHolding> setHoldingsWithHttpInfo(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        okhttp3.Call localVarCall = setHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, null);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set holdings (asynchronously)
     * Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the given effectiveAt datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the holdings should be set to the provided targets. (required)
     * @param holdingAdjustments The complete set of target holdings for the transaction portfolio. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setHoldingsAsync(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback<AdjustHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = setHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, _callback);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertExecutions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executions The executions to be upserted. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertExecutionsCall(String scope, String code, List<ExecutionRequest> executions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = executions;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/executions"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertExecutionsValidateBeforeCall(String scope, String code, List<ExecutionRequest> executions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertExecutions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertExecutions(Async)");
        }
        

        okhttp3.Call localVarCall = upsertExecutionsCall(scope, code, executions, _callback);
        return localVarCall;

    }

    /**
     * Upsert executions
     * Upsert executions into the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executions The executions to be upserted. (optional)
     * @return UpsertPortfolioExecutionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code, List<ExecutionRequest> executions) throws ApiException {
        ApiResponse<UpsertPortfolioExecutionsResponse> localVarResp = upsertExecutionsWithHttpInfo(scope, code, executions);
        return localVarResp.getData();
    }

    /**
     * Upsert executions
     * Upsert executions into the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executions The executions to be upserted. (optional)
     * @return ApiResponse&lt;UpsertPortfolioExecutionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertPortfolioExecutionsResponse> upsertExecutionsWithHttpInfo(String scope, String code, List<ExecutionRequest> executions) throws ApiException {
        okhttp3.Call localVarCall = upsertExecutionsValidateBeforeCall(scope, code, executions, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioExecutionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert executions (asynchronously)
     * Upsert executions into the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executions The executions to be upserted. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executions, final ApiCallback<UpsertPortfolioExecutionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertExecutionsValidateBeforeCall(scope, code, executions, _callback);
        Type localVarReturnType = new TypeToken<UpsertPortfolioExecutionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertPortfolioDetails
     * @param scope The scope of the transaction portfolio to upsert details for. (required)
     * @param code The code of the transaction portfolio to upsert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the upserted details should take effect. Defaults              to the current datetime if not specified. (optional)
     * @param details The details to upsert to the specified transaction portfolio. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The latest version of the created/updated details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPortfolioDetailsCall(String scope, String code, String effectiveAt, CreatePortfolioDetails details, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = details;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertPortfolioDetailsValidateBeforeCall(String scope, String code, String effectiveAt, CreatePortfolioDetails details, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertPortfolioDetails(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertPortfolioDetails(Async)");
        }
        

        okhttp3.Call localVarCall = upsertPortfolioDetailsCall(scope, code, effectiveAt, details, _callback);
        return localVarCall;

    }

    /**
     * Upsert portfolio details
     * Upsert details for the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio to upsert details for. (required)
     * @param code The code of the transaction portfolio to upsert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the upserted details should take effect. Defaults              to the current datetime if not specified. (optional)
     * @param details The details to upsert to the specified transaction portfolio. (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The latest version of the created/updated details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code, String effectiveAt, CreatePortfolioDetails details) throws ApiException {
        ApiResponse<PortfolioDetails> localVarResp = upsertPortfolioDetailsWithHttpInfo(scope, code, effectiveAt, details);
        return localVarResp.getData();
    }

    /**
     * Upsert portfolio details
     * Upsert details for the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio to upsert details for. (required)
     * @param code The code of the transaction portfolio to upsert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the upserted details should take effect. Defaults              to the current datetime if not specified. (optional)
     * @param details The details to upsert to the specified transaction portfolio. (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The latest version of the created/updated details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioDetails> upsertPortfolioDetailsWithHttpInfo(String scope, String code, String effectiveAt, CreatePortfolioDetails details) throws ApiException {
        okhttp3.Call localVarCall = upsertPortfolioDetailsValidateBeforeCall(scope, code, effectiveAt, details, null);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert portfolio details (asynchronously)
     * Upsert details for the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio to upsert details for. (required)
     * @param code The code of the transaction portfolio to upsert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effectiveAt datetime at which the upserted details should take effect. Defaults              to the current datetime if not specified. (optional)
     * @param details The details to upsert to the specified transaction portfolio. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The latest version of the created/updated details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPortfolioDetailsAsync(String scope, String code, String effectiveAt, CreatePortfolioDetails details, final ApiCallback<PortfolioDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertPortfolioDetailsValidateBeforeCall(scope, code, effectiveAt, details, _callback);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactions The transactions to be upserted. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertTransactionsCall(String scope, String code, List<TransactionRequest> transactions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactions;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.10.410");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertTransactionsValidateBeforeCall(String scope, String code, List<TransactionRequest> transactions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = upsertTransactionsCall(scope, code, transactions, _callback);
        return localVarCall;

    }

    /**
     * Upsert transactions
     * Upsert transactions into the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactions The transactions to be upserted. (optional)
     * @return UpsertPortfolioTransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactions) throws ApiException {
        ApiResponse<UpsertPortfolioTransactionsResponse> localVarResp = upsertTransactionsWithHttpInfo(scope, code, transactions);
        return localVarResp.getData();
    }

    /**
     * Upsert transactions
     * Upsert transactions into the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactions The transactions to be upserted. (optional)
     * @return ApiResponse&lt;UpsertPortfolioTransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertPortfolioTransactionsResponse> upsertTransactionsWithHttpInfo(String scope, String code, List<TransactionRequest> transactions) throws ApiException {
        okhttp3.Call localVarCall = upsertTransactionsValidateBeforeCall(scope, code, transactions, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert transactions (asynchronously)
     * Upsert transactions into the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactions The transactions to be upserted. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ApiCallback<UpsertPortfolioTransactionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertTransactionsValidateBeforeCall(scope, code, transactions, _callback);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
