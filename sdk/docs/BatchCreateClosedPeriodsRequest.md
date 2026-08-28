# com.finbourne.lusid.model.BatchCreateClosedPeriodsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closedPeriods** | [**List&lt;CreateClosedPeriodRequest&gt;**](CreateClosedPeriodRequest.md) | The ordered set of Closed Periods to create. Each Closed Period&#39;s EffectiveStart is derived from the previous Closed Period&#39;s EffectiveEnd (or the current chain tail for the first item), so EffectiveEnd must be strictly increasing across the batch. | [default to List<CreateClosedPeriodRequest>]

```java
import com.finbourne.lusid.model.BatchCreateClosedPeriodsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<CreateClosedPeriodRequest> ClosedPeriods = new List<CreateClosedPeriodRequest>();


BatchCreateClosedPeriodsRequest batchCreateClosedPeriodsRequestInstance = new BatchCreateClosedPeriodsRequest()
    .ClosedPeriods(ClosedPeriods);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
