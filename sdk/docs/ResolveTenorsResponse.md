# com.finbourne.lusid.model.ResolveTenorsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**spotDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**eomRuleApplied** | **Boolean** |  | [default to Boolean]
**dates** | [**Map&lt;String, OffsetDateTime&gt;**](OffsetDateTime.md) |  | [default to Map<String, OffsetDateTime>]

```java
import com.finbourne.lusid.model.ResolveTenorsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime SpotDate = OffsetDateTime.now();
Boolean EomRuleApplied = true;
Map<String, OffsetDateTime> Dates = new Map<String, OffsetDateTime>();


ResolveTenorsResponse resolveTenorsResponseInstance = new ResolveTenorsResponse()
    .StartDate(StartDate)
    .SpotDate(SpotDate)
    .EomRuleApplied(EomRuleApplied)
    .Dates(Dates);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
