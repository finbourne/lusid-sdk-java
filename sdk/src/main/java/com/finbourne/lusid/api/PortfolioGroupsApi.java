/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](../../../api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application   | Description                                                                       | API / Swagger Documentation                          | |---------------|-----------------------------------------------------------------------------------|------------------------------------------------------| | LUSID         | Open, API-first, developer-friendly investment data platform.                     | [Swagger](../../../api/swagger/index.html)           | | Web app       | User-facing front end for LUSID.                                                  | [Swagger](../../../app/swagger/index.html)           | | Scheduler     | Automated job scheduler.                                                          | [Swagger](../../../scheduler2/swagger/index.html)    | | Insights      | Monitoring and troubleshooting service.                                           | [Swagger](../../../insights/swagger/index.html)      | | Identity      | Identity management for LUSID (in conjunction with Access)                        | [Swagger](../../../identity/swagger/index.html)      | | Access        | Access control for LUSID (in conjunction with Identity)                           | [Swagger](../../../access/swagger/index.html)        | | Drive         | Secure file repository and manager for collaboration.                             | [Swagger](../../../drive/swagger/index.html)         | | Luminesce     | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](../../../honeycomb/swagger/index.html)     | | Notification  | Notification service.                                                             | [Swagger](../../../notification/swagger/index.html)  | | Configuration | File store for secrets and other sensitive information.                           | [Swagger](../../../configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"172\">172</a>|Entity With Id Does Not Exist|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"795\">795</a>|Cannot delete identifier definition|  | | <a name=\"796\">796</a>|Tax rule set not found.|  | | <a name=\"797\">797</a>|A tax rule set with this id already exists.|  | | <a name=\"798\">798</a>|Multiple rule sets for the same property key are applicable.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | | <a name=\"811\">811</a>|A price could not be found for an order.|  | | <a name=\"812\">812</a>|A price could not be found for an allocation.|  | | <a name=\"813\">813</a>|Chart of Accounts not found.|  | | <a name=\"814\">814</a>|Account not found.|  | | <a name=\"815\">815</a>|Abor not found.|  | | <a name=\"816\">816</a>|Abor Configuration not found.|  | | <a name=\"817\">817</a>|Reconciliation mapping not found|  | | <a name=\"818\">818</a>|Attribute type could not be deleted because it doesn't exist.|  | | <a name=\"819\">819</a>|Reconciliation not found.|  | | <a name=\"820\">820</a>|Custodian Account not found.|  | | <a name=\"821\">821</a>|Allocation Failure|  | | <a name=\"822\">822</a>|Reconciliation run not found|  | | <a name=\"823\">823</a>|Reconciliation break not found|  | | <a name=\"824\">824</a>|Entity link type could not be deleted because it doesn't exist.|  | | <a name=\"828\">828</a>|Address key definition not found.|  | | <a name=\"829\">829</a>|Compliance template not found.|  | | <a name=\"830\">830</a>|Action not supported|  | | <a name=\"831\">831</a>|Reference list not found.|  | | <a name=\"832\">832</a>|Posting Module not found.|  | | <a name=\"833\">833</a>|The type of parameter provided did not match that required by the compliance rule.|  | | <a name=\"834\">834</a>|The parameters provided by a rule did not match those required by its template.|  | | <a name=\"835\">835</a>|PostingModuleRule has a not allowed Property Domain.|  | | <a name=\"836\">836</a>|Structured result data not found.|  | | <a name=\"837\">837</a>|Diary entry not found.|  | | <a name=\"838\">838</a>|Diary entry could not be created.|  | | <a name=\"839\">839</a>|Diary entry already exists.|  | | <a name=\"861\">861</a>|Compliance run summary not found.|  | | <a name=\"869\">869</a>|Conflicting instrument properties in batch.|  | | <a name=\"870\">870</a>|Compliance run summary already exists.|  | 
 *
 * The version of the OpenAPI document: 1.0.466
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


import com.finbourne.lusid.model.AccessMetadataOperation;
import com.finbourne.lusid.model.AccessMetadataValue;
import com.finbourne.lusid.model.CreatePortfolioGroupRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.ExpandedGroup;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfPortfolioGroup;
import com.finbourne.lusid.model.PortfolioGroup;
import com.finbourne.lusid.model.PortfolioGroupProperties;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.finbourne.lusid.model.ResourceListOfAccessMetadataValueOf;
import com.finbourne.lusid.model.ResourceListOfProcessedCommand;
import com.finbourne.lusid.model.ResourceListOfPropertyInterval;
import com.finbourne.lusid.model.ResourceListOfRelationship;
import com.finbourne.lusid.model.TransactionQueryParameters;
import com.finbourne.lusid.model.UpdatePortfolioGroupRequest;
import com.finbourne.lusid.model.UpsertPortfolioGroupAccessMetadataRequest;
import com.finbourne.lusid.model.VersionedResourceListOfA2BDataRecord;
import com.finbourne.lusid.model.VersionedResourceListOfOutputTransaction;
import com.finbourne.lusid.model.VersionedResourceListOfPortfolioHolding;
import com.finbourne.lusid.model.VersionedResourceListOfTransaction;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PortfolioGroupsApi {
    private ApiClient localVarApiClient;
    public PortfolioGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PortfolioGroupsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for addPortfolioToGroup
     * @param scope The scope of the portfolio group to add a portfolio to. (required)
     * @param code The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio to add to the portfolio group. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPortfolioToGroupCall(String scope, String code, String effectiveAt, ResourceId resourceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = resourceId;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/portfolios"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addPortfolioToGroupValidateBeforeCall(String scope, String code, String effectiveAt, ResourceId resourceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling addPortfolioToGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling addPortfolioToGroup(Async)");
        }
        

        okhttp3.Call localVarCall = addPortfolioToGroupCall(scope, code, effectiveAt, resourceId, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] AddPortfolioToGroup: Add portfolio to group
     * Add a single portfolio to a portfolio group.
     * @param scope The scope of the portfolio group to add a portfolio to. (required)
     * @param code The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio to add to the portfolio group. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup addPortfolioToGroup(String scope, String code, String effectiveAt, ResourceId resourceId) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = addPortfolioToGroupWithHttpInfo(scope, code, effectiveAt, resourceId);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] AddPortfolioToGroup: Add portfolio to group
     * Add a single portfolio to a portfolio group.
     * @param scope The scope of the portfolio group to add a portfolio to. (required)
     * @param code The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio to add to the portfolio group. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> addPortfolioToGroupWithHttpInfo(String scope, String code, String effectiveAt, ResourceId resourceId) throws ApiException {
        okhttp3.Call localVarCall = addPortfolioToGroupValidateBeforeCall(scope, code, effectiveAt, resourceId, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] AddPortfolioToGroup: Add portfolio to group (asynchronously)
     * Add a single portfolio to a portfolio group.
     * @param scope The scope of the portfolio group to add a portfolio to. (required)
     * @param code The code of the portfolio group to add a portfolio to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio to add to the portfolio group. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addPortfolioToGroupAsync(String scope, String code, String effectiveAt, ResourceId resourceId, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = addPortfolioToGroupValidateBeforeCall(scope, code, effectiveAt, resourceId, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addSubGroupToGroup
     * @param scope The scope of the portfolio group to add a portfolio group to. (required)
     * @param code The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio group to add to the portfolio group as a sub group. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio group as a sub group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSubGroupToGroupCall(String scope, String code, String effectiveAt, ResourceId resourceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = resourceId;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/subgroups"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addSubGroupToGroupValidateBeforeCall(String scope, String code, String effectiveAt, ResourceId resourceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling addSubGroupToGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling addSubGroupToGroup(Async)");
        }
        

        okhttp3.Call localVarCall = addSubGroupToGroupCall(scope, code, effectiveAt, resourceId, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] AddSubGroupToGroup: Add sub group to group
     * Add a portfolio group to a portfolio group as a sub group.
     * @param scope The scope of the portfolio group to add a portfolio group to. (required)
     * @param code The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio group to add to the portfolio group as a sub group. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio group as a sub group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup addSubGroupToGroup(String scope, String code, String effectiveAt, ResourceId resourceId) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = addSubGroupToGroupWithHttpInfo(scope, code, effectiveAt, resourceId);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] AddSubGroupToGroup: Add sub group to group
     * Add a portfolio group to a portfolio group as a sub group.
     * @param scope The scope of the portfolio group to add a portfolio group to. (required)
     * @param code The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio group to add to the portfolio group as a sub group. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio group as a sub group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> addSubGroupToGroupWithHttpInfo(String scope, String code, String effectiveAt, ResourceId resourceId) throws ApiException {
        okhttp3.Call localVarCall = addSubGroupToGroupValidateBeforeCall(scope, code, effectiveAt, resourceId, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] AddSubGroupToGroup: Add sub group to group (asynchronously)
     * Add a portfolio group to a portfolio group as a sub group.
     * @param scope The scope of the portfolio group to add a portfolio group to. (required)
     * @param code The code of the portfolio group to add a portfolio group to. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be added to the group. (optional)
     * @param resourceId The resource identifier of the portfolio group to add to the portfolio group as a sub group. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The portfolio group containing the newly added portfolio group as a sub group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addSubGroupToGroupAsync(String scope, String code, String effectiveAt, ResourceId resourceId, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = addSubGroupToGroupValidateBeforeCall(scope, code, effectiveAt, resourceId, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for buildTransactionsForPortfolioGroup
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest               version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call buildTransactionsForPortfolioGroupCall(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = transactionQueryParameters;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/transactions/$build"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call buildTransactionsForPortfolioGroupValidateBeforeCall(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling buildTransactionsForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling buildTransactionsForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'transactionQueryParameters' is set
        if (transactionQueryParameters == null) {
            throw new ApiException("Missing the required parameter 'transactionQueryParameters' when calling buildTransactionsForPortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = buildTransactionsForPortfolioGroupCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, _callback);
        return localVarCall;

    }

    /**
     * BuildTransactionsForPortfolioGroup: Build transactions for transaction portfolios in a portfolio group
     * Build transactions for transaction portfolios in a portfolio group over a given interval of effective time.                When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest               version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
     * @return VersionedResourceListOfOutputTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfOutputTransaction buildTransactionsForPortfolioGroup(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page) throws ApiException {
        ApiResponse<VersionedResourceListOfOutputTransaction> localVarResp = buildTransactionsForPortfolioGroupWithHttpInfo(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page);
        return localVarResp.getData();
    }

    /**
     * BuildTransactionsForPortfolioGroup: Build transactions for transaction portfolios in a portfolio group
     * Build transactions for transaction portfolios in a portfolio group over a given interval of effective time.                When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest               version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfOutputTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfOutputTransaction> buildTransactionsForPortfolioGroupWithHttpInfo(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page) throws ApiException {
        okhttp3.Call localVarCall = buildTransactionsForPortfolioGroupValidateBeforeCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * BuildTransactionsForPortfolioGroup: Build transactions for transaction portfolios in a portfolio group (asynchronously)
     * Build transactions for transaction portfolios in a portfolio group over a given interval of effective time.                When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param transactionQueryParameters The query queryParameters which control how the output transactions are built. (required)
     * @param asAt The asAt datetime at which to build the transactions. Defaults to return the latest               version of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot; or \&quot;Transaction\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to BuildTransactions. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call buildTransactionsForPortfolioGroupAsync(String scope, String code, TransactionQueryParameters transactionQueryParameters, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, final ApiCallback<VersionedResourceListOfOutputTransaction> _callback) throws ApiException {
        okhttp3.Call localVarCall = buildTransactionsForPortfolioGroupValidateBeforeCall(scope, code, transactionQueryParameters, asAt, filter, propertyKeys, limit, page, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfOutputTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createPortfolioGroup
     * @param scope The scope that the portfolio group will be created in. (required)
     * @param createPortfolioGroupRequest The definition and details of the portfolio group. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioGroupCall(String scope, CreatePortfolioGroupRequest createPortfolioGroupRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = createPortfolioGroupRequest;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPortfolioGroupValidateBeforeCall(String scope, CreatePortfolioGroupRequest createPortfolioGroupRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling createPortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = createPortfolioGroupCall(scope, createPortfolioGroupRequest, _callback);
        return localVarCall;

    }

    /**
     * CreatePortfolioGroup: Create portfolio group
     * Create a portfolio group in a specific scope.
     * @param scope The scope that the portfolio group will be created in. (required)
     * @param createPortfolioGroupRequest The definition and details of the portfolio group. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup createPortfolioGroup(String scope, CreatePortfolioGroupRequest createPortfolioGroupRequest) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = createPortfolioGroupWithHttpInfo(scope, createPortfolioGroupRequest);
        return localVarResp.getData();
    }

    /**
     * CreatePortfolioGroup: Create portfolio group
     * Create a portfolio group in a specific scope.
     * @param scope The scope that the portfolio group will be created in. (required)
     * @param createPortfolioGroupRequest The definition and details of the portfolio group. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> createPortfolioGroupWithHttpInfo(String scope, CreatePortfolioGroupRequest createPortfolioGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = createPortfolioGroupValidateBeforeCall(scope, createPortfolioGroupRequest, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * CreatePortfolioGroup: Create portfolio group (asynchronously)
     * Create a portfolio group in a specific scope.
     * @param scope The scope that the portfolio group will be created in. (required)
     * @param createPortfolioGroupRequest The definition and details of the portfolio group. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPortfolioGroupAsync(String scope, CreatePortfolioGroupRequest createPortfolioGroupRequest, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = createPortfolioGroupValidateBeforeCall(scope, createPortfolioGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteGroupProperties
     * @param scope The scope of the group to delete properties from. (required)
     * @param code The code of the group to delete properties from. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteGroupPropertiesCall(String scope, String code, List<String> requestBody, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/properties/$delete"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteGroupPropertiesValidateBeforeCall(String scope, String code, List<String> requestBody, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteGroupProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteGroupProperties(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling deleteGroupProperties(Async)");
        }
        

        okhttp3.Call localVarCall = deleteGroupPropertiesCall(scope, code, requestBody, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteGroupProperties: Delete group properties
     * Delete one or more properties from a single portfolio group. If the properties are time variant then an effective date time from which the properties  will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.
     * @param scope The scope of the group to delete properties from. (required)
     * @param code The code of the group to delete properties from. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteGroupProperties(String scope, String code, List<String> requestBody, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteGroupPropertiesWithHttpInfo(scope, code, requestBody, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteGroupProperties: Delete group properties
     * Delete one or more properties from a single portfolio group. If the properties are time variant then an effective date time from which the properties  will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.
     * @param scope The scope of the group to delete properties from. (required)
     * @param code The code of the group to delete properties from. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteGroupPropertiesWithHttpInfo(String scope, String code, List<String> requestBody, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deleteGroupPropertiesValidateBeforeCall(scope, code, requestBody, effectiveAt, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteGroupProperties: Delete group properties (asynchronously)
     * Delete one or more properties from a single portfolio group. If the properties are time variant then an effective date time from which the properties  will be deleted must be specified. If the properties are perpetual then it is invalid to specify an effective date time for deletion.
     * @param scope The scope of the group to delete properties from. (required)
     * @param code The code of the group to delete properties from. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The property keys of the properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteGroupPropertiesAsync(String scope, String code, List<String> requestBody, String effectiveAt, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteGroupPropertiesValidateBeforeCall(scope, code, requestBody, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteKeyFromPortfolioGroupAccessMetadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the Access Metadata entry to delete (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteKeyFromPortfolioGroupAccessMetadataCall(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (effectiveUntil != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveUntil", effectiveUntil));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteKeyFromPortfolioGroupAccessMetadataValidateBeforeCall(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteKeyFromPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteKeyFromPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling deleteKeyFromPortfolioGroupAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = deleteKeyFromPortfolioGroupAccessMetadataCall(scope, code, metadataKey, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteKeyFromPortfolioGroupAccessMetadata: Delete a Portfolio Group Access Metadata entry
     * Deletes the Portfolio Group Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the Access Metadata entry to delete (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteKeyFromPortfolioGroupAccessMetadata(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteKeyFromPortfolioGroupAccessMetadataWithHttpInfo(scope, code, metadataKey, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteKeyFromPortfolioGroupAccessMetadata: Delete a Portfolio Group Access Metadata entry
     * Deletes the Portfolio Group Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the Access Metadata entry to delete (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteKeyFromPortfolioGroupAccessMetadataWithHttpInfo(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = deleteKeyFromPortfolioGroupAccessMetadataValidateBeforeCall(scope, code, metadataKey, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteKeyFromPortfolioGroupAccessMetadata: Delete a Portfolio Group Access Metadata entry (asynchronously)
     * Deletes the Portfolio Group Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the Access Metadata entry to delete (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteKeyFromPortfolioGroupAccessMetadataAsync(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteKeyFromPortfolioGroupAccessMetadataValidateBeforeCall(scope, code, metadataKey, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePortfolioFromGroup
     * @param scope The scope of the portfolio group to remove the portfolio from. (required)
     * @param code The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param portfolioScope The scope of the portfolio being removed from the portfolio group. (required)
     * @param portfolioCode The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be removed from the portfolio group. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the portfolio removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePortfolioFromGroupCall(String scope, String code, String portfolioScope, String portfolioCode, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/portfolios/{portfolioScope}/{portfolioCode}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "portfolioScope" + "\\}", localVarApiClient.escapeString(portfolioScope.toString()))
            .replaceAll("\\{" + "portfolioCode" + "\\}", localVarApiClient.escapeString(portfolioCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePortfolioFromGroupValidateBeforeCall(String scope, String code, String portfolioScope, String portfolioCode, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deletePortfolioFromGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePortfolioFromGroup(Async)");
        }
        
        // verify the required parameter 'portfolioScope' is set
        if (portfolioScope == null) {
            throw new ApiException("Missing the required parameter 'portfolioScope' when calling deletePortfolioFromGroup(Async)");
        }
        
        // verify the required parameter 'portfolioCode' is set
        if (portfolioCode == null) {
            throw new ApiException("Missing the required parameter 'portfolioCode' when calling deletePortfolioFromGroup(Async)");
        }
        

        okhttp3.Call localVarCall = deletePortfolioFromGroupCall(scope, code, portfolioScope, portfolioCode, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeletePortfolioFromGroup: Delete portfolio from group
     * Remove a single portfolio from a portfolio group.
     * @param scope The scope of the portfolio group to remove the portfolio from. (required)
     * @param code The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param portfolioScope The scope of the portfolio being removed from the portfolio group. (required)
     * @param portfolioCode The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be removed from the portfolio group. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the portfolio removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup deletePortfolioFromGroup(String scope, String code, String portfolioScope, String portfolioCode, String effectiveAt) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = deletePortfolioFromGroupWithHttpInfo(scope, code, portfolioScope, portfolioCode, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeletePortfolioFromGroup: Delete portfolio from group
     * Remove a single portfolio from a portfolio group.
     * @param scope The scope of the portfolio group to remove the portfolio from. (required)
     * @param code The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param portfolioScope The scope of the portfolio being removed from the portfolio group. (required)
     * @param portfolioCode The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be removed from the portfolio group. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the portfolio removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> deletePortfolioFromGroupWithHttpInfo(String scope, String code, String portfolioScope, String portfolioCode, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deletePortfolioFromGroupValidateBeforeCall(scope, code, portfolioScope, portfolioCode, effectiveAt, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeletePortfolioFromGroup: Delete portfolio from group (asynchronously)
     * Remove a single portfolio from a portfolio group.
     * @param scope The scope of the portfolio group to remove the portfolio from. (required)
     * @param code The code of the portfolio group to remove the portfolio from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param portfolioScope The scope of the portfolio being removed from the portfolio group. (required)
     * @param portfolioCode The code of the portfolio being removed from the portfolio group. Together with the scope this uniquely identifies the portfolio to remove. (required)
     * @param effectiveAt The effective datetime or cut label from which the portfolio will be removed from the portfolio group. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the portfolio removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePortfolioFromGroupAsync(String scope, String code, String portfolioScope, String portfolioCode, String effectiveAt, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = deletePortfolioFromGroupValidateBeforeCall(scope, code, portfolioScope, portfolioCode, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePortfolioGroup
     * @param scope The scope of the portfolio group to delete. (required)
     * @param code The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the portfolio group was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePortfolioGroupCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePortfolioGroupValidateBeforeCall(String scope, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deletePortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = deletePortfolioGroupCall(scope, code, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeletePortfolioGroup: Delete portfolio group
     * Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted, however they will no longer be grouped together by this portfolio group.  The deletion will be valid from the portfolio group&#39;s creation datetime, ie. the portfolio group will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param scope The scope of the portfolio group to delete. (required)
     * @param code The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the portfolio group was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePortfolioGroup(String scope, String code) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePortfolioGroupWithHttpInfo(scope, code);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeletePortfolioGroup: Delete portfolio group
     * Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted, however they will no longer be grouped together by this portfolio group.  The deletion will be valid from the portfolio group&#39;s creation datetime, ie. the portfolio group will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param scope The scope of the portfolio group to delete. (required)
     * @param code The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the portfolio group was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePortfolioGroupWithHttpInfo(String scope, String code) throws ApiException {
        okhttp3.Call localVarCall = deletePortfolioGroupValidateBeforeCall(scope, code, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeletePortfolioGroup: Delete portfolio group (asynchronously)
     * Delete a single portfolio group. A portfolio group can be deleted while it still contains portfolios or sub groups.  In this case any portfolios or sub groups contained in this group will not be deleted, however they will no longer be grouped together by this portfolio group.  The deletion will be valid from the portfolio group&#39;s creation datetime, ie. the portfolio group will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param scope The scope of the portfolio group to delete. (required)
     * @param code The code of the portfolio group to delete. Together with the scope this uniquely identifies the portfolio group to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the portfolio group was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePortfolioGroupAsync(String scope, String code, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deletePortfolioGroupValidateBeforeCall(scope, code, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSubGroupFromGroup
     * @param scope The scope of the portfolio group to remove the sub group from. (required)
     * @param code The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param subgroupScope The scope of the sub group to remove from the portfolio group. (required)
     * @param subgroupCode The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be removed from the portfolio group. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the sub group removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSubGroupFromGroupCall(String scope, String code, String subgroupScope, String subgroupCode, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/subgroups/{subgroupScope}/{subgroupCode}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "subgroupScope" + "\\}", localVarApiClient.escapeString(subgroupScope.toString()))
            .replaceAll("\\{" + "subgroupCode" + "\\}", localVarApiClient.escapeString(subgroupCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSubGroupFromGroupValidateBeforeCall(String scope, String code, String subgroupScope, String subgroupCode, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling deleteSubGroupFromGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deleteSubGroupFromGroup(Async)");
        }
        
        // verify the required parameter 'subgroupScope' is set
        if (subgroupScope == null) {
            throw new ApiException("Missing the required parameter 'subgroupScope' when calling deleteSubGroupFromGroup(Async)");
        }
        
        // verify the required parameter 'subgroupCode' is set
        if (subgroupCode == null) {
            throw new ApiException("Missing the required parameter 'subgroupCode' when calling deleteSubGroupFromGroup(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSubGroupFromGroupCall(scope, code, subgroupScope, subgroupCode, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteSubGroupFromGroup: Delete sub group from group
     * Remove a single portfolio group (sub group) from a portfolio group.
     * @param scope The scope of the portfolio group to remove the sub group from. (required)
     * @param code The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param subgroupScope The scope of the sub group to remove from the portfolio group. (required)
     * @param subgroupCode The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be removed from the portfolio group. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the sub group removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup deleteSubGroupFromGroup(String scope, String code, String subgroupScope, String subgroupCode, String effectiveAt) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = deleteSubGroupFromGroupWithHttpInfo(scope, code, subgroupScope, subgroupCode, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteSubGroupFromGroup: Delete sub group from group
     * Remove a single portfolio group (sub group) from a portfolio group.
     * @param scope The scope of the portfolio group to remove the sub group from. (required)
     * @param code The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param subgroupScope The scope of the sub group to remove from the portfolio group. (required)
     * @param subgroupCode The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be removed from the portfolio group. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the sub group removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> deleteSubGroupFromGroupWithHttpInfo(String scope, String code, String subgroupScope, String subgroupCode, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deleteSubGroupFromGroupValidateBeforeCall(scope, code, subgroupScope, subgroupCode, effectiveAt, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteSubGroupFromGroup: Delete sub group from group (asynchronously)
     * Remove a single portfolio group (sub group) from a portfolio group.
     * @param scope The scope of the portfolio group to remove the sub group from. (required)
     * @param code The code of the portfolio group to remove the sub group from. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param subgroupScope The scope of the sub group to remove from the portfolio group. (required)
     * @param subgroupCode The code of the sub group to remove from the portfolio group. Together with the scope this uniquely identifies the sub group. (required)
     * @param effectiveAt The effective datetime or cut label from which the sub group will be removed from the portfolio group. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio group with the sub group removed from the group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSubGroupFromGroupAsync(String scope, String code, String subgroupScope, String subgroupCode, String effectiveAt, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteSubGroupFromGroupValidateBeforeCall(scope, code, subgroupScope, subgroupCode, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getA2BDataForPortfolioGroup
     * @param scope The scope of the group to retrieve the A2B report for. (required)
     * @param code The code of the group to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio group. (required)
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
        <tr><td> 200 </td><td> The requested group A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getA2BDataForPortfolioGroupCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/a2b"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getA2BDataForPortfolioGroupValidateBeforeCall(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getA2BDataForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getA2BDataForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'fromEffectiveAt' is set
        if (fromEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'fromEffectiveAt' when calling getA2BDataForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'toEffectiveAt' is set
        if (toEffectiveAt == null) {
            throw new ApiException("Missing the required parameter 'toEffectiveAt' when calling getA2BDataForPortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getA2BDataForPortfolioGroupCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetA2BDataForPortfolioGroup: Get A2B data for a Portfolio Group
     * Get an A2B report for all Transaction Portfolios within the given portfolio group.
     * @param scope The scope of the group to retrieve the A2B report for. (required)
     * @param code The code of the group to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio group. (required)
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
        <tr><td> 200 </td><td> The requested group A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfA2BDataRecord getA2BDataForPortfolioGroup(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter) throws ApiException {
        ApiResponse<VersionedResourceListOfA2BDataRecord> localVarResp = getA2BDataForPortfolioGroupWithHttpInfo(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetA2BDataForPortfolioGroup: Get A2B data for a Portfolio Group
     * Get an A2B report for all Transaction Portfolios within the given portfolio group.
     * @param scope The scope of the group to retrieve the A2B report for. (required)
     * @param code The code of the group to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio group. (required)
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
        <tr><td> 200 </td><td> The requested group A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfA2BDataRecord> getA2BDataForPortfolioGroupWithHttpInfo(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter) throws ApiException {
        okhttp3.Call localVarCall = getA2BDataForPortfolioGroupValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfA2BDataRecord>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetA2BDataForPortfolioGroup: Get A2B data for a Portfolio Group (asynchronously)
     * Get an A2B report for all Transaction Portfolios within the given portfolio group.
     * @param scope The scope of the group to retrieve the A2B report for. (required)
     * @param code The code of the group to retrieve the A2B report for. Together with the scope this              uniquely identifies the portfolio group. (required)
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
        <tr><td> 200 </td><td> The requested group A2B data </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getA2BDataForPortfolioGroupAsync(String scope, String code, String fromEffectiveAt, String toEffectiveAt, OffsetDateTime asAt, String recipeIdScope, String recipeIdCode, List<String> propertyKeys, String filter, final ApiCallback<VersionedResourceListOfA2BDataRecord> _callback) throws ApiException {
        okhttp3.Call localVarCall = getA2BDataForPortfolioGroupValidateBeforeCall(scope, code, fromEffectiveAt, toEffectiveAt, asAt, recipeIdScope, recipeIdCode, propertyKeys, filter, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfA2BDataRecord>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGroupProperties
     * @param scope The scope of the group to list the properties for. (required)
     * @param code The code of the group to list the properties for. Together with the scope this uniquely identifies the group. (required)
     * @param effectiveAt The effective date time or cut label at which to list the group&#39;s properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt date time at which to list the group&#39;s properties. Defaults to return the latest version of each property if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The properties of the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupPropertiesCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/properties"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGroupPropertiesValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getGroupProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getGroupProperties(Async)");
        }
        

        okhttp3.Call localVarCall = getGroupPropertiesCall(scope, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetGroupProperties: Get group properties
     * List all the properties of a single portfolio group.
     * @param scope The scope of the group to list the properties for. (required)
     * @param code The code of the group to list the properties for. Together with the scope this uniquely identifies the group. (required)
     * @param effectiveAt The effective date time or cut label at which to list the group&#39;s properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt date time at which to list the group&#39;s properties. Defaults to return the latest version of each property if not specified. (optional)
     * @return PortfolioGroupProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The properties of the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroupProperties getGroupProperties(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<PortfolioGroupProperties> localVarResp = getGroupPropertiesWithHttpInfo(scope, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetGroupProperties: Get group properties
     * List all the properties of a single portfolio group.
     * @param scope The scope of the group to list the properties for. (required)
     * @param code The code of the group to list the properties for. Together with the scope this uniquely identifies the group. (required)
     * @param effectiveAt The effective date time or cut label at which to list the group&#39;s properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt date time at which to list the group&#39;s properties. Defaults to return the latest version of each property if not specified. (optional)
     * @return ApiResponse&lt;PortfolioGroupProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The properties of the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroupProperties> getGroupPropertiesWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getGroupPropertiesValidateBeforeCall(scope, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<PortfolioGroupProperties>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetGroupProperties: Get group properties (asynchronously)
     * List all the properties of a single portfolio group.
     * @param scope The scope of the group to list the properties for. (required)
     * @param code The code of the group to list the properties for. Together with the scope this uniquely identifies the group. (required)
     * @param effectiveAt The effective date time or cut label at which to list the group&#39;s properties. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt date time at which to list the group&#39;s properties. Defaults to return the latest version of each property if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The properties of the specified group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGroupPropertiesAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<PortfolioGroupProperties> _callback) throws ApiException {
        okhttp3.Call localVarCall = getGroupPropertiesValidateBeforeCall(scope, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroupProperties>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getHoldingsForPortfolioGroup
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of transaction              portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings of transaction portfolios in a specific version of portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsForPortfolioGroupCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/holdings"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getHoldingsForPortfolioGroupValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getHoldingsForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getHoldingsForPortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getHoldingsForPortfolioGroupCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, _callback);
        return localVarCall;

    }

    /**
     * GetHoldingsForPortfolioGroup: Get holdings for transaction portfolios in portfolio group
     * Get the holdings of transaction portfolios in specified portfolio group.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of transaction              portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @return VersionedResourceListOfPortfolioHolding
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings of transaction portfolios in a specific version of portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfPortfolioHolding getHoldingsForPortfolioGroup(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots) throws ApiException {
        ApiResponse<VersionedResourceListOfPortfolioHolding> localVarResp = getHoldingsForPortfolioGroupWithHttpInfo(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots);
        return localVarResp.getData();
    }

    /**
     * GetHoldingsForPortfolioGroup: Get holdings for transaction portfolios in portfolio group
     * Get the holdings of transaction portfolios in specified portfolio group.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of transaction              portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfPortfolioHolding&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings of transaction portfolios in a specific version of portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfPortfolioHolding> getHoldingsForPortfolioGroupWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsForPortfolioGroupValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetHoldingsForPortfolioGroup: Get holdings for transaction portfolios in portfolio group (asynchronously)
     * Get the holdings of transaction portfolios in specified portfolio group.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the holdings of transaction              portfolios in the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the holdings of transaction portfolios in the portfolio group. Defaults              to return the latest version of the holdings if not specified. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Holding\&quot; or \&quot;Portfolio\&quot; domain to decorate onto              the holdings. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or \&quot;Holding/system/Cost\&quot;. (optional)
     * @param byTaxlots Whether or not to expand the holdings to return the underlying tax-lots. Defaults to              False. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The holdings of transaction portfolios in a specific version of portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getHoldingsForPortfolioGroupAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> propertyKeys, Boolean byTaxlots, final ApiCallback<VersionedResourceListOfPortfolioHolding> _callback) throws ApiException {
        okhttp3.Call localVarCall = getHoldingsForPortfolioGroupValidateBeforeCall(scope, code, effectiveAt, asAt, filter, propertyKeys, byTaxlots, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfPortfolioHolding>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroup
     * @param scope The scope of the portfolio group to retrieve the definition for. (required)
     * @param code The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio group in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio group definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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

        if (relatedEntityPropertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "relatedEntityPropertyKeys", relatedEntityPropertyKeys));
        }

        if (relationshipDefinitionIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "relationshipDefinitionIds", relationshipDefinitionIds));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupCall(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * GetPortfolioGroup: Get portfolio group
     * Retrieve the definition of a single portfolio group.
     * @param scope The scope of the portfolio group to retrieve the definition for. (required)
     * @param code The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio group in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio group definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup getPortfolioGroup(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = getPortfolioGroupWithHttpInfo(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * GetPortfolioGroup: Get portfolio group
     * Retrieve the definition of a single portfolio group.
     * @param scope The scope of the portfolio group to retrieve the definition for. (required)
     * @param code The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio group in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio group definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> getPortfolioGroupWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupValidateBeforeCall(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetPortfolioGroup: Get portfolio group (asynchronously)
     * Retrieve the definition of a single portfolio group.
     * @param scope The scope of the portfolio group to retrieve the definition for. (required)
     * @param code The code of the portfolio group to retrieve the definition for. Together with the scope              this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the portfolio group definition. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the portfolio group definition. Defaults to return              the latest version of the portfolio group definition if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio group in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested portfolio group definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupValidateBeforeCall(scope, code, effectiveAt, asAt, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroupAccessMetadataByKey
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the access metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the access metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Portfolio group access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupAccessMetadataByKeyCall(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupAccessMetadataByKeyValidateBeforeCall(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroupAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroupAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling getPortfolioGroupAccessMetadataByKey(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupAccessMetadataByKeyCall(scope, code, metadataKey, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Portfolio Group
     * Get a specific Portfolio Group access metadata by specifying the corresponding identifier parts                No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the access metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the access metadata (optional)
     * @return List&lt;AccessMetadataValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Portfolio group access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<AccessMetadataValue> getPortfolioGroupAccessMetadataByKey(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<List<AccessMetadataValue>> localVarResp = getPortfolioGroupAccessMetadataByKeyWithHttpInfo(scope, code, metadataKey, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Portfolio Group
     * Get a specific Portfolio Group access metadata by specifying the corresponding identifier parts                No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the access metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the access metadata (optional)
     * @return ApiResponse&lt;List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Portfolio group access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AccessMetadataValue>> getPortfolioGroupAccessMetadataByKeyWithHttpInfo(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupAccessMetadataByKeyValidateBeforeCall(scope, code, metadataKey, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Portfolio Group (asynchronously)
     * Get a specific Portfolio Group access metadata by specifying the corresponding identifier parts                No matching will be performed through this endpoint. To retrieve a rule, it is necessary to specify, exactly, the identifier of the rule
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the access metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the access metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Portfolio group access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupAccessMetadataByKeyAsync(String scope, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback<List<AccessMetadataValue>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupAccessMetadataByKeyValidateBeforeCall(scope, code, metadataKey, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroupCommands
     * @param scope The scope of the portfolio group to retrieve the commands for. (required)
     * @param code The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param fromAsAt The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. (optional)
     * @param toAsAt The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the User ID, use \&quot;userId.id eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The commands that modified the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupCommandsCall(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, String filter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/commands"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromAsAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromAsAt", fromAsAt));
        }

        if (toAsAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toAsAt", toAsAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupCommandsValidateBeforeCall(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, String filter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroupCommands(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroupCommands(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupCommandsCall(scope, code, fromAsAt, toAsAt, filter, _callback);
        return localVarCall;

    }

    /**
     * GetPortfolioGroupCommands: Get portfolio group commands
     * Gets all the commands that modified a single portfolio group.
     * @param scope The scope of the portfolio group to retrieve the commands for. (required)
     * @param code The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param fromAsAt The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. (optional)
     * @param toAsAt The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the User ID, use \&quot;userId.id eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ResourceListOfProcessedCommand
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The commands that modified the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfProcessedCommand getPortfolioGroupCommands(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, String filter) throws ApiException {
        ApiResponse<ResourceListOfProcessedCommand> localVarResp = getPortfolioGroupCommandsWithHttpInfo(scope, code, fromAsAt, toAsAt, filter);
        return localVarResp.getData();
    }

    /**
     * GetPortfolioGroupCommands: Get portfolio group commands
     * Gets all the commands that modified a single portfolio group.
     * @param scope The scope of the portfolio group to retrieve the commands for. (required)
     * @param code The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param fromAsAt The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. (optional)
     * @param toAsAt The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the User ID, use \&quot;userId.id eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @return ApiResponse&lt;ResourceListOfProcessedCommand&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The commands that modified the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfProcessedCommand> getPortfolioGroupCommandsWithHttpInfo(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, String filter) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupCommandsValidateBeforeCall(scope, code, fromAsAt, toAsAt, filter, null);
        Type localVarReturnType = new TypeToken<ResourceListOfProcessedCommand>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetPortfolioGroupCommands: Get portfolio group commands (asynchronously)
     * Gets all the commands that modified a single portfolio group.
     * @param scope The scope of the portfolio group to retrieve the commands for. (required)
     * @param code The code of the portfolio group to retrieve the commands for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param fromAsAt The lower bound asAt datetime (inclusive) from which to retrieve commands. There is no lower bound if this is not specified. (optional)
     * @param toAsAt The upper bound asAt datetime (inclusive) from which to retrieve commands. There is no upper bound if this is not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the User ID, use \&quot;userId.id eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The commands that modified the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupCommandsAsync(String scope, String code, OffsetDateTime fromAsAt, OffsetDateTime toAsAt, String filter, final ApiCallback<ResourceListOfProcessedCommand> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupCommandsValidateBeforeCall(scope, code, fromAsAt, toAsAt, filter, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfProcessedCommand>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroupExpansion
     * @param scope The scope of the portfolio group to expand. (required)
     * @param code The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio              group to expand. (required)
     * @param effectiveAt The effective datetime or cut label at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified. (optional)
     * @param propertyFilter The restricted list of property keys from the \&quot;Portfolio\&quot; domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The expanded portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupExpansionCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyFilter, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/expansion"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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

        if (propertyFilter != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyFilter", propertyFilter));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupExpansionValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyFilter, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroupExpansion(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroupExpansion(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupExpansionCall(scope, code, effectiveAt, asAt, propertyFilter, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupExpansion: Get portfolio group expansion
     * List all the portfolios in a group, including all portfolios within sub groups in the group. Each portfolio will be decorated with all of its properties unless a property filter is specified.
     * @param scope The scope of the portfolio group to expand. (required)
     * @param code The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio              group to expand. (required)
     * @param effectiveAt The effective datetime or cut label at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified. (optional)
     * @param propertyFilter The restricted list of property keys from the \&quot;Portfolio\&quot; domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. (optional)
     * @return ExpandedGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The expanded portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ExpandedGroup getPortfolioGroupExpansion(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyFilter) throws ApiException {
        ApiResponse<ExpandedGroup> localVarResp = getPortfolioGroupExpansionWithHttpInfo(scope, code, effectiveAt, asAt, propertyFilter);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupExpansion: Get portfolio group expansion
     * List all the portfolios in a group, including all portfolios within sub groups in the group. Each portfolio will be decorated with all of its properties unless a property filter is specified.
     * @param scope The scope of the portfolio group to expand. (required)
     * @param code The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio              group to expand. (required)
     * @param effectiveAt The effective datetime or cut label at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified. (optional)
     * @param propertyFilter The restricted list of property keys from the \&quot;Portfolio\&quot; domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. (optional)
     * @return ApiResponse&lt;ExpandedGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The expanded portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ExpandedGroup> getPortfolioGroupExpansionWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyFilter) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupExpansionValidateBeforeCall(scope, code, effectiveAt, asAt, propertyFilter, null);
        Type localVarReturnType = new TypeToken<ExpandedGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupExpansion: Get portfolio group expansion (asynchronously)
     * List all the portfolios in a group, including all portfolios within sub groups in the group. Each portfolio will be decorated with all of its properties unless a property filter is specified.
     * @param scope The scope of the portfolio group to expand. (required)
     * @param code The code of the portfolio group to expand. Together with the scope this uniquely identifies the portfolio              group to expand. (required)
     * @param effectiveAt The effective datetime or cut label at which to expand the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to expand the portfolio group. Defaults to return the latest version of each portfolio in the group if not specified. (optional)
     * @param propertyFilter The restricted list of property keys from the \&quot;Portfolio\&quot; domain which will be decorated onto each portfolio. These take the format {domain}/{scope}/{code} e.g. \&quot;Portfolio/Manager/Id\&quot;. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The expanded portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupExpansionAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, List<String> propertyFilter, final ApiCallback<ExpandedGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupExpansionValidateBeforeCall(scope, code, effectiveAt, asAt, propertyFilter, _callback);
        Type localVarReturnType = new TypeToken<ExpandedGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroupMetadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the portfolio group or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupMetadataCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/metadata"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupMetadataValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroupMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroupMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupMetadataCall(scope, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupMetadata: Get Access Metadata rules for Portfolio Group
     * Pass the scope and Portfolio Group code parameters to retrieve the associated Access Metadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the portfolio group or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, List<AccessMetadataValue>> getPortfolioGroupMetadata(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = getPortfolioGroupMetadataWithHttpInfo(scope, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupMetadata: Get Access Metadata rules for Portfolio Group
     * Pass the scope and Portfolio Group code parameters to retrieve the associated Access Metadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return ApiResponse&lt;Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the portfolio group or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, List<AccessMetadataValue>>> getPortfolioGroupMetadataWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupMetadataValidateBeforeCall(scope, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupMetadata: Get Access Metadata rules for Portfolio Group (asynchronously)
     * Pass the scope and Portfolio Group code parameters to retrieve the associated Access Metadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the portfolio group or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupMetadataAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupMetadataValidateBeforeCall(scope, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroupPropertyTimeSeries
     * @param scope The scope of the group. (required)
     * @param code The code of the group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;.              Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param portfolioGroupEffectiveAt The effective datetime used to resolve the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio group&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The time series of the property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupPropertyTimeSeriesCall(String scope, String code, String propertyKey, String portfolioGroupEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/properties/time-series"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propertyKey", propertyKey));
        }

        if (portfolioGroupEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("portfolioGroupEffectiveAt", portfolioGroupEffectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupPropertyTimeSeriesValidateBeforeCall(String scope, String code, String propertyKey, String portfolioGroupEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroupPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroupPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new ApiException("Missing the required parameter 'propertyKey' when calling getPortfolioGroupPropertyTimeSeries(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupPropertyTimeSeriesCall(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupPropertyTimeSeries: Get the time series of a portfolio group property
     * List the complete time series of a portfolio group property.
     * @param scope The scope of the group. (required)
     * @param code The code of the group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;.              Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param portfolioGroupEffectiveAt The effective datetime used to resolve the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio group&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @return ResourceListOfPropertyInterval
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The time series of the property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPropertyInterval getPortfolioGroupPropertyTimeSeries(String scope, String code, String propertyKey, String portfolioGroupEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit) throws ApiException {
        ApiResponse<ResourceListOfPropertyInterval> localVarResp = getPortfolioGroupPropertyTimeSeriesWithHttpInfo(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupPropertyTimeSeries: Get the time series of a portfolio group property
     * List the complete time series of a portfolio group property.
     * @param scope The scope of the group. (required)
     * @param code The code of the group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;.              Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param portfolioGroupEffectiveAt The effective datetime used to resolve the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio group&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @return ApiResponse&lt;ResourceListOfPropertyInterval&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The time series of the property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPropertyInterval> getPortfolioGroupPropertyTimeSeriesWithHttpInfo(String scope, String code, String propertyKey, String portfolioGroupEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupPropertyTimeSeriesValidateBeforeCall(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyInterval>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupPropertyTimeSeries: Get the time series of a portfolio group property (asynchronously)
     * List the complete time series of a portfolio group property.
     * @param scope The scope of the group. (required)
     * @param code The code of the group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;.              Each property must be from the \&quot;PortfolioGroup\&quot; domain. (required)
     * @param portfolioGroupEffectiveAt The effective datetime used to resolve the portfolio group. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio group&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, and asAt fields              must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The time series of the property </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupPropertyTimeSeriesAsync(String scope, String code, String propertyKey, String portfolioGroupEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, final ApiCallback<ResourceListOfPropertyInterval> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupPropertyTimeSeriesValidateBeforeCall(scope, code, propertyKey, portfolioGroupEffectiveAt, asAt, filter, page, limit, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyInterval>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPortfolioGroupRelationships
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve relationship. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specific portfolio group. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupRelationshipsCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/relationships"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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

        if (identifierTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "identifierTypes", identifierTypes));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPortfolioGroupRelationshipsValidateBeforeCall(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getPortfolioGroupRelationships(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPortfolioGroupRelationships(Async)");
        }
        

        okhttp3.Call localVarCall = getPortfolioGroupRelationshipsCall(scope, code, effectiveAt, asAt, filter, identifierTypes, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupRelationships: Get Relationships for Portfolio Group
     * Get relationships for the specified Portfolio Group
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve relationship. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @return ResourceListOfRelationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specific portfolio group. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfRelationship getPortfolioGroupRelationships(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        ApiResponse<ResourceListOfRelationship> localVarResp = getPortfolioGroupRelationshipsWithHttpInfo(scope, code, effectiveAt, asAt, filter, identifierTypes);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupRelationships: Get Relationships for Portfolio Group
     * Get relationships for the specified Portfolio Group
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve relationship. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @return ApiResponse&lt;ResourceListOfRelationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specific portfolio group. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfRelationship> getPortfolioGroupRelationshipsWithHttpInfo(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupRelationshipsValidateBeforeCall(scope, code, effectiveAt, asAt, filter, identifierTypes, null);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPortfolioGroupRelationships: Get Relationships for Portfolio Group (asynchronously)
     * Get relationships for the specified Portfolio Group
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies              the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve relationship. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specific portfolio group. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPortfolioGroupRelationshipsAsync(String scope, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback<ResourceListOfRelationship> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPortfolioGroupRelationshipsValidateBeforeCall(scope, code, effectiveAt, asAt, filter, identifierTypes, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTransactionsForPortfolioGroup
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Transaction\&quot;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsForPortfolioGroupCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, Boolean showCancelledTransactions, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/transactions"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

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

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (showCancelledTransactions != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showCancelledTransactions", showCancelledTransactions));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionsForPortfolioGroupValidateBeforeCall(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, Boolean showCancelledTransactions, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling getTransactionsForPortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getTransactionsForPortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = getTransactionsForPortfolioGroupCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions, _callback);
        return localVarCall;

    }

    /**
     * GetTransactionsForPortfolioGroup: Get transactions for transaction portfolios in a portfolio group
     * Get transactions for transaction portfolios in a portfolio group over a given interval of effective time.                When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Transaction\&quot;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
     * @return VersionedResourceListOfTransaction
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public VersionedResourceListOfTransaction getTransactionsForPortfolioGroup(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, Boolean showCancelledTransactions) throws ApiException {
        ApiResponse<VersionedResourceListOfTransaction> localVarResp = getTransactionsForPortfolioGroupWithHttpInfo(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions);
        return localVarResp.getData();
    }

    /**
     * GetTransactionsForPortfolioGroup: Get transactions for transaction portfolios in a portfolio group
     * Get transactions for transaction portfolios in a portfolio group over a given interval of effective time.                When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Transaction\&quot;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
     * @return ApiResponse&lt;VersionedResourceListOfTransaction&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<VersionedResourceListOfTransaction> getTransactionsForPortfolioGroupWithHttpInfo(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, Boolean showCancelledTransactions) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsForPortfolioGroupValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions, null);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetTransactionsForPortfolioGroup: Get transactions for transaction portfolios in a portfolio group (asynchronously)
     * Get transactions for transaction portfolios in a portfolio group over a given interval of effective time.                When the specified portfolio in a portfolio group is a derived transaction portfolio, the returned set of transactions is the  union set of all transactions of the parent (and any grandparents etc.) and the specified derived transaction portfolio itself.
     * @param scope The scope of the portfolio group. (required)
     * @param code The code of the portfolio group. Together with the scope this uniquely identifies               the portfolio group. (required)
     * @param fromTransactionDate The lower bound effective datetime or cut label (inclusive) from which to retrieve the transactions.               There is no lower bound if this is not specified. (optional)
     * @param toTransactionDate The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions.               There is no upper bound if this is not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the transactions. Defaults to return the latest version               of each transaction if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the Transaction Type, use \&quot;type eq &#39;Buy&#39;\&quot;               Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Instrument\&quot;, \&quot;Transaction\&quot;, \&quot;LegalEntity\&quot; or \&quot;CustodianAccount\&quot; domain to decorate onto               the transactions. These take the format {domain}/{scope}/{code} e.g. \&quot;Instrument/system/Name\&quot; or               \&quot;Transaction/strategy/quantsignal\&quot;. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param page The pagination token to use to continue listing transactions from a previous call to GetTransactions. (optional)
     * @param showCancelledTransactions Option to specify whether or not to include cancelled transactions,               including previous versions of transactions which have since been amended.               Defaults to False if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested transactions from transaction portfolios in the specified portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionsForPortfolioGroupAsync(String scope, String code, String fromTransactionDate, String toTransactionDate, OffsetDateTime asAt, String filter, List<String> propertyKeys, Integer limit, String page, Boolean showCancelledTransactions, final ApiCallback<VersionedResourceListOfTransaction> _callback) throws ApiException {
        okhttp3.Call localVarCall = getTransactionsForPortfolioGroupValidateBeforeCall(scope, code, fromTransactionDate, toTransactionDate, asAt, filter, propertyKeys, limit, page, showCancelledTransactions, _callback);
        Type localVarReturnType = new TypeToken<VersionedResourceListOfTransaction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPortfolioGroups
     * @param scope The scope to list the portfolio groups in. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. (optional)
     * @param page The pagination token to use to continue listing portfolio groups from a previous call to list portfolio groups. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to no limit if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param sortBy A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio groups in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups in the specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPortfolioGroupsCall(String scope, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> sortBy, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()));

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

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
        }

        if (relatedEntityPropertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "relatedEntityPropertyKeys", relatedEntityPropertyKeys));
        }

        if (relationshipDefinitionIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "relationshipDefinitionIds", relationshipDefinitionIds));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPortfolioGroupsValidateBeforeCall(String scope, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> sortBy, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling listPortfolioGroups(Async)");
        }
        

        okhttp3.Call localVarCall = listPortfolioGroupsCall(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] ListPortfolioGroups: List portfolio groups
     * List all the portfolio groups in a single scope.
     * @param scope The scope to list the portfolio groups in. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. (optional)
     * @param page The pagination token to use to continue listing portfolio groups from a previous call to list portfolio groups. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to no limit if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param sortBy A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio groups in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return PagedResourceListOfPortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups in the specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfPortfolioGroup listPortfolioGroups(String scope, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> sortBy, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<PagedResourceListOfPortfolioGroup> localVarResp = listPortfolioGroupsWithHttpInfo(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ListPortfolioGroups: List portfolio groups
     * List all the portfolio groups in a single scope.
     * @param scope The scope to list the portfolio groups in. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. (optional)
     * @param page The pagination token to use to continue listing portfolio groups from a previous call to list portfolio groups. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to no limit if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param sortBy A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio groups in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;PagedResourceListOfPortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups in the specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfPortfolioGroup> listPortfolioGroupsWithHttpInfo(String scope, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> sortBy, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = listPortfolioGroupsValidateBeforeCall(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfPortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ListPortfolioGroups: List portfolio groups (asynchronously)
     * List all the portfolio groups in a single scope.
     * @param scope The scope to list the portfolio groups in. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the portfolio groups. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the portfolio groups. Defaults to return the latest version of each portfolio group if not specified. (optional)
     * @param page The pagination token to use to continue listing portfolio groups from a previous call to list portfolio groups. This  value is returned from the previous call. If a pagination token is provided the filter, effectiveAt, sortBy  and asAt fields must not have changed since the original request. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to no limit if not specified. (optional)
     * @param filter Expression to filter the result set.              For example, to filter on the Display Name, use \&quot;displayName eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param sortBy A list of field names to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the portfolio groups in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The portfolio groups in the specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPortfolioGroupsAsync(String scope, String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> sortBy, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback<PagedResourceListOfPortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = listPortfolioGroupsValidateBeforeCall(scope, effectiveAt, asAt, page, limit, filter, sortBy, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfPortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchPortfolioGroupAccessMetadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param accessMetadataOperation The Json patch document (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully patched items. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPortfolioGroupAccessMetadataCall(String scope, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accessMetadataOperation;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/metadata"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (effectiveUntil != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveUntil", effectiveUntil));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchPortfolioGroupAccessMetadataValidateBeforeCall(String scope, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling patchPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling patchPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'accessMetadataOperation' is set
        if (accessMetadataOperation == null) {
            throw new ApiException("Missing the required parameter 'accessMetadataOperation' when calling patchPortfolioGroupAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = patchPortfolioGroupAccessMetadataCall(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] PatchPortfolioGroupAccessMetadata: Patch Access Metadata rules for a Portfolio Group.
     * Patch Portfolio Group Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Portfolio Group Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param accessMetadataOperation The Json patch document (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully patched items. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, List<AccessMetadataValue>> patchPortfolioGroupAccessMetadata(String scope, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = patchPortfolioGroupAccessMetadataWithHttpInfo(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] PatchPortfolioGroupAccessMetadata: Patch Access Metadata rules for a Portfolio Group.
     * Patch Portfolio Group Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Portfolio Group Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param accessMetadataOperation The Json patch document (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return ApiResponse&lt;Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully patched items. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, List<AccessMetadataValue>>> patchPortfolioGroupAccessMetadataWithHttpInfo(String scope, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = patchPortfolioGroupAccessMetadataValidateBeforeCall(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] PatchPortfolioGroupAccessMetadata: Patch Access Metadata rules for a Portfolio Group. (asynchronously)
     * Patch Portfolio Group Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Portfolio Group Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param accessMetadataOperation The Json patch document (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully patched items. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchPortfolioGroupAccessMetadataAsync(String scope, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = patchPortfolioGroupAccessMetadataValidateBeforeCall(scope, code, accessMetadataOperation, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePortfolioGroup
     * @param scope The scope of the portfolio group to update the definition for. (required)
     * @param code The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to update the definition. (optional)
     * @param updatePortfolioGroupRequest The updated portfolio group definition. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated definition of the portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePortfolioGroupCall(String scope, String code, String effectiveAt, UpdatePortfolioGroupRequest updatePortfolioGroupRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updatePortfolioGroupRequest;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePortfolioGroupValidateBeforeCall(String scope, String code, String effectiveAt, UpdatePortfolioGroupRequest updatePortfolioGroupRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling updatePortfolioGroup(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling updatePortfolioGroup(Async)");
        }
        

        okhttp3.Call localVarCall = updatePortfolioGroupCall(scope, code, effectiveAt, updatePortfolioGroupRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpdatePortfolioGroup: Update portfolio group
     * Update the definition of a single portfolio group. Not all elements within a portfolio group definition are modifiable  due to the potential implications for data already stored against the portfolio group.
     * @param scope The scope of the portfolio group to update the definition for. (required)
     * @param code The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to update the definition. (optional)
     * @param updatePortfolioGroupRequest The updated portfolio group definition. (optional)
     * @return PortfolioGroup
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated definition of the portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroup updatePortfolioGroup(String scope, String code, String effectiveAt, UpdatePortfolioGroupRequest updatePortfolioGroupRequest) throws ApiException {
        ApiResponse<PortfolioGroup> localVarResp = updatePortfolioGroupWithHttpInfo(scope, code, effectiveAt, updatePortfolioGroupRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpdatePortfolioGroup: Update portfolio group
     * Update the definition of a single portfolio group. Not all elements within a portfolio group definition are modifiable  due to the potential implications for data already stored against the portfolio group.
     * @param scope The scope of the portfolio group to update the definition for. (required)
     * @param code The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to update the definition. (optional)
     * @param updatePortfolioGroupRequest The updated portfolio group definition. (optional)
     * @return ApiResponse&lt;PortfolioGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated definition of the portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroup> updatePortfolioGroupWithHttpInfo(String scope, String code, String effectiveAt, UpdatePortfolioGroupRequest updatePortfolioGroupRequest) throws ApiException {
        okhttp3.Call localVarCall = updatePortfolioGroupValidateBeforeCall(scope, code, effectiveAt, updatePortfolioGroupRequest, null);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpdatePortfolioGroup: Update portfolio group (asynchronously)
     * Update the definition of a single portfolio group. Not all elements within a portfolio group definition are modifiable  due to the potential implications for data already stored against the portfolio group.
     * @param scope The scope of the portfolio group to update the definition for. (required)
     * @param code The code of the portfolio group to update the definition for. Together with the scope this uniquely identifies the portfolio group. (required)
     * @param effectiveAt The effective datetime or cut label at which to update the definition. (optional)
     * @param updatePortfolioGroupRequest The updated portfolio group definition. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated definition of the portfolio group </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePortfolioGroupAsync(String scope, String code, String effectiveAt, UpdatePortfolioGroupRequest updatePortfolioGroupRequest, final ApiCallback<PortfolioGroup> _callback) throws ApiException {
        okhttp3.Call localVarCall = updatePortfolioGroupValidateBeforeCall(scope, code, effectiveAt, updatePortfolioGroupRequest, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroup>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertGroupProperties
     * @param scope The scope of the group to update or insert the properties onto. (required)
     * @param code The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The properties to be updated or inserted onto the group. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. (optional)
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
    public okhttp3.Call upsertGroupPropertiesCall(String scope, String code, Map<String, Property> requestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/properties/$upsert"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertGroupPropertiesValidateBeforeCall(String scope, String code, Map<String, Property> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertGroupProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertGroupProperties(Async)");
        }
        

        okhttp3.Call localVarCall = upsertGroupPropertiesCall(scope, code, requestBody, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertGroupProperties: Upsert group properties
     * Update or insert one or more properties onto a single group. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;PortfolioGroup&#39;.                Upserting a property that exists for a group, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param scope The scope of the group to update or insert the properties onto. (required)
     * @param code The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The properties to be updated or inserted onto the group. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. (optional)
     * @return PortfolioGroupProperties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated or inserted properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PortfolioGroupProperties upsertGroupProperties(String scope, String code, Map<String, Property> requestBody) throws ApiException {
        ApiResponse<PortfolioGroupProperties> localVarResp = upsertGroupPropertiesWithHttpInfo(scope, code, requestBody);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertGroupProperties: Upsert group properties
     * Update or insert one or more properties onto a single group. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;PortfolioGroup&#39;.                Upserting a property that exists for a group, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param scope The scope of the group to update or insert the properties onto. (required)
     * @param code The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The properties to be updated or inserted onto the group. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. (optional)
     * @return ApiResponse&lt;PortfolioGroupProperties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated or inserted properties </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PortfolioGroupProperties> upsertGroupPropertiesWithHttpInfo(String scope, String code, Map<String, Property> requestBody) throws ApiException {
        okhttp3.Call localVarCall = upsertGroupPropertiesValidateBeforeCall(scope, code, requestBody, null);
        Type localVarReturnType = new TypeToken<PortfolioGroupProperties>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertGroupProperties: Upsert group properties (asynchronously)
     * Update or insert one or more properties onto a single group. A property will be updated if it  already exists and inserted if it does not. All properties must be of the domain &#39;PortfolioGroup&#39;.                Upserting a property that exists for a group, with a null value, will delete the instance of the property for that group.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime for which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param scope The scope of the group to update or insert the properties onto. (required)
     * @param code The code of the group to update or insert the properties onto. Together with the scope this uniquely identifies the group. (required)
     * @param requestBody The properties to be updated or inserted onto the group. Each property in               the request must be keyed by its unique property key. This has the format {domain}/{scope}/{code} e.g. \&quot;PortfolioGroup/Manager/Id\&quot;. (optional)
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
    public okhttp3.Call upsertGroupPropertiesAsync(String scope, String code, Map<String, Property> requestBody, final ApiCallback<PortfolioGroupProperties> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertGroupPropertiesValidateBeforeCall(scope, code, requestBody, _callback);
        Type localVarReturnType = new TypeToken<PortfolioGroupProperties>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertPortfolioGroupAccessMetadata
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the access metadata entry to upsert (required)
     * @param upsertPortfolioGroupAccessMetadataRequest The Portfolio Group Access Metadata rule to upsert (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPortfolioGroupAccessMetadataCall(String scope, String code, String metadataKey, UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertPortfolioGroupAccessMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/portfoliogroups/{scope}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "scope" + "\\}", localVarApiClient.escapeString(scope.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (effectiveUntil != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveUntil", effectiveUntil));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.466");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertPortfolioGroupAccessMetadataValidateBeforeCall(String scope, String code, String metadataKey, UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'scope' is set
        if (scope == null) {
            throw new ApiException("Missing the required parameter 'scope' when calling upsertPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling upsertPortfolioGroupAccessMetadata(Async)");
        }
        
        // verify the required parameter 'upsertPortfolioGroupAccessMetadataRequest' is set
        if (upsertPortfolioGroupAccessMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertPortfolioGroupAccessMetadataRequest' when calling upsertPortfolioGroupAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = upsertPortfolioGroupAccessMetadataCall(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertPortfolioGroupAccessMetadata: Upsert a Portfolio Group Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Portfolio Group Access Metadata Entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Portfolio Group Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the access metadata entry to upsert (required)
     * @param upsertPortfolioGroupAccessMetadataRequest The Portfolio Group Access Metadata rule to upsert (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return ResourceListOfAccessMetadataValueOf
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfAccessMetadataValueOf upsertPortfolioGroupAccessMetadata(String scope, String code, String metadataKey, UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<ResourceListOfAccessMetadataValueOf> localVarResp = upsertPortfolioGroupAccessMetadataWithHttpInfo(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertPortfolioGroupAccessMetadata: Upsert a Portfolio Group Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Portfolio Group Access Metadata Entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Portfolio Group Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the access metadata entry to upsert (required)
     * @param upsertPortfolioGroupAccessMetadataRequest The Portfolio Group Access Metadata rule to upsert (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return ApiResponse&lt;ResourceListOfAccessMetadataValueOf&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfAccessMetadataValueOf> upsertPortfolioGroupAccessMetadataWithHttpInfo(String scope, String code, String metadataKey, UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = upsertPortfolioGroupAccessMetadataValidateBeforeCall(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessMetadataValueOf>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertPortfolioGroupAccessMetadata: Upsert a Portfolio Group Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. (asynchronously)
     * Update or insert one Portfolio Group Access Metadata Entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Portfolio Group Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param scope The scope of the Portfolio Group (required)
     * @param code The Portfolio Group code (required)
     * @param metadataKey Key of the access metadata entry to upsert (required)
     * @param upsertPortfolioGroupAccessMetadataRequest The Portfolio Group Access Metadata rule to upsert (required)
     * @param effectiveAt The date this rule will be effective from (optional)
     * @param effectiveUntil The effective date until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully updated or inserted item or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPortfolioGroupAccessMetadataAsync(String scope, String code, String metadataKey, UpsertPortfolioGroupAccessMetadataRequest upsertPortfolioGroupAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<ResourceListOfAccessMetadataValueOf> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertPortfolioGroupAccessMetadataValidateBeforeCall(scope, code, metadataKey, upsertPortfolioGroupAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessMetadataValueOf>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
