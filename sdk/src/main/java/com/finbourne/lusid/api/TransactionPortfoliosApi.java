/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages :  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python)  # Data Model  The LUSID API has a relatively lightweight but extremely powerful data model. One of the goals of LUSID was not to enforce on clients a single rigid data model but rather to provide a flexible foundation onto which clients can map their own data models.  The core entities in LUSID provide a minimal structure and set of relationships, and the data model can be extended using Properties.  The LUSID data model is exposed through the LUSID APIs.  The APIs provide access to both business objects and the meta data used to configure the systems behaviours.   The key business entities are: - * **Portfolios** A portfolio is a container for transactions and holdings (a **Transaction Portfolio**) or constituents (a **Reference Portfolio**). * **Derived Portfolios**. Derived Portfolios allow Portfolios to be created based on other Portfolios, by overriding or adding specific items. * **Holdings** A Holding is a quantity of an Instrument or a balance of cash within a Portfolio.  Holdings can only be adjusted via Transactions. * **Transactions** A Transaction is an economic event that occurs in a Portfolio, causing its holdings to change. * **Corporate Actions** A corporate action is a market event which occurs to an Instrument and thus applies to all portfolios which holding the instrument.  Examples are stock splits or mergers. * **Constituents** A constituent is a record in a Reference Portfolio containing an Instrument and an associated weight. * **Instruments**  An instrument represents a currency, tradable instrument or OTC contract that is attached to a transaction and a holding. * **Properties** All major entities allow additional user defined properties to be associated with them.   For example, a Portfolio manager may be associated with a portfolio.  Meta data includes: - * **Transaction Types** Transactions are booked with a specific transaction type.  The types are client defined and are used to map the Transaction to a series of movements which update the portfolio holdings.  * **Properties Types** Types of user defined properties used within the system.  ## Scope  All data in LUSID is segregated at the client level.  Entities in LUSID are identifiable by a unique code.  Every entity lives within a logical data partition known as a Scope.  Scope is an identity namespace allowing two entities with the same unique code to co-exist within individual address spaces.  For example, prices for equities from different vendors may be uploaded into different scopes such as `client/vendor1` and `client/vendor2`.  A portfolio may then be valued using either of the price sources by referencing the appropriate scope.  LUSID Clients cannot access scopes of other clients.  ## Instruments  LUSID has its own built-in instrument master which you can use to master your own instrument universe.  Every instrument must be created with one or more unique market identifiers, such as [FIGI](https://openfigi.com/). For any non-listed instruments (eg OTCs), you can upload an instrument against a custom ID of your choosing.  In addition, LUSID will allocate each instrument a unique 'LUSID instrument identifier'. The LUSID instrument identifier is what is used when uploading transactions, holdings, prices, etc. The API exposes an `instrument/lookup` endpoint which can be used to lookup these LUSID identifiers using their market identifiers.  Cash can be referenced using the ISO currency code prefixed with \"`CCY_`\" e.g. `CCY_GBP`  ## Instrument Data  Instrument data can be uploaded to the system using the [Instrument Properties](#tag/InstrumentProperties) endpoint.  | Field|Type|Description | | ---|---|--- | | Key|propertykey|The key of the property. This takes the format {domain}/{scope}/{code} e.g. 'Instrument/system/Name' or 'Transaction/strategy/quantsignal'. | | Value|string|The value of the property. | | EffectiveFrom|datetimeoffset|The effective datetime from which the property is valid. |   ## Transaction Portfolios  Portfolios are the top-level entity containers within LUSID, containing transactions, corporate actions and holdings.    The transactions build up the portfolio holdings on which valuations, analytics profit & loss and risk can be calculated.  Properties can be associated with Portfolios to add in additional data.  Portfolio properties can be changed over time, for example to allow a Portfolio Manager to be linked with a Portfolio.  Additionally, portfolios can be securitised and held by other portfolios, allowing LUSID to perform \"drill-through\" into underlying fund holdings  ### Derived Portfolios  LUSID also allows for a portfolio to be composed of another portfolio via derived portfolios.  A derived portfolio can contain its own transactions and also inherits any transactions from its parent portfolio.  Any changes made to the parent portfolio are automatically reflected in derived portfolio.  Derived portfolios in conjunction with scopes are a powerful construct.  For example, to do pre-trade what-if analysis, a derived portfolio could be created a new namespace linked to the underlying live (parent) portfolio.  Analysis can then be undertaken on the derived portfolio without affecting the live portfolio.  ### Transactions  A transaction represents an economic activity against a Portfolio.  Transactions are processed according to a configuration. This will tell the LUSID engine how to interpret the transaction and correctly update the holdings. LUSID comes with a set of transaction types you can use out of the box, or you can configure your own set(s) of transactions.  For more details see the [LUSID Getting Started Guide for transaction configuration.](https://support.lusid.com/configuring-transaction-types)  | Field|Type|Description | | ---|---|--- | | TransactionId|string|The unique identifier for the transaction. | | Type|string|The type of the transaction e.g. 'Buy', 'Sell'. The transaction type should have been pre-configured via the System Configuration API endpoint. If it hasn't been pre-configured the transaction will still be updated or inserted however you will be unable to generate the resultant holdings for the portfolio that contains this transaction as LUSID does not know how to process it. | | InstrumentIdentifiers|map|A set of instrument identifiers to use to resolve the transaction to a unique instrument. | | TransactionDate|dateorcutlabel|The date of the transaction. | | SettlementDate|dateorcutlabel|The settlement date of the transaction. | | Units|decimal|The number of units transacted in the associated instrument. | | TransactionPrice|transactionprice|The price for each unit of the transacted instrument in the transaction currency. | | TotalConsideration|currencyandamount|The total value of the transaction in the settlement currency. | | ExchangeRate|decimal|The exchange rate between the transaction and settlement currency. For example if the transaction currency is in USD and the settlement currency is in GBP this this the USD/GBP rate. | | TransactionCurrency|currency|The transaction currency. | | Properties|map|Set of unique transaction properties and associated values to store with the transaction. Each property must be from the 'Transaction' domain. | | CounterpartyId|string|The identifier for the counterparty of the transaction. | | Source|string|The source of the transaction. This is used to look up the appropriate transaction group set in the transaction type configuration. |   From these fields, the following values can be calculated  * **Transaction value in Transaction currency**: TotalConsideration / ExchangeRate  * **Transaction value in Portfolio currency**: Transaction value in Transaction currency * TradeToPortfolioRate  #### Example Transactions  ##### A Common Purchase Example Three example transactions are shown in the table below.   They represent a purchase of USD denominated IBM shares within a Sterling denominated portfolio.   * The first two transactions are for separate buy and fx trades    * Buying 500 IBM shares for $71,480.00    * A spot foreign exchange conversion to fund the IBM purchase. (Buy $71,480.00 for &#163;54,846.60)  * The third transaction is an alternate version of the above trades. Buying 500 IBM shares and settling directly in Sterling.  | Column |  Buy Trade | Fx Trade | Buy Trade with foreign Settlement | | ----- | ----- | ----- | ----- | | TransactionId | FBN00001 | FBN00002 | FBN00003 | | Type | Buy | FxBuy | Buy | | InstrumentIdentifiers | { \"figi\", \"BBG000BLNNH6\" } | { \"CCY\", \"CCY_USD\" } | { \"figi\", \"BBG000BLNNH6\" } | | TransactionDate | 2018-08-02 | 2018-08-02 | 2018-08-02 | | SettlementDate | 2018-08-06 | 2018-08-06 | 2018-08-06 | | Units | 500 | 71480 | 500 | | TransactionPrice | 142.96 | 1 | 142.96 | | TradeCurrency | USD | USD | USD | | ExchangeRate | 1 | 0.7673 | 0.7673 | | TotalConsideration.Amount | 71480.00 | 54846.60 | 54846.60 | | TotalConsideration.Currency | USD | GBP | GBP | | Trade/default/TradeToPortfolioRate&ast; | 0.7673 | 0.7673 | 0.7673 |  [&ast; This is a property field]  ##### A Forward FX Example  LUSID has a flexible transaction modelling system, meaning there are a number of different ways of modelling forward fx trades.  The default LUSID transaction types are FwdFxBuy and FwdFxSell. Using these transaction types, LUSID will generate two holdings for each Forward FX trade, one for each currency in the trade.  An example Forward Fx trade to sell GBP for USD in a JPY-denominated portfolio is shown below:  | Column | Forward 'Sell' Trade | Notes | | ----- | ----- | ---- | | TransactionId | FBN00004 | | | Type | FwdFxSell | | | InstrumentIdentifiers | { \"Instrument/default/Currency\", \"GBP\" } | | | TransactionDate | 2018-08-02 | | | SettlementDate | 2019-02-06 | Six month forward | | Units | 10000.00 | Units of GBP | | TransactionPrice | 1 | | | TradeCurrency | GBP | Currency being sold | | ExchangeRate | 1.3142 | Agreed rate between GBP and USD | | TotalConsideration.Amount | 13142.00 | Amount in the settlement currency, USD | | TotalConsideration.Currency | USD | Settlement currency | | Trade/default/TradeToPortfolioRate | 142.88 | Rate between trade currency, GBP and portfolio base currency, JPY |  Please note that exactly the same economic behaviour could be modelled using the FwdFxBuy Transaction Type with the amounts and rates reversed.  ### Holdings  A holding represents a position in an instrument or cash on a given date.  | Field|Type|Description | | ---|---|--- | | InstrumentUid|string|The unqiue Lusid Instrument Id (LUID) of the instrument that the holding is in. | | SubHoldingKeys|map|The sub-holding properties which identify the holding. Each property will be from the 'Transaction' domain. These are configured when a transaction portfolio is created. | | Properties|map|The properties which have been requested to be decorated onto the holding. These will be from the 'Instrument' or 'Holding' domain. | | HoldingType|string|The type of the holding e.g. Position, Balance, CashCommitment, Receivable, ForwardFX etc. | | Units|decimal|The total number of units of the holding. | | SettledUnits|decimal|The total number of settled units of the holding. | | Cost|currencyandamount|The total cost of the holding in the transaction currency. | | CostPortfolioCcy|currencyandamount|The total cost of the holding in the portfolio currency. | | Transaction|transaction|The transaction associated with an unsettled holding. |   ## Corporate Actions  Corporate actions are represented within LUSID in terms of a set of instrument-specific 'transitions'.  These transitions are used to specify the participants of the corporate action, and the effect that the corporate action will have on holdings in those participants.  ### Corporate Action  | Field|Type|Description | | ---|---|--- | | CorporateActionCode|code|The unique identifier of this corporate action | | Description|string|  | | AnnouncementDate|datetimeoffset|The announcement date of the corporate action | | ExDate|datetimeoffset|The ex date of the corporate action | | RecordDate|datetimeoffset|The record date of the corporate action | | PaymentDate|datetimeoffset|The payment date of the corporate action | | Transitions|corporateactiontransition[]|The transitions that result from this corporate action |   ### Transition | Field|Type|Description | | ---|---|--- | | InputTransition|corporateactiontransitioncomponent|Indicating the basis of the corporate action - which security and how many units | | OutputTransitions|corporateactiontransitioncomponent[]|What will be generated relative to the input transition |   ### Example Corporate Action Transitions  #### A Dividend Action Transition  In this example, for each share of IBM, 0.20 units (or 20 pence) of GBP are generated.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"ccy\" : \"CCY_GBP\" } | | Units Factor | 1 | 0.20 | | Cost Factor | 1 | 0 |  #### A Split Action Transition  In this example, for each share of IBM, we end up with 2 units (2 shares) of IBM, with total value unchanged.  | Column |  Input Transition | Output Transition | | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | | Units Factor | 1 | 2 | | Cost Factor | 1 | 1 |  #### A Spinoff Action Transition  In this example, for each share of IBM, we end up with 1 unit (1 share) of IBM and 3 units (3 shares) of Celestica, with 85% of the value remaining on the IBM share, and 5% in each Celestica share (15% total).  | Column |  Input Transition | Output Transition 1 | Output Transition 2 | | ----- | ----- | ----- | ----- | | Instrument Identifiers | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000BLNNH6\" } | { \"figi\" : \"BBG000HBGRF3\" } | | Units Factor | 1 | 1 | 3 | | Cost Factor | 1 | 0.85 | 0.15 |  ## Reference Portfolios Reference portfolios are portfolios that contain constituents with weights.  They are designed to represent entities such as indices and benchmarks.  ### Constituents | Field|Type|Description | | ---|---|--- | | InstrumentIdentifiers|map|Unique instrument identifiers | | InstrumentUid|string|LUSID's internal unique instrument identifier, resolved from the instrument identifiers | | Currency|decimal|  | | Weight|decimal|  | | FloatingWeight|decimal|  |   ## Portfolio Groups Portfolio groups allow the construction of a hierarchy from portfolios and groups.  Portfolio operations on the group are executed on an aggregated set of portfolios in the hierarchy.   For example:   * Global Portfolios _(group)_   * APAC _(group)_     * Hong Kong _(portfolio)_     * Japan _(portfolio)_   * Europe _(group)_     * France _(portfolio)_     * Germany _(portfolio)_   * UK _(portfolio)_   In this example **Global Portfolios** is a group that consists of an aggregate of **Hong Kong**, **Japan**, **France**, **Germany** and **UK** portfolios.  ## Properties  Properties are key-value pairs that can be applied to any entity within a domain (where a domain is `trade`, `portfolio`, `security` etc).  Properties must be defined before use with a `PropertyDefinition` and can then subsequently be added to entities.   ## Schema  A detailed description of the entities used by the API and parameters for endpoints which take a JSON document can be retrieved via the `schema` endpoint.  ## Meta data  The following headers are returned on all responses from LUSID  | Name | Purpose | | --- | --- | | lusid-meta-duration | Duration of the request | | lusid-meta-success | Whether or not LUSID considered the request to be successful | | lusid-meta-requestId | The unique identifier for the request | | lusid-schema-url | Url of the schema for the data being returned | | lusid-property-schema-url | Url of the schema for any properties |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | 
 *
 * The version of the OpenAPI document: 0.11.2154
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
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Portfolio;
import com.finbourne.lusid.model.PortfolioDetails;
import com.finbourne.lusid.model.ResourceListOfHoldingsAdjustmentHeader;
import com.finbourne.lusid.model.TransactionQueryParameters;
import com.finbourne.lusid.model.TransactionRequest;
import com.finbourne.lusid.model.UpsertPortfolioExecutionsResponse;
import com.finbourne.lusid.model.UpsertPortfolioTransactionsResponse;
import com.finbourne.lusid.model.UpsertTransactionPropertiesResponse;
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
     * Build call for adjustHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly adjusted holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adjustHoldingsCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = adjustHoldingRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (reconciliationMethods != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "reconciliationMethods", reconciliationMethods));
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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call adjustHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods, final ApiCallback _callback) throws ApiException {
        
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
        
        // verify the required parameter 'adjustHoldingRequest' is set
        if (adjustHoldingRequest == null) {
            throw new ApiException("Missing the required parameter 'adjustHoldingRequest' when calling adjustHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = adjustHoldingsCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, _callback);
        return localVarCall;

    }

    /**
     * Adjust holdings
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @return AdjustHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly adjusted holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AdjustHolding adjustHoldings(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods) throws ApiException {
        ApiResponse<AdjustHolding> localVarResp = adjustHoldingsWithHttpInfo(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods);
        return localVarResp.getData();
    }

    /**
     * Adjust holdings
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @return ApiResponse&lt;AdjustHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly adjusted holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdjustHolding> adjustHoldingsWithHttpInfo(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods) throws ApiException {
        okhttp3.Call localVarCall = adjustHoldingsValidateBeforeCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, null);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Adjust holdings (asynchronously)
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The selected set of holdings to adjust to the provided targets for the              transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly adjusted holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call adjustHoldingsAsync(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods, final ApiCallback<AdjustHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = adjustHoldingsValidateBeforeCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, _callback);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for buildTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call buildTransactionsCall(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactionQueryParameters;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/$build"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call buildTransactionsValidateBeforeCall(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling buildTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling buildTransactions(Async)");
        }
        
        // verify the required parameter 'transactionQueryParameters' is set
        if (transactionQueryParameters == null) {
            throw new ApiException("Missing the required parameter 'transactionQueryParameters' when calling buildTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = buildTransactionsCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * Build transactions
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @return VersionedResourceListOfOutputTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<VersionedResourceListOfOutputTransaction> localVarResp = buildTransactionsWithHttpInfo(scope, code, transactionQueryParameters, asAt, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * Build transactions
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfOutputTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfOutputTransaction> buildTransactionsWithHttpInfo(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = buildTransactionsValidateBeforeCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Build transactions (asynchronously)
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call buildTransactionsAsync(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback<VersionedResourceListOfOutputTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = buildTransactionsValidateBeforeCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for cancelAdjustHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holding adjustments should be undone. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the holding adjustments were cancelled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelAdjustHoldingsCall(String scope, String code, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

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
     * Cancel all previous holding adjustments made on the specified transaction portfolio for a specified effective  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holding adjustments should be undone. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the holding adjustments were cancelled </td><td>  -  </td></tr>
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
     * Cancel all previous holding adjustments made on the specified transaction portfolio for a specified effective  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holding adjustments should be undone. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the holding adjustments were cancelled </td><td>  -  </td></tr>
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
     * Cancel all previous holding adjustments made on the specified transaction portfolio for a specified effective  datetime. This should be used to undo holding adjustments made via set holdings or adjust holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holding adjustments should be undone. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the holding adjustments were cancelled </td><td>  -  </td></tr>
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
        <tr><td> 200 </td><td> The datetime that the executions were cancelled </td><td>  -  </td></tr>
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

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
     * [EARLY ACCESS] Cancel executions
     * Cancel one or more executions which exist in a specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the executions were cancelled </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse cancelExecutions(String scope, String code, List<String> executionIds) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = cancelExecutionsWithHttpInfo(scope, code, executionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] Cancel executions
     * Cancel one or more executions which exist in a specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the executions were cancelled </td><td>  -  </td></tr>
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
     * [EARLY ACCESS] Cancel executions (asynchronously)
     * Cancel one or more executions which exist in a specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionIds The ids of the executions to cancel. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the executions were cancelled </td><td>  -  </td></tr>
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
        <tr><td> 200 </td><td> The datetime that the transactions were cancelled </td><td>  -  </td></tr>
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

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
        <tr><td> 200 </td><td> The datetime that the transactions were cancelled </td><td>  -  </td></tr>
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
        <tr><td> 200 </td><td> The datetime that the transactions were cancelled </td><td>  -  </td></tr>
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
        <tr><td> 200 </td><td> The datetime that the transactions were cancelled </td><td>  -  </td></tr>
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
     * @param createTransactionPortfolioRequest The definition and details of the transaction portfolio. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioCall(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createTransactionPortfolioRequest;

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPortfolioValidateBeforeCall(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createPortfolio(Async)");
        }
        
        // verify the required parameter 'createTransactionPortfolioRequest' is set
        if (createTransactionPortfolioRequest == null) {
            throw new ApiException("Missing the required parameter 'createTransactionPortfolioRequest' when calling createPortfolio(Async)");
        }
        

        okhttp3.Call localVarCall = createPortfolioCall(scope, createTransactionPortfolioRequest, _callback);
        return localVarCall;

    }

    /**
     * Create portfolio
     * Create a transaction portfolio in a specific scope.
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createTransactionPortfolioRequest The definition and details of the transaction portfolio. (required)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest) throws ApiException {
        ApiResponse<Portfolio> localVarResp = createPortfolioWithHttpInfo(scope, createTransactionPortfolioRequest);
        return localVarResp.getData();
    }

    /**
     * Create portfolio
     * Create a transaction portfolio in a specific scope.
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createTransactionPortfolioRequest The definition and details of the transaction portfolio. (required)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Portfolio> createPortfolioWithHttpInfo(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest) throws ApiException {
        okhttp3.Call localVarCall = createPortfolioValidateBeforeCall(scope, createTransactionPortfolioRequest, null);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create portfolio (asynchronously)
     * Create a transaction portfolio in a specific scope.
     * @param scope The scope that the transaction portfolio will be created in. (required)
     * @param createTransactionPortfolioRequest The definition and details of the transaction portfolio. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioAsync(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest, final ApiCallback<Portfolio> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPortfolioValidateBeforeCall(scope, createTransactionPortfolioRequest, _callback);
        Type localVarReturnType = new TypeToken<Portfolio>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePropertiesFromTransaction
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param propertyKeys The property keys of the properties to delete from the transaction.              This must be from the \&quot;Transaction\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the property was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertiesFromTransactionCall(String scope, String code, String transactionId, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "transactionId" + "\\}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePropertiesFromTransactionValidateBeforeCall(String scope, String code, String transactionId, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deletePropertiesFromTransaction(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePropertiesFromTransaction(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling deletePropertiesFromTransaction(Async)");
        }
        
        // verify the required parameter 'propertyKeys' is set
        if (propertyKeys == null) {
            throw new ApiException("Missing the required parameter 'propertyKeys' when calling deletePropertiesFromTransaction(Async)");
        }
        

        okhttp3.Call localVarCall = deletePropertiesFromTransactionCall(scope, code, transactionId, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * Delete properties from transaction
     * Delete one or more property values from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param propertyKeys The property keys of the properties to delete from the transaction.              This must be from the \&quot;Transaction\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the property was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePropertiesFromTransaction(String scope, String code, String transactionId, List<String> propertyKeys) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePropertiesFromTransactionWithHttpInfo(scope, code, transactionId, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * Delete properties from transaction
     * Delete one or more property values from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param propertyKeys The property keys of the properties to delete from the transaction.              This must be from the \&quot;Transaction\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the property was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePropertiesFromTransactionWithHttpInfo(String scope, String code, String transactionId, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = deletePropertiesFromTransactionValidateBeforeCall(scope, code, transactionId, propertyKeys, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete properties from transaction (asynchronously)
     * Delete one or more property values from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to delete the property value from. (required)
     * @param propertyKeys The property keys of the properties to delete from the transaction.              This must be from the \&quot;Transaction\&quot; domain and will have the format {domain}/{scope}/{code} e.g.              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the property was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePropertiesFromTransactionAsync(String scope, String code, String transactionId, List<String> propertyKeys, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePropertiesFromTransactionValidateBeforeCall(scope, code, transactionId, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDetails
     * @param scope The scope of the transaction portfolio to retrieve the details for. (required)
     * @param code The code of the transaction portfolio to retrieve the details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to return the latest version of the details if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the specified transaction portfolio </td><td>  -  </td></tr>
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

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
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to return the latest version of the details if not specified. (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the specified transaction portfolio </td><td>  -  </td></tr>
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
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to return the latest version of the details if not specified. (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the specified transaction portfolio </td><td>  -  </td></tr>
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
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to return the latest version of the details if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the specified transaction portfolio </td><td>  -  </td></tr>
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
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = new Object();

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
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

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (byTaxlots != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("byTaxlots", byTaxlots));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getHoldings(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = getHoldingsCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, _callback);
        return localVarCall;

    }

    /**
     * Get holdings
     * Get the holdings of the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @return VersionedResourceListOfPortfolioHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfPortfolioHolding getHoldings(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots) throws ApiException {
        ApiResponse<VersionedResourceListOfPortfolioHolding> localVarResp = getHoldingsWithHttpInfo(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots);
        return localVarResp.getData();
    }

    /**
     * Get holdings
     * Get the holdings of the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfPortfolioHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfPortfolioHolding> getHoldingsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get holdings (asynchronously)
     * Get the holdings of the specified transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Holding\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, final ApiCallback<VersionedResourceListOfPortfolioHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHoldingsValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHoldingsAdjustment
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested holdings adjustment </td><td>  -  </td></tr>
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

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
     * Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @return HoldingsAdjustment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested holdings adjustment </td><td>  -  </td></tr>
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
     * Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @return ApiResponse&lt;HoldingsAdjustment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested holdings adjustment </td><td>  -  </td></tr>
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
     * Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The details of the requested holdings adjustment </td><td>  -  </td></tr>
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
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsValidateBeforeCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = getTransactionsCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, _callback);
        return localVarCall;

    }

    /**
     * Get transactions
     * Get transactions from the specified transaction portfolio over a given interval of effective time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.  The maximum number of transactions that this method can get per request is 2,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @return VersionedResourceListOfTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfTransaction getTransactions(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<VersionedResourceListOfTransaction> localVarResp = getTransactionsWithHttpInfo(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * Get transactions
     * Get transactions from the specified transaction portfolio over a given interval of effective time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.  The maximum number of transactions that this method can get per request is 2,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfTransaction> getTransactionsWithHttpInfo(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get transactions (asynchronously)
     * Get transactions from the specified transaction portfolio over a given interval of effective time.     When the specified portfolio is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.  The maximum number of transactions that this method can get per request is 2,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsAsync(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, final ApiCallback<VersionedResourceListOfTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listHoldingsAdjustments
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The record of holdings adjustments made to the specified transaction portfolio </td><td>  -  </td></tr>
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

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
     * List the holdings adjustments made to the specified transaction portfolio over a specified interval of effective time.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified. (optional)
     * @return ResourceListOfHoldingsAdjustmentHeader
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The record of holdings adjustments made to the specified transaction portfolio </td><td>  -  </td></tr>
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
     * List the holdings adjustments made to the specified transaction portfolio over a specified interval of effective time.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified. (optional)
     * @return ApiResponse&lt;ResourceListOfHoldingsAdjustmentHeader&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The record of holdings adjustments made to the specified transaction portfolio </td><td>  -  </td></tr>
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
     * List the holdings adjustments made to the specified transaction portfolio over a specified interval of effective time.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no lower bound if this is not specified. (optional)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the holdings              adjustments. There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustments. Defaults to return the              latest version of each holding adjustment if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The record of holdings adjustments made to the specified transaction portfolio </td><td>  -  </td></tr>
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
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The complete set of target holdings for the transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly set holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setHoldingsCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = adjustHoldingRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (reconciliationMethods != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "reconciliationMethods", reconciliationMethods));
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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods, final ApiCallback _callback) throws ApiException {
        
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
        
        // verify the required parameter 'adjustHoldingRequest' is set
        if (adjustHoldingRequest == null) {
            throw new ApiException("Missing the required parameter 'adjustHoldingRequest' when calling setHoldings(Async)");
        }
        

        okhttp3.Call localVarCall = setHoldingsCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, _callback);
        return localVarCall;

    }

    /**
     * Set holdings
     * Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The complete set of target holdings for the transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @return AdjustHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly set holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public AdjustHolding setHoldings(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods) throws ApiException {
        ApiResponse<AdjustHolding> localVarResp = setHoldingsWithHttpInfo(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods);
        return localVarResp.getData();
    }

    /**
     * Set holdings
     * Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The complete set of target holdings for the transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @return ApiResponse&lt;AdjustHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly set holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdjustHolding> setHoldingsWithHttpInfo(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods) throws ApiException {
        okhttp3.Call localVarCall = setHoldingsValidateBeforeCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, null);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set holdings (asynchronously)
     * Set the holdings of the specified transaction portfolio to the provided targets. LUSID will automatically  construct adjustment transactions to ensure that the entire set of holdings for the transaction portfolio  are always set to the provided targets for the specified effective datetime. Read more about the difference between  adjusting and setting holdings here https://support.lusid.com/how-do-i-adjust-my-holdings.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the holdings should be set to the provided targets. (required)
     * @param adjustHoldingRequest The complete set of target holdings for the transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly set holdings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setHoldingsAsync(String scope, String code, String effectiveAt, List<AdjustHoldingRequest> adjustHoldingRequest, List<String> reconciliationMethods, final ApiCallback<AdjustHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = setHoldingsValidateBeforeCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, _callback);
        Type localVarReturnType = new TypeToken<AdjustHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertExecutions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionRequest The executions to update or insert. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted executions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertExecutionsCall(String scope, String code, List<ExecutionRequest> executionRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = executionRequest;

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertExecutionsValidateBeforeCall(String scope, String code, List<ExecutionRequest> executionRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertExecutions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertExecutions(Async)");
        }
        

        okhttp3.Call localVarCall = upsertExecutionsCall(scope, code, executionRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] Upsert executions
     * Update or insert executions into the specified transaction portfolio. An execution will be updated  if it already exists and inserted if it does not.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionRequest The executions to update or insert. (optional)
     * @return UpsertPortfolioExecutionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted executions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertPortfolioExecutionsResponse upsertExecutions(String scope, String code, List<ExecutionRequest> executionRequest) throws ApiException {
        ApiResponse<UpsertPortfolioExecutionsResponse> localVarResp = upsertExecutionsWithHttpInfo(scope, code, executionRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] Upsert executions
     * Update or insert executions into the specified transaction portfolio. An execution will be updated  if it already exists and inserted if it does not.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionRequest The executions to update or insert. (optional)
     * @return ApiResponse&lt;UpsertPortfolioExecutionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted executions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertPortfolioExecutionsResponse> upsertExecutionsWithHttpInfo(String scope, String code, List<ExecutionRequest> executionRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertExecutionsValidateBeforeCall(scope, code, executionRequest, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioExecutionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] Upsert executions (asynchronously)
     * Update or insert executions into the specified transaction portfolio. An execution will be updated  if it already exists and inserted if it does not.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param executionRequest The executions to update or insert. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted executions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertExecutionsAsync(String scope, String code, List<ExecutionRequest> executionRequest, final ApiCallback<UpsertPortfolioExecutionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertExecutionsValidateBeforeCall(scope, code, executionRequest, _callback);
        Type localVarReturnType = new TypeToken<UpsertPortfolioExecutionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertPortfolioDetails
     * @param scope The scope of the transaction portfolio to update or insert details for. (required)
     * @param code The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to update or insert for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly updated or inserted details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPortfolioDetailsCall(String scope, String code, CreatePortfolioDetails createPortfolioDetails, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createPortfolioDetails;

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertPortfolioDetailsValidateBeforeCall(String scope, String code, CreatePortfolioDetails createPortfolioDetails, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertPortfolioDetails(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertPortfolioDetails(Async)");
        }
        
        // verify the required parameter 'createPortfolioDetails' is set
        if (createPortfolioDetails == null) {
            throw new ApiException("Missing the required parameter 'createPortfolioDetails' when calling upsertPortfolioDetails(Async)");
        }
        

        okhttp3.Call localVarCall = upsertPortfolioDetailsCall(scope, code, createPortfolioDetails, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * Upsert portfolio details
     * Update or insert details for the specified transaction portfolio. The details will be updated  if they already exist and inserted if they do not.
     * @param scope The scope of the transaction portfolio to update or insert details for. (required)
     * @param code The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to update or insert for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly updated or inserted details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioDetails upsertPortfolioDetails(String scope, String code, CreatePortfolioDetails createPortfolioDetails, String effectiveAt) throws ApiException {
        ApiResponse<PortfolioDetails> localVarResp = upsertPortfolioDetailsWithHttpInfo(scope, code, createPortfolioDetails, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * Upsert portfolio details
     * Update or insert details for the specified transaction portfolio. The details will be updated  if they already exist and inserted if they do not.
     * @param scope The scope of the transaction portfolio to update or insert details for. (required)
     * @param code The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to update or insert for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly updated or inserted details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioDetails> upsertPortfolioDetailsWithHttpInfo(String scope, String code, CreatePortfolioDetails createPortfolioDetails, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = upsertPortfolioDetailsValidateBeforeCall(scope, code, createPortfolioDetails, effectiveAt, null);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert portfolio details (asynchronously)
     * Update or insert details for the specified transaction portfolio. The details will be updated  if they already exist and inserted if they do not.
     * @param scope The scope of the transaction portfolio to update or insert details for. (required)
     * @param code The code of the transaction portfolio to update or insert details for. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to update or insert for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly updated or inserted details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPortfolioDetailsAsync(String scope, String code, CreatePortfolioDetails createPortfolioDetails, String effectiveAt, final ApiCallback<PortfolioDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertPortfolioDetailsValidateBeforeCall(scope, code, createPortfolioDetails, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertTransactionProperties
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to update or insert properties against. (required)
     * @param requestBody The properties with their associated values to update or insert onto the              transaction. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transaction property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertTransactionPropertiesCall(String scope, String code, String transactionId, Map<String, PerpetualProperty> requestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertTransactionPropertiesValidateBeforeCall(String scope, String code, String transactionId, Map<String, PerpetualProperty> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertTransactionProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertTransactionProperties(Async)");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling upsertTransactionProperties(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling upsertTransactionProperties(Async)");
        }
        

        okhttp3.Call localVarCall = upsertTransactionPropertiesCall(scope, code, transactionId, requestBody, _callback);
        return localVarCall;

    }

    /**
     * Upsert transaction properties
     * Update or insert one or more transaction properties to a single transaction in a transaction portfolio.  Each property will be updated if it already exists and inserted if it does not.  Both transaction and portfolio must exist at the time when properties are updated or inserted.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to update or insert properties against. (required)
     * @param requestBody The properties with their associated values to update or insert onto the              transaction. (required)
     * @return UpsertTransactionPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transaction property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertTransactionPropertiesResponse upsertTransactionProperties(String scope, String code, String transactionId, Map<String, PerpetualProperty> requestBody) throws ApiException {
        ApiResponse<UpsertTransactionPropertiesResponse> localVarResp = upsertTransactionPropertiesWithHttpInfo(scope, code, transactionId, requestBody);
        return localVarResp.getData();
    }

    /**
     * Upsert transaction properties
     * Update or insert one or more transaction properties to a single transaction in a transaction portfolio.  Each property will be updated if it already exists and inserted if it does not.  Both transaction and portfolio must exist at the time when properties are updated or inserted.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to update or insert properties against. (required)
     * @param requestBody The properties with their associated values to update or insert onto the              transaction. (required)
     * @return ApiResponse&lt;UpsertTransactionPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transaction property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertTransactionPropertiesResponse> upsertTransactionPropertiesWithHttpInfo(String scope, String code, String transactionId, Map<String, PerpetualProperty> requestBody) throws ApiException {
        okhttp3.Call localVarCall = upsertTransactionPropertiesValidateBeforeCall(scope, code, transactionId, requestBody, null);
        Type localVarReturnType = new TypeToken<UpsertTransactionPropertiesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert transaction properties (asynchronously)
     * Update or insert one or more transaction properties to a single transaction in a transaction portfolio.  Each property will be updated if it already exists and inserted if it does not.  Both transaction and portfolio must exist at the time when properties are updated or inserted.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique id of the transaction to update or insert properties against. (required)
     * @param requestBody The properties with their associated values to update or insert onto the              transaction. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transaction property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertTransactionPropertiesAsync(String scope, String code, String transactionId, Map<String, PerpetualProperty> requestBody, final ApiCallback<UpsertTransactionPropertiesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertTransactionPropertiesValidateBeforeCall(scope, code, transactionId, requestBody, _callback);
        Type localVarReturnType = new TypeToken<UpsertTransactionPropertiesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest The transactions to be updated or inserted. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertTransactionsCall(String scope, String code, List<TransactionRequest> transactionRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactionRequest;

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
            "application/json-patch+json", "application/json", "text/json", "application/_*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.2154");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertTransactionsValidateBeforeCall(String scope, String code, List<TransactionRequest> transactionRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertTransactions(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertTransactions(Async)");
        }
        
        // verify the required parameter 'transactionRequest' is set
        if (transactionRequest == null) {
            throw new ApiException("Missing the required parameter 'transactionRequest' when calling upsertTransactions(Async)");
        }
        

        okhttp3.Call localVarCall = upsertTransactionsCall(scope, code, transactionRequest, _callback);
        return localVarCall;

    }

    /**
     * Upsert transactions
     * Update or insert transactions into the specified transaction portfolio. A transaction will be updated  if it already exists and inserted if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest The transactions to be updated or inserted. (required)
     * @return UpsertPortfolioTransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertPortfolioTransactionsResponse upsertTransactions(String scope, String code, List<TransactionRequest> transactionRequest) throws ApiException {
        ApiResponse<UpsertPortfolioTransactionsResponse> localVarResp = upsertTransactionsWithHttpInfo(scope, code, transactionRequest);
        return localVarResp.getData();
    }

    /**
     * Upsert transactions
     * Update or insert transactions into the specified transaction portfolio. A transaction will be updated  if it already exists and inserted if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest The transactions to be updated or inserted. (required)
     * @return ApiResponse&lt;UpsertPortfolioTransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertPortfolioTransactionsResponse> upsertTransactionsWithHttpInfo(String scope, String code, List<TransactionRequest> transactionRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertTransactionsValidateBeforeCall(scope, code, transactionRequest, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert transactions (asynchronously)
     * Update or insert transactions into the specified transaction portfolio. A transaction will be updated  if it already exists and inserted if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest The transactions to be updated or inserted. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The version of the transaction portfolio that contains the newly updated or inserted transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertTransactionsAsync(String scope, String code, List<TransactionRequest> transactionRequest, final ApiCallback<UpsertPortfolioTransactionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertTransactionsValidateBeforeCall(scope, code, transactionRequest, _callback);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
