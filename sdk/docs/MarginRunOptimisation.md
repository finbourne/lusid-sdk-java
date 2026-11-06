# com.finbourne.lusid.model.MarginRunOptimisation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **String** | How far the pass got. One of Pending, Completed, Skipped or Failed. | [default to String]
**recommendationCount** | **Integer** | How many recommendations the pass made. | [default to Integer]
**detail** | **String** | What the pass left out and why, or why it failed. Null when nothing was left out. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarginRunOptimisation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Status = "example Status";
Integer RecommendationCount = new Integer("100.00");
@jakarta.annotation.Nullable String Detail = "example Detail";


MarginRunOptimisation marginRunOptimisationInstance = new MarginRunOptimisation()
    .Status(Status)
    .RecommendationCount(RecommendationCount)
    .Detail(Detail);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
