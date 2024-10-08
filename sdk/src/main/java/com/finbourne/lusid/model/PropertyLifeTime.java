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
 * Gets or Sets PropertyLifeTime
 */
@JsonAdapter(PropertyLifeTime.Adapter.class)
public enum PropertyLifeTime {
  
  PERPETUAL("Perpetual"),
  
  TIMEVARIANT("TimeVariant");

  private String value;

  PropertyLifeTime(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PropertyLifeTime fromValue(String value) {
    for (PropertyLifeTime b : PropertyLifeTime.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PropertyLifeTime> {
    @Override
    public void write(final JsonWriter jsonWriter, final PropertyLifeTime enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PropertyLifeTime read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PropertyLifeTime.fromValue(value);
    }
  }
}

