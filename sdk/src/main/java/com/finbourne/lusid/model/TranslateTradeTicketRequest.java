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
import com.finbourne.lusid.model.TradeTicket;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
 * A collection of instruments to translate, along with the target dialect to translate into.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TranslateTradeTicketRequest {
  public static final String SERIALIZED_NAME_TICKETS = "tickets";
  @SerializedName(SERIALIZED_NAME_TICKETS)
  private Map<String, TradeTicket> tickets = new HashMap<>();

  public static final String SERIALIZED_NAME_DIALECT = "dialect";
  @SerializedName(SERIALIZED_NAME_DIALECT)
  private String dialect;

  public TranslateTradeTicketRequest() {
  }

  public TranslateTradeTicketRequest tickets(Map<String, TradeTicket> tickets) {
    
    this.tickets = tickets;
    return this;
  }

  public TranslateTradeTicketRequest putTicketsItem(String key, TradeTicket ticketsItem) {
    if (this.tickets == null) {
      this.tickets = new HashMap<>();
    }
    this.tickets.put(key, ticketsItem);
    return this;
  }

   /**
   * The collection of trade tickets to translate.     Each trade ticket should be keyed by a unique correlation id. This id is ephemeral  and is not stored by LUSID. It serves only as a way to easily identify each instrument in the response.
   * @return tickets
  **/
  @jakarta.annotation.Nonnull
  public Map<String, TradeTicket> getTickets() {
    return tickets;
  }


  public void setTickets(Map<String, TradeTicket> tickets) {
    this.tickets = tickets;
  }


  public TranslateTradeTicketRequest dialect(String dialect) {
    
    this.dialect = dialect;
    return this;
  }

   /**
   * The target dialect that the given instruments should be translated to.
   * @return dialect
  **/
  @jakarta.annotation.Nonnull
  public String getDialect() {
    return dialect;
  }


  public void setDialect(String dialect) {
    this.dialect = dialect;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranslateTradeTicketRequest translateTradeTicketRequest = (TranslateTradeTicketRequest) o;
    return Objects.equals(this.tickets, translateTradeTicketRequest.tickets) &&
        Objects.equals(this.dialect, translateTradeTicketRequest.dialect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tickets, dialect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranslateTradeTicketRequest {\n");
    sb.append("    tickets: ").append(toIndentedString(tickets)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
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
    openapiFields.add("tickets");
    openapiFields.add("dialect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tickets");
    openapiRequiredFields.add("dialect");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to TranslateTradeTicketRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TranslateTradeTicketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TranslateTradeTicketRequest is not found in the empty JSON string", TranslateTradeTicketRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TranslateTradeTicketRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dialect").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dialect` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dialect").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TranslateTradeTicketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TranslateTradeTicketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TranslateTradeTicketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TranslateTradeTicketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TranslateTradeTicketRequest>() {
           @Override
           public void write(JsonWriter out, TranslateTradeTicketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TranslateTradeTicketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TranslateTradeTicketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TranslateTradeTicketRequest
  * @throws IOException if the JSON string is invalid with respect to TranslateTradeTicketRequest
  */
  public static TranslateTradeTicketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TranslateTradeTicketRequest.class);
  }

 /**
  * Convert an instance of TranslateTradeTicketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
