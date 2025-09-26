# com.finbourne.lusid.model.InstrumentIdValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **String** | The value of the identifier. | [default to String]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the identifier will be valid. If left unspecified the default value is the beginning of time. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.InstrumentIdValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Value = "example Value";
OffsetDateTime EffectiveAt = OffsetDateTime.now();


InstrumentIdValue instrumentIdValueInstance = new InstrumentIdValue()
    .Value(Value)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
