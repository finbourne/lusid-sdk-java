# com.finbourne.lusid.model.RecResultStreak
The run of consecutive instances, ending at this result, in which the same result was produced, with its  difference and open sub-streaks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predecessor** | [**RecResultStreakPredecessor**](RecResultStreakPredecessor.md) |  | [default to RecResultStreakPredecessor]
**age** | **String** | The ISO 8601 duration from the startResult&#39;s asAtFirstSeen to the runAsAt of this result&#39;s latest run. Always positive. | [default to String]
**countInstances** | **Integer** | The number of instances in the streak, including this one. Always 2 or more. | [default to Integer]
**startResult** | [**RecAgedResult**](RecAgedResult.md) |  | [default to RecAgedResult]
**differenceStreak** | [**RecResultSubStreak**](RecResultSubStreak.md) |  | [default to RecResultSubStreak]
**openStreak** | [**RecResultSubStreak**](RecResultSubStreak.md) |  | [default to RecResultSubStreak]

```java
import com.finbourne.lusid.model.RecResultStreak;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecResultStreakPredecessor Predecessor = new RecResultStreakPredecessor();
String Age = "example Age";
Integer CountInstances = new Integer("100.00");
RecAgedResult StartResult = new RecAgedResult();
RecResultSubStreak DifferenceStreak = new RecResultSubStreak();
RecResultSubStreak OpenStreak = new RecResultSubStreak();


RecResultStreak recResultStreakInstance = new RecResultStreak()
    .Predecessor(Predecessor)
    .Age(Age)
    .CountInstances(CountInstances)
    .StartResult(StartResult)
    .DifferenceStreak(DifferenceStreak)
    .OpenStreak(OpenStreak);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
