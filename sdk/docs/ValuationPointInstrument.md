# com.finbourne.lusid.model.ValuationPointInstrument
An Instrument held at a Valuation Point, including its origin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrument** | [**Instrument**](Instrument.md) |  | [optional] [default to Instrument]
**valuationPointOrigin** | **String** | Designates if the instrument was originally part of the Valuation Point or if it was added as part of a Complex Close action. Available values: None, Original, Added. | [optional] [default to String]
**addedOriginValuationPointCode** | **String** | The Valuation Point, only for an Instrument added as part of a Complex Close action. | [optional] [default to String]
**addedOriginValuationPointVariantCode** | **String** | The Valuation Point variant, only for Instruments added as part of a Complex Close action. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The requested instrument properties. These will be from the &#39;Instrument&#39; domain. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.ValuationPointInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

Instrument Instrument = new Instrument();
@jakarta.annotation.Nullable String ValuationPointOrigin = "example ValuationPointOrigin";
@jakarta.annotation.Nullable String AddedOriginValuationPointCode = "example AddedOriginValuationPointCode";
@jakarta.annotation.Nullable String AddedOriginValuationPointVariantCode = "example AddedOriginValuationPointVariantCode";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


ValuationPointInstrument valuationPointInstrumentInstance = new ValuationPointInstrument()
    .Instrument(Instrument)
    .ValuationPointOrigin(ValuationPointOrigin)
    .AddedOriginValuationPointCode(AddedOriginValuationPointCode)
    .AddedOriginValuationPointVariantCode(AddedOriginValuationPointVariantCode)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
