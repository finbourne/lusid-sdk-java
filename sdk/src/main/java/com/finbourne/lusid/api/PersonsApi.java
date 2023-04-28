/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](../../../api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application   | Description                                                                       | API / Swagger Documentation                          | |---------------|-----------------------------------------------------------------------------------|------------------------------------------------------| | LUSID         | Open, API-first, developer-friendly investment data platform.                     | [Swagger](../../../api/swagger/index.html)           | | Web app       | User-facing front end for LUSID.                                                  | [Swagger](../../../app/swagger/index.html)           | | Scheduler     | Automated job scheduler.                                                          | [Swagger](../../../scheduler2/swagger/index.html)    | | Insights      | Monitoring and troubleshooting service.                                           | [Swagger](../../../insights/swagger/index.html)      | | Identity      | Identity management for LUSID (in conjunction with Access)                        | [Swagger](../../../identity/swagger/index.html)      | | Access        | Access control for LUSID (in conjunction with Identity)                           | [Swagger](../../../access/swagger/index.html)        | | Drive         | Secure file repository and manager for collaboration.                             | [Swagger](../../../drive/swagger/index.html)         | | Luminesce     | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](../../../honeycomb/swagger/index.html)     | | Notification  | Notification service.                                                             | [Swagger](../../../notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information.                           | [Swagger](../../../configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"795\">795</a>|Cannot delete identifier definition|  | | <a name=\"796\">796</a>|Tax rule set not found.|  | | <a name=\"797\">797</a>|A tax rule set with this id already exists.|  | | <a name=\"798\">798</a>|Multiple rule sets for the same property key are applicable.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | | <a name=\"811\">811</a>|A price could not be found for an order.|  | | <a name=\"812\">812</a>|A price could not be found for an allocation.|  | | <a name=\"813\">813</a>|Chart of Accounts not found.|  | | <a name=\"814\">814</a>|Account not found.|  | | <a name=\"815\">815</a>|Abor not found.|  | | <a name=\"816\">816</a>|Abor Configuration not found.|  | | <a name=\"817\">817</a>|Reconciliation mapping not found|  | | <a name=\"818\">818</a>|Attribute type could not be deleted because it doesn't exist.|  | | <a name=\"819\">819</a>|Reconciliation not found.|  | | <a name=\"820\">820</a>|Custodian Account not found.|  | | <a name=\"821\">821</a>|Allocation Failure|  | | <a name=\"822\">822</a>|Reconciliation run not found|  | | <a name=\"823\">823</a>|Reconciliation break not found|  | | <a name=\"824\">824</a>|Entity link type could not be deleted because it doesn't exist.|  | 
 *
 * The version of the OpenAPI document: 1.0.117
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
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PagedResourceListOfPerson;
import com.finbourne.lusid.model.Person;
import com.finbourne.lusid.model.ResourceListOfAccessMetadataValueOf;
import com.finbourne.lusid.model.ResourceListOfPerson;
import com.finbourne.lusid.model.ResourceListOfPropertyInterval;
import com.finbourne.lusid.model.ResourceListOfRelation;
import com.finbourne.lusid.model.ResourceListOfRelationship;
import com.finbourne.lusid.model.SetPersonIdentifiersRequest;
import com.finbourne.lusid.model.SetPersonPropertiesRequest;
import com.finbourne.lusid.model.UpsertPersonAccessMetadataRequest;
import com.finbourne.lusid.model.UpsertPersonRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonsApi {
    private ApiClient localVarApiClient;
    public PersonsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PersonsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for deletePerson
     * @param idTypeScope The scope of the person identifier type. (required)
     * @param idTypeCode The code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type scope and code. This together with defined              identifier type uniquely identifies the person to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonCall(String idTypeScope, String idTypeCode, String code, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePersonValidateBeforeCall(String idTypeScope, String idTypeCode, String code, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deletePerson(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deletePerson(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePerson(Async)");
        }
        

        okhttp3.Call localVarCall = deletePersonCall(idTypeScope, idTypeCode, code, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeletePerson: Delete person
     * Delete a person. Deletion will be valid from the person&#39;s creation datetime.  This means that the person will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param idTypeScope The scope of the person identifier type. (required)
     * @param idTypeCode The code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type scope and code. This together with defined              identifier type uniquely identifies the person to delete. (required)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePerson(String idTypeScope, String idTypeCode, String code) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePersonWithHttpInfo(idTypeScope, idTypeCode, code);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeletePerson: Delete person
     * Delete a person. Deletion will be valid from the person&#39;s creation datetime.  This means that the person will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param idTypeScope The scope of the person identifier type. (required)
     * @param idTypeCode The code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type scope and code. This together with defined              identifier type uniquely identifies the person to delete. (required)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePersonWithHttpInfo(String idTypeScope, String idTypeCode, String code) throws ApiException {
        okhttp3.Call localVarCall = deletePersonValidateBeforeCall(idTypeScope, idTypeCode, code, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeletePerson: Delete person (asynchronously)
     * Delete a person. Deletion will be valid from the person&#39;s creation datetime.  This means that the person will no longer exist at any effective datetime from the asAt datetime of deletion.
     * @param idTypeScope The scope of the person identifier type. (required)
     * @param idTypeCode The code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type scope and code. This together with defined              identifier type uniquely identifies the person to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The response from deleting person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonAsync(String idTypeScope, String idTypeCode, String code, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deletePersonValidateBeforeCall(idTypeScope, idTypeCode, code, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePersonAccessMetadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonAccessMetadataCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePersonAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deletePersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deletePersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling deletePersonAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = deletePersonAccessMetadataCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry
     * Deletes the Person Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePersonAccessMetadata(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePersonAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry
     * Deletes the Person Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePersonAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = deletePersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeletePersonAccessMetadata: Delete a Person Access Metadata entry (asynchronously)
     * Deletes the Person Access Metadata entry that exactly matches the provided identifier parts.    It is important to always check to verify success (or failure).
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effective date to delete at, if this is not supplied, it will delete all data found (optional)
     * @param effectiveUntil The effective date until which the delete is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; date of the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Access Metadata with the given metadataKey has been deleted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deletePersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePersonIdentifiers
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonIdentifiersCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/identifiers"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePersonIdentifiersValidateBeforeCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deletePersonIdentifiers(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deletePersonIdentifiers(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePersonIdentifiers(Async)");
        }
        
        // verify the required parameter 'propertyKeys' is set
        if (propertyKeys == null) {
            throw new ApiException("Missing the required parameter 'propertyKeys' when calling deletePersonIdentifiers(Async)");
        }
        

        okhttp3.Call localVarCall = deletePersonIdentifiersCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeletePersonIdentifiers: Delete Person Identifiers
     * Delete identifiers that belong to the given property keys of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePersonIdentifiers(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePersonIdentifiersWithHttpInfo(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeletePersonIdentifiers: Delete Person Identifiers
     * Delete identifiers that belong to the given property keys of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePersonIdentifiersWithHttpInfo(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deletePersonIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeletePersonIdentifiers: Delete Person Identifiers (asynchronously)
     * Delete identifiers that belong to the given property keys of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the identifiers to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Identifiers or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete the identifiers. Defaults to the current LUSID system datetime if not specified.              Must not include an effective datetime if identifiers are perpetual. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the identifiers were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonIdentifiersAsync(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deletePersonIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePersonProperties
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the person&#39;s properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Properties or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonPropertiesCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/properties"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePersonPropertiesValidateBeforeCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling deletePersonProperties(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling deletePersonProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling deletePersonProperties(Async)");
        }
        
        // verify the required parameter 'propertyKeys' is set
        if (propertyKeys == null) {
            throw new ApiException("Missing the required parameter 'propertyKeys' when calling deletePersonProperties(Async)");
        }
        

        okhttp3.Call localVarCall = deletePersonPropertiesCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] DeletePersonProperties: Delete Person Properties
     * Delete all properties that belong to the given property keys of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the person&#39;s properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Properties or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @return DeletedEntityResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public DeletedEntityResponse deletePersonProperties(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt) throws ApiException {
        ApiResponse<DeletedEntityResponse> localVarResp = deletePersonPropertiesWithHttpInfo(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] DeletePersonProperties: Delete Person Properties
     * Delete all properties that belong to the given property keys of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the person&#39;s properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Properties or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @return ApiResponse&lt;DeletedEntityResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeletedEntityResponse> deletePersonPropertiesWithHttpInfo(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt) throws ApiException {
        okhttp3.Call localVarCall = deletePersonPropertiesValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, null);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] DeletePersonProperties: Delete Person Properties (asynchronously)
     * Delete all properties that belong to the given property keys of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys The property keys of the person&#39;s properties to delete. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. Each property must be from the \&quot;Person\&quot; domain. Properties or identifiers not specified in request will not be changed. (required)
     * @param effectiveAt The effective datetime or cut label at which to delete time-variant properties from.              The property must exist at the specified &#39;effectiveAt&#39; datetime. If the &#39;effectiveAt&#39; is not provided or is              before the time-variant property exists then a failure is returned. Do not specify this parameter if any of              the properties to delete are perpetual. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The datetime that the properties were deleted from the specified person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePersonPropertiesAsync(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, final ApiCallback<DeletedEntityResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = deletePersonPropertiesValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, _callback);
        Type localVarReturnType = new TypeToken<DeletedEntityResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllPersonAccessMetadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Person or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllPersonAccessMetadataCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllPersonAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getAllPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getAllPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getAllPersonAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = getAllPersonAccessMetadataCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person
     * Pass the Scope and Code of the Person identifier along with the person code parameter to retrieve the associated Access Metadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Person or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Map<String, List<AccessMetadataValue>> getAllPersonAccessMetadata(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = getAllPersonAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person
     * Pass the Scope and Code of the Person identifier along with the person code parameter to retrieve the associated Access Metadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return ApiResponse&lt;Map&lt;String, List&lt;AccessMetadataValue&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Person or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Map<String, List<AccessMetadataValue>>> getAllPersonAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getAllPersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetAllPersonAccessMetadata: Get Access Metadata rules for a Person (asynchronously)
     * Pass the Scope and Code of the Person identifier along with the person code parameter to retrieve the associated Access Metadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access metadata for the Person or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllPersonAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getAllPersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPerson
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto the person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the person. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person. Defaults to return the latest version of the person if not specified. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the person in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested person definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPersonValidateBeforeCall(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getPerson(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getPerson(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPerson(Async)");
        }
        

        okhttp3.Call localVarCall = getPersonCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPerson: Get Person
     * Retrieve the definition of a person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto the person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the person. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person. Defaults to return the latest version of the person if not specified. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the person in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return Person
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested person definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Person getPerson(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<Person> localVarResp = getPersonWithHttpInfo(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPerson: Get Person
     * Retrieve the definition of a person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto the person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the person. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person. Defaults to return the latest version of the person if not specified. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the person in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;Person&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested person definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Person> getPersonWithHttpInfo(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = getPersonValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPerson: Get Person (asynchronously)
     * Retrieve the definition of a person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto the person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param effectiveAt The effective datetime or cut label at which to retrieve the person. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person. Defaults to return the latest version of the person if not specified. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the person in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The requested person definition </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonAsync(String idTypeScope, String idTypeCode, String code, List<String> propertyKeys, String effectiveAt, OffsetDateTime asAt, List<String> relationshipDefinitionIds, final ApiCallback<Person> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPersonValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKeys, effectiveAt, asAt, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPersonAccessMetadataByKey
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Person access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonAccessMetadataByKeyCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPersonAccessMetadataByKeyValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getPersonAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getPersonAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPersonAccessMetadataByKey(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling getPersonAccessMetadataByKey(Async)");
        }
        

        okhttp3.Call localVarCall = getPersonAccessMetadataByKeyCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person
     * Get a specific Person Access Metadata by specifying the corresponding identifier parts and Person code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return List&lt;AccessMetadataValue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Person access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public List<AccessMetadataValue> getPersonAccessMetadataByKey(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        ApiResponse<List<AccessMetadataValue>> localVarResp = getPersonAccessMetadataByKeyWithHttpInfo(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person
     * Get a specific Person Access Metadata by specifying the corresponding identifier parts and Person code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @return ApiResponse&lt;List&lt;AccessMetadataValue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Person access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<AccessMetadataValue>> getPersonAccessMetadataByKeyWithHttpInfo(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt) throws ApiException {
        okhttp3.Call localVarCall = getPersonAccessMetadataByKeyValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt, null);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPersonAccessMetadataByKey: Get an entry identified by a metadataKey in the Access Metadata of a Person (asynchronously)
     * Get a specific Person Access Metadata by specifying the corresponding identifier parts and Person code                No matching will be performed through this endpoint. To retrieve an entry, it is necessary to specify, exactly, the identifier of the entry
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param effectiveAt The effectiveAt datetime at which to retrieve the Access Metadata (optional)
     * @param asAt The asAt datetime at which to retrieve the Access Metadata (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The successfully retrieved Person access metadata filtered by metadataKey or any failure. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonAccessMetadataByKeyAsync(String idTypeScope, String idTypeCode, String code, String metadataKey, String effectiveAt, OffsetDateTime asAt, final ApiCallback<List<AccessMetadataValue>> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPersonAccessMetadataByKeyValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, effectiveAt, asAt, _callback);
        Type localVarReturnType = new TypeToken<List<AccessMetadataValue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPersonPropertyTimeSeries
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely identifies the person. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;.              Each property must be from the \&quot;Person\&quot; domain. (required)
     * @param asAt The asAt datetime at which to list the person&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter and asAt fields              must not have changed since the original request. (optional)
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
    public okhttp3.Call getPersonPropertyTimeSeriesCall(String idTypeScope, String idTypeCode, String code, String propertyKey, OffsetDateTime asAt, String filter, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/properties/time-series"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
            .replaceAll("\\{" + "code" + "\\}", localVarApiClient.escapeString(code.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (propertyKey != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propertyKey", propertyKey));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPersonPropertyTimeSeriesValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String propertyKey, OffsetDateTime asAt, String filter, String page, Integer limit, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getPersonPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getPersonPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPersonPropertyTimeSeries(Async)");
        }
        
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new ApiException("Missing the required parameter 'propertyKey' when calling getPersonPropertyTimeSeries(Async)");
        }
        

        okhttp3.Call localVarCall = getPersonPropertyTimeSeriesCall(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPersonPropertyTimeSeries: Get Person Property Time Series
     * List the complete time series of a person property.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely identifies the person. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;.              Each property must be from the \&quot;Person\&quot; domain. (required)
     * @param asAt The asAt datetime at which to list the person&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter and asAt fields              must not have changed since the original request. (optional)
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
    public ResourceListOfPropertyInterval getPersonPropertyTimeSeries(String idTypeScope, String idTypeCode, String code, String propertyKey, OffsetDateTime asAt, String filter, String page, Integer limit) throws ApiException {
        ApiResponse<ResourceListOfPropertyInterval> localVarResp = getPersonPropertyTimeSeriesWithHttpInfo(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPersonPropertyTimeSeries: Get Person Property Time Series
     * List the complete time series of a person property.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely identifies the person. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;.              Each property must be from the \&quot;Person\&quot; domain. (required)
     * @param asAt The asAt datetime at which to list the person&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter and asAt fields              must not have changed since the original request. (optional)
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
    public ApiResponse<ResourceListOfPropertyInterval> getPersonPropertyTimeSeriesWithHttpInfo(String idTypeScope, String idTypeCode, String code, String propertyKey, OffsetDateTime asAt, String filter, String page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = getPersonPropertyTimeSeriesValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyInterval>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPersonPropertyTimeSeries: Get Person Property Time Series (asynchronously)
     * List the complete time series of a person property.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely identifies the person. (required)
     * @param propertyKey The property key of the property that will have its history shown. These must be in the format {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;.              Each property must be from the \&quot;Person\&quot; domain. (required)
     * @param asAt The asAt datetime at which to list the person&#39;s property history. Defaults to return the current datetime if not supplied. (optional)
     * @param filter Expression to filter the result set. Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param page The pagination token to use to continue listing properties from a previous call to get property time series.              This value is returned from the previous call. If a pagination token is provided the filter and asAt fields              must not have changed since the original request. (optional)
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
    public okhttp3.Call getPersonPropertyTimeSeriesAsync(String idTypeScope, String idTypeCode, String code, String propertyKey, OffsetDateTime asAt, String filter, String page, Integer limit, final ApiCallback<ResourceListOfPropertyInterval> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPersonPropertyTimeSeriesValidateBeforeCall(idTypeScope, idTypeCode, code, propertyKey, asAt, filter, page, limit, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPropertyInterval>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPersonRelations
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter the relations. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relations for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonRelationsCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/relations"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPersonRelationsValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getPersonRelations(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getPersonRelations(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPersonRelations(Async)");
        }
        

        okhttp3.Call localVarCall = getPersonRelationsCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPersonRelations: Get Relations for Person
     * Get relations for the specified person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter the relations. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. (optional)
     * @return ResourceListOfRelation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relations for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfRelation getPersonRelations(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        ApiResponse<ResourceListOfRelation> localVarResp = getPersonRelationsWithHttpInfo(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPersonRelations: Get Relations for Person
     * Get relations for the specified person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter the relations. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. (optional)
     * @return ApiResponse&lt;ResourceListOfRelation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relations for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfRelation> getPersonRelationsWithHttpInfo(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        okhttp3.Call localVarCall = getPersonRelationsValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes, null);
        Type localVarReturnType = new TypeToken<ResourceListOfRelation>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPersonRelations: Get Relations for Person (asynchronously)
     * Get relations for the specified person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relations. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve the person&#39;s relations. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter the relations. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifiers types (as property keys) used for referencing Persons or Legal Entities. These take the format              {domain}/{scope}/{code} e.g. \&quot;Person/CompanyDetails/Role\&quot;. They must be from the \&quot;Person\&quot; or \&quot;LegalEntity\&quot; domain.              Only identifier types stated will be used to look up relevant entities in relations. If not applicable, provide an empty array. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relations for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonRelationsAsync(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback<ResourceListOfRelation> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPersonRelationsValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfRelation>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPersonRelationships
     * @param idTypeScope Scope of the person&#39;s identifier type. (required)
     * @param idTypeCode Code of the person&#39;s identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonRelationshipsCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/relationships"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPersonRelationshipsValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling getPersonRelationships(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling getPersonRelationships(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling getPersonRelationships(Async)");
        }
        

        okhttp3.Call localVarCall = getPersonRelationshipsCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] GetPersonRelationships: Get Relationships for Person
     * Get relationships for the specified person.
     * @param idTypeScope Scope of the person&#39;s identifier type. (required)
     * @param idTypeCode Code of the person&#39;s identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @return ResourceListOfRelationship
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfRelationship getPersonRelationships(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        ApiResponse<ResourceListOfRelationship> localVarResp = getPersonRelationshipsWithHttpInfo(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] GetPersonRelationships: Get Relationships for Person
     * Get relationships for the specified person.
     * @param idTypeScope Scope of the person&#39;s identifier type. (required)
     * @param idTypeCode Code of the person&#39;s identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @return ApiResponse&lt;ResourceListOfRelationship&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfRelationship> getPersonRelationshipsWithHttpInfo(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes) throws ApiException {
        okhttp3.Call localVarCall = getPersonRelationshipsValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes, null);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] GetPersonRelationships: Get Relationships for Person (asynchronously)
     * Get relationships for the specified person.
     * @param idTypeScope Scope of the person&#39;s identifier type. (required)
     * @param idTypeCode Code of the person&#39;s identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param effectiveAt The effective datetime or cut label at which to get relationships. Defaults to the current LUSID system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to retrieve relationships. Defaults to return the latest LUSID AsAt time if not specified. (optional)
     * @param filter Expression to filter relationships. Users should provide null or empty string for this field until further notice. (optional)
     * @param identifierTypes Identifier types (as property keys) used for referencing Persons or Legal Entities.              These can be specified from the &#39;Person&#39; or &#39;LegalEntity&#39; domains and have the format {domain}/{scope}/{code}, for example              &#39;Person/CompanyDetails/Role&#39;. An Empty array may be used to return all related Entities. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The relationships for the specified person. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPersonRelationshipsAsync(String idTypeScope, String idTypeCode, String code, String effectiveAt, OffsetDateTime asAt, String filter, List<String> identifierTypes, final ApiCallback<ResourceListOfRelationship> _callback) throws ApiException {
        okhttp3.Call localVarCall = getPersonRelationshipsValidateBeforeCall(idTypeScope, idTypeCode, code, effectiveAt, asAt, filter, identifierTypes, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfRelationship>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listAllPersons
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the display name, use \&quot;displayName eq &#39;John&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Existing people </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAllPersonsCall(String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons";

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

        if (propertyKeys != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "propertyKeys", propertyKeys));
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllPersonsValidateBeforeCall(String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listAllPersonsCall(effectiveAt, asAt, page, limit, filter, propertyKeys, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] ListAllPersons: List All Persons
     * List all persons which the user is entitled to see.
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the display name, use \&quot;displayName eq &#39;John&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ResourceListOfPerson
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Existing people </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfPerson listAllPersons(String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<ResourceListOfPerson> localVarResp = listAllPersonsWithHttpInfo(effectiveAt, asAt, page, limit, filter, propertyKeys, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ListAllPersons: List All Persons
     * List all persons which the user is entitled to see.
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the display name, use \&quot;displayName eq &#39;John&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;ResourceListOfPerson&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Existing people </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfPerson> listAllPersonsWithHttpInfo(String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = listAllPersonsValidateBeforeCall(effectiveAt, asAt, page, limit, filter, propertyKeys, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<ResourceListOfPerson>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ListAllPersons: List All Persons (asynchronously)
     * List all persons which the user is entitled to see.
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 5000 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the display name, use \&quot;displayName eq &#39;John&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Existing people </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAllPersonsAsync(String effectiveAt, OffsetDateTime asAt, String page, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds, final ApiCallback<ResourceListOfPerson> _callback) throws ApiException {
        okhttp3.Call localVarCall = listAllPersonsValidateBeforeCall(effectiveAt, asAt, page, limit, filter, propertyKeys, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfPerson>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPersons
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the LUPID, use \&quot;lusidPersonId eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> People in specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPersonsCall(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()));

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPersonsValidateBeforeCall(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling listPersons(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling listPersons(Async)");
        }
        

        okhttp3.Call localVarCall = listPersonsCall(idTypeScope, idTypeCode, effectiveAt, asAt, page, start, limit, filter, propertyKeys, relationshipDefinitionIds, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] ListPersons: List Persons
     * List persons which have identifiers of a specific identifier type&#39;s scope and code, and satisfies filter criteria.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the LUPID, use \&quot;lusidPersonId eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return PagedResourceListOfPerson
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> People in specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public PagedResourceListOfPerson listPersons(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        ApiResponse<PagedResourceListOfPerson> localVarResp = listPersonsWithHttpInfo(idTypeScope, idTypeCode, effectiveAt, asAt, page, start, limit, filter, propertyKeys, relationshipDefinitionIds);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] ListPersons: List Persons
     * List persons which have identifiers of a specific identifier type&#39;s scope and code, and satisfies filter criteria.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the LUPID, use \&quot;lusidPersonId eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @return ApiResponse&lt;PagedResourceListOfPerson&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> People in specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PagedResourceListOfPerson> listPersonsWithHttpInfo(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds) throws ApiException {
        okhttp3.Call localVarCall = listPersonsValidateBeforeCall(idTypeScope, idTypeCode, effectiveAt, asAt, page, start, limit, filter, propertyKeys, relationshipDefinitionIds, null);
        Type localVarReturnType = new TypeToken<PagedResourceListOfPerson>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] ListPersons: List Persons (asynchronously)
     * List persons which have identifiers of a specific identifier type&#39;s scope and code, and satisfies filter criteria.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param effectiveAt The effective datetime or cut label at which to list the people. Defaults to the current LUSID              system datetime if not specified. (optional)
     * @param asAt The asAt datetime at which to list the people. Defaults to return the latest version              of each people if not specified. (optional)
     * @param page The pagination token to use to continue listing persons from a previous call to list persons. This              value is returned from the previous call. If a pagination token is provided the filter, effectiveAt              and asAt fields must not have changed since the original request. Also, if set, a start value cannot be provided. (optional)
     * @param start When paginating, skip this number of results. (optional)
     * @param limit When paginating, limit the number of returned results to this many. Defaults to 100 if not specified. (optional)
     * @param filter Expression to filter the result set.               For example, to filter on the LUPID, use \&quot;lusidPersonId eq &#39;string&#39;\&quot;              Read more about filtering results from LUSID here https://support.lusid.com/filtering-results-from-lusid. (optional)
     * @param propertyKeys A list of property keys from the \&quot;Person\&quot; domain to decorate onto each person,               or from any domain that supports relationships to decorate onto related entities.              These take the format {domain}/{scope}/{code} e.g. \&quot;Person/ContactDetails/Address\&quot;. (optional)
     * @param relationshipDefinitionIds A list of relationship definitions that are used to decorate related entities              onto the persons in the response. These must take the form {relationshipDefinitionScope}/{relationshipDefinitionCode}. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> People in specified scope </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPersonsAsync(String idTypeScope, String idTypeCode, String effectiveAt, OffsetDateTime asAt, String page, Integer start, Integer limit, String filter, List<String> propertyKeys, List<String> relationshipDefinitionIds, final ApiCallback<PagedResourceListOfPerson> _callback) throws ApiException {
        okhttp3.Call localVarCall = listPersonsValidateBeforeCall(idTypeScope, idTypeCode, effectiveAt, asAt, page, start, limit, filter, propertyKeys, relationshipDefinitionIds, _callback);
        Type localVarReturnType = new TypeToken<PagedResourceListOfPerson>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchPersonAccessMetadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public okhttp3.Call patchPersonAccessMetadataCall(String idTypeScope, String idTypeCode, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = accessMetadataOperation;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchPersonAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling patchPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling patchPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling patchPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'accessMetadataOperation' is set
        if (accessMetadataOperation == null) {
            throw new ApiException("Missing the required parameter 'accessMetadataOperation' when calling patchPersonAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = patchPersonAccessMetadataCall(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] PatchPersonAccessMetadata: Patch Access Metadata rules for a Person.
     * Patch Person Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Person Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public Map<String, List<AccessMetadataValue>> patchPersonAccessMetadata(String idTypeScope, String idTypeCode, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<Map<String, List<AccessMetadataValue>>> localVarResp = patchPersonAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] PatchPersonAccessMetadata: Patch Access Metadata rules for a Person.
     * Patch Person Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Person Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public ApiResponse<Map<String, List<AccessMetadataValue>>> patchPersonAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = patchPersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] PatchPersonAccessMetadata: Patch Access Metadata rules for a Person. (asynchronously)
     * Patch Person Access Metadata Rules in a single scope.  The behaviour is defined by the JSON Patch specification.                Currently only &#39;add&#39; is a supported operation on the patch document.    Currently only valid metadata keys are supported paths on the patch document.                The response will return any affected Person Access Metadata rules or a failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param accessMetadataOperation The Json Patch document (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public okhttp3.Call patchPersonAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, List<AccessMetadataOperation> accessMetadataOperation, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<Map<String, List<AccessMetadataValue>>> _callback) throws ApiException {
        okhttp3.Call localVarCall = patchPersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, accessMetadataOperation, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<Map<String, List<AccessMetadataValue>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setPersonIdentifiers
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonIdentifiersRequest Request containing identifiers to set for the person. Identifiers not specified in request will not be changed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setPersonIdentifiersCall(String idTypeScope, String idTypeCode, String code, SetPersonIdentifiersRequest setPersonIdentifiersRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setPersonIdentifiersRequest;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/identifiers"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setPersonIdentifiersValidateBeforeCall(String idTypeScope, String idTypeCode, String code, SetPersonIdentifiersRequest setPersonIdentifiersRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling setPersonIdentifiers(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling setPersonIdentifiers(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling setPersonIdentifiers(Async)");
        }
        
        // verify the required parameter 'setPersonIdentifiersRequest' is set
        if (setPersonIdentifiersRequest == null) {
            throw new ApiException("Missing the required parameter 'setPersonIdentifiersRequest' when calling setPersonIdentifiers(Async)");
        }
        

        okhttp3.Call localVarCall = setPersonIdentifiersCall(idTypeScope, idTypeCode, code, setPersonIdentifiersRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] SetPersonIdentifiers: Set Person Identifiers
     * Set identifiers of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonIdentifiersRequest Request containing identifiers to set for the person. Identifiers not specified in request will not be changed. (required)
     * @return Person
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Person setPersonIdentifiers(String idTypeScope, String idTypeCode, String code, SetPersonIdentifiersRequest setPersonIdentifiersRequest) throws ApiException {
        ApiResponse<Person> localVarResp = setPersonIdentifiersWithHttpInfo(idTypeScope, idTypeCode, code, setPersonIdentifiersRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] SetPersonIdentifiers: Set Person Identifiers
     * Set identifiers of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonIdentifiersRequest Request containing identifiers to set for the person. Identifiers not specified in request will not be changed. (required)
     * @return ApiResponse&lt;Person&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Person> setPersonIdentifiersWithHttpInfo(String idTypeScope, String idTypeCode, String code, SetPersonIdentifiersRequest setPersonIdentifiersRequest) throws ApiException {
        okhttp3.Call localVarCall = setPersonIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, setPersonIdentifiersRequest, null);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] SetPersonIdentifiers: Set Person Identifiers (asynchronously)
     * Set identifiers of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonIdentifiersRequest Request containing identifiers to set for the person. Identifiers not specified in request will not be changed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setPersonIdentifiersAsync(String idTypeScope, String idTypeCode, String code, SetPersonIdentifiersRequest setPersonIdentifiersRequest, final ApiCallback<Person> _callback) throws ApiException {
        okhttp3.Call localVarCall = setPersonIdentifiersValidateBeforeCall(idTypeScope, idTypeCode, code, setPersonIdentifiersRequest, _callback);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for setPersonProperties
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonPropertiesRequest Request containing properties to set for the person. Properties not specified in request will not be changed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated properties or identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setPersonPropertiesCall(String idTypeScope, String idTypeCode, String code, SetPersonPropertiesRequest setPersonPropertiesRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = setPersonPropertiesRequest;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/properties"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setPersonPropertiesValidateBeforeCall(String idTypeScope, String idTypeCode, String code, SetPersonPropertiesRequest setPersonPropertiesRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling setPersonProperties(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling setPersonProperties(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling setPersonProperties(Async)");
        }
        
        // verify the required parameter 'setPersonPropertiesRequest' is set
        if (setPersonPropertiesRequest == null) {
            throw new ApiException("Missing the required parameter 'setPersonPropertiesRequest' when calling setPersonProperties(Async)");
        }
        

        okhttp3.Call localVarCall = setPersonPropertiesCall(idTypeScope, idTypeCode, code, setPersonPropertiesRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] SetPersonProperties: Set Person Properties
     * Set properties of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonPropertiesRequest Request containing properties to set for the person. Properties not specified in request will not be changed. (required)
     * @return Person
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated properties or identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Person setPersonProperties(String idTypeScope, String idTypeCode, String code, SetPersonPropertiesRequest setPersonPropertiesRequest) throws ApiException {
        ApiResponse<Person> localVarResp = setPersonPropertiesWithHttpInfo(idTypeScope, idTypeCode, code, setPersonPropertiesRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] SetPersonProperties: Set Person Properties
     * Set properties of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonPropertiesRequest Request containing properties to set for the person. Properties not specified in request will not be changed. (required)
     * @return ApiResponse&lt;Person&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated properties or identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Person> setPersonPropertiesWithHttpInfo(String idTypeScope, String idTypeCode, String code, SetPersonPropertiesRequest setPersonPropertiesRequest) throws ApiException {
        okhttp3.Call localVarCall = setPersonPropertiesValidateBeforeCall(idTypeScope, idTypeCode, code, setPersonPropertiesRequest, null);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] SetPersonProperties: Set Person Properties (asynchronously)
     * Set properties of the person.
     * @param idTypeScope Scope of the person identifier type. (required)
     * @param idTypeCode Code of the person identifier type. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. This together with stated identifier type uniquely              identifies the person. (required)
     * @param setPersonPropertiesRequest Request containing properties to set for the person. Properties not specified in request will not be changed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The Person with updated properties or identifiers. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call setPersonPropertiesAsync(String idTypeScope, String idTypeCode, String code, SetPersonPropertiesRequest setPersonPropertiesRequest, final ApiCallback<Person> _callback) throws ApiException {
        okhttp3.Call localVarCall = setPersonPropertiesValidateBeforeCall(idTypeScope, idTypeCode, code, setPersonPropertiesRequest, _callback);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertPerson
     * @param upsertPersonRequest Request to create or update a person. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPersonCall(UpsertPersonRequest upsertPersonRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertPersonRequest;

        // create path and map variables
        String localVarPath = "/api/persons";

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertPersonValidateBeforeCall(UpsertPersonRequest upsertPersonRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'upsertPersonRequest' is set
        if (upsertPersonRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertPersonRequest' when calling upsertPerson(Async)");
        }
        

        okhttp3.Call localVarCall = upsertPersonCall(upsertPersonRequest, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertPerson: Upsert Person
     * Create or update a new person under the specified scope.
     * @param upsertPersonRequest Request to create or update a person. (required)
     * @return Person
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public Person upsertPerson(UpsertPersonRequest upsertPersonRequest) throws ApiException {
        ApiResponse<Person> localVarResp = upsertPersonWithHttpInfo(upsertPersonRequest);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertPerson: Upsert Person
     * Create or update a new person under the specified scope.
     * @param upsertPersonRequest Request to create or update a person. (required)
     * @return ApiResponse&lt;Person&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Person> upsertPersonWithHttpInfo(UpsertPersonRequest upsertPersonRequest) throws ApiException {
        okhttp3.Call localVarCall = upsertPersonValidateBeforeCall(upsertPersonRequest, null);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertPerson: Upsert Person (asynchronously)
     * Create or update a new person under the specified scope.
     * @param upsertPersonRequest Request to create or update a person. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> The newly created or updated person </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> The details of the input related failure </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertPersonAsync(UpsertPersonRequest upsertPersonRequest, final ApiCallback<Person> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertPersonValidateBeforeCall(upsertPersonRequest, _callback);
        Type localVarReturnType = new TypeToken<Person>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertPersonAccessMetadata
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertPersonAccessMetadataRequest The Person Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public okhttp3.Call upsertPersonAccessMetadataCall(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = upsertPersonAccessMetadataRequest;

        // create path and map variables
        String localVarPath = "/api/persons/{idTypeScope}/{idTypeCode}/{code}/metadata/{metadataKey}"
            .replaceAll("\\{" + "idTypeScope" + "\\}", localVarApiClient.escapeString(idTypeScope.toString()))
            .replaceAll("\\{" + "idTypeCode" + "\\}", localVarApiClient.escapeString(idTypeCode.toString()))
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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.0.117");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertPersonAccessMetadataValidateBeforeCall(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'idTypeScope' is set
        if (idTypeScope == null) {
            throw new ApiException("Missing the required parameter 'idTypeScope' when calling upsertPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'idTypeCode' is set
        if (idTypeCode == null) {
            throw new ApiException("Missing the required parameter 'idTypeCode' when calling upsertPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new ApiException("Missing the required parameter 'code' when calling upsertPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'metadataKey' is set
        if (metadataKey == null) {
            throw new ApiException("Missing the required parameter 'metadataKey' when calling upsertPersonAccessMetadata(Async)");
        }
        
        // verify the required parameter 'upsertPersonAccessMetadataRequest' is set
        if (upsertPersonAccessMetadataRequest == null) {
            throw new ApiException("Missing the required parameter 'upsertPersonAccessMetadataRequest' when calling upsertPersonAccessMetadata(Async)");
        }
        

        okhttp3.Call localVarCall = upsertPersonAccessMetadataCall(idTypeScope, idTypeCode, code, metadataKey, upsertPersonAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        return localVarCall;

    }

    /**
     * [EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Person Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Person Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertPersonAccessMetadataRequest The Person Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public ResourceListOfAccessMetadataValueOf upsertPersonAccessMetadata(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        ApiResponse<ResourceListOfAccessMetadataValueOf> localVarResp = upsertPersonAccessMetadataWithHttpInfo(idTypeScope, idTypeCode, code, metadataKey, upsertPersonAccessMetadataRequest, effectiveAt, effectiveUntil);
        return localVarResp.getData();
    }

    /**
     * [EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID.
     * Update or insert one Person Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Person Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertPersonAccessMetadataRequest The Person Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public ApiResponse<ResourceListOfAccessMetadataValueOf> upsertPersonAccessMetadataWithHttpInfo(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil) throws ApiException {
        okhttp3.Call localVarCall = upsertPersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, upsertPersonAccessMetadataRequest, effectiveAt, effectiveUntil, null);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessMetadataValueOf>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * [EARLY ACCESS] UpsertPersonAccessMetadata: Upsert a Person Access Metadata entry associated with a specific metadataKey. This creates or updates the data in LUSID. (asynchronously)
     * Update or insert one Person Access Metadata entry in a single scope. An item will be updated if it already exists  and inserted if it does not.                The response will return the successfully updated or inserted Person Access Metadata rule or failure message if unsuccessful.                It is important to always check to verify success (or failure).                Multiple rules for a metadataKey can exist with different effective at dates, when resources are accessed the rule that is active for the current time will be fetched.
     * @param idTypeScope Scope of the person identifier. (required)
     * @param idTypeCode Code of the person identifier. (required)
     * @param code Code of the person under specified identifier type&#39;s scope and code. (required)
     * @param metadataKey Key of the metadata entry to retrieve (required)
     * @param upsertPersonAccessMetadataRequest The Person Access Metadata entry to upsert (required)
     * @param effectiveAt The effectiveAt datetime at which to upsert the Access Metadata (optional)
     * @param effectiveUntil The effective datetime until which the Access Metadata is valid. If not supplied this will be valid indefinitely, or until the next &#39;effectiveAt&#39; datetime of the Access Metadata (optional)
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
    public okhttp3.Call upsertPersonAccessMetadataAsync(String idTypeScope, String idTypeCode, String code, String metadataKey, UpsertPersonAccessMetadataRequest upsertPersonAccessMetadataRequest, String effectiveAt, OffsetDateTime effectiveUntil, final ApiCallback<ResourceListOfAccessMetadataValueOf> _callback) throws ApiException {
        okhttp3.Call localVarCall = upsertPersonAccessMetadataValidateBeforeCall(idTypeScope, idTypeCode, code, metadataKey, upsertPersonAccessMetadataRequest, effectiveAt, effectiveUntil, _callback);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessMetadataValueOf>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
