# com.finbourne.lusid.model.RecResultCounts
Counts of results broken down by the structural categories that align with the review configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**openExceptions** | [**RecOpenExceptionCounts**](RecOpenExceptionCounts.md) |  | [default to RecOpenExceptionCounts]
**closedExceptions** | [**RecClosedExceptionCounts**](RecClosedExceptionCounts.md) |  | [default to RecClosedExceptionCounts]
**matches** | [**RecMatchCounts**](RecMatchCounts.md) |  | [default to RecMatchCounts]

```java
import com.finbourne.lusid.model.RecResultCounts;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecOpenExceptionCounts OpenExceptions = new RecOpenExceptionCounts();
RecClosedExceptionCounts ClosedExceptions = new RecClosedExceptionCounts();
RecMatchCounts Matches = new RecMatchCounts();


RecResultCounts recResultCountsInstance = new RecResultCounts()
    .OpenExceptions(OpenExceptions)
    .ClosedExceptions(ClosedExceptions)
    .Matches(Matches);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
