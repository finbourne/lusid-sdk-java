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
 * Base class for representing market data options in LUSID.  Abstractly, these are any options that one should be able to specify for ComplexMarketData entities.  For example, CurveOptions allows one to decide how the data provided in a discountFactorCurve is interpolated.  This base class should not be directly instantiated;  each supported MarketDataOptionsType has a corresponding inherited class.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarketDataOptions {
  /**
   * The available values are: CurveOptions
   */
  @JsonAdapter(MarketDataOptionsTypeEnum.Adapter.class)
  public enum MarketDataOptionsTypeEnum {
    CURVEOPTIONS("CurveOptions");

    private String value;

    MarketDataOptionsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MarketDataOptionsTypeEnum fromValue(String value) {
      for (MarketDataOptionsTypeEnum b : MarketDataOptionsTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MarketDataOptionsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MarketDataOptionsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MarketDataOptionsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MarketDataOptionsTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MARKET_DATA_OPTIONS_TYPE = "marketDataOptionsType";
  @SerializedName(SERIALIZED_NAME_MARKET_DATA_OPTIONS_TYPE)
  protected MarketDataOptionsTypeEnum marketDataOptionsType;

  public MarketDataOptions() {
  }

  public MarketDataOptions marketDataOptionsType(MarketDataOptionsTypeEnum marketDataOptionsType) {
    
    this.marketDataOptionsType = marketDataOptionsType;
    return this;
  }

   /**
   * The available values are: CurveOptions
   * @return marketDataOptionsType
  **/
  @jakarta.annotation.Nonnull
  public MarketDataOptionsTypeEnum getMarketDataOptionsType() {
    return marketDataOptionsType;
  }


  public void setMarketDataOptionsType(MarketDataOptionsTypeEnum marketDataOptionsType) {
    this.marketDataOptionsType = marketDataOptionsType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketDataOptions marketDataOptions = (MarketDataOptions) o;
    return Objects.equals(this.marketDataOptionsType, marketDataOptions.marketDataOptionsType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketDataOptionsType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketDataOptions {\n");
    sb.append("    marketDataOptionsType: ").append(toIndentedString(marketDataOptionsType)).append("\n");
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
    openapiFields.add("marketDataOptionsType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketDataOptionsType");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to MarketDataOptions
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MarketDataOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MarketDataOptions is not found in the empty JSON string", MarketDataOptions.openapiRequiredFields.toString()));
        }
      }

      String discriminatorValue = jsonElement.getAsJsonObject().get("marketDataOptionsType").getAsString();
      switch (discriminatorValue) {
        case "CurveOptions":
          CurveOptions.validateJsonElement(jsonElement);
          break;
        default:
          throw new IllegalArgumentException(String.format("The value of the `marketDataOptionsType` field `%s` does not match any key defined in the discriminator's mapping.", discriminatorValue));
      }
  }


 /**
  * Create an instance of MarketDataOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MarketDataOptions
  * @throws IOException if the JSON string is invalid with respect to MarketDataOptions
  */
  public static MarketDataOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MarketDataOptions.class);
  }

 /**
  * Convert an instance of MarketDataOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
