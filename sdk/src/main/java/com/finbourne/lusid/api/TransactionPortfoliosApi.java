/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://api.lusid.com/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages :  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python)  # Data Model  The LUSID API has a relatively lightweight but extremely powerful data model.   One of the goals of LUSID was not to enforce on clients a single rigid data model but rather to provide a flexible foundation onto which clients can streamline their data.   One of the primary tools to extend the data model is through using properties.  Properties can be associated with amongst others: - * Transactions * Instruments * Portfolios   The LUSID data model is exposed through the LUSID APIs.  The APIs provide access to both business objects and the meta data used to configure the systems behaviours.   The key business entities are: - * **Portfolios** A portfolio is the primary container for transactions and holdings.  * **Derived Portfolios** Derived portfolios allow portfolios to be created based on other portfolios, by overriding or overlaying specific items * **Holdings** A holding is a position account for a instrument within a portfolio.  Holdings can only be adjusted via transactions. * **Transactions** A Transaction is a source of transactions used to manipulate holdings.  * **Corporate Actions** A corporate action is a market event which occurs to a instrument, for example a stock split * **Instruments**  A instrument represents a currency, tradable instrument or OTC contract that is attached to a transaction and a holding. * **Properties** Several entities allow additional user defined properties to be associated with them.   For example, a Portfolio manager may be associated with a portfolio  Meta data includes: - * **Transaction Types** Transactions are booked with a specific transaction type.  The types are client defined and are used to map the Transaction to a series of movements which update the portfolio holdings.  * **Properties Types** Types of user defined properties used within the system.  This section describes the data model that LUSID exposes via the APIs.  ## Scope  All data in LUSID is segregated at the client level.  Entities in LUSID are identifiable by a unique code.  Every entity lives within a logical data partition known as a Scope.  Scope is an identity namespace allowing two entities with the same unique code to co-exist within individual address spaces.  For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.  LUSID Clients cannot access scopes of other clients.  ## Schema  A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.  ## Instruments  LUSID has its own built-in instrument master which you can use to master your own instrument universe.  Every instrument must be created with one or more unique market identifiers, such as [FIGI](https://openfigi.com/). For any non-listed instruments (eg OTCs), you can upload an instrument against a custom ID of your choosing.  In addition, LUSID will allocate each instrument a unique 'LUSID instrument identifier'. The LUSID instrument identifier is what is used when uploading transactions, holdings, prices, etc. The API exposes an `instrument/lookup` endpoint which can be used to lookup these LUSID identifiers using their market identifiers.  Cash can be referenced using the ISO currency code prefixed with \"`CCY_`\" e.g. `CCY_GBP`  ## Instrument Prices (Analytics)  Instrument prices are stored in LUSID's Analytics Store  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | Value|decimal|Value of the analytic, eg price | | Denomination|string|Underlying unit of the analytic, eg currency, EPS etc. |   ## Instrument Data  Instrument data can be uploaded to the system using the [Instrument Properties](#tag/InstrumentProperties) endpoint.  | Field|Type|Description | | ---|---|--- |   ## Portfolios  Portfolios are the top-level entity containers within LUSID, containing transactions, corporate actions and holdings.    The transactions build up the portfolio holdings on which valuations, analytics profit & loss and risk can be calculated.     Properties can be associated with Portfolios to add in additional model data.  Portfolio properties can be changed over time as well.  For example, to allow a Portfolio Manager to be linked with a Portfolio.  Additionally, portfolios can be securitised and held by other portfolios, allowing LUSID to perform \"drill-through\" into underlying fund holdings  ### Reference Portfolios Reference portfolios are portfolios that contain only weights, as opposed to transactions, and are designed to represent entities such as indices.  ### Derived Portfolios  LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own transactions and also inherits any transactions from its parent portfolio.  Any changes made to the parent portfolio are automatically reflected in derived portfolio.  Derived portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a derived portfolio could be created a new namespace linked to the underlying live (parent) portfolio.  Analysis can then be undertaken on the derived portfolio without affecting the live portfolio.  ### Portfolio Groups Portfolio groups allow the construction of a hierarchy from portfolios and groups.  Portfolio operations on the group are executed on an aggregated set of portfolios in the hierarchy.   For example:   * Global Portfolios _(group)_   * APAC _(group)_     * Hong Kong _(portfolio)_     * Japan _(portfolio)_   * Europe _(group)_     * France _(portfolio)_     * Germany _(portfolio)_   * UK _(portfolio)_   In this example **Global Portfolios** is a group that consists of an aggregate of **Hong Kong**, **Japan**, **France**, **Germany** and **UK** portfolios.  ### Movements Engine The Movements engine sits on top of the immutable event store and is used to manage the relationship between input trading actions and their associated portfolio holdings.     The movements engine reads in the following entity types:- * Posting Transactions * Applying Corporate Actions  * Holding Adjustments  These are converted to one or more movements and used by the movements engine to calculate holdings.  At the same time it also calculates running balances, and realised P&L.  The outputs from the movements engine are holdings and transactions.  ## Transactions  A transaction represents an economic activity against a Portfolio.  Transactions are processed according to a configuration. This will tell the LUSID engine how to interpret the transaction and correctly update the holdings. LUSID comes with a set of transaction types you can use out of the box, or you can configure your own set(s) of transactions.  For more details see the [LUSID Getting Started Guide for transaction configuration.](https://support.finbourne.com/hc/en-us/articles/360016737511-Configuring-Transaction-Types)  | Field|Type|Description | | ---|---|--- | | TransactionId|string|Unique transaction identifier | | Type|string|LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | | InstrumentIdentifiers|map|Unique instrument identifiers | | InstrumentUid|string|LUSID's internal unique instrument identifier, resolved from the instrument identifiers | | TransactionDate|datetime|Transaction date | | SettlementDate|datetime|Settlement date | | Units|decimal|Quantity of trade in units of the instrument | | TransactionPrice|tradeprice|Execution price for the transaction | | TotalConsideration|currencyandamount|Total value of the transaction in settlement currency | | ExchangeRate|decimal|Rate between transaction and settlement currency | | TransactionCurrency|currency|Transaction currency | | CounterpartyId|string|Counterparty identifier | | Source|string|Where this transaction came from | | NettingSet|string|  |   From these fields, the following values can be calculated  * **Transaction value in Transaction currency**: TotalConsideration / ExchangeRate  * **Transaction value in Portfolio currency**: Transaction value in Transaction currency * TradeToPortfolioRate  ### Example Transactions  #### A Common Purchase Example Three example transactions are shown in the table below.   They represent a purchase of USD denominated IBM shares within a Sterling denominated portfolio.   * The first two transactions are for separate buy and fx trades    * Buying 500 IBM shares for $71,480.00    * A foreign exchange conversion to fund the IBM purchase. (Buy $71,480.00 for &#163;54,846.60)  * The third transaction is an alternate version of the above trades. Buying 500 IBM shares and settling directly in Sterling.  | Column |  Buy Trade | Fx Trade | Buy Trade with foreign Settlement | | ----- | ----- | ----- | ----- | | TransactionId | FBN00001 | FBN00002 | FBN00003 | | Type | Buy | FxBuy | Buy | | InstrumentIdentifiers | { \"figi\", \"BBG000BLNNH6\" } | { \"CCY\", \"CCY_USD\" } | { \"figi\", \"BBG000BLNNH6\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | 2018-08-02 | | SettlementDate | 2018-08-06 | 2018-08-06 | 2018-08-06 | | Units | 500 | 71480 | 500 | | TransactionPrice | 142.96 | 1 | 142.96 | | TradeCurrency | USD | USD | USD | | ExchangeRate | 1 | 0.7673 | 0.7673 | | TotalConsideration.Amount | 71480.00 | 54846.60 | 54846.60 | | TotalConsideration.Currency | USD | GBP | GBP | | Trade/default/TradeToPortfolioRate&ast; | 0.7673 | 0.7673 | 0.7673 |  [&ast; This is a property field]  #### A Forward FX Example  LUSID has a flexible transaction modelling system, and there are a number of different ways of modelling forward fx trades.  The default LUSID transaction types are FwdFxBuy and FwdFxSell. Other types and behaviours can be configured as required.  Using these transaction types, the holdings query will report two forward positions. One in each currency.   Since an FX trade is an exchange of one currency for another, the following two 6 month forward transactions are equivalent:  | Column |  Forward 'Sell' Trade | Forward 'Buy' Trade | | ----- | ----- | ----- | | TransactionId | FBN00004 | FBN00005 | | Type | FwdFxSell | FwdFxBuy | | InstrumentIdentifiers | { \"CCY\", \"CCY_GBP\" } | { \"CCY\", \"CCY_USD\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | | SettlementDate | 2019-02-06 | 2019-02-06 | | Units | 10000.00 | 13142.00 | | TransactionPrice |1 | 1 | | TradeCurrency | GBP | USD | | ExchangeRate | 1.3142 | 0.760919 | | TotalConsideration.Amount | 13142.00 | 10000.00 | | TotalConsideration.Currency | USD | GBP | | Trade/default/TradeToPortfolioRate | 1.0 | 0.760919 |  ## Holdings  A holding represents a position in a instrument or cash on a given date.  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | HoldingType|string|Type of holding, eg Position, Balance, CashCommitment, Receivable, ForwardFX | | Units|decimal|Quantity of holding | | SettledUnits|decimal|Settled quantity of holding | | Cost|currencyandamount|Book cost of holding in transaction currency | | CostPortfolioCcy|currencyandamount|Book cost of holding in portfolio currency | | Transaction|Transaction|If this is commitment-type holding, the transaction behind it |   ## Corporate Actions  Corporate actions are represented within LUSID in terms of a set of instrument-specific 'transitions'.  These transitions are used to specify the participants of the corporate action, and the effect that the corporate action will have on holdings in those participants.  ### Corporate Action  | Field|Type|Description | | ---|---|--- | | CorporateActionCode|code|The unique identifier of this corporate action | | AnnouncementDate|datetime|The announcement date of the corporate action | | ExDate|datetime|The ex date of the corporate action | | RecordDate|datetime|The record date of the corporate action | | PaymentDate|datetime|The payment date of the corporate action | | Transitions|list|The transitions that result from this corporate action |   ### Transition  | Field|Type|Description | | ---|---|--- | | InputTransition|transition|Indicating the basis of the corporate action - which security and how many units | | OutputTransitions|list|What will be generated relative to the input transition |   ### Example Corporate Action Transitions  #### A Dividend Action Transition  In this example, for each share of IBM, 0.20 units (or 20 pence) of GBP are generated.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"ccy\" : \"CCY_GBP\" } | | Units Factor | 1 | 0.20 | | Cost Factor | 1 | 0 |  #### A Split Action Transition  In this example, for each share of IBM, we end up with 2 units (2 shares) of IBM, with total value unchanged.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | | Units Factor | 1 | 2 | | Cost Factor | 1 | 1 |  #### A Spinoff Action Transition  In this example, for each share of IBM, we end up with 1 unit (1 share) of IBM and 3 units (3 shares) of Celestica, with 85% of the value remaining on the IBM share, and 5% in each Celestica share (15% total).  | Column |  Input Transition | Output Transition 1 | Output Transition 2 | | ----- | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000HBGRF3\" } | | Units Factor | 1 | 1 | 3 | | Cost Factor | 1 | 0.85 | 0.15 |  ## Property  Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.  # Schemas  The following headers are returned on all responses from LUSID  | Name | Purpose | | --- | --- | | lusid-meta-duration | Duration of the request | | lusid-meta-success | Whether or not LUSID considered the request to be successful | | lusid-meta-requestId | The unique identifier for the request | | lusid-schema-url | Url of the schema for the data being returned | | lusid-property-schema-url | Url of the schema for any properties |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"102\">102</a>|VersionNotFound|  | | <a name=\"104\">104</a>|InstrumentNotFound|  | | <a name=\"105\">105</a>|PropertyNotFound|  | | <a name=\"106\">106</a>|PortfolioRecursionDepth|  | | <a name=\"108\">108</a>|GroupNotFound|  | | <a name=\"109\">109</a>|PortfolioNotFound|  | | <a name=\"110\">110</a>|PropertySchemaNotFound|  | | <a name=\"111\">111</a>|PortfolioAncestryNotFound|  | | <a name=\"112\">112</a>|PortfolioWithIdAlreadyExists|  | | <a name=\"113\">113</a>|OrphanedPortfolio|  | | <a name=\"119\">119</a>|MissingBaseClaims|  | | <a name=\"121\">121</a>|PropertyNotDefined|  | | <a name=\"122\">122</a>|CannotDeleteSystemProperty|  | | <a name=\"123\">123</a>|CannotModifyImmutablePropertyField|  | | <a name=\"124\">124</a>|PropertyAlreadyExists|  | | <a name=\"125\">125</a>|InvalidPropertyLifeTime|  | | <a name=\"127\">127</a>|CannotModifyDefaultDataType|  | | <a name=\"128\">128</a>|GroupAlreadyExists|  | | <a name=\"129\">129</a>|NoSuchDataType|  | | <a name=\"132\">132</a>|ValidationError|  | | <a name=\"133\">133</a>|LoopDetectedInGroupHierarchy|  | | <a name=\"135\">135</a>|SubGroupAlreadyExists|  | | <a name=\"138\">138</a>|PriceSourceNotFound|  | | <a name=\"139\">139</a>|AnalyticStoreNotFound|  | | <a name=\"141\">141</a>|AnalyticStoreAlreadyExists|  | | <a name=\"143\">143</a>|ClientInstrumentAlreadyExists|  | | <a name=\"144\">144</a>|DuplicateInParameterSet|  | | <a name=\"147\">147</a>|ResultsNotFound|  | | <a name=\"148\">148</a>|OrderFieldNotInResultSet|  | | <a name=\"149\">149</a>|OperationFailed|  | | <a name=\"150\">150</a>|ElasticSearchError|  | | <a name=\"151\">151</a>|InvalidParameterValue|  | | <a name=\"153\">153</a>|CommandProcessingFailure|  | | <a name=\"154\">154</a>|EntityStateConstructionFailure|  | | <a name=\"155\">155</a>|EntityTimelineDoesNotExist|  | | <a name=\"156\">156</a>|EventPublishFailure|  | | <a name=\"157\">157</a>|InvalidRequestFailure|  | | <a name=\"158\">158</a>|EventPublishUnknown|  | | <a name=\"159\">159</a>|EventQueryFailure|  | | <a name=\"160\">160</a>|BlobDidNotExistFailure|  | | <a name=\"162\">162</a>|SubSystemRequestFailure|  | | <a name=\"163\">163</a>|SubSystemConfigurationFailure|  | | <a name=\"165\">165</a>|FailedToDelete|  | | <a name=\"166\">166</a>|UpsertClientInstrumentFailure|  | | <a name=\"167\">167</a>|IllegalAsAtInterval|  | | <a name=\"168\">168</a>|IllegalBitemporalQuery|  | | <a name=\"169\">169</a>|InvalidAlternateId|  | | <a name=\"170\">170</a>|CannotAddSourcePortfolioPropertyExplicitly|  | | <a name=\"171\">171</a>|EntityAlreadyExistsInGroup|  | | <a name=\"173\">173</a>|EntityWithIdAlreadyExists|  | | <a name=\"174\">174</a>|DerivedPortfolioDetailsDoNotExist|  | | <a name=\"176\">176</a>|PortfolioWithNameAlreadyExists|  | | <a name=\"177\">177</a>|InvalidTransactions|  | | <a name=\"178\">178</a>|ReferencePortfolioNotFound|  | | <a name=\"179\">179</a>|DuplicateIdFailure|  | | <a name=\"180\">180</a>|CommandRetrievalFailure|  | | <a name=\"181\">181</a>|DataFilterApplicationFailure|  | | <a name=\"182\">182</a>|SearchFailed|  | | <a name=\"183\">183</a>|MovementsEngineConfigurationKeyFailure|  | | <a name=\"184\">184</a>|FxRateSourceNotFound|  | | <a name=\"185\">185</a>|AccrualSourceNotFound|  | | <a name=\"186\">186</a>|AccessDenied|  | | <a name=\"187\">187</a>|InvalidIdentityToken|  | | <a name=\"188\">188</a>|InvalidRequestHeaders|  | | <a name=\"189\">189</a>|PriceNotFound|  | | <a name=\"190\">190</a>|InvalidSubHoldingKeysProvided|  | | <a name=\"191\">191</a>|DuplicateSubHoldingKeysProvided|  | | <a name=\"192\">192</a>|CutDefinitionNotFound|  | | <a name=\"193\">193</a>|CutDefinitionInvalid|  | | <a name=\"200\">200</a>|InvalidUnitForDataType|  | | <a name=\"201\">201</a>|InvalidTypeForDataType|  | | <a name=\"202\">202</a>|InvalidValueForDataType|  | | <a name=\"203\">203</a>|UnitNotDefinedForDataType|  | | <a name=\"204\">204</a>|UnitsNotSupportedOnDataType|  | | <a name=\"205\">205</a>|CannotSpecifyUnitsOnDataType|  | | <a name=\"206\">206</a>|UnitSchemaInconsistentWithDataType|  | | <a name=\"207\">207</a>|UnitDefinitionNotSpecified|  | | <a name=\"208\">208</a>|DuplicateUnitDefinitionsSpecified|  | | <a name=\"209\">209</a>|InvalidUnitsDefinition|  | | <a name=\"210\">210</a>|InvalidInstrumentIdentifierUnit|  | | <a name=\"211\">211</a>|HoldingsAdjustmentDoesNotExist|  | | <a name=\"212\">212</a>|CouldNotBuildExcelUrl|  | | <a name=\"213\">213</a>|CouldNotGetExcelVersion|  | | <a name=\"214\">214</a>|InstrumentByCodeNotFound|  | | <a name=\"215\">215</a>|EntitySchemaDoesNotExist|  | | <a name=\"216\">216</a>|FeatureNotSupportedOnPortfolioType|  | | <a name=\"217\">217</a>|QuoteNotFoundFailure|  | | <a name=\"219\">219</a>|InvalidInstrumentDefinition|  | | <a name=\"221\">221</a>|InstrumentUpsertFailure|  | | <a name=\"222\">222</a>|ReferencePortfolioRequestNotSupported|  | | <a name=\"223\">223</a>|TransactionPortfolioRequestNotSupported|  | | <a name=\"224\">224</a>|InvalidPropertyValueAssignment|  | | <a name=\"230\">230</a>|TransactionTypeNotFound|  | | <a name=\"231\">231</a>|TransactionTypeDuplication|  | | <a name=\"232\">232</a>|PortfolioDoesNotExistAtGivenDate|  | | <a name=\"233\">233</a>|QueryParserFailure|  | | <a name=\"234\">234</a>|DuplicateConstituentFailure|  | | <a name=\"235\">235</a>|UnresolvedInstrumentConstituentFailure|  | | <a name=\"236\">236</a>|UnresolvedInstrumentInTransitionFailure|  | | <a name=\"300\">300</a>|MissingRecipeFailure|  | | <a name=\"301\">301</a>|DependenciesFailure|  | | <a name=\"304\">304</a>|PortfolioPreprocessFailure|  | | <a name=\"310\">310</a>|ValuationEngineFailure|  | | <a name=\"311\">311</a>|TaskFactoryFailure|  | | <a name=\"312\">312</a>|TaskEvaluationFailure|  | | <a name=\"350\">350</a>|InstrumentFailure|  | | <a name=\"351\">351</a>|CashFlowsFailure|  | | <a name=\"360\">360</a>|AggregationFailure|  | | <a name=\"370\">370</a>|ResultRetrievalFailure|  | | <a name=\"371\">371</a>|ResultProcessingFailure|  | | <a name=\"371\">371</a>|ResultProcessingFailure|  | | <a name=\"372\">372</a>|VendorResultProcessingFailure|  | | <a name=\"374\">374</a>|AttemptToUpsertDuplicateQuotes|  | | <a name=\"375\">375</a>|CorporateActionSourceDoesNotExist|  | | <a name=\"376\">376</a>|InstrumentIdentifierAlreadyInUse|  | | <a name=\"377\">377</a>|CorporateActionSourceAlreadyExists|  | | <a name=\"-10\">-10</a>|ServerConfigurationError|  | | <a name=\"-1\">-1</a>|Unknown error|  | 
 *
 * OpenAPI spec version: 0.10.218
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
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
    private ApiClient apiClient;

    public TransactionPortfoliosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionPortfoliosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addTransactionProperty
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionId Id of transaction (required)
     * @param transactionProperties Transaction properties values (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addTransactionPropertyCall(String scope, String code, String transactionId, Object transactionProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transactionProperties;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addTransactionPropertyValidateBeforeCall(String scope, String code, String transactionId, Object transactionProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = addTransactionPropertyCall(scope, code, transactionId, transactionProperties, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add transaction properties
     * Upsert one or more transaction properties to a single transaction in a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionId Id of transaction (required)
     * @param transactionProperties Transaction properties values (optional)
     * @return AddTransactionPropertyResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AddTransactionPropertyResponse addTransactionProperty(String scope, String code, String transactionId, Object transactionProperties) throws ApiException {
        ApiResponse<AddTransactionPropertyResponse> resp = addTransactionPropertyWithHttpInfo(scope, code, transactionId, transactionProperties);
        return resp.getData();
    }

    /**
     * Add transaction properties
     * Upsert one or more transaction properties to a single transaction in a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionId Id of transaction (required)
     * @param transactionProperties Transaction properties values (optional)
     * @return ApiResponse&lt;AddTransactionPropertyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AddTransactionPropertyResponse> addTransactionPropertyWithHttpInfo(String scope, String code, String transactionId, Object transactionProperties) throws ApiException {
        com.squareup.okhttp.Call call = addTransactionPropertyValidateBeforeCall(scope, code, transactionId, transactionProperties, null, null);
        Type localVarReturnType = new TypeToken<AddTransactionPropertyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add transaction properties (asynchronously)
     * Upsert one or more transaction properties to a single transaction in a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionId Id of transaction (required)
     * @param transactionProperties Transaction properties values (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTransactionPropertyAsync(String scope, String code, String transactionId, Object transactionProperties, final ApiCallback<AddTransactionPropertyResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addTransactionPropertyValidateBeforeCall(scope, code, transactionId, transactionProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AddTransactionPropertyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for adjustHoldings
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The selected set of holdings adjustments (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call adjustHoldingsCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = holdingAdjustments;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", apiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call adjustHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = adjustHoldingsCall(scope, code, effectiveAt, holdingAdjustments, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Adjust holdings
     * Adjust one or more holdings in a transaction portfolio    Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The selected set of holdings adjustments (optional)
     * @return AdjustHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdjustHolding adjustHoldings(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        ApiResponse<AdjustHolding> resp = adjustHoldingsWithHttpInfo(scope, code, effectiveAt, holdingAdjustments);
        return resp.getData();
    }

    /**
     * Adjust holdings
     * Adjust one or more holdings in a transaction portfolio    Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The selected set of holdings adjustments (optional)
     * @return ApiResponse&lt;AdjustHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdjustHolding> adjustHoldingsWithHttpInfo(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        com.squareup.okhttp.Call call = adjustHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, null, null);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adjust holdings (asynchronously)
     * Adjust one or more holdings in a transaction portfolio    Prompt the creation of transactions in a specific transaction portfolio to bring selected holdings to the specified targets
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The selected set of holdings adjustments (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call adjustHoldingsAsync(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback<AdjustHolding> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = adjustHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for buildTransactions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param parameters Optional. Transaction query parameters (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call buildTransactionsCall(String scope, String code, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, TransactionQueryParameters parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = parameters;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/$build"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (sortBy != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "sortBy", sortBy));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (propertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call buildTransactionsValidateBeforeCall(String scope, String code, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, TransactionQueryParameters parameters, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling buildTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling buildTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = buildTransactionsCall(scope, code, asAt, sortBy, start, limit, propertyKeys, filter, parameters, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Build output transactions
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param parameters Optional. Transaction query parameters (optional)
     * @return VersionedResourceListOfOutputTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, TransactionQueryParameters parameters) throws ApiException {
        ApiResponse<VersionedResourceListOfOutputTransaction> resp = buildTransactionsWithHttpInfo(scope, code, asAt, sortBy, start, limit, propertyKeys, filter, parameters);
        return resp.getData();
    }

    /**
     * Build output transactions
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param parameters Optional. Transaction query parameters (optional)
     * @return ApiResponse&lt;VersionedResourceListOfOutputTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedResourceListOfOutputTransaction> buildTransactionsWithHttpInfo(String scope, String code, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, TransactionQueryParameters parameters) throws ApiException {
        com.squareup.okhttp.Call call = buildTransactionsValidateBeforeCall(scope, code, asAt, sortBy, start, limit, propertyKeys, filter, parameters, null, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Build output transactions (asynchronously)
     * Builds and returns the collection of all types of transactions that affect the holdings of a portfolio in to a set of output transactions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param parameters Optional. Transaction query parameters (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call buildTransactionsAsync(String scope, String code, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, TransactionQueryParameters parameters, final ApiCallback<VersionedResourceListOfOutputTransaction> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = buildTransactionsValidateBeforeCall(scope, code, asAt, sortBy, start, limit, propertyKeys, filter, parameters, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for cancelAdjustHoldings
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call cancelAdjustHoldingsCall(String scope, String code, String effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", apiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call cancelAdjustHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = cancelAdjustHoldingsCall(scope, code, effectiveAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Cancel holdings adjustments
     * Cancel previous adjust-holdings for the portfolio for a specific date
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedEntityResponse cancelAdjustHoldings(String scope, String code, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> resp = cancelAdjustHoldingsWithHttpInfo(scope, code, effectiveAt);
        return resp.getData();
    }

    /**
     * Cancel holdings adjustments
     * Cancel previous adjust-holdings for the portfolio for a specific date
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedEntityResponse> cancelAdjustHoldingsWithHttpInfo(String scope, String code, String effectiveAt) throws ApiException {
        com.squareup.okhttp.Call call = cancelAdjustHoldingsValidateBeforeCall(scope, code, effectiveAt, null, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel holdings adjustments (asynchronously)
     * Cancel previous adjust-holdings for the portfolio for a specific date
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call cancelAdjustHoldingsAsync(String scope, String code, String effectiveAt, final ApiCallback<DeletedEntityResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = cancelAdjustHoldingsValidateBeforeCall(scope, code, effectiveAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for createPortfolio
     * @param scope The scope into which the transaction portfolio will be created (required)
     * @param createRequest The transaction portfolio definition (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createPortfolioCall(String scope, CreateTransactionPortfolioRequest createRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createPortfolioValidateBeforeCall(String scope, CreateTransactionPortfolioRequest createRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createPortfolio(Async)");
        }
        

        com.squareup.okhttp.Call call = createPortfolioCall(scope, createRequest, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create transaction portfolio
     * Create a transaction portfolio in a specific scope
     * @param scope The scope into which the transaction portfolio will be created (required)
     * @param createRequest The transaction portfolio definition (optional)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createRequest) throws ApiException {
        ApiResponse<Portfolio> resp = createPortfolioWithHttpInfo(scope, createRequest);
        return resp.getData();
    }

    /**
     * Create transaction portfolio
     * Create a transaction portfolio in a specific scope
     * @param scope The scope into which the transaction portfolio will be created (required)
     * @param createRequest The transaction portfolio definition (optional)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portfolio> createPortfolioWithHttpInfo(String scope, CreateTransactionPortfolioRequest createRequest) throws ApiException {
        com.squareup.okhttp.Call call = createPortfolioValidateBeforeCall(scope, createRequest, null, null);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create transaction portfolio (asynchronously)
     * Create a transaction portfolio in a specific scope
     * @param scope The scope into which the transaction portfolio will be created (required)
     * @param createRequest The transaction portfolio definition (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createRequest, final ApiCallback<Portfolio> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createPortfolioValidateBeforeCall(scope, createRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteExecutions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executionIds Ids of executions to delete (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteExecutionsCall(String scope, String code, List<String> executionIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/executions"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (executionIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "executionIds", executionIds));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteExecutionsValidateBeforeCall(String scope, String code, List<String> executionIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteExecutions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteExecutions(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteExecutionsCall(scope, code, executionIds, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete executions
     * Delete one or more executions from a transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executionIds Ids of executions to delete (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedEntityResponse deleteExecutions(String scope, String code, List<String> executionIds) throws ApiException {
        ApiResponse<DeletedEntityResponse> resp = deleteExecutionsWithHttpInfo(scope, code, executionIds);
        return resp.getData();
    }

    /**
     * Delete executions
     * Delete one or more executions from a transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executionIds Ids of executions to delete (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedEntityResponse> deleteExecutionsWithHttpInfo(String scope, String code, List<String> executionIds) throws ApiException {
        com.squareup.okhttp.Call call = deleteExecutionsValidateBeforeCall(scope, code, executionIds, null, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete executions (asynchronously)
     * Delete one or more executions from a transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executionIds Ids of executions to delete (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteExecutionsAsync(String scope, String code, List<String> executionIds, final ApiCallback<DeletedEntityResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteExecutionsValidateBeforeCall(scope, code, executionIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deletePropertyFromTransaction
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param transactionId Id of the transaction to delete the property from (required)
     * @param transactionPropertyKey The key of the property to be deleted (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePropertyFromTransactionCall(String scope, String code, String transactionId, String transactionPropertyKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", apiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (transactionPropertyKey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("transactionPropertyKey", transactionPropertyKey));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePropertyFromTransactionValidateBeforeCall(String scope, String code, String transactionId, String transactionPropertyKey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = deletePropertyFromTransactionCall(scope, code, transactionId, transactionPropertyKey, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete transaction property
     * Delete a property value from a single transaction in a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param transactionId Id of the transaction to delete the property from (required)
     * @param transactionPropertyKey The key of the property to be deleted (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedEntityResponse deletePropertyFromTransaction(String scope, String code, String transactionId, String transactionPropertyKey) throws ApiException {
        ApiResponse<DeletedEntityResponse> resp = deletePropertyFromTransactionWithHttpInfo(scope, code, transactionId, transactionPropertyKey);
        return resp.getData();
    }

    /**
     * Delete transaction property
     * Delete a property value from a single transaction in a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param transactionId Id of the transaction to delete the property from (required)
     * @param transactionPropertyKey The key of the property to be deleted (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedEntityResponse> deletePropertyFromTransactionWithHttpInfo(String scope, String code, String transactionId, String transactionPropertyKey) throws ApiException {
        com.squareup.okhttp.Call call = deletePropertyFromTransactionValidateBeforeCall(scope, code, transactionId, transactionPropertyKey, null, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete transaction property (asynchronously)
     * Delete a property value from a single transaction in a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param transactionId Id of the transaction to delete the property from (required)
     * @param transactionPropertyKey The key of the property to be deleted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePropertyFromTransactionAsync(String scope, String code, String transactionId, String transactionPropertyKey, final ApiCallback<DeletedEntityResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deletePropertyFromTransactionValidateBeforeCall(scope, code, transactionId, transactionPropertyKey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteTransactions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionIds Ids of transactions to delete (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteTransactionsCall(String scope, String code, List<String> transactionIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (transactionIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "transactionIds", transactionIds));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteTransactionsValidateBeforeCall(String scope, String code, List<String> transactionIds, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteTransactionsCall(scope, code, transactionIds, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete transactions
     * Delete one or more transactions from a transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionIds Ids of transactions to delete (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedEntityResponse deleteTransactions(String scope, String code, List<String> transactionIds) throws ApiException {
        ApiResponse<DeletedEntityResponse> resp = deleteTransactionsWithHttpInfo(scope, code, transactionIds);
        return resp.getData();
    }

    /**
     * Delete transactions
     * Delete one or more transactions from a transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionIds Ids of transactions to delete (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedEntityResponse> deleteTransactionsWithHttpInfo(String scope, String code, List<String> transactionIds) throws ApiException {
        com.squareup.okhttp.Call call = deleteTransactionsValidateBeforeCall(scope, code, transactionIds, null, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete transactions (asynchronously)
     * Delete one or more transactions from a transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param transactionIds Ids of transactions to delete (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTransactionsAsync(String scope, String code, List<String> transactionIds, final ApiCallback<DeletedEntityResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteTransactionsValidateBeforeCall(scope, code, transactionIds, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getDetails
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getDetailsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getDetailsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getDetails(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getDetails(Async)");
        }
        

        com.squareup.okhttp.Call call = getDetailsCall(scope, code, effectiveAt, asAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get portfolio details
     * Get the details document associated with a transaction portfolio                When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortfolioDetails getDetails(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<PortfolioDetails> resp = getDetailsWithHttpInfo(scope, code, effectiveAt, asAt);
        return resp.getData();
    }

    /**
     * Get portfolio details
     * Get the details document associated with a transaction portfolio                When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortfolioDetails> getDetailsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        com.squareup.okhttp.Call call = getDetailsValidateBeforeCall(scope, code, effectiveAt, asAt, null, null);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get portfolio details (asynchronously)
     * Get the details document associated with a transaction portfolio                When requesting details from a derived transaction portfolio, the returned set of details could come from a different transaction portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getDetailsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<PortfolioDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getDetailsValidateBeforeCall(scope, code, effectiveAt, asAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHoldings
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots (optional)
     * @param effectiveAt Optional. The effective date of the portfolio (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param propertyKeys Optional. Keys for the Holding or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHoldingsCall(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> propertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (byTaxlots != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("byTaxlots", byTaxlots));
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (sortBy != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "sortBy", sortBy));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (propertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHoldingsValidateBeforeCall(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> propertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getHoldings(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getHoldings(Async)");
        }
        

        com.squareup.okhttp.Call call = getHoldingsCall(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, propertyKeys, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get holdings
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt  are supplied then values will be defaulted to the latest system time.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots (optional)
     * @param effectiveAt Optional. The effective date of the portfolio (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param propertyKeys Optional. Keys for the Holding or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @return VersionedResourceListOfPortfolioHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedResourceListOfPortfolioHolding getHoldings(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<VersionedResourceListOfPortfolioHolding> resp = getHoldingsWithHttpInfo(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, propertyKeys);
        return resp.getData();
    }

    /**
     * Get holdings
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt  are supplied then values will be defaulted to the latest system time.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots (optional)
     * @param effectiveAt Optional. The effective date of the portfolio (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param propertyKeys Optional. Keys for the Holding or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfPortfolioHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedResourceListOfPortfolioHolding> getHoldingsWithHttpInfo(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        com.squareup.okhttp.Call call = getHoldingsValidateBeforeCall(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, propertyKeys, null, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get holdings (asynchronously)
     * Get the aggregate holdings of a transaction portfolio.  If no effectiveAt or asAt  are supplied then values will be defaulted to the latest system time.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param byTaxlots Option to expand holdings to return the underlying tax-lots (optional)
     * @param effectiveAt Optional. The effective date of the portfolio (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param propertyKeys Optional. Keys for the Holding or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHoldingsAsync(String scope, String code, Boolean byTaxlots, String effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback<VersionedResourceListOfPortfolioHolding> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHoldingsValidateBeforeCall(scope, code, byTaxlots, effectiveAt, asAt, sortBy, start, limit, filter, propertyKeys, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getHoldingsAdjustment
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective time of the holdings adjustment (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getHoldingsAdjustmentCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", apiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getHoldingsAdjustmentValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = getHoldingsAdjustmentCall(scope, code, effectiveAt, asAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get holding adjustment
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.    A holdings adjustment definition will only be returned if one exists for the specified effective time
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective time of the holdings adjustment (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return HoldingsAdjustment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<HoldingsAdjustment> resp = getHoldingsAdjustmentWithHttpInfo(scope, code, effectiveAt, asAt);
        return resp.getData();
    }

    /**
     * Get holding adjustment
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.    A holdings adjustment definition will only be returned if one exists for the specified effective time
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective time of the holdings adjustment (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return ApiResponse&lt;HoldingsAdjustment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HoldingsAdjustment> getHoldingsAdjustmentWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        com.squareup.okhttp.Call call = getHoldingsAdjustmentValidateBeforeCall(scope, code, effectiveAt, asAt, null, null);
        Type localVarReturnType = new TypeToken<HoldingsAdjustment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get holding adjustment (asynchronously)
     * Get a holdings adjustment for a transaction portfolio at a specific effective time.    A holdings adjustment definition will only be returned if one exists for the specified effective time
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt The effective time of the holdings adjustment (required)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getHoldingsAdjustmentAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<HoldingsAdjustment> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getHoldingsAdjustmentValidateBeforeCall(scope, code, effectiveAt, asAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HoldingsAdjustment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTransactions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date (optional)
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTransactionsCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromTransactionDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromTransactionDate", fromTransactionDate));
        if (toTransactionDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toTransactionDate", toTransactionDate));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (sortBy != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "sortBy", sortBy));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (propertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTransactionsValidateBeforeCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = getTransactionsCall(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, propertyKeys, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get transactions
     * Get the transactions from a transaction portfolio    When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date (optional)
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @return VersionedResourceListOfTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VersionedResourceListOfTransaction getTransactions(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter) throws ApiException {
        ApiResponse<VersionedResourceListOfTransaction> resp = getTransactionsWithHttpInfo(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, propertyKeys, filter);
        return resp.getData();
    }

    /**
     * Get transactions
     * Get the transactions from a transaction portfolio    When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date (optional)
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @return ApiResponse&lt;VersionedResourceListOfTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VersionedResourceListOfTransaction> getTransactionsWithHttpInfo(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, propertyKeys, filter, null, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get transactions (asynchronously)
     * Get the transactions from a transaction portfolio    When the requested portfolio is a derived transaction portfolio, the returned set of transactions is the union set of all transactions of the parent (and ancestors) and the specified portfolio.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or later than this date (optional)
     * @param toTransactionDate Optional. Limit the returned transactions to those with a transaction date equal or before this date (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param propertyKeys Optional. Keys for the transaction or instrument property values that will be decorated onto the transactions. No properties will be decorated if none are specified. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransactionsAsync(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, List<String> propertyKeys, String filter, final ApiCallback<VersionedResourceListOfTransaction> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, sortBy, start, limit, propertyKeys, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listHoldingsAdjustments
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned. (optional)
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned. (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listHoldingsAdjustmentsCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsadjustments"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromEffectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        if (toEffectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listHoldingsAdjustmentsValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listHoldingsAdjustments(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling listHoldingsAdjustments(Async)");
        }
        

        com.squareup.okhttp.Call call = listHoldingsAdjustmentsCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List holdings adjustments
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned. (optional)
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned. (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return ResourceListOfHoldingsAdjustmentHeader
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfHoldingsAdjustmentHeader listHoldingsAdjustments(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<ResourceListOfHoldingsAdjustmentHeader> resp = listHoldingsAdjustmentsWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, asAt);
        return resp.getData();
    }

    /**
     * List holdings adjustments
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned. (optional)
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned. (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return ApiResponse&lt;ResourceListOfHoldingsAdjustmentHeader&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfHoldingsAdjustmentHeader> listHoldingsAdjustmentsWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt) throws ApiException {
        com.squareup.okhttp.Call call = listHoldingsAdjustmentsValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfHoldingsAdjustmentHeader>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List holdings adjustments (asynchronously)
     * Get holdings adjustments from a transaction portfolio in an interval of effective time.
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param fromEffectiveAt Holdings adjustments between this time (inclusive) and the toEffectiveAt are returned. (optional)
     * @param toEffectiveAt Holdings adjustments between this time (inclusive) and the fromEffectiveAt are returned. (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listHoldingsAdjustmentsAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, final ApiCallback<ResourceListOfHoldingsAdjustmentHeader> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listHoldingsAdjustmentsValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfHoldingsAdjustmentHeader>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for setHoldings
     * @param scope The scope of the transaction portfolio (required)
     * @param code The code of the transaction portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setHoldingsCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = holdingAdjustments;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/{effectiveAt}"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "effectiveAt" + "\\}", apiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call setHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
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
        

        com.squareup.okhttp.Call call = setHoldingsCall(scope, code, effectiveAt, holdingAdjustments, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Set all holdings on a transaction portfolio
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets
     * @param scope The scope of the transaction portfolio (required)
     * @param code The code of the transaction portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio (optional)
     * @return AdjustHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdjustHolding setHoldings(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        ApiResponse<AdjustHolding> resp = setHoldingsWithHttpInfo(scope, code, effectiveAt, holdingAdjustments);
        return resp.getData();
    }

    /**
     * Set all holdings on a transaction portfolio
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets
     * @param scope The scope of the transaction portfolio (required)
     * @param code The code of the transaction portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio (optional)
     * @return ApiResponse&lt;AdjustHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdjustHolding> setHoldingsWithHttpInfo(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments) throws ApiException {
        com.squareup.okhttp.Call call = setHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, null, null);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Set all holdings on a transaction portfolio (asynchronously)
     * Prompt the creation of transactions in a specific transaction portfolio to bring all holdings to the specified targets
     * @param scope The scope of the transaction portfolio (required)
     * @param code The code of the transaction portfolio (required)
     * @param effectiveAt The effective date of the change (required)
     * @param holdingAdjustments The complete set of holdings adjustments for the portfolio (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setHoldingsAsync(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> holdingAdjustments, final ApiCallback<AdjustHolding> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = setHoldingsValidateBeforeCall(scope, code, effectiveAt, holdingAdjustments, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for upsertExecutions
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executions The executions to be updated (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call upsertExecutionsCall(String scope, String code, List<ExecutionRequest> executions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = executions;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/executions"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call upsertExecutionsValidateBeforeCall(String scope, String code, List<ExecutionRequest> executions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertExecutions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertExecutions(Async)");
        }
        

        com.squareup.okhttp.Call call = upsertExecutionsCall(scope, code, executions, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upsert executions
     * Inserts new executions, or updates those already present
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executions The executions to be updated (optional)
     * @return UpsertPortfolioExecutionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code, List<ExecutionRequest> executions) throws ApiException {
        ApiResponse<UpsertPortfolioExecutionsResponse> resp = upsertExecutionsWithHttpInfo(scope, code, executions);
        return resp.getData();
    }

    /**
     * Upsert executions
     * Inserts new executions, or updates those already present
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executions The executions to be updated (optional)
     * @return ApiResponse&lt;UpsertPortfolioExecutionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpsertPortfolioExecutionsResponse> upsertExecutionsWithHttpInfo(String scope, String code, List<ExecutionRequest> executions) throws ApiException {
        com.squareup.okhttp.Call call = upsertExecutionsValidateBeforeCall(scope, code, executions, null, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioExecutionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upsert executions (asynchronously)
     * Inserts new executions, or updates those already present
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param executions The executions to be updated (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executions, final ApiCallback<UpsertPortfolioExecutionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = upsertExecutionsValidateBeforeCall(scope, code, executions, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpsertPortfolioExecutionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for upsertPortfolioDetails
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param details The set of details for the portfolio (optional)
     * @param effectiveAt Optional. The effective date of the change (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call upsertPortfolioDetailsCall(String scope, String code, CreatePortfolioDetails details, String effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = details;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call upsertPortfolioDetailsValidateBeforeCall(String scope, String code, CreatePortfolioDetails details, String effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertPortfolioDetails(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertPortfolioDetails(Async)");
        }
        

        com.squareup.okhttp.Call call = upsertPortfolioDetailsCall(scope, code, details, effectiveAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upsert details
     * Update the portfolio details for the specified transaction portfolios or add if it doesn&#39;t already exist (in the case of a derived transaction portfolio).
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param details The set of details for the portfolio (optional)
     * @param effectiveAt Optional. The effective date of the change (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails details, String effectiveAt) throws ApiException {
        ApiResponse<PortfolioDetails> resp = upsertPortfolioDetailsWithHttpInfo(scope, code, details, effectiveAt);
        return resp.getData();
    }

    /**
     * Upsert details
     * Update the portfolio details for the specified transaction portfolios or add if it doesn&#39;t already exist (in the case of a derived transaction portfolio).
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param details The set of details for the portfolio (optional)
     * @param effectiveAt Optional. The effective date of the change (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortfolioDetails> upsertPortfolioDetailsWithHttpInfo(String scope, String code, CreatePortfolioDetails details, String effectiveAt) throws ApiException {
        com.squareup.okhttp.Call call = upsertPortfolioDetailsValidateBeforeCall(scope, code, details, effectiveAt, null, null);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upsert details (asynchronously)
     * Update the portfolio details for the specified transaction portfolios or add if it doesn&#39;t already exist (in the case of a derived transaction portfolio).
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param details The set of details for the portfolio (optional)
     * @param effectiveAt Optional. The effective date of the change (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails details, String effectiveAt, final ApiCallback<PortfolioDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = upsertPortfolioDetailsValidateBeforeCall(scope, code, details, effectiveAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for upsertTransactions
     * @param scope The scope of the portfolio (required)
     * @param code The code for the portfolio (required)
     * @param transactions The transactions to be upserted (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call upsertTransactionsCall(String scope, String code, List<TransactionRequest> transactions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = transactions;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth2" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call upsertTransactionsValidateBeforeCall(String scope, String code, List<TransactionRequest> transactions, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertTransactions(Async)");
        }
        

        com.squareup.okhttp.Call call = upsertTransactionsCall(scope, code, transactions, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upsert transactions into the specified transaction portfolio
     * Upsert transactions
     * @param scope The scope of the portfolio (required)
     * @param code The code for the portfolio (required)
     * @param transactions The transactions to be upserted (optional)
     * @return UpsertPortfolioTransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactions) throws ApiException {
        ApiResponse<UpsertPortfolioTransactionsResponse> resp = upsertTransactionsWithHttpInfo(scope, code, transactions);
        return resp.getData();
    }

    /**
     * Upsert transactions into the specified transaction portfolio
     * Upsert transactions
     * @param scope The scope of the portfolio (required)
     * @param code The code for the portfolio (required)
     * @param transactions The transactions to be upserted (optional)
     * @return ApiResponse&lt;UpsertPortfolioTransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpsertPortfolioTransactionsResponse> upsertTransactionsWithHttpInfo(String scope, String code, List<TransactionRequest> transactions) throws ApiException {
        com.squareup.okhttp.Call call = upsertTransactionsValidateBeforeCall(scope, code, transactions, null, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upsert transactions into the specified transaction portfolio (asynchronously)
     * Upsert transactions
     * @param scope The scope of the portfolio (required)
     * @param code The code for the portfolio (required)
     * @param transactions The transactions to be upserted (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactions, final ApiCallback<UpsertPortfolioTransactionsResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = upsertTransactionsValidateBeforeCall(scope, code, transactions, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
