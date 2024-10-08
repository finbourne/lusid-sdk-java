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
 * A list of types, familiar to the Ui, that define the expected input or output types on a piece of data
 */
@JsonAdapter(ValueType.Adapter.class)
public enum ValueType {
  
  STRING("String"),
  
  INT("Int"),
  
  DECIMAL("Decimal"),
  
  DATETIME("DateTime"),
  
  BOOLEAN("Boolean"),
  
  MAP("Map"),
  
  LIST("List"),
  
  PROPERTYARRAY("PropertyArray"),
  
  PERCENTAGE("Percentage"),
  
  CODE("Code"),
  
  ID("Id"),
  
  URI("Uri"),
  
  CURRENCYANDAMOUNT("CurrencyAndAmount"),
  
  TRADEPRICE("TradePrice"),
  
  CURRENCY("Currency"),
  
  METRICVALUE("MetricValue"),
  
  RESOURCEID("ResourceId"),
  
  RESULTVALUE("ResultValue"),
  
  CUTLOCALTIME("CutLocalTime"),
  
  DATEORCUTLABEL("DateOrCutLabel"),
  
  UNINDEXEDTEXT("UnindexedText");

  private String value;

  ValueType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ValueType fromValue(String value) {
    for (ValueType b : ValueType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ValueType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ValueType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ValueType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ValueType.fromValue(value);
    }
  }
}

