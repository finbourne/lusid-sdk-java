/*
 * LUSID API
 *
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.finbourne.lusid.model;

import java.util.Objects;
import com.finbourne.lusid.model.HoldingPricingInfo;
import com.finbourne.lusid.model.ModelSelection;
import com.finbourne.lusid.model.PricingOptions;
import com.finbourne.lusid.model.ResultKeyRule;
import com.finbourne.lusid.model.VendorModelRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.lusid.JSON;

/**
 * Pricing context node. In order to price an instrument a number of configuration parameters are required to determine which  (a) pricing model (ranging from a simple lookup of a market quote/price through to a Monte-Carlo simulation for the behaviour of its cashflows)  (b) vendor library (Lusid internal models or those provided through an external Vendor such as Refinitiv (proprietary) or QuantLib (open source)  are used in the pricing.    In conjunction with these there are a number of parameters that govern the behaviour of these models. For example, in pricing an Fx volatility  dependent product such as an Fx option, there are various parameters that affect model behaviour for the smile. In Lusid a distinction is made between  those which are understood natively and those which are only held for use with a given vendor-model combination. The problem is that, unlike market  quote data, there are few standards around model descriptions. Hence, apparently similar terminology can be mis-leading; for example in SABR models where  the basic parameters are agreed upon but most practical models have used an approximation with adjustments where the parameters can have wildly different meanings.  To avoid confusion or mis-behaviour in this area, where parameters are not understood to be interchangeable, they are only settable on a per-library per-model  basis, essentially as opaque data that will be given to the Vendor library \&quot;verbatim\&quot; but not used with any other.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricingContext {
  public static final String SERIALIZED_NAME_MODEL_RULES = "modelRules";
  @SerializedName(SERIALIZED_NAME_MODEL_RULES)
  private List<VendorModelRule> modelRules;

  public static final String SERIALIZED_NAME_MODEL_CHOICE = "modelChoice";
  @SerializedName(SERIALIZED_NAME_MODEL_CHOICE)
  private Map<String, ModelSelection> modelChoice;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private PricingOptions options;

  public static final String SERIALIZED_NAME_RESULT_DATA_RULES = "resultDataRules";
  @SerializedName(SERIALIZED_NAME_RESULT_DATA_RULES)
  private List<ResultKeyRule> resultDataRules;

  public static final String SERIALIZED_NAME_HOLDING_PRICING_INFO = "holdingPricingInfo";
  @SerializedName(SERIALIZED_NAME_HOLDING_PRICING_INFO)
  private HoldingPricingInfo holdingPricingInfo;

  public static final String SERIALIZED_NAME_ACCRUAL_DEFINITION = "accrualDefinition";
  @SerializedName(SERIALIZED_NAME_ACCRUAL_DEFINITION)
  private String accrualDefinition;

  public PricingContext() {
  }

  public PricingContext modelRules(List<VendorModelRule> modelRules) {
    
    this.modelRules = modelRules;
    return this;
  }

  public PricingContext addModelRulesItem(VendorModelRule modelRulesItem) {
    if (this.modelRules == null) {
      this.modelRules = new ArrayList<>();
    }
    this.modelRules.add(modelRulesItem);
    return this;
  }

   /**
   * The set of model rules that are available. There may be multiple rules for Vendors, but only one per model-instrument pair.  Which of these preference sets is used depends upon the model choice selection if specified, or failing that the global default model specification  in the options.
   * @return modelRules
  **/
  @jakarta.annotation.Nullable
  public List<VendorModelRule> getModelRules() {
    return modelRules;
  }


  public void setModelRules(List<VendorModelRule> modelRules) {
    this.modelRules = modelRules;
  }


  public PricingContext modelChoice(Map<String, ModelSelection> modelChoice) {
    
    this.modelChoice = modelChoice;
    return this;
  }

  public PricingContext putModelChoiceItem(String key, ModelSelection modelChoiceItem) {
    if (this.modelChoice == null) {
      this.modelChoice = new HashMap<>();
    }
    this.modelChoice.put(key, modelChoiceItem);
    return this;
  }

   /**
   * The choice of which model selection (vendor library, pricing model) to use in evaluation of a given instrument type.
   * @return modelChoice
  **/
  @jakarta.annotation.Nullable
  public Map<String, ModelSelection> getModelChoice() {
    return modelChoice;
  }


  public void setModelChoice(Map<String, ModelSelection> modelChoice) {
    this.modelChoice = modelChoice;
  }


  public PricingContext options(PricingOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @jakarta.annotation.Nullable
  public PricingOptions getOptions() {
    return options;
  }


  public void setOptions(PricingOptions options) {
    this.options = options;
  }


  public PricingContext resultDataRules(List<ResultKeyRule> resultDataRules) {
    
    this.resultDataRules = resultDataRules;
    return this;
  }

  public PricingContext addResultDataRulesItem(ResultKeyRule resultDataRulesItem) {
    if (this.resultDataRules == null) {
      this.resultDataRules = new ArrayList<>();
    }
    this.resultDataRules.add(resultDataRulesItem);
    return this;
  }

   /**
   * Set of rules that control querying of unit results either for direct queries into aggregation or for  overriding intermediate calculations. For example, a dirty price is made up from a clean price and the accrued interest.  One might consider overriding the accrued interest calculated by a model (perhaps one wants to match an external value or simply disagrees with the  calculated result) and use that in calculation of the dirty price.
   * @return resultDataRules
  **/
  @jakarta.annotation.Nullable
  public List<ResultKeyRule> getResultDataRules() {
    return resultDataRules;
  }


  public void setResultDataRules(List<ResultKeyRule> resultDataRules) {
    this.resultDataRules = resultDataRules;
  }


  public PricingContext holdingPricingInfo(HoldingPricingInfo holdingPricingInfo) {
    
    this.holdingPricingInfo = holdingPricingInfo;
    return this;
  }

   /**
   * Get holdingPricingInfo
   * @return holdingPricingInfo
  **/
  @jakarta.annotation.Nullable
  public HoldingPricingInfo getHoldingPricingInfo() {
    return holdingPricingInfo;
  }


  public void setHoldingPricingInfo(HoldingPricingInfo holdingPricingInfo) {
    this.holdingPricingInfo = holdingPricingInfo;
  }


  public PricingContext accrualDefinition(String accrualDefinition) {
    
    this.accrualDefinition = accrualDefinition;
    return this;
  }

   /**
   * Determines which method to use for the calculation of accrued interest. Defaults to SOD.
   * @return accrualDefinition
  **/
  @jakarta.annotation.Nullable
  public String getAccrualDefinition() {
    return accrualDefinition;
  }


  public void setAccrualDefinition(String accrualDefinition) {
    this.accrualDefinition = accrualDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricingContext pricingContext = (PricingContext) o;
    return Objects.equals(this.modelRules, pricingContext.modelRules) &&
        Objects.equals(this.modelChoice, pricingContext.modelChoice) &&
        Objects.equals(this.options, pricingContext.options) &&
        Objects.equals(this.resultDataRules, pricingContext.resultDataRules) &&
        Objects.equals(this.holdingPricingInfo, pricingContext.holdingPricingInfo) &&
        Objects.equals(this.accrualDefinition, pricingContext.accrualDefinition);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelRules, modelChoice, options, resultDataRules, holdingPricingInfo, accrualDefinition);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingContext {\n");
    sb.append("    modelRules: ").append(toIndentedString(modelRules)).append("\n");
    sb.append("    modelChoice: ").append(toIndentedString(modelChoice)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    resultDataRules: ").append(toIndentedString(resultDataRules)).append("\n");
    sb.append("    holdingPricingInfo: ").append(toIndentedString(holdingPricingInfo)).append("\n");
    sb.append("    accrualDefinition: ").append(toIndentedString(accrualDefinition)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("modelRules");
    openapiFields.add("modelChoice");
    openapiFields.add("options");
    openapiFields.add("resultDataRules");
    openapiFields.add("holdingPricingInfo");
    openapiFields.add("accrualDefinition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PricingContext
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PricingContext.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PricingContext is not found in the empty JSON string", PricingContext.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("modelRules") != null && !jsonObj.get("modelRules").isJsonNull()) {
        JsonArray jsonArraymodelRules = jsonObj.getAsJsonArray("modelRules");
        if (jsonArraymodelRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("modelRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `modelRules` to be an array in the JSON string but got `%s`", jsonObj.get("modelRules").toString()));
          }

          // validate the optional field `modelRules` (array)
          for (int i = 0; i < jsonArraymodelRules.size(); i++) {
            VendorModelRule.validateJsonElement(jsonArraymodelRules.get(i));
          };
        }
      }
      // validate the optional field `options`
      if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
        PricingOptions.validateJsonElement(jsonObj.get("options"));
      }
      if (jsonObj.get("resultDataRules") != null && !jsonObj.get("resultDataRules").isJsonNull()) {
        JsonArray jsonArrayresultDataRules = jsonObj.getAsJsonArray("resultDataRules");
        if (jsonArrayresultDataRules != null) {
          // ensure the json data is an array
          if (!jsonObj.get("resultDataRules").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `resultDataRules` to be an array in the JSON string but got `%s`", jsonObj.get("resultDataRules").toString()));
          }

          // validate the optional field `resultDataRules` (array)
          for (int i = 0; i < jsonArrayresultDataRules.size(); i++) {
            ResultKeyRule.validateJsonElement(jsonArrayresultDataRules.get(i));
          };
        }
      }
      // validate the optional field `holdingPricingInfo`
      if (jsonObj.get("holdingPricingInfo") != null && !jsonObj.get("holdingPricingInfo").isJsonNull()) {
        HoldingPricingInfo.validateJsonElement(jsonObj.get("holdingPricingInfo"));
      }
      if ((jsonObj.get("accrualDefinition") != null && !jsonObj.get("accrualDefinition").isJsonNull()) && !jsonObj.get("accrualDefinition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accrualDefinition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accrualDefinition").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PricingContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PricingContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PricingContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PricingContext.class));

       return (TypeAdapter<T>) new TypeAdapter<PricingContext>() {
           @Override
           public void write(JsonWriter out, PricingContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PricingContext read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PricingContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PricingContext
  * @throws IOException if the JSON string is invalid with respect to PricingContext
  */
  public static PricingContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PricingContext.class);
  }

 /**
  * Convert an instance of PricingContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
