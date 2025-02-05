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
import com.finbourne.lusid.model.AggregateSpec;
import com.finbourne.lusid.model.ReconciliationRule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * Comparison of string values
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReconcileStringRule extends ReconciliationRule {
  /**
   * The available values are: Exact, Contains, CaseInsensitive, ContainsAnyCase, IsOneOf, IsOneOfCaseInsensitive
   */
  @JsonAdapter(ComparisonTypeEnum.Adapter.class)
  public enum ComparisonTypeEnum {
    EXACT("Exact"),
    
    CONTAINS("Contains"),
    
    CASEINSENSITIVE("CaseInsensitive"),
    
    CONTAINSANYCASE("ContainsAnyCase"),
    
    ISONEOF("IsOneOf"),
    
    ISONEOFCASEINSENSITIVE("IsOneOfCaseInsensitive");

    private String value;

    ComparisonTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComparisonTypeEnum fromValue(String value) {
      for (ComparisonTypeEnum b : ComparisonTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ComparisonTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComparisonTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComparisonTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ComparisonTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPARISON_TYPE = "comparisonType";
  @SerializedName(SERIALIZED_NAME_COMPARISON_TYPE)
  private ComparisonTypeEnum comparisonType;

  public static final String SERIALIZED_NAME_ONE_OF_CANDIDATES = "oneOfCandidates";
  @SerializedName(SERIALIZED_NAME_ONE_OF_CANDIDATES)
  private Map<String, List<String>> oneOfCandidates;

  public static final String SERIALIZED_NAME_APPLIES_TO = "appliesTo";
  @SerializedName(SERIALIZED_NAME_APPLIES_TO)
  private AggregateSpec appliesTo;

  public ReconcileStringRule() {
    // this.ruleType = this.getClass().getSimpleName();
  }

  public ReconcileStringRule comparisonType(ComparisonTypeEnum comparisonType) {
    
    this.comparisonType = comparisonType;
    return this;
  }

   /**
   * The available values are: Exact, Contains, CaseInsensitive, ContainsAnyCase, IsOneOf, IsOneOfCaseInsensitive
   * @return comparisonType
  **/
  @jakarta.annotation.Nonnull
  public ComparisonTypeEnum getComparisonType() {
    return comparisonType;
  }


  public void setComparisonType(ComparisonTypeEnum comparisonType) {
    this.comparisonType = comparisonType;
  }


  public ReconcileStringRule oneOfCandidates(Map<String, List<String>> oneOfCandidates) {
    
    this.oneOfCandidates = oneOfCandidates;
    return this;
  }

  public ReconcileStringRule putOneOfCandidatesItem(String key, List<String> oneOfCandidatesItem) {
    if (this.oneOfCandidates == null) {
      this.oneOfCandidates = new HashMap<>();
    }
    this.oneOfCandidates.put(key, oneOfCandidatesItem);
    return this;
  }

   /**
   * For cases of \&quot;IsOneOf\&quot; or \&quot;IsOneOfCaseInsensitive\&quot;, a mapping from the left hand to side to lists of  equivalent alternative values on the right hand side.  Fuzzy matching of strings against one of a set. There can be cases where systems \&quot;A\&quot; and \&quot;B\&quot; might use different terms for the same logical entity. A common case would be  comparison of something like a day count fraction where some convention like the \&quot;actual 365\&quot; convention might be represented as one of [\&quot;A365\&quot;, \&quot;Act365\&quot;, \&quot;Actual365\&quot;] or similar.  This is to allow this kind of fuzzy matching of values. Note that as this is exhaustive comparison across sets it will be slow and should therefore be used sparingly.
   * @return oneOfCandidates
  **/
  @jakarta.annotation.Nullable
  public Map<String, List<String>> getOneOfCandidates() {
    return oneOfCandidates;
  }


  public void setOneOfCandidates(Map<String, List<String>> oneOfCandidates) {
    this.oneOfCandidates = oneOfCandidates;
  }


  public ReconcileStringRule appliesTo(AggregateSpec appliesTo) {
    
    this.appliesTo = appliesTo;
    return this;
  }

   /**
   * Get appliesTo
   * @return appliesTo
  **/
  @jakarta.annotation.Nonnull
  public AggregateSpec getAppliesTo() {
    return appliesTo;
  }


  public void setAppliesTo(AggregateSpec appliesTo) {
    this.appliesTo = appliesTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReconcileStringRule reconcileStringRule = (ReconcileStringRule) o;
    return Objects.equals(this.comparisonType, reconcileStringRule.comparisonType) &&
        Objects.equals(this.oneOfCandidates, reconcileStringRule.oneOfCandidates) &&
        Objects.equals(this.appliesTo, reconcileStringRule.appliesTo) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(comparisonType, oneOfCandidates, appliesTo, super.hashCode());
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
    sb.append("class ReconcileStringRule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    comparisonType: ").append(toIndentedString(comparisonType)).append("\n");
    sb.append("    oneOfCandidates: ").append(toIndentedString(oneOfCandidates)).append("\n");
    sb.append("    appliesTo: ").append(toIndentedString(appliesTo)).append("\n");
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
    openapiFields.add("ruleType");
    openapiFields.add("comparisonType");
    openapiFields.add("oneOfCandidates");
    openapiFields.add("appliesTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("comparisonType");
    openapiRequiredFields.add("appliesTo");
    openapiRequiredFields.add("ruleType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ReconcileStringRule
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReconcileStringRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReconcileStringRule is not found in the empty JSON string", ReconcileStringRule.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReconcileStringRule.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReconcileStringRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReconcileStringRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReconcileStringRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReconcileStringRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ReconcileStringRule>() {
           @Override
           public void write(JsonWriter out, ReconcileStringRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReconcileStringRule read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReconcileStringRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReconcileStringRule
  * @throws IOException if the JSON string is invalid with respect to ReconcileStringRule
  */
  public static ReconcileStringRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReconcileStringRule.class);
  }

 /**
  * Convert an instance of ReconcileStringRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
