# com.finbourne.lusid.model.MovementConditionMatch
The outcome of one movement's condition for a transaction. Reported per movement rather than keyed by  movement, because a transaction type may configure several movements that share a side and have no name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementName** | **String** | The name of the movement, or null if the movement is unnamed. | [optional] [default to String]
**side** | **String** | The side the movement is configured against. | [default to String]
**conditionMatched** | **Boolean** | Whether the movement&#39;s condition was satisfied by this transaction. A movement with no condition always matches. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.MovementConditionMatch;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String MovementName = "example MovementName";
String Side = "example Side";
Boolean ConditionMatched = true;


MovementConditionMatch movementConditionMatchInstance = new MovementConditionMatch()
    .MovementName(MovementName)
    .Side(Side)
    .ConditionMatched(ConditionMatched);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
