# com.finbourne.lusid.model.InstrumentResolutionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [default to Map<String, String>]
**lusidInstrumentId** | **String** | LUSID&#39;s internal unique instrument identifier, resolved from the instrument identifiers | [optional] [readonly] [default to String]
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [readonly] [default to String]
**launchPrice** | **java.math.BigDecimal** | The launch price set when a shareclass is added to the fund. Defaults to 1. | [optional] [default to java.math.BigDecimal]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The launch date set when a shareclass is added to the fund. Defaults to Fund Inception Date. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.InstrumentResolutionDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable java.math.BigDecimal LaunchPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime LaunchDate = OffsetDateTime.now();


InstrumentResolutionDetail instrumentResolutionDetailInstance = new InstrumentResolutionDetail()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentScope(InstrumentScope)
    .LaunchPrice(LaunchPrice)
    .LaunchDate(LaunchDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
