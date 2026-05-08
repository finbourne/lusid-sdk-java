# com.finbourne.lusid.model.QuoteActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**effectiveAt** | **String** | The EffectiveAt time of the quote event that need to be added to the closed period. | [default to String]
**entityUniqueId** | **String** | The EntityUniqueId from the quote which needs to be added as a post close activity. | [default to String]
**instrumentId** | **String** | The InstrumentId from the quote which needs to be added as a post close activity. | [default to String]

```java
import com.finbourne.lusid.model.QuoteActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NavActivityAdjustmentSource = "example NavActivityAdjustmentSource";
OffsetDateTime AsAt = OffsetDateTime.now();
String EffectiveAt = "example EffectiveAt";
String EntityUniqueId = "example EntityUniqueId";
String InstrumentId = "example InstrumentId";


QuoteActivityAdjustment quoteActivityAdjustmentInstance = new QuoteActivityAdjustment()
    .NavActivityAdjustmentSource(NavActivityAdjustmentSource)
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt)
    .EntityUniqueId(EntityUniqueId)
    .InstrumentId(InstrumentId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
