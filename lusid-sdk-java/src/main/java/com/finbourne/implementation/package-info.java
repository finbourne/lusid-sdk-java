// Copyright © 2018 FINBOURNE TECHNOLOGY LTD
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to
// deal in the Software without restriction, including without limitation the
// rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
// sell copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
// FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
// IN THE SOFTWARE.

/**
 * This package contains the implementation classes for LUSIDAPI.
 * # Introduction
 This page documents the [LUSID API](https://api.finbourne.com/swagger), which allows authorised clients to query and update their data within the LUSID platform.
 SDKs to interact with the LUSID API are available in the following languages :
 * [C#](https://github.com/finbourne/lusid-sdk-csharp)
 * [Java](https://github.com/finbourne/lusid-sdk-java)
 * [JavaScript](https://github.com/finbourne/lusid-sdk-js)
 * [Python](https://github.com/finbourne/lusid-sdk-python)
 # Immutable Events
 A core tenet of the LUSID platform is the concept of an immutable data store.  This gives the ability to consistently reproduce the state of the system for any given point in bi-temporal space.  In order to achieve this LUSID has implemented an append only event store for all data types.  New events, including historical amendments, are added to the end of the event stream and then 'played back' in order to construct the state.  Given that all the events from T0 are required in order to reconstruct the state, there can be significant computational complexity and cost involved.  FINBOURNE have employed a number of techniques and optimisations in order to produce consistent performance characteristics e.g. using snapshots which has resulted in a highly performance and scalable platform.
 # Data Model
 This section describes the data model that LUSID exposes via the APIs.
 ## Scope
 All entities in LUSID live within a logical partitioning of data known as a scope.  The unique code which identifies an entity is namespaced within the scope, allowing two entities with the same code in different scopes to be individually addressable.
 For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.
 ## Schema
 A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.
 ## Securities
 LUSID has its own security master implementation (LUSID CORE) which sources reference data from multiple data vendors.
 [OpenFIGI](https://openfigi.com/) and [PermID](https://permid.org/) are used as the security identifier when uploading trades, holdings, prices, etc.
 The API exposes a `securities/lookup` endpoint which can be used to lookup these identifiers given other market identifiers.
 Cash can be referenced using the ISO currency code prefixed with "`CCY_`" e.g. `CCY_GBP`
 For any securities that are not recognised by LUSID (eg OTCs) a client can upload a client defined security. Securitised portfolios and funds can be modelled as client defined securities.
 ## Security Prices (Analytics)
 Security prices are stored in LUSID's Analytics Store
 | Field|Type|Description |
 | ---|---|--- |
 | Id|string|Unique security identifier |
 | Value|decimal|Value of the analytic, eg price |
 ## Security Data
 Security data can be uploaded to the system using the [Classifications](#tag/Classification) endpoint.
 | Field|Type|Description |
 | ---|---|--- |
 | Uid|string|Unique security identifier |
 | EffectiveFrom|datetime|Date from which this classification is effective |
 ## Portfolios
 A portfolio is a container for trades and/or holdings.  Meta data and classifications of portfolios can be attached via properties.
 ## Derived Portfolios
 LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own trades and also inherits any trades from its parent portfolio.  Any changes made to the parent portfolio are automatically reflected in derived portfolio.
 Derived portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a derived portfolio could be created a new namespace linked to the underlying live (parent) portfolio.  Analysis can then be undertaken on the derived portfolio without affecting the live portfolio.
 ## Transactions
 A transaction represents an economic activity against a Portfolio.
 | Field|Type|Description |
 | ---|---|--- |
 | TradeId|string|Unique trade identifier |
 | Type|string|LUSID transaction type code - Buy, Sell, StockIn, StockOut, etc |
 | SecurityUid|string|Unique security identifier |
 | TradeDate|datetime|Trade date |
 | SettlementDate|datetime|Settlement date |
 | Units|decimal|Quantity of trade in units of the security |
 | TradePrice|decimal|Execution price for the trade |
 | TotalConsideration|decimal|Total value of the trade |
 | ExchangeRate|decimal|Rate between trade and settle currency |
 | SettlementCurrency|string|Settlement currency |
 | TradeCurrency|string|Trade currency |
 | CounterpartyId|string|Counterparty identifier |
 | Source|string|Where this trade came from, either Client or System |
 | DividendState|string|  |
 | TradePriceType|string|  |
 | UnitType|string|  |
 | NettingSet|string|  |
 ## Holdings
 A holding represents a position in a security or cash on a given date.
 | Field|Type|Description |
 | ---|---|--- |
 | SecurityUid|string|Unique security identifier |
 | HoldingType|string|Type of holding, eg Position, Balance, CashCommitment, Receivable, ForwardFX |
 | Units|decimal|Quantity of holding |
 | SettledUnits|decimal|Settled quantity of holding |
 | Cost|decimal|Book cost of holding in trade currency |
 | CostPortfolioCcy|decimal|Book cost of holding in portfolio currency |
 | Transaction|TradeDto|If this is commitment-type holding, the transaction behind it |
 ## Corporate Actions
 Corporate actions are represented within LUSID in terms of a set of security-specific 'transitions'.  These transitions are used to specify the participants of the corporate action, and the effect that the corporate action will have on holdings in those participants.
 *Corporate action*
 | Field|Type|Description |
 | ---|---|--- |
 | SourceId|id|  |
 | CorporateActionId|code|  |
 | AnnouncementDate|datetime|  |
 | ExDate|datetime|  |
 | RecordDate|datetime|  |
 *Transition*
 | Field|Type|Description |
 | ---|---|--- |
 | Direction|string|  |
 | SecurityUid|string|  |
 | UnitsFactor|decimal|  |
 | CostFactor|decimal|  |
 ## Property
 Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.
 # Error Codes
 | Code|Name|Description |
 | ---|---|--- |
 | <a name="100">100</a>|Personalisations not found|The personalisation(s) identified by the pattern provided could not be found, either because it does not exist or it has been deleted. Please check the pattern your provided. |
 | <a name="101">101</a>|NonRecursivePersonalisation|  |
 | <a name="102">102</a>|VersionNotFound|  |
 | <a name="104">104</a>|SecurityByCodeNotFound|  |
 | <a name="104">104</a>|SecurityByCodeNotFound|  |
 | <a name="105">105</a>|PropertyNotFound|  |
 | <a name="106">106</a>|PortfolioRecursionDepth|  |
 | <a name="108">108</a>|GroupNotFound|  |
 | <a name="109">109</a>|PortfolioNotFound|  |
 | <a name="110">110</a>|PropertySchemaNotFound|  |
 | <a name="112">112</a>|PortfolioWithIdAlreadyExists|  |
 | <a name="113">113</a>|OrphanedPortfolio|  |
 | <a name="119">119</a>|MissingBaseClaims|  |
 | <a name="121">121</a>|PropertyNotDefined|  |
 | <a name="122">122</a>|CannotDeleteSystemProperty|  |
 | <a name="123">123</a>|CannotModifyImmutablePropertyField|  |
 | <a name="124">124</a>|PropertyAlreadyExists|  |
 | <a name="125">125</a>|InvalidPropertyLifeTime|  |
 | <a name="127">127</a>|CannotModifyDefaultPropertyFormat|  |
 | <a name="128">128</a>|GroupAlreadyExists|  |
 | <a name="129">129</a>|NoSuchPropertyDataFormat|  |
 | <a name="132">132</a>|ValidationError|  |
 | <a name="133">133</a>|LoopDetectedInGroupHierarchy|  |
 | <a name="135">135</a>|SubGroupAlreadyExists|  |
 | <a name="138">138</a>|PriceSourceNotFound|  |
 | <a name="139">139</a>|AnalyticStoreNotFound|  |
 | <a name="141">141</a>|AnalyticStoreAlreadyExists|  |
 | <a name="143">143</a>|ClientSecurityAlreadyExists|  |
 | <a name="144">144</a>|DuplicateInParameterSet|  |
 | <a name="147">147</a>|ResultsNotFound|  |
 | <a name="148">148</a>|OrderFieldNotInResultSet|  |
 | <a name="149">149</a>|OperationFailed|  |
 | <a name="150">150</a>|ElasticSearchError|  |
 | <a name="151">151</a>|InvalidParameterValue|  |
 | <a name="152">152</a>|ServerConfigurationError|  |
 | <a name="153">153</a>|CommandProcessingFailure|  |
 | <a name="154">154</a>|EntityStateConstructionFailure|  |
 | <a name="155">155</a>|EntityTimelineDoesNotExist|  |
 | <a name="156">156</a>|EventPublishFailure|  |
 | <a name="157">157</a>|InvalidRequestFailure|  |
 | <a name="158">158</a>|EventPublishUnknown|  |
 | <a name="159">159</a>|EventQueryFailure|  |
 | <a name="160">160</a>|BlobDidNotExistFailure|  |
 | <a name="162">162</a>|SubSystemRequestFailure|  |
 | <a name="163">163</a>|SubSystemConfigurationFailure|  |
 | <a name="165">165</a>|FailedToDelete|  |
 | <a name="166">166</a>|UpsertClientSecurityFailure|  |
 | <a name="167">167</a>|IllegalAsAtInterval|  |
 | <a name="168">168</a>|IllegalBitemporalQuery|  |
 | <a name="169">169</a>|InvalidAlternateId|  |
 | <a name="170">170</a>|CannotAddSourcePortfolioPropertyExplicitly|  |
 | <a name="171">171</a>|EntityAlreadyExistsInGroup|  |
 | <a name="173">173</a>|EntityWithIdAlreadyExists|  |
 | <a name="174">174</a>|PortfolioDetailsDoNotExist|  |
 | <a name="176">176</a>|PortfolioWithNameAlreadyExists|  |
 | <a name="177">177</a>|InvalidTrades|  |
 | <a name="178">178</a>|ReferencePortfolioNotFound|  |
 | <a name="179">179</a>|DuplicateIdFailure|  |
 | <a name="180">180</a>|CommandRetrievalFailure|  |
 | <a name="181">181</a>|DataFilterApplicationFailure|  |
 | <a name="182">182</a>|SearchFailed|  |
 | <a name="-1">-1</a>|Unknown error|  |.
 */
package com.finbourne.implementation;
