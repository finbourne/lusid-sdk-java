# com.finbourne.lusid.model.InstrumentActivity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time for which the adjustment is being applied. | [default to OffsetDateTime]
**scope** | **String** | The Scope of the given entity | [default to String]
**lusidInstrumentId** | **String** | The LusidInstrumentId of the given entity | [default to String]

```java
import com.finbourne.lusid.model.InstrumentActivity;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AsAt = OffsetDateTime.now();
String Scope = "example Scope";
String LusidInstrumentId = "example LusidInstrumentId";


InstrumentActivity instrumentActivityInstance = new InstrumentActivity()
    .AsAt(AsAt)
    .Scope(Scope)
    .LusidInstrumentId(LusidInstrumentId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
