/*
 * LUSID API
 * # Introduction  This page documents the [LUSID APIs](https://www.lusid.com/api/swagger), which allows authorised clients to query and update their data within the LUSID platform.  SDKs to interact with the LUSID APIs are available in the following languages and frameworks:  * [C#](https://github.com/finbourne/lusid-sdk-csharp) * [Java](https://github.com/finbourne/lusid-sdk-java) * [JavaScript](https://github.com/finbourne/lusid-sdk-js) * [Python](https://github.com/finbourne/lusid-sdk-python) * [Angular](https://github.com/finbourne/lusid-sdk-angular)  The LUSID platform is made up of a number of sub-applications. You can find the API / swagger documentation by following the links in the table below.   | Application | Description | API / Swagger Documentation | | ----- | ----- | ---- | | LUSID | Open, API-first, developer-friendly investment data platform. | [Swagger](https://www.lusid.com/api/swagger/index.html) | | Web app | User-facing front end for LUSID. | [Swagger](https://www.lusid.com/app/swagger/index.html) | | Scheduler | Automated job scheduler. | [Swagger](https://www.lusid.com/scheduler2/swagger/index.html) | | Insights |Monitoring and troubleshooting service. | [Swagger](https://www.lusid.com/insights/swagger/index.html) | | Identity | Identity management for LUSID (in conjuction with Access) | [Swagger](https://www.lusid.com/identity/swagger/index.html) | | Access | Access control for LUSID (in conjunction with Identity) | [Swagger](https://www.lusid.com/access/swagger/index.html) | | Drive | Secure file repository and manager for collaboration. | [Swagger](https://www.lusid.com/drive/swagger/index.html) | | Luminesce | Data virtualisation service (query data from multiple providers, including LUSID) | [Swagger](https://www.lusid.com/honeycomb/swagger/index.html) | | Notification | Notification service. | [Swagger](https://www.lusid.com/notifications/swagger/index.html) | | Configuration | File store for secrets and other sensitive information. | [Swagger](https://www.lusid.com/configuration/swagger/index.html) |   # Error Codes  | Code|Name|Description | | ---|---|--- | | <a name=\"-10\">-10</a>|Server Configuration Error|  | | <a name=\"-1\">-1</a>|Unknown error|An unexpected error was encountered on our side. | | <a name=\"102\">102</a>|Version Not Found|  | | <a name=\"103\">103</a>|Api Rate Limit Violation|  | | <a name=\"104\">104</a>|Instrument Not Found|  | | <a name=\"105\">105</a>|Property Not Found|  | | <a name=\"106\">106</a>|Portfolio Recursion Depth|  | | <a name=\"108\">108</a>|Group Not Found|  | | <a name=\"109\">109</a>|Portfolio Not Found|  | | <a name=\"110\">110</a>|Property Schema Not Found|  | | <a name=\"111\">111</a>|Portfolio Ancestry Not Found|  | | <a name=\"112\">112</a>|Portfolio With Id Already Exists|  | | <a name=\"113\">113</a>|Orphaned Portfolio|  | | <a name=\"119\">119</a>|Missing Base Claims|  | | <a name=\"121\">121</a>|Property Not Defined|  | | <a name=\"122\">122</a>|Cannot Delete System Property|  | | <a name=\"123\">123</a>|Cannot Modify Immutable Property Field|  | | <a name=\"124\">124</a>|Property Already Exists|  | | <a name=\"125\">125</a>|Invalid Property Life Time|  | | <a name=\"126\">126</a>|Property Constraint Style Excludes Properties|  | | <a name=\"127\">127</a>|Cannot Modify Default Data Type|  | | <a name=\"128\">128</a>|Group Already Exists|  | | <a name=\"129\">129</a>|No Such Data Type|  | | <a name=\"130\">130</a>|Undefined Value For Data Type|  | | <a name=\"131\">131</a>|Unsupported Value Type Defined On Data Type|  | | <a name=\"132\">132</a>|Validation Error|  | | <a name=\"133\">133</a>|Loop Detected In Group Hierarchy|  | | <a name=\"134\">134</a>|Undefined Acceptable Values|  | | <a name=\"135\">135</a>|Sub Group Already Exists|  | | <a name=\"138\">138</a>|Price Source Not Found|  | | <a name=\"139\">139</a>|Analytic Store Not Found|  | | <a name=\"141\">141</a>|Analytic Store Already Exists|  | | <a name=\"143\">143</a>|Client Instrument Already Exists|  | | <a name=\"144\">144</a>|Duplicate In Parameter Set|  | | <a name=\"147\">147</a>|Results Not Found|  | | <a name=\"148\">148</a>|Order Field Not In Result Set|  | | <a name=\"149\">149</a>|Operation Failed|  | | <a name=\"150\">150</a>|Elastic Search Error|  | | <a name=\"151\">151</a>|Invalid Parameter Value|  | | <a name=\"153\">153</a>|Command Processing Failure|  | | <a name=\"154\">154</a>|Entity State Construction Failure|  | | <a name=\"155\">155</a>|Entity Timeline Does Not Exist|  | | <a name=\"156\">156</a>|Concurrency Conflict Failure|  | | <a name=\"157\">157</a>|Invalid Request|  | | <a name=\"158\">158</a>|Event Publish Unknown|  | | <a name=\"159\">159</a>|Event Query Failure|  | | <a name=\"160\">160</a>|Blob Did Not Exist|  | | <a name=\"162\">162</a>|Sub System Request Failure|  | | <a name=\"163\">163</a>|Sub System Configuration Failure|  | | <a name=\"165\">165</a>|Failed To Delete|  | | <a name=\"166\">166</a>|Upsert Client Instrument Failure|  | | <a name=\"167\">167</a>|Illegal As At Interval|  | | <a name=\"168\">168</a>|Illegal Bitemporal Query|  | | <a name=\"169\">169</a>|Invalid Alternate Id|  | | <a name=\"170\">170</a>|Cannot Add Source Portfolio Property Explicitly|  | | <a name=\"171\">171</a>|Entity Already Exists In Group|  | | <a name=\"173\">173</a>|Entity With Id Already Exists|  | | <a name=\"174\">174</a>|Derived Portfolio Details Do Not Exist|  | | <a name=\"175\">175</a>|Entity Not In Group|  | | <a name=\"176\">176</a>|Portfolio With Name Already Exists|  | | <a name=\"177\">177</a>|Invalid Transactions|  | | <a name=\"178\">178</a>|Reference Portfolio Not Found|  | | <a name=\"179\">179</a>|Duplicate Id|  | | <a name=\"180\">180</a>|Command Retrieval Failure|  | | <a name=\"181\">181</a>|Data Filter Application Failure|  | | <a name=\"182\">182</a>|Search Failed|  | | <a name=\"183\">183</a>|Movements Engine Configuration Key Failure|  | | <a name=\"184\">184</a>|Fx Rate Source Not Found|  | | <a name=\"185\">185</a>|Accrual Source Not Found|  | | <a name=\"186\">186</a>|Access Denied|  | | <a name=\"187\">187</a>|Invalid Identity Token|  | | <a name=\"188\">188</a>|Invalid Request Headers|  | | <a name=\"189\">189</a>|Price Not Found|  | | <a name=\"190\">190</a>|Invalid Sub Holding Keys Provided|  | | <a name=\"191\">191</a>|Duplicate Sub Holding Keys Provided|  | | <a name=\"192\">192</a>|Cut Definition Not Found|  | | <a name=\"193\">193</a>|Cut Definition Invalid|  | | <a name=\"194\">194</a>|Time Variant Property Deletion Date Unspecified|  | | <a name=\"195\">195</a>|Perpetual Property Deletion Date Specified|  | | <a name=\"196\">196</a>|Time Variant Property Upsert Date Unspecified|  | | <a name=\"197\">197</a>|Perpetual Property Upsert Date Specified|  | | <a name=\"200\">200</a>|Invalid Unit For Data Type|  | | <a name=\"201\">201</a>|Invalid Type For Data Type|  | | <a name=\"202\">202</a>|Invalid Value For Data Type|  | | <a name=\"203\">203</a>|Unit Not Defined For Data Type|  | | <a name=\"204\">204</a>|Units Not Supported On Data Type|  | | <a name=\"205\">205</a>|Cannot Specify Units On Data Type|  | | <a name=\"206\">206</a>|Unit Schema Inconsistent With Data Type|  | | <a name=\"207\">207</a>|Unit Definition Not Specified|  | | <a name=\"208\">208</a>|Duplicate Unit Definitions Specified|  | | <a name=\"209\">209</a>|Invalid Units Definition|  | | <a name=\"210\">210</a>|Invalid Instrument Identifier Unit|  | | <a name=\"211\">211</a>|Holdings Adjustment Does Not Exist|  | | <a name=\"212\">212</a>|Could Not Build Excel Url|  | | <a name=\"213\">213</a>|Could Not Get Excel Version|  | | <a name=\"214\">214</a>|Instrument By Code Not Found|  | | <a name=\"215\">215</a>|Entity Schema Does Not Exist|  | | <a name=\"216\">216</a>|Feature Not Supported On Portfolio Type|  | | <a name=\"217\">217</a>|Quote Not Found|  | | <a name=\"218\">218</a>|Invalid Quote Identifier|  | | <a name=\"219\">219</a>|Invalid Metric For Data Type|  | | <a name=\"220\">220</a>|Invalid Instrument Definition|  | | <a name=\"221\">221</a>|Instrument Upsert Failure|  | | <a name=\"222\">222</a>|Reference Portfolio Request Not Supported|  | | <a name=\"223\">223</a>|Transaction Portfolio Request Not Supported|  | | <a name=\"224\">224</a>|Invalid Property Value Assignment|  | | <a name=\"230\">230</a>|Transaction Type Not Found|  | | <a name=\"231\">231</a>|Transaction Type Duplication|  | | <a name=\"232\">232</a>|Portfolio Does Not Exist At Given Date|  | | <a name=\"233\">233</a>|Query Parser Failure|  | | <a name=\"234\">234</a>|Duplicate Constituent|  | | <a name=\"235\">235</a>|Unresolved Instrument Constituent|  | | <a name=\"236\">236</a>|Unresolved Instrument In Transition|  | | <a name=\"237\">237</a>|Missing Side Definitions|  | | <a name=\"299\">299</a>|Invalid Recipe|  | | <a name=\"300\">300</a>|Missing Recipe|  | | <a name=\"301\">301</a>|Dependencies|  | | <a name=\"304\">304</a>|Portfolio Preprocess Failure|  | | <a name=\"310\">310</a>|Valuation Engine Failure|  | | <a name=\"311\">311</a>|Task Factory Failure|  | | <a name=\"312\">312</a>|Task Evaluation Failure|  | | <a name=\"313\">313</a>|Task Generation Failure|  | | <a name=\"314\">314</a>|Engine Configuration Failure|  | | <a name=\"315\">315</a>|Model Specification Failure|  | | <a name=\"320\">320</a>|Market Data Key Failure|  | | <a name=\"321\">321</a>|Market Resolver Failure|  | | <a name=\"322\">322</a>|Market Data Failure|  | | <a name=\"330\">330</a>|Curve Failure|  | | <a name=\"331\">331</a>|Volatility Surface Failure|  | | <a name=\"332\">332</a>|Volatility Cube Failure|  | | <a name=\"350\">350</a>|Instrument Failure|  | | <a name=\"351\">351</a>|Cash Flows Failure|  | | <a name=\"352\">352</a>|Reference Data Failure|  | | <a name=\"360\">360</a>|Aggregation Failure|  | | <a name=\"361\">361</a>|Aggregation Measure Failure|  | | <a name=\"370\">370</a>|Result Retrieval Failure|  | | <a name=\"371\">371</a>|Result Processing Failure|  | | <a name=\"372\">372</a>|Vendor Result Processing Failure|  | | <a name=\"373\">373</a>|Vendor Result Mapping Failure|  | | <a name=\"374\">374</a>|Vendor Library Unauthorised|  | | <a name=\"375\">375</a>|Vendor Connectivity Error|  | | <a name=\"376\">376</a>|Vendor Interface Error|  | | <a name=\"377\">377</a>|Vendor Pricing Failure|  | | <a name=\"378\">378</a>|Vendor Translation Failure|  | | <a name=\"379\">379</a>|Vendor Key Mapping Failure|  | | <a name=\"380\">380</a>|Vendor Reflection Failure|  | | <a name=\"381\">381</a>|Vendor Process Failure|  | | <a name=\"382\">382</a>|Vendor System Failure|  | | <a name=\"390\">390</a>|Attempt To Upsert Duplicate Quotes|  | | <a name=\"391\">391</a>|Corporate Action Source Does Not Exist|  | | <a name=\"392\">392</a>|Corporate Action Source Already Exists|  | | <a name=\"393\">393</a>|Instrument Identifier Already In Use|  | | <a name=\"394\">394</a>|Properties Not Found|  | | <a name=\"395\">395</a>|Batch Operation Aborted|  | | <a name=\"400\">400</a>|Invalid Iso4217 Currency Code|  | | <a name=\"401\">401</a>|Cannot Assign Instrument Identifier To Currency|  | | <a name=\"402\">402</a>|Cannot Assign Currency Identifier To Non Currency|  | | <a name=\"403\">403</a>|Currency Instrument Cannot Be Deleted|  | | <a name=\"404\">404</a>|Currency Instrument Cannot Have Economic Definition|  | | <a name=\"405\">405</a>|Currency Instrument Cannot Have Lookthrough Portfolio|  | | <a name=\"406\">406</a>|Cannot Create Currency Instrument With Multiple Identifiers|  | | <a name=\"407\">407</a>|Specified Currency Is Undefined|  | | <a name=\"410\">410</a>|Index Does Not Exist|  | | <a name=\"411\">411</a>|Sort Field Does Not Exist|  | | <a name=\"413\">413</a>|Negative Pagination Parameters|  | | <a name=\"414\">414</a>|Invalid Search Syntax|  | | <a name=\"415\">415</a>|Filter Execution Timeout|  | | <a name=\"420\">420</a>|Side Definition Inconsistent|  | | <a name=\"450\">450</a>|Invalid Quote Access Metadata Rule|  | | <a name=\"451\">451</a>|Access Metadata Not Found|  | | <a name=\"452\">452</a>|Invalid Access Metadata Identifier|  | | <a name=\"460\">460</a>|Standard Resource Not Found|  | | <a name=\"461\">461</a>|Standard Resource Conflict|  | | <a name=\"462\">462</a>|Calendar Not Found|  | | <a name=\"463\">463</a>|Date In A Calendar Not Found|  | | <a name=\"464\">464</a>|Invalid Date Source Data|  | | <a name=\"465\">465</a>|Invalid Timezone|  | | <a name=\"601\">601</a>|Person Identifier Already In Use|  | | <a name=\"602\">602</a>|Person Not Found|  | | <a name=\"603\">603</a>|Cannot Set Identifier|  | | <a name=\"617\">617</a>|Invalid Recipe Specification In Request|  | | <a name=\"618\">618</a>|Inline Recipe Deserialisation Failure|  | | <a name=\"619\">619</a>|Identifier Types Not Set For Entity|  | | <a name=\"620\">620</a>|Cannot Delete All Client Defined Identifiers|  | | <a name=\"650\">650</a>|The Order requested was not found.|  | | <a name=\"654\">654</a>|The Allocation requested was not found.|  | | <a name=\"655\">655</a>|Cannot build the fx forward target with the given holdings.|  | | <a name=\"656\">656</a>|Group does not contain expected entities.|  | | <a name=\"665\">665</a>|Destination directory not found|  | | <a name=\"667\">667</a>|Relation definition already exists|  | | <a name=\"672\">672</a>|Could not retrieve file contents|  | | <a name=\"673\">673</a>|Missing entitlements for entities in Group|  | | <a name=\"674\">674</a>|Next Best Action not found|  | | <a name=\"676\">676</a>|Relation definition not defined|  | | <a name=\"677\">677</a>|Invalid entity identifier for relation|  | | <a name=\"681\">681</a>|Sorting by specified field not supported|One or more of the provided fields to order by were either invalid or not supported. | | <a name=\"682\">682</a>|Too many fields to sort by|The number of fields to sort the data by exceeds the number allowed by the endpoint | | <a name=\"684\">684</a>|Sequence Not Found|  | | <a name=\"685\">685</a>|Sequence Already Exists|  | | <a name=\"686\">686</a>|Non-cycling sequence has been exhausted|  | | <a name=\"687\">687</a>|Legal Entity Identifier Already In Use|  | | <a name=\"688\">688</a>|Legal Entity Not Found|  | | <a name=\"689\">689</a>|The supplied pagination token is invalid|  | | <a name=\"690\">690</a>|Property Type Is Not Supported|  | | <a name=\"691\">691</a>|Multiple Tax-lots For Currency Type Is Not Supported|  | | <a name=\"692\">692</a>|This endpoint does not support impersonation|  | | <a name=\"693\">693</a>|Entity type is not supported for Relationship|  | | <a name=\"694\">694</a>|Relationship Validation Failure|  | | <a name=\"695\">695</a>|Relationship Not Found|  | | <a name=\"697\">697</a>|Derived Property Formula No Longer Valid|  | | <a name=\"698\">698</a>|Story is not available|  | | <a name=\"703\">703</a>|Corporate Action Does Not Exist|  | | <a name=\"720\">720</a>|The provided sort and filter combination is not valid|  | | <a name=\"721\">721</a>|A2B generation failed|  | | <a name=\"722\">722</a>|Aggregated Return Calculation Failure|  | | <a name=\"723\">723</a>|Custom Entity Definition Identifier Already In Use|  | | <a name=\"724\">724</a>|Custom Entity Definition Not Found|  | | <a name=\"725\">725</a>|The Placement requested was not found.|  | | <a name=\"726\">726</a>|The Execution requested was not found.|  | | <a name=\"727\">727</a>|The Block requested was not found.|  | | <a name=\"728\">728</a>|The Participation requested was not found.|  | | <a name=\"729\">729</a>|The Package requested was not found.|  | | <a name=\"730\">730</a>|The OrderInstruction requested was not found.|  | | <a name=\"732\">732</a>|Custom Entity not found.|  | | <a name=\"733\">733</a>|Custom Entity Identifier already in use.|  | | <a name=\"735\">735</a>|Calculation Failed.|  | | <a name=\"736\">736</a>|An expected key on HttpResponse is missing.|  | | <a name=\"737\">737</a>|A required fee detail is missing.|  | | <a name=\"738\">738</a>|Zero rows were returned from Luminesce|  | | <a name=\"739\">739</a>|Provided Weekend Mask was invalid|  | | <a name=\"742\">742</a>|Custom Entity fields do not match the definition|  | | <a name=\"746\">746</a>|The provided sequence is not valid.|  | | <a name=\"751\">751</a>|The type of the Custom Entity is different than the type provided in the definition.|  | | <a name=\"752\">752</a>|Luminesce process returned an error.|  | | <a name=\"753\">753</a>|File name or content incompatible with operation.|  | | <a name=\"755\">755</a>|Schema of response from Drive is not as expected.|  | | <a name=\"757\">757</a>|Schema of response from Luminesce is not as expected.|  | | <a name=\"758\">758</a>|Luminesce timed out.|  | | <a name=\"763\">763</a>|Invalid Lusid Entity Identifier Unit|  | | <a name=\"768\">768</a>|Fee rule not found.|  | | <a name=\"769\">769</a>|Cannot update the base currency of a portfolio with transactions loaded|  | | <a name=\"771\">771</a>|Transaction configuration source not found|  | | <a name=\"774\">774</a>|Compliance rule not found.|  | | <a name=\"775\">775</a>|Fund accounting document cannot be processed.|  | | <a name=\"778\">778</a>|Unable to look up FX rate from trade ccy to portfolio ccy for some of the trades.|  | | <a name=\"782\">782</a>|The Property definition dataType is not matching the derivation formula dataType|  | | <a name=\"783\">783</a>|The Property definition domain is not supported for derived properties|  | | <a name=\"788\">788</a>|Compliance run not found failure.|  | | <a name=\"790\">790</a>|Custom Entity has missing or invalid identifiers|  | | <a name=\"791\">791</a>|Custom Entity definition already exists|  | | <a name=\"792\">792</a>|Compliance PropertyKey is missing.|  | | <a name=\"793\">793</a>|Compliance Criteria Value for matching is missing.|  | | <a name=\"800\">800</a>|Can not upsert an instrument event of this type.|  | | <a name=\"801\">801</a>|The instrument event does not exist.|  | | <a name=\"802\">802</a>|The Instrument event is missing salient information.|  | | <a name=\"803\">803</a>|The Instrument event could not be processed.|  | | <a name=\"804\">804</a>|Some data requested does not follow the order graph assumptions.|  | 
 *
 * The version of the OpenAPI document: 0.11.4649
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.lusid.model.ModelSelection;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Options for controlling the default aspects and behaviour of the pricing engine.
 */
@ApiModel(description = "Options for controlling the default aspects and behaviour of the pricing engine.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingOptions {
  public static final String SERIALIZED_NAME_MODEL_SELECTION = "modelSelection";
  @SerializedName(SERIALIZED_NAME_MODEL_SELECTION)
  private ModelSelection modelSelection;

  public static final String SERIALIZED_NAME_USE_INSTRUMENT_TYPE_TO_DETERMINE_PRICER = "useInstrumentTypeToDeterminePricer";
  @SerializedName(SERIALIZED_NAME_USE_INSTRUMENT_TYPE_TO_DETERMINE_PRICER)
  private Boolean useInstrumentTypeToDeterminePricer;

  public static final String SERIALIZED_NAME_ALLOW_ANY_INSTRUMENTS_WITH_SEC_UID_TO_PRICE_OFF_LOOKUP = "allowAnyInstrumentsWithSecUidToPriceOffLookup";
  @SerializedName(SERIALIZED_NAME_ALLOW_ANY_INSTRUMENTS_WITH_SEC_UID_TO_PRICE_OFF_LOOKUP)
  private Boolean allowAnyInstrumentsWithSecUidToPriceOffLookup;

  public static final String SERIALIZED_NAME_ALLOW_PARTIALLY_SUCCESSFUL_EVALUATION = "allowPartiallySuccessfulEvaluation";
  @SerializedName(SERIALIZED_NAME_ALLOW_PARTIALLY_SUCCESSFUL_EVALUATION)
  private Boolean allowPartiallySuccessfulEvaluation;

  public static final String SERIALIZED_NAME_PRODUCE_SEPARATE_RESULT_FOR_LINEAR_OTC_LEGS = "produceSeparateResultForLinearOtcLegs";
  @SerializedName(SERIALIZED_NAME_PRODUCE_SEPARATE_RESULT_FOR_LINEAR_OTC_LEGS)
  private Boolean produceSeparateResultForLinearOtcLegs;

  public static final String SERIALIZED_NAME_ENABLE_USE_OF_CACHED_UNIT_RESULTS = "enableUseOfCachedUnitResults";
  @SerializedName(SERIALIZED_NAME_ENABLE_USE_OF_CACHED_UNIT_RESULTS)
  private Boolean enableUseOfCachedUnitResults;

  public static final String SERIALIZED_NAME_WINDOW_VALUATION_ON_INSTRUMENT_START_END = "windowValuationOnInstrumentStartEnd";
  @SerializedName(SERIALIZED_NAME_WINDOW_VALUATION_ON_INSTRUMENT_START_END)
  private Boolean windowValuationOnInstrumentStartEnd;

  public static final String SERIALIZED_NAME_REMOVE_CONTINGENT_CASHFLOWS_IN_PAYMENT_DIARY = "removeContingentCashflowsInPaymentDiary";
  @SerializedName(SERIALIZED_NAME_REMOVE_CONTINGENT_CASHFLOWS_IN_PAYMENT_DIARY)
  private Boolean removeContingentCashflowsInPaymentDiary;

  public static final String SERIALIZED_NAME_USE_CHILD_SUB_HOLDING_KEYS_FOR_PORTFOLIO_EXPANSION = "useChildSubHoldingKeysForPortfolioExpansion";
  @SerializedName(SERIALIZED_NAME_USE_CHILD_SUB_HOLDING_KEYS_FOR_PORTFOLIO_EXPANSION)
  private Boolean useChildSubHoldingKeysForPortfolioExpansion;

  public static final String SERIALIZED_NAME_VALIDATE_DOMESTIC_AND_QUOTE_CURRENCIES_ARE_CONSISTENT = "validateDomesticAndQuoteCurrenciesAreConsistent";
  @SerializedName(SERIALIZED_NAME_VALIDATE_DOMESTIC_AND_QUOTE_CURRENCIES_ARE_CONSISTENT)
  private Boolean validateDomesticAndQuoteCurrenciesAreConsistent;


  public PricingOptions modelSelection(ModelSelection modelSelection) {
    this.modelSelection = modelSelection; 
    return this;
  }

   /**
   * Get modelSelection
   * @return modelSelection
  **/
  @ApiModelProperty(value = "")
  public ModelSelection getModelSelection() {
    return modelSelection;
  }

  public void setModelSelection(ModelSelection modelSelection) {
    this.modelSelection = modelSelection;
  }


  public PricingOptions useInstrumentTypeToDeterminePricer(Boolean useInstrumentTypeToDeterminePricer) {
    this.useInstrumentTypeToDeterminePricer = useInstrumentTypeToDeterminePricer; 
    return this;
  }

   /**
   * If true then use the instrument type to set the default instrument pricer  This applies where no more specific set of overrides are provided on a per-vendor and instrument basis.
   * @return useInstrumentTypeToDeterminePricer
  **/
  @ApiModelProperty(value = "If true then use the instrument type to set the default instrument pricer  This applies where no more specific set of overrides are provided on a per-vendor and instrument basis.")
  public Boolean getUseInstrumentTypeToDeterminePricer() {
    return useInstrumentTypeToDeterminePricer;
  }

  public void setUseInstrumentTypeToDeterminePricer(Boolean useInstrumentTypeToDeterminePricer) {
    this.useInstrumentTypeToDeterminePricer = useInstrumentTypeToDeterminePricer;
  }


  public PricingOptions allowAnyInstrumentsWithSecUidToPriceOffLookup(Boolean allowAnyInstrumentsWithSecUidToPriceOffLookup) {
    this.allowAnyInstrumentsWithSecUidToPriceOffLookup = allowAnyInstrumentsWithSecUidToPriceOffLookup; 
    return this;
  }

   /**
   * By default, one would not expect to price and exotic instrument, i.e. an instrument with a complicated  instrument definition simply through looking up a price as there should be a better way of evaluating it.  To override that behaviour and allow lookup for a price from the instrument identifier(s), set this to true.
   * @return allowAnyInstrumentsWithSecUidToPriceOffLookup
  **/
  @ApiModelProperty(value = "By default, one would not expect to price and exotic instrument, i.e. an instrument with a complicated  instrument definition simply through looking up a price as there should be a better way of evaluating it.  To override that behaviour and allow lookup for a price from the instrument identifier(s), set this to true.")
  public Boolean getAllowAnyInstrumentsWithSecUidToPriceOffLookup() {
    return allowAnyInstrumentsWithSecUidToPriceOffLookup;
  }

  public void setAllowAnyInstrumentsWithSecUidToPriceOffLookup(Boolean allowAnyInstrumentsWithSecUidToPriceOffLookup) {
    this.allowAnyInstrumentsWithSecUidToPriceOffLookup = allowAnyInstrumentsWithSecUidToPriceOffLookup;
  }


  public PricingOptions allowPartiallySuccessfulEvaluation(Boolean allowPartiallySuccessfulEvaluation) {
    this.allowPartiallySuccessfulEvaluation = allowPartiallySuccessfulEvaluation; 
    return this;
  }

   /**
   * If true then a failure in task evaluation doesn&#39;t cause overall failure.  results will be returned where they succeeded and annotation elsewhere
   * @return allowPartiallySuccessfulEvaluation
  **/
  @ApiModelProperty(value = "If true then a failure in task evaluation doesn't cause overall failure.  results will be returned where they succeeded and annotation elsewhere")
  public Boolean getAllowPartiallySuccessfulEvaluation() {
    return allowPartiallySuccessfulEvaluation;
  }

  public void setAllowPartiallySuccessfulEvaluation(Boolean allowPartiallySuccessfulEvaluation) {
    this.allowPartiallySuccessfulEvaluation = allowPartiallySuccessfulEvaluation;
  }


  public PricingOptions produceSeparateResultForLinearOtcLegs(Boolean produceSeparateResultForLinearOtcLegs) {
    this.produceSeparateResultForLinearOtcLegs = produceSeparateResultForLinearOtcLegs; 
    return this;
  }

   /**
   * If true (default), when pricing an Fx-Forward or Interest Rate Swap, Future and other linearly separable products, product two results, one for each leg  rather than a single line result with the amalgamated/summed pv from both legs.
   * @return produceSeparateResultForLinearOtcLegs
  **/
  @ApiModelProperty(value = "If true (default), when pricing an Fx-Forward or Interest Rate Swap, Future and other linearly separable products, product two results, one for each leg  rather than a single line result with the amalgamated/summed pv from both legs.")
  public Boolean getProduceSeparateResultForLinearOtcLegs() {
    return produceSeparateResultForLinearOtcLegs;
  }

  public void setProduceSeparateResultForLinearOtcLegs(Boolean produceSeparateResultForLinearOtcLegs) {
    this.produceSeparateResultForLinearOtcLegs = produceSeparateResultForLinearOtcLegs;
  }


  public PricingOptions enableUseOfCachedUnitResults(Boolean enableUseOfCachedUnitResults) {
    this.enableUseOfCachedUnitResults = enableUseOfCachedUnitResults; 
    return this;
  }

   /**
   * If true, when pricing using a model or for an instrument that supports use of intermediate cached-results, use them.  Default is that this caching is turned off.
   * @return enableUseOfCachedUnitResults
  **/
  @ApiModelProperty(value = "If true, when pricing using a model or for an instrument that supports use of intermediate cached-results, use them.  Default is that this caching is turned off.")
  public Boolean getEnableUseOfCachedUnitResults() {
    return enableUseOfCachedUnitResults;
  }

  public void setEnableUseOfCachedUnitResults(Boolean enableUseOfCachedUnitResults) {
    this.enableUseOfCachedUnitResults = enableUseOfCachedUnitResults;
  }


  public PricingOptions windowValuationOnInstrumentStartEnd(Boolean windowValuationOnInstrumentStartEnd) {
    this.windowValuationOnInstrumentStartEnd = windowValuationOnInstrumentStartEnd; 
    return this;
  }

   /**
   * If true, when valuing an instrument outside the period where it is &#39;alive&#39; (the start-maturity window) it will return a valuation of zero
   * @return windowValuationOnInstrumentStartEnd
  **/
  @ApiModelProperty(value = "If true, when valuing an instrument outside the period where it is 'alive' (the start-maturity window) it will return a valuation of zero")
  public Boolean getWindowValuationOnInstrumentStartEnd() {
    return windowValuationOnInstrumentStartEnd;
  }

  public void setWindowValuationOnInstrumentStartEnd(Boolean windowValuationOnInstrumentStartEnd) {
    this.windowValuationOnInstrumentStartEnd = windowValuationOnInstrumentStartEnd;
  }


  public PricingOptions removeContingentCashflowsInPaymentDiary(Boolean removeContingentCashflowsInPaymentDiary) {
    this.removeContingentCashflowsInPaymentDiary = removeContingentCashflowsInPaymentDiary; 
    return this;
  }

   /**
   * When creating a payment diary, should contingent cash payments (e.g. from exercise of a swaption into a swap) be included or not.  i.e. Is exercise or default being assumed to happen or not.
   * @return removeContingentCashflowsInPaymentDiary
  **/
  @ApiModelProperty(value = "When creating a payment diary, should contingent cash payments (e.g. from exercise of a swaption into a swap) be included or not.  i.e. Is exercise or default being assumed to happen or not.")
  public Boolean getRemoveContingentCashflowsInPaymentDiary() {
    return removeContingentCashflowsInPaymentDiary;
  }

  public void setRemoveContingentCashflowsInPaymentDiary(Boolean removeContingentCashflowsInPaymentDiary) {
    this.removeContingentCashflowsInPaymentDiary = removeContingentCashflowsInPaymentDiary;
  }


  public PricingOptions useChildSubHoldingKeysForPortfolioExpansion(Boolean useChildSubHoldingKeysForPortfolioExpansion) {
    this.useChildSubHoldingKeysForPortfolioExpansion = useChildSubHoldingKeysForPortfolioExpansion; 
    return this;
  }

   /**
   * Should fund constituents inherit subholding keys from the parent subholding keyb
   * @return useChildSubHoldingKeysForPortfolioExpansion
  **/
  @ApiModelProperty(value = "Should fund constituents inherit subholding keys from the parent subholding keyb")
  public Boolean getUseChildSubHoldingKeysForPortfolioExpansion() {
    return useChildSubHoldingKeysForPortfolioExpansion;
  }

  public void setUseChildSubHoldingKeysForPortfolioExpansion(Boolean useChildSubHoldingKeysForPortfolioExpansion) {
    this.useChildSubHoldingKeysForPortfolioExpansion = useChildSubHoldingKeysForPortfolioExpansion;
  }


  public PricingOptions validateDomesticAndQuoteCurrenciesAreConsistent(Boolean validateDomesticAndQuoteCurrenciesAreConsistent) {
    this.validateDomesticAndQuoteCurrenciesAreConsistent = validateDomesticAndQuoteCurrenciesAreConsistent; 
    return this;
  }

   /**
   * Do we validate that the instrument domestic currency matches the quote currency (unless unknown/zzz) when using lookup pricing.
   * @return validateDomesticAndQuoteCurrenciesAreConsistent
  **/
  @ApiModelProperty(value = "Do we validate that the instrument domestic currency matches the quote currency (unless unknown/zzz) when using lookup pricing.")
  public Boolean getValidateDomesticAndQuoteCurrenciesAreConsistent() {
    return validateDomesticAndQuoteCurrenciesAreConsistent;
  }

  public void setValidateDomesticAndQuoteCurrenciesAreConsistent(Boolean validateDomesticAndQuoteCurrenciesAreConsistent) {
    this.validateDomesticAndQuoteCurrenciesAreConsistent = validateDomesticAndQuoteCurrenciesAreConsistent;
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
    sb.append("class PricingOptions {\n");
    sb.append("    modelSelection: ").append(toIndentedString(modelSelection)).append("\n");
    sb.append("    useInstrumentTypeToDeterminePricer: ").append(toIndentedString(useInstrumentTypeToDeterminePricer)).append("\n");
    sb.append("    allowAnyInstrumentsWithSecUidToPriceOffLookup: ").append(toIndentedString(allowAnyInstrumentsWithSecUidToPriceOffLookup)).append("\n");
    sb.append("    allowPartiallySuccessfulEvaluation: ").append(toIndentedString(allowPartiallySuccessfulEvaluation)).append("\n");
    sb.append("    produceSeparateResultForLinearOtcLegs: ").append(toIndentedString(produceSeparateResultForLinearOtcLegs)).append("\n");
    sb.append("    enableUseOfCachedUnitResults: ").append(toIndentedString(enableUseOfCachedUnitResults)).append("\n");
    sb.append("    windowValuationOnInstrumentStartEnd: ").append(toIndentedString(windowValuationOnInstrumentStartEnd)).append("\n");
    sb.append("    removeContingentCashflowsInPaymentDiary: ").append(toIndentedString(removeContingentCashflowsInPaymentDiary)).append("\n");
    sb.append("    useChildSubHoldingKeysForPortfolioExpansion: ").append(toIndentedString(useChildSubHoldingKeysForPortfolioExpansion)).append("\n");
    sb.append("    validateDomesticAndQuoteCurrenciesAreConsistent: ").append(toIndentedString(validateDomesticAndQuoteCurrenciesAreConsistent)).append("\n");
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
