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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * See https://wiki.finbourne.com/information/domain-model-properties
 */
@JsonAdapter(PropertyType.Adapter.class)
public enum PropertyType {
  
  LABEL("Label"),
  
  METRIC("Metric"),
  
  INFORMATION("Information");

  private String value;

  PropertyType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PropertyType fromValue(String value) {
    for (PropertyType b : PropertyType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PropertyType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PropertyType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PropertyType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PropertyType.fromValue(value);
    }
  }
}

