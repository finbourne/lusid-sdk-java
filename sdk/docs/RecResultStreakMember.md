# com.finbourne.lusid.model.RecResultStreakMember
A member of a result's streak, tagged relative to the requested result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**RecResult**](RecResult.md) |  | [default to RecResult]
**streakTypes** | **List&lt;String&gt;** | Which streaks the member shares with the requested result: always Core; Difference when every link between them has unchanged aggregate rule differences; Open when it, the requested result and every member between them have an open exception. The requested result is always Difference. Available values: Core, Difference, Open. | [default to List<String>]
**relation** | **String** | Where the member sits relative to the requested result: Predecessor in an earlier instance, Requested for the result itself, Successor in a later instance. Available values: Predecessor, Requested, Successor. | [default to String]

```java
import com.finbourne.lusid.model.RecResultStreakMember;
import java.util.*;
import java.lang.System;
import java.net.URI;

RecResult Result = new RecResult();
List<String> StreakTypes = new List<String>();
String Relation = "example Relation";


RecResultStreakMember recResultStreakMemberInstance = new RecResultStreakMember()
    .Result(Result)
    .StreakTypes(StreakTypes)
    .Relation(Relation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
