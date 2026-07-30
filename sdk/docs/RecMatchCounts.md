# com.finbourne.lusid.model.RecMatchCounts
Counts for non-exception results (Match, Cross).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this category. | [default to Integer]
**byResultType** | [**RecMatchCountByResultType**](RecMatchCountByResultType.md) |  | [default to RecMatchCountByResultType]
**byReviewStatus** | [**RecResultCountByReviewStatus**](RecResultCountByReviewStatus.md) |  | [default to RecResultCountByReviewStatus]

```java
import com.finbourne.lusid.model.RecMatchCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Total = new Integer("100.00");
RecMatchCountByResultType ByResultType = new RecMatchCountByResultType();
RecResultCountByReviewStatus ByReviewStatus = new RecResultCountByReviewStatus();


RecMatchCounts recMatchCountsInstance = new RecMatchCounts()
    .Total(Total)
    .ByResultType(ByResultType)
    .ByReviewStatus(ByReviewStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
