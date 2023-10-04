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
import com.finbourne.lusid.model.OptionEntry;
import com.finbourne.lusid.model.Schedule;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Optionality Schedule represents a class for creation of schedules for optionality (call, put)
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptionalitySchedule extends Schedule {
  public static final String SERIALIZED_NAME_EXERCISE_TYPE = "exerciseType";
  @SerializedName(SERIALIZED_NAME_EXERCISE_TYPE)
  private String exerciseType;

  public static final String SERIALIZED_NAME_OPTION_ENTRIES = "optionEntries";
  @SerializedName(SERIALIZED_NAME_OPTION_ENTRIES)
  private List<OptionEntry> optionEntries;

  public static final String SERIALIZED_NAME_OPTION_TYPE = "optionType";
  @SerializedName(SERIALIZED_NAME_OPTION_TYPE)
  private String optionType;

  public OptionalitySchedule() {
    // this.scheduleType = this.getClass().getSimpleName();
  }

  public OptionalitySchedule exerciseType(String exerciseType) {
    
    this.exerciseType = exerciseType;
    return this;
  }

   /**
   * The exercise type of the optionality schedule (American or European).  For American type, the bond is perpetually callable from a given exercise date until it matures, or the next date in the schedule.  For European type, the bond is only callable on a given exercise date.    Supported string (enumeration) values are: [European, American].
   * @return exerciseType
  **/
  @jakarta.annotation.Nullable
  public String getExerciseType() {
    return exerciseType;
  }


  public void setExerciseType(String exerciseType) {
    this.exerciseType = exerciseType;
  }


  public OptionalitySchedule optionEntries(List<OptionEntry> optionEntries) {
    
    this.optionEntries = optionEntries;
    return this;
  }

  public OptionalitySchedule addOptionEntriesItem(OptionEntry optionEntriesItem) {
    if (this.optionEntries == null) {
      this.optionEntries = new ArrayList<>();
    }
    this.optionEntries.add(optionEntriesItem);
    return this;
  }

   /**
   * The dates at which the bond call/put may be actioned, and associated strikes.
   * @return optionEntries
  **/
  @jakarta.annotation.Nullable
  public List<OptionEntry> getOptionEntries() {
    return optionEntries;
  }


  public void setOptionEntries(List<OptionEntry> optionEntries) {
    this.optionEntries = optionEntries;
  }


  public OptionalitySchedule optionType(String optionType) {
    
    this.optionType = optionType;
    return this;
  }

   /**
   * Type of optionality for the schedule.    Supported string (enumeration) values are: [Call, Put].
   * @return optionType
  **/
  @jakarta.annotation.Nullable
  public String getOptionType() {
    return optionType;
  }


  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionalitySchedule optionalitySchedule = (OptionalitySchedule) o;
    return Objects.equals(this.exerciseType, optionalitySchedule.exerciseType) &&
        Objects.equals(this.optionEntries, optionalitySchedule.optionEntries) &&
        Objects.equals(this.optionType, optionalitySchedule.optionType) &&
        super.equals(o);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(exerciseType, optionEntries, optionType, super.hashCode());
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
    sb.append("class OptionalitySchedule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exerciseType: ").append(toIndentedString(exerciseType)).append("\n");
    sb.append("    optionEntries: ").append(toIndentedString(optionEntries)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
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
    openapiFields.add("scheduleType");
    openapiFields.add("exerciseType");
    openapiFields.add("optionEntries");
    openapiFields.add("optionType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scheduleType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OptionalitySchedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OptionalitySchedule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionalitySchedule is not found in the empty JSON string", OptionalitySchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OptionalitySchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OptionalitySchedule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OptionalitySchedule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionalitySchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionalitySchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionalitySchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionalitySchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionalitySchedule>() {
           @Override
           public void write(JsonWriter out, OptionalitySchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OptionalitySchedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OptionalitySchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionalitySchedule
  * @throws IOException if the JSON string is invalid with respect to OptionalitySchedule
  */
  public static OptionalitySchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionalitySchedule.class);
  }

 /**
  * Convert an instance of OptionalitySchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}