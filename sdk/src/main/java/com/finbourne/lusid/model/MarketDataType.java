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
 * The format of the complex market data stored. Complex market data is used to store any  data which requires more context than just a simple single point as is the case with a  quote.  Examples of such complex market data are Discount Curve and Volatility Surfaces.
 */
@JsonAdapter(MarketDataType.Adapter.class)
public enum MarketDataType {
  
  DISCOUNTFACTORCURVEDATA("DiscountFactorCurveData"),
  
  EQUITYVOLSURFACEDATA("EquityVolSurfaceData"),
  
  FXVOLSURFACEDATA("FxVolSurfaceData"),
  
  IRVOLCUBEDATA("IrVolCubeData"),
  
  OPAQUEMARKETDATA("OpaqueMarketData"),
  
  YIELDCURVEDATA("YieldCurveData"),
  
  FXFORWARDCURVEDATA("FxForwardCurveData"),
  
  FXFORWARDPIPSCURVEDATA("FxForwardPipsCurveData"),
  
  FXFORWARDTENORCURVEDATA("FxForwardTenorCurveData"),
  
  FXFORWARDTENORPIPSCURVEDATA("FxForwardTenorPipsCurveData"),
  
  FXFORWARDCURVEBYQUOTEREFERENCE("FxForwardCurveByQuoteReference"),
  
  CREDITSPREADCURVEDATA("CreditSpreadCurveData"),
  
  EQUITYCURVEBYPRICESDATA("EquityCurveByPricesData");

  private String value;

  MarketDataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MarketDataType fromValue(String value) {
    for (MarketDataType b : MarketDataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MarketDataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MarketDataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MarketDataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MarketDataType.fromValue(value);
    }
  }
}
