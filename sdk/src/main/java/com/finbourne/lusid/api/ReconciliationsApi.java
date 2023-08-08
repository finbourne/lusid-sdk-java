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


import com.finbourne.lusid.model.CreateReconciliationRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.InlineValuationsReconciliationRequest;
import com.finbourne.lusid.model.ListAggregationReconciliation;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import com.finbourne.lusid.model.Mapping;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfReconciliation;
import com.finbourne.lusid.model.PagedResourceListOfReconciliationRun;
import com.finbourne.lusid.model.PagedResourceListOfReconciliationRunBreak;
import com.finbourne.lusid.model.PortfoliosReconciliationRequest;
import com.finbourne.lusid.model.Reconciliation;
import com.finbourne.lusid.model.ReconciliationRequest;
import com.finbourne.lusid.model.ReconciliationResponse;
import com.finbourne.lusid.model.ReconciliationRun;
import com.finbourne.lusid.model.ReconciliationRunBreak;
import com.finbourne.lusid.model.ResourceListOfMapping;
import com.finbourne.lusid.model.ResourceListOfReconciliationBreak;
import com.finbourne.lusid.model.TransactionReconciliationRequest;
import com.finbourne.lusid.model.TransactionsReconciliationsResponse;
import com.finbourne.lusid.model.UpdateReconciliationRequest;
import com.finbourne.lusid.model.UpsertReconciliationBreakRequest;
import com.finbourne.lusid.model.UpsertReconciliationRunRequest;
import com.finbourne.lusid.model.ValuationsReconciliationRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReconciliationsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReconciliationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReconciliationsApi(ApiClient apiClient) {
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
     * Build call for createScheduledReconciliation
     * @param scope The scope of the reconciliation (required)
     * @param createReconciliationRequest The definition of the reconciliation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createScheduledReconciliationCall(String scope, CreateReconciliationRequest createReconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = createReconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}"
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
    private okhttp3.Call createScheduledReconciliationValidateBeforeCall(String scope, CreateReconciliationRequest createReconciliationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createScheduledReconciliation(Async)");
        }

        return createScheduledReconciliationCall(scope, createReconciliationRequest, _callback);

    }

    /**
     * [EXPERIMENTAL] CreateScheduledReconciliation: Create a scheduled reconciliation
     * Create a scheduled reconciliation for the given request
     * @param scope The scope of the reconciliation (required)
     * @param createReconciliationRequest The definition of the reconciliation (optional)
     * @return Reconciliation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Reconciliation createScheduledReconciliation(String scope, CreateReconciliationRequest createReconciliationRequest) throws ApiException {
        ApiResponse<Reconciliation> localVarResp = createScheduledReconciliationWithHttpInfo(scope, createReconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] CreateScheduledReconciliation: Create a scheduled reconciliation
     * Create a scheduled reconciliation for the given request
     * @param scope The scope of the reconciliation (required)
     * @param createReconciliationRequest The definition of the reconciliation (optional)
     * @return ApiResponse&lt;Reconciliation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Reconciliation> createScheduledReconciliationWithHttpInfo(String scope, CreateReconciliationRequest createReconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = createScheduledReconciliationValidateBeforeCall(scope, createReconciliationRequest, null);
        Type localVarReturnType = new TypeToken<Reconciliation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] CreateScheduledReconciliation: Create a scheduled reconciliation (asynchronously)
     * Create a scheduled reconciliation for the given request
     * @param scope The scope of the reconciliation (required)
     * @param createReconciliationRequest The definition of the reconciliation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createScheduledReconciliationAsync(String scope, CreateReconciliationRequest createReconciliationRequest, final ApiCallback<Reconciliation> _callback) throws ApiException {

        okhttp3.Call localVarCall = createScheduledReconciliationValidateBeforeCall(scope, createReconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<Reconciliation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteReconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The reconciliation at the requested as at was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationCall(String scope, String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}"
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
    private okhttp3.Call deleteReconciliationValidateBeforeCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteReconciliation(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteReconciliation(Async)");
        }

        return deleteReconciliationCall(scope, code, _callback);

    }

    /**
     * [EXPERIMENTAL] DeleteReconciliation: Delete scheduled reconciliation
     * Delete the given scheduled reconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The reconciliation at the requested as at was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteReconciliation(String scope, String code) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteReconciliationWithHttpInfo(scope, code);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] DeleteReconciliation: Delete scheduled reconciliation
     * Delete the given scheduled reconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The reconciliation at the requested as at was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteReconciliationWithHttpInfo(String scope, String code) throws ApiException {
        okhttp3.Call localVarCall = deleteReconciliationValidateBeforeCall(scope, code, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] DeleteReconciliation: Delete scheduled reconciliation (asynchronously)
     * Delete the given scheduled reconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The reconciliation at the requested as at was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationAsync(String scope, String code, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteReconciliationValidateBeforeCall(scope, code, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteReconciliationBreak
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation break was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationBreakCall(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}/breaks/{breakId}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "runDate" + "}", localVarApiClient.escapeString(runDate.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "breakId" + "}", localVarApiClient.escapeString(breakId.toString()));

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
    private okhttp3.Call deleteReconciliationBreakValidateBeforeCall(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteReconciliationBreak(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteReconciliationBreak(Async)");
        }

        // verify the required parameter 'runDate' is set
        if (runDate == null) {
            throw new ApiException("Missing the required parameter 'runDate' when calling deleteReconciliationBreak(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteReconciliationBreak(Async)");
        }

        // verify the required parameter 'breakId' is set
        if (breakId == null) {
            throw new ApiException("Missing the required parameter 'breakId' when calling deleteReconciliationBreak(Async)");
        }

        return deleteReconciliationBreakCall(scope, code, runDate, version, breakId, _callback);

    }

    /**
     * [EXPERIMENTAL] DeleteReconciliationBreak: Delete reconciliation break
     * Delete the given reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation break was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteReconciliationBreak(String scope, String code, OffsetDateTime runDate, Integer version, String breakId) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteReconciliationBreakWithHttpInfo(scope, code, runDate, version, breakId);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] DeleteReconciliationBreak: Delete reconciliation break
     * Delete the given reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation break was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteReconciliationBreakWithHttpInfo(String scope, String code, OffsetDateTime runDate, Integer version, String breakId) throws ApiException {
        okhttp3.Call localVarCall = deleteReconciliationBreakValidateBeforeCall(scope, code, runDate, version, breakId, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] DeleteReconciliationBreak: Delete reconciliation break (asynchronously)
     * Delete the given reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation break was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationBreakAsync(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteReconciliationBreakValidateBeforeCall(scope, code, runDate, version, breakId, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteReconciliationMapping
     * @param scope The scope of the mapping. (required)
     * @param code The code fof the mapping. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A string specifying the scope and code that were deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationMappingCall(String scope, String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/mapping/{scope}/{code}"
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
    private okhttp3.Call deleteReconciliationMappingValidateBeforeCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteReconciliationMapping(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteReconciliationMapping(Async)");
        }

        return deleteReconciliationMappingCall(scope, code, _callback);

    }

    /**
     * [EARLY ACCESS] DeleteReconciliationMapping: Delete a mapping
     * Deletes the mapping identified by the scope and code
     * @param scope The scope of the mapping. (required)
     * @param code The code fof the mapping. (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A string specifying the scope and code that were deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public String deleteReconciliationMapping(String scope, String code) throws ApiException {
        ApiResponse<String> localVarResp = deleteReconciliationMappingWithHttpInfo(scope, code);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteReconciliationMapping: Delete a mapping
     * Deletes the mapping identified by the scope and code
     * @param scope The scope of the mapping. (required)
     * @param code The code fof the mapping. (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A string specifying the scope and code that were deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> deleteReconciliationMappingWithHttpInfo(String scope, String code) throws ApiException {
        okhttp3.Call localVarCall = deleteReconciliationMappingValidateBeforeCall(scope, code, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteReconciliationMapping: Delete a mapping (asynchronously)
     * Deletes the mapping identified by the scope and code
     * @param scope The scope of the mapping. (required)
     * @param code The code fof the mapping. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A string specifying the scope and code that were deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationMappingAsync(String scope, String code, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteReconciliationMappingValidateBeforeCall(scope, code, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteReconciliationRun
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the reconciliation run (required)
     * @param version The version number of the reconciliation run (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation run was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationRunCall(String scope, String code, OffsetDateTime runDate, Integer version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "runDate" + "}", localVarApiClient.escapeString(runDate.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()));

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
    private okhttp3.Call deleteReconciliationRunValidateBeforeCall(String scope, String code, OffsetDateTime runDate, Integer version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteReconciliationRun(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteReconciliationRun(Async)");
        }

        // verify the required parameter 'runDate' is set
        if (runDate == null) {
            throw new ApiException("Missing the required parameter 'runDate' when calling deleteReconciliationRun(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteReconciliationRun(Async)");
        }

        return deleteReconciliationRunCall(scope, code, runDate, version, _callback);

    }

    /**
     * [EXPERIMENTAL] DeleteReconciliationRun: Delete reconciliation run
     * Delete the given reconciliation run
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the reconciliation run (required)
     * @param version The version number of the reconciliation run (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation run was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteReconciliationRun(String scope, String code, OffsetDateTime runDate, Integer version) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteReconciliationRunWithHttpInfo(scope, code, runDate, version);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] DeleteReconciliationRun: Delete reconciliation run
     * Delete the given reconciliation run
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the reconciliation run (required)
     * @param version The version number of the reconciliation run (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation run was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteReconciliationRunWithHttpInfo(String scope, String code, OffsetDateTime runDate, Integer version) throws ApiException {
        okhttp3.Call localVarCall = deleteReconciliationRunValidateBeforeCall(scope, code, runDate, version, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] DeleteReconciliationRun: Delete reconciliation run (asynchronously)
     * Delete the given reconciliation run
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the reconciliation run (required)
     * @param version The version number of the reconciliation run (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the reconciliation run was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteReconciliationRunAsync(String scope, String code, OffsetDateTime runDate, Integer version, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteReconciliationRunValidateBeforeCall(scope, code, runDate, version, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the scheduled reconciliation. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the scheduled reconciliation. Defaults to returning the latest version of the reconciliation if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; property domain to decorate onto the reconciliation.              These must take the form {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}"
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
    private okhttp3.Call getReconciliationValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getReconciliation(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getReconciliation(Async)");
        }

        return getReconciliationCall(scope, code, effectiveAt, asAt, propertyKeys, _callback);

    }

    /**
     * [EXPERIMENTAL] GetReconciliation: Get scheduled reconciliation
     * Get the requested scheduled reconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the scheduled reconciliation. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the scheduled reconciliation. Defaults to returning the latest version of the reconciliation if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; property domain to decorate onto the reconciliation.              These must take the form {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @return Reconciliation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Reconciliation getReconciliation(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        ApiResponse<Reconciliation> localVarResp = getReconciliationWithHttpInfo(scope, code, effectiveAt, asAt, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetReconciliation: Get scheduled reconciliation
     * Get the requested scheduled reconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the scheduled reconciliation. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the scheduled reconciliation. Defaults to returning the latest version of the reconciliation if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; property domain to decorate onto the reconciliation.              These must take the form {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @return ApiResponse&lt;Reconciliation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Reconciliation> getReconciliationWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = getReconciliationValidateBeforeCall(scope, code, effectiveAt, asAt, propertyKeys, null);
        Type localVarReturnType = new TypeToken<Reconciliation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetReconciliation: Get scheduled reconciliation (asynchronously)
     * Get the requested scheduled reconciliation
     * @param scope The scope of the scheduled reconciliation (required)
     * @param code The code of the scheduled reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the scheduled reconciliation. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the scheduled reconciliation. Defaults to returning the latest version of the reconciliation if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; property domain to decorate onto the reconciliation.              These must take the form {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, final ApiCallback<Reconciliation> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReconciliationValidateBeforeCall(scope, code, effectiveAt, asAt, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<Reconciliation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReconciliationBreak
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @param asAt The asAt datetime at which to retrieve the reconciliation break. Defaults to returning the latest version of the reconciliation break if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationBreakCall(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}/breaks/{breakId}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "runDate" + "}", localVarApiClient.escapeString(runDate.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "breakId" + "}", localVarApiClient.escapeString(breakId.toString()));

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
    private okhttp3.Call getReconciliationBreakValidateBeforeCall(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getReconciliationBreak(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getReconciliationBreak(Async)");
        }

        // verify the required parameter 'runDate' is set
        if (runDate == null) {
            throw new ApiException("Missing the required parameter 'runDate' when calling getReconciliationBreak(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getReconciliationBreak(Async)");
        }

        // verify the required parameter 'breakId' is set
        if (breakId == null) {
            throw new ApiException("Missing the required parameter 'breakId' when calling getReconciliationBreak(Async)");
        }

        return getReconciliationBreakCall(scope, code, runDate, version, breakId, asAt, _callback);

    }

    /**
     * [EXPERIMENTAL] GetReconciliationBreak: Get reconciliation break
     * Get the requested reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @param asAt The asAt datetime at which to retrieve the reconciliation break. Defaults to returning the latest version of the reconciliation break if not specified. (optional)
     * @return ReconciliationRunBreak
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ReconciliationRunBreak getReconciliationBreak(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, OffsetDateTime asAt) throws ApiException {
        ApiResponse<ReconciliationRunBreak> localVarResp = getReconciliationBreakWithHttpInfo(scope, code, runDate, version, breakId, asAt);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetReconciliationBreak: Get reconciliation break
     * Get the requested reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @param asAt The asAt datetime at which to retrieve the reconciliation break. Defaults to returning the latest version of the reconciliation break if not specified. (optional)
     * @return ApiResponse&lt;ReconciliationRunBreak&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReconciliationRunBreak> getReconciliationBreakWithHttpInfo(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getReconciliationBreakValidateBeforeCall(scope, code, runDate, version, breakId, asAt, null);
        Type localVarReturnType = new TypeToken<ReconciliationRunBreak>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetReconciliationBreak: Get reconciliation break (asynchronously)
     * Get the requested reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param breakId The unique identifier for the break (required)
     * @param asAt The asAt datetime at which to retrieve the reconciliation break. Defaults to returning the latest version of the reconciliation break if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationBreakAsync(String scope, String code, OffsetDateTime runDate, Integer version, String breakId, OffsetDateTime asAt, final ApiCallback<ReconciliationRunBreak> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReconciliationBreakValidateBeforeCall(scope, code, runDate, version, breakId, asAt, _callback);
        Type localVarReturnType = new TypeToken<ReconciliationRunBreak>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReconciliationMapping
     * @param scope The scope of the mapping. (required)
     * @param code The code of the mapping. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mapping with the specified scope/code. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationMappingCall(String scope, String code, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/mapping/{scope}/{code}"
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
    private okhttp3.Call getReconciliationMappingValidateBeforeCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getReconciliationMapping(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getReconciliationMapping(Async)");
        }

        return getReconciliationMappingCall(scope, code, _callback);

    }

    /**
     * [EARLY ACCESS] GetReconciliationMapping: Get a mapping
     * Gets a mapping identified by the given scope and code
     * @param scope The scope of the mapping. (required)
     * @param code The code of the mapping. (required)
     * @return Mapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mapping with the specified scope/code. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Mapping getReconciliationMapping(String scope, String code) throws ApiException {
        ApiResponse<Mapping> localVarResp = getReconciliationMappingWithHttpInfo(scope, code);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetReconciliationMapping: Get a mapping
     * Gets a mapping identified by the given scope and code
     * @param scope The scope of the mapping. (required)
     * @param code The code of the mapping. (required)
     * @return ApiResponse&lt;Mapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mapping with the specified scope/code. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Mapping> getReconciliationMappingWithHttpInfo(String scope, String code) throws ApiException {
        okhttp3.Call localVarCall = getReconciliationMappingValidateBeforeCall(scope, code, null);
        Type localVarReturnType = new TypeToken<Mapping>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetReconciliationMapping: Get a mapping (asynchronously)
     * Gets a mapping identified by the given scope and code
     * @param scope The scope of the mapping. (required)
     * @param code The code of the mapping. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mapping with the specified scope/code. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationMappingAsync(String scope, String code, final ApiCallback<Mapping> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReconciliationMappingValidateBeforeCall(scope, code, _callback);
        Type localVarReturnType = new TypeToken<Mapping>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReconciliationRun
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the run (required)
     * @param version The version number of the run (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the reconciliation run. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the reconciliation run. Defaults to returning the latest version of the reconciliation run if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationRunCall(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "runDate" + "}", localVarApiClient.escapeString(runDate.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()));

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
    private okhttp3.Call getReconciliationRunValidateBeforeCall(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getReconciliationRun(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getReconciliationRun(Async)");
        }

        // verify the required parameter 'runDate' is set
        if (runDate == null) {
            throw new ApiException("Missing the required parameter 'runDate' when calling getReconciliationRun(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getReconciliationRun(Async)");
        }

        return getReconciliationRunCall(scope, code, runDate, version, effectiveAt, asAt, _callback);

    }

    /**
     * [EXPERIMENTAL] GetReconciliationRun: Get a reconciliation run
     * Get the requested reconciliation run
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the run (required)
     * @param version The version number of the run (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the reconciliation run. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the reconciliation run. Defaults to returning the latest version of the reconciliation run if not specified. (optional)
     * @return ReconciliationRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ReconciliationRun getReconciliationRun(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<ReconciliationRun> localVarResp = getReconciliationRunWithHttpInfo(scope, code, runDate, version, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] GetReconciliationRun: Get a reconciliation run
     * Get the requested reconciliation run
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the run (required)
     * @param version The version number of the run (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the reconciliation run. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the reconciliation run. Defaults to returning the latest version of the reconciliation run if not specified. (optional)
     * @return ApiResponse&lt;ReconciliationRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReconciliationRun> getReconciliationRunWithHttpInfo(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getReconciliationRunValidateBeforeCall(scope, code, runDate, version, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<ReconciliationRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] GetReconciliationRun: Get a reconciliation run (asynchronously)
     * Get the requested reconciliation run
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param runDate The date of the run (required)
     * @param version The version number of the run (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the reconciliation run. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the reconciliation run. Defaults to returning the latest version of the reconciliation run if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReconciliationRunAsync(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, final ApiCallback<ReconciliationRun> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReconciliationRunValidateBeforeCall(scope, code, runDate, version, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<ReconciliationRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listReconciliationBreaks
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation breaks </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationBreaksCall(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}/breaks"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "runDate" + "}", localVarApiClient.escapeString(runDate.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()));

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
    private okhttp3.Call listReconciliationBreaksValidateBeforeCall(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listReconciliationBreaks(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling listReconciliationBreaks(Async)");
        }

        // verify the required parameter 'runDate' is set
        if (runDate == null) {
            throw new ApiException("Missing the required parameter 'runDate' when calling listReconciliationBreaks(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling listReconciliationBreaks(Async)");
        }

        return listReconciliationBreaksCall(scope, code, runDate, version, effectiveAt, asAt, page, start, limit, filter, _callback);

    }

    /**
     * [EXPERIMENTAL] ListReconciliationBreaks: List reconciliation breaks
     * List all reconciliation breaks associated with a given run
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @return PagedResourceListOfReconciliationRunBreak
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation breaks </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfReconciliationRunBreak listReconciliationBreaks(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter) throws ApiException {
        ApiResponse<PagedResourceListOfReconciliationRunBreak> localVarResp = listReconciliationBreaksWithHttpInfo(scope, code, runDate, version, effectiveAt, asAt, page, start, limit, filter);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListReconciliationBreaks: List reconciliation breaks
     * List all reconciliation breaks associated with a given run
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @return ApiResponse&lt;PagedResourceListOfReconciliationRunBreak&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation breaks </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfReconciliationRunBreak> listReconciliationBreaksWithHttpInfo(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = listReconciliationBreaksValidateBeforeCall(scope, code, runDate, version, effectiveAt, asAt, page, start, limit, filter, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfReconciliationRunBreak>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListReconciliationBreaks: List reconciliation breaks (asynchronously)
     * List all reconciliation breaks associated with a given run
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation breaks </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationBreaksAsync(String scope, String code, OffsetDateTime runDate, Integer version, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, final ApiCallback<PagedResourceListOfReconciliationRunBreak> _callback) throws ApiException {

        okhttp3.Call localVarCall = listReconciliationBreaksValidateBeforeCall(scope, code, runDate, version, effectiveAt, asAt, page, start, limit, filter, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfReconciliationRunBreak>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listReconciliationMappings
     * @param reconciliationType Optional parameter to specify which type of mappings should be returned.  Defaults to Transaction if not provided. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mappings that the caller has access to. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationMappingsCall(String reconciliationType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/mapping";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (reconciliationType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reconciliationType", reconciliationType));
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
    private okhttp3.Call listReconciliationMappingsValidateBeforeCall(String reconciliationType, final ApiCallback _callback) throws ApiException {
        return listReconciliationMappingsCall(reconciliationType, _callback);

    }

    /**
     * [EARLY ACCESS] ListReconciliationMappings: List the reconciliation mappings
     * Lists all mappings this user is entitled to see
     * @param reconciliationType Optional parameter to specify which type of mappings should be returned.  Defaults to Transaction if not provided. (optional)
     * @return ResourceListOfMapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mappings that the caller has access to. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfMapping listReconciliationMappings(String reconciliationType) throws ApiException {
        ApiResponse<ResourceListOfMapping> localVarResp = listReconciliationMappingsWithHttpInfo(reconciliationType);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ListReconciliationMappings: List the reconciliation mappings
     * Lists all mappings this user is entitled to see
     * @param reconciliationType Optional parameter to specify which type of mappings should be returned.  Defaults to Transaction if not provided. (optional)
     * @return ApiResponse&lt;ResourceListOfMapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mappings that the caller has access to. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfMapping> listReconciliationMappingsWithHttpInfo(String reconciliationType) throws ApiException {
        okhttp3.Call localVarCall = listReconciliationMappingsValidateBeforeCall(reconciliationType, null);
        Type localVarReturnType = new TypeToken<ResourceListOfMapping>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ListReconciliationMappings: List the reconciliation mappings (asynchronously)
     * Lists all mappings this user is entitled to see
     * @param reconciliationType Optional parameter to specify which type of mappings should be returned.  Defaults to Transaction if not provided. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The mappings that the caller has access to. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationMappingsAsync(String reconciliationType, final ApiCallback<ResourceListOfMapping> _callback) throws ApiException {

        okhttp3.Call localVarCall = listReconciliationMappingsValidateBeforeCall(reconciliationType, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfMapping>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listReconciliationRuns
     * @param scope The scope of the reconciliation (required)
     * @param code The code of the reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the run date, specify \&quot;Date eq 10/03/2018\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation runs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationRunsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs"
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
    private okhttp3.Call listReconciliationRunsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listReconciliationRuns(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling listReconciliationRuns(Async)");
        }

        return listReconciliationRunsCall(scope, code, effectiveAt, asAt, page, start, limit, filter, _callback);

    }

    /**
     * [EXPERIMENTAL] ListReconciliationRuns: List Reconciliation runs
     * List all runs for a given reconciliation
     * @param scope The scope of the reconciliation (required)
     * @param code The code of the reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the run date, specify \&quot;Date eq 10/03/2018\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @return PagedResourceListOfReconciliationRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation runs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfReconciliationRun listReconciliationRuns(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter) throws ApiException {
        ApiResponse<PagedResourceListOfReconciliationRun> localVarResp = listReconciliationRunsWithHttpInfo(scope, code, effectiveAt, asAt, page, start, limit, filter);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListReconciliationRuns: List Reconciliation runs
     * List all runs for a given reconciliation
     * @param scope The scope of the reconciliation (required)
     * @param code The code of the reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the run date, specify \&quot;Date eq 10/03/2018\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @return ApiResponse&lt;PagedResourceListOfReconciliationRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation runs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfReconciliationRun> listReconciliationRunsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter) throws ApiException {
        okhttp3.Call localVarCall = listReconciliationRunsValidateBeforeCall(scope, code, effectiveAt, asAt, page, start, limit, filter, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfReconciliationRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListReconciliationRuns: List Reconciliation runs (asynchronously)
     * List all runs for a given reconciliation
     * @param scope The scope of the reconciliation (required)
     * @param code The code of the reconciliation (required)
     * @param effectiveAt The effective datetime or cut label at which to list the reconciliation runs. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation runs. Defaults to returning the latest version              of each run if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliation runs; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the run date, specify \&quot;Date eq 10/03/2018\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation runs </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationRunsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, final ApiCallback<PagedResourceListOfReconciliationRun> _callback) throws ApiException {

        okhttp3.Call localVarCall = listReconciliationRunsValidateBeforeCall(scope, code, effectiveAt, asAt, page, start, limit, filter, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfReconciliationRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listReconciliations
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties for the reconciliation. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation. Defaults to returning the latest version              of each reconciliation if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliations; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the reconciliation type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; domain to decorate onto each reconciliation.              These must take the format {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of all scheduled reconciliations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationsCall(String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/portfolios/$scheduledReconciliations";

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
    private okhttp3.Call listReconciliationsValidateBeforeCall(String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback _callback) throws ApiException {
        return listReconciliationsCall(effectiveAt, asAt, page, start, limit, filter, propertyKeys, _callback);

    }

    /**
     * [EXPERIMENTAL] ListReconciliations: List scheduled reconciliations
     * List all the scheduled reconciliations matching particular criteria
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties for the reconciliation. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation. Defaults to returning the latest version              of each reconciliation if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliations; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the reconciliation type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; domain to decorate onto each reconciliation.              These must take the format {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @return PagedResourceListOfReconciliation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of all scheduled reconciliations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfReconciliation listReconciliations(String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        ApiResponse<PagedResourceListOfReconciliation> localVarResp = listReconciliationsWithHttpInfo(effectiveAt, asAt, page, start, limit, filter, propertyKeys);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] ListReconciliations: List scheduled reconciliations
     * List all the scheduled reconciliations matching particular criteria
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties for the reconciliation. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation. Defaults to returning the latest version              of each reconciliation if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliations; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the reconciliation type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; domain to decorate onto each reconciliation.              These must take the format {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @return ApiResponse&lt;PagedResourceListOfReconciliation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of all scheduled reconciliations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfReconciliation> listReconciliationsWithHttpInfo(String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys) throws ApiException {
        okhttp3.Call localVarCall = listReconciliationsValidateBeforeCall(effectiveAt, asAt, page, start, limit, filter, propertyKeys, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfReconciliation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] ListReconciliations: List scheduled reconciliations (asynchronously)
     * List all the scheduled reconciliations matching particular criteria
     * @param effectiveAt The effective datetime or cut label at which to list the TimeVariant properties for the reconciliation. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the reconciliation. Defaults to returning the latest version              of each reconciliation if not specified. (optional)
     * @param page The pagination token to use to continue listing reconciliations; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results.              For example, to filter on the reconciliation type, specify \&quot;id.Code eq &#39;001&#39;\&quot;. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param propertyKeys A list of property keys from the &#39;Reconciliation&#39; domain to decorate onto each reconciliation.              These must take the format {domain}/{scope}/{code}, for example &#39;Reconciliation/Broker/Id&#39;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of all scheduled reconciliations </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listReconciliationsAsync(String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, final ApiCallback<PagedResourceListOfReconciliation> _callback) throws ApiException {

        okhttp3.Call localVarCall = listReconciliationsValidateBeforeCall(effectiveAt, asAt, page, start, limit, filter, propertyKeys, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfReconciliation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reconcileGeneric
     * @param reconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileGenericCall(ReconciliationRequest reconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = reconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$reconcileGeneric";

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
    private okhttp3.Call reconcileGenericValidateBeforeCall(ReconciliationRequest reconciliationRequest, final ApiCallback _callback) throws ApiException {
        return reconcileGenericCall(reconciliationRequest, _callback);

    }

    /**
     * ReconcileGeneric: Reconcile either holdings or valuations performed on one or two sets of holdings using one or two configuration recipes.                The output is configurable for various types of comparisons, to allow tolerances on numerical and date-time data or case-insensitivity on strings,  and elision of resulting differences where they are &#39;empty&#39; or null or zero.
     * Perform evaluation of one or two set of holdings (a portfolio of instruments) using one or two (potentially different) configuration recipes.  Produce a breakdown of the resulting differences in evaluation that can be iterated through.
     * @param reconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ReconciliationResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ReconciliationResponse reconcileGeneric(ReconciliationRequest reconciliationRequest) throws ApiException {
        ApiResponse<ReconciliationResponse> localVarResp = reconcileGenericWithHttpInfo(reconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * ReconcileGeneric: Reconcile either holdings or valuations performed on one or two sets of holdings using one or two configuration recipes.                The output is configurable for various types of comparisons, to allow tolerances on numerical and date-time data or case-insensitivity on strings,  and elision of resulting differences where they are &#39;empty&#39; or null or zero.
     * Perform evaluation of one or two set of holdings (a portfolio of instruments) using one or two (potentially different) configuration recipes.  Produce a breakdown of the resulting differences in evaluation that can be iterated through.
     * @param reconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ApiResponse&lt;ReconciliationResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReconciliationResponse> reconcileGenericWithHttpInfo(ReconciliationRequest reconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = reconcileGenericValidateBeforeCall(reconciliationRequest, null);
        Type localVarReturnType = new TypeToken<ReconciliationResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ReconcileGeneric: Reconcile either holdings or valuations performed on one or two sets of holdings using one or two configuration recipes.                The output is configurable for various types of comparisons, to allow tolerances on numerical and date-time data or case-insensitivity on strings,  and elision of resulting differences where they are &#39;empty&#39; or null or zero. (asynchronously)
     * Perform evaluation of one or two set of holdings (a portfolio of instruments) using one or two (potentially different) configuration recipes.  Produce a breakdown of the resulting differences in evaluation that can be iterated through.
     * @param reconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileGenericAsync(ReconciliationRequest reconciliationRequest, final ApiCallback<ReconciliationResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconcileGenericValidateBeforeCall(reconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<ReconciliationResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reconcileHoldings
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set.              For example, to filter on the left portfolio Code, use \&quot;left.portfolioId.code eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param portfoliosReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileHoldingsCall(List<String> sortBy, Integer start, Integer limit, String filter, PortfoliosReconciliationRequest portfoliosReconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = portfoliosReconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$reconcileholdings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
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
    private okhttp3.Call reconcileHoldingsValidateBeforeCall(List<String> sortBy, Integer start, Integer limit, String filter, PortfoliosReconciliationRequest portfoliosReconciliationRequest, final ApiCallback _callback) throws ApiException {
        return reconcileHoldingsCall(sortBy, start, limit, filter, portfoliosReconciliationRequest, _callback);

    }

    /**
     * [EARLY ACCESS] ReconcileHoldings: Reconcile portfolio holdings
     * Reconcile the holdings of two portfolios.
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set.              For example, to filter on the left portfolio Code, use \&quot;left.portfolioId.code eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param portfoliosReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ResourceListOfReconciliationBreak
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfReconciliationBreak reconcileHoldings(List<String> sortBy, Integer start, Integer limit, String filter, PortfoliosReconciliationRequest portfoliosReconciliationRequest) throws ApiException {
        ApiResponse<ResourceListOfReconciliationBreak> localVarResp = reconcileHoldingsWithHttpInfo(sortBy, start, limit, filter, portfoliosReconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ReconcileHoldings: Reconcile portfolio holdings
     * Reconcile the holdings of two portfolios.
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set.              For example, to filter on the left portfolio Code, use \&quot;left.portfolioId.code eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param portfoliosReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ApiResponse&lt;ResourceListOfReconciliationBreak&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfReconciliationBreak> reconcileHoldingsWithHttpInfo(List<String> sortBy, Integer start, Integer limit, String filter, PortfoliosReconciliationRequest portfoliosReconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = reconcileHoldingsValidateBeforeCall(sortBy, start, limit, filter, portfoliosReconciliationRequest, null);
        Type localVarReturnType = new TypeToken<ResourceListOfReconciliationBreak>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ReconcileHoldings: Reconcile portfolio holdings (asynchronously)
     * Reconcile the holdings of two portfolios.
     * @param sortBy Optional. Order the results by these fields. Use use the &#39;-&#39; sign to denote descending order e.g. -MyFieldName (optional)
     * @param start Optional. When paginating, skip this number of results (optional)
     * @param limit Optional. When paginating, limit the number of returned results to this many. (optional)
     * @param filter Optional. Expression to filter the result set.              For example, to filter on the left portfolio Code, use \&quot;left.portfolioId.code eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param portfoliosReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileHoldingsAsync(List<String> sortBy, Integer start, Integer limit, String filter, PortfoliosReconciliationRequest portfoliosReconciliationRequest, final ApiCallback<ResourceListOfReconciliationBreak> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconcileHoldingsValidateBeforeCall(sortBy, start, limit, filter, portfoliosReconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfReconciliationBreak>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reconcileInline
     * @param inlineValuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileInlineCall(InlineValuationsReconciliationRequest inlineValuationsReconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = inlineValuationsReconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$reconcileInline";

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
    private okhttp3.Call reconcileInlineValidateBeforeCall(InlineValuationsReconciliationRequest inlineValuationsReconciliationRequest, final ApiCallback _callback) throws ApiException {
        return reconcileInlineCall(inlineValuationsReconciliationRequest, _callback);

    }

    /**
     * ReconcileInline: Reconcile valuations performed on one or two sets of inline instruments using one or two configuration recipes.
     * Perform valuation of one or two set of inline instruments using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.
     * @param inlineValuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ListAggregationReconciliation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ListAggregationReconciliation reconcileInline(InlineValuationsReconciliationRequest inlineValuationsReconciliationRequest) throws ApiException {
        ApiResponse<ListAggregationReconciliation> localVarResp = reconcileInlineWithHttpInfo(inlineValuationsReconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * ReconcileInline: Reconcile valuations performed on one or two sets of inline instruments using one or two configuration recipes.
     * Perform valuation of one or two set of inline instruments using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.
     * @param inlineValuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ApiResponse&lt;ListAggregationReconciliation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListAggregationReconciliation> reconcileInlineWithHttpInfo(InlineValuationsReconciliationRequest inlineValuationsReconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = reconcileInlineValidateBeforeCall(inlineValuationsReconciliationRequest, null);
        Type localVarReturnType = new TypeToken<ListAggregationReconciliation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ReconcileInline: Reconcile valuations performed on one or two sets of inline instruments using one or two configuration recipes. (asynchronously)
     * Perform valuation of one or two set of inline instruments using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.
     * @param inlineValuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileInlineAsync(InlineValuationsReconciliationRequest inlineValuationsReconciliationRequest, final ApiCallback<ListAggregationReconciliation> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconcileInlineValidateBeforeCall(inlineValuationsReconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<ListAggregationReconciliation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reconcileTransactions
     * @param transactionReconciliationRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction reconciliation data for the supplied portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileTransactionsCall(TransactionReconciliationRequest transactionReconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = transactionReconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$reconcileTransactions";

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
    private okhttp3.Call reconcileTransactionsValidateBeforeCall(TransactionReconciliationRequest transactionReconciliationRequest, final ApiCallback _callback) throws ApiException {
        return reconcileTransactionsCall(transactionReconciliationRequest, _callback);

    }

    /**
     * [EARLY ACCESS] ReconcileTransactions: Perform a Transactions Reconciliation.
     * Evaluates two sets of transactions to determine which transactions from each set likely match  using the rules of a specified mapping.
     * @param transactionReconciliationRequest  (optional)
     * @return TransactionsReconciliationsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction reconciliation data for the supplied portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public TransactionsReconciliationsResponse reconcileTransactions(TransactionReconciliationRequest transactionReconciliationRequest) throws ApiException {
        ApiResponse<TransactionsReconciliationsResponse> localVarResp = reconcileTransactionsWithHttpInfo(transactionReconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ReconcileTransactions: Perform a Transactions Reconciliation.
     * Evaluates two sets of transactions to determine which transactions from each set likely match  using the rules of a specified mapping.
     * @param transactionReconciliationRequest  (optional)
     * @return ApiResponse&lt;TransactionsReconciliationsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction reconciliation data for the supplied portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TransactionsReconciliationsResponse> reconcileTransactionsWithHttpInfo(TransactionReconciliationRequest transactionReconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = reconcileTransactionsValidateBeforeCall(transactionReconciliationRequest, null);
        Type localVarReturnType = new TypeToken<TransactionsReconciliationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ReconcileTransactions: Perform a Transactions Reconciliation. (asynchronously)
     * Evaluates two sets of transactions to determine which transactions from each set likely match  using the rules of a specified mapping.
     * @param transactionReconciliationRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The transaction reconciliation data for the supplied portfolios. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileTransactionsAsync(TransactionReconciliationRequest transactionReconciliationRequest, final ApiCallback<TransactionsReconciliationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconcileTransactionsValidateBeforeCall(transactionReconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<TransactionsReconciliationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for reconcileValuation
     * @param valuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileValuationCall(ValuationsReconciliationRequest valuationsReconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = valuationsReconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$reconcileValuation";

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
    private okhttp3.Call reconcileValuationValidateBeforeCall(ValuationsReconciliationRequest valuationsReconciliationRequest, final ApiCallback _callback) throws ApiException {
        return reconcileValuationCall(valuationsReconciliationRequest, _callback);

    }

    /**
     * ReconcileValuation: Reconcile valuations performed on one or two sets of holdings using one or two configuration recipes.
     * Perform valuation of one or two set of holdings using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.
     * @param valuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ListAggregationReconciliation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ListAggregationReconciliation reconcileValuation(ValuationsReconciliationRequest valuationsReconciliationRequest) throws ApiException {
        ApiResponse<ListAggregationReconciliation> localVarResp = reconcileValuationWithHttpInfo(valuationsReconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * ReconcileValuation: Reconcile valuations performed on one or two sets of holdings using one or two configuration recipes.
     * Perform valuation of one or two set of holdings using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.
     * @param valuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @return ApiResponse&lt;ListAggregationReconciliation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListAggregationReconciliation> reconcileValuationWithHttpInfo(ValuationsReconciliationRequest valuationsReconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = reconcileValuationValidateBeforeCall(valuationsReconciliationRequest, null);
        Type localVarReturnType = new TypeToken<ListAggregationReconciliation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ReconcileValuation: Reconcile valuations performed on one or two sets of holdings using one or two configuration recipes. (asynchronously)
     * Perform valuation of one or two set of holdings using different one or two configuration recipes. Produce a breakdown of the resulting differences in valuation.
     * @param valuationsReconciliationRequest The specifications of the inputs to the reconciliation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call reconcileValuationAsync(ValuationsReconciliationRequest valuationsReconciliationRequest, final ApiCallback<ListAggregationReconciliation> _callback) throws ApiException {

        okhttp3.Call localVarCall = reconcileValuationValidateBeforeCall(valuationsReconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<ListAggregationReconciliation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateReconciliation
     * @param scope The scope of the reconciliation to be updated (required)
     * @param code The code of the reconciliation to be updated (required)
     * @param updateReconciliationRequest The updated definition of the reconciliation (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateReconciliationCall(String scope, String code, UpdateReconciliationRequest updateReconciliationRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateReconciliationRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}"
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
    private okhttp3.Call updateReconciliationValidateBeforeCall(String scope, String code, UpdateReconciliationRequest updateReconciliationRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling updateReconciliation(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updateReconciliation(Async)");
        }

        return updateReconciliationCall(scope, code, updateReconciliationRequest, _callback);

    }

    /**
     * [EXPERIMENTAL] UpdateReconciliation: Update scheduled reconciliation
     * Update a given scheduled reconciliation
     * @param scope The scope of the reconciliation to be updated (required)
     * @param code The code of the reconciliation to be updated (required)
     * @param updateReconciliationRequest The updated definition of the reconciliation (optional)
     * @return Reconciliation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Reconciliation updateReconciliation(String scope, String code, UpdateReconciliationRequest updateReconciliationRequest) throws ApiException {
        ApiResponse<Reconciliation> localVarResp = updateReconciliationWithHttpInfo(scope, code, updateReconciliationRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpdateReconciliation: Update scheduled reconciliation
     * Update a given scheduled reconciliation
     * @param scope The scope of the reconciliation to be updated (required)
     * @param code The code of the reconciliation to be updated (required)
     * @param updateReconciliationRequest The updated definition of the reconciliation (optional)
     * @return ApiResponse&lt;Reconciliation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Reconciliation> updateReconciliationWithHttpInfo(String scope, String code, UpdateReconciliationRequest updateReconciliationRequest) throws ApiException {
        okhttp3.Call localVarCall = updateReconciliationValidateBeforeCall(scope, code, updateReconciliationRequest, null);
        Type localVarReturnType = new TypeToken<Reconciliation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpdateReconciliation: Update scheduled reconciliation (asynchronously)
     * Update a given scheduled reconciliation
     * @param scope The scope of the reconciliation to be updated (required)
     * @param code The code of the reconciliation to be updated (required)
     * @param updateReconciliationRequest The updated definition of the reconciliation (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated scheduled reconciliation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateReconciliationAsync(String scope, String code, UpdateReconciliationRequest updateReconciliationRequest, final ApiCallback<Reconciliation> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateReconciliationValidateBeforeCall(scope, code, updateReconciliationRequest, _callback);
        Type localVarReturnType = new TypeToken<Reconciliation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertReconciliationBreak
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param upsertReconciliationBreakRequest The definition of the reconciliation break request (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertReconciliationBreakCall(String scope, String code, OffsetDateTime runDate, Integer version, UpsertReconciliationBreakRequest upsertReconciliationBreakRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = upsertReconciliationBreakRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs/{runDate}/{version}"
            .replace("{" + "scope" + "}", localVarApiClient.escapeString(scope.toString()))
            .replace("{" + "code" + "}", localVarApiClient.escapeString(code.toString()))
            .replace("{" + "runDate" + "}", localVarApiClient.escapeString(runDate.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()));

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
    private okhttp3.Call upsertReconciliationBreakValidateBeforeCall(String scope, String code, OffsetDateTime runDate, Integer version, UpsertReconciliationBreakRequest upsertReconciliationBreakRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertReconciliationBreak(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertReconciliationBreak(Async)");
        }

        // verify the required parameter 'runDate' is set
        if (runDate == null) {
            throw new ApiException("Missing the required parameter 'runDate' when calling upsertReconciliationBreak(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling upsertReconciliationBreak(Async)");
        }

        return upsertReconciliationBreakCall(scope, code, runDate, version, upsertReconciliationBreakRequest, _callback);

    }

    /**
     * [EXPERIMENTAL] UpsertReconciliationBreak: Upsert a reconciliation break
     * Update or create a given reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param upsertReconciliationBreakRequest The definition of the reconciliation break request (optional)
     * @return ReconciliationRunBreak
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ReconciliationRunBreak upsertReconciliationBreak(String scope, String code, OffsetDateTime runDate, Integer version, UpsertReconciliationBreakRequest upsertReconciliationBreakRequest) throws ApiException {
        ApiResponse<ReconciliationRunBreak> localVarResp = upsertReconciliationBreakWithHttpInfo(scope, code, runDate, version, upsertReconciliationBreakRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpsertReconciliationBreak: Upsert a reconciliation break
     * Update or create a given reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param upsertReconciliationBreakRequest The definition of the reconciliation break request (optional)
     * @return ApiResponse&lt;ReconciliationRunBreak&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReconciliationRunBreak> upsertReconciliationBreakWithHttpInfo(String scope, String code, OffsetDateTime runDate, Integer version, UpsertReconciliationBreakRequest upsertReconciliationBreakRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertReconciliationBreakValidateBeforeCall(scope, code, runDate, version, upsertReconciliationBreakRequest, null);
        Type localVarReturnType = new TypeToken<ReconciliationRunBreak>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpsertReconciliationBreak: Upsert a reconciliation break (asynchronously)
     * Update or create a given reconciliation break
     * @param scope The scope of the reconciliation associated with the break (required)
     * @param code The code of the reconciliation associated with the break (required)
     * @param runDate The date of the run associated with the break (required)
     * @param version The version number of the run associated with the break (required)
     * @param upsertReconciliationBreakRequest The definition of the reconciliation break request (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation break </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertReconciliationBreakAsync(String scope, String code, OffsetDateTime runDate, Integer version, UpsertReconciliationBreakRequest upsertReconciliationBreakRequest, final ApiCallback<ReconciliationRunBreak> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertReconciliationBreakValidateBeforeCall(scope, code, runDate, version, upsertReconciliationBreakRequest, _callback);
        Type localVarReturnType = new TypeToken<ReconciliationRunBreak>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertReconciliationMapping
     * @param mapping The mapping to be created / updated. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created / updated mapping. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertReconciliationMappingCall(Mapping mapping, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = mapping;

        // create path and map variables
        String localVarPath = "/api/portfolios/mapping";

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
    private okhttp3.Call upsertReconciliationMappingValidateBeforeCall(Mapping mapping, final ApiCallback _callback) throws ApiException {
        return upsertReconciliationMappingCall(mapping, _callback);

    }

    /**
     * [EARLY ACCESS] UpsertReconciliationMapping: Create or update a mapping
     * If no mapping exists with the specified scope and code will create a new one.  Else will update the existing mapping
     * @param mapping The mapping to be created / updated. (optional)
     * @return Mapping
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created / updated mapping. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Mapping upsertReconciliationMapping(Mapping mapping) throws ApiException {
        ApiResponse<Mapping> localVarResp = upsertReconciliationMappingWithHttpInfo(mapping);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertReconciliationMapping: Create or update a mapping
     * If no mapping exists with the specified scope and code will create a new one.  Else will update the existing mapping
     * @param mapping The mapping to be created / updated. (optional)
     * @return ApiResponse&lt;Mapping&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created / updated mapping. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Mapping> upsertReconciliationMappingWithHttpInfo(Mapping mapping) throws ApiException {
        okhttp3.Call localVarCall = upsertReconciliationMappingValidateBeforeCall(mapping, null);
        Type localVarReturnType = new TypeToken<Mapping>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertReconciliationMapping: Create or update a mapping (asynchronously)
     * If no mapping exists with the specified scope and code will create a new one.  Else will update the existing mapping
     * @param mapping The mapping to be created / updated. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created / updated mapping. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertReconciliationMappingAsync(Mapping mapping, final ApiCallback<Mapping> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertReconciliationMappingValidateBeforeCall(mapping, _callback);
        Type localVarReturnType = new TypeToken<Mapping>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertReconciliationRun
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param upsertReconciliationRunRequest The definition of the reconciliation run (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertReconciliationRunCall(String scope, String code, UpsertReconciliationRunRequest upsertReconciliationRunRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = upsertReconciliationRunRequest;

        // create path and map variables
        String localVarPath = "/api/portfolios/$scheduledReconciliations/{scope}/{code}/runs"
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
    private okhttp3.Call upsertReconciliationRunValidateBeforeCall(String scope, String code, UpsertReconciliationRunRequest upsertReconciliationRunRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertReconciliationRun(Async)");
        }

        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertReconciliationRun(Async)");
        }

        return upsertReconciliationRunCall(scope, code, upsertReconciliationRunRequest, _callback);

    }

    /**
     * [EXPERIMENTAL] UpsertReconciliationRun: Update or Create a reconciliation run
     * Existing reconciliations will be updated, non-existing ones will be created
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param upsertReconciliationRunRequest The definition of the reconciliation run (optional)
     * @return ReconciliationRun
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ReconciliationRun upsertReconciliationRun(String scope, String code, UpsertReconciliationRunRequest upsertReconciliationRunRequest) throws ApiException {
        ApiResponse<ReconciliationRun> localVarResp = upsertReconciliationRunWithHttpInfo(scope, code, upsertReconciliationRunRequest);
        return localVarResp.getData();
    }

    /**
     * [EXPERIMENTAL] UpsertReconciliationRun: Update or Create a reconciliation run
     * Existing reconciliations will be updated, non-existing ones will be created
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param upsertReconciliationRunRequest The definition of the reconciliation run (optional)
     * @return ApiResponse&lt;ReconciliationRun&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReconciliationRun> upsertReconciliationRunWithHttpInfo(String scope, String code, UpsertReconciliationRunRequest upsertReconciliationRunRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertReconciliationRunValidateBeforeCall(scope, code, upsertReconciliationRunRequest, null);
        Type localVarReturnType = new TypeToken<ReconciliationRun>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EXPERIMENTAL] UpsertReconciliationRun: Update or Create a reconciliation run (asynchronously)
     * Existing reconciliations will be updated, non-existing ones will be created
     * @param scope The scope of the reconciliation associated with the run (required)
     * @param code The code of the reconciliation associated with the run (required)
     * @param upsertReconciliationRunRequest The definition of the reconciliation run (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created reconciliation run </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertReconciliationRunAsync(String scope, String code, UpsertReconciliationRunRequest upsertReconciliationRunRequest, final ApiCallback<ReconciliationRun> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertReconciliationRunValidateBeforeCall(scope, code, upsertReconciliationRunRequest, _callback);
        Type localVarReturnType = new TypeToken<ReconciliationRun>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
