/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](../../../api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application   | Description                                                                       | API / Swagger Documentation                          | |---------------|-----------------------------------------------------------------------------------|------------------------------------------------------| | LUSID         | Open, API-first, developer-friendly investment data platform.                     | [Swagger](../../../api/swagger/index.html)           | | Web app       | User-facing front end for LUSID.                                                  | [Swagger](../../../app/swagger/index.html)           | | Scheduler     | Automated job scheduler.                                                          | [Swagger](../../../scheduler2/swagger/index.html)    | | Insights      | Monitoring and troubleshooting service.                                           | [Swagger](../../../insights/swagger/index.html)      | | Identity      | Identity management for LUSID (in conjunction with Access)                        | [Swagger](../../../identity/swagger/index.html)      | | Access        | Access control for LUSID (in conjunction with Identity)                           | [Swagger](../../../access/swagger/index.html)        | | Drive         | Secure file repository and manager for collaboration.                             | [Swagger](../../../drive/swagger/index.html)         | | Luminesce     | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](../../../honeycomb/swagger/index.html)     | | Notification  | Notification service.                                                             | [Swagger](../../../notification/swagger/index.html)  | | Configuration | File store for secrets and other sensitive information.                           | [Swagger](../../../configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"172\">172</a>|Entity With Id Does Not Exist|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"795\">795</a>|Cannot delete identifier definition|  | | <a name=\"796\">796</a>|Tax rule set not found.|  | | <a name=\"797\">797</a>|A tax rule set with this id already exists.|  | | <a name=\"798\">798</a>|Multiple rule sets for the same property key are applicable.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | | <a name=\"811\">811</a>|A price could not be found for an order.|  | | <a name=\"812\">812</a>|A price could not be found for an allocation.|  | | <a name=\"813\">813</a>|Chart of Accounts not found.|  | | <a name=\"814\">814</a>|Account not found.|  | | <a name=\"815\">815</a>|Abor not found.|  | | <a name=\"816\">816</a>|Abor Configuration not found.|  | | <a name=\"817\">817</a>|Reconciliation mapping not found|  | | <a name=\"818\">818</a>|Attribute type could not be deleted because it doesn't exist.|  | | <a name=\"819\">819</a>|Reconciliation not found.|  | | <a name=\"820\">820</a>|Custodian Account not found.|  | | <a name=\"821\">821</a>|Allocation Failure|  | | <a name=\"822\">822</a>|Reconciliation run not found|  | | <a name=\"823\">823</a>|Reconciliation break not found|  | | <a name=\"824\">824</a>|Entity link type could not be deleted because it doesn't exist.|  | | <a name=\"828\">828</a>|Address key definition not found.|  | | <a name=\"829\">829</a>|Compliance template not found.|  | | <a name=\"830\">830</a>|Action not supported|  | | <a name=\"831\">831</a>|Reference list not found.|  | | <a name=\"832\">832</a>|Posting Module not found.|  | | <a name=\"833\">833</a>|The type of parameter provided did not match that required by the compliance rule.|  | | <a name=\"834\">834</a>|The parameters provided by a rule did not match those required by its template.|  | | <a name=\"835\">835</a>|PostingModuleRule has a not allowed Property Domain.|  | | <a name=\"836\">836</a>|Structured result data not found.|  | | <a name=\"837\">837</a>|Diary entry not found.|  | | <a name=\"838\">838</a>|Diary entry could not be created.|  | | <a name=\"839\">839</a>|Diary entry already exists.|  | | <a name=\"861\">861</a>|Compliance run summary not found.|  | | <a name=\"869\">869</a>|Conflicting instrument properties in batch.|  | | <a name=\"870\">870</a>|Compliance run summary already exists.|  | 
 *
 * The version of the OpenAPI document: 1.0.469
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.Compounding;
import com.finbourne.lusid.model.FlowConventionName;
import com.finbourne.lusid.model.FlowConventions;
import com.finbourne.lusid.model.IndexConvention;
import com.finbourne.lusid.model.StepSchedule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Definition of the set of flow and index conventions along with other miscellaneous information required to generate an instrument leg.
 */
@ApiModel(description = "Definition of the set of flow and index conventions along with other miscellaneous information required to generate an instrument leg.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LegDefinition {
  public static final String SERIALIZED_NAME_CONVENTION_NAME = "conventionName";
  @SerializedName(SERIALIZED_NAME_CONVENTION_NAME)
  private FlowConventionName conventionName;

  public static final String SERIALIZED_NAME_CONVENTIONS = "conventions";
  @SerializedName(SERIALIZED_NAME_CONVENTIONS)
  private FlowConventions conventions;

  public static final String SERIALIZED_NAME_INDEX_CONVENTION = "indexConvention";
  @SerializedName(SERIALIZED_NAME_INDEX_CONVENTION)
  private IndexConvention indexConvention;

  public static final String SERIALIZED_NAME_INDEX_CONVENTION_NAME = "indexConventionName";
  @SerializedName(SERIALIZED_NAME_INDEX_CONVENTION_NAME)
  private FlowConventionName indexConventionName;

  public static final String SERIALIZED_NAME_NOTIONAL_EXCHANGE_TYPE = "notionalExchangeType";
  @SerializedName(SERIALIZED_NAME_NOTIONAL_EXCHANGE_TYPE)
  private String notionalExchangeType;

  public static final String SERIALIZED_NAME_PAY_RECEIVE = "payReceive";
  @SerializedName(SERIALIZED_NAME_PAY_RECEIVE)
  private String payReceive;

  public static final String SERIALIZED_NAME_RATE_OR_SPREAD = "rateOrSpread";
  @SerializedName(SERIALIZED_NAME_RATE_OR_SPREAD)
  private java.math.BigDecimal rateOrSpread;

  public static final String SERIALIZED_NAME_RESET_CONVENTION = "resetConvention";
  @SerializedName(SERIALIZED_NAME_RESET_CONVENTION)
  private String resetConvention;

  public static final String SERIALIZED_NAME_STUB_TYPE = "stubType";
  @SerializedName(SERIALIZED_NAME_STUB_TYPE)
  private String stubType;

  public static final String SERIALIZED_NAME_COMPOUNDING = "compounding";
  @SerializedName(SERIALIZED_NAME_COMPOUNDING)
  private Compounding compounding;

  public static final String SERIALIZED_NAME_AMORTISATION = "amortisation";
  @SerializedName(SERIALIZED_NAME_AMORTISATION)
  private StepSchedule amortisation = null;

  public static final String SERIALIZED_NAME_FIRST_REGULAR_PAYMENT_DATE = "firstRegularPaymentDate";
  @SerializedName(SERIALIZED_NAME_FIRST_REGULAR_PAYMENT_DATE)
  private OffsetDateTime firstRegularPaymentDate;

  public static final String SERIALIZED_NAME_FIRST_COUPON_TYPE = "firstCouponType";
  @SerializedName(SERIALIZED_NAME_FIRST_COUPON_TYPE)
  private String firstCouponType;

  public static final String SERIALIZED_NAME_LAST_REGULAR_PAYMENT_DATE = "lastRegularPaymentDate";
  @SerializedName(SERIALIZED_NAME_LAST_REGULAR_PAYMENT_DATE)
  private OffsetDateTime lastRegularPaymentDate;

  public static final String SERIALIZED_NAME_LAST_COUPON_TYPE = "lastCouponType";
  @SerializedName(SERIALIZED_NAME_LAST_COUPON_TYPE)
  private String lastCouponType;


  public LegDefinition conventionName(FlowConventionName conventionName) {
    this.conventionName = conventionName; 
    return this;
  }

   /**
   * Get conventionName
   * @return conventionName
  **/
  @ApiModelProperty(value = "")
  public FlowConventionName getConventionName() {
    return conventionName;
  }

  public void setConventionName(FlowConventionName conventionName) {
    this.conventionName = conventionName;
  }


  public LegDefinition conventions(FlowConventions conventions) {
    this.conventions = conventions; 
    return this;
  }

   /**
   * Get conventions
   * @return conventions
  **/
  @ApiModelProperty(value = "")
  public FlowConventions getConventions() {
    return conventions;
  }

  public void setConventions(FlowConventions conventions) {
    this.conventions = conventions;
  }


  public LegDefinition indexConvention(IndexConvention indexConvention) {
    this.indexConvention = indexConvention; 
    return this;
  }

   /**
   * Get indexConvention
   * @return indexConvention
  **/
  @ApiModelProperty(value = "")
  public IndexConvention getIndexConvention() {
    return indexConvention;
  }

  public void setIndexConvention(IndexConvention indexConvention) {
    this.indexConvention = indexConvention;
  }


  public LegDefinition indexConventionName(FlowConventionName indexConventionName) {
    this.indexConventionName = indexConventionName; 
    return this;
  }

   /**
   * Get indexConventionName
   * @return indexConventionName
  **/
  @ApiModelProperty(value = "")
  public FlowConventionName getIndexConventionName() {
    return indexConventionName;
  }

  public void setIndexConventionName(FlowConventionName indexConventionName) {
    this.indexConventionName = indexConventionName;
  }


  public LegDefinition notionalExchangeType(String notionalExchangeType) {
    this.notionalExchangeType = notionalExchangeType; 
    return this;
  }

   /**
   * what type of notional exchange does the leg have    Supported string (enumeration) values are: [None, Initial, Final, Both].
   * @return notionalExchangeType
  **/
  @ApiModelProperty(required = true, value = "what type of notional exchange does the leg have    Supported string (enumeration) values are: [None, Initial, Final, Both].")
  public String getNotionalExchangeType() {
    return notionalExchangeType;
  }

  public void setNotionalExchangeType(String notionalExchangeType) {
    this.notionalExchangeType = notionalExchangeType;
  }


  public LegDefinition payReceive(String payReceive) {
    this.payReceive = payReceive; 
    return this;
  }

   /**
   * Is the leg to be paid or received    Supported string (enumeration) values are: [Pay, Receive].
   * @return payReceive
  **/
  @ApiModelProperty(required = true, value = "Is the leg to be paid or received    Supported string (enumeration) values are: [Pay, Receive].")
  public String getPayReceive() {
    return payReceive;
  }

  public void setPayReceive(String payReceive) {
    this.payReceive = payReceive;
  }


  public LegDefinition rateOrSpread(java.math.BigDecimal rateOrSpread) {
    this.rateOrSpread = rateOrSpread; 
    return this;
  }

   /**
   * Is there either a fixed rate (non-zero) or spread to be paid over the value of the leg.
   * @return rateOrSpread
  **/
  @ApiModelProperty(required = true, value = "Is there either a fixed rate (non-zero) or spread to be paid over the value of the leg.")
  public java.math.BigDecimal getRateOrSpread() {
    return rateOrSpread;
  }

  public void setRateOrSpread(java.math.BigDecimal rateOrSpread) {
    this.rateOrSpread = rateOrSpread;
  }


  public LegDefinition resetConvention(String resetConvention) {
    this.resetConvention = resetConvention; 
    return this;
  }

   /**
   * Control how resets are generated relative to swap payment convention(s).    Supported string (enumeration) values are: [InAdvance, InArrears].
   * @return resetConvention
  **/
  @ApiModelProperty(value = "Control how resets are generated relative to swap payment convention(s).    Supported string (enumeration) values are: [InAdvance, InArrears].")
  public String getResetConvention() {
    return resetConvention;
  }

  public void setResetConvention(String resetConvention) {
    this.resetConvention = resetConvention;
  }


  public LegDefinition stubType(String stubType) {
    this.stubType = stubType; 
    return this;
  }

   /**
   * If a stub is required should it be at the front or back of the leg.    Supported string (enumeration) values are: [None, ShortFront, ShortBack, LongBack, LongFront, Both].
   * @return stubType
  **/
  @ApiModelProperty(required = true, value = "If a stub is required should it be at the front or back of the leg.    Supported string (enumeration) values are: [None, ShortFront, ShortBack, LongBack, LongFront, Both].")
  public String getStubType() {
    return stubType;
  }

  public void setStubType(String stubType) {
    this.stubType = stubType;
  }


  public LegDefinition compounding(Compounding compounding) {
    this.compounding = compounding; 
    return this;
  }

   /**
   * Get compounding
   * @return compounding
  **/
  @ApiModelProperty(value = "")
  public Compounding getCompounding() {
    return compounding;
  }

  public void setCompounding(Compounding compounding) {
    this.compounding = compounding;
  }


  public LegDefinition amortisation(StepSchedule amortisation) {
    this.amortisation = amortisation; 
    return this;
  }

   /**
   * Get amortisation
   * @return amortisation
  **/
  @ApiModelProperty(value = "")
  public StepSchedule getAmortisation() {
    return amortisation;
  }

  public void setAmortisation(StepSchedule amortisation) {
    this.amortisation = amortisation;
  }


  public LegDefinition firstRegularPaymentDate(OffsetDateTime firstRegularPaymentDate) {
    this.firstRegularPaymentDate = firstRegularPaymentDate; 
    return this;
  }

   /**
   * Optional payment date of the first regular coupon.  Must be greater than the StartDate.  If set, the regular coupon schedule will be built such that the first regular coupon  will end on this date. The start date of this coupon will be calculated as normal and  a stub coupon will be created from the StartDate to the start of the first regular coupon.
   * @return firstRegularPaymentDate
  **/
  @ApiModelProperty(value = "Optional payment date of the first regular coupon.  Must be greater than the StartDate.  If set, the regular coupon schedule will be built such that the first regular coupon  will end on this date. The start date of this coupon will be calculated as normal and  a stub coupon will be created from the StartDate to the start of the first regular coupon.")
  public OffsetDateTime getFirstRegularPaymentDate() {
    return firstRegularPaymentDate;
  }

  public void setFirstRegularPaymentDate(OffsetDateTime firstRegularPaymentDate) {
    this.firstRegularPaymentDate = firstRegularPaymentDate;
  }


  public LegDefinition firstCouponType(String firstCouponType) {
    this.firstCouponType = firstCouponType; 
    return this;
  }

   /**
   * Optional coupon type setting for the first coupon, can be used with Stub coupons.  If set to \&quot;ProRata\&quot; (the default), the coupon year fraction is calculated as normal,  however if set to \&quot;Full\&quot; the year fraction is overwritten with the standard year fraction  for a regular ful\&quot; coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full].
   * @return firstCouponType
  **/
  @ApiModelProperty(value = "Optional coupon type setting for the first coupon, can be used with Stub coupons.  If set to \"ProRata\" (the default), the coupon year fraction is calculated as normal,  however if set to \"Full\" the year fraction is overwritten with the standard year fraction  for a regular ful\" coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full].")
  public String getFirstCouponType() {
    return firstCouponType;
  }

  public void setFirstCouponType(String firstCouponType) {
    this.firstCouponType = firstCouponType;
  }


  public LegDefinition lastRegularPaymentDate(OffsetDateTime lastRegularPaymentDate) {
    this.lastRegularPaymentDate = lastRegularPaymentDate; 
    return this;
  }

   /**
   * Optional payment date of the last regular coupon.  Must be less than the Maturity date.  If set, the regular coupon schedule will be built up to this date and the final  coupon will be a stub between this date and the Maturity date.
   * @return lastRegularPaymentDate
  **/
  @ApiModelProperty(value = "Optional payment date of the last regular coupon.  Must be less than the Maturity date.  If set, the regular coupon schedule will be built up to this date and the final  coupon will be a stub between this date and the Maturity date.")
  public OffsetDateTime getLastRegularPaymentDate() {
    return lastRegularPaymentDate;
  }

  public void setLastRegularPaymentDate(OffsetDateTime lastRegularPaymentDate) {
    this.lastRegularPaymentDate = lastRegularPaymentDate;
  }


  public LegDefinition lastCouponType(String lastCouponType) {
    this.lastCouponType = lastCouponType; 
    return this;
  }

   /**
   * Optional coupon type setting for the last coupon, can be used with Stub coupons.  If set to \&quot;ProRata\&quot; (the default), the coupon year fraction is calculated as normal,  however if set to \&quot;Full\&quot; the year fraction is overwritten with the standard year fraction  for a regular ful\&quot; coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full].
   * @return lastCouponType
  **/
  @ApiModelProperty(value = "Optional coupon type setting for the last coupon, can be used with Stub coupons.  If set to \"ProRata\" (the default), the coupon year fraction is calculated as normal,  however if set to \"Full\" the year fraction is overwritten with the standard year fraction  for a regular ful\" coupon. Note this does not use the day count convention but rather is defined  directly from the tenor (i.e. a quarterly leg will be set to 0.25).    Supported string (enumeration) values are: [ProRata, Full].")
  public String getLastCouponType() {
    return lastCouponType;
  }

  public void setLastCouponType(String lastCouponType) {
    this.lastCouponType = lastCouponType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegDefinition {\n");
    sb.append("    conventionName: ").append(toIndentedString(conventionName)).append("\n");
    sb.append("    conventions: ").append(toIndentedString(conventions)).append("\n");
    sb.append("    indexConvention: ").append(toIndentedString(indexConvention)).append("\n");
    sb.append("    indexConventionName: ").append(toIndentedString(indexConventionName)).append("\n");
    sb.append("    notionalExchangeType: ").append(toIndentedString(notionalExchangeType)).append("\n");
    sb.append("    payReceive: ").append(toIndentedString(payReceive)).append("\n");
    sb.append("    rateOrSpread: ").append(toIndentedString(rateOrSpread)).append("\n");
    sb.append("    resetConvention: ").append(toIndentedString(resetConvention)).append("\n");
    sb.append("    stubType: ").append(toIndentedString(stubType)).append("\n");
    sb.append("    compounding: ").append(toIndentedString(compounding)).append("\n");
    sb.append("    amortisation: ").append(toIndentedString(amortisation)).append("\n");
    sb.append("    firstRegularPaymentDate: ").append(toIndentedString(firstRegularPaymentDate)).append("\n");
    sb.append("    firstCouponType: ").append(toIndentedString(firstCouponType)).append("\n");
    sb.append("    lastRegularPaymentDate: ").append(toIndentedString(lastRegularPaymentDate)).append("\n");
    sb.append("    lastCouponType: ").append(toIndentedString(lastCouponType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
