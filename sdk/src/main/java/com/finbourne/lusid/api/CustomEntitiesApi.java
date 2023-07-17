/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](../../../api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application   | Description                                                                       | API / Swagger Documentation                          | |---------------|-----------------------------------------------------------------------------------|------------------------------------------------------| | LUSID         | Open, API-first, developer-friendly investment data platform.                     | [Swagger](../../../api/swagger/index.html)           | | Web app       | User-facing front end for LUSID.                                                  | [Swagger](../../../app/swagger/index.html)           | | Scheduler     | Automated job scheduler.                                                          | [Swagger](../../../scheduler2/swagger/index.html)    | | Insights      | Monitoring and troubleshooting service.                                           | [Swagger](../../../insights/swagger/index.html)      | | Identity      | Identity management for LUSID (in conjunction with Access)                        | [Swagger](../../../identity/swagger/index.html)      | | Access        | Access control for LUSID (in conjunction with Identity)                           | [Swagger](../../../access/swagger/index.html)        | | Drive         | Secure file repository and manager for collaboration.                             | [Swagger](../../../drive/swagger/index.html)         | | Luminesce     | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](../../../honeycomb/swagger/index.html)     | | Notification  | Notification service.                                                             | [Swagger](../../../notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information.                           | [Swagger](../../../configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"172\">172</a>|Entity With Id Does Not Exist|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"795\">795</a>|Cannot delete identifier definition|  | | <a name=\"796\">796</a>|Tax rule set not found.|  | | <a name=\"797\">797</a>|A tax rule set with this id already exists.|  | | <a name=\"798\">798</a>|Multiple rule sets for the same property key are applicable.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | | <a name=\"811\">811</a>|A price could not be found for an order.|  | | <a name=\"812\">812</a>|A price could not be found for an allocation.|  | | <a name=\"813\">813</a>|Chart of Accounts not found.|  | | <a name=\"814\">814</a>|Account not found.|  | | <a name=\"815\">815</a>|Abor not found.|  | | <a name=\"816\">816</a>|Abor Configuration not found.|  | | <a name=\"817\">817</a>|Reconciliation mapping not found|  | | <a name=\"818\">818</a>|Attribute type could not be deleted because it doesn't exist.|  | | <a name=\"819\">819</a>|Reconciliation not found.|  | | <a name=\"820\">820</a>|Custodian Account not found.|  | | <a name=\"821\">821</a>|Allocation Failure|  | | <a name=\"822\">822</a>|Reconciliation run not found|  | | <a name=\"823\">823</a>|Reconciliation break not found|  | | <a name=\"824\">824</a>|Entity link type could not be deleted because it doesn't exist.|  | | <a name=\"828\">828</a>|Address key definition not found.|  | | <a name=\"829\">829</a>|Compliance template not found.|  | | <a name=\"830\">830</a>|Action not supported|  | | <a name=\"831\">831</a>|Reference list not found.|  | | <a name=\"832\">832</a>|Posting Module not found.|  | | <a name=\"833\">833</a>|The type of parameter provided did not match that required by the compliance rule.|  | | <a name=\"834\">834</a>|The parameters provided by a rule did not match those required by its template.|  | | <a name=\"835\">835</a>|PostingModuleRule has a not allowed Property Domain.|  | | <a name=\"836\">836</a>|Structured result data not found.|  | | <a name=\"837\">837</a>|Diary entry not found.|  | | <a name=\"838\">838</a>|Diary entry could not be created.|  | | <a name=\"839\">839</a>|Diary entry already exists.|  | 
 *
 * The version of the OpenAPI document: 1.0.346
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
import com.finbourne.lusid.model.CustomEntityRequest;
import com.finbourne.lusid.model.CustomEntityResponse;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfCustomEntityResponse;
import com.finbourne.lusid.model.ResourceListOfRelationship;
import com.finbourne.lusid.model.UpsertCustomEntitiesResponse;
import com.finbourne.lusid.model.UpsertCustomEntityAccessMetadataRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomEntitiesApi {
    private ApiClient localVarApiClient;
    public CustomEntitiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomEntitiesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteCustomEntity
     * @param entityType The type of Custom Entity to remove. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a Custom Entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCustomEntityCall(String entityType, String identifierType, String identifierValue, String identifierScope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCustomEntityValidateBeforeCall(String entityType, String identifierType, String identifierValue, String identifierScope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling deleteCustomEntity(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling deleteCustomEntity(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling deleteCustomEntity(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling deleteCustomEntity(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCustomEntityCall(entityType, identifierType, identifierValue, identifierScope, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteCustomEntity: Delete a Custom Entity instance.
     * Delete a Custom Entity instance by a specific entity type.
     * @param entityType The type of Custom Entity to remove. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a Custom Entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteCustomEntity(String entityType, String identifierType, String identifierValue, String identifierScope) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteCustomEntityWithHttpInfo(entityType, identifierType, identifierValue, identifierScope);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteCustomEntity: Delete a Custom Entity instance.
     * Delete a Custom Entity instance by a specific entity type.
     * @param entityType The type of Custom Entity to remove. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a Custom Entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteCustomEntityWithHttpInfo(String entityType, String identifierType, String identifierValue, String identifierScope) throws ApiException {
        okhttp3.Call localVarCall = deleteCustomEntityValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteCustomEntity: Delete a Custom Entity instance. (asynchronously)
     * Delete a Custom Entity instance by a specific entity type.
     * @param entityType The type of Custom Entity to remove. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Delete a Custom Entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCustomEntityAsync(String entityType, String identifierType, String identifierValue, String identifierScope, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteCustomEntityValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCustomEntityAccessMetadata
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to delete. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata. (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCustomEntityAccessMetadataCall(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCustomEntityAccessMetadataValidateBeforeCall(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling deleteCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling deleteCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling deleteCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling deleteCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling deleteCustomEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = deleteCustomEntityAccessMetadataCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteCustomEntityAccessMetadata: Delete a Custom Entity Access Metadata entry
     * Deletes the Custom Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to delete. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata. (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata. (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deleteCustomEntityAccessMetadata(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deleteCustomEntityAccessMetadataWithHttpInfo(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteCustomEntityAccessMetadata: Delete a Custom Entity Access Metadata entry
     * Deletes the Custom Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to delete. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata. (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata. (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deleteCustomEntityAccessMetadataWithHttpInfo(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = deleteCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteCustomEntityAccessMetadata: Delete a Custom Entity Access Metadata entry (asynchronously)
     * Deletes the Custom Entity Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to delete. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata. (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCustomEntityAccessMetadataAsync(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllCustomEntityAccessMetadata
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllCustomEntityAccessMetadataCall(String entityType, String identifierType, String identifierValue, String identifierScope, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllCustomEntityAccessMetadataValidateBeforeCall(String entityType, String identifierType, String identifierValue, String identifierScope, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling getAllCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getAllCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling getAllCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling getAllCustomEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = getAllCustomEntityAccessMetadataCall(entityType, identifierType, identifierValue, identifierScope, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetAllCustomEntityAccessMetadata: Get all the Access Metadata rules for a Custom Entity
     * Get all the Custom Entity access metadata for the specified identifier scope, code and value
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @return Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, List<AccessMetadataValue>> getAllCustomEntityAccessMetadata(String entityType, String identifierType, String identifierValue, String identifierScope, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = getAllCustomEntityAccessMetadataWithHttpInfo(entityType, identifierType, identifierValue, identifierScope, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetAllCustomEntityAccessMetadata: Get all the Access Metadata rules for a Custom Entity
     * Get all the Custom Entity access metadata for the specified identifier scope, code and value
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @return ApiResponse&lt;Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, List<AccessMetadataValue>>> getAllCustomEntityAccessMetadataWithHttpInfo(String entityType, String identifierType, String identifierValue, String identifierScope, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getAllCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetAllCustomEntityAccessMetadata: Get all the Access Metadata rules for a Custom Entity (asynchronously)
     * Get all the Custom Entity access metadata for the specified identifier scope, code and value
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllCustomEntityAccessMetadataAsync(String entityType, String identifierType, String identifierValue, String identifierScope, String effectiveAt, OffsetDateTime asAt, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getAllCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomEntity
     * @param entityType The type of Custom Entity to retrieve. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param asAt The AsAt datetime at which to retrieve the Custom Entity instance. (optional)
     * @param effectiveAt The effective datetime or cut label at which to get the Custom Entity instance. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a custom entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomEntityCall(String entityType, String identifierType, String identifierValue, String identifierScope, OffsetDateTime asAt, String effectiveAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomEntityValidateBeforeCall(String entityType, String identifierType, String identifierValue, String identifierScope, OffsetDateTime asAt, String effectiveAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling getCustomEntity(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getCustomEntity(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling getCustomEntity(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling getCustomEntity(Async)");
        }
        

        okhttp3.Call localVarCall = getCustomEntityCall(entityType, identifierType, identifierValue, identifierScope, asAt, effectiveAt, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetCustomEntity: Get a Custom Entity instance.
     * Retrieve a Custom Entity instance by a specific entity type at a point in AsAt time.
     * @param entityType The type of Custom Entity to retrieve. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param asAt The AsAt datetime at which to retrieve the Custom Entity instance. (optional)
     * @param effectiveAt The effective datetime or cut label at which to get the Custom Entity instance. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return CustomEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a custom entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public CustomEntityResponse getCustomEntity(String entityType, String identifierType, String identifierValue, String identifierScope, OffsetDateTime asAt, String effectiveAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<CustomEntityResponse> localVarResp = getCustomEntityWithHttpInfo(entityType, identifierType, identifierValue, identifierScope, asAt, effectiveAt, relatedEntityPropertyKeys, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetCustomEntity: Get a Custom Entity instance.
     * Retrieve a Custom Entity instance by a specific entity type at a point in AsAt time.
     * @param entityType The type of Custom Entity to retrieve. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param asAt The AsAt datetime at which to retrieve the Custom Entity instance. (optional)
     * @param effectiveAt The effective datetime or cut label at which to get the Custom Entity instance. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;CustomEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a custom entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CustomEntityResponse> getCustomEntityWithHttpInfo(String entityType, String identifierType, String identifierValue, String identifierScope, OffsetDateTime asAt, String effectiveAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = getCustomEntityValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, asAt, effectiveAt, relatedEntityPropertyKeys, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<CustomEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetCustomEntity: Get a Custom Entity instance. (asynchronously)
     * Retrieve a Custom Entity instance by a specific entity type at a point in AsAt time.
     * @param entityType The type of Custom Entity to retrieve. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param asAt The AsAt datetime at which to retrieve the Custom Entity instance. (optional)
     * @param effectiveAt The effective datetime or cut label at which to get the Custom Entity instance. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entity in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Get a custom entity instance. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomEntityAsync(String entityType, String identifierType, String identifierValue, String identifierScope, OffsetDateTime asAt, String effectiveAt, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback<CustomEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = getCustomEntityValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, asAt, effectiveAt, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<CustomEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomEntityAccessMetadataByKey
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomEntityAccessMetadataByKeyCall(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomEntityAccessMetadataByKeyValidateBeforeCall(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling getCustomEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getCustomEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling getCustomEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling getCustomEntityAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling getCustomEntityAccessMetadataByKey(Async)");
        }
        

        okhttp3.Call localVarCall = getCustomEntityAccessMetadataByKeyCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetCustomEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Custom Entity
     * Get Custom Entity access metadata for the specified metadata key
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @return List&lt;AccessMetadataValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<AccessMetadataValue> getCustomEntityAccessMetadataByKey(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<List<AccessMetadataValue>> localVarResp = getCustomEntityAccessMetadataByKeyWithHttpInfo(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetCustomEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Custom Entity
     * Get Custom Entity access metadata for the specified metadata key
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @return ApiResponse&lt;List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AccessMetadataValue>> getCustomEntityAccessMetadataByKeyWithHttpInfo(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getCustomEntityAccessMetadataByKeyValidateBeforeCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetCustomEntityAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Custom Entity (asynchronously)
     * Get Custom Entity access metadata for the specified metadata key
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param effectiveAt The effective datetime or cut label at which to get the entities. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata. Defaults to returning the latest version of the metadata if not specified. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomEntityAccessMetadataByKeyAsync(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, String effectiveAt, OffsetDateTime asAt, final ApiCallback<List<AccessMetadataValue>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getCustomEntityAccessMetadataByKeyValidateBeforeCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCustomEntityRelationships
     * @param entityType The type of entity get relationships for. (required)
     * @param identifierScope The identifier scope. (required)
     * @param identifierType An identifier type attached to the Custom Entity. (required)
     * @param identifierValue The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relationships. If not applicable, provide an empty array. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified custom entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomEntityRelationshipsCall(String entityType, String identifierScope, String identifierType, String identifierValue, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}/relationships"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomEntityRelationshipsValidateBeforeCall(String entityType, String identifierScope, String identifierType, String identifierValue, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling getCustomEntityRelationships(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling getCustomEntityRelationships(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getCustomEntityRelationships(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling getCustomEntityRelationships(Async)");
        }
        

        okhttp3.Call localVarCall = getCustomEntityRelationshipsCall(entityType, identifierScope, identifierType, identifierValue, effectiveAt, asAt, filter, identifierTypes, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetCustomEntityRelationships: Get Relationships for Custom Entity
     * Get relationships for the specified Custom Entity.
     * @param entityType The type of entity get relationships for. (required)
     * @param identifierScope The identifier scope. (required)
     * @param identifierType An identifier type attached to the Custom Entity. (required)
     * @param identifierValue The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relationships. If not applicable, provide an empty array. (optional)
     * @return ResourceListOfRelationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified custom entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfRelationship getCustomEntityRelationships(String entityType, String identifierScope, String identifierType, String identifierValue, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        ApiResponse<ResourceListOfRelationship> localVarResp = getCustomEntityRelationshipsWithHttpInfo(entityType, identifierScope, identifierType, identifierValue, effectiveAt, asAt, filter, identifierTypes);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetCustomEntityRelationships: Get Relationships for Custom Entity
     * Get relationships for the specified Custom Entity.
     * @param entityType The type of entity get relationships for. (required)
     * @param identifierScope The identifier scope. (required)
     * @param identifierType An identifier type attached to the Custom Entity. (required)
     * @param identifierValue The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relationships. If not applicable, provide an empty array. (optional)
     * @return ApiResponse&lt;ResourceListOfRelationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified custom entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfRelationship> getCustomEntityRelationshipsWithHttpInfo(String entityType, String identifierScope, String identifierType, String identifierValue, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        okhttp3.Call localVarCall = getCustomEntityRelationshipsValidateBeforeCall(entityType, identifierScope, identifierType, identifierValue, effectiveAt, asAt, filter, identifierTypes, null);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetCustomEntityRelationships: Get Relationships for Custom Entity (asynchronously)
     * Get relationships for the specified Custom Entity.
     * @param entityType The type of entity get relationships for. (required)
     * @param identifierScope The identifier scope. (required)
     * @param identifierType An identifier type attached to the Custom Entity. (required)
     * @param identifierValue The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relationships. If not applicable, provide an empty array. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified custom entity. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomEntityRelationshipsAsync(String entityType, String identifierScope, String identifierType, String identifierValue, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback<ResourceListOfRelationship> _callback) throws ApiException {
        okhttp3.Call localVarCall = getCustomEntityRelationshipsValidateBeforeCall(entityType, identifierScope, identifierType, identifierValue, effectiveAt, asAt, filter, identifierTypes, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listCustomEntities
     * @param entityType The type of Custom Entity to list. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the entities. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the entities. Defaults to returning the latest version              of each portfolio if not specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param sortBy A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param page The pagination token to use to continue listing entities; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entities in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List custom entities of the specified entityType. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCustomEntitiesCall(String entityType, String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, List<String> sortBy, String page, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()));

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

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (sortBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sortBy", sortBy));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listCustomEntitiesValidateBeforeCall(String entityType, String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, List<String> sortBy, String page, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling listCustomEntities(Async)");
        }
        

        okhttp3.Call localVarCall = listCustomEntitiesCall(entityType, effectiveAt, asAt, limit, filter, sortBy, page, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] ListCustomEntities: List Custom Entities of the specified entityType.
     * List all the Custom Entities matching particular criteria.
     * @param entityType The type of Custom Entity to list. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the entities. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the entities. Defaults to returning the latest version              of each portfolio if not specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param sortBy A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param page The pagination token to use to continue listing entities; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entities in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return PagedResourceListOfCustomEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List custom entities of the specified entityType. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfCustomEntityResponse listCustomEntities(String entityType, String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, List<String> sortBy, String page, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<PagedResourceListOfCustomEntityResponse> localVarResp = listCustomEntitiesWithHttpInfo(entityType, effectiveAt, asAt, limit, filter, sortBy, page, relatedEntityPropertyKeys, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ListCustomEntities: List Custom Entities of the specified entityType.
     * List all the Custom Entities matching particular criteria.
     * @param entityType The type of Custom Entity to list. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the entities. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the entities. Defaults to returning the latest version              of each portfolio if not specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param sortBy A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param page The pagination token to use to continue listing entities; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entities in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;PagedResourceListOfCustomEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List custom entities of the specified entityType. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfCustomEntityResponse> listCustomEntitiesWithHttpInfo(String entityType, String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, List<String> sortBy, String page, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = listCustomEntitiesValidateBeforeCall(entityType, effectiveAt, asAt, limit, filter, sortBy, page, relatedEntityPropertyKeys, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfCustomEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ListCustomEntities: List Custom Entities of the specified entityType. (asynchronously)
     * List all the Custom Entities matching particular criteria.
     * @param entityType The type of Custom Entity to list. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the entities. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the entities. Defaults to returning the latest version              of each portfolio if not specified. (optional)
     * @param limit When paginating, limit the results to this number. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the results. For more information about filtering              results, see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param sortBy A list of field names or properties to sort by, each suffixed by \&quot; ASC\&quot; or \&quot; DESC\&quot; (optional)
     * @param page The pagination token to use to continue listing entities; this              value is returned from the previous call. If a pagination token is provided, the filter, effectiveAt              and asAt fields must not have changed since the original request. (optional)
     * @param relatedEntityPropertyKeys A list of property keys from any domain that supports relationships              to decorate onto related entities. These must take the format {domain}/{scope}/{code}, for example &#39;Portfolio/Manager/Id&#39;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the entities in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List custom entities of the specified entityType. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listCustomEntitiesAsync(String entityType, String effectiveAt, OffsetDateTime asAt, Integer limit, String filter, List<String> sortBy, String page, List<String> relatedEntityPropertyKeys, List<String> relationshipDefinitionIds, final ApiCallback<PagedResourceListOfCustomEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = listCustomEntitiesValidateBeforeCall(entityType, effectiveAt, asAt, limit, filter, sortBy, page, relatedEntityPropertyKeys, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfCustomEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchCustomEntityAccessMetadata
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchCustomEntityAccessMetadataCall(String entityType, String identifierType, String identifierValue, String identifierScope, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accessMetadataOperation;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchCustomEntityAccessMetadataValidateBeforeCall(String entityType, String identifierType, String identifierValue, String identifierScope, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling patchCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling patchCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling patchCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling patchCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'accessMetadataOperation' is set
        if (accessMetadataOperation == null) {
            throw new ApiException("Missing the required parameter 'accessMetadataOperation' when calling patchCustomEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = patchCustomEntityAccessMetadataCall(entityType, identifierType, identifierValue, identifierScope, accessMetadataOperation, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] PatchCustomEntityAccessMetadata: Patch Access Metadata rules for a Custom Entity.
     * Patch Custom Entity Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document    Currently only valid metadata keys are supported paths on the patch document                The response will return any affected Custom Entity Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @return Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, List<AccessMetadataValue>> patchCustomEntityAccessMetadata(String entityType, String identifierType, String identifierValue, String identifierScope, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = patchCustomEntityAccessMetadataWithHttpInfo(entityType, identifierType, identifierValue, identifierScope, accessMetadataOperation, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] PatchCustomEntityAccessMetadata: Patch Access Metadata rules for a Custom Entity.
     * Patch Custom Entity Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document    Currently only valid metadata keys are supported paths on the patch document                The response will return any affected Custom Entity Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @return ApiResponse&lt;Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, List<AccessMetadataValue>>> patchCustomEntityAccessMetadataWithHttpInfo(String entityType, String identifierType, String identifierValue, String identifierScope, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = patchCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, accessMetadataOperation, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] PatchCustomEntityAccessMetadata: Patch Access Metadata rules for a Custom Entity. (asynchronously)
     * Patch Custom Entity Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document    Currently only valid metadata keys are supported paths on the patch document                The response will return any affected Custom Entity Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param identifierScope The identifier scope. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchCustomEntityAccessMetadataAsync(String entityType, String identifierType, String identifierValue, String identifierScope, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = patchCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, identifierScope, accessMetadataOperation, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertCustomEntities
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The payload describing the Custom Entity instances (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustomEntitiesCall(String entityType, String successMode, Map<String, CustomEntityRequest> requestBody, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/$batchUpsert"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (successMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("successMode", successMode));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertCustomEntitiesValidateBeforeCall(String entityType, String successMode, Map<String, CustomEntityRequest> requestBody, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling upsertCustomEntities(Async)");
        }
        
        // verify the required parameter 'successMode' is set
        if (successMode == null) {
            throw new ApiException("Missing the required parameter 'successMode' when calling upsertCustomEntities(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling upsertCustomEntities(Async)");
        }
        

        okhttp3.Call localVarCall = upsertCustomEntitiesCall(entityType, successMode, requestBody, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertCustomEntities: Batch upsert instances of Custom Entities
     * Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The payload describing the Custom Entity instances (required)
     * @return UpsertCustomEntitiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertCustomEntitiesResponse upsertCustomEntities(String entityType, String successMode, Map<String, CustomEntityRequest> requestBody) throws ApiException {
        ApiResponse<UpsertCustomEntitiesResponse> localVarResp = upsertCustomEntitiesWithHttpInfo(entityType, successMode, requestBody);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertCustomEntities: Batch upsert instances of Custom Entities
     * Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The payload describing the Custom Entity instances (required)
     * @return ApiResponse&lt;UpsertCustomEntitiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertCustomEntitiesResponse> upsertCustomEntitiesWithHttpInfo(String entityType, String successMode, Map<String, CustomEntityRequest> requestBody) throws ApiException {
        okhttp3.Call localVarCall = upsertCustomEntitiesValidateBeforeCall(entityType, successMode, requestBody, null);
        Type localVarReturnType = new TypeToken<UpsertCustomEntitiesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertCustomEntities: Batch upsert instances of Custom Entities (asynchronously)
     * Note: If using partial failure modes, then it is important to check the response body for failures as any failures will still return a 200 status code
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param successMode Whether the batch request should fail Atomically or in a Partial fashion - Allowed Values: Atomic, Partial (required)
     * @param requestBody The payload describing the Custom Entity instances (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustomEntitiesAsync(String entityType, String successMode, Map<String, CustomEntityRequest> requestBody, final ApiCallback<UpsertCustomEntitiesResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertCustomEntitiesValidateBeforeCall(entityType, successMode, requestBody, _callback);
        Type localVarReturnType = new TypeToken<UpsertCustomEntitiesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertCustomEntity
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param customEntityRequest The payload describing the Custom Entity instance. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustomEntityCall(String entityType, CustomEntityRequest customEntityRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = customEntityRequest;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertCustomEntityValidateBeforeCall(String entityType, CustomEntityRequest customEntityRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling upsertCustomEntity(Async)");
        }
        
        // verify the required parameter 'customEntityRequest' is set
        if (customEntityRequest == null) {
            throw new ApiException("Missing the required parameter 'customEntityRequest' when calling upsertCustomEntity(Async)");
        }
        

        okhttp3.Call localVarCall = upsertCustomEntityCall(entityType, customEntityRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertCustomEntity: Upsert a Custom Entity instance
     * Insert the Custom Entity if it does not exist or update the Custom Entity with the supplied state if it does exist.
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param customEntityRequest The payload describing the Custom Entity instance. (required)
     * @return CustomEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public CustomEntityResponse upsertCustomEntity(String entityType, CustomEntityRequest customEntityRequest) throws ApiException {
        ApiResponse<CustomEntityResponse> localVarResp = upsertCustomEntityWithHttpInfo(entityType, customEntityRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertCustomEntity: Upsert a Custom Entity instance
     * Insert the Custom Entity if it does not exist or update the Custom Entity with the supplied state if it does exist.
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param customEntityRequest The payload describing the Custom Entity instance. (required)
     * @return ApiResponse&lt;CustomEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CustomEntityResponse> upsertCustomEntityWithHttpInfo(String entityType, CustomEntityRequest customEntityRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertCustomEntityValidateBeforeCall(entityType, customEntityRequest, null);
        Type localVarReturnType = new TypeToken<CustomEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertCustomEntity: Upsert a Custom Entity instance (asynchronously)
     * Insert the Custom Entity if it does not exist or update the Custom Entity with the supplied state if it does exist.
     * @param entityType The type of the Custom Entity to be created. An entityType can be created using the \&quot;CreateCustomEntityDefinition\&quot; endpoint for CustomEntityDefinitions. (required)
     * @param customEntityRequest The payload describing the Custom Entity instance. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The upserted custom entity instance </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustomEntityAsync(String entityType, CustomEntityRequest customEntityRequest, final ApiCallback<CustomEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertCustomEntityValidateBeforeCall(entityType, customEntityRequest, _callback);
        Type localVarReturnType = new TypeToken<CustomEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertCustomEntityAccessMetadata
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param upsertCustomEntityAccessMetadataRequest The Custom Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustomEntityAccessMetadataCall(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertCustomEntityAccessMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/customentities/{entityType}/{identifierType}/{identifierValue}/metadata/{metadataKey}"
            .replaceAll("\\{" + "entityType" + "\\}", localVarApiClient.escapeString(entityType.toString()))
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifierValue" + "\\}", localVarApiClient.escapeString(identifierValue.toString()))
            .replaceAll("\\{" + "metadataKey" + "\\}", localVarApiClient.escapeString(metadataKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierScope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierScope", identifierScope));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.346");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertCustomEntityAccessMetadataValidateBeforeCall(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new ApiException("Missing the required parameter 'entityType' when calling upsertCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling upsertCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierValue' is set
        if (identifierValue == null) {
            throw new ApiException("Missing the required parameter 'identifierValue' when calling upsertCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling upsertCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'identifierScope' is set
        if (identifierScope == null) {
            throw new ApiException("Missing the required parameter 'identifierScope' when calling upsertCustomEntityAccessMetadata(Async)");
        }
        
        // verify the required parameter 'upsertCustomEntityAccessMetadataRequest' is set
        if (upsertCustomEntityAccessMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertCustomEntityAccessMetadataRequest' when calling upsertCustomEntityAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = upsertCustomEntityAccessMetadataCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, upsertCustomEntityAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertCustomEntityAccessMetadata: Upsert a Custom Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Custom Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Custom Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param upsertCustomEntityAccessMetadataRequest The Custom Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @return List&lt;AccessMetadataValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<AccessMetadataValue> upsertCustomEntityAccessMetadata(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<List<AccessMetadataValue>> localVarResp = upsertCustomEntityAccessMetadataWithHttpInfo(entityType, identifierType, identifierValue, metadataKey, identifierScope, upsertCustomEntityAccessMetadataRequest, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertCustomEntityAccessMetadata: Upsert a Custom Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Custom Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Custom Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param upsertCustomEntityAccessMetadataRequest The Custom Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @return ApiResponse&lt;List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AccessMetadataValue>> upsertCustomEntityAccessMetadataWithHttpInfo(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = upsertCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, upsertCustomEntityAccessMetadataRequest, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertCustomEntityAccessMetadata: Upsert a Custom Entity Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. (asynchronously)
     * Update or insert one Custom Entity Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Custom Entity Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param entityType The type of the Custom Entity. (required)
     * @param identifierType An identifier type attached to the Custom Entity instance. (required)
     * @param identifierValue The identifier value. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param identifierScope The identifier scope. (required)
     * @param upsertCustomEntityAccessMetadataRequest The Custom Entity Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which the Access Metadata will be effective from (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the CustomEntity or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertCustomEntityAccessMetadataAsync(String entityType, String identifierType, String identifierValue, String metadataKey, String identifierScope, UpsertCustomEntityAccessMetadataRequest upsertCustomEntityAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<List<AccessMetadataValue>> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertCustomEntityAccessMetadataValidateBeforeCall(entityType, identifierType, identifierValue, metadataKey, identifierScope, upsertCustomEntityAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
