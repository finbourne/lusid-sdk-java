/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](../../../api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application   | Description                                                                       | API / Swagger Documentation                          | |---------------|-----------------------------------------------------------------------------------|------------------------------------------------------| | LUSID         | Open, API-first, developer-friendly investment data platform.                     | [Swagger](../../../api/swagger/index.html)           | | Web app       | User-facing front end for LUSID.                                                  | [Swagger](../../../app/swagger/index.html)           | | Scheduler     | Automated job scheduler.                                                          | [Swagger](../../../scheduler2/swagger/index.html)    | | Insights      | Monitoring and troubleshooting service.                                           | [Swagger](../../../insights/swagger/index.html)      | | Identity      | Identity management for LUSID (in conjunction with Access)                        | [Swagger](../../../identity/swagger/index.html)      | | Access        | Access control for LUSID (in conjunction with Identity)                           | [Swagger](../../../access/swagger/index.html)        | | Drive         | Secure file repository and manager for collaboration.                             | [Swagger](../../../drive/swagger/index.html)         | | Luminesce     | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](../../../honeycomb/swagger/index.html)     | | Notification  | Notification service.                                                             | [Swagger](../../../notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information.                           | [Swagger](../../../configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"795\">795</a>|Cannot delete identifier definition|  | | <a name=\"796\">796</a>|Tax rule set not found.|  | | <a name=\"797\">797</a>|A tax rule set with this id already exists.|  | | <a name=\"798\">798</a>|Multiple rule sets for the same property key are applicable.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | | <a name=\"811\">811</a>|A price could not be found for an order.|  | | <a name=\"812\">812</a>|A price could not be found for an allocation.|  | | <a name=\"813\">813</a>|Chart of Accounts not found.|  | | <a name=\"814\">814</a>|Account not found.|  | | <a name=\"815\">815</a>|Abor not found.|  | | <a name=\"816\">816</a>|Abor Configuration not found.|  | | <a name=\"817\">817</a>|Reconciliation mapping not found|  | | <a name=\"818\">818</a>|Attribute type could not be deleted because it doesn't exist.|  | | <a name=\"819\">819</a>|Reconciliation not found.|  | | <a name=\"820\">820</a>|Custodian Account not found.|  | | <a name=\"821\">821</a>|Allocation Failure|  | | <a name=\"822\">822</a>|Reconciliation run not found|  | | <a name=\"823\">823</a>|Reconciliation break not found|  | | <a name=\"824\">824</a>|Entity link type could not be deleted because it doesn't exist.|  | | <a name=\"828\">828</a>|Address key definition not found.|  | | <a name=\"829\">829</a>|Compliance template not found.|  | | <a name=\"830\">830</a>|Action not supported|  | | <a name=\"831\">831</a>|Reference list not found.|  | | <a name=\"832\">832</a>|Posting Module not found.|  | | <a name=\"833\">833</a>|The type of parameter provided did not match that required by the compliance rule.|  | | <a name=\"834\">834</a>|The parameters provided by a rule did not match those required by its template.|  | | <a name=\"835\">835</a>|PostingModuleRule has a not allowed Property Domain.|  | 
 *
 * The version of the OpenAPI document: 1.0.271
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import com.finbourne.lusid.model.*;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(AddressKeyList.class, new TypeSelector<AddressKeyList>() {
                    @Override
                    public Class<? extends AddressKeyList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AddressKeyList", AddressKeyList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(AmortisationEvent.class, new TypeSelector<AmortisationEvent>() {
                    @Override
                    public Class<? extends AmortisationEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AmortisationEvent", AmortisationEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(Basket.class, new TypeSelector<Basket>() {
                    @Override
                    public Class<? extends Basket> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Basket", Basket.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(Bond.class, new TypeSelector<Bond>() {
                    @Override
                    public Class<? extends Bond> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Bond", Bond.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(BondDefaultEvent.class, new TypeSelector<BondDefaultEvent>() {
                    @Override
                    public Class<? extends BondDefaultEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("BondDefaultEvent", BondDefaultEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(CapFloor.class, new TypeSelector<CapFloor>() {
                    @Override
                    public Class<? extends CapFloor> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CapFloor", CapFloor.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(CashDependency.class, new TypeSelector<CashDependency>() {
                    @Override
                    public Class<? extends CashDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashDependency", CashDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(CashDividendEvent.class, new TypeSelector<CashDividendEvent>() {
                    @Override
                    public Class<? extends CashDividendEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashDividendEvent", CashDividendEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(CashFlowEvent.class, new TypeSelector<CashFlowEvent>() {
                    @Override
                    public Class<? extends CashFlowEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashFlowEvent", CashFlowEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(CashFlowValue.class, new TypeSelector<CashFlowValue>() {
                    @Override
                    public Class<? extends CashFlowValue> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashFlowValue", CashFlowValue.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(CashFlowValueSet.class, new TypeSelector<CashFlowValueSet>() {
                    @Override
                    public Class<? extends CashFlowValueSet> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashFlowValueSet", CashFlowValueSet.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(CashPerpetual.class, new TypeSelector<CashPerpetual>() {
                    @Override
                    public Class<? extends CashPerpetual> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashPerpetual", CashPerpetual.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(CdsIndex.class, new TypeSelector<CdsIndex>() {
                    @Override
                    public Class<? extends CdsIndex> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CdsIndex", CdsIndex.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(CloseEvent.class, new TypeSelector<CloseEvent>() {
                    @Override
                    public Class<? extends CloseEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CloseEvent", CloseEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(ComplexBond.class, new TypeSelector<ComplexBond>() {
                    @Override
                    public Class<? extends ComplexBond> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ComplexBond", ComplexBond.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(ComplexMarketData.class, new TypeSelector<ComplexMarketData>() {
                    @Override
                    public Class<? extends ComplexMarketData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CreditSpreadCurveData", CreditSpreadCurveData.class);
                        classByDiscriminatorValue.put("DiscountFactorCurveData", DiscountFactorCurveData.class);
                        classByDiscriminatorValue.put("EquityCurveByPricesData", EquityCurveByPricesData.class);
                        classByDiscriminatorValue.put("EquityVolSurfaceData", EquityVolSurfaceData.class);
                        classByDiscriminatorValue.put("FxForwardCurveByQuoteReference", FxForwardCurveByQuoteReference.class);
                        classByDiscriminatorValue.put("FxForwardCurveData", FxForwardCurveData.class);
                        classByDiscriminatorValue.put("FxForwardPipsCurveData", FxForwardPipsCurveData.class);
                        classByDiscriminatorValue.put("FxForwardTenorCurveData", FxForwardTenorCurveData.class);
                        classByDiscriminatorValue.put("FxForwardTenorPipsCurveData", FxForwardTenorPipsCurveData.class);
                        classByDiscriminatorValue.put("FxVolSurfaceData", FxVolSurfaceData.class);
                        classByDiscriminatorValue.put("IrVolCubeData", IrVolCubeData.class);
                        classByDiscriminatorValue.put("OpaqueMarketData", OpaqueMarketData.class);
                        classByDiscriminatorValue.put("YieldCurveData", YieldCurveData.class);
                        classByDiscriminatorValue.put("ComplexMarketData", ComplexMarketData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(ContractForDifference.class, new TypeSelector<ContractForDifference>() {
                    @Override
                    public Class<? extends ContractForDifference> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ContractForDifference", ContractForDifference.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(CreditDefaultSwap.class, new TypeSelector<CreditDefaultSwap>() {
                    @Override
                    public Class<? extends CreditDefaultSwap> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CreditDefaultSwap", CreditDefaultSwap.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(CreditSpreadCurveData.class, new TypeSelector<CreditSpreadCurveData>() {
                    @Override
                    public Class<? extends CreditSpreadCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CreditSpreadCurveData", CreditSpreadCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(DecimalList.class, new TypeSelector<DecimalList>() {
                    @Override
                    public Class<? extends DecimalList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("DecimalList", DecimalList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(DiscountFactorCurveData.class, new TypeSelector<DiscountFactorCurveData>() {
                    @Override
                    public Class<? extends DiscountFactorCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("DiscountFactorCurveData", DiscountFactorCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(DiscountingDependency.class, new TypeSelector<DiscountingDependency>() {
                    @Override
                    public Class<? extends DiscountingDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("DiscountingDependency", DiscountingDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(EconomicDependency.class, new TypeSelector<EconomicDependency>() {
                    @Override
                    public Class<? extends EconomicDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashDependency", CashDependency.class);
                        classByDiscriminatorValue.put("DiscountingDependency", DiscountingDependency.class);
                        classByDiscriminatorValue.put("EquityCurveDependency", EquityCurveDependency.class);
                        classByDiscriminatorValue.put("EquityVolDependency", EquityVolDependency.class);
                        classByDiscriminatorValue.put("FxDependency", FxDependency.class);
                        classByDiscriminatorValue.put("FxForwardsDependency", FxForwardsDependency.class);
                        classByDiscriminatorValue.put("FxVolDependency", FxVolDependency.class);
                        classByDiscriminatorValue.put("IndexProjectionDependency", IndexProjectionDependency.class);
                        classByDiscriminatorValue.put("IrVolDependency", IrVolDependency.class);
                        classByDiscriminatorValue.put("OpaqueDependency", OpaqueDependency.class);
                        classByDiscriminatorValue.put("QuoteDependency", QuoteDependency.class);
                        classByDiscriminatorValue.put("EconomicDependency", EconomicDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(EmptyModelOptions.class, new TypeSelector<EmptyModelOptions>() {
                    @Override
                    public Class<? extends EmptyModelOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EmptyModelOptions", EmptyModelOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "modelOptionsType"));
                    }
          })
                .registerTypeSelector(Equity.class, new TypeSelector<Equity>() {
                    @Override
                    public Class<? extends Equity> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Equity", Equity.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(EquityCurveByPricesData.class, new TypeSelector<EquityCurveByPricesData>() {
                    @Override
                    public Class<? extends EquityCurveByPricesData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityCurveByPricesData", EquityCurveByPricesData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(EquityCurveDependency.class, new TypeSelector<EquityCurveDependency>() {
                    @Override
                    public Class<? extends EquityCurveDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityCurveDependency", EquityCurveDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(EquityModelOptions.class, new TypeSelector<EquityModelOptions>() {
                    @Override
                    public Class<? extends EquityModelOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityModelOptions", EquityModelOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "modelOptionsType"));
                    }
          })
                .registerTypeSelector(EquityOption.class, new TypeSelector<EquityOption>() {
                    @Override
                    public Class<? extends EquityOption> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityOption", EquityOption.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(EquitySwap.class, new TypeSelector<EquitySwap>() {
                    @Override
                    public Class<? extends EquitySwap> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquitySwap", EquitySwap.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(EquityVolDependency.class, new TypeSelector<EquityVolDependency>() {
                    @Override
                    public Class<? extends EquityVolDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityVolDependency", EquityVolDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(EquityVolSurfaceData.class, new TypeSelector<EquityVolSurfaceData>() {
                    @Override
                    public Class<? extends EquityVolSurfaceData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquityVolSurfaceData", EquityVolSurfaceData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(ExchangeTradedOption.class, new TypeSelector<ExchangeTradedOption>() {
                    @Override
                    public Class<? extends ExchangeTradedOption> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ExchangeTradedOption", ExchangeTradedOption.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(ExerciseEvent.class, new TypeSelector<ExerciseEvent>() {
                    @Override
                    public Class<? extends ExerciseEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ExerciseEvent", ExerciseEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(ExoticInstrument.class, new TypeSelector<ExoticInstrument>() {
                    @Override
                    public Class<? extends ExoticInstrument> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ExoticInstrument", ExoticInstrument.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FixedLeg.class, new TypeSelector<FixedLeg>() {
                    @Override
                    public Class<? extends FixedLeg> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FixedLeg", FixedLeg.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FloatingLeg.class, new TypeSelector<FloatingLeg>() {
                    @Override
                    public Class<? extends FloatingLeg> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FloatingLeg", FloatingLeg.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(ForwardRateAgreement.class, new TypeSelector<ForwardRateAgreement>() {
                    @Override
                    public Class<? extends ForwardRateAgreement> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ForwardRateAgreement", ForwardRateAgreement.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FundingLeg.class, new TypeSelector<FundingLeg>() {
                    @Override
                    public Class<? extends FundingLeg> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FundingLeg", FundingLeg.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(Future.class, new TypeSelector<Future>() {
                    @Override
                    public Class<? extends Future> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Future", Future.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FxDependency.class, new TypeSelector<FxDependency>() {
                    @Override
                    public Class<? extends FxDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxDependency", FxDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(FxForward.class, new TypeSelector<FxForward>() {
                    @Override
                    public Class<? extends FxForward> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForward", FxForward.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FxForwardCurveByQuoteReference.class, new TypeSelector<FxForwardCurveByQuoteReference>() {
                    @Override
                    public Class<? extends FxForwardCurveByQuoteReference> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardCurveByQuoteReference", FxForwardCurveByQuoteReference.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(FxForwardCurveData.class, new TypeSelector<FxForwardCurveData>() {
                    @Override
                    public Class<? extends FxForwardCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardCurveData", FxForwardCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(FxForwardModelOptions.class, new TypeSelector<FxForwardModelOptions>() {
                    @Override
                    public Class<? extends FxForwardModelOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardModelOptions", FxForwardModelOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "modelOptionsType"));
                    }
          })
                .registerTypeSelector(FxForwardPipsCurveData.class, new TypeSelector<FxForwardPipsCurveData>() {
                    @Override
                    public Class<? extends FxForwardPipsCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardPipsCurveData", FxForwardPipsCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(FxForwardTenorCurveData.class, new TypeSelector<FxForwardTenorCurveData>() {
                    @Override
                    public Class<? extends FxForwardTenorCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardTenorCurveData", FxForwardTenorCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(FxForwardTenorPipsCurveData.class, new TypeSelector<FxForwardTenorPipsCurveData>() {
                    @Override
                    public Class<? extends FxForwardTenorPipsCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardTenorPipsCurveData", FxForwardTenorPipsCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(FxForwardsDependency.class, new TypeSelector<FxForwardsDependency>() {
                    @Override
                    public Class<? extends FxForwardsDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxForwardsDependency", FxForwardsDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(FxOption.class, new TypeSelector<FxOption>() {
                    @Override
                    public Class<? extends FxOption> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxOption", FxOption.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FxSwap.class, new TypeSelector<FxSwap>() {
                    @Override
                    public Class<? extends FxSwap> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxSwap", FxSwap.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(FxVolDependency.class, new TypeSelector<FxVolDependency>() {
                    @Override
                    public Class<? extends FxVolDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxVolDependency", FxVolDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(FxVolSurfaceData.class, new TypeSelector<FxVolSurfaceData>() {
                    @Override
                    public Class<? extends FxVolSurfaceData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FxVolSurfaceData", FxVolSurfaceData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(IndexModelOptions.class, new TypeSelector<IndexModelOptions>() {
                    @Override
                    public Class<? extends IndexModelOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("IndexModelOptions", IndexModelOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "modelOptionsType"));
                    }
          })
                .registerTypeSelector(IndexProjectionDependency.class, new TypeSelector<IndexProjectionDependency>() {
                    @Override
                    public Class<? extends IndexProjectionDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("IndexProjectionDependency", IndexProjectionDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(InflationLinkedBond.class, new TypeSelector<InflationLinkedBond>() {
                    @Override
                    public Class<? extends InflationLinkedBond> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InflationLinkedBond", InflationLinkedBond.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(InflationSwap.class, new TypeSelector<InflationSwap>() {
                    @Override
                    public Class<? extends InflationSwap> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InflationSwap", InflationSwap.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(InformationalErrorEvent.class, new TypeSelector<InformationalErrorEvent>() {
                    @Override
                    public Class<? extends InformationalErrorEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InformationalErrorEvent", InformationalErrorEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(InformationalEvent.class, new TypeSelector<InformationalEvent>() {
                    @Override
                    public Class<? extends InformationalEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InformationalEvent", InformationalEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(InstrumentEvent.class, new TypeSelector<InstrumentEvent>() {
                    @Override
                    public Class<? extends InstrumentEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AmortisationEvent", AmortisationEvent.class);
                        classByDiscriminatorValue.put("BondDefaultEvent", BondDefaultEvent.class);
                        classByDiscriminatorValue.put("CashDividendEvent", CashDividendEvent.class);
                        classByDiscriminatorValue.put("CashFlowEvent", CashFlowEvent.class);
                        classByDiscriminatorValue.put("CloseEvent", CloseEvent.class);
                        classByDiscriminatorValue.put("ExerciseEvent", ExerciseEvent.class);
                        classByDiscriminatorValue.put("InformationalErrorEvent", InformationalErrorEvent.class);
                        classByDiscriminatorValue.put("InformationalEvent", InformationalEvent.class);
                        classByDiscriminatorValue.put("OpenEvent", OpenEvent.class);
                        classByDiscriminatorValue.put("RawVendorEvent", RawVendorEvent.class);
                        classByDiscriminatorValue.put("ResetEvent", ResetEvent.class);
                        classByDiscriminatorValue.put("StockSplitEvent", StockSplitEvent.class);
                        classByDiscriminatorValue.put("TransitionEvent", TransitionEvent.class);
                        classByDiscriminatorValue.put("TriggerEvent", TriggerEvent.class);
                        classByDiscriminatorValue.put("InstrumentEvent", InstrumentEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(InstrumentLeg.class, new TypeSelector<InstrumentLeg>() {
                    @Override
                    public Class<? extends InstrumentLeg> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("FixedLeg", FixedLeg.class);
                        classByDiscriminatorValue.put("FloatingLeg", FloatingLeg.class);
                        classByDiscriminatorValue.put("FundingLeg", FundingLeg.class);
                        classByDiscriminatorValue.put("InstrumentLeg", InstrumentLeg.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(InstrumentList.class, new TypeSelector<InstrumentList>() {
                    @Override
                    public Class<? extends InstrumentList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InstrumentList", InstrumentList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(InterestRateSwap.class, new TypeSelector<InterestRateSwap>() {
                    @Override
                    public Class<? extends InterestRateSwap> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InterestRateSwap", InterestRateSwap.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(InterestRateSwaption.class, new TypeSelector<InterestRateSwaption>() {
                    @Override
                    public Class<? extends InterestRateSwaption> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("InterestRateSwaption", InterestRateSwaption.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(IrVolCubeData.class, new TypeSelector<IrVolCubeData>() {
                    @Override
                    public Class<? extends IrVolCubeData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("IrVolCubeData", IrVolCubeData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(IrVolDependency.class, new TypeSelector<IrVolDependency>() {
                    @Override
                    public Class<? extends IrVolDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("IrVolDependency", IrVolDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(LifeCycleEventValue.class, new TypeSelector<LifeCycleEventValue>() {
                    @Override
                    public Class<? extends LifeCycleEventValue> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("LifeCycleEventValue", LifeCycleEventValue.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(LusidInstrument.class, new TypeSelector<LusidInstrument>() {
                    @Override
                    public Class<? extends LusidInstrument> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Basket", Basket.class);
                        classByDiscriminatorValue.put("Bond", Bond.class);
                        classByDiscriminatorValue.put("CapFloor", CapFloor.class);
                        classByDiscriminatorValue.put("CashPerpetual", CashPerpetual.class);
                        classByDiscriminatorValue.put("CdsIndex", CdsIndex.class);
                        classByDiscriminatorValue.put("ComplexBond", ComplexBond.class);
                        classByDiscriminatorValue.put("ContractForDifference", ContractForDifference.class);
                        classByDiscriminatorValue.put("CreditDefaultSwap", CreditDefaultSwap.class);
                        classByDiscriminatorValue.put("Equity", Equity.class);
                        classByDiscriminatorValue.put("EquityOption", EquityOption.class);
                        classByDiscriminatorValue.put("EquitySwap", EquitySwap.class);
                        classByDiscriminatorValue.put("ExchangeTradedOption", ExchangeTradedOption.class);
                        classByDiscriminatorValue.put("ExoticInstrument", ExoticInstrument.class);
                        classByDiscriminatorValue.put("FixedLeg", FixedLeg.class);
                        classByDiscriminatorValue.put("FloatingLeg", FloatingLeg.class);
                        classByDiscriminatorValue.put("ForwardRateAgreement", ForwardRateAgreement.class);
                        classByDiscriminatorValue.put("FundingLeg", FundingLeg.class);
                        classByDiscriminatorValue.put("Future", Future.class);
                        classByDiscriminatorValue.put("FxForward", FxForward.class);
                        classByDiscriminatorValue.put("FxOption", FxOption.class);
                        classByDiscriminatorValue.put("FxSwap", FxSwap.class);
                        classByDiscriminatorValue.put("InflationLinkedBond", InflationLinkedBond.class);
                        classByDiscriminatorValue.put("InflationSwap", InflationSwap.class);
                        classByDiscriminatorValue.put("InstrumentLeg", InstrumentLeg.class);
                        classByDiscriminatorValue.put("InterestRateSwap", InterestRateSwap.class);
                        classByDiscriminatorValue.put("InterestRateSwaption", InterestRateSwaption.class);
                        classByDiscriminatorValue.put("ReferenceInstrument", ReferenceInstrument.class);
                        classByDiscriminatorValue.put("Repo", Repo.class);
                        classByDiscriminatorValue.put("SimpleCashFlowLoan", SimpleCashFlowLoan.class);
                        classByDiscriminatorValue.put("SimpleInstrument", SimpleInstrument.class);
                        classByDiscriminatorValue.put("TermDeposit", TermDeposit.class);
                        classByDiscriminatorValue.put("LusidInstrument", LusidInstrument.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(MarketDataOptions.class, new TypeSelector<MarketDataOptions>() {
                    @Override
                    public Class<? extends MarketDataOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("MarketDataOptions", MarketDataOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataOptionsType"));
                    }
          })
                .registerTypeSelector(ModelOptions.class, new TypeSelector<ModelOptions>() {
                    @Override
                    public Class<? extends ModelOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EmptyModelOptions", EmptyModelOptions.class);
                        classByDiscriminatorValue.put("EquityModelOptions", EquityModelOptions.class);
                        classByDiscriminatorValue.put("FxForwardModelOptions", FxForwardModelOptions.class);
                        classByDiscriminatorValue.put("IndexModelOptions", IndexModelOptions.class);
                        classByDiscriminatorValue.put("OpaqueModelOptions", OpaqueModelOptions.class);
                        classByDiscriminatorValue.put("ModelOptions", ModelOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "modelOptionsType"));
                    }
          })
                .registerTypeSelector(OpaqueDependency.class, new TypeSelector<OpaqueDependency>() {
                    @Override
                    public Class<? extends OpaqueDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("OpaqueDependency", OpaqueDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(OpaqueMarketData.class, new TypeSelector<OpaqueMarketData>() {
                    @Override
                    public Class<? extends OpaqueMarketData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("OpaqueMarketData", OpaqueMarketData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
                .registerTypeSelector(OpaqueModelOptions.class, new TypeSelector<OpaqueModelOptions>() {
                    @Override
                    public Class<? extends OpaqueModelOptions> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("OpaqueModelOptions", OpaqueModelOptions.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "modelOptionsType"));
                    }
          })
                .registerTypeSelector(OpenEvent.class, new TypeSelector<OpenEvent>() {
                    @Override
                    public Class<? extends OpenEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("OpenEvent", OpenEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(PortfolioGroupIdList.class, new TypeSelector<PortfolioGroupIdList>() {
                    @Override
                    public Class<? extends PortfolioGroupIdList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PortfolioGroupIdList", PortfolioGroupIdList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(PortfolioIdList.class, new TypeSelector<PortfolioIdList>() {
                    @Override
                    public Class<? extends PortfolioIdList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PortfolioIdList", PortfolioIdList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(PortfolioResultDataKeyRule.class, new TypeSelector<PortfolioResultDataKeyRule>() {
                    @Override
                    public Class<? extends PortfolioResultDataKeyRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PortfolioResultDataKeyRule", PortfolioResultDataKeyRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultKeyRuleType"));
                    }
          })
                .registerTypeSelector(QuoteDependency.class, new TypeSelector<QuoteDependency>() {
                    @Override
                    public Class<? extends QuoteDependency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("QuoteDependency", QuoteDependency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "dependencyType"));
                    }
          })
                .registerTypeSelector(RawVendorEvent.class, new TypeSelector<RawVendorEvent>() {
                    @Override
                    public Class<? extends RawVendorEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("RawVendorEvent", RawVendorEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(ReconcileDateTimeRule.class, new TypeSelector<ReconcileDateTimeRule>() {
                    @Override
                    public Class<? extends ReconcileDateTimeRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ReconcileDateTimeRule", ReconcileDateTimeRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "ruleType"));
                    }
          })
                .registerTypeSelector(ReconcileNumericRule.class, new TypeSelector<ReconcileNumericRule>() {
                    @Override
                    public Class<? extends ReconcileNumericRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ReconcileNumericRule", ReconcileNumericRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "ruleType"));
                    }
          })
                .registerTypeSelector(ReconcileStringRule.class, new TypeSelector<ReconcileStringRule>() {
                    @Override
                    public Class<? extends ReconcileStringRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ReconcileStringRule", ReconcileStringRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "ruleType"));
                    }
          })
                .registerTypeSelector(ReconciliationRule.class, new TypeSelector<ReconciliationRule>() {
                    @Override
                    public Class<? extends ReconciliationRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ReconcileDateTimeRule", ReconcileDateTimeRule.class);
                        classByDiscriminatorValue.put("ReconcileNumericRule", ReconcileNumericRule.class);
                        classByDiscriminatorValue.put("ReconcileStringRule", ReconcileStringRule.class);
                        classByDiscriminatorValue.put("ReconciliationRule", ReconciliationRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "ruleType"));
                    }
          })
                .registerTypeSelector(ReferenceInstrument.class, new TypeSelector<ReferenceInstrument>() {
                    @Override
                    public Class<? extends ReferenceInstrument> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ReferenceInstrument", ReferenceInstrument.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(ReferenceList.class, new TypeSelector<ReferenceList>() {
                    @Override
                    public Class<? extends ReferenceList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AddressKeyList", AddressKeyList.class);
                        classByDiscriminatorValue.put("DecimalList", DecimalList.class);
                        classByDiscriminatorValue.put("InstrumentList", InstrumentList.class);
                        classByDiscriminatorValue.put("PortfolioGroupIdList", PortfolioGroupIdList.class);
                        classByDiscriminatorValue.put("PortfolioIdList", PortfolioIdList.class);
                        classByDiscriminatorValue.put("StringList", StringList.class);
                        classByDiscriminatorValue.put("ReferenceList", ReferenceList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(Repo.class, new TypeSelector<Repo>() {
                    @Override
                    public Class<? extends Repo> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Repo", Repo.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(ResetEvent.class, new TypeSelector<ResetEvent>() {
                    @Override
                    public Class<? extends ResetEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResetEvent", ResetEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(ResultDataKeyRule.class, new TypeSelector<ResultDataKeyRule>() {
                    @Override
                    public Class<? extends ResultDataKeyRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultDataKeyRule", ResultDataKeyRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultKeyRuleType"));
                    }
          })
                .registerTypeSelector(ResultKeyRule.class, new TypeSelector<ResultKeyRule>() {
                    @Override
                    public Class<? extends ResultKeyRule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PortfolioResultDataKeyRule", PortfolioResultDataKeyRule.class);
                        classByDiscriminatorValue.put("ResultDataKeyRule", ResultDataKeyRule.class);
                        classByDiscriminatorValue.put("ResultKeyRule", ResultKeyRule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultKeyRuleType"));
                    }
          })
                .registerTypeSelector(ResultValue.class, new TypeSelector<ResultValue>() {
                    @Override
                    public Class<? extends ResultValue> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CashFlowValue", CashFlowValue.class);
                        classByDiscriminatorValue.put("CashFlowValueSet", CashFlowValueSet.class);
                        classByDiscriminatorValue.put("LifeCycleEventValue", LifeCycleEventValue.class);
                        classByDiscriminatorValue.put("ResultValue0D", ResultValue0D.class);
                        classByDiscriminatorValue.put("ResultValueBool", ResultValueBool.class);
                        classByDiscriminatorValue.put("ResultValueCurrency", ResultValueCurrency.class);
                        classByDiscriminatorValue.put("ResultValueDateTimeOffset", ResultValueDateTimeOffset.class);
                        classByDiscriminatorValue.put("ResultValueDecimal", ResultValueDecimal.class);
                        classByDiscriminatorValue.put("ResultValueDictionary", ResultValueDictionary.class);
                        classByDiscriminatorValue.put("ResultValueInt", ResultValueInt.class);
                        classByDiscriminatorValue.put("ResultValueString", ResultValueString.class);
                        classByDiscriminatorValue.put("ResultValue", ResultValue.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValue0D.class, new TypeSelector<ResultValue0D>() {
                    @Override
                    public Class<? extends ResultValue0D> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValue0D", ResultValue0D.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueBool.class, new TypeSelector<ResultValueBool>() {
                    @Override
                    public Class<? extends ResultValueBool> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueBool", ResultValueBool.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueCurrency.class, new TypeSelector<ResultValueCurrency>() {
                    @Override
                    public Class<? extends ResultValueCurrency> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueCurrency", ResultValueCurrency.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueDateTimeOffset.class, new TypeSelector<ResultValueDateTimeOffset>() {
                    @Override
                    public Class<? extends ResultValueDateTimeOffset> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueDateTimeOffset", ResultValueDateTimeOffset.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueDecimal.class, new TypeSelector<ResultValueDecimal>() {
                    @Override
                    public Class<? extends ResultValueDecimal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueDecimal", ResultValueDecimal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueDictionary.class, new TypeSelector<ResultValueDictionary>() {
                    @Override
                    public Class<? extends ResultValueDictionary> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueDictionary", ResultValueDictionary.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueInt.class, new TypeSelector<ResultValueInt>() {
                    @Override
                    public Class<? extends ResultValueInt> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueInt", ResultValueInt.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(ResultValueString.class, new TypeSelector<ResultValueString>() {
                    @Override
                    public Class<? extends ResultValueString> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ResultValueString", ResultValueString.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "resultValueType"));
                    }
          })
                .registerTypeSelector(Schedule.class, new TypeSelector<Schedule>() {
                    @Override
                    public Class<? extends Schedule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("StepSchedule", StepSchedule.class);
                        classByDiscriminatorValue.put("Schedule", Schedule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "scheduleType"));
                    }
          })
                .registerTypeSelector(SimpleCashFlowLoan.class, new TypeSelector<SimpleCashFlowLoan>() {
                    @Override
                    public Class<? extends SimpleCashFlowLoan> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SimpleCashFlowLoan", SimpleCashFlowLoan.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(SimpleInstrument.class, new TypeSelector<SimpleInstrument>() {
                    @Override
                    public Class<? extends SimpleInstrument> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SimpleInstrument", SimpleInstrument.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(StepSchedule.class, new TypeSelector<StepSchedule>() {
                    @Override
                    public Class<? extends StepSchedule> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("StepSchedule", StepSchedule.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "scheduleType"));
                    }
          })
                .registerTypeSelector(StockSplitEvent.class, new TypeSelector<StockSplitEvent>() {
                    @Override
                    public Class<? extends StockSplitEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("StockSplitEvent", StockSplitEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(StringList.class, new TypeSelector<StringList>() {
                    @Override
                    public Class<? extends StringList> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("StringList", StringList.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "referenceListType"));
                    }
          })
                .registerTypeSelector(TermDeposit.class, new TypeSelector<TermDeposit>() {
                    @Override
                    public Class<? extends TermDeposit> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("TermDeposit", TermDeposit.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentType"));
                    }
          })
                .registerTypeSelector(TransitionEvent.class, new TypeSelector<TransitionEvent>() {
                    @Override
                    public Class<? extends TransitionEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("TransitionEvent", TransitionEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(TriggerEvent.class, new TypeSelector<TriggerEvent>() {
                    @Override
                    public Class<? extends TriggerEvent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("TriggerEvent", TriggerEvent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "instrumentEventType"));
                    }
          })
                .registerTypeSelector(YieldCurveData.class, new TypeSelector<YieldCurveData>() {
                    @Override
                    public Class<? extends YieldCurveData> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("YieldCurveData", YieldCurveData.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "marketDataType"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

}
