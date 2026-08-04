# com.finbourne.lusid.model.RecClosedPeriodReference
A reference to a closed period created on a timeline when the instance was locked.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timelineId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**closedPeriodId** | **String** | The identifier of the closed period. | [default to String]

```java
import com.finbourne.lusid.model.RecClosedPeriodReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId TimelineId = new ResourceId();
String ClosedPeriodId = "example ClosedPeriodId";


RecClosedPeriodReference recClosedPeriodReferenceInstance = new RecClosedPeriodReference()
    .TimelineId(TimelineId)
    .ClosedPeriodId(ClosedPeriodId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
