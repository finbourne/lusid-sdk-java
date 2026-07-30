# com.finbourne.lusid.model.RecClosedExceptionCounts
Counts for results that are exceptions with a Closed status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this category. | [default to Integer]
**byClosureType** | [**RecExceptionCountByClosureType**](RecExceptionCountByClosureType.md) |  | [default to RecExceptionCountByClosureType]
**byReviewStatus** | [**RecResultCountByReviewStatus**](RecResultCountByReviewStatus.md) |  | [default to RecResultCountByReviewStatus]

```java
import com.finbourne.lusid.model.RecClosedExceptionCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Total = new Integer("100.00");
RecExceptionCountByClosureType ByClosureType = new RecExceptionCountByClosureType();
RecResultCountByReviewStatus ByReviewStatus = new RecResultCountByReviewStatus();


RecClosedExceptionCounts recClosedExceptionCountsInstance = new RecClosedExceptionCounts()
    .Total(Total)
    .ByClosureType(ByClosureType)
    .ByReviewStatus(ByReviewStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
