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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * Base class for types containing required data to append to complex market data.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AppendMarketData {
  /**
   * The available values are: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData
   */
  @JsonAdapter(MarketDataTypeEnum.Adapter.class)
  public enum MarketDataTypeEnum {
    APPENDFXFORWARDCURVEBYQUOTEREFERENCE("AppendFxForwardCurveByQuoteReference"),
    
    APPENDFXFORWARDCURVEDATA("AppendFxForwardCurveData"),
    
    APPENDFXFORWARDPIPSCURVEDATA("AppendFxForwardPipsCurveData"),
    
    APPENDFXFORWARDTENORCURVEDATA("AppendFxForwardTenorCurveData"),
    
    APPENDFXFORWARDTENORPIPSCURVEDATA("AppendFxForwardTenorPipsCurveData");

    private String value;

    MarketDataTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketDataTypeEnum fromValue(String value) {
      for (MarketDataTypeEnum b : MarketDataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MarketDataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketDataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketDataTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MarketDataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MARKET_DATA_TYPE = "marketDataType";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA_TYPE)
  protected MarketDataTypeEnum marketDataType;

  public AppendMarketData() {
  }

  public AppendMarketData marketDataType(MarketDataTypeEnum marketDataType) {
    
    this.marketDataType = marketDataType;
    return this;
  }

   /**
   * The available values are: AppendFxForwardCurveByQuoteReference, AppendFxForwardCurveData, AppendFxForwardPipsCurveData, AppendFxForwardTenorCurveData, AppendFxForwardTenorPipsCurveData
   * @return marketDataType
  **/
  @jakarta.annotation.Nonnull
  public MarketDataTypeEnum getMarketDataType() {
    return marketDataType;
  }


  public void setMarketDataType(MarketDataTypeEnum marketDataType) {
    this.marketDataType = marketDataType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppendMarketData appendMarketData = (AppendMarketData) o;
    return Objects.equals(this.marketDataType, appendMarketData.marketDataType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketDataType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppendMarketData {\n");
    sb.append("    marketDataType: ").append(toIndentedString(marketDataType)).append("\n");
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
    openapiFields.add("marketDataType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketDataType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AppendMarketData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AppendMarketData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppendMarketData is not found in the empty JSON string", AppendMarketData.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("marketDataType").getAsString();
      switch (discriminatorValue) {
        case "AppendFxForwardCurveByQuoteReference":
          AppendFxForwardCurveByQuoteReference.validateJsonElement(jsonElement);
          break;
        case "AppendFxForwardCurveData":
          AppendFxForwardCurveData.validateJsonElement(jsonElement);
          break;
        case "AppendFxForwardPipsCurveData":
          AppendFxForwardPipsCurveData.validateJsonElement(jsonElement);
          break;
        case "AppendFxForwardTenorCurveData":
          AppendFxForwardTenorCurveData.validateJsonElement(jsonElement);
          break;
        case "AppendFxForwardTenorPipsCurveData":
          AppendFxForwardTenorPipsCurveData.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `marketDataType` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of AppendMarketData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppendMarketData
  * @throws IOException if the JSON string is invalid with respect to AppendMarketData
  */
  public static AppendMarketData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppendMarketData.class);
  }

 /**
  * Convert an instance of AppendMarketData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
