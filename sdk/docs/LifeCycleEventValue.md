# com.finbourne.lusid.model.LifeCycleEventValue
The instrument life cycle event result value type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the event | [optional] [default to OffsetDateTime]
**eventValues** | [**ResultValueDictionary**](ResultValueDictionary.md) |  | [optional] [default to ResultValueDictionary]
**eventLineage** | [**LifeCycleEventLineage**](LifeCycleEventLineage.md) |  | [optional] [default to LifeCycleEventLineage]

```java
import com.finbourne.lusid.model.LifeCycleEventValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
ResultValueDictionary EventValues = new ResultValueDictionary();
LifeCycleEventLineage EventLineage = new LifeCycleEventLineage();


LifeCycleEventValue lifeCycleEventValueInstance = new LifeCycleEventValue()
    .EffectiveDate(EffectiveDate)
    .EventValues(EventValues)
    .EventLineage(EventLineage);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
