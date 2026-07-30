# com.finbourne.lusid.model.RecOpenExceptionCounts
Counts for results that are exceptions with an Open status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **Integer** | The total number of results in this category. | [default to Integer]
**byResultType** | [**RecExceptionCountByResultType**](RecExceptionCountByResultType.md) |  | [default to RecExceptionCountByResultType]
**byReviewStatus** | [**RecResultCountByReviewStatus**](RecResultCountByReviewStatus.md) |  | [default to RecResultCountByReviewStatus]

```java
import com.finbourne.lusid.model.RecOpenExceptionCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

Integer Total = new Integer("100.00");
RecExceptionCountByResultType ByResultType = new RecExceptionCountByResultType();
RecResultCountByReviewStatus ByReviewStatus = new RecResultCountByReviewStatus();


RecOpenExceptionCounts recOpenExceptionCountsInstance = new RecOpenExceptionCounts()
    .Total(Total)
    .ByResultType(ByResultType)
    .ByReviewStatus(ByReviewStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
