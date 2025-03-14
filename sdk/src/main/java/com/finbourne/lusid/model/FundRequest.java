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
import com.finbourne.lusid.model.DayMonth;
import com.finbourne.lusid.model.InstrumentResolutionDetail;
import com.finbourne.lusid.model.Property;
import com.finbourne.lusid.model.ResourceId;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * The request used to create a Fund.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundRequest {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FUND_CONFIGURATION_ID = "fundConfigurationId";
  @SerializedName(SERIALIZED_NAME_FUND_CONFIGURATION_ID)
  private ResourceId fundConfigurationId;

  public static final String SERIALIZED_NAME_ABOR_ID = "aborId";
  @SerializedName(SERIALIZED_NAME_ABOR_ID)
  private ResourceId aborId;

  public static final String SERIALIZED_NAME_SHARE_CLASS_INSTRUMENT_SCOPES = "shareClassInstrumentScopes";
  @SerializedName(SERIALIZED_NAME_SHARE_CLASS_INSTRUMENT_SCOPES)
  private List<String> shareClassInstrumentScopes;

  public static final String SERIALIZED_NAME_SHARE_CLASS_INSTRUMENTS = "shareClassInstruments";
  @SerializedName(SERIALIZED_NAME_SHARE_CLASS_INSTRUMENTS)
  private List<InstrumentResolutionDetail> shareClassInstruments;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_INCEPTION_DATE = "inceptionDate";
  @SerializedName(SERIALIZED_NAME_INCEPTION_DATE)
  private OffsetDateTime inceptionDate;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimalPlaces";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_YEAR_END_DATE = "yearEndDate";
  @SerializedName(SERIALIZED_NAME_YEAR_END_DATE)
  private DayMonth yearEndDate;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Property> properties;

  public FundRequest() {
  }

  public FundRequest code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * The code given for the Fund.
   * @return code
  **/
  @jakarta.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public FundRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The name of the Fund.
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public FundRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the Fund.
   * @return description
  **/
  @jakarta.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FundRequest fundConfigurationId(ResourceId fundConfigurationId) {
    
    this.fundConfigurationId = fundConfigurationId;
    return this;
  }

   /**
   * Get fundConfigurationId
   * @return fundConfigurationId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getFundConfigurationId() {
    return fundConfigurationId;
  }


  public void setFundConfigurationId(ResourceId fundConfigurationId) {
    this.fundConfigurationId = fundConfigurationId;
  }


  public FundRequest aborId(ResourceId aborId) {
    
    this.aborId = aborId;
    return this;
  }

   /**
   * Get aborId
   * @return aborId
  **/
  @jakarta.annotation.Nonnull
  public ResourceId getAborId() {
    return aborId;
  }


  public void setAborId(ResourceId aborId) {
    this.aborId = aborId;
  }


  public FundRequest shareClassInstrumentScopes(List<String> shareClassInstrumentScopes) {
    
    this.shareClassInstrumentScopes = shareClassInstrumentScopes;
    return this;
  }

  public FundRequest addShareClassInstrumentScopesItem(String shareClassInstrumentScopesItem) {
    if (this.shareClassInstrumentScopes == null) {
      this.shareClassInstrumentScopes = new ArrayList<>();
    }
    this.shareClassInstrumentScopes.add(shareClassInstrumentScopesItem);
    return this;
  }

   /**
   * The scopes in which the instruments lie, currently limited to one.
   * @return shareClassInstrumentScopes
  **/
  @jakarta.annotation.Nullable
  public List<String> getShareClassInstrumentScopes() {
    return shareClassInstrumentScopes;
  }


  public void setShareClassInstrumentScopes(List<String> shareClassInstrumentScopes) {
    this.shareClassInstrumentScopes = shareClassInstrumentScopes;
  }


  public FundRequest shareClassInstruments(List<InstrumentResolutionDetail> shareClassInstruments) {
    
    this.shareClassInstruments = shareClassInstruments;
    return this;
  }

  public FundRequest addShareClassInstrumentsItem(InstrumentResolutionDetail shareClassInstrumentsItem) {
    if (this.shareClassInstruments == null) {
      this.shareClassInstruments = new ArrayList<>();
    }
    this.shareClassInstruments.add(shareClassInstrumentsItem);
    return this;
  }

   /**
   * Details the user-provided instrument identifiers and the instrument resolved from them.
   * @return shareClassInstruments
  **/
  @jakarta.annotation.Nullable
  public List<InstrumentResolutionDetail> getShareClassInstruments() {
    return shareClassInstruments;
  }


  public void setShareClassInstruments(List<InstrumentResolutionDetail> shareClassInstruments) {
    this.shareClassInstruments = shareClassInstruments;
  }


  public FundRequest type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39;
   * @return type
  **/
  @jakarta.annotation.Nonnull
  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public FundRequest inceptionDate(OffsetDateTime inceptionDate) {
    
    this.inceptionDate = inceptionDate;
    return this;
  }

   /**
   * Inception date of the Fund
   * @return inceptionDate
  **/
  @jakarta.annotation.Nonnull
  public OffsetDateTime getInceptionDate() {
    return inceptionDate;
  }


  public void setInceptionDate(OffsetDateTime inceptionDate) {
    this.inceptionDate = inceptionDate;
  }


  public FundRequest decimalPlaces(Integer decimalPlaces) {
    
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * Number of decimal places for reporting
   * minimum: 0
   * maximum: 30
   * @return decimalPlaces
  **/
  @jakarta.annotation.Nullable
  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }


  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }


  public FundRequest yearEndDate(DayMonth yearEndDate) {
    
    this.yearEndDate = yearEndDate;
    return this;
  }

   /**
   * Get yearEndDate
   * @return yearEndDate
  **/
  @jakarta.annotation.Nonnull
  public DayMonth getYearEndDate() {
    return yearEndDate;
  }


  public void setYearEndDate(DayMonth yearEndDate) {
    this.yearEndDate = yearEndDate;
  }


  public FundRequest properties(Map<String, Property> properties) {
    
    this.properties = properties;
    return this;
  }

  public FundRequest putPropertiesItem(String key, Property propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A set of properties for the Fund.
   * @return properties
  **/
  @jakarta.annotation.Nullable
  public Map<String, Property> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Property> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundRequest fundRequest = (FundRequest) o;
    return Objects.equals(this.code, fundRequest.code) &&
        Objects.equals(this.displayName, fundRequest.displayName) &&
        Objects.equals(this.description, fundRequest.description) &&
        Objects.equals(this.fundConfigurationId, fundRequest.fundConfigurationId) &&
        Objects.equals(this.aborId, fundRequest.aborId) &&
        Objects.equals(this.shareClassInstrumentScopes, fundRequest.shareClassInstrumentScopes) &&
        Objects.equals(this.shareClassInstruments, fundRequest.shareClassInstruments) &&
        Objects.equals(this.type, fundRequest.type) &&
        Objects.equals(this.inceptionDate, fundRequest.inceptionDate) &&
        Objects.equals(this.decimalPlaces, fundRequest.decimalPlaces) &&
        Objects.equals(this.yearEndDate, fundRequest.yearEndDate) &&
        Objects.equals(this.properties, fundRequest.properties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, displayName, description, fundConfigurationId, aborId, shareClassInstrumentScopes, shareClassInstruments, type, inceptionDate, decimalPlaces, yearEndDate, properties);
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
    sb.append("class FundRequest {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fundConfigurationId: ").append(toIndentedString(fundConfigurationId)).append("\n");
    sb.append("    aborId: ").append(toIndentedString(aborId)).append("\n");
    sb.append("    shareClassInstrumentScopes: ").append(toIndentedString(shareClassInstrumentScopes)).append("\n");
    sb.append("    shareClassInstruments: ").append(toIndentedString(shareClassInstruments)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inceptionDate: ").append(toIndentedString(inceptionDate)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    yearEndDate: ").append(toIndentedString(yearEndDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("displayName");
    openapiFields.add("description");
    openapiFields.add("fundConfigurationId");
    openapiFields.add("aborId");
    openapiFields.add("shareClassInstrumentScopes");
    openapiFields.add("shareClassInstruments");
    openapiFields.add("type");
    openapiFields.add("inceptionDate");
    openapiFields.add("decimalPlaces");
    openapiFields.add("yearEndDate");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("fundConfigurationId");
    openapiRequiredFields.add("aborId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("inceptionDate");
    openapiRequiredFields.add("yearEndDate");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to FundRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!FundRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FundRequest is not found in the empty JSON string", FundRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FundRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `fundConfigurationId`
      ResourceId.validateJsonElement(jsonObj.get("fundConfigurationId"));
      // validate the required field `aborId`
      ResourceId.validateJsonElement(jsonObj.get("aborId"));
      // ensure the optional json data is an array if present
      if (jsonObj.get("shareClassInstrumentScopes") != null && !jsonObj.get("shareClassInstrumentScopes").isJsonNull() && !jsonObj.get("shareClassInstrumentScopes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shareClassInstrumentScopes` to be an array in the JSON string but got `%s`", jsonObj.get("shareClassInstrumentScopes").toString()));
      }
      if (jsonObj.get("shareClassInstruments") != null && !jsonObj.get("shareClassInstruments").isJsonNull()) {
        JsonArray jsonArrayshareClassInstruments = jsonObj.getAsJsonArray("shareClassInstruments");
        if (jsonArrayshareClassInstruments != null) {
          // ensure the json data is an array
          if (!jsonObj.get("shareClassInstruments").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `shareClassInstruments` to be an array in the JSON string but got `%s`", jsonObj.get("shareClassInstruments").toString()));
          }

          // validate the optional field `shareClassInstruments` (array)
          for (int i = 0; i < jsonArrayshareClassInstruments.size(); i++) {
            InstrumentResolutionDetail.validateJsonElement(jsonArrayshareClassInstruments.get(i));
          };
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `yearEndDate`
      DayMonth.validateJsonElement(jsonObj.get("yearEndDate"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FundRequest>() {
           @Override
           public void write(JsonWriter out, FundRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FundRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FundRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundRequest
  * @throws IOException if the JSON string is invalid with respect to FundRequest
  */
  public static FundRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundRequest.class);
  }

 /**
  * Convert an instance of FundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
