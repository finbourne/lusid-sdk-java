# com.finbourne.lusid.model.ResetEvent
Definition of a reset event.  This is an event that describes a reset or fixing for an instrument such as the floating payment on  a swap cash flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **java.math.BigDecimal** | The quantity associated with the reset. This will only be populated if the information is known. | [optional] [default to java.math.BigDecimal]
**resetType** | **String** | The type of the reset; e.g. RIC, Currency-pair | [default to String]
**fixingSource** | **String** | Fixing identification source, if available. | [optional] [default to String]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the reset fixes, or is observed upon. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.ResetEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal Value = new java.math.BigDecimal("100.00");
String ResetType = "example ResetType";
@jakarta.annotation.Nullable String FixingSource = "example FixingSource";
OffsetDateTime FixingDate = OffsetDateTime.now();


ResetEvent resetEventInstance = new ResetEvent()
    .Value(Value)
    .ResetType(ResetType)
    .FixingSource(FixingSource)
    .FixingDate(FixingDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
