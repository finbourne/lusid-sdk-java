/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://api.lusid.com/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages :  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python)  # Data Model  The LUSID API has a relatively lightweight but extremely powerful data model.   One of the goals of LUSID was not to enforce on clients a single rigid data model but rather to provide a flexible foundation onto which clients can streamline their data.   One of the primary tools to extend the data model is through using properties.  Properties can be associated with amongst others: - * Transactions * Instruments * Portfolios   The LUSID data model is exposed through the LUSID APIs.  The APIs provide access to both business objects and the meta data used to configure the systems behaviours.   The key business entities are: - * **Portfolios** A portfolio is the primary container for transactions and holdings.  * **Derived Portfolios** Derived portfolios allow portfolios to be created based on other portfolios, by overriding or overlaying specific items * **Holdings** A holding is a position account for a instrument within a portfolio.  Holdings can only be adjusted via transactions. * **Transactions** A Transaction is a source of transactions used to manipulate holdings.  * **Corporate Actions** A corporate action is a market event which occurs to a instrument, for example a stock split * **Instruments**  A instrument represents a currency, tradable instrument or OTC contract that is attached to a transaction and a holding. * **Properties** Several entities allow additional user defined properties to be associated with them.   For example, a Portfolio manager may be associated with a portfolio  Meta data includes: - * **Transaction Types** Transactions are booked with a specific transaction type.  The types are client defined and are used to map the Transaction to a series of movements which update the portfolio holdings.  * **Properties Types** Types of user defined properties used within the system.  This section describes the data model that LUSID exposes via the APIs.  ## Scope  All data in LUSID is segregated at the client level.  Entities in LUSID are identifiable by a unique code.  Every entity lives within a logical data partition known as a Scope.  Scope is an identity namespace allowing two entities with the same unique code to co-exist within individual address spaces.  For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.  LUSID Clients cannot access scopes of other clients.  ## Schema  A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.  ## Instruments  LUSID has its own built-in instrument master which you can use to master your own instrument universe.  Every instrument must be created with one or more unique market identifiers, such as [FIGI](https://openfigi.com/) or RIC code. For any non-listed instruments (eg OTCs), you can upload an instrument against a custom ID of your choosing.  In addition, LUSID will allocate each instrument a unique 'LUSID instrument identifier'. The LUSID instrument identifier is what is used when uploading transactions, holdings, prices, etc. The API exposes an `instrument/lookup` endpoint which can be used to lookup these LUSID identifiers using their market identifiers.  Cash can be referenced using the ISO currency code prefixed with \"`CCY_`\" e.g. `CCY_GBP`  ## Instrument Prices (Analytics)  Instrument prices are stored in LUSID's Analytics Store  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | Value|decimal|Value of the analytic, eg price | | Denomination|string|Underlying unit of the analytic, eg currency, EPS etc. |   ## Instrument Data  Instrument data can be uploaded to the system using the [Instrument Properties](#tag/InstrumentProperties) endpoint.  | Field|Type|Description | | ---|---|--- |   ## Portfolios  Portfolios are the top-level entity containers within LUSID, containing transactions, corporate actions and holdings.    The transactions build up the portfolio holdings on which valuations, analytics profit & loss and risk can be calculated.     Properties can be associated with Portfolios to add in additional model data.  Portfolio properties can be changed over time as well.  For example, to allow a Portfolio Manager to be linked with a Portfolio.  Additionally, portfolios can be securitised and held by other portfolios, allowing LUSID to perform \"drill-through\" into underlying fund holdings  ### Reference Portfolios Reference portfolios are portfolios that contain only weights, as opposed to transactions, and are designed to represent entities such as indices.  ### Derived Portfolios  LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own transactions and also inherits any transactions from its parent portfolio.  Any changes made to the parent portfolio are automatically reflected in derived portfolio.  Derived portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a derived portfolio could be created a new namespace linked to the underlying live (parent) portfolio.  Analysis can then be undertaken on the derived portfolio without affecting the live portfolio.  ### Portfolio Groups Portfolio groups allow the construction of a hierarchy from portfolios and groups.  Portfolio operations on the group are executed on an aggregated set of portfolios in the hierarchy.   For example:   * Global Portfolios _(group)_   * APAC _(group)_     * Hong Kong _(portfolio)_     * Japan _(portfolio)_   * Europe _(group)_     * France _(portfolio)_     * Germany _(portfolio)_   * UK _(portfolio)_   In this example **Global Portfolios** is a group that consists of an aggregate of **Hong Kong**, **Japan**, **France**, **Germany** and **UK** portfolios.  ### Movements Engine The Movements engine sits on top of the immutable event store and is used to manage the relationship between input trading actions and their associated portfolio holdings.     The movements engine reads in the following entity types:- * Posting Transactions * Applying Corporate Actions  * Holding Adjustments  These are converted to one or more movements and used by the movements engine to calculate holdings.  At the same time it also calculates running balances, and realised P&L.  The outputs from the movements engine are holdings and transactions.  ## Transactions  A transaction represents an economic activity against a Portfolio.  Transactions are processed according to a configuration. This will tell the LUSID engine how to interpret the transaction and correctly update the holdings. LUSID comes with a set of transaction types you can use out of the box, or you can configure your own set(s) of transactions.  For more details see the [LUSID Getting Started Guide for transaction configuration.](https://support.finbourne.com/hc/en-us/articles/360016737511-Configuring-Transaction-Types)  | Field|Type|Description | | ---|---|--- | | TransactionId|string|Unique transaction identifier | | Type|string|LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc | | InstrumentIdentifiers|IReadOnlyDictionary`2|Unique instrument identifiers. | | InstrumentUid|string|Unique instrument identifier | | TransactionDate|datetime|Transaction date | | SettlementDate|datetime|Settlement date | | Units|decimal|Quantity of transaction in units of the instrument | | TransactionPrice|tradeprice|Execution price for the transaction | | TotalConsideration|currencyandamount|Total value of the transaction in settlement currency | | ExchangeRate|decimal|Rate between transaction and settle currency | | TransactionCurrency|currency|Transaction currency | | CounterpartyId|string|Counterparty identifier | | Source|string|Where this transaction came from | | NettingSet|string|  |   From these fields, the following values can be calculated  * **Transaction value in Transaction currency**: TotalConsideration / ExchangeRate  * **Transaction value in Portfolio currency**: Transaction value in Transaction currency * TradeToPortfolioRate  ### Example Transactions  #### A Common Purchase Example Three example transactions are shown in the table below.   They represent a purchase of USD denominated IBM shares within a Sterling denominated portfolio.   * The first two transactions are for separate buy and fx trades    * Buying 500 IBM shares for $71,480.00    * A foreign exchange conversion to fund the IBM purchase. (Buy $71,480.00 for &#163;54,846.60)  * The third transaction is an alternate version of the above trades. Buying 500 IBM shares and settling directly in Sterling.  | Column |  Buy Trade | Fx Trade | Buy Trade with foreign Settlement | | ----- | ----- | ----- | ----- | | TransactionId | FBN00001 | FBN00002 | FBN00003 | | Type | Buy | FxBuy | Buy | | InstrumentUid | FIGI_BBG000BLNNH6 | CCY_USD | FIGI_BBG000BLNNH6 | | TransactionDate | 2018-08-02 | 2018-08-02 | 2018-08-02 | | SettlementDate | 2018-08-06 | 2018-08-06 | 2018-08-06 | | Units | 500 | 71480 | 500 | | TransactionPrice | 142.96 | 1 | 142.96 | | TradeCurrency | USD | USD | USD | | ExchangeRate | 1 | 0.7673 | 0.7673 | | TotalConsideration.Amount | 71480.00 | 54846.60 | 54846.60 | | TotalConsideration.Currency | USD | GBP | GBP | | Trade/default/TradeToPortfolioRate&ast; | 0.7673 | 0.7673 | 0.7673 |  [&ast; This is a property field]  #### A Forward FX Example  LUSID has a flexible transaction modelling system, and there are a number of different ways of modelling forward fx trades.  The default LUSID transaction types are FwdFxBuy and FwdFxSell. Other types and behaviours can be configured as required.  Using these transaction types, the holdings query will report two forward positions. One in each currency.   Since an FX trade is an exchange of one currency for another, the following two 6 month forward transactions are equivalent:  | Column |  Forward 'Sell' Trade | Forward 'Buy' Trade | | ----- | ----- | ----- | | TransactionId | FBN00004 | FBN00005 | | Type | FwdFxSell | FwdFxBuy | | InstrumentUid | CCY_GBP | CCY_USD | | TransactionDate | 2018-08-02 | 2018-08-02 | | SettlementDate | 2019-02-06 | 2019-02-06 | | Units | 10000.00 | 13142.00 | | TransactionPrice |1 | 1 | | TradeCurrency | GBP | USD | | ExchangeRate | 1.3142 | 0.760919 | | TotalConsideration.Amount | 13142.00 | 10000.00 | | TotalConsideration.Currency | USD | GBP | | Trade/default/TradeToPortfolioRate | 1.0 | 0.760919 |  ## Holdings  A holding represents a position in a instrument or cash on a given date.  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|Unique instrument identifier | | HoldingType|string|Type of holding, eg Position, Balance, CashCommitment, Receivable, ForwardFX | | Units|decimal|Quantity of holding | | SettledUnits|decimal|Settled quantity of holding | | Cost|currencyandamount|Book cost of holding in transaction currency | | CostPortfolioCcy|currencyandamount|Book cost of holding in portfolio currency | | Transaction|Transaction|If this is commitment-type holding, the transaction behind it |   ## Corporate Actions  Corporate actions are represented within LUSID in terms of a set of instrument-specific 'transitions'.  These transitions are used to specify the participants of the corporate action, and the effect that the corporate action will have on holdings in those participants.  *Corporate action*  | Field|Type|Description | | ---|---|--- | | SourceId|id|  | | CorporateActionCode|code|  | | AnnouncementDate|datetime|  | | ExDate|datetime|  | | RecordDate|datetime|  | | PaymentDate|datetime|  |    *Transition*  | Field|Type|Description | | ---|---|--- |   ## Property  Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.  # Schemas  The following headers are returned on all responses from LUSID  | Name | Purpose | | --- | --- | | lusid-meta-duration | Duration of the request | | lusid-meta-success | Whether or not LUSID considered the request to be successful | | lusid-meta-requestId | The unique identifier for the request | | lusid-schema-url | Url of the schema for the data being returned | | lusid-property-schema-url | Url of the schema for any properties |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"102\">102</a>|VersionNotFound|  | | <a name=\"104\">104</a>|InstrumentNotFound|  | | <a name=\"105\">105</a>|PropertyNotFound|  | | <a name=\"106\">106</a>|PortfolioRecursionDepth|  | | <a name=\"108\">108</a>|GroupNotFound|  | | <a name=\"109\">109</a>|PortfolioNotFound|  | | <a name=\"110\">110</a>|PropertySchemaNotFound|  | | <a name=\"111\">111</a>|PortfolioAncestryNotFound|  | | <a name=\"112\">112</a>|PortfolioWithIdAlreadyExists|  | | <a name=\"113\">113</a>|OrphanedPortfolio|  | | <a name=\"119\">119</a>|MissingBaseClaims|  | | <a name=\"121\">121</a>|PropertyNotDefined|  | | <a name=\"122\">122</a>|CannotDeleteSystemProperty|  | | <a name=\"123\">123</a>|CannotModifyImmutablePropertyField|  | | <a name=\"124\">124</a>|PropertyAlreadyExists|  | | <a name=\"125\">125</a>|InvalidPropertyLifeTime|  | | <a name=\"127\">127</a>|CannotModifyDefaultDataType|  | | <a name=\"128\">128</a>|GroupAlreadyExists|  | | <a name=\"129\">129</a>|NoSuchDataType|  | | <a name=\"132\">132</a>|ValidationError|  | | <a name=\"133\">133</a>|LoopDetectedInGroupHierarchy|  | | <a name=\"135\">135</a>|SubGroupAlreadyExists|  | | <a name=\"138\">138</a>|PriceSourceNotFound|  | | <a name=\"139\">139</a>|AnalyticStoreNotFound|  | | <a name=\"141\">141</a>|AnalyticStoreAlreadyExists|  | | <a name=\"143\">143</a>|ClientInstrumentAlreadyExists|  | | <a name=\"144\">144</a>|DuplicateInParameterSet|  | | <a name=\"147\">147</a>|ResultsNotFound|  | | <a name=\"148\">148</a>|OrderFieldNotInResultSet|  | | <a name=\"149\">149</a>|OperationFailed|  | | <a name=\"150\">150</a>|ElasticSearchError|  | | <a name=\"151\">151</a>|InvalidParameterValue|  | | <a name=\"153\">153</a>|CommandProcessingFailure|  | | <a name=\"154\">154</a>|EntityStateConstructionFailure|  | | <a name=\"155\">155</a>|EntityTimelineDoesNotExist|  | | <a name=\"156\">156</a>|EventPublishFailure|  | | <a name=\"157\">157</a>|InvalidRequestFailure|  | | <a name=\"158\">158</a>|EventPublishUnknown|  | | <a name=\"159\">159</a>|EventQueryFailure|  | | <a name=\"160\">160</a>|BlobDidNotExistFailure|  | | <a name=\"162\">162</a>|SubSystemRequestFailure|  | | <a name=\"163\">163</a>|SubSystemConfigurationFailure|  | | <a name=\"165\">165</a>|FailedToDelete|  | | <a name=\"166\">166</a>|UpsertClientInstrumentFailure|  | | <a name=\"167\">167</a>|IllegalAsAtInterval|  | | <a name=\"168\">168</a>|IllegalBitemporalQuery|  | | <a name=\"169\">169</a>|InvalidAlternateId|  | | <a name=\"170\">170</a>|CannotAddSourcePortfolioPropertyExplicitly|  | | <a name=\"171\">171</a>|EntityAlreadyExistsInGroup|  | | <a name=\"173\">173</a>|EntityWithIdAlreadyExists|  | | <a name=\"174\">174</a>|PortfolioDetailsDoNotExist|  | | <a name=\"176\">176</a>|PortfolioWithNameAlreadyExists|  | | <a name=\"177\">177</a>|InvalidTransactions|  | | <a name=\"178\">178</a>|ReferencePortfolioNotFound|  | | <a name=\"179\">179</a>|DuplicateIdFailure|  | | <a name=\"180\">180</a>|CommandRetrievalFailure|  | | <a name=\"181\">181</a>|DataFilterApplicationFailure|  | | <a name=\"182\">182</a>|SearchFailed|  | | <a name=\"183\">183</a>|MovementsEngineConfigurationKeyFailure|  | | <a name=\"184\">184</a>|FxRateSourceNotFound|  | | <a name=\"185\">185</a>|AccrualSourceNotFound|  | | <a name=\"186\">186</a>|EntitlementsFailure|  | | <a name=\"187\">187</a>|InvalidIdentityToken|  | | <a name=\"188\">188</a>|InvalidRequestHeaders|  | | <a name=\"189\">189</a>|PriceNotFound|  | | <a name=\"190\">190</a>|InvalidSubHoldingKeysProvided|  | | <a name=\"191\">191</a>|DuplicateSubHoldingKeysProvided|  | | <a name=\"192\">192</a>|CutDefinitionNotFound|  | | <a name=\"193\">193</a>|CutDefinitionInvalid|  | | <a name=\"200\">200</a>|InvalidUnitForDataType|  | | <a name=\"201\">201</a>|InvalidTypeForDataType|  | | <a name=\"202\">202</a>|InvalidValueForDataType|  | | <a name=\"203\">203</a>|UnitNotDefinedForDataType|  | | <a name=\"204\">204</a>|UnitsNotSupportedOnDataType|  | | <a name=\"205\">205</a>|CannotSpecifyUnitsOnDataType|  | | <a name=\"206\">206</a>|UnitSchemaInconsistentWithDataType|  | | <a name=\"207\">207</a>|UnitDefinitionNotSpecified|  | | <a name=\"208\">208</a>|DuplicateUnitDefinitionsSpecified|  | | <a name=\"209\">209</a>|InvalidUnitsDefinition|  | | <a name=\"210\">210</a>|InvalidInstrumentIdentifierUnit|  | | <a name=\"211\">211</a>|HoldingsAdjustmentDoesNotExist|  | | <a name=\"212\">212</a>|CouldNotBuildExcelUrl|  | | <a name=\"213\">213</a>|CouldNotGetExcelVersion|  | | <a name=\"214\">214</a>|InstrumentByCodeNotFound|  | | <a name=\"215\">215</a>|EntitySchemaDoesNotExist|  | | <a name=\"216\">216</a>|FeatureNotSupportedOnPortfolioType|  | | <a name=\"217\">217</a>|QuoteNotFoundFailure|  | | <a name=\"219\">219</a>|InvalidInstrumentDefinition|  | | <a name=\"221\">221</a>|InstrumentUpsertFailure|  | | <a name=\"222\">222</a>|ReferencePortfolioRequestNotSupported|  | | <a name=\"223\">223</a>|TransactionPortfolioRequestNotSupported|  | | <a name=\"224\">224</a>|InvalidPropertyValueAssignment|  | | <a name=\"230\">230</a>|TransactionTypeNotFound|  | | <a name=\"231\">231</a>|TransactionTypeDuplication|  | | <a name=\"232\">232</a>|PortfolioDoesNotExistAtGivenDate|  | | <a name=\"233\">233</a>|QueryParserFailure|  | | <a name=\"234\">234</a>|DuplicateConstituentFailure|  | | <a name=\"235\">235</a>|UnresolvedConstituentFailure|  | | <a name=\"301\">301</a>|DependenciesFailure|  | | <a name=\"304\">304</a>|PortfolioPreprocessFailure|  | | <a name=\"310\">310</a>|ValuationEngineFailure|  | | <a name=\"311\">311</a>|TaskFactoryFailure|  | | <a name=\"312\">312</a>|TaskEvaluationFailure|  | | <a name=\"350\">350</a>|InstrumentFailure|  | | <a name=\"351\">351</a>|CashFlowsFailure|  | | <a name=\"370\">370</a>|ResultRetrievalFailure|  | | <a name=\"371\">371</a>|ResultProcessingFailure|  | | <a name=\"372\">372</a>|VendorResultProcessingFailure|  | | <a name=\"373\">373</a>|CannotSupplyTimesWithPortfoliosQuery|  | | <a name=\"374\">374</a>|AttemptToUpsertDuplicateQuotes|  | | <a name=\"-10\">-10</a>|ServerConfigurationError|  | | <a name=\"-1\">-1</a>|Unknown error|  | 
 *
 * OpenAPI spec version: 0.9.144
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


import com.finbourne.lusid.model.DeleteInstrumentResponse;
import com.finbourne.lusid.model.ErrorResponse;
import com.finbourne.lusid.model.GetInstrumentsResponse;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.MatchInstrumentsResponse;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceListOfInstrument;
import com.finbourne.lusid.model.ResourceListOfString;
import com.finbourne.lusid.model.UpdateInstrumentIdentifierRequest;
import com.finbourne.lusid.model.UpsertInstrumentPropertiesResponse;
import com.finbourne.lusid.model.UpsertInstrumentPropertyRequest;
import com.finbourne.lusid.model.UpsertInstrumentsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstrumentsApi {
    private ApiClient apiClient;

    public InstrumentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstrumentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteInstrument
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteInstrumentCall(String identifierType, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}"
            .replaceAll("\\{" + "identifierType" + "\\}", apiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
    private com.squareup.okhttp.Call deleteInstrumentValidateBeforeCall(String identifierType, String identifier, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling deleteInstrument(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deleteInstrument(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteInstrumentCall(identifierType, identifier, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete instrument
     * Attempt to delete one or more \&quot;client\&quot; instruments.    The response will include those instruments that could not be deleted (as well as any available details).                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @return DeleteInstrumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteInstrumentResponse deleteInstrument(String identifierType, String identifier) throws ApiException {
        ApiResponse<DeleteInstrumentResponse> resp = deleteInstrumentWithHttpInfo(identifierType, identifier);
        return resp.getData();
    }

    /**
     * Delete instrument
     * Attempt to delete one or more \&quot;client\&quot; instruments.    The response will include those instruments that could not be deleted (as well as any available details).                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @return ApiResponse&lt;DeleteInstrumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteInstrumentResponse> deleteInstrumentWithHttpInfo(String identifierType, String identifier) throws ApiException {
        com.squareup.okhttp.Call call = deleteInstrumentValidateBeforeCall(identifierType, identifier, null, null);
        Type localVarReturnType = new TypeToken<DeleteInstrumentResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete instrument (asynchronously)
     * Attempt to delete one or more \&quot;client\&quot; instruments.    The response will include those instruments that could not be deleted (as well as any available details).                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteInstrumentAsync(String identifierType, String identifier, final ApiCallback<DeleteInstrumentResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteInstrumentValidateBeforeCall(identifierType, identifier, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteInstrumentResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for findInstruments
     * @param aliases The list of market aliases (e.g ISIN, Ticker) to find instruments by. (optional)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call findInstrumentsCall(List<Property> aliases, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = aliases;

        // create path and map variables
        String localVarPath = "/api/instruments/$find";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (instrumentPropertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "instrumentPropertyKeys", instrumentPropertyKeys));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
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
    private com.squareup.okhttp.Call findInstrumentsValidateBeforeCall(List<Property> aliases, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = findInstrumentsCall(aliases, effectiveAt, asAt, instrumentPropertyKeys, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Search instrument definition
     * Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param aliases The list of market aliases (e.g ISIN, Ticker) to find instruments by. (optional)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @return ResourceListOfInstrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfInstrument findInstruments(List<Property> aliases, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys) throws ApiException {
        ApiResponse<ResourceListOfInstrument> resp = findInstrumentsWithHttpInfo(aliases, effectiveAt, asAt, instrumentPropertyKeys);
        return resp.getData();
    }

    /**
     * Search instrument definition
     * Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param aliases The list of market aliases (e.g ISIN, Ticker) to find instruments by. (optional)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @return ApiResponse&lt;ResourceListOfInstrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfInstrument> findInstrumentsWithHttpInfo(List<Property> aliases, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys) throws ApiException {
        com.squareup.okhttp.Call call = findInstrumentsValidateBeforeCall(aliases, effectiveAt, asAt, instrumentPropertyKeys, null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search instrument definition (asynchronously)
     * Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param aliases The list of market aliases (e.g ISIN, Ticker) to find instruments by. (optional)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call findInstrumentsAsync(List<Property> aliases, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ApiCallback<ResourceListOfInstrument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = findInstrumentsValidateBeforeCall(aliases, effectiveAt, asAt, instrumentPropertyKeys, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInstrument
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The identifier of the requested instrument (required)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInstrumentCall(String identifierType, String identifier, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}"
            .replaceAll("\\{" + "identifierType" + "\\}", apiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (instrumentPropertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "instrumentPropertyKeys", instrumentPropertyKeys));

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
    private com.squareup.okhttp.Call getInstrumentValidateBeforeCall(String identifierType, String identifier, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getInstrument(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getInstrument(Async)");
        }
        

        com.squareup.okhttp.Call call = getInstrumentCall(identifierType, identifier, effectiveAt, asAt, instrumentPropertyKeys, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get instrument definition
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The identifier of the requested instrument (required)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @return Instrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Instrument getInstrument(String identifierType, String identifier, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys) throws ApiException {
        ApiResponse<Instrument> resp = getInstrumentWithHttpInfo(identifierType, identifier, effectiveAt, asAt, instrumentPropertyKeys);
        return resp.getData();
    }

    /**
     * Get instrument definition
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The identifier of the requested instrument (required)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @return ApiResponse&lt;Instrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Instrument> getInstrumentWithHttpInfo(String identifierType, String identifier, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys) throws ApiException {
        com.squareup.okhttp.Call call = getInstrumentValidateBeforeCall(identifierType, identifier, effectiveAt, asAt, instrumentPropertyKeys, null, null);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instrument definition (asynchronously)
     * Get an individual instrument by the one of its unique instrument identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The identifier of the requested instrument (required)
     * @param effectiveAt Optional. The effective date of the query (optional)
     * @param asAt Optional. The AsAt date of the query (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInstrumentAsync(String identifierType, String identifier, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ApiCallback<Instrument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInstrumentValidateBeforeCall(identifierType, identifier, effectiveAt, asAt, instrumentPropertyKeys, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInstrumentIdentifiers
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInstrumentIdentifiersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/identifiers";

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getInstrumentIdentifiersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getInstrumentIdentifiersCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get allowable instrument identifiers
     * Gets the set of identifiers that have been configured as unique identifiers for instruments.     Only CodeTypes returned from this end point can be used as identifiers for instruments.
     * @return ResourceListOfString
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfString getInstrumentIdentifiers() throws ApiException {
        ApiResponse<ResourceListOfString> resp = getInstrumentIdentifiersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get allowable instrument identifiers
     * Gets the set of identifiers that have been configured as unique identifiers for instruments.     Only CodeTypes returned from this end point can be used as identifiers for instruments.
     * @return ApiResponse&lt;ResourceListOfString&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfString> getInstrumentIdentifiersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getInstrumentIdentifiersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfString>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get allowable instrument identifiers (asynchronously)
     * Gets the set of identifiers that have been configured as unique identifiers for instruments.     Only CodeTypes returned from this end point can be used as identifiers for instruments.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInstrumentIdentifiersAsync(final ApiCallback<ResourceListOfString> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInstrumentIdentifiersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfString>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getInstruments
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @param effectiveAt Optional. The effective date of the request (optional)
     * @param asAt Optional. The as at date of the request (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getInstrumentsCall(String identifierType, List<String> identifiers, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = identifiers;

        // create path and map variables
        String localVarPath = "/api/instruments/$get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifierType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifierType", identifierType));
        if (effectiveAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("effectiveAt", effectiveAt));
        if (asAt != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asAt", asAt));
        if (instrumentPropertyKeys != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("multi", "instrumentPropertyKeys", instrumentPropertyKeys));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
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
    private com.squareup.okhttp.Call getInstrumentsValidateBeforeCall(String identifierType, List<String> identifiers, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getInstrumentsCall(identifierType, identifiers, effectiveAt, asAt, instrumentPropertyKeys, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get instrument definition
     * Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @param effectiveAt Optional. The effective date of the request (optional)
     * @param asAt Optional. The as at date of the request (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @return GetInstrumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetInstrumentsResponse getInstruments(String identifierType, List<String> identifiers, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys) throws ApiException {
        ApiResponse<GetInstrumentsResponse> resp = getInstrumentsWithHttpInfo(identifierType, identifiers, effectiveAt, asAt, instrumentPropertyKeys);
        return resp.getData();
    }

    /**
     * Get instrument definition
     * Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @param effectiveAt Optional. The effective date of the request (optional)
     * @param asAt Optional. The as at date of the request (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @return ApiResponse&lt;GetInstrumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetInstrumentsResponse> getInstrumentsWithHttpInfo(String identifierType, List<String> identifiers, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys) throws ApiException {
        com.squareup.okhttp.Call call = getInstrumentsValidateBeforeCall(identifierType, identifiers, effectiveAt, asAt, instrumentPropertyKeys, null, null);
        Type localVarReturnType = new TypeToken<GetInstrumentsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get instrument definition (asynchronously)
     * Get a collection of instruments by a set of identifiers. Optionally, it is possible to decorate each instrument with specified property data.
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @param effectiveAt Optional. The effective date of the request (optional)
     * @param asAt Optional. The as at date of the request (optional)
     * @param instrumentPropertyKeys Optional. Keys of the properties to be decorated on to the instrument (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInstrumentsAsync(String identifierType, List<String> identifiers, OffsetDateTime effectiveAt, OffsetDateTime asAt, List<String> instrumentPropertyKeys, final ApiCallback<GetInstrumentsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInstrumentsValidateBeforeCall(identifierType, identifiers, effectiveAt, asAt, instrumentPropertyKeys, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetInstrumentsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listInstruments
     * @param asAt Optional. The AsAt time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many (optional)
     * @param filter Optional. Expression to filter the result set - the default filter returns only instruments in the Active state (optional, default to State eq 'Active')
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listInstrumentsCall(OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments";

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
    private com.squareup.okhttp.Call listInstrumentsValidateBeforeCall(OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listInstrumentsCall(asAt, sortBy, start, limit, filter, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all of the currently mastered instruments in LUSID
     * Lists all instruments that have been mastered within LUSID.
     * @param asAt Optional. The AsAt time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many (optional)
     * @param filter Optional. Expression to filter the result set - the default filter returns only instruments in the Active state (optional, default to State eq 'Active')
     * @return ResourceListOfInstrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ResourceListOfInstrument listInstruments(OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) throws ApiException {
        ApiResponse<ResourceListOfInstrument> resp = listInstrumentsWithHttpInfo(asAt, sortBy, start, limit, filter);
        return resp.getData();
    }

    /**
     * Get all of the currently mastered instruments in LUSID
     * Lists all instruments that have been mastered within LUSID.
     * @param asAt Optional. The AsAt time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many (optional)
     * @param filter Optional. Expression to filter the result set - the default filter returns only instruments in the Active state (optional, default to State eq 'Active')
     * @return ApiResponse&lt;ResourceListOfInstrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ResourceListOfInstrument> listInstrumentsWithHttpInfo(OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter) throws ApiException {
        com.squareup.okhttp.Call call = listInstrumentsValidateBeforeCall(asAt, sortBy, start, limit, filter, null, null);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all of the currently mastered instruments in LUSID (asynchronously)
     * Lists all instruments that have been mastered within LUSID.
     * @param asAt Optional. The AsAt time (optional)
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many (optional)
     * @param filter Optional. Expression to filter the result set - the default filter returns only instruments in the Active state (optional, default to State eq 'Active')
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInstrumentsAsync(OffsetDateTime asAt, List<String> sortBy, Integer start, Integer limit, String filter, final ApiCallback<ResourceListOfInstrument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listInstrumentsValidateBeforeCall(asAt, sortBy, start, limit, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for matchInstruments
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call matchInstrumentsCall(String identifierType, List<String> identifiers, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = identifiers;

        // create path and map variables
        String localVarPath = "/api/instruments/$match";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (identifierType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("identifierType", identifierType));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
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
    private com.squareup.okhttp.Call matchInstrumentsValidateBeforeCall(String identifierType, List<String> identifiers, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = matchInstrumentsCall(identifierType, identifiers, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Find externally mastered instruments
     * Search for a set of instruments from an external instrument mastering service
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @return MatchInstrumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MatchInstrumentsResponse matchInstruments(String identifierType, List<String> identifiers) throws ApiException {
        ApiResponse<MatchInstrumentsResponse> resp = matchInstrumentsWithHttpInfo(identifierType, identifiers);
        return resp.getData();
    }

    /**
     * Find externally mastered instruments
     * Search for a set of instruments from an external instrument mastering service
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @return ApiResponse&lt;MatchInstrumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MatchInstrumentsResponse> matchInstrumentsWithHttpInfo(String identifierType, List<String> identifiers) throws ApiException {
        com.squareup.okhttp.Call call = matchInstrumentsValidateBeforeCall(identifierType, identifiers, null, null);
        Type localVarReturnType = new TypeToken<MatchInstrumentsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find externally mastered instruments (asynchronously)
     * Search for a set of instruments from an external instrument mastering service
     * @param identifierType The type of identifiers being supplied (optional)
     * @param identifiers The identifiers of the instruments to get (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call matchInstrumentsAsync(String identifierType, List<String> identifiers, final ApiCallback<MatchInstrumentsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = matchInstrumentsValidateBeforeCall(identifierType, identifiers, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MatchInstrumentsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateInstrumentIdentifier
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @param request The identifier to add, update, or remove (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateInstrumentIdentifierCall(String identifierType, String identifier, UpdateInstrumentIdentifierRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}"
            .replaceAll("\\{" + "identifierType" + "\\}", apiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
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
    private com.squareup.okhttp.Call updateInstrumentIdentifierValidateBeforeCall(String identifierType, String identifier, UpdateInstrumentIdentifierRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling updateInstrumentIdentifier(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling updateInstrumentIdentifier(Async)");
        }
        

        com.squareup.okhttp.Call call = updateInstrumentIdentifierCall(identifierType, identifier, request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update instrument identifier
     * Adds, updates, or removes an identifier on an instrument
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @param request The identifier to add, update, or remove (optional)
     * @return Instrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Instrument updateInstrumentIdentifier(String identifierType, String identifier, UpdateInstrumentIdentifierRequest request) throws ApiException {
        ApiResponse<Instrument> resp = updateInstrumentIdentifierWithHttpInfo(identifierType, identifier, request);
        return resp.getData();
    }

    /**
     * Update instrument identifier
     * Adds, updates, or removes an identifier on an instrument
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @param request The identifier to add, update, or remove (optional)
     * @return ApiResponse&lt;Instrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Instrument> updateInstrumentIdentifierWithHttpInfo(String identifierType, String identifier, UpdateInstrumentIdentifierRequest request) throws ApiException {
        com.squareup.okhttp.Call call = updateInstrumentIdentifierValidateBeforeCall(identifierType, identifier, request, null, null);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update instrument identifier (asynchronously)
     * Adds, updates, or removes an identifier on an instrument
     * @param identifierType The type of identifier being supplied (required)
     * @param identifier The instrument identifier (required)
     * @param request The identifier to add, update, or remove (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateInstrumentIdentifierAsync(String identifierType, String identifier, UpdateInstrumentIdentifierRequest request, final ApiCallback<Instrument> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateInstrumentIdentifierValidateBeforeCall(identifierType, identifier, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for upsertInstruments
     * @param requests The instrument definitions (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call upsertInstrumentsCall(Object requests, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requests;

        // create path and map variables
        String localVarPath = "/api/instruments";

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
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
    private com.squareup.okhttp.Call upsertInstrumentsValidateBeforeCall(Object requests, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = upsertInstrumentsCall(requests, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upsert instruments
     * Attempt to master one or more instruments in LUSID&#39;s instrument master. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.    The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the  request.                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.
     * @param requests The instrument definitions (optional)
     * @return UpsertInstrumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpsertInstrumentsResponse upsertInstruments(Object requests) throws ApiException {
        ApiResponse<UpsertInstrumentsResponse> resp = upsertInstrumentsWithHttpInfo(requests);
        return resp.getData();
    }

    /**
     * Upsert instruments
     * Attempt to master one or more instruments in LUSID&#39;s instrument master. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.    The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the  request.                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.
     * @param requests The instrument definitions (optional)
     * @return ApiResponse&lt;UpsertInstrumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpsertInstrumentsResponse> upsertInstrumentsWithHttpInfo(Object requests) throws ApiException {
        com.squareup.okhttp.Call call = upsertInstrumentsValidateBeforeCall(requests, null, null);
        Type localVarReturnType = new TypeToken<UpsertInstrumentsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upsert instruments (asynchronously)
     * Attempt to master one or more instruments in LUSID&#39;s instrument master. Each instrument is keyed by some unique key. This key is unimportant, and serves only as a method to identify created instruments in the response.    The response will return both the collection of successfully created instruments, as well as those that were rejected and why their creation failed. They will be keyed against the key supplied in the  request.                It is important to always check the &#39;Failed&#39; set for any unsuccessful results.
     * @param requests The instrument definitions (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call upsertInstrumentsAsync(Object requests, final ApiCallback<UpsertInstrumentsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = upsertInstrumentsValidateBeforeCall(requests, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpsertInstrumentsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for upsertInstrumentsProperties
     * @param instrumentProperties The instrument property data (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call upsertInstrumentsPropertiesCall(List<UpsertInstrumentPropertyRequest> instrumentProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = instrumentProperties;

        // create path and map variables
        String localVarPath = "/api/instruments/$upsertproperties";

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
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
    private com.squareup.okhttp.Call upsertInstrumentsPropertiesValidateBeforeCall(List<UpsertInstrumentPropertyRequest> instrumentProperties, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = upsertInstrumentsPropertiesCall(instrumentProperties, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Upsert instrument properties
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.    The response will include the details of any failures that occurred during data storage.                It is important to always check the &#39;Failed&#39; collection for any unsuccessful results.
     * @param instrumentProperties The instrument property data (optional)
     * @return UpsertInstrumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpsertInstrumentPropertiesResponse upsertInstrumentsProperties(List<UpsertInstrumentPropertyRequest> instrumentProperties) throws ApiException {
        ApiResponse<UpsertInstrumentPropertiesResponse> resp = upsertInstrumentsPropertiesWithHttpInfo(instrumentProperties);
        return resp.getData();
    }

    /**
     * Upsert instrument properties
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.    The response will include the details of any failures that occurred during data storage.                It is important to always check the &#39;Failed&#39; collection for any unsuccessful results.
     * @param instrumentProperties The instrument property data (optional)
     * @return ApiResponse&lt;UpsertInstrumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpsertInstrumentPropertiesResponse> upsertInstrumentsPropertiesWithHttpInfo(List<UpsertInstrumentPropertyRequest> instrumentProperties) throws ApiException {
        com.squareup.okhttp.Call call = upsertInstrumentsPropertiesValidateBeforeCall(instrumentProperties, null, null);
        Type localVarReturnType = new TypeToken<UpsertInstrumentPropertiesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upsert instrument properties (asynchronously)
     * Attempt to upsert property data for one or more instruments, properties, and effective dates.    The response will include the details of any failures that occurred during data storage.                It is important to always check the &#39;Failed&#39; collection for any unsuccessful results.
     * @param instrumentProperties The instrument property data (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call upsertInstrumentsPropertiesAsync(List<UpsertInstrumentPropertyRequest> instrumentProperties, final ApiCallback<UpsertInstrumentPropertiesResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = upsertInstrumentsPropertiesValidateBeforeCall(instrumentProperties, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpsertInstrumentPropertiesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
