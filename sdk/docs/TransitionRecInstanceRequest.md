# com.finbourne.lusid.model.TransitionRecInstanceRequest
The request to apply a lifecycle transition (re-run, lock or unlock) to a rec instance.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The transition to apply. Available values: ReRun, Lock, Unlock. | [default to String]

```java
import com.finbourne.lusid.model.TransitionRecInstanceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Action = "example Action";


TransitionRecInstanceRequest transitionRecInstanceRequestInstance = new TransitionRecInstanceRequest()
    .Action(Action);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
