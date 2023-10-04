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
 * Gets or Sets Operator
 */
@JsonAdapter(Operator.Adapter.class)
public enum Operator {
  
  EQUALS("Equals"),
  
  NOTEQUALS("NotEquals"),
  
  GREATERTHAN("GreaterThan"),
  
  GREATERTHANOREQUALTO("GreaterThanOrEqualTo"),
  
  LESSTHAN("LessThan"),
  
  LESSTHANOREQUALTO("LessThanOrEqualTo"),
  
  IN("In");

  private String value;

  Operator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Operator fromValue(String value) {
    for (Operator b : Operator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Operator> {
    @Override
    public void write(final JsonWriter jsonWriter, final Operator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Operator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Operator.fromValue(value);
    }
  }
}
