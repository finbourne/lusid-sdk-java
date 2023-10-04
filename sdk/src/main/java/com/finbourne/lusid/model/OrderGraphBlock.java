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
import com.finbourne.lusid.model.Block;
import com.finbourne.lusid.model.OrderGraphBlockAllocationSynopsis;
import com.finbourne.lusid.model.OrderGraphBlockExecutionSynopsis;
import com.finbourne.lusid.model.OrderGraphBlockOrderSynopsis;
import com.finbourne.lusid.model.OrderGraphBlockPlacementSynopsis;
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
 * OrderGraphBlock
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderGraphBlock {
  public static final String SERIALIZED_NAME_BLOCK = "block";
  @SerializedName(SERIALIZED_NAME_BLOCK)
  private Block block;

  public static final String SERIALIZED_NAME_ORDERED = "ordered";
  @SerializedName(SERIALIZED_NAME_ORDERED)
  private OrderGraphBlockOrderSynopsis ordered;

  public static final String SERIALIZED_NAME_PLACED = "placed";
  @SerializedName(SERIALIZED_NAME_PLACED)
  private OrderGraphBlockPlacementSynopsis placed;

  public static final String SERIALIZED_NAME_EXECUTED = "executed";
  @SerializedName(SERIALIZED_NAME_EXECUTED)
  private OrderGraphBlockExecutionSynopsis executed;

  public static final String SERIALIZED_NAME_ALLOCATED = "allocated";
  @SerializedName(SERIALIZED_NAME_ALLOCATED)
  private OrderGraphBlockAllocationSynopsis allocated;

  public static final String SERIALIZED_NAME_DERIVED_STATE = "derivedState";
  @SerializedName(SERIALIZED_NAME_DERIVED_STATE)
  private String derivedState;

  public static final String SERIALIZED_NAME_DERIVED_COMPLIANCE_STATE = "derivedComplianceState";
  @SerializedName(SERIALIZED_NAME_DERIVED_COMPLIANCE_STATE)
  private String derivedComplianceState;

  public OrderGraphBlock() {
  }

  public OrderGraphBlock block(Block block) {
    
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @jakarta.annotation.Nonnull
  public Block getBlock() {
    return block;
  }


  public void setBlock(Block block) {
    this.block = block;
  }


  public OrderGraphBlock ordered(OrderGraphBlockOrderSynopsis ordered) {
    
    this.ordered = ordered;
    return this;
  }

   /**
   * Get ordered
   * @return ordered
  **/
  @jakarta.annotation.Nonnull
  public OrderGraphBlockOrderSynopsis getOrdered() {
    return ordered;
  }


  public void setOrdered(OrderGraphBlockOrderSynopsis ordered) {
    this.ordered = ordered;
  }


  public OrderGraphBlock placed(OrderGraphBlockPlacementSynopsis placed) {
    
    this.placed = placed;
    return this;
  }

   /**
   * Get placed
   * @return placed
  **/
  @jakarta.annotation.Nonnull
  public OrderGraphBlockPlacementSynopsis getPlaced() {
    return placed;
  }


  public void setPlaced(OrderGraphBlockPlacementSynopsis placed) {
    this.placed = placed;
  }


  public OrderGraphBlock executed(OrderGraphBlockExecutionSynopsis executed) {
    
    this.executed = executed;
    return this;
  }

   /**
   * Get executed
   * @return executed
  **/
  @jakarta.annotation.Nonnull
  public OrderGraphBlockExecutionSynopsis getExecuted() {
    return executed;
  }


  public void setExecuted(OrderGraphBlockExecutionSynopsis executed) {
    this.executed = executed;
  }


  public OrderGraphBlock allocated(OrderGraphBlockAllocationSynopsis allocated) {
    
    this.allocated = allocated;
    return this;
  }

   /**
   * Get allocated
   * @return allocated
  **/
  @jakarta.annotation.Nonnull
  public OrderGraphBlockAllocationSynopsis getAllocated() {
    return allocated;
  }


  public void setAllocated(OrderGraphBlockAllocationSynopsis allocated) {
    this.allocated = allocated;
  }


  public OrderGraphBlock derivedState(String derivedState) {
    
    this.derivedState = derivedState;
    return this;
  }

   /**
   * A simple description of the overall state of a block.
   * @return derivedState
  **/
  @jakarta.annotation.Nonnull
  public String getDerivedState() {
    return derivedState;
  }


  public void setDerivedState(String derivedState) {
    this.derivedState = derivedState;
  }


  public OrderGraphBlock derivedComplianceState(String derivedComplianceState) {
    
    this.derivedComplianceState = derivedComplianceState;
    return this;
  }

   /**
   * The overall compliance state of a block, derived from the block&#39;s orders. Possible values are &#39;Pending&#39;, &#39;Failed&#39;, &#39;Manually approved&#39; and &#39;Passed&#39;.
   * @return derivedComplianceState
  **/
  @jakarta.annotation.Nonnull
  public String getDerivedComplianceState() {
    return derivedComplianceState;
  }


  public void setDerivedComplianceState(String derivedComplianceState) {
    this.derivedComplianceState = derivedComplianceState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderGraphBlock orderGraphBlock = (OrderGraphBlock) o;
    return Objects.equals(this.block, orderGraphBlock.block) &&
        Objects.equals(this.ordered, orderGraphBlock.ordered) &&
        Objects.equals(this.placed, orderGraphBlock.placed) &&
        Objects.equals(this.executed, orderGraphBlock.executed) &&
        Objects.equals(this.allocated, orderGraphBlock.allocated) &&
        Objects.equals(this.derivedState, orderGraphBlock.derivedState) &&
        Objects.equals(this.derivedComplianceState, orderGraphBlock.derivedComplianceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(block, ordered, placed, executed, allocated, derivedState, derivedComplianceState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderGraphBlock {\n");
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    ordered: ").append(toIndentedString(ordered)).append("\n");
    sb.append("    placed: ").append(toIndentedString(placed)).append("\n");
    sb.append("    executed: ").append(toIndentedString(executed)).append("\n");
    sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
    sb.append("    derivedState: ").append(toIndentedString(derivedState)).append("\n");
    sb.append("    derivedComplianceState: ").append(toIndentedString(derivedComplianceState)).append("\n");
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
    openapiFields.add("block");
    openapiFields.add("ordered");
    openapiFields.add("placed");
    openapiFields.add("executed");
    openapiFields.add("allocated");
    openapiFields.add("derivedState");
    openapiFields.add("derivedComplianceState");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("block");
    openapiRequiredFields.add("ordered");
    openapiRequiredFields.add("placed");
    openapiRequiredFields.add("executed");
    openapiRequiredFields.add("allocated");
    openapiRequiredFields.add("derivedState");
    openapiRequiredFields.add("derivedComplianceState");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderGraphBlock
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrderGraphBlock.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderGraphBlock is not found in the empty JSON string", OrderGraphBlock.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderGraphBlock.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderGraphBlock` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OrderGraphBlock.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `block`
      Block.validateJsonObject(jsonObj.getAsJsonObject("block"));
      // validate the required field `ordered`
      OrderGraphBlockOrderSynopsis.validateJsonObject(jsonObj.getAsJsonObject("ordered"));
      // validate the required field `placed`
      OrderGraphBlockPlacementSynopsis.validateJsonObject(jsonObj.getAsJsonObject("placed"));
      // validate the required field `executed`
      OrderGraphBlockExecutionSynopsis.validateJsonObject(jsonObj.getAsJsonObject("executed"));
      // validate the required field `allocated`
      OrderGraphBlockAllocationSynopsis.validateJsonObject(jsonObj.getAsJsonObject("allocated"));
      if (!jsonObj.get("derivedState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `derivedState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("derivedState").toString()));
      }
      if (!jsonObj.get("derivedComplianceState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `derivedComplianceState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("derivedComplianceState").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderGraphBlock.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderGraphBlock' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderGraphBlock> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderGraphBlock.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderGraphBlock>() {
           @Override
           public void write(JsonWriter out, OrderGraphBlock value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderGraphBlock read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderGraphBlock given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderGraphBlock
  * @throws IOException if the JSON string is invalid with respect to OrderGraphBlock
  */
  public static OrderGraphBlock fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderGraphBlock.class);
  }

 /**
  * Convert an instance of OrderGraphBlock to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}