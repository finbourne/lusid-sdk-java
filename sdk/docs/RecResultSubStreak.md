# com.finbourne.lusid.model.RecResultSubStreak
The part of a streak, ending at this result, over which a stricter condition held: same difference, or open.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age** | **String** | The ISO 8601 duration from the startResult&#39;s asAtFirstSeen to the runAsAt of this result&#39;s latest run. Zero when the predecessor does not extend the sub-streak. | [default to String]
**countInstances** | **Integer** | The number of instances in the sub-streak, including this one. Null when the predecessor does not extend the sub-streak; otherwise 2 or more. | [optional] [default to Integer]
**startResult** | [**RecAgedResult**](RecAgedResult.md) |  | [optional] [default to RecAgedResult]

```java
import com.finbourne.lusid.model.RecResultSubStreak;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Age = "example Age";
@jakarta.annotation.Nullable Integer CountInstances = new Integer("100.00");
RecAgedResult StartResult = new RecAgedResult();


RecResultSubStreak recResultSubStreakInstance = new RecResultSubStreak()
    .Age(Age)
    .CountInstances(CountInstances)
    .StartResult(StartResult);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
