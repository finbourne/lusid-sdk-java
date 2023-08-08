/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](../../../api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application   | Description                                                                       | API / Swagger Documentation                          | |---------------|-----------------------------------------------------------------------------------|------------------------------------------------------| | LUSID         | Open, API-first, developer-friendly investment data platform.                     | [Swagger](../../../api/swagger/index.html)           | | Web app       | User-facing front end for LUSID.                                                  | [Swagger](../../../app/swagger/index.html)           | | Scheduler     | Automated job scheduler.                                                          | [Swagger](../../../scheduler2/swagger/index.html)    | | Insights      | Monitoring and troubleshooting service.                                           | [Swagger](../../../insights/swagger/index.html)      | | Identity      | Identity management for LUSID (in conjunction with Access)                        | [Swagger](../../../identity/swagger/index.html)      | | Access        | Access control for LUSID (in conjunction with Identity)                           | [Swagger](../../../access/swagger/index.html)        | | Drive         | Secure file repository and manager for collaboration.                             | [Swagger](../../../drive/swagger/index.html)         | | Luminesce     | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](../../../honeycomb/swagger/index.html)     | | Notification  | Notification service.                                                             | [Swagger](../../../notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information.                           | [Swagger](../../../configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"172\">172</a>|Entity With Id Does Not Exist|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"795\">795</a>|Cannot delete identifier definition|  | | <a name=\"796\">796</a>|Tax rule set not found.|  | | <a name=\"797\">797</a>|A tax rule set with this id already exists.|  | | <a name=\"798\">798</a>|Multiple rule sets for the same property key are applicable.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | | <a name=\"811\">811</a>|A price could not be found for an order.|  | | <a name=\"812\">812</a>|A price could not be found for an allocation.|  | | <a name=\"813\">813</a>|Chart of Accounts not found.|  | | <a name=\"814\">814</a>|Account not found.|  | | <a name=\"815\">815</a>|Abor not found.|  | | <a name=\"816\">816</a>|Abor Configuration not found.|  | | <a name=\"817\">817</a>|Reconciliation mapping not found|  | | <a name=\"818\">818</a>|Attribute type could not be deleted because it doesn't exist.|  | | <a name=\"819\">819</a>|Reconciliation not found.|  | | <a name=\"820\">820</a>|Custodian Account not found.|  | | <a name=\"821\">821</a>|Allocation Failure|  | | <a name=\"822\">822</a>|Reconciliation run not found|  | | <a name=\"823\">823</a>|Reconciliation break not found|  | | <a name=\"824\">824</a>|Entity link type could not be deleted because it doesn't exist.|  | | <a name=\"828\">828</a>|Address key definition not found.|  | | <a name=\"829\">829</a>|Compliance template not found.|  | | <a name=\"830\">830</a>|Action not supported|  | | <a name=\"831\">831</a>|Reference list not found.|  | | <a name=\"832\">832</a>|Posting Module not found.|  | | <a name=\"833\">833</a>|The type of parameter provided did not match that required by the compliance rule.|  | | <a name=\"834\">834</a>|The parameters provided by a rule did not match those required by its template.|  | | <a name=\"835\">835</a>|PostingModuleRule has a not allowed Property Domain.|  | | <a name=\"836\">836</a>|Structured result data not found.|  | | <a name=\"837\">837</a>|Diary entry not found.|  | | <a name=\"838\">838</a>|Diary entry could not be created.|  | | <a name=\"839\">839</a>|Diary entry already exists.|  | | <a name=\"861\">861</a>|Compliance run summary not found.|  | 
 *
 * The version of the OpenAPI document: 0.11.5728
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
import com.finbourne.lusid.model.AdjustHoldingForDateRequest;
import com.finbourne.lusid.model.AdjustHoldingRequest;
import com.finbourne.lusid.model.BatchAdjustHoldingsResponse;
import com.finbourne.lusid.model.BatchUpsertPortfolioTransactionsResponse;
import com.finbourne.lusid.model.BucketedCashFlowRequest;
import com.finbourne.lusid.model.BucketedCashFlowResponse;
import com.finbourne.lusid.model.CreatePortfolioDetails;
import com.finbourne.lusid.model.CreateTransactionPortfolioRequest;
import com.finbourne.lusid.model.CustodianAccount;
import com.finbourne.lusid.model.CustodianAccountProperties;
import com.finbourne.lusid.model.CustodianAccountRequest;
import com.finbourne.lusid.model.CustodianAccountsUpsertResponse;
import com.finbourne.lusid.model.DeleteCustodianAccountsResponse;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.HoldingsAdjustment;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidTradeTicket;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.Operation;
import com.finbourne.lusid.model.PagedResourceListOfCustodianAccount;
import com.finbourne.lusid.model.PerpetualProperty;
import com.finbourne.lusid.model.Portfolio;
import com.finbourne.lusid.model.PortfolioDetails;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.ResourceListOfChangeHistory;
import com.finbourne.lusid.model.ResourceListOfHoldingsAdjustmentHeader;
import com.finbourne.lusid.model.ResourceListOfInstrumentCashFlow;
import com.finbourne.lusid.model.ResourceListOfPortfolioCashFlow;
import com.finbourne.lusid.model.ResourceListOfPortfolioCashLadder;
import com.finbourne.lusid.model.ResourceListOfTransaction;
import com.finbourne.lusid.model.TransactionQueryParameters;
import com.finbourne.lusid.model.TransactionRequest;
import com.finbourne.lusid.model.UpsertPortfolioTransactionsResponse;
import com.finbourne.lusid.model.UpsertTransactionPropertiesResponse;
import com.finbourne.lusid.model.VersionedResourceListOfA2BDataRecord;
import com.finbourne.lusid.model.VersionedResourceListOfA2BMovementRecord;
import com.finbourne.lusid.model.VersionedResourceListOfOutputTransaction;
import com.finbourne.lusid.model.VersionedResourceListOfPortfolioHolding;
import com.finbourne.lusid.model.VersionedResourceListOfTransaction;
import com.finbourne.lusid.model.VersionedResourceListWithWarningsOfPortfolioHolding;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionPortfoliosApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

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

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = adjustHoldingRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (reconciliationMethods != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "reconciliationMethods", reconciliationMethods));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return adjustHoldingsCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, _callback);

    }

    /**
     * AdjustHoldings: Adjust holdings
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
     * AdjustHoldings: Adjust holdings
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
     * AdjustHoldings: Adjust holdings (asynchronously)
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
     * Build call for batchAdjustHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The selected set of holdings to adjust to the provided targets for the               transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successful AdjustHolding requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchAdjustHoldingsCall(String scope, String code, String successMode, Map<String, AdjustHoldingForDateRequest> requestBody, List<String> reconciliationMethods, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/$batchAdjust"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successMode", successMode));
        }

        if (reconciliationMethods != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "reconciliationMethods", reconciliationMethods));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchAdjustHoldingsValidateBeforeCall(String scope, String code, String successMode, Map<String, AdjustHoldingForDateRequest> requestBody, List<String> reconciliationMethods, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling batchAdjustHoldings(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling batchAdjustHoldings(Async)");
        }

        // verify the required parameter 'successMode' is set
        if (successMode == null) {
            throw new ApiException("Missing the required parameter 'successMode' when calling batchAdjustHoldings(Async)");
        }

        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling batchAdjustHoldings(Async)");
        }

        return batchAdjustHoldingsCall(scope, code, successMode, requestBody, reconciliationMethods, _callback);

    }

    /**
     * [EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime in each request.                Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each adjustment in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The selected set of holdings to adjust to the provided targets for the               transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @return BatchAdjustHoldingsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successful AdjustHolding requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public BatchAdjustHoldingsResponse batchAdjustHoldings(String scope, String code, String successMode, Map<String, AdjustHoldingForDateRequest> requestBody, List<String> reconciliationMethods) throws ApiException {
        ApiResponse<BatchAdjustHoldingsResponse> localVarResp = batchAdjustHoldingsWithHttpInfo(scope, code, successMode, requestBody, reconciliationMethods);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime in each request.                Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each adjustment in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The selected set of holdings to adjust to the provided targets for the               transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @return ApiResponse&lt;BatchAdjustHoldingsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successful AdjustHolding requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchAdjustHoldingsResponse> batchAdjustHoldingsWithHttpInfo(String scope, String code, String successMode, Map<String, AdjustHoldingForDateRequest> requestBody, List<String> reconciliationMethods) throws ApiException {
        okhttp3.Call localVarCall = batchAdjustHoldingsValidateBeforeCall(scope, code, successMode, requestBody, reconciliationMethods, null);
        Type localVarReturnType = new TypeToken<BatchAdjustHoldingsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] BatchAdjustHoldings: Batch adjust holdings (asynchronously)
     * Adjust one or more holdings of the specified transaction portfolio to the provided targets. LUSID will  automatically construct adjustment transactions to ensure that the holdings which have been adjusted are  always set to the provided targets for the specified effective datetime in each request.                Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each adjustment in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The selected set of holdings to adjust to the provided targets for the               transaction portfolio. (required)
     * @param reconciliationMethods Optional parameter for specifying a reconciliation method: e.g. FxForward. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successful AdjustHolding requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchAdjustHoldingsAsync(String scope, String code, String successMode, Map<String, AdjustHoldingForDateRequest> requestBody, List<String> reconciliationMethods, final ApiCallback<BatchAdjustHoldingsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchAdjustHoldingsValidateBeforeCall(scope, code, successMode, requestBody, reconciliationMethods, _callback);
        Type localVarReturnType = new TypeToken<BatchAdjustHoldingsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for batchUpsertTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. (required)
     * @param requestBody The payload describing the transactions to be created or updated. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully upserted transaction requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchUpsertTransactionsCall(String scope, String code, String successMode, Map<String, TransactionRequest> requestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/$batchUpsert"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successMode", successMode));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call batchUpsertTransactionsValidateBeforeCall(String scope, String code, String successMode, Map<String, TransactionRequest> requestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling batchUpsertTransactions(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling batchUpsertTransactions(Async)");
        }

        // verify the required parameter 'successMode' is set
        if (successMode == null) {
            throw new ApiException("Missing the required parameter 'successMode' when calling batchUpsertTransactions(Async)");
        }

        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling batchUpsertTransactions(Async)");
        }

        return batchUpsertTransactionsCall(scope, code, successMode, requestBody, _callback);

    }

    /**
     * [EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions
     * Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.    Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each transaction in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. (required)
     * @param requestBody The payload describing the transactions to be created or updated. (required)
     * @return BatchUpsertPortfolioTransactionsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully upserted transaction requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public BatchUpsertPortfolioTransactionsResponse batchUpsertTransactions(String scope, String code, String successMode, Map<String, TransactionRequest> requestBody) throws ApiException {
        ApiResponse<BatchUpsertPortfolioTransactionsResponse> localVarResp = batchUpsertTransactionsWithHttpInfo(scope, code, successMode, requestBody);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions
     * Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.    Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each transaction in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. (required)
     * @param requestBody The payload describing the transactions to be created or updated. (required)
     * @return ApiResponse&lt;BatchUpsertPortfolioTransactionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully upserted transaction requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BatchUpsertPortfolioTransactionsResponse> batchUpsertTransactionsWithHttpInfo(String scope, String code, String successMode, Map<String, TransactionRequest> requestBody) throws ApiException {
        okhttp3.Call localVarCall = batchUpsertTransactionsValidateBeforeCall(scope, code, successMode, requestBody, null);
        Type localVarReturnType = new TypeToken<BatchUpsertPortfolioTransactionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] BatchUpsertTransactions: Batch upsert transactions (asynchronously)
     * Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.    Each request must be keyed by a unique correlation id. This id is ephemeral and is not stored by LUSID.  It serves only as a way to easily identify each transaction in the response.    Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial. (required)
     * @param requestBody The payload describing the transactions to be created or updated. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully upserted transaction requests along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call batchUpsertTransactionsAsync(String scope, String code, String successMode, Map<String, TransactionRequest> requestBody, final ApiCallback<BatchUpsertPortfolioTransactionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchUpsertTransactionsValidateBeforeCall(scope, code, successMode, requestBody, _callback);
        Type localVarReturnType = new TypeToken<BatchUpsertPortfolioTransactionsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for buildTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
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
    public okhttp3.Call buildTransactionsCall(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = transactionQueryParameters;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/$build"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call buildTransactionsValidateBeforeCall(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, final ApiCallback _callback) throws ApiException {
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

        return buildTransactionsCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, _callback);

    }

    /**
     * BuildTransactions: Build transactions
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
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
    public VersionedResourceListOfOutputTransaction buildTransactions(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page) throws ApiException {
        ApiResponse<VersionedResourceListOfOutputTransaction> localVarResp = buildTransactionsWithHttpInfo(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page);
        return localVarResp.getData();
    }

    /**
     * BuildTransactions: Build transactions
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
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
    public ApiResponse<VersionedResourceListOfOutputTransaction> buildTransactionsWithHttpInfo(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page) throws ApiException {
        okhttp3.Call localVarCall = buildTransactionsValidateBeforeCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * BuildTransactions: Build transactions (asynchronously)
     * Builds and returns all transactions that affect the holdings of a portfolio over a given interval of  effective time into a set of output transactions. This includes transactions automatically generated by  LUSID such as holding adjustments.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest              version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto              the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or              \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
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
    public okhttp3.Call buildTransactionsAsync(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, final ApiCallback<VersionedResourceListOfOutputTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = buildTransactionsValidateBeforeCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, _callback);
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return cancelAdjustHoldingsCall(scope, code, effectiveAt, _callback);

    }

    /**
     * CancelAdjustHoldings: Cancel adjust holdings
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
     * CancelAdjustHoldings: Cancel adjust holdings
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
     * CancelAdjustHoldings: Cancel adjust holdings (asynchronously)
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
     * Build call for cancelTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The IDs of the transactions to cancel. (required)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (transactionIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "transactionIds", transactionIds));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return cancelTransactionsCall(scope, code, transactionIds, _callback);

    }

    /**
     * CancelTransactions: Cancel transactions
     * Cancel one or more transactions from the transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The IDs of the transactions to cancel. (required)
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
     * CancelTransactions: Cancel transactions
     * Cancel one or more transactions from the transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The IDs of the transactions to cancel. (required)
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
     * CancelTransactions: Cancel transactions (asynchronously)
     * Cancel one or more transactions from the transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionIds The IDs of the transactions to cancel. (required)
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
     * @param scope The scope in which to create the transaction portfolio. (required)
     * @param createTransactionPortfolioRequest The definition of the transaction portfolio. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly-created transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioCall(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createTransactionPortfolioRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return createPortfolioCall(scope, createTransactionPortfolioRequest, _callback);

    }

    /**
     * CreatePortfolio: Create portfolio
     * Create a transaction portfolio in a particular scope.
     * @param scope The scope in which to create the transaction portfolio. (required)
     * @param createTransactionPortfolioRequest The definition of the transaction portfolio. (required)
     * @return Portfolio
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly-created transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Portfolio createPortfolio(String scope, CreateTransactionPortfolioRequest createTransactionPortfolioRequest) throws ApiException {
        ApiResponse<Portfolio> localVarResp = createPortfolioWithHttpInfo(scope, createTransactionPortfolioRequest);
        return localVarResp.getData();
    }

    /**
     * CreatePortfolio: Create portfolio
     * Create a transaction portfolio in a particular scope.
     * @param scope The scope in which to create the transaction portfolio. (required)
     * @param createTransactionPortfolioRequest The definition of the transaction portfolio. (required)
     * @return ApiResponse&lt;Portfolio&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly-created transaction portfolio </td><td>  -  </td></tr>
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
     * CreatePortfolio: Create portfolio (asynchronously)
     * Create a transaction portfolio in a particular scope.
     * @param scope The scope in which to create the transaction portfolio. (required)
     * @param createTransactionPortfolioRequest The definition of the transaction portfolio. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly-created transaction portfolio </td><td>  -  </td></tr>
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
     * Build call for createTradeTicket
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param lusidTradeTicket the trade ticket to upsert (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created trade ticket, possibly populated with created LUID and identifiers if missing on the request. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTradeTicketCall(String scope, String code, LusidTradeTicket lusidTradeTicket, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = lusidTradeTicket;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/$tradeticket"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTradeTicketValidateBeforeCall(String scope, String code, LusidTradeTicket lusidTradeTicket, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createTradeTicket(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling createTradeTicket(Async)");
        }

        return createTradeTicketCall(scope, code, lusidTradeTicket, _callback);

    }

    /**
     * [EXPERIMENTAL] CreateTradeTicket: Create Trade Ticket
     * Upsert a trade ticket. This is broadly equivalent to a singular call to upsert an instrument, then a counterparty and finally  a transaction that makes use of the two. It can be viewed as a utility function or part of a workflow more familiar to users  with OTC systems than flow and equity trading ones.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param lusidTradeTicket the trade ticket to upsert (optional)
     * @return LusidTradeTicket
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created trade ticket, possibly populated with created LUID and identifiers if missing on the request. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public LusidTradeTicket createTradeTicket(String scope, String code, LusidTradeTicket lusidTradeTicket) throws ApiException {
        ApiResponse<LusidTradeTicket> localVarResp = createTradeTicketWithHttpInfo(scope, code, lusidTradeTicket);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] CreateTradeTicket: Create Trade Ticket
     * Upsert a trade ticket. This is broadly equivalent to a singular call to upsert an instrument, then a counterparty and finally  a transaction that makes use of the two. It can be viewed as a utility function or part of a workflow more familiar to users  with OTC systems than flow and equity trading ones.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param lusidTradeTicket the trade ticket to upsert (optional)
     * @return ApiResponse&lt;LusidTradeTicket&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created trade ticket, possibly populated with created LUID and identifiers if missing on the request. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LusidTradeTicket> createTradeTicketWithHttpInfo(String scope, String code, LusidTradeTicket lusidTradeTicket) throws ApiException {
        okhttp3.Call localVarCall = createTradeTicketValidateBeforeCall(scope, code, lusidTradeTicket, null);
        Type localVarReturnType = new TypeToken<LusidTradeTicket>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] CreateTradeTicket: Create Trade Ticket (asynchronously)
     * Upsert a trade ticket. This is broadly equivalent to a singular call to upsert an instrument, then a counterparty and finally  a transaction that makes use of the two. It can be viewed as a utility function or part of a workflow more familiar to users  with OTC systems than flow and equity trading ones.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param lusidTradeTicket the trade ticket to upsert (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created trade ticket, possibly populated with created LUID and identifiers if missing on the request. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTradeTicketAsync(String scope, String code, LusidTradeTicket lusidTradeTicket, final ApiCallback<LusidTradeTicket> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTradeTicketValidateBeforeCall(scope, code, lusidTradeTicket, _callback);
        Type localVarReturnType = new TypeToken<LusidTradeTicket>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCustodianAccounts
     * @param scope The scope of the Transaction Portfolios. (required)
     * @param code The code of the Transaction Portfolios. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param resourceId The scope and codes of the custodian accounts to delete. (required)
     * @param deleteMode The delete mode to use (defaults to &#39;Soft&#39;). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the custodian accounts were deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCustodianAccountsCall(String scope, String code, List<ResourceId> resourceId, String deleteMode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = resourceId;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/custodianaccounts/$delete"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (deleteMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deleteMode", deleteMode));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCustodianAccountsValidateBeforeCall(String scope, String code, List<ResourceId> resourceId, String deleteMode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteCustodianAccounts(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteCustodianAccounts(Async)");
        }

        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling deleteCustodianAccounts(Async)");
        }

        return deleteCustodianAccountsCall(scope, code, resourceId, deleteMode, _callback);

    }

    /**
     * [EXPERIMENTAL] DeleteCustodianAccounts: Soft or hard delete multiple custodian accounts
     * Delete one or more custodian accounts from the Transaction Portfolios. Soft deletion marks the custodian account as inactive  While the Hard deletion is deleting the custodian account.  The batch limit per request is 2,000.
     * @param scope The scope of the Transaction Portfolios. (required)
     * @param code The code of the Transaction Portfolios. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param resourceId The scope and codes of the custodian accounts to delete. (required)
     * @param deleteMode The delete mode to use (defaults to &#39;Soft&#39;). (optional)
     * @return DeleteCustodianAccountsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the custodian accounts were deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeleteCustodianAccountsResponse deleteCustodianAccounts(String scope, String code, List<ResourceId> resourceId, String deleteMode) throws ApiException {
        ApiResponse<DeleteCustodianAccountsResponse> localVarResp = deleteCustodianAccountsWithHttpInfo(scope, code, resourceId, deleteMode);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] DeleteCustodianAccounts: Soft or hard delete multiple custodian accounts
     * Delete one or more custodian accounts from the Transaction Portfolios. Soft deletion marks the custodian account as inactive  While the Hard deletion is deleting the custodian account.  The batch limit per request is 2,000.
     * @param scope The scope of the Transaction Portfolios. (required)
     * @param code The code of the Transaction Portfolios. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param resourceId The scope and codes of the custodian accounts to delete. (required)
     * @param deleteMode The delete mode to use (defaults to &#39;Soft&#39;). (optional)
     * @return ApiResponse&lt;DeleteCustodianAccountsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the custodian accounts were deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteCustodianAccountsResponse> deleteCustodianAccountsWithHttpInfo(String scope, String code, List<ResourceId> resourceId, String deleteMode) throws ApiException {
        okhttp3.Call localVarCall = deleteCustodianAccountsValidateBeforeCall(scope, code, resourceId, deleteMode, null);
        Type localVarReturnType = new TypeToken<DeleteCustodianAccountsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] DeleteCustodianAccounts: Soft or hard delete multiple custodian accounts (asynchronously)
     * Delete one or more custodian accounts from the Transaction Portfolios. Soft deletion marks the custodian account as inactive  While the Hard deletion is deleting the custodian account.  The batch limit per request is 2,000.
     * @param scope The scope of the Transaction Portfolios. (required)
     * @param code The code of the Transaction Portfolios. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param resourceId The scope and codes of the custodian accounts to delete. (required)
     * @param deleteMode The delete mode to use (defaults to &#39;Soft&#39;). (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the custodian accounts were deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCustodianAccountsAsync(String scope, String code, List<ResourceId> resourceId, String deleteMode, final ApiCallback<DeleteCustodianAccountsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCustodianAccountsValidateBeforeCall(scope, code, resourceId, deleteMode, _callback);
        Type localVarReturnType = new TypeToken<DeleteCustodianAccountsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePropertiesFromTransaction
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction from which to delete properties. (required)
     * @param propertyKeys The property keys of the properties to delete.              These must be from the \&quot;Transaction\&quot; domain and have the format {domain}/{scope}/{code}, for example              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "transactionId" + "}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return deletePropertiesFromTransactionCall(scope, code, transactionId, propertyKeys, _callback);

    }

    /**
     * DeletePropertiesFromTransaction: Delete properties from transaction
     * Delete one or more properties from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction from which to delete properties. (required)
     * @param propertyKeys The property keys of the properties to delete.              These must be from the \&quot;Transaction\&quot; domain and have the format {domain}/{scope}/{code}, for example              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
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
     * DeletePropertiesFromTransaction: Delete properties from transaction
     * Delete one or more properties from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction from which to delete properties. (required)
     * @param propertyKeys The property keys of the properties to delete.              These must be from the \&quot;Transaction\&quot; domain and have the format {domain}/{scope}/{code}, for example              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
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
     * DeletePropertiesFromTransaction: Delete properties from transaction (asynchronously)
     * Delete one or more properties from a single transaction in a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction from which to delete properties. (required)
     * @param propertyKeys The property keys of the properties to delete.              These must be from the \&quot;Transaction\&quot; domain and have the format {domain}/{scope}/{code}, for example              \&quot;Transaction/strategy/quantsignal\&quot;. (required)
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
     * Build call for getA2BData
     * @param scope The scope of the portfolio to retrieve the A2B report for. (required)
     * @param code The code of the portfolio to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getA2BDataCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/a2b"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (toEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getA2BDataValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getA2BData(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getA2BData(Async)");
        }

        // verify the required parameter 'fromEffectiveAt' is set
        if (fromEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'fromEffectiveAt' when calling getA2BData(Async)");
        }

        // verify the required parameter 'toEffectiveAt' is set
        if (toEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'toEffectiveAt' when calling getA2BData(Async)");
        }

        return getA2BDataCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, _callback);

    }

    /**
     * GetA2BData: Get A2B data
     * Get an A2B report for the given portfolio.
     * @param scope The scope of the portfolio to retrieve the A2B report for. (required)
     * @param code The code of the portfolio to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return VersionedResourceListOfA2BDataRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfA2BDataRecord getA2BData(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter) throws ApiException {
        ApiResponse<VersionedResourceListOfA2BDataRecord> localVarResp = getA2BDataWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter);
        return localVarResp.getData();
    }

    /**
     * GetA2BData: Get A2B data
     * Get an A2B report for the given portfolio.
     * @param scope The scope of the portfolio to retrieve the A2B report for. (required)
     * @param code The code of the portfolio to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfA2BDataRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfA2BDataRecord> getA2BDataWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter) throws ApiException {
        okhttp3.Call localVarCall = getA2BDataValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfA2BDataRecord>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetA2BData: Get A2B data (asynchronously)
     * Get an A2B report for the given portfolio.
     * @param scope The scope of the portfolio to retrieve the A2B report for. (required)
     * @param code The code of the portfolio to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getA2BDataAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback<VersionedResourceListOfA2BDataRecord> _callback) throws ApiException {

        okhttp3.Call localVarCall = getA2BDataValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfA2BDataRecord>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getA2BMovements
     * @param scope The scope of the portfolio to retrieve the A2B movement report for. (required)
     * @param code The code of the portfolio to retrieve the A2B movement report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B movement data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getA2BMovementsCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/a2bmovements"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (toEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getA2BMovementsValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getA2BMovements(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getA2BMovements(Async)");
        }

        // verify the required parameter 'fromEffectiveAt' is set
        if (fromEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'fromEffectiveAt' when calling getA2BMovements(Async)");
        }

        // verify the required parameter 'toEffectiveAt' is set
        if (toEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'toEffectiveAt' when calling getA2BMovements(Async)");
        }

        return getA2BMovementsCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, _callback);

    }

    /**
     * GetA2BMovements: Get an A2B report at the movement level for the given portfolio.
     * Get an A2B report at the movement level for the given portfolio.
     * @param scope The scope of the portfolio to retrieve the A2B movement report for. (required)
     * @param code The code of the portfolio to retrieve the A2B movement report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return VersionedResourceListOfA2BMovementRecord
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B movement data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfA2BMovementRecord getA2BMovements(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter) throws ApiException {
        ApiResponse<VersionedResourceListOfA2BMovementRecord> localVarResp = getA2BMovementsWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter);
        return localVarResp.getData();
    }

    /**
     * GetA2BMovements: Get an A2B report at the movement level for the given portfolio.
     * Get an A2B report at the movement level for the given portfolio.
     * @param scope The scope of the portfolio to retrieve the A2B movement report for. (required)
     * @param code The code of the portfolio to retrieve the A2B movement report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfA2BMovementRecord&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B movement data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfA2BMovementRecord> getA2BMovementsWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter) throws ApiException {
        okhttp3.Call localVarCall = getA2BMovementsValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfA2BMovementRecord>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetA2BMovements: Get an A2B report at the movement level for the given portfolio. (asynchronously)
     * Get an A2B report at the movement level for the given portfolio.
     * @param scope The scope of the portfolio to retrieve the A2B movement report for. (required)
     * @param code The code of the portfolio to retrieve the A2B movement report for. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version              of each transaction if not specified. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; domain to decorate onto              the results. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot;. (optional)
     * @param filter Expression to filter the result set.              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio A2B movement data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getA2BMovementsAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback<VersionedResourceListOfA2BMovementRecord> _callback) throws ApiException {

        okhttp3.Call localVarCall = getA2BMovementsValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfA2BMovementRecord>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBucketedCashFlows
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies the portfolio. (required)
     * @param bucketedCashFlowRequest Request specifying the bucketing of cashflows (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; bucketed cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBucketedCashFlowsCall(String scope, String code, BucketedCashFlowRequest bucketedCashFlowRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = bucketedCashFlowRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/bucketedCashFlows"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBucketedCashFlowsValidateBeforeCall(String scope, String code, BucketedCashFlowRequest bucketedCashFlowRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getBucketedCashFlows(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getBucketedCashFlows(Async)");
        }

        return getBucketedCashFlowsCall(scope, code, bucketedCashFlowRequest, _callback);

    }

    /**
     * [EXPERIMENTAL] GetBucketedCashFlows: Get bucketed cash flows from a list of portfolios
     * We bucket/aggregate a transaction portfolio&#39;s instruments by date or tenor specified in the request.  The cashflows are grouped by both instrumentId and currency.                If you want transactional level cashflow, please use the &#39;GetUpsertableCashFlows&#39; endpoint.  If you want instrument cashflow, please use the &#39;GetPortfolioCashFlows&#39; endpoint.  Note that these endpoints do not apply bucketing.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies the portfolio. (required)
     * @param bucketedCashFlowRequest Request specifying the bucketing of cashflows (optional)
     * @return BucketedCashFlowResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; bucketed cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public BucketedCashFlowResponse getBucketedCashFlows(String scope, String code, BucketedCashFlowRequest bucketedCashFlowRequest) throws ApiException {
        ApiResponse<BucketedCashFlowResponse> localVarResp = getBucketedCashFlowsWithHttpInfo(scope, code, bucketedCashFlowRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetBucketedCashFlows: Get bucketed cash flows from a list of portfolios
     * We bucket/aggregate a transaction portfolio&#39;s instruments by date or tenor specified in the request.  The cashflows are grouped by both instrumentId and currency.                If you want transactional level cashflow, please use the &#39;GetUpsertableCashFlows&#39; endpoint.  If you want instrument cashflow, please use the &#39;GetPortfolioCashFlows&#39; endpoint.  Note that these endpoints do not apply bucketing.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies the portfolio. (required)
     * @param bucketedCashFlowRequest Request specifying the bucketing of cashflows (optional)
     * @return ApiResponse&lt;BucketedCashFlowResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; bucketed cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BucketedCashFlowResponse> getBucketedCashFlowsWithHttpInfo(String scope, String code, BucketedCashFlowRequest bucketedCashFlowRequest) throws ApiException {
        okhttp3.Call localVarCall = getBucketedCashFlowsValidateBeforeCall(scope, code, bucketedCashFlowRequest, null);
        Type localVarReturnType = new TypeToken<BucketedCashFlowResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetBucketedCashFlows: Get bucketed cash flows from a list of portfolios (asynchronously)
     * We bucket/aggregate a transaction portfolio&#39;s instruments by date or tenor specified in the request.  The cashflows are grouped by both instrumentId and currency.                If you want transactional level cashflow, please use the &#39;GetUpsertableCashFlows&#39; endpoint.  If you want instrument cashflow, please use the &#39;GetPortfolioCashFlows&#39; endpoint.  Note that these endpoints do not apply bucketing.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies the portfolio. (required)
     * @param bucketedCashFlowRequest Request specifying the bucketing of cashflows (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; bucketed cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getBucketedCashFlowsAsync(String scope, String code, BucketedCashFlowRequest bucketedCashFlowRequest, final ApiCallback<BucketedCashFlowResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBucketedCashFlowsValidateBeforeCall(scope, code, bucketedCashFlowRequest, _callback);
        Type localVarReturnType = new TypeToken<BucketedCashFlowResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustodianAccount
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies the Transaction Portfolio. (required)
     * @param custodianAccountScope The scope of the Custodian Account. (required)
     * @param custodianAccountCode The code of the Custodian Account. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the Custodian Account properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Custodian Account definition. Defaults to returning the latest version of the Custodian Account definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must take the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/Manager/Id&#39;. If not provided will return all the entitled properties for that Custodian Account. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested Custodian Account definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustodianAccountCall(String scope, String code, String custodianAccountScope, String custodianAccountCode, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/custodianaccounts/{custodianAccountScope}/{custodianAccountCode}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "custodianAccountScope" + "}", localVarApiClient.escapeString(custodianAccountScope.toString()))
            .replace("{" + "custodianAccountCode" + "}", localVarApiClient.escapeString(custodianAccountCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustodianAccountValidateBeforeCall(String scope, String code, String custodianAccountScope, String custodianAccountCode, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getCustodianAccount(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getCustodianAccount(Async)");
        }

        // verify the required parameter 'custodianAccountScope' is set
        if (custodianAccountScope == null) {
            throw new ApiException("Missing the required parameter 'custodianAccountScope' when calling getCustodianAccount(Async)");
        }

        // verify the required parameter 'custodianAccountCode' is set
        if (custodianAccountCode == null) {
            throw new ApiException("Missing the required parameter 'custodianAccountCode' when calling getCustodianAccount(Async)");
        }

        return getCustodianAccountCall(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys, _callback);

    }

    /**
     * [EXPERIMENTAL] GetCustodianAccount: Get Custodian Account
     * Retrieve the definition of a particular Custodian Account which is part of a Transaction Portfolios.
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies the Transaction Portfolio. (required)
     * @param custodianAccountScope The scope of the Custodian Account. (required)
     * @param custodianAccountCode The code of the Custodian Account. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the Custodian Account properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Custodian Account definition. Defaults to returning the latest version of the Custodian Account definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must take the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/Manager/Id&#39;. If not provided will return all the entitled properties for that Custodian Account. (optional)
     * @return CustodianAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested Custodian Account definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public CustodianAccount getCustodianAccount(String scope, String code, String custodianAccountScope, String custodianAccountCode, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        ApiResponse<CustodianAccount> localVarResp = getCustodianAccountWithHttpInfo(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetCustodianAccount: Get Custodian Account
     * Retrieve the definition of a particular Custodian Account which is part of a Transaction Portfolios.
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies the Transaction Portfolio. (required)
     * @param custodianAccountScope The scope of the Custodian Account. (required)
     * @param custodianAccountCode The code of the Custodian Account. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the Custodian Account properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Custodian Account definition. Defaults to returning the latest version of the Custodian Account definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must take the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/Manager/Id&#39;. If not provided will return all the entitled properties for that Custodian Account. (optional)
     * @return ApiResponse&lt;CustodianAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested Custodian Account definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CustodianAccount> getCustodianAccountWithHttpInfo(String scope, String code, String custodianAccountScope, String custodianAccountCode, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = getCustodianAccountValidateBeforeCall(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys, null);
        Type localVarReturnType = new TypeToken<CustodianAccount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetCustodianAccount: Get Custodian Account (asynchronously)
     * Retrieve the definition of a particular Custodian Account which is part of a Transaction Portfolios.
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies the Transaction Portfolio. (required)
     * @param custodianAccountScope The scope of the Custodian Account. (required)
     * @param custodianAccountCode The code of the Custodian Account. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the Custodian Account properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Custodian Account definition. Defaults to returning the latest version of the Custodian Account definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must take the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/Manager/Id&#39;. If not provided will return all the entitled properties for that Custodian Account. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested Custodian Account definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustodianAccountAsync(String scope, String code, String custodianAccountScope, String custodianAccountCode, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback<CustodianAccount> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCustodianAccountValidateBeforeCall(scope, code, custodianAccountScope, custodianAccountCode, effectiveAt, asAt, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<CustodianAccount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDetails
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to returning the latest version of the details if not specified. (optional)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return getDetailsCall(scope, code, effectiveAt, asAt, _callback);

    }

    /**
     * GetDetails: Get details
     * Get certain details associated with a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to returning the latest version of the details if not specified. (optional)
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
     * GetDetails: Get details
     * Get certain details associated with a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to returning the latest version of the details if not specified. (optional)
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
     * GetDetails: Get details (asynchronously)
     * Get certain details associated with a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the              scope this uniquely identifies the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the details of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the details of the transaction portfolio. Defaults              to returning the latest version of the details if not specified. (optional)
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
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot;, \&quot;Custodian Account\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return getHoldingsCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, _callback);

    }

    /**
     * GetHoldings: Get holdings
     * Calculate holdings for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot;, \&quot;Custodian Account\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
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
     * GetHoldings: Get holdings
     * Calculate holdings for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot;, \&quot;Custodian Account\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
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
     * GetHoldings: Get holdings (asynchronously)
     * Calculate holdings for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot;, \&quot;Custodian Account\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
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
     * @param propertyKeys A list of property keys from the ‘Instrument&#39; domain to decorate onto holdings adjustments.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;.              Note that properties from the &#39;Holding’ domain are automatically returned. (optional)
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
    public okhttp3.Call getHoldingsAdjustmentCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsadjustments/{effectiveAt}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "effectiveAt" + "}", localVarApiClient.escapeString(effectiveAt.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHoldingsAdjustmentValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
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

        return getHoldingsAdjustmentCall(scope, code, effectiveAt, asAt, propertyKeys, _callback);

    }

    /**
     * GetHoldingsAdjustment: Get holdings adjustment
     * Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @param propertyKeys A list of property keys from the ‘Instrument&#39; domain to decorate onto holdings adjustments.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;.              Note that properties from the &#39;Holding’ domain are automatically returned. (optional)
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
    public HoldingsAdjustment getHoldingsAdjustment(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        ApiResponse<HoldingsAdjustment> localVarResp = getHoldingsAdjustmentWithHttpInfo(scope, code, effectiveAt, asAt, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * GetHoldingsAdjustment: Get holdings adjustment
     * Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @param propertyKeys A list of property keys from the ‘Instrument&#39; domain to decorate onto holdings adjustments.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;.              Note that properties from the &#39;Holding’ domain are automatically returned. (optional)
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
    public ApiResponse<HoldingsAdjustment> getHoldingsAdjustmentWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsAdjustmentValidateBeforeCall(scope, code, effectiveAt, asAt, propertyKeys, null);
        Type localVarReturnType = new TypeToken<HoldingsAdjustment>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetHoldingsAdjustment: Get holdings adjustment (asynchronously)
     * Get a holdings adjustment made to a transaction portfolio at a specific effective datetime. Note that a  holdings adjustment will only be returned if one exists for the specified effective datetime.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label of the holdings adjustment. (required)
     * @param asAt The asAt datetime at which to retrieve the holdings adjustment. Defaults to the return the latest              version of the holdings adjustment if not specified. (optional)
     * @param propertyKeys A list of property keys from the ‘Instrument&#39; domain to decorate onto holdings adjustments.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;.              Note that properties from the &#39;Holding’ domain are automatically returned. (optional)
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
    public okhttp3.Call getHoldingsAdjustmentAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback<HoldingsAdjustment> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHoldingsAdjustmentValidateBeforeCall(scope, code, effectiveAt, asAt, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<HoldingsAdjustment>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHoldingsWithOrders
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
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
    public okhttp3.Call getHoldingsWithOrdersCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, String recipeIdScope, String recipeIdCode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsWithOrders"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHoldingsWithOrdersValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, String recipeIdScope, String recipeIdCode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getHoldingsWithOrders(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getHoldingsWithOrders(Async)");
        }

        return getHoldingsWithOrdersCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode, _callback);

    }

    /**
     * [EXPERIMENTAL] GetHoldingsWithOrders: Get holdings with orders
     * Get the holdings of a transaction portfolio. Create virtual holdings for any outstanding orders,  and account for order state/fulfillment; that is, treat outstanding orders (and related records) as  if they had been realised at moment of query.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @return VersionedResourceListWithWarningsOfPortfolioHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListWithWarningsOfPortfolioHolding getHoldingsWithOrders(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, String recipeIdScope, String recipeIdCode) throws ApiException {
        ApiResponse<VersionedResourceListWithWarningsOfPortfolioHolding> localVarResp = getHoldingsWithOrdersWithHttpInfo(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetHoldingsWithOrders: Get holdings with orders
     * Get the holdings of a transaction portfolio. Create virtual holdings for any outstanding orders,  and account for order state/fulfillment; that is, treat outstanding orders (and related records) as  if they had been realised at moment of query.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
     * @return ApiResponse&lt;VersionedResourceListWithWarningsOfPortfolioHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListWithWarningsOfPortfolioHolding> getHoldingsWithOrdersWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, String recipeIdScope, String recipeIdCode) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsWithOrdersValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListWithWarningsOfPortfolioHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetHoldingsWithOrders: Get holdings with orders (asynchronously)
     * Get the holdings of a transaction portfolio. Create virtual holdings for any outstanding orders,  and account for order state/fulfillment; that is, treat outstanding orders (and related records) as  if they had been realised at moment of query.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeId (optional)
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
    public okhttp3.Call getHoldingsWithOrdersAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, String recipeIdScope, String recipeIdCode, final ApiCallback<VersionedResourceListWithWarningsOfPortfolioHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = getHoldingsWithOrdersValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, recipeIdScope, recipeIdCode, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListWithWarningsOfPortfolioHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioCashFlows
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. it is the minimum date. (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the data. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioCashFlowsCall(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/cashflows"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (windowStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("windowStart", windowStart));
        }

        if (windowEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("windowEnd", windowEnd));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        if (excludeUnsettledTrades != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("excludeUnsettledTrades", excludeUnsettledTrades));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioCashFlowsValidateBeforeCall(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioCashFlows(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioCashFlows(Async)");
        }

        return getPortfolioCashFlowsCall(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, _callback);

    }

    /**
     * [BETA] GetPortfolioCashFlows: Get portfolio cash flows
     * Get the set of cash flows that occur in a window for the transaction portfolio&#39;s instruments.                Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. it is the minimum date. (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the data. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @return ResourceListOfInstrumentCashFlow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfInstrumentCashFlow getPortfolioCashFlows(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades) throws ApiException {
        ApiResponse<ResourceListOfInstrumentCashFlow> localVarResp = getPortfolioCashFlowsWithHttpInfo(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades);
        return localVarResp.getData();
    }

    /**
     * [BETA] GetPortfolioCashFlows: Get portfolio cash flows
     * Get the set of cash flows that occur in a window for the transaction portfolio&#39;s instruments.                Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. it is the minimum date. (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the data. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @return ApiResponse&lt;ResourceListOfInstrumentCashFlow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfInstrumentCashFlow> getPortfolioCashFlowsWithHttpInfo(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioCashFlowsValidateBeforeCall(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, null);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrumentCashFlow>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [BETA] GetPortfolioCashFlows: Get portfolio cash flows (asynchronously)
     * Get the set of cash flows that occur in a window for the transaction portfolio&#39;s instruments.                Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. it is the minimum date. (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the data. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioCashFlowsAsync(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback<ResourceListOfInstrumentCashFlow> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortfolioCashFlowsValidateBeforeCall(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrumentCashFlow>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioCashLadder
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash-ladder </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioCashLadderCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, String effectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/cashladder"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (toEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
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

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        if (excludeUnsettledTrades != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("excludeUnsettledTrades", excludeUnsettledTrades));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioCashLadderValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, String effectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioCashLadder(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioCashLadder(Async)");
        }

        // verify the required parameter 'fromEffectiveAt' is set
        if (fromEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'fromEffectiveAt' when calling getPortfolioCashLadder(Async)");
        }

        // verify the required parameter 'toEffectiveAt' is set
        if (toEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'toEffectiveAt' when calling getPortfolioCashLadder(Async)");
        }

        // verify the required parameter 'effectiveAt' is set
        if (effectiveAt == null) {
            throw new ApiException("Missing the required parameter 'effectiveAt' when calling getPortfolioCashLadder(Async)");
        }

        return getPortfolioCashLadderCall(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, _callback);

    }

    /**
     * GetPortfolioCashLadder: Get portfolio cash ladder
     * Get a cash ladder for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @return ResourceListOfPortfolioCashLadder
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash-ladder </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPortfolioCashLadder getPortfolioCashLadder(String scope, String code, String fromEffectiveAt, String toEffectiveAt, String effectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades) throws ApiException {
        ApiResponse<ResourceListOfPortfolioCashLadder> localVarResp = getPortfolioCashLadderWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades);
        return localVarResp.getData();
    }

    /**
     * GetPortfolioCashLadder: Get portfolio cash ladder
     * Get a cash ladder for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @return ApiResponse&lt;ResourceListOfPortfolioCashLadder&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash-ladder </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPortfolioCashLadder> getPortfolioCashLadderWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, String effectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioCashLadderValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioCashLadder>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetPortfolioCashLadder: Get portfolio cash ladder (asynchronously)
     * Get a cash ladder for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. If set to true, unsettled trades will be excluded from the result set. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash-ladder </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioCashLadderAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, String effectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback<ResourceListOfPortfolioCashLadder> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortfolioCashLadderValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, effectiveAt, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioCashLadder>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioCashStatement
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioCashStatementCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/cashstatement"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (toEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioCashStatementValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioCashStatement(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioCashStatement(Async)");
        }

        // verify the required parameter 'fromEffectiveAt' is set
        if (fromEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'fromEffectiveAt' when calling getPortfolioCashStatement(Async)");
        }

        // verify the required parameter 'toEffectiveAt' is set
        if (toEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'toEffectiveAt' when calling getPortfolioCashStatement(Async)");
        }

        return getPortfolioCashStatementCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode, _callback);

    }

    /**
     * GetPortfolioCashStatement: Get portfolio cash statement
     * Get a cash statement for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @return ResourceListOfPortfolioCashFlow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPortfolioCashFlow getPortfolioCashStatement(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode) throws ApiException {
        ApiResponse<ResourceListOfPortfolioCashFlow> localVarResp = getPortfolioCashStatementWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode);
        return localVarResp.getData();
    }

    /**
     * GetPortfolioCashStatement: Get portfolio cash statement
     * Get a cash statement for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @return ApiResponse&lt;ResourceListOfPortfolioCashFlow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPortfolioCashFlow> getPortfolioCashStatementWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioCashStatementValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioCashFlow>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetPortfolioCashStatement: Get portfolio cash statement (asynchronously)
     * Get a cash statement for a transaction portfolio.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this              uniquely identifies the portfolio. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (required)
     * @param toEffectiveAt The upper bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no upper bound if this is not specified. (required)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio cash flow data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioCashStatementAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, final ApiCallback<ResourceListOfPortfolioCashFlow> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPortfolioCashStatementValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, filter, recipeIdScope, recipeIdCode, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPortfolioCashFlow>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactionHistory
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update. (required)
     * @param asAt The asAt datetime at which to retrieve the history of the transaction. Defaults              to return the latest version if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The history of the specified transaction (changes that have been made to it). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionHistoryCall(String scope, String code, String transactionId, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/history"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "transactionId" + "}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionHistoryValidateBeforeCall(String scope, String code, String transactionId, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getTransactionHistory(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getTransactionHistory(Async)");
        }

        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransactionHistory(Async)");
        }

        return getTransactionHistoryCall(scope, code, transactionId, asAt, _callback);

    }

    /**
     * [EARLY ACCESS] GetTransactionHistory: Get the history of a transaction
     * Get all of the changes that have happened to a transaction.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update. (required)
     * @param asAt The asAt datetime at which to retrieve the history of the transaction. Defaults              to return the latest version if not specified. (optional)
     * @return ResourceListOfChangeHistory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The history of the specified transaction (changes that have been made to it). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfChangeHistory getTransactionHistory(String scope, String code, String transactionId, OffsetDateTime asAt) throws ApiException {
        ApiResponse<ResourceListOfChangeHistory> localVarResp = getTransactionHistoryWithHttpInfo(scope, code, transactionId, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetTransactionHistory: Get the history of a transaction
     * Get all of the changes that have happened to a transaction.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update. (required)
     * @param asAt The asAt datetime at which to retrieve the history of the transaction. Defaults              to return the latest version if not specified. (optional)
     * @return ApiResponse&lt;ResourceListOfChangeHistory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The history of the specified transaction (changes that have been made to it). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfChangeHistory> getTransactionHistoryWithHttpInfo(String scope, String code, String transactionId, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getTransactionHistoryValidateBeforeCall(scope, code, transactionId, asAt, null);
        Type localVarReturnType = new TypeToken<ResourceListOfChangeHistory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetTransactionHistory: Get the history of a transaction (asynchronously)
     * Get all of the changes that have happened to a transaction.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update. (required)
     * @param asAt The asAt datetime at which to retrieve the history of the transaction. Defaults              to return the latest version if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The history of the specified transaction (changes that have been made to it). </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionHistoryAsync(String scope, String code, String transactionId, OffsetDateTime asAt, final ApiCallback<ResourceListOfChangeHistory> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionHistoryValidateBeforeCall(scope, code, transactionId, asAt, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfChangeHistory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or               &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. The current behaviour is               to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended               to populate this field to enable pagination. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
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
    public okhttp3.Call getTransactionsCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, Boolean showCancelledTransactions, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (showCancelledTransactions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showCancelledTransactions", showCancelledTransactions));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsValidateBeforeCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, Boolean showCancelledTransactions, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getTransactions(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getTransactions(Async)");
        }

        return getTransactionsCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions, _callback);

    }

    /**
     * GetTransactions: Get transactions
     * Retrieve all the transactions that occurred during a particular time interval.                If the portfolio is a derived transaction portfolio, the transactions returned are the  union set of all transactions of the parent (and any grandparents, etc.) as well as  those of the derived transaction portfolio itself.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or               &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. The current behaviour is               to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended               to populate this field to enable pagination. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
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
    public VersionedResourceListOfTransaction getTransactions(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, Boolean showCancelledTransactions) throws ApiException {
        ApiResponse<VersionedResourceListOfTransaction> localVarResp = getTransactionsWithHttpInfo(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions);
        return localVarResp.getData();
    }

    /**
     * GetTransactions: Get transactions
     * Retrieve all the transactions that occurred during a particular time interval.                If the portfolio is a derived transaction portfolio, the transactions returned are the  union set of all transactions of the parent (and any grandparents, etc.) as well as  those of the derived transaction portfolio itself.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or               &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. The current behaviour is               to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended               to populate this field to enable pagination. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
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
    public ApiResponse<VersionedResourceListOfTransaction> getTransactionsWithHttpInfo(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, Boolean showCancelledTransactions) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetTransactions: Get transactions (asynchronously)
     * Retrieve all the transactions that occurred during a particular time interval.                If the portfolio is a derived transaction portfolio, the transactions returned are the  union set of all transactions of the parent (and any grandparents, etc.) as well as  those of the derived transaction portfolio itself.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies               the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version               of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or               &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. The current behaviour is               to return all transactions if possible, but this will change to defaulting to 1000 if not specified in the future. It is recommended               to populate this field to enable pagination. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
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
    public okhttp3.Call getTransactionsAsync(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, Boolean showCancelledTransactions, final ApiCallback<VersionedResourceListOfTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, showCancelledTransactions, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getUpsertablePortfolioCashFlows
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. uses minimum date-time (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to true, unsettled trades will be excluded from the result set. If set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data as a set of upsertable transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUpsertablePortfolioCashFlowsCall(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/upsertablecashflows"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (windowStart != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("windowStart", windowStart));
        }

        if (windowEnd != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("windowEnd", windowEnd));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (recipeIdScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdScope", recipeIdScope));
        }

        if (recipeIdCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recipeIdCode", recipeIdCode));
        }

        if (excludeUnsettledTrades != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("excludeUnsettledTrades", excludeUnsettledTrades));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUpsertablePortfolioCashFlowsValidateBeforeCall(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getUpsertablePortfolioCashFlows(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getUpsertablePortfolioCashFlows(Async)");
        }

        return getUpsertablePortfolioCashFlowsCall(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, _callback);

    }

    /**
     * [BETA] GetUpsertablePortfolioCashFlows: Get upsertable portfolio cash flows.
     * Get the set of cash flows that occur in a window for the given portfolio instruments as a set of upsertable transactions (DTOs).                Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.                In essence this is identical to the &#39;GetCashFlows&#39; endpoint but returns the cash flows as a set of transactions suitable for directly putting back into LUSID.  There are a couple of important points:  (1) Internally it can not be fully known where the user wishes to insert these transactions, e.g. portfolio and movement type.      These are therefore defaulted to a sensible option; the user will likely need to change these.  (2) Similarly, knowledge of any properties the user might wish to add to a transaction are unknown and consequently left empty.  (3) The transaction id that is added is simply a concatenation of the original transaction id, instrument id and payment date and direction. The user can happily override this.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. uses minimum date-time (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to true, unsettled trades will be excluded from the result set. If set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. (optional, default to true)
     * @return ResourceListOfTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data as a set of upsertable transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfTransaction getUpsertablePortfolioCashFlows(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades) throws ApiException {
        ApiResponse<ResourceListOfTransaction> localVarResp = getUpsertablePortfolioCashFlowsWithHttpInfo(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades);
        return localVarResp.getData();
    }

    /**
     * [BETA] GetUpsertablePortfolioCashFlows: Get upsertable portfolio cash flows.
     * Get the set of cash flows that occur in a window for the given portfolio instruments as a set of upsertable transactions (DTOs).                Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.                In essence this is identical to the &#39;GetCashFlows&#39; endpoint but returns the cash flows as a set of transactions suitable for directly putting back into LUSID.  There are a couple of important points:  (1) Internally it can not be fully known where the user wishes to insert these transactions, e.g. portfolio and movement type.      These are therefore defaulted to a sensible option; the user will likely need to change these.  (2) Similarly, knowledge of any properties the user might wish to add to a transaction are unknown and consequently left empty.  (3) The transaction id that is added is simply a concatenation of the original transaction id, instrument id and payment date and direction. The user can happily override this.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. uses minimum date-time (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to true, unsettled trades will be excluded from the result set. If set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. (optional, default to true)
     * @return ApiResponse&lt;ResourceListOfTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data as a set of upsertable transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfTransaction> getUpsertablePortfolioCashFlowsWithHttpInfo(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades) throws ApiException {
        okhttp3.Call localVarCall = getUpsertablePortfolioCashFlowsValidateBeforeCall(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, null);
        Type localVarReturnType = new TypeToken<ResourceListOfTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [BETA] GetUpsertablePortfolioCashFlows: Get upsertable portfolio cash flows. (asynchronously)
     * Get the set of cash flows that occur in a window for the given portfolio instruments as a set of upsertable transactions (DTOs).                Note that grouping can affect the quantity of information returned; where a holding is an amalgamation of one or more (e.g. cash) instruments, a unique  transaction identifier will not be available. The same may go for diagnostic information (e.g. multiple sources of an aggregate cash amount on a date that is  not split out. Grouping at the transaction and instrument level is recommended for those seeking to attribute individual flows.                In essence this is identical to the &#39;GetCashFlows&#39; endpoint but returns the cash flows as a set of transactions suitable for directly putting back into LUSID.  There are a couple of important points:  (1) Internally it can not be fully known where the user wishes to insert these transactions, e.g. portfolio and movement type.      These are therefore defaulted to a sensible option; the user will likely need to change these.  (2) Similarly, knowledge of any properties the user might wish to add to a transaction are unknown and consequently left empty.  (3) The transaction id that is added is simply a concatenation of the original transaction id, instrument id and payment date and direction. The user can happily override this.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this               uniquely identifies the portfolio. (required)
     * @param effectiveAt The valuation (pricing) effective datetime or cut label (inclusive) at which to evaluate the cashflows.  This determines whether cashflows are evaluated in a historic or forward looking context and will, for certain models, affect where data is looked up.  For example, on a swap if the effectiveAt is in the middle of the window, cashflows before it will be historic and resets assumed to exist where if the effectiveAt  is before the start of the range they are forward looking and will be expectations assuming the model supports that.  There is evidently a presumption here about availability of data and that the effectiveAt is realistically on or before the real-world today. (optional)
     * @param windowStart The lower bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               There is no lower bound if this is not specified. i.e. uses minimum date-time (optional)
     * @param windowEnd The upper bound effective datetime or cut label (inclusive) from which to retrieve the cashflows.               The upper bound defaults to &#39;max date&#39; if it is not specified (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;.               For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param recipeIdScope The scope of the given recipeId (optional)
     * @param recipeIdCode The code of the given recipeID (optional)
     * @param excludeUnsettledTrades If absent or set to true, unsettled trades will be excluded from the result set. If set to false, cashflows will returned based on trade date - more specifically, cashflows from any unsettled trades will be included in the results. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio instruments&#39; cash flow data as a set of upsertable transactions </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUpsertablePortfolioCashFlowsAsync(String scope, String code, String effectiveAt, String windowStart, String windowEnd, OffsetDateTime asAt, String filter, String recipeIdScope, String recipeIdCode, Boolean excludeUnsettledTrades, final ApiCallback<ResourceListOfTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUpsertablePortfolioCashFlowsValidateBeforeCall(scope, code, effectiveAt, windowStart, windowEnd, asAt, filter, recipeIdScope, recipeIdCode, excludeUnsettledTrades, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listCustodianAccounts
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties decorated on Custodian Accounts. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param page The pagination token to use to continue listing custodian accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the Custodian Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must have the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/system/Name&#39;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The custodian accounts in the given Transaction Portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCustodianAccountsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/custodianaccounts"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (start != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start", start));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listCustodianAccountsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listCustodianAccounts(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling listCustodianAccounts(Async)");
        }

        return listCustodianAccountsCall(scope, code, effectiveAt, asAt, page, start, limit, filter, propertyKeys, _callback);

    }

    /**
     * [EXPERIMENTAL] ListCustodianAccounts: List Custodian Accounts
     * List the custodian accounts in a Transaction Portfolios
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties decorated on Custodian Accounts. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param page The pagination token to use to continue listing custodian accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the Custodian Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must have the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/system/Name&#39;. (optional)
     * @return PagedResourceListOfCustodianAccount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The custodian accounts in the given Transaction Portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfCustodianAccount listCustodianAccounts(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<PagedResourceListOfCustodianAccount> localVarResp = listCustodianAccountsWithHttpInfo(scope, code, effectiveAt, asAt, page, start, limit, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListCustodianAccounts: List Custodian Accounts
     * List the custodian accounts in a Transaction Portfolios
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties decorated on Custodian Accounts. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param page The pagination token to use to continue listing custodian accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the Custodian Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must have the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/system/Name&#39;. (optional)
     * @return ApiResponse&lt;PagedResourceListOfCustodianAccount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The custodian accounts in the given Transaction Portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfCustodianAccount> listCustodianAccountsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = listCustodianAccountsValidateBeforeCall(scope, code, effectiveAt, asAt, page, start, limit, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfCustodianAccount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListCustodianAccounts: List Custodian Accounts (asynchronously)
     * List the custodian accounts in a Transaction Portfolios
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties decorated on Custodian Accounts. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param page The pagination token to use to continue listing custodian accounts; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the Custodian Account type, specify \&quot;code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;CustodianAccount&#39; domain to decorate onto the Custodian Account.              These must have the format {domain}/{scope}/{code}, for example &#39;CustodianAccount/system/Name&#39;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The custodian accounts in the given Transaction Portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCustodianAccountsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback<PagedResourceListOfCustodianAccount> _callback) throws ApiException {

        okhttp3.Call localVarCall = listCustodianAccountsValidateBeforeCall(scope, code, effectiveAt, asAt, page, start, limit, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfCustodianAccount>(){}.getType();
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdingsadjustments"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (toEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toEffectiveAt", toEffectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return listHoldingsAdjustmentsCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, _callback);

    }

    /**
     * ListHoldingsAdjustments: List holdings adjustments
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
     * ListHoldingsAdjustments: List holdings adjustments
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
     * ListHoldingsAdjustments: List holdings adjustments (asynchronously)
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
     * Build call for lookThroughHoldings
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio with lookthrough </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lookThroughHoldingsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, String quotesScope, String slice, String shareClass, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings/$lookthrough"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (quotesScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("quotesScope", quotesScope));
        }

        if (slice != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("slice", slice));
        }

        if (shareClass != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shareClass", shareClass));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call lookThroughHoldingsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, String quotesScope, String slice, String shareClass, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling lookThroughHoldings(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling lookThroughHoldings(Async)");
        }

        return lookThroughHoldingsCall(scope, code, effectiveAt, asAt, filter, propertyKeys, quotesScope, slice, shareClass, _callback);

    }

    /**
     * [EXPERIMENTAL] LookThroughHoldings: Get LookThrough Holdings
     * Calculate holdings for a transaction portfolio with lookthrough
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @return VersionedResourceListOfPortfolioHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio with lookthrough </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfPortfolioHolding lookThroughHoldings(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, String quotesScope, String slice, String shareClass) throws ApiException {
        ApiResponse<VersionedResourceListOfPortfolioHolding> localVarResp = lookThroughHoldingsWithHttpInfo(scope, code, effectiveAt, asAt, filter, propertyKeys, quotesScope, slice, shareClass);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] LookThroughHoldings: Get LookThrough Holdings
     * Calculate holdings for a transaction portfolio with lookthrough
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfPortfolioHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio with lookthrough </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfPortfolioHolding> lookThroughHoldingsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, String quotesScope, String slice, String shareClass) throws ApiException {
        okhttp3.Call localVarCall = lookThroughHoldingsValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, quotesScope, slice, shareClass, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] LookThroughHoldings: Get LookThrough Holdings (asynchronously)
     * Calculate holdings for a transaction portfolio with lookthrough
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of the transaction              portfolio. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of the transaction portfolio. Defaults              to return the latest version if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Holding Type, use \&quot;holdingType eq &#39;p&#39;\&quot;.              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              holdings. These must have the format {domain}/{scope}/{code}, for example \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings and version of the specified transaction portfolio with lookthrough </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call lookThroughHoldingsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, String quotesScope, String slice, String shareClass, final ApiCallback<VersionedResourceListOfPortfolioHolding> _callback) throws ApiException {

        okhttp3.Call localVarCall = lookThroughHoldingsValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, quotesScope, slice, shareClass, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for lookThroughTransactions
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto              transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or              &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to LookThroughTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. This will default to 1000 if not specified. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @param useAlternateScalingLogic When running LookThrough, set this flag to use the same scaling logic as for LT Holdings (optional, default to false)
     * @param alternateEffectiveAt This effectiveAt field is required when using alternate scaling logic to determine which fund and currency data is used for scaling (optional)
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
    public okhttp3.Call lookThroughTransactionsCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, String quotesScope, String slice, String shareClass, Boolean useAlternateScalingLogic, String alternateEffectiveAt, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/$lookthrough"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (quotesScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("quotesScope", quotesScope));
        }

        if (slice != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("slice", slice));
        }

        if (shareClass != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shareClass", shareClass));
        }

        if (useAlternateScalingLogic != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("useAlternateScalingLogic", useAlternateScalingLogic));
        }

        if (alternateEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("alternateEffectiveAt", alternateEffectiveAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call lookThroughTransactionsValidateBeforeCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, String quotesScope, String slice, String shareClass, Boolean useAlternateScalingLogic, String alternateEffectiveAt, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling lookThroughTransactions(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling lookThroughTransactions(Async)");
        }

        return lookThroughTransactionsCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, quotesScope, slice, shareClass, useAlternateScalingLogic, alternateEffectiveAt, _callback);

    }

    /**
     * [EXPERIMENTAL] LookThroughTransactions: Look through transactions
     * Retrieve all the transactions that occurred during a particular time interval.    If the portfolio is part of a fund as defined in Fund Accounting documents, the transactions returned are the  union set of all transactions in portfolios of the same type, in any funds invested in by the portfolio&#39;s fund  (and any funds invested in from that fund, etc.).  The transactions will be scaled according to the ratio of the value of the investment in the fund to the NAV of the fund itself.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto              transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or              &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to LookThroughTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. This will default to 1000 if not specified. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @param useAlternateScalingLogic When running LookThrough, set this flag to use the same scaling logic as for LT Holdings (optional, default to false)
     * @param alternateEffectiveAt This effectiveAt field is required when using alternate scaling logic to determine which fund and currency data is used for scaling (optional)
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
    public VersionedResourceListOfTransaction lookThroughTransactions(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, String quotesScope, String slice, String shareClass, Boolean useAlternateScalingLogic, String alternateEffectiveAt) throws ApiException {
        ApiResponse<VersionedResourceListOfTransaction> localVarResp = lookThroughTransactionsWithHttpInfo(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, quotesScope, slice, shareClass, useAlternateScalingLogic, alternateEffectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] LookThroughTransactions: Look through transactions
     * Retrieve all the transactions that occurred during a particular time interval.    If the portfolio is part of a fund as defined in Fund Accounting documents, the transactions returned are the  union set of all transactions in portfolios of the same type, in any funds invested in by the portfolio&#39;s fund  (and any funds invested in from that fund, etc.).  The transactions will be scaled according to the ratio of the value of the investment in the fund to the NAV of the fund itself.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto              transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or              &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to LookThroughTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. This will default to 1000 if not specified. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @param useAlternateScalingLogic When running LookThrough, set this flag to use the same scaling logic as for LT Holdings (optional, default to false)
     * @param alternateEffectiveAt This effectiveAt field is required when using alternate scaling logic to determine which fund and currency data is used for scaling (optional)
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
    public ApiResponse<VersionedResourceListOfTransaction> lookThroughTransactionsWithHttpInfo(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, String quotesScope, String slice, String shareClass, Boolean useAlternateScalingLogic, String alternateEffectiveAt) throws ApiException {
        okhttp3.Call localVarCall = lookThroughTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, quotesScope, slice, shareClass, useAlternateScalingLogic, alternateEffectiveAt, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] LookThroughTransactions: Look through transactions (asynchronously)
     * Retrieve all the transactions that occurred during a particular time interval.    If the portfolio is part of a fund as defined in Fund Accounting documents, the transactions returned are the  union set of all transactions in portfolios of the same type, in any funds invested in by the portfolio&#39;s fund  (and any funds invested in from that fund, etc.).  The transactions will be scaled according to the ratio of the value of the investment in the fund to the NAV of the fund itself.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.              There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve transactions. Defaults to returning the latest version              of each transaction if not specified. (optional)
     * @param filter Expression with which to filter the result set.              For example, to return only transactions with a transaction type of &#39;Buy&#39;, specify \&quot;type eq &#39;Buy&#39;\&quot;              For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39;, &#39;Transaction&#39;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto              transactions. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39; or              &#39;Transaction/strategy/quantsignal&#39;. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to LookThroughTransactions. (optional)
     * @param limit When paginating, limit the number of returned results to this many. This will default to 1000 if not specified. (optional)
     * @param quotesScope The scope containing the quotes with the FX rates used for currency conversion. (optional)
     * @param slice When running LookThrough, define this slice as the root slice in the portfolio to look through from. (optional)
     * @param shareClass When running LookThrough, use this along with the slice parameter to specify              the root share class in the slice in the portfolio to look through from. The slice parameter is a prerequisite              for this parameter to be valid. (optional)
     * @param useAlternateScalingLogic When running LookThrough, set this flag to use the same scaling logic as for LT Holdings (optional, default to false)
     * @param alternateEffectiveAt This effectiveAt field is required when using alternate scaling logic to determine which fund and currency data is used for scaling (optional)
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
    public okhttp3.Call lookThroughTransactionsAsync(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, String page, Integer limit, String quotesScope, String slice, String shareClass, Boolean useAlternateScalingLogic, String alternateEffectiveAt, final ApiCallback<VersionedResourceListOfTransaction> _callback) throws ApiException {

        okhttp3.Call localVarCall = lookThroughTransactionsValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, page, limit, quotesScope, slice, shareClass, useAlternateScalingLogic, alternateEffectiveAt, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchPortfolioDetails
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param operation The patch document. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.               Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly patched details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPortfolioDetailsCall(String scope, String code, List<Operation> operation, String effectiveAt, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = operation;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchPortfolioDetailsValidateBeforeCall(String scope, String code, List<Operation> operation, String effectiveAt, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling patchPortfolioDetails(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling patchPortfolioDetails(Async)");
        }

        // verify the required parameter 'operation' is set
        if (operation == null) {
            throw new ApiException("Missing the required parameter 'operation' when calling patchPortfolioDetails(Async)");
        }

        return patchPortfolioDetailsCall(scope, code, operation, effectiveAt, _callback);

    }

    /**
     * [EARLY ACCESS] PatchPortfolioDetails: Patch portfolio details
     * Create or update certain details for a particular transaction portfolio.  The behaviour is defined by the JSON Patch specification.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.  Currently supported properties are: SubHoldingKeys, BaseCurrency, AmortisationMethod
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param operation The patch document. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.               Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities. (optional)
     * @return PortfolioDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly patched details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioDetails patchPortfolioDetails(String scope, String code, List<Operation> operation, String effectiveAt) throws ApiException {
        ApiResponse<PortfolioDetails> localVarResp = patchPortfolioDetailsWithHttpInfo(scope, code, operation, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] PatchPortfolioDetails: Patch portfolio details
     * Create or update certain details for a particular transaction portfolio.  The behaviour is defined by the JSON Patch specification.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.  Currently supported properties are: SubHoldingKeys, BaseCurrency, AmortisationMethod
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param operation The patch document. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.               Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities. (optional)
     * @return ApiResponse&lt;PortfolioDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly patched details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioDetails> patchPortfolioDetailsWithHttpInfo(String scope, String code, List<Operation> operation, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = patchPortfolioDetailsValidateBeforeCall(scope, code, operation, effectiveAt, null);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] PatchPortfolioDetails: Patch portfolio details (asynchronously)
     * Create or update certain details for a particular transaction portfolio.  The behaviour is defined by the JSON Patch specification.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.  Currently supported properties are: SubHoldingKeys, BaseCurrency, AmortisationMethod
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param operation The patch document. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified.               Note that this will affect all bitemporal entities in the request, but will not be used for any perpetual entities. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly patched details </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPortfolioDetailsAsync(String scope, String code, List<Operation> operation, String effectiveAt, final ApiCallback<PortfolioDetails> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchPortfolioDetailsValidateBeforeCall(scope, code, operation, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<PortfolioDetails>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for resolveInstrument
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param instrumentIdentifierType The instrument identifier type. (required)
     * @param instrumentIdentifierValue The value for the given instrument identifier. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (optional)
     * @param reResolve When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.              When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved. (optional, default to false)
     * @param requestBody The dictionary with the instrument identifiers to be updated on the             transaction and holdings. (optional)
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
    public okhttp3.Call resolveInstrumentCall(String scope, String code, String instrumentIdentifierType, String instrumentIdentifierValue, String fromEffectiveAt, Boolean reResolve, Map<String, String> requestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/$resolve"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (instrumentIdentifierType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("instrumentIdentifierType", instrumentIdentifierType));
        }

        if (instrumentIdentifierValue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("instrumentIdentifierValue", instrumentIdentifierValue));
        }

        if (fromEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromEffectiveAt", fromEffectiveAt));
        }

        if (reResolve != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reResolve", reResolve));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call resolveInstrumentValidateBeforeCall(String scope, String code, String instrumentIdentifierType, String instrumentIdentifierValue, String fromEffectiveAt, Boolean reResolve, Map<String, String> requestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling resolveInstrument(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling resolveInstrument(Async)");
        }

        // verify the required parameter 'instrumentIdentifierType' is set
        if (instrumentIdentifierType == null) {
            throw new ApiException("Missing the required parameter 'instrumentIdentifierType' when calling resolveInstrument(Async)");
        }

        // verify the required parameter 'instrumentIdentifierValue' is set
        if (instrumentIdentifierValue == null) {
            throw new ApiException("Missing the required parameter 'instrumentIdentifierValue' when calling resolveInstrument(Async)");
        }

        return resolveInstrumentCall(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody, _callback);

    }

    /**
     * [EARLY ACCESS] ResolveInstrument: Resolve instrument
     * Try to resolve the instrument for transaction and holdings for a given instrument identifier and a specified  period of time. Also update the instrument identifiers with the given instrument identifiers collection.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param instrumentIdentifierType The instrument identifier type. (required)
     * @param instrumentIdentifierValue The value for the given instrument identifier. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (optional)
     * @param reResolve When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.              When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved. (optional, default to false)
     * @param requestBody The dictionary with the instrument identifiers to be updated on the             transaction and holdings. (optional)
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
    public UpsertPortfolioTransactionsResponse resolveInstrument(String scope, String code, String instrumentIdentifierType, String instrumentIdentifierValue, String fromEffectiveAt, Boolean reResolve, Map<String, String> requestBody) throws ApiException {
        ApiResponse<UpsertPortfolioTransactionsResponse> localVarResp = resolveInstrumentWithHttpInfo(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ResolveInstrument: Resolve instrument
     * Try to resolve the instrument for transaction and holdings for a given instrument identifier and a specified  period of time. Also update the instrument identifiers with the given instrument identifiers collection.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param instrumentIdentifierType The instrument identifier type. (required)
     * @param instrumentIdentifierValue The value for the given instrument identifier. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (optional)
     * @param reResolve When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.              When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved. (optional, default to false)
     * @param requestBody The dictionary with the instrument identifiers to be updated on the             transaction and holdings. (optional)
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
    public ApiResponse<UpsertPortfolioTransactionsResponse> resolveInstrumentWithHttpInfo(String scope, String code, String instrumentIdentifierType, String instrumentIdentifierValue, String fromEffectiveAt, Boolean reResolve, Map<String, String> requestBody) throws ApiException {
        okhttp3.Call localVarCall = resolveInstrumentValidateBeforeCall(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody, null);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ResolveInstrument: Resolve instrument (asynchronously)
     * Try to resolve the instrument for transaction and holdings for a given instrument identifier and a specified  period of time. Also update the instrument identifiers with the given instrument identifiers collection.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param instrumentIdentifierType The instrument identifier type. (required)
     * @param instrumentIdentifierValue The value for the given instrument identifier. (required)
     * @param fromEffectiveAt The lower bound effective datetime or cut label (inclusive) from which to retrieve the data.              There is no lower bound if this is not specified. (optional)
     * @param reResolve When set to true, instrument resolution will be attempted for all transactions and holdings for the given identifier and date range.              When set to false (default behaviour), instrument resolution will only be attempted for those transactions and holdings that were previously unresolved. (optional, default to false)
     * @param requestBody The dictionary with the instrument identifiers to be updated on the             transaction and holdings. (optional)
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
    public okhttp3.Call resolveInstrumentAsync(String scope, String code, String instrumentIdentifierType, String instrumentIdentifierValue, String fromEffectiveAt, Boolean reResolve, Map<String, String> requestBody, final ApiCallback<UpsertPortfolioTransactionsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = resolveInstrumentValidateBeforeCall(scope, code, instrumentIdentifierType, instrumentIdentifierValue, fromEffectiveAt, reResolve, requestBody, _callback);
        Type localVarReturnType = new TypeToken<UpsertPortfolioTransactionsResponse>(){}.getType();
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = adjustHoldingRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/holdings"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (reconciliationMethods != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "reconciliationMethods", reconciliationMethods));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return setHoldingsCall(scope, code, effectiveAt, adjustHoldingRequest, reconciliationMethods, _callback);

    }

    /**
     * SetHoldings: Set holdings
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
     * SetHoldings: Set holdings
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
     * SetHoldings: Set holdings (asynchronously)
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
     * Build call for upsertCustodianAccounts
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param custodianAccountRequest A list of Custodian Accounts to be created or updated. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly upserted custodian accounts. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustodianAccountsCall(String scope, String code, List<CustodianAccountRequest> custodianAccountRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = custodianAccountRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/custodianaccounts"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertCustodianAccountsValidateBeforeCall(String scope, String code, List<CustodianAccountRequest> custodianAccountRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertCustodianAccounts(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertCustodianAccounts(Async)");
        }

        // verify the required parameter 'custodianAccountRequest' is set
        if (custodianAccountRequest == null) {
            throw new ApiException("Missing the required parameter 'custodianAccountRequest' when calling upsertCustodianAccounts(Async)");
        }

        return upsertCustodianAccountsCall(scope, code, custodianAccountRequest, _callback);

    }

    /**
     * [EXPERIMENTAL] UpsertCustodianAccounts: Upsert Custodian Accounts
     * Create or update Custodian Accounts in the Transaction Portfolios. A Custodian Account will be updated  if it already exists and created if it does not.  The batch limit per request is 2,000.
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param custodianAccountRequest A list of Custodian Accounts to be created or updated. (required)
     * @return CustodianAccountsUpsertResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly upserted custodian accounts. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public CustodianAccountsUpsertResponse upsertCustodianAccounts(String scope, String code, List<CustodianAccountRequest> custodianAccountRequest) throws ApiException {
        ApiResponse<CustodianAccountsUpsertResponse> localVarResp = upsertCustodianAccountsWithHttpInfo(scope, code, custodianAccountRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpsertCustodianAccounts: Upsert Custodian Accounts
     * Create or update Custodian Accounts in the Transaction Portfolios. A Custodian Account will be updated  if it already exists and created if it does not.  The batch limit per request is 2,000.
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param custodianAccountRequest A list of Custodian Accounts to be created or updated. (required)
     * @return ApiResponse&lt;CustodianAccountsUpsertResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly upserted custodian accounts. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CustodianAccountsUpsertResponse> upsertCustodianAccountsWithHttpInfo(String scope, String code, List<CustodianAccountRequest> custodianAccountRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertCustodianAccountsValidateBeforeCall(scope, code, custodianAccountRequest, null);
        Type localVarReturnType = new TypeToken<CustodianAccountsUpsertResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpsertCustodianAccounts: Upsert Custodian Accounts (asynchronously)
     * Create or update Custodian Accounts in the Transaction Portfolios. A Custodian Account will be updated  if it already exists and created if it does not.  The batch limit per request is 2,000.
     * @param scope The scope of the Transaction Portfolio. (required)
     * @param code The code of the Transaction Portfolio. Together with the scope this uniquely identifies              the Transaction Portfolios. (required)
     * @param custodianAccountRequest A list of Custodian Accounts to be created or updated. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The newly upserted custodian accounts. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustodianAccountsAsync(String scope, String code, List<CustodianAccountRequest> custodianAccountRequest, final ApiCallback<CustodianAccountsUpsertResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertCustodianAccountsValidateBeforeCall(scope, code, custodianAccountRequest, _callback);
        Type localVarReturnType = new TypeToken<CustodianAccountsUpsertResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertCustodianAccountsProperties
     * @param scope The scope of the Transaction Portfolios to update or insert the properties onto. (required)
     * @param code The code of the Transaction Portfolios to update or insert the properties onto. Together with the scope this uniquely identifies the Transaction Portfolios. (required)
     * @param custodianAccountScope The scope of the Custodian Account to update or insert the properties onto. (required)
     * @param custodianAccountCode The unique ID of the custodian account to create or update properties for. (required)
     * @param requestBody The properties to be updated or inserted onto the Transaction Portfolio. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;CustodianAccount/Manager/Id\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated or inserted properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustodianAccountsPropertiesCall(String scope, String code, String custodianAccountScope, String custodianAccountCode, Map<String, Property> requestBody, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/custodianaccounts/{custodianAccountScope}/{custodianAccountCode}/properties/$upsert"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "custodianAccountScope" + "}", localVarApiClient.escapeString(custodianAccountScope.toString()))
            .replace("{" + "custodianAccountCode" + "}", localVarApiClient.escapeString(custodianAccountCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertCustodianAccountsPropertiesValidateBeforeCall(String scope, String code, String custodianAccountScope, String custodianAccountCode, Map<String, Property> requestBody, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertCustodianAccountsProperties(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertCustodianAccountsProperties(Async)");
        }

        // verify the required parameter 'custodianAccountScope' is set
        if (custodianAccountScope == null) {
            throw new ApiException("Missing the required parameter 'custodianAccountScope' when calling upsertCustodianAccountsProperties(Async)");
        }

        // verify the required parameter 'custodianAccountCode' is set
        if (custodianAccountCode == null) {
            throw new ApiException("Missing the required parameter 'custodianAccountCode' when calling upsertCustodianAccountsProperties(Async)");
        }

        return upsertCustodianAccountsPropertiesCall(scope, code, custodianAccountScope, custodianAccountCode, requestBody, _callback);

    }

    /**
     * [EXPERIMENTAL] UpsertCustodianAccountsProperties: Upsert custodian accounts properties
     * Update or insert one or more properties onto a single custodian account. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;CustodianAccount&#39;.                Upserting a property that exists for a Transaction Portfolios, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param scope The scope of the Transaction Portfolios to update or insert the properties onto. (required)
     * @param code The code of the Transaction Portfolios to update or insert the properties onto. Together with the scope this uniquely identifies the Transaction Portfolios. (required)
     * @param custodianAccountScope The scope of the Custodian Account to update or insert the properties onto. (required)
     * @param custodianAccountCode The unique ID of the custodian account to create or update properties for. (required)
     * @param requestBody The properties to be updated or inserted onto the Transaction Portfolio. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;CustodianAccount/Manager/Id\&quot;. (optional)
     * @return CustodianAccountProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated or inserted properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public CustodianAccountProperties upsertCustodianAccountsProperties(String scope, String code, String custodianAccountScope, String custodianAccountCode, Map<String, Property> requestBody) throws ApiException {
        ApiResponse<CustodianAccountProperties> localVarResp = upsertCustodianAccountsPropertiesWithHttpInfo(scope, code, custodianAccountScope, custodianAccountCode, requestBody);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpsertCustodianAccountsProperties: Upsert custodian accounts properties
     * Update or insert one or more properties onto a single custodian account. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;CustodianAccount&#39;.                Upserting a property that exists for a Transaction Portfolios, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param scope The scope of the Transaction Portfolios to update or insert the properties onto. (required)
     * @param code The code of the Transaction Portfolios to update or insert the properties onto. Together with the scope this uniquely identifies the Transaction Portfolios. (required)
     * @param custodianAccountScope The scope of the Custodian Account to update or insert the properties onto. (required)
     * @param custodianAccountCode The unique ID of the custodian account to create or update properties for. (required)
     * @param requestBody The properties to be updated or inserted onto the Transaction Portfolio. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;CustodianAccount/Manager/Id\&quot;. (optional)
     * @return ApiResponse&lt;CustodianAccountProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated or inserted properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CustodianAccountProperties> upsertCustodianAccountsPropertiesWithHttpInfo(String scope, String code, String custodianAccountScope, String custodianAccountCode, Map<String, Property> requestBody) throws ApiException {
        okhttp3.Call localVarCall = upsertCustodianAccountsPropertiesValidateBeforeCall(scope, code, custodianAccountScope, custodianAccountCode, requestBody, null);
        Type localVarReturnType = new TypeToken<CustodianAccountProperties>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpsertCustodianAccountsProperties: Upsert custodian accounts properties (asynchronously)
     * Update or insert one or more properties onto a single custodian account. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;CustodianAccount&#39;.                Upserting a property that exists for a Transaction Portfolios, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param scope The scope of the Transaction Portfolios to update or insert the properties onto. (required)
     * @param code The code of the Transaction Portfolios to update or insert the properties onto. Together with the scope this uniquely identifies the Transaction Portfolios. (required)
     * @param custodianAccountScope The scope of the Custodian Account to update or insert the properties onto. (required)
     * @param custodianAccountCode The unique ID of the custodian account to create or update properties for. (required)
     * @param requestBody The properties to be updated or inserted onto the Transaction Portfolio. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;CustodianAccount/Manager/Id\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated or inserted properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustodianAccountsPropertiesAsync(String scope, String code, String custodianAccountScope, String custodianAccountCode, Map<String, Property> requestBody, final ApiCallback<CustodianAccountProperties> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertCustodianAccountsPropertiesValidateBeforeCall(scope, code, custodianAccountScope, custodianAccountCode, requestBody, _callback);
        Type localVarReturnType = new TypeToken<CustodianAccountProperties>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertPortfolioDetails
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to create or update for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified. (optional)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = createPortfolioDetails;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/details"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return upsertPortfolioDetailsCall(scope, code, createPortfolioDetails, effectiveAt, _callback);

    }

    /**
     * UpsertPortfolioDetails: Upsert portfolio details
     * Create or update certain details for a particular transaction portfolio. The details are updated if they already exist, and inserted if they do not.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to create or update for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified. (optional)
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
     * UpsertPortfolioDetails: Upsert portfolio details
     * Create or update certain details for a particular transaction portfolio. The details are updated if they already exist, and inserted if they do not.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to create or update for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified. (optional)
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
     * UpsertPortfolioDetails: Upsert portfolio details (asynchronously)
     * Create or update certain details for a particular transaction portfolio. The details are updated if they already exist, and inserted if they do not.                Note that not all elements of a transaction portfolio definition are  modifiable once it has been created due to the potential implications for data already stored.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the               scope this uniquely identifies the transaction portfolio. (required)
     * @param createPortfolioDetails The details to create or update for the specified transaction portfolio. (required)
     * @param effectiveAt The effective datetime or cut label at which the updated or inserted details should become valid.               Defaults to the current LUSID system datetime if not specified. (optional)
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
     * @param transactionId The unique ID of the transaction to create or update properties for. (required)
     * @param requestBody The properties and their associated values to create or update. (required)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions/{transactionId}/properties"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "transactionId" + "}", localVarApiClient.escapeString(transactionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return upsertTransactionPropertiesCall(scope, code, transactionId, requestBody, _callback);

    }

    /**
     * UpsertTransactionProperties: Upsert transaction properties
     * Create or update one or more transaction properties for a single transaction in the transaction portfolio.  Each property will be updated if it already exists and created if it does not.  Both transaction and portfolio must exist at the time when properties are created or updated.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update properties for. (required)
     * @param requestBody The properties and their associated values to create or update. (required)
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
     * UpsertTransactionProperties: Upsert transaction properties
     * Create or update one or more transaction properties for a single transaction in the transaction portfolio.  Each property will be updated if it already exists and created if it does not.  Both transaction and portfolio must exist at the time when properties are created or updated.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update properties for. (required)
     * @param requestBody The properties and their associated values to create or update. (required)
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
     * UpsertTransactionProperties: Upsert transaction properties (asynchronously)
     * Create or update one or more transaction properties for a single transaction in the transaction portfolio.  Each property will be updated if it already exists and created if it does not.  Both transaction and portfolio must exist at the time when properties are created or updated.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionId The unique ID of the transaction to create or update properties for. (required)
     * @param requestBody The properties and their associated values to create or update. (required)
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
     * @param transactionRequest A list of transactions to be created or updated. (required)
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
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = transactionRequest;

        // create path and map variables
        String localVarPath = "/api/transactionportfolios/{scope}/{code}/transactions"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain",
            "application/json",
            "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json-patch+json",
            "application/json",
            "text/json",
            "application/*+json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.5728");
        
        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return upsertTransactionsCall(scope, code, transactionRequest, _callback);

    }

    /**
     * UpsertTransactions: Upsert transactions
     * Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest A list of transactions to be created or updated. (required)
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
     * UpsertTransactions: Upsert transactions
     * Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest A list of transactions to be created or updated. (required)
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
     * UpsertTransactions: Upsert transactions (asynchronously)
     * Create or update transactions in the transaction portfolio. A transaction will be updated  if it already exists and created if it does not.  The maximum number of transactions that this method can upsert per request is 10,000.
     * @param scope The scope of the transaction portfolio. (required)
     * @param code The code of the transaction portfolio. Together with the scope this uniquely identifies              the transaction portfolio. (required)
     * @param transactionRequest A list of transactions to be created or updated. (required)
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
