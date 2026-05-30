# com.finbourne.lusid.model.PreviousValuationPoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**valuationPointCode** | **String** | The code of the Valuation Point. | [default to String]
**name** | **String** | Identifiable Name assigned to the Valuation Point. | [optional] [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective time of the Valuation Point. | [default to OffsetDateTime]
**queryAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time of the Valuation Point. This is the AsAt time that will be used when requests are made using the entry. | [default to OffsetDateTime]
**holdingsAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for building holdings in the Valuation Point. | [optional] [default to OffsetDateTime]
**valuationAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The AsAt time used for performing valuations in the Valuation Point. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PreviousValuationPoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ValuationPointCode = "example ValuationPointCode";
@jakarta.annotation.Nullable String Name = "example Name";
OffsetDateTime EffectiveAt = OffsetDateTime.now();
OffsetDateTime QueryAsAt = OffsetDateTime.now();
OffsetDateTime HoldingsAsAt = OffsetDateTime.now();
OffsetDateTime ValuationAsAt = OffsetDateTime.now();


PreviousValuationPoint previousValuationPointInstance = new PreviousValuationPoint()
    .ValuationPointCode(ValuationPointCode)
    .Name(Name)
    .EffectiveAt(EffectiveAt)
    .QueryAsAt(QueryAsAt)
    .HoldingsAsAt(HoldingsAsAt)
    .ValuationAsAt(ValuationAsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
