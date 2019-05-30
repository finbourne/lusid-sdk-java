/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://api.lusid.com/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages :  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python)  # Data Model  The LUSID API has a relatively lightweight but extremely powerful data model.   One of the goals of LUSID was not to enforce on clients a single rigid data model but rather to provide a flexible foundation onto which clients can streamline their data.   One of the primary tools to extend the data model is through using properties.  Properties can be associated with amongst others: - * Transactions * Instruments * Portfolios   The LUSID data model is exposed through the LUSID APIs.  The APIs provide access to both business objects and the meta data used to configure the systems behaviours.   The key business entities are: - * **Portfolios** A portfolio is the primary container for transactions and holdings.  * **Derived Portfolios** Derived portfolios allow portfolios to be created based on other portfolios, by overriding or overlaying specific items * **Holdings** A holding is a position account for a instrument within a portfolio.  Holdings can only be adjusted via transactions. * **Transactions** A Transaction is a source of transactions used to manipulate holdings.  * **Corporate Actions** A corporate action is a market event which occurs to a instrument, for example a stock split * **Instruments**  A instrument represents a currency, tradable instrument or OTC contract that is attached to a transaction and a holding. * **Properties** Several entities allow additional user defined properties to be associated with them.   For example, a Portfolio manager may be associated with a portfolio  Meta data includes: - * **Transaction Types** Transactions are booked with a specific transaction type.  The types are client defined and are used to map the Transaction to a series of movements which update the portfolio holdings.  * **Properties Types** Types of user defined properties used within the system.  This section describes the data model that LUSID exposes via the APIs.  ## Scope  All data in LUSID is segregated at the client level.  Entities in LUSID are identifiable by a unique code.  Every entity lives within a logical data partition known as a Scope.  Scope is an identity namespace allowing two entities with the same unique code to co-exist within individual address spaces.  For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.  LUSID Clients cannot access scopes of other clients.  ## Schema  A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.  ## Instruments  LUSID has its own built-in instrument master which you can use to master your own instrument universe.  Every instrument must be created with one or more unique market identifiers, such as [FIGI](https://openfigi.com/). For any non-listed instruments (eg OTCs), you can upload an instrument against a custom ID of your choosing.  In addition, LUSID will allocate each instrument a unique 'LUSID instrument identifier'. The LUSID instrument identifier is what is used when uploading transactions, holdings, prices, etc. The API exposes an `instrument/lookup` endpoint which can be used to lookup these LUSID identifiers using their market identifiers.  Cash can be referenced using the ISO currency code prefixed with \"`CCY_`\" e.g. `CCY_GBP`  ## Instrument Prices (Analytics)  Instrument prices are stored in LUSID's Analytics Store  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | Value|decimal|Value of the analytic, eg price | | Denomination|string|Underlying unit of the analytic, eg currency, EPS etc. |   ## Instrument Data  Instrument data can be uploaded to the system using the [Instrument Properties](#tag/InstrumentProperties) endpoint.  | Field|Type|Description | | ---|---|--- |   ## Portfolios  Portfolios are the top-level entity containers within LUSID, containing transactions, corporate actions and holdings.    The transactions build up the portfolio holdings on which valuations, analytics profit & loss and risk can be calculated.     Properties can be associated with Portfolios to add in additional model data.  Portfolio properties can be changed over time as well.  For example, to allow a Portfolio Manager to be linked with a Portfolio.  Additionally, portfolios can be securitised and held by other portfolios, allowing LUSID to perform \"drill-through\" into underlying fund holdings  ### Reference Portfolios Reference portfolios are portfolios that contain only weights, as opposed to transactions, and are designed to represent entities such as indices.  ### Derived Portfolios  LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own transactions and also inherits any transactions from its parent portfolio.  Any changes made to the parent portfolio are automatically reflected in derived portfolio.  Derived portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a derived portfolio could be created a new namespace linked to the underlying live (parent) portfolio.  Analysis can then be undertaken on the derived portfolio without affecting the live portfolio.  ### Portfolio Groups Portfolio groups allow the construction of a hierarchy from portfolios and groups.  Portfolio operations on the group are executed on an aggregated set of portfolios in the hierarchy.   For example:   * Global Portfolios _(group)_   * APAC _(group)_     * Hong Kong _(portfolio)_     * Japan _(portfolio)_   * Europe _(group)_     * France _(portfolio)_     * Germany _(portfolio)_   * UK _(portfolio)_   In this example **Global Portfolios** is a group that consists of an aggregate of **Hong Kong**, **Japan**, **France**, **Germany** and **UK** portfolios.  ### Movements Engine The Movements engine sits on top of the immutable event store and is used to manage the relationship between input trading actions and their associated portfolio holdings.     The movements engine reads in the following entity types:- * Posting Transactions * Applying Corporate Actions  * Holding Adjustments  These are converted to one or more movements and used by the movements engine to calculate holdings.  At the same time it also calculates running balances, and realised P&L.  The outputs from the movements engine are holdings and transactions.  ## Transactions  A transaction represents an economic activity against a Portfolio.  Transactions are processed according to a configuration. This will tell the LUSID engine how to interpret the transaction and correctly update the holdings. LUSID comes with a set of transaction types you can use out of the box, or you can configure your own set(s) of transactions.  For more details see the [LUSID Getting Started Guide for transaction configuration.](https://support.finbourne.com/hc/en-us/articles/360016737511-Configuring-Transaction-Types)  | Field|Type|Description | | ---|---|--- | | TransactionId|string|Unique transaction identifier | | Type|string|LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | | InstrumentIdentifiers|map|Unique instrument identifiers | | InstrumentUid|string|LUSID's internal unique instrument identifier, resolved from the instrument identifiers | | TransactionDate|datetime|Transaction date | | SettlementDate|datetime|Settlement date | | Units|decimal|Quantity of trade in units of the instrument | | TransactionPrice|tradeprice|Execution price for the transaction | | TotalConsideration|currencyandamount|Total value of the transaction in settlement currency | | ExchangeRate|decimal|Rate between transaction and settlement currency | | TransactionCurrency|currency|Transaction currency | | CounterpartyId|string|Counterparty identifier | | Source|string|Where this transaction came from | | NettingSet|string|  |   From these fields, the following values can be calculated  * **Transaction value in Transaction currency**: TotalConsideration / ExchangeRate  * **Transaction value in Portfolio currency**: Transaction value in Transaction currency * TradeToPortfolioRate  ### Example Transactions  #### A Common Purchase Example Three example transactions are shown in the table below.   They represent a purchase of USD denominated IBM shares within a Sterling denominated portfolio.   * The first two transactions are for separate buy and fx trades    * Buying 500 IBM shares for $71,480.00    * A foreign exchange conversion to fund the IBM purchase. (Buy $71,480.00 for &#163;54,846.60)  * The third transaction is an alternate version of the above trades. Buying 500 IBM shares and settling directly in Sterling.  | Column |  Buy Trade | Fx Trade | Buy Trade with foreign Settlement | | ----- | ----- | ----- | ----- | | TransactionId | FBN00001 | FBN00002 | FBN00003 | | Type | Buy | FxBuy | Buy | | InstrumentIdentifiers | { \"figi\", \"BBG000BLNNH6\" } | { \"CCY\", \"CCY_USD\" } | { \"figi\", \"BBG000BLNNH6\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | 2018-08-02 | | SettlementDate | 2018-08-06 | 2018-08-06 | 2018-08-06 | | Units | 500 | 71480 | 500 | | TransactionPrice | 142.96 | 1 | 142.96 | | TradeCurrency | USD | USD | USD | | ExchangeRate | 1 | 0.7673 | 0.7673 | | TotalConsideration.Amount | 71480.00 | 54846.60 | 54846.60 | | TotalConsideration.Currency | USD | GBP | GBP | | Trade/default/TradeToPortfolioRate&ast; | 0.7673 | 0.7673 | 0.7673 |  [&ast; This is a property field]  #### A Forward FX Example  LUSID has a flexible transaction modelling system, and there are a number of different ways of modelling forward fx trades.  The default LUSID transaction types are FwdFxBuy and FwdFxSell. Other types and behaviours can be configured as required.  Using these transaction types, the holdings query will report two forward positions. One in each currency.   Since an FX trade is an exchange of one currency for another, the following two 6 month forward transactions are equivalent:  | Column |  Forward 'Sell' Trade | Forward 'Buy' Trade | | ----- | ----- | ----- | | TransactionId | FBN00004 | FBN00005 | | Type | FwdFxSell | FwdFxBuy | | InstrumentIdentifiers | { \"CCY\", \"CCY_GBP\" } | { \"CCY\", \"CCY_USD\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | | SettlementDate | 2019-02-06 | 2019-02-06 | | Units | 10000.00 | 13142.00 | | TransactionPrice |1 | 1 | | TradeCurrency | GBP | USD | | ExchangeRate | 1.3142 | 0.760919 | | TotalConsideration.Amount | 13142.00 | 10000.00 | | TotalConsideration.Currency | USD | GBP | | Trade/default/TradeToPortfolioRate | 1.0 | 0.760919 |  ## Holdings  A holding represents a position in a instrument or cash on a given date.  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | HoldingType|string|Type of holding, eg Position, Balance, CashCommitment, Receivable, ForwardFX | | Units|decimal|Quantity of holding | | SettledUnits|decimal|Settled quantity of holding | | Cost|currencyandamount|Book cost of holding in transaction currency | | CostPortfolioCcy|currencyandamount|Book cost of holding in portfolio currency | | Transaction|Transaction|If this is commitment-type holding, the transaction behind it |   ## Corporate Actions  Corporate actions are represented within LUSID in terms of a set of instrument-specific 'transitions'.  These transitions are used to specify the participants of the corporate action, and the effect that the corporate action will have on holdings in those participants.  ### Corporate Action  | Field|Type|Description | | ---|---|--- | | CorporateActionCode|code|The unique identifier of this corporate action | | AnnouncementDate|datetime|The announcement date of the corporate action | | ExDate|datetime|The ex date of the corporate action | | RecordDate|datetime|The record date of the corporate action | | PaymentDate|datetime|The payment date of the corporate action | | Transitions|list|The transitions that result from this corporate action |   ### Transition  | Field|Type|Description | | ---|---|--- | | InputTransition|transition|Indicating the basis of the corporate action - which security and how many units | | OutputTransitions|list|What will be generated relative to the input transition |   ### Example Corporate Action Transitions  #### A Dividend Action Transition  In this example, for each share of IBM, 0.20 units (or 20 pence) of GBP are generated.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"ccy\" : \"CCY_GBP\" } | | Units Factor | 1 | 0.20 | | Cost Factor | 1 | 0 |  #### A Split Action Transition  In this example, for each share of IBM, we end up with 2 units (2 shares) of IBM, with total value unchanged.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | | Units Factor | 1 | 2 | | Cost Factor | 1 | 1 |  #### A Spinoff Action Transition  In this example, for each share of IBM, we end up with 1 unit (1 share) of IBM and 3 units (3 shares) of Celestica, with 85% of the value remaining on the IBM share, and 5% in each Celestica share (15% total).  | Column |  Input Transition | Output Transition 1 | Output Transition 2 | | ----- | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000HBGRF3\" } | | Units Factor | 1 | 1 | 3 | | Cost Factor | 1 | 0.85 | 0.15 |  ## Property  Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.  # Schemas  The following headers are returned on all responses from LUSID  | Name | Purpose | | --- | --- | | lusid-meta-duration | Duration of the request | | lusid-meta-success | Whether or not LUSID considered the request to be successful | | lusid-meta-requestId | The unique identifier for the request | | lusid-schema-url | Url of the schema for the data being returned | | lusid-property-schema-url | Url of the schema for any properties |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"102\">102</a>|VersionNotFound|  | | <a name=\"104\">104</a>|InstrumentNotFound|  | | <a name=\"105\">105</a>|PropertyNotFound|  | | <a name=\"106\">106</a>|PortfolioRecursionDepth|  | | <a name=\"108\">108</a>|GroupNotFound|  | | <a name=\"109\">109</a>|PortfolioNotFound|  | | <a name=\"110\">110</a>|PropertySchemaNotFound|  | | <a name=\"111\">111</a>|PortfolioAncestryNotFound|  | | <a name=\"112\">112</a>|PortfolioWithIdAlreadyExists|  | | <a name=\"113\">113</a>|OrphanedPortfolio|  | | <a name=\"119\">119</a>|MissingBaseClaims|  | | <a name=\"121\">121</a>|PropertyNotDefined|  | | <a name=\"122\">122</a>|CannotDeleteSystemProperty|  | | <a name=\"123\">123</a>|CannotModifyImmutablePropertyField|  | | <a name=\"124\">124</a>|PropertyAlreadyExists|  | | <a name=\"125\">125</a>|InvalidPropertyLifeTime|  | | <a name=\"127\">127</a>|CannotModifyDefaultDataType|  | | <a name=\"128\">128</a>|GroupAlreadyExists|  | | <a name=\"129\">129</a>|NoSuchDataType|  | | <a name=\"132\">132</a>|ValidationError|  | | <a name=\"133\">133</a>|LoopDetectedInGroupHierarchy|  | | <a name=\"135\">135</a>|SubGroupAlreadyExists|  | | <a name=\"138\">138</a>|PriceSourceNotFound|  | | <a name=\"139\">139</a>|AnalyticStoreNotFound|  | | <a name=\"141\">141</a>|AnalyticStoreAlreadyExists|  | | <a name=\"143\">143</a>|ClientInstrumentAlreadyExists|  | | <a name=\"144\">144</a>|DuplicateInParameterSet|  | | <a name=\"147\">147</a>|ResultsNotFound|  | | <a name=\"148\">148</a>|OrderFieldNotInResultSet|  | | <a name=\"149\">149</a>|OperationFailed|  | | <a name=\"150\">150</a>|ElasticSearchError|  | | <a name=\"151\">151</a>|InvalidParameterValue|  | | <a name=\"153\">153</a>|CommandProcessingFailure|  | | <a name=\"154\">154</a>|EntityStateConstructionFailure|  | | <a name=\"155\">155</a>|EntityTimelineDoesNotExist|  | | <a name=\"156\">156</a>|EventPublishFailure|  | | <a name=\"157\">157</a>|InvalidRequestFailure|  | | <a name=\"158\">158</a>|EventPublishUnknown|  | | <a name=\"159\">159</a>|EventQueryFailure|  | | <a name=\"160\">160</a>|BlobDidNotExistFailure|  | | <a name=\"162\">162</a>|SubSystemRequestFailure|  | | <a name=\"163\">163</a>|SubSystemConfigurationFailure|  | | <a name=\"165\">165</a>|FailedToDelete|  | | <a name=\"166\">166</a>|UpsertClientInstrumentFailure|  | | <a name=\"167\">167</a>|IllegalAsAtInterval|  | | <a name=\"168\">168</a>|IllegalBitemporalQuery|  | | <a name=\"169\">169</a>|InvalidAlternateId|  | | <a name=\"170\">170</a>|CannotAddSourcePortfolioPropertyExplicitly|  | | <a name=\"171\">171</a>|EntityAlreadyExistsInGroup|  | | <a name=\"173\">173</a>|EntityWithIdAlreadyExists|  | | <a name=\"174\">174</a>|DerivedPortfolioDetailsDoNotExist|  | | <a name=\"176\">176</a>|PortfolioWithNameAlreadyExists|  | | <a name=\"177\">177</a>|InvalidTransactions|  | | <a name=\"178\">178</a>|ReferencePortfolioNotFound|  | | <a name=\"179\">179</a>|DuplicateIdFailure|  | | <a name=\"180\">180</a>|CommandRetrievalFailure|  | | <a name=\"181\">181</a>|DataFilterApplicationFailure|  | | <a name=\"182\">182</a>|SearchFailed|  | | <a name=\"183\">183</a>|MovementsEngineConfigurationKeyFailure|  | | <a name=\"184\">184</a>|FxRateSourceNotFound|  | | <a name=\"185\">185</a>|AccrualSourceNotFound|  | | <a name=\"186\">186</a>|AccessDenied|  | | <a name=\"187\">187</a>|InvalidIdentityToken|  | | <a name=\"188\">188</a>|InvalidRequestHeaders|  | | <a name=\"189\">189</a>|PriceNotFound|  | | <a name=\"190\">190</a>|InvalidSubHoldingKeysProvided|  | | <a name=\"191\">191</a>|DuplicateSubHoldingKeysProvided|  | | <a name=\"192\">192</a>|CutDefinitionNotFound|  | | <a name=\"193\">193</a>|CutDefinitionInvalid|  | | <a name=\"200\">200</a>|InvalidUnitForDataType|  | | <a name=\"201\">201</a>|InvalidTypeForDataType|  | | <a name=\"202\">202</a>|InvalidValueForDataType|  | | <a name=\"203\">203</a>|UnitNotDefinedForDataType|  | | <a name=\"204\">204</a>|UnitsNotSupportedOnDataType|  | | <a name=\"205\">205</a>|CannotSpecifyUnitsOnDataType|  | | <a name=\"206\">206</a>|UnitSchemaInconsistentWithDataType|  | | <a name=\"207\">207</a>|UnitDefinitionNotSpecified|  | | <a name=\"208\">208</a>|DuplicateUnitDefinitionsSpecified|  | | <a name=\"209\">209</a>|InvalidUnitsDefinition|  | | <a name=\"210\">210</a>|InvalidInstrumentIdentifierUnit|  | | <a name=\"211\">211</a>|HoldingsAdjustmentDoesNotExist|  | | <a name=\"212\">212</a>|CouldNotBuildExcelUrl|  | | <a name=\"213\">213</a>|CouldNotGetExcelVersion|  | | <a name=\"214\">214</a>|InstrumentByCodeNotFound|  | | <a name=\"215\">215</a>|EntitySchemaDoesNotExist|  | | <a name=\"216\">216</a>|FeatureNotSupportedOnPortfolioType|  | | <a name=\"217\">217</a>|QuoteNotFoundFailure|  | | <a name=\"219\">219</a>|InvalidInstrumentDefinition|  | | <a name=\"221\">221</a>|InstrumentUpsertFailure|  | | <a name=\"222\">222</a>|ReferencePortfolioRequestNotSupported|  | | <a name=\"223\">223</a>|TransactionPortfolioRequestNotSupported|  | | <a name=\"224\">224</a>|InvalidPropertyValueAssignment|  | | <a name=\"230\">230</a>|TransactionTypeNotFound|  | | <a name=\"231\">231</a>|TransactionTypeDuplication|  | | <a name=\"232\">232</a>|PortfolioDoesNotExistAtGivenDate|  | | <a name=\"233\">233</a>|QueryParserFailure|  | | <a name=\"234\">234</a>|DuplicateConstituentFailure|  | | <a name=\"235\">235</a>|UnresolvedInstrumentConstituentFailure|  | | <a name=\"236\">236</a>|UnresolvedInstrumentInTransitionFailure|  | | <a name=\"300\">300</a>|MissingRecipeFailure|  | | <a name=\"301\">301</a>|DependenciesFailure|  | | <a name=\"304\">304</a>|PortfolioPreprocessFailure|  | | <a name=\"310\">310</a>|ValuationEngineFailure|  | | <a name=\"311\">311</a>|TaskFactoryFailure|  | | <a name=\"312\">312</a>|TaskEvaluationFailure|  | | <a name=\"350\">350</a>|InstrumentFailure|  | | <a name=\"351\">351</a>|CashFlowsFailure|  | | <a name=\"360\">360</a>|AggregationFailure|  | | <a name=\"370\">370</a>|ResultRetrievalFailure|  | | <a name=\"371\">371</a>|ResultProcessingFailure|  | | <a name=\"371\">371</a>|ResultProcessingFailure|  | | <a name=\"372\">372</a>|VendorResultProcessingFailure|  | | <a name=\"374\">374</a>|AttemptToUpsertDuplicateQuotes|  | | <a name=\"375\">375</a>|CorporateActionSourceDoesNotExist|  | | <a name=\"376\">376</a>|InstrumentIdentifierAlreadyInUse|  | | <a name=\"377\">377</a>|CorporateActionSourceAlreadyExists|  | | <a name=\"-10\">-10</a>|ServerConfigurationError|  | | <a name=\"-1\">-1</a>|Unknown error|  | 
 *
 * OpenAPI spec version: 0.10.168
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


import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.Portfolio;
import com.finbourne.lusid.model.PortfolioProperties;
import com.finbourne.lusid.model.ResourceListOfPortfolio;
import com.finbourne.lusid.model.ResourceListOfProcessedCommand;
import com.finbourne.lusid.model.UpdatePortfolioRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortfoliosApi {
    private ApiClient apiClient;

    public PortfoliosApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortfoliosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deletePortfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortfolioCall(String scope, String code, OffsetDateTime effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deletePortfolioValidateBeforeCall(String scope, String code, OffsetDateTime effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deletePortfolio(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePortfolio(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePortfolioCall(scope, code, effectiveAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete portfolio
     * Delete a portfolio at the specified effectiveAt
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedEntityResponse deletePortfolio(String scope, String code, OffsetDateTime effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> resp = deletePortfolioWithHttpInfo(scope, code, effectiveAt);
        return resp.getData();
    }

    /**
     * Delete portfolio
     * Delete a portfolio at the specified effectiveAt
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedEntityResponse> deletePortfolioWithHttpInfo(String scope, String code, OffsetDateTime effectiveAt) throws ApiException {
        com.squareup.okhttp.Call call = deletePortfolioValidateBeforeCall(scope, code, effectiveAt, null, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete portfolio (asynchronously)
     * Delete a portfolio at the specified effectiveAt
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortfolioAsync(String scope, String code, OffsetDateTime effectiveAt, final ApiCallback<DeletedEntityResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePortfolioValidateBeforeCall(scope, code, effectiveAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deletePortfolioProperties
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deletePortfolioPropertiesCall(String scope, String code, OffsetDateTime effectiveAt, List<String> portfolioPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}/properties"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (portfolioPropertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "portfolioPropertyKeys", portfolioPropertyKeys));

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
    private com.squareup.okhttp.Call deletePortfolioPropertiesValidateBeforeCall(String scope, String code, OffsetDateTime effectiveAt, List<String> portfolioPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deletePortfolioProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePortfolioProperties(Async)");
        }
        

        com.squareup.okhttp.Call call = deletePortfolioPropertiesCall(scope, code, effectiveAt, portfolioPropertyKeys, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete portfolio properties
     * Delete one, many or all property values from a portfolio for the specified effectiveAt                Specifying no effectiveAt will delete all properties
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeletedEntityResponse deletePortfolioProperties(String scope, String code, OffsetDateTime effectiveAt, List<String> portfolioPropertyKeys) throws ApiException {
        ApiResponse<DeletedEntityResponse> resp = deletePortfolioPropertiesWithHttpInfo(scope, code, effectiveAt, portfolioPropertyKeys);
        return resp.getData();
    }

    /**
     * Delete portfolio properties
     * Delete one, many or all property values from a portfolio for the specified effectiveAt                Specifying no effectiveAt will delete all properties
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeletedEntityResponse> deletePortfolioPropertiesWithHttpInfo(String scope, String code, OffsetDateTime effectiveAt, List<String> portfolioPropertyKeys) throws ApiException {
        com.squareup.okhttp.Call call = deletePortfolioPropertiesValidateBeforeCall(scope, code, effectiveAt, portfolioPropertyKeys, null, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete portfolio properties (asynchronously)
     * Delete one, many or all property values from a portfolio for the specified effectiveAt                Specifying no effectiveAt will delete all properties
     * @param scope The scope of the portfolio (required)
     * @param code Code for the portfolio (required)
     * @param effectiveAt Optional. The effective date of the deletion (optional)
     * @param portfolioPropertyKeys Optional. The keys of the properties to be deleted. None specified indicates the intention to delete all properties from the portfolio (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePortfolioPropertiesAsync(String scope, String code, OffsetDateTime effectiveAt, List<String> portfolioPropertyKeys, final ApiCallback<DeletedEntityResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePortfolioPropertiesValidateBeforeCall(scope, code, effectiveAt, portfolioPropertyKeys, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPortfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPortfolioCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}"
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
    private com.squareup.okhttp.Call getPortfolioValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolio(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolio(Async)");
        }
        

        com.squareup.okhttp.Call call = getPortfolioCall(scope, code, effectiveAt, asAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get portfolio definition
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portfolio getPortfolio(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<Portfolio> resp = getPortfolioWithHttpInfo(scope, code, effectiveAt, asAt);
        return resp.getData();
    }

    /**
     * Get portfolio definition
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portfolio> getPortfolioWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        com.squareup.okhttp.Call call = getPortfolioValidateBeforeCall(scope, code, effectiveAt, asAt, null, null);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get portfolio definition (asynchronously)
     * Retrieves the basic set of information about a portfolio using the specified scope and code.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPortfolioAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<Portfolio> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPortfolioValidateBeforeCall(scope, code, effectiveAt, asAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPortfolioCommands
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time (optional)
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPortfolioCommandsCall(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}/commands"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fromAsAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fromAsAt", fromAsAt));
        if (toAsAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("toAsAt", toAsAt));
        if (sortBy != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "sortBy", sortBy));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
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
    private com.squareup.okhttp.Call getPortfolioCommandsValidateBeforeCall(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioCommands(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioCommands(Async)");
        }
        

        com.squareup.okhttp.Call call = getPortfolioCommandsCall(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get commands
     * Gets all commands that modified a specific portfolio, including any input transactions.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time (optional)
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @return ResourceListOfProcessedCommand
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfProcessedCommand getPortfolioCommands(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) throws ApiException {
        ApiResponse<ResourceListOfProcessedCommand> resp = getPortfolioCommandsWithHttpInfo(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter);
        return resp.getData();
    }

    /**
     * Get commands
     * Gets all commands that modified a specific portfolio, including any input transactions.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time (optional)
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @return ApiResponse&lt;ResourceListOfProcessedCommand&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfProcessedCommand> getPortfolioCommandsWithHttpInfo(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getPortfolioCommandsValidateBeforeCall(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter, null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfProcessedCommand>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get commands (asynchronously)
     * Gets all commands that modified a specific portfolio, including any input transactions.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param fromAsAt Optional. Filters commands by those that were processed at or after this date and time (optional)
     * @param toAsAt Optional. Filters commands by those that were processed at or before this date and time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPortfolioCommandsAsync(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, List<String> sortBy, Integer start, Integer limit, String filter, final ApiCallback<ResourceListOfProcessedCommand> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPortfolioCommandsValidateBeforeCall(scope, code, fromAsAt, toAsAt, sortBy, start, limit, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfProcessedCommand>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getPortfolioProperties
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getPortfolioPropertiesCall(String scope, String code, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}/properties"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", apiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call getPortfolioPropertiesValidateBeforeCall(String scope, String code, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioProperties(Async)");
        }
        

        com.squareup.okhttp.Call call = getPortfolioPropertiesCall(scope, code, effectiveAt, asAt, sortBy, start, limit, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get portfolio properties
     * Get the properties of a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @return PortfolioProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortfolioProperties getPortfolioProperties(String scope, String code, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit) throws ApiException {
        ApiResponse<PortfolioProperties> resp = getPortfolioPropertiesWithHttpInfo(scope, code, effectiveAt, asAt, sortBy, start, limit);
        return resp.getData();
    }

    /**
     * Get portfolio properties
     * Get the properties of a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @return ApiResponse&lt;PortfolioProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortfolioProperties> getPortfolioPropertiesWithHttpInfo(String scope, String code, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit) throws ApiException {
        com.squareup.okhttp.Call call = getPortfolioPropertiesValidateBeforeCall(scope, code, effectiveAt, asAt, sortBy, start, limit, null, null);
        Type localVarReturnType = new TypeToken<PortfolioProperties>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get portfolio properties (asynchronously)
     * Get the properties of a portfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPortfolioPropertiesAsync(String scope, String code, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, final ApiCallback<PortfolioProperties> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getPortfolioPropertiesValidateBeforeCall(scope, code, effectiveAt, asAt, sortBy, start, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PortfolioProperties>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listPortfolios
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param page Optional. The pagination token to continue listing portfolios. This value is returned from a previous call to ListPortfolios.  If this is set, then the sortBy, filter, query, effectiveAt, and asAt fields must not have changed. Also, if set, a start  value cannot be set. (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param query Optional. Expression specifying the criteria that the returned portfolios must meet (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listPortfoliosCall(OffsetDateTime effectiveAt, OffsetDateTime asAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("page", page));
        if (sortBy != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "sortBy", sortBy));
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (query != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("query", query));

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
    private com.squareup.okhttp.Call listPortfoliosValidateBeforeCall(OffsetDateTime effectiveAt, OffsetDateTime asAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, String query, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listPortfoliosCall(effectiveAt, asAt, page, sortBy, start, limit, filter, query, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List portfolios
     * List all portfolios matching the specified criteria.                Example query syntax for the query parameter:                - To see which portfolios have holdings in the specified instruments:                    instrument.identifiers in ((&#39;LusidInstrumentId&#39;, &#39;LUID_PPA8HI6M&#39;), (&#39;Figi&#39;, &#39;BBG000BLNNH6&#39;))                * Note that copy/pasting above examples results in incorrect single quote character
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param page Optional. The pagination token to continue listing portfolios. This value is returned from a previous call to ListPortfolios.  If this is set, then the sortBy, filter, query, effectiveAt, and asAt fields must not have changed. Also, if set, a start  value cannot be set. (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param query Optional. Expression specifying the criteria that the returned portfolios must meet (optional)
     * @return ResourceListOfPortfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfPortfolio listPortfolios(OffsetDateTime effectiveAt, OffsetDateTime asAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, String query) throws ApiException {
        ApiResponse<ResourceListOfPortfolio> resp = listPortfoliosWithHttpInfo(effectiveAt, asAt, page, sortBy, start, limit, filter, query);
        return resp.getData();
    }

    /**
     * List portfolios
     * List all portfolios matching the specified criteria.                Example query syntax for the query parameter:                - To see which portfolios have holdings in the specified instruments:                    instrument.identifiers in ((&#39;LusidInstrumentId&#39;, &#39;LUID_PPA8HI6M&#39;), (&#39;Figi&#39;, &#39;BBG000BLNNH6&#39;))                * Note that copy/pasting above examples results in incorrect single quote character
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param page Optional. The pagination token to continue listing portfolios. This value is returned from a previous call to ListPortfolios.  If this is set, then the sortBy, filter, query, effectiveAt, and asAt fields must not have changed. Also, if set, a start  value cannot be set. (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param query Optional. Expression specifying the criteria that the returned portfolios must meet (optional)
     * @return ApiResponse&lt;ResourceListOfPortfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfPortfolio> listPortfoliosWithHttpInfo(OffsetDateTime effectiveAt, OffsetDateTime asAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, String query) throws ApiException {
        com.squareup.okhttp.Call call = listPortfoliosValidateBeforeCall(effectiveAt, asAt, page, sortBy, start, limit, filter, query, null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolio>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List portfolios (asynchronously)
     * List all portfolios matching the specified criteria.                Example query syntax for the query parameter:                - To see which portfolios have holdings in the specified instruments:                    instrument.identifiers in ((&#39;LusidInstrumentId&#39;, &#39;LUID_PPA8HI6M&#39;), (&#39;Figi&#39;, &#39;BBG000BLNNH6&#39;))                * Note that copy/pasting above examples results in incorrect single quote character
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param page Optional. The pagination token to continue listing portfolios. This value is returned from a previous call to ListPortfolios.  If this is set, then the sortBy, filter, query, effectiveAt, and asAt fields must not have changed. Also, if set, a start  value cannot be set. (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param query Optional. Expression specifying the criteria that the returned portfolios must meet (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listPortfoliosAsync(OffsetDateTime effectiveAt, OffsetDateTime asAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, String query, final ApiCallback<ResourceListOfPortfolio> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listPortfoliosValidateBeforeCall(effectiveAt, asAt, page, sortBy, start, limit, filter, query, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolio>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listPortfoliosForScope
     * @param scope The scope (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listPortfoliosForScopeCall(String scope, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}"
            .replaceAll("\\{" + "scope" + "\\}", apiClient.escapeString(scope.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
    private com.squareup.okhttp.Call listPortfoliosForScopeValidateBeforeCall(String scope, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listPortfoliosForScope(Async)");
        }
        

        com.squareup.okhttp.Call call = listPortfoliosForScopeCall(scope, effectiveAt, asAt, sortBy, start, limit, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List portfolios for scope
     * List all the portfolios in the specified scope
     * @param scope The scope (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @return ResourceListOfPortfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfPortfolio listPortfoliosForScope(String scope, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) throws ApiException {
        ApiResponse<ResourceListOfPortfolio> resp = listPortfoliosForScopeWithHttpInfo(scope, effectiveAt, asAt, sortBy, start, limit, filter);
        return resp.getData();
    }

    /**
     * List portfolios for scope
     * List all the portfolios in the specified scope
     * @param scope The scope (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @return ApiResponse&lt;ResourceListOfPortfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfPortfolio> listPortfoliosForScopeWithHttpInfo(String scope, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) throws ApiException {
        com.squareup.okhttp.Call call = listPortfoliosForScopeValidateBeforeCall(scope, effectiveAt, asAt, sortBy, start, limit, filter, null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolio>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List portfolios for scope (asynchronously)
     * List all the portfolios in the specified scope
     * @param scope The scope (required)
     * @param effectiveAt Optional. The effective date of the data (optional)
     * @param asAt Optional. The AsAt date of the data (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listPortfoliosForScopeAsync(String scope, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ApiCallback<ResourceListOfPortfolio> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listPortfoliosForScopeValidateBeforeCall(scope, effectiveAt, asAt, sortBy, start, limit, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolio>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updatePortfolio
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param request The updated portfolio definition (optional)
     * @param effectiveAt Optional. The effective date for the change (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updatePortfolioCall(String scope, String code, UpdatePortfolioRequest request, OffsetDateTime effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updatePortfolioValidateBeforeCall(String scope, String code, UpdatePortfolioRequest request, OffsetDateTime effectiveAt, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling updatePortfolio(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updatePortfolio(Async)");
        }
        

        com.squareup.okhttp.Call call = updatePortfolioCall(scope, code, request, effectiveAt, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update portfolio definition
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param request The updated portfolio definition (optional)
     * @param effectiveAt Optional. The effective date for the change (optional)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Portfolio updatePortfolio(String scope, String code, UpdatePortfolioRequest request, OffsetDateTime effectiveAt) throws ApiException {
        ApiResponse<Portfolio> resp = updatePortfolioWithHttpInfo(scope, code, request, effectiveAt);
        return resp.getData();
    }

    /**
     * Update portfolio definition
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param request The updated portfolio definition (optional)
     * @param effectiveAt Optional. The effective date for the change (optional)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Portfolio> updatePortfolioWithHttpInfo(String scope, String code, UpdatePortfolioRequest request, OffsetDateTime effectiveAt) throws ApiException {
        com.squareup.okhttp.Call call = updatePortfolioValidateBeforeCall(scope, code, request, effectiveAt, null, null);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update portfolio definition (asynchronously)
     * Update the definition of a specific portfolio. Note, some parts of a portfolio definition are not available for modification after the initial creation.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param request The updated portfolio definition (optional)
     * @param effectiveAt Optional. The effective date for the change (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePortfolioAsync(String scope, String code, UpdatePortfolioRequest request, OffsetDateTime effectiveAt, final ApiCallback<Portfolio> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePortfolioValidateBeforeCall(scope, code, request, effectiveAt, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for upsertPortfolioProperties
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param portfolioProperties The property values to be upserted to the portfolio. Time variant properties must have an EffectiveFrom date. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call upsertPortfolioPropertiesCall(String scope, String code, Object portfolioProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = portfolioProperties;

        // create path and map variables
        String localVarPath = "/api/portfolios/{scope}/{code}/properties"
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
    private com.squareup.okhttp.Call upsertPortfolioPropertiesValidateBeforeCall(String scope, String code, Object portfolioProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertPortfolioProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertPortfolioProperties(Async)");
        }
        

        com.squareup.okhttp.Call call = upsertPortfolioPropertiesCall(scope, code, portfolioProperties, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upsert portfolio properties
     * Upsert one or more property values to a portfolio. All properties must be of the domain Portfolio.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param portfolioProperties The property values to be upserted to the portfolio. Time variant properties must have an EffectiveFrom date. (optional)
     * @return PortfolioProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PortfolioProperties upsertPortfolioProperties(String scope, String code, Object portfolioProperties) throws ApiException {
        ApiResponse<PortfolioProperties> resp = upsertPortfolioPropertiesWithHttpInfo(scope, code, portfolioProperties);
        return resp.getData();
    }

    /**
     * Upsert portfolio properties
     * Upsert one or more property values to a portfolio. All properties must be of the domain Portfolio.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param portfolioProperties The property values to be upserted to the portfolio. Time variant properties must have an EffectiveFrom date. (optional)
     * @return ApiResponse&lt;PortfolioProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PortfolioProperties> upsertPortfolioPropertiesWithHttpInfo(String scope, String code, Object portfolioProperties) throws ApiException {
        com.squareup.okhttp.Call call = upsertPortfolioPropertiesValidateBeforeCall(scope, code, portfolioProperties, null, null);
        Type localVarReturnType = new TypeToken<PortfolioProperties>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upsert portfolio properties (asynchronously)
     * Upsert one or more property values to a portfolio. All properties must be of the domain Portfolio.
     * @param scope The scope of the portfolio (required)
     * @param code The code of the portfolio (required)
     * @param portfolioProperties The property values to be upserted to the portfolio. Time variant properties must have an EffectiveFrom date. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call upsertPortfolioPropertiesAsync(String scope, String code, Object portfolioProperties, final ApiCallback<PortfolioProperties> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = upsertPortfolioPropertiesValidateBeforeCall(scope, code, portfolioProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PortfolioProperties>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
