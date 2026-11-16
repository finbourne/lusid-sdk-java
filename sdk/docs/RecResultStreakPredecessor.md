# com.finbourne.lusid.model.RecResultStreakPredecessor
The same result in the previous instance, and which streaks it extends.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**RecAgedResult**](RecAgedResult.md) |  | [default to RecAgedResult]
**streakTypes** | **List&lt;String&gt;** | Which streaks the predecessor extends: always Core, and Difference if the aggregate rule differences are unchanged. Open is not set yet. Available values: Core, Difference, Open. | [default to List<String>]

```java
import com.finbourne.lusid.model.RecResultStreakPredecessor;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecAgedResult Result = new RecAgedResult();
List<String> StreakTypes = new List<String>();


RecResultStreakPredecessor recResultStreakPredecessorInstance = new RecResultStreakPredecessor()
    .Result(Result)
    .StreakTypes(StreakTypes);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
