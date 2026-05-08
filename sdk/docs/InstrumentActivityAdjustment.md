# com.finbourne.lusid.model.InstrumentActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**scope** | **String** | The Scope of the given entity | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the given entity | [default to String]

```java
import com.finbourne.lusid.model.InstrumentActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NavActivityAdjustmentSource = "example NavActivityAdjustmentSource";
OffsetDateTime AsAt = OffsetDateTime.now();
String Scope = "example Scope";
String LusidInstrumentId = "example LusidInstrumentId";


InstrumentActivityAdjustment instrumentActivityAdjustmentInstance = new InstrumentActivityAdjustment()
    .NavActivityAdjustmentSource(NavActivityAdjustmentSource)
    .AsAt(AsAt)
    .Scope(Scope)
    .LusidInstrumentId(LusidInstrumentId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
