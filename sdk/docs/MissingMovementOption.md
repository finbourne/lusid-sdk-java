# com.finbourne.lusid.model.MissingMovementOption
A movement option one of a transaction type's line legs must carry for the register to see what it books, and does not, named by that movement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**movementName** | **String** | The name of the movement that carries the delta. | [optional] [default to String]
**side** | **String** | The side of the movement that carries the delta. | [default to String]
**option** | **String** | The movement option the leg lacks. Currently always &#39;Registry&#39;. | [default to String]

```java
import com.finbourne.lusid.model.MissingMovementOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String MovementName = "example MovementName";
String Side = "example Side";
String Option = "example Option";


MissingMovementOption missingMovementOptionInstance = new MissingMovementOption()
    .MovementName(MovementName)
    .Side(Side)
    .Option(Option);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
