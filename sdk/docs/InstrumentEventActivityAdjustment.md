# com.finbourne.lusid.model.InstrumentEventActivityAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**navActivityAdjustmentSource** | **String** | The post closed activity source of the given entity, for example Manual. Available values: Undefined, Manual, Auto. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**corporateActionSourceScope** | **String** | The scope of the corporate action source that the instrument event belongs to. | [default to String]
**corporateActionSourceCode** | **String** | The code of the corporate action source that the instrument event belongs to. | [default to String]
**instrumentEventId** | **String** | The Id of the instrument event being adjusted. | [default to String]

```java
import com.finbourne.lusid.model.InstrumentEventActivityAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

String NavActivityAdjustmentSource = "example NavActivityAdjustmentSource";
OffsetDateTime AsAt = OffsetDateTime.now();
String CorporateActionSourceScope = "example CorporateActionSourceScope";
String CorporateActionSourceCode = "example CorporateActionSourceCode";
String InstrumentEventId = "example InstrumentEventId";


InstrumentEventActivityAdjustment instrumentEventActivityAdjustmentInstance = new InstrumentEventActivityAdjustment()
    .NavActivityAdjustmentSource(NavActivityAdjustmentSource)
    .AsAt(AsAt)
    .CorporateActionSourceScope(CorporateActionSourceScope)
    .CorporateActionSourceCode(CorporateActionSourceCode)
    .InstrumentEventId(InstrumentEventId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
