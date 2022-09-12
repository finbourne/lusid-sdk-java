/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | 
 *
 * The version of the OpenAPI document: 0.11.4778
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


import com.finbourne.lusid.model.DeleteInstrumentResponse;
import com.finbourne.lusid.model.GetInstrumentsResponse;
import com.finbourne.lusid.model.Instrument;
import com.finbourne.lusid.model.InstrumentDefinition;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfInstrument;
import com.finbourne.lusid.model.ResourceListOfInstrumentIdTypeDescriptor;
import com.finbourne.lusid.model.ResourceListOfPropertyInterval;
import com.finbourne.lusid.model.ResourceListOfRelationship;
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
    private ApiClient localVarApiClient;
    public InstrumentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstrumentsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deleteInstrument
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the instrument was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteInstrumentCall(String identifierType, String identifier, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}"
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteInstrumentValidateBeforeCall(String identifierType, String identifier, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling deleteInstrument(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling deleteInstrument(Async)");
        }
        

        okhttp3.Call localVarCall = deleteInstrumentCall(identifierType, identifier, scope, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeleteInstrument: Soft delete a single instrument
     * Soft delete a particular instrument, as identified by a particular instrument identifier.                Once deleted, an instrument is marked as inactive and can no longer be referenced when creating or updating  transactions or holdings. You can still query existing transactions and holdings related to the  deleted instrument.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return DeleteInstrumentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the instrument was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeleteInstrumentResponse deleteInstrument(String identifierType, String identifier, String scope) throws ApiException {
        ApiResponse<DeleteInstrumentResponse> localVarResp = deleteInstrumentWithHttpInfo(identifierType, identifier, scope);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeleteInstrument: Soft delete a single instrument
     * Soft delete a particular instrument, as identified by a particular instrument identifier.                Once deleted, an instrument is marked as inactive and can no longer be referenced when creating or updating  transactions or holdings. You can still query existing transactions and holdings related to the  deleted instrument.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;DeleteInstrumentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the instrument was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteInstrumentResponse> deleteInstrumentWithHttpInfo(String identifierType, String identifier, String scope) throws ApiException {
        okhttp3.Call localVarCall = deleteInstrumentValidateBeforeCall(identifierType, identifier, scope, null);
        Type localVarReturnType = new TypeToken<DeleteInstrumentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeleteInstrument: Soft delete a single instrument (asynchronously)
     * Soft delete a particular instrument, as identified by a particular instrument identifier.                Once deleted, an instrument is marked as inactive and can no longer be referenced when creating or updating  transactions or holdings. You can still query existing transactions and holdings related to the  deleted instrument.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the instrument was deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteInstrumentAsync(String identifierType, String identifier, String scope, final ApiCallback<DeleteInstrumentResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deleteInstrumentValidateBeforeCall(identifierType, identifier, scope, _callback);
        Type localVarReturnType = new TypeToken<DeleteInstrumentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInstrument
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentCall(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}"
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", localVarApiClient.escapeString(identifier.toString()));

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

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstrumentValidateBeforeCall(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getInstrument(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getInstrument(Async)");
        }
        

        okhttp3.Call localVarCall = getInstrumentCall(identifierType, identifier, effectiveAt, asAt, propertyKeys, scope, _callback);
        return localVarCall;

    }

    /**
     * GetInstrument: Get instrument
     * Retrieve the definition of a particular instrument, as identified by a particular unique identifier.
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return Instrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Instrument getInstrument(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope) throws ApiException {
        ApiResponse<Instrument> localVarResp = getInstrumentWithHttpInfo(identifierType, identifier, effectiveAt, asAt, propertyKeys, scope);
        return localVarResp.getData();
    }

    /**
     * GetInstrument: Get instrument
     * Retrieve the definition of a particular instrument, as identified by a particular unique identifier.
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;Instrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Instrument> getInstrumentWithHttpInfo(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentValidateBeforeCall(identifierType, identifier, effectiveAt, asAt, propertyKeys, scope, null);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetInstrument: Get instrument (asynchronously)
     * Retrieve the definition of a particular instrument, as identified by a particular unique identifier.
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument. Defaults to              returning the latest version if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.              These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentAsync(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope, final ApiCallback<Instrument> _callback) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentValidateBeforeCall(identifierType, identifier, effectiveAt, asAt, propertyKeys, scope, _callback);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInstrumentIdentifierTypes
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of valid instrument identifier types. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentIdentifierTypesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/identifierTypes";

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstrumentIdentifierTypesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getInstrumentIdentifierTypesCall(_callback);
        return localVarCall;

    }

    /**
     * GetInstrumentIdentifierTypes: Get instrument identifier types
     * Retrieve a list of all valid instrument identifier types and whether they are unique or not.                An instrument must have a value for at least one unique identifier type (it can have more than one unique type and value).  In addition, a value is automatically generated for a LUSID Instrument ID (LUID) unique type by the system.                An instrument can have values for multiple non-unique identifier types (or it can have zero non-unique types and values).
     * @return ResourceListOfInstrumentIdTypeDescriptor
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of valid instrument identifier types. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfInstrumentIdTypeDescriptor getInstrumentIdentifierTypes() throws ApiException {
        ApiResponse<ResourceListOfInstrumentIdTypeDescriptor> localVarResp = getInstrumentIdentifierTypesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * GetInstrumentIdentifierTypes: Get instrument identifier types
     * Retrieve a list of all valid instrument identifier types and whether they are unique or not.                An instrument must have a value for at least one unique identifier type (it can have more than one unique type and value).  In addition, a value is automatically generated for a LUSID Instrument ID (LUID) unique type by the system.                An instrument can have values for multiple non-unique identifier types (or it can have zero non-unique types and values).
     * @return ApiResponse&lt;ResourceListOfInstrumentIdTypeDescriptor&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of valid instrument identifier types. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfInstrumentIdTypeDescriptor> getInstrumentIdentifierTypesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getInstrumentIdentifierTypesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrumentIdTypeDescriptor>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetInstrumentIdentifierTypes: Get instrument identifier types (asynchronously)
     * Retrieve a list of all valid instrument identifier types and whether they are unique or not.                An instrument must have a value for at least one unique identifier type (it can have more than one unique type and value).  In addition, a value is automatically generated for a LUSID Instrument ID (LUID) unique type by the system.                An instrument can have values for multiple non-unique identifier types (or it can have zero non-unique types and values).
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of valid instrument identifier types. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentIdentifierTypesAsync(final ApiCallback<ResourceListOfInstrumentIdTypeDescriptor> _callback) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentIdentifierTypesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ResourceListOfInstrumentIdTypeDescriptor>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInstrumentPropertyTimeSeries
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param propertyKey The property key of a property from the &#39;Instrument&#39; domain whose history to retrieve.              This must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (required)
     * @param identifierEffectiveAt The effective datetime used to resolve the instrument from the identifier.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument&#39;s property history. Defaults to              returning the current datetime if not supplied. (optional)
     * @param filter Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param page The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and              &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. For more information, see              https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
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
    public okhttp3.Call getInstrumentPropertyTimeSeriesCall(String identifierType, String identifier, String propertyKey, String identifierEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}/properties/time-series"
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propertyKey", propertyKey));
        }

        if (identifierEffectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierEffectiveAt", identifierEffectiveAt));
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

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstrumentPropertyTimeSeriesValidateBeforeCall(String identifierType, String identifier, String propertyKey, String identifierEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getInstrumentPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getInstrumentPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new ApiException("Missing the required parameter 'propertyKey' when calling getInstrumentPropertyTimeSeries(Async)");
        }
        

        okhttp3.Call localVarCall = getInstrumentPropertyTimeSeriesCall(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit, scope, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetInstrumentPropertyTimeSeries: Get instrument property time series
     * Retrieve the complete time series (history) for a particular property of an instrument.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param propertyKey The property key of a property from the &#39;Instrument&#39; domain whose history to retrieve.              This must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (required)
     * @param identifierEffectiveAt The effective datetime used to resolve the instrument from the identifier.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument&#39;s property history. Defaults to              returning the current datetime if not supplied. (optional)
     * @param filter Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param page The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and              &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. For more information, see              https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
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
    public ResourceListOfPropertyInterval getInstrumentPropertyTimeSeries(String identifierType, String identifier, String propertyKey, String identifierEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, String scope) throws ApiException {
        ApiResponse<ResourceListOfPropertyInterval> localVarResp = getInstrumentPropertyTimeSeriesWithHttpInfo(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit, scope);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetInstrumentPropertyTimeSeries: Get instrument property time series
     * Retrieve the complete time series (history) for a particular property of an instrument.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param propertyKey The property key of a property from the &#39;Instrument&#39; domain whose history to retrieve.              This must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (required)
     * @param identifierEffectiveAt The effective datetime used to resolve the instrument from the identifier.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument&#39;s property history. Defaults to              returning the current datetime if not supplied. (optional)
     * @param filter Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param page The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and              &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. For more information, see              https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
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
    public ApiResponse<ResourceListOfPropertyInterval> getInstrumentPropertyTimeSeriesWithHttpInfo(String identifierType, String identifier, String propertyKey, String identifierEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, String scope) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentPropertyTimeSeriesValidateBeforeCall(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit, scope, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyInterval>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetInstrumentPropertyTimeSeries: Get instrument property time series (asynchronously)
     * Retrieve the complete time series (history) for a particular property of an instrument.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param propertyKey The property key of a property from the &#39;Instrument&#39; domain whose history to retrieve.              This must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (required)
     * @param identifierEffectiveAt The effective datetime used to resolve the instrument from the identifier.              Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument&#39;s property history. Defaults to              returning the current datetime if not supplied. (optional)
     * @param filter Expression to filter the results. For more information about filtering,              see https://support.lusid.com/knowledgebase/article/KA-01914. (optional)
     * @param page The pagination token to use to continue listing properties; this value is returned from              the previous call. If a pagination token is provided, the &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and              &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. For more information, see              https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
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
    public okhttp3.Call getInstrumentPropertyTimeSeriesAsync(String identifierType, String identifier, String propertyKey, String identifierEffectiveAt, OffsetDateTime asAt, String filter, String page, Integer limit, String scope, final ApiCallback<ResourceListOfPropertyInterval> _callback) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentPropertyTimeSeriesValidateBeforeCall(identifierType, identifier, propertyKey, identifierEffectiveAt, asAt, filter, page, limit, scope, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyInterval>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInstrumentRelationships
     * @param identifierType An identifier type attached to the Instrument. (required)
     * @param identifier The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param scope The entity scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentRelationshipsCall(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}/relationships"
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", localVarApiClient.escapeString(identifier.toString()));

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

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstrumentRelationshipsValidateBeforeCall(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getInstrumentRelationships(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling getInstrumentRelationships(Async)");
        }
        

        okhttp3.Call localVarCall = getInstrumentRelationshipsCall(identifierType, identifier, effectiveAt, asAt, filter, identifierTypes, scope, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetInstrumentRelationships: Get Instrument relationships
     * Get relationships for a particular Instrument.
     * @param identifierType An identifier type attached to the Instrument. (required)
     * @param identifier The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param scope The entity scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ResourceListOfRelationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfRelationship getInstrumentRelationships(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, String scope) throws ApiException {
        ApiResponse<ResourceListOfRelationship> localVarResp = getInstrumentRelationshipsWithHttpInfo(identifierType, identifier, effectiveAt, asAt, filter, identifierTypes, scope);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetInstrumentRelationships: Get Instrument relationships
     * Get relationships for a particular Instrument.
     * @param identifierType An identifier type attached to the Instrument. (required)
     * @param identifier The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param scope The entity scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;ResourceListOfRelationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfRelationship> getInstrumentRelationshipsWithHttpInfo(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, String scope) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentRelationshipsValidateBeforeCall(identifierType, identifier, effectiveAt, asAt, filter, identifierTypes, scope, null);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetInstrumentRelationships: Get Instrument relationships (asynchronously)
     * Get relationships for a particular Instrument.
     * @param identifierType An identifier type attached to the Instrument. (required)
     * @param identifier The identifier value. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param scope The entity scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified instrument. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentRelationshipsAsync(String identifierType, String identifier, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, String scope, final ApiCallback<ResourceListOfRelationship> _callback) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentRelationshipsValidateBeforeCall(identifierType, identifier, effectiveAt, asAt, filter, identifierTypes, scope, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getInstruments
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param requestBody A list of one or more &lt;i&gt;identifierType&lt;/i&gt; values to use to identify instruments. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument definitions.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument definitions.               Defaults to returning the latest version of each instrument definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.               These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments which could be identified along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentsCall(String identifierType, List<String> requestBody, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/instruments/$get";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (identifierType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("identifierType", identifierType));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstrumentsValidateBeforeCall(String identifierType, List<String> requestBody, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling getInstruments(Async)");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling getInstruments(Async)");
        }
        

        okhttp3.Call localVarCall = getInstrumentsCall(identifierType, requestBody, effectiveAt, asAt, propertyKeys, scope, _callback);
        return localVarCall;

    }

    /**
     * GetInstruments: Get instruments
     * Retrieve the definition of one or more instruments, as identified by a collection of unique identifiers.                Note that to retrieve all the instruments in the instrument master, use the List instruments endpoint instead.
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param requestBody A list of one or more &lt;i&gt;identifierType&lt;/i&gt; values to use to identify instruments. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument definitions.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument definitions.               Defaults to returning the latest version of each instrument definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.               These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return GetInstrumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments which could be identified along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public GetInstrumentsResponse getInstruments(String identifierType, List<String> requestBody, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope) throws ApiException {
        ApiResponse<GetInstrumentsResponse> localVarResp = getInstrumentsWithHttpInfo(identifierType, requestBody, effectiveAt, asAt, propertyKeys, scope);
        return localVarResp.getData();
    }

    /**
     * GetInstruments: Get instruments
     * Retrieve the definition of one or more instruments, as identified by a collection of unique identifiers.                Note that to retrieve all the instruments in the instrument master, use the List instruments endpoint instead.
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param requestBody A list of one or more &lt;i&gt;identifierType&lt;/i&gt; values to use to identify instruments. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument definitions.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument definitions.               Defaults to returning the latest version of each instrument definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.               These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;GetInstrumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments which could be identified along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetInstrumentsResponse> getInstrumentsWithHttpInfo(String identifierType, List<String> requestBody, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentsValidateBeforeCall(identifierType, requestBody, effectiveAt, asAt, propertyKeys, scope, null);
        Type localVarReturnType = new TypeToken<GetInstrumentsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetInstruments: Get instruments (asynchronously)
     * Retrieve the definition of one or more instruments, as identified by a collection of unique identifiers.                Note that to retrieve all the instruments in the instrument master, use the List instruments endpoint instead.
     * @param identifierType The unique identifier type to use, for example &#39;Figi&#39;. (required)
     * @param requestBody A list of one or more &lt;i&gt;identifierType&lt;/i&gt; values to use to identify instruments. (required)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the instrument definitions.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the instrument definitions.               Defaults to returning the latest version of each instrument definition if not specified. (optional)
     * @param propertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto the instrument.               These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments which could be identified along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstrumentsAsync(String identifierType, List<String> requestBody, String effectiveAt, OffsetDateTime asAt, List<String> propertyKeys, String scope, final ApiCallback<GetInstrumentsResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = getInstrumentsValidateBeforeCall(identifierType, requestBody, effectiveAt, asAt, propertyKeys, scope, _callback);
        Type localVarReturnType = new TypeToken<GetInstrumentsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listInstruments
     * @param asAt The asAt datetime at which to list instruments. Defaults to returning the latest               version of each instrument if not specified. (optional)
     * @param effectiveAt The effective datetime or cut label at which to list instruments.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param page The pagination token to use to continue listing instruments; this value is returned from               the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt;, &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and               &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. Also, a &lt;i&gt;start&lt;/i&gt; value cannot be               provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param sortBy Order results by particular fields. Use the &#39;-&#39; sign to denote descending order, for               example &#39;-MyFieldName&#39;. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param filter Expression to filter the result set. Defaults to filtering out inactive instruments               (that is, those that have been deleted). For more information about filtering results,               see https://support.lusid.com/knowledgebase/article/KA-01914. (optional, default to State eq &#39;Active&#39;)
     * @param instrumentPropertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto               instruments. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listInstrumentsCall(OffsetDateTime asAt, String effectiveAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/instruments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

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

        if (instrumentPropertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "instrumentPropertyKeys", instrumentPropertyKeys));
        }

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listInstrumentsValidateBeforeCall(OffsetDateTime asAt, String effectiveAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, String scope, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listInstrumentsCall(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys, scope, _callback);
        return localVarCall;

    }

    /**
     * ListInstruments: List instruments
     * List all the instruments in the instrument master.                To retrieve a particular set of instruments instead, use the Get instruments endpoint.  The maximum number of instruments that this method can list per request is 2,000.
     * @param asAt The asAt datetime at which to list instruments. Defaults to returning the latest               version of each instrument if not specified. (optional)
     * @param effectiveAt The effective datetime or cut label at which to list instruments.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param page The pagination token to use to continue listing instruments; this value is returned from               the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt;, &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and               &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. Also, a &lt;i&gt;start&lt;/i&gt; value cannot be               provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param sortBy Order results by particular fields. Use the &#39;-&#39; sign to denote descending order, for               example &#39;-MyFieldName&#39;. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param filter Expression to filter the result set. Defaults to filtering out inactive instruments               (that is, those that have been deleted). For more information about filtering results,               see https://support.lusid.com/knowledgebase/article/KA-01914. (optional, default to State eq &#39;Active&#39;)
     * @param instrumentPropertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto               instruments. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return PagedResourceListOfInstrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfInstrument listInstruments(OffsetDateTime asAt, String effectiveAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, String scope) throws ApiException {
        ApiResponse<PagedResourceListOfInstrument> localVarResp = listInstrumentsWithHttpInfo(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys, scope);
        return localVarResp.getData();
    }

    /**
     * ListInstruments: List instruments
     * List all the instruments in the instrument master.                To retrieve a particular set of instruments instead, use the Get instruments endpoint.  The maximum number of instruments that this method can list per request is 2,000.
     * @param asAt The asAt datetime at which to list instruments. Defaults to returning the latest               version of each instrument if not specified. (optional)
     * @param effectiveAt The effective datetime or cut label at which to list instruments.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param page The pagination token to use to continue listing instruments; this value is returned from               the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt;, &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and               &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. Also, a &lt;i&gt;start&lt;/i&gt; value cannot be               provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param sortBy Order results by particular fields. Use the &#39;-&#39; sign to denote descending order, for               example &#39;-MyFieldName&#39;. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param filter Expression to filter the result set. Defaults to filtering out inactive instruments               (that is, those that have been deleted). For more information about filtering results,               see https://support.lusid.com/knowledgebase/article/KA-01914. (optional, default to State eq &#39;Active&#39;)
     * @param instrumentPropertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto               instruments. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;PagedResourceListOfInstrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfInstrument> listInstrumentsWithHttpInfo(OffsetDateTime asAt, String effectiveAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, String scope) throws ApiException {
        okhttp3.Call localVarCall = listInstrumentsValidateBeforeCall(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys, scope, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfInstrument>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * ListInstruments: List instruments (asynchronously)
     * List all the instruments in the instrument master.                To retrieve a particular set of instruments instead, use the Get instruments endpoint.  The maximum number of instruments that this method can list per request is 2,000.
     * @param asAt The asAt datetime at which to list instruments. Defaults to returning the latest               version of each instrument if not specified. (optional)
     * @param effectiveAt The effective datetime or cut label at which to list instruments.               Defaults to the current LUSID system datetime if not specified. (optional)
     * @param page The pagination token to use to continue listing instruments; this value is returned from               the previous call. If a pagination token is provided, the &lt;i&gt;sortBy&lt;/i&gt;, &lt;i&gt;filter&lt;/i&gt;, &lt;i&gt;effectiveAt&lt;/i&gt; and               &lt;i&gt;asAt&lt;/i&gt; fields must not have changed since the original request. Also, a &lt;i&gt;start&lt;/i&gt; value cannot be               provided. For more information, see https://support.lusid.com/knowledgebase/article/KA-01915. (optional)
     * @param sortBy Order results by particular fields. Use the &#39;-&#39; sign to denote descending order, for               example &#39;-MyFieldName&#39;. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the results to this number. (optional)
     * @param filter Expression to filter the result set. Defaults to filtering out inactive instruments               (that is, those that have been deleted). For more information about filtering results,               see https://support.lusid.com/knowledgebase/article/KA-01914. (optional, default to State eq &#39;Active&#39;)
     * @param instrumentPropertyKeys A list of property keys from the &#39;Instrument&#39; domain to decorate onto               instruments. These must have the format {domain}/{scope}/{code}, for example &#39;Instrument/system/Name&#39;. (optional)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested instruments </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listInstrumentsAsync(OffsetDateTime asAt, String effectiveAt, String page, List<String> sortBy, Integer start, Integer limit, String filter, List<String> instrumentPropertyKeys, String scope, final ApiCallback<PagedResourceListOfInstrument> _callback) throws ApiException {
        okhttp3.Call localVarCall = listInstrumentsValidateBeforeCall(asAt, effectiveAt, page, sortBy, start, limit, filter, instrumentPropertyKeys, scope, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfInstrument>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateInstrumentIdentifier
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param updateInstrumentIdentifierRequest The identifier to update or delete. This need not be the same value as the               &#39;identifier&#39; parameter used to retrieve the instrument. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated instrument definition with the identifier created, updated or deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateInstrumentIdentifierCall(String identifierType, String identifier, UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = updateInstrumentIdentifierRequest;

        // create path and map variables
        String localVarPath = "/api/instruments/{identifierType}/{identifier}"
            .replaceAll("\\{" + "identifierType" + "\\}", localVarApiClient.escapeString(identifierType.toString()))
            .replaceAll("\\{" + "identifier" + "\\}", localVarApiClient.escapeString(identifier.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateInstrumentIdentifierValidateBeforeCall(String identifierType, String identifier, UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'identifierType' is set
        if (identifierType == null) {
            throw new ApiException("Missing the required parameter 'identifierType' when calling updateInstrumentIdentifier(Async)");
        }
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiException("Missing the required parameter 'identifier' when calling updateInstrumentIdentifier(Async)");
        }
        
        // verify the required parameter 'updateInstrumentIdentifierRequest' is set
        if (updateInstrumentIdentifierRequest == null) {
            throw new ApiException("Missing the required parameter 'updateInstrumentIdentifierRequest' when calling updateInstrumentIdentifier(Async)");
        }
        

        okhttp3.Call localVarCall = updateInstrumentIdentifierCall(identifierType, identifier, updateInstrumentIdentifierRequest, scope, _callback);
        return localVarCall;

    }

    /**
     * UpdateInstrumentIdentifier: Update instrument identifier
     * Create, update or delete a particular instrument identifier for an instrument.                To delete the identifier, leave the value unspecified in the request. If not being deleted, the  identifier is updated if it exists and created if it does not.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param updateInstrumentIdentifierRequest The identifier to update or delete. This need not be the same value as the               &#39;identifier&#39; parameter used to retrieve the instrument. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return Instrument
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated instrument definition with the identifier created, updated or deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Instrument updateInstrumentIdentifier(String identifierType, String identifier, UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest, String scope) throws ApiException {
        ApiResponse<Instrument> localVarResp = updateInstrumentIdentifierWithHttpInfo(identifierType, identifier, updateInstrumentIdentifierRequest, scope);
        return localVarResp.getData();
    }

    /**
     * UpdateInstrumentIdentifier: Update instrument identifier
     * Create, update or delete a particular instrument identifier for an instrument.                To delete the identifier, leave the value unspecified in the request. If not being deleted, the  identifier is updated if it exists and created if it does not.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param updateInstrumentIdentifierRequest The identifier to update or delete. This need not be the same value as the               &#39;identifier&#39; parameter used to retrieve the instrument. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;Instrument&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated instrument definition with the identifier created, updated or deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Instrument> updateInstrumentIdentifierWithHttpInfo(String identifierType, String identifier, UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest, String scope) throws ApiException {
        okhttp3.Call localVarCall = updateInstrumentIdentifierValidateBeforeCall(identifierType, identifier, updateInstrumentIdentifierRequest, scope, null);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * UpdateInstrumentIdentifier: Update instrument identifier (asynchronously)
     * Create, update or delete a particular instrument identifier for an instrument.                To delete the identifier, leave the value unspecified in the request. If not being deleted, the  identifier is updated if it exists and created if it does not.
     * @param identifierType The unique identifier type to search, for example &#39;Figi&#39;. (required)
     * @param identifier An &lt;i&gt;identifierType&lt;/i&gt; value to use to identify the instrument, for example &#39;BBG000BLNNV0&#39;. (required)
     * @param updateInstrumentIdentifierRequest The identifier to update or delete. This need not be the same value as the               &#39;identifier&#39; parameter used to retrieve the instrument. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The updated instrument definition with the identifier created, updated or deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateInstrumentIdentifierAsync(String identifierType, String identifier, UpdateInstrumentIdentifierRequest updateInstrumentIdentifierRequest, String scope, final ApiCallback<Instrument> _callback) throws ApiException {
        okhttp3.Call localVarCall = updateInstrumentIdentifierValidateBeforeCall(identifierType, identifier, updateInstrumentIdentifierRequest, scope, _callback);
        Type localVarReturnType = new TypeToken<Instrument>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertInstruments
     * @param requestBody The definitions of the instruments to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The successfully created or updated instruments along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertInstrumentsCall(Map<String, InstrumentDefinition> requestBody, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/api/instruments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertInstrumentsValidateBeforeCall(Map<String, InstrumentDefinition> requestBody, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling upsertInstruments(Async)");
        }
        

        okhttp3.Call localVarCall = upsertInstrumentsCall(requestBody, scope, _callback);
        return localVarCall;

    }

    /**
     * UpsertInstruments: Upsert instruments
     * Create or update one or more instruments in the instrument master. An instrument is updated  if it already exists and created if it does not.                In the request, each instrument definition should be keyed by a unique correlation ID. This ID is ephemeral  and not stored by LUSID. It serves only to easily identify each instrument in the response.                Note that an instrument must have at least one unique identifier, which is a combination of a type  (such as &#39;Figi&#39;) and a value (such as &#39;BBG000BS1N49&#39;). In addition, a random value is automatically  generated for a LUSID Instrument ID (LUID) unique type by the system. For more information, see  https://support.lusid.com/knowledgebase/article/KA-01862.                The response returns both the collection of successfully created or updated instruments, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.  The maximum number of instruments that this method can upsert per request is 2,000.
     * @param requestBody The definitions of the instruments to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return UpsertInstrumentsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The successfully created or updated instruments along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertInstrumentsResponse upsertInstruments(Map<String, InstrumentDefinition> requestBody, String scope) throws ApiException {
        ApiResponse<UpsertInstrumentsResponse> localVarResp = upsertInstrumentsWithHttpInfo(requestBody, scope);
        return localVarResp.getData();
    }

    /**
     * UpsertInstruments: Upsert instruments
     * Create or update one or more instruments in the instrument master. An instrument is updated  if it already exists and created if it does not.                In the request, each instrument definition should be keyed by a unique correlation ID. This ID is ephemeral  and not stored by LUSID. It serves only to easily identify each instrument in the response.                Note that an instrument must have at least one unique identifier, which is a combination of a type  (such as &#39;Figi&#39;) and a value (such as &#39;BBG000BS1N49&#39;). In addition, a random value is automatically  generated for a LUSID Instrument ID (LUID) unique type by the system. For more information, see  https://support.lusid.com/knowledgebase/article/KA-01862.                The response returns both the collection of successfully created or updated instruments, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.  The maximum number of instruments that this method can upsert per request is 2,000.
     * @param requestBody The definitions of the instruments to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;UpsertInstrumentsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The successfully created or updated instruments along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertInstrumentsResponse> upsertInstrumentsWithHttpInfo(Map<String, InstrumentDefinition> requestBody, String scope) throws ApiException {
        okhttp3.Call localVarCall = upsertInstrumentsValidateBeforeCall(requestBody, scope, null);
        Type localVarReturnType = new TypeToken<UpsertInstrumentsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * UpsertInstruments: Upsert instruments (asynchronously)
     * Create or update one or more instruments in the instrument master. An instrument is updated  if it already exists and created if it does not.                In the request, each instrument definition should be keyed by a unique correlation ID. This ID is ephemeral  and not stored by LUSID. It serves only to easily identify each instrument in the response.                Note that an instrument must have at least one unique identifier, which is a combination of a type  (such as &#39;Figi&#39;) and a value (such as &#39;BBG000BS1N49&#39;). In addition, a random value is automatically  generated for a LUSID Instrument ID (LUID) unique type by the system. For more information, see  https://support.lusid.com/knowledgebase/article/KA-01862.                The response returns both the collection of successfully created or updated instruments, as well as those  that failed. For each failure, a reason is provided. It is important to check the failed set for  unsuccessful results.  The maximum number of instruments that this method can upsert per request is 2,000.
     * @param requestBody The definitions of the instruments to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The successfully created or updated instruments along with any failures </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertInstrumentsAsync(Map<String, InstrumentDefinition> requestBody, String scope, final ApiCallback<UpsertInstrumentsResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertInstrumentsValidateBeforeCall(requestBody, scope, _callback);
        Type localVarReturnType = new TypeToken<UpsertInstrumentsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertInstrumentsProperties
     * @param upsertInstrumentPropertyRequest A list of instruments and associated instrument properties to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The asAt datetime at which the properties were created or updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertInstrumentsPropertiesCall(List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest, String scope, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertInstrumentPropertyRequest;

        // create path and map variables
        String localVarPath = "/api/instruments/$upsertproperties";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (scope != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("scope", scope));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "0.11.4778");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertInstrumentsPropertiesValidateBeforeCall(List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest, String scope, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'upsertInstrumentPropertyRequest' is set
        if (upsertInstrumentPropertyRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertInstrumentPropertyRequest' when calling upsertInstrumentsProperties(Async)");
        }
        

        okhttp3.Call localVarCall = upsertInstrumentsPropertiesCall(upsertInstrumentPropertyRequest, scope, _callback);
        return localVarCall;

    }

    /**
     * UpsertInstrumentsProperties: Upsert instruments properties
     * Create or update one or more properties for particular instruments.                Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param upsertInstrumentPropertyRequest A list of instruments and associated instrument properties to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return UpsertInstrumentPropertiesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The asAt datetime at which the properties were created or updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public UpsertInstrumentPropertiesResponse upsertInstrumentsProperties(List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest, String scope) throws ApiException {
        ApiResponse<UpsertInstrumentPropertiesResponse> localVarResp = upsertInstrumentsPropertiesWithHttpInfo(upsertInstrumentPropertyRequest, scope);
        return localVarResp.getData();
    }

    /**
     * UpsertInstrumentsProperties: Upsert instruments properties
     * Create or update one or more properties for particular instruments.                Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param upsertInstrumentPropertyRequest A list of instruments and associated instrument properties to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @return ApiResponse&lt;UpsertInstrumentPropertiesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The asAt datetime at which the properties were created or updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpsertInstrumentPropertiesResponse> upsertInstrumentsPropertiesWithHttpInfo(List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest, String scope) throws ApiException {
        okhttp3.Call localVarCall = upsertInstrumentsPropertiesValidateBeforeCall(upsertInstrumentPropertyRequest, scope, null);
        Type localVarReturnType = new TypeToken<UpsertInstrumentPropertiesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * UpsertInstrumentsProperties: Upsert instruments properties (asynchronously)
     * Create or update one or more properties for particular instruments.                Each instrument property is updated if it exists and created if it does not. For any failures, a reason  is provided.                Properties have an &lt;i&gt;effectiveFrom&lt;/i&gt; datetime from which the property is valid, and an &lt;i&gt;effectiveUntil&lt;/i&gt;  datetime until which the property is valid. Not supplying an &lt;i&gt;effectiveUntil&lt;/i&gt; datetime results in the property being  valid indefinitely, or until the next &lt;i&gt;effectiveFrom&lt;/i&gt; datetime of the property.
     * @param upsertInstrumentPropertyRequest A list of instruments and associated instrument properties to create or update. (required)
     * @param scope The scope in which the instrument lies. When not supplied the scope is &#39;default&#39;. (optional, default to default)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The asAt datetime at which the properties were created or updated. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertInstrumentsPropertiesAsync(List<UpsertInstrumentPropertyRequest> upsertInstrumentPropertyRequest, String scope, final ApiCallback<UpsertInstrumentPropertiesResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertInstrumentsPropertiesValidateBeforeCall(upsertInstrumentPropertyRequest, scope, _callback);
        Type localVarReturnType = new TypeToken<UpsertInstrumentPropertiesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
