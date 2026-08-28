# com.finbourne.lusid.model.UnconfirmClosedPeriodRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleteSubsequentPeriods** | **Boolean** | Whether to delete every Closed Period that comes after the requested Closed Period on the Timeline. When false (the default) only the latest confirmed Closed Period may be unconfirmed. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.UnconfirmClosedPeriodRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean DeleteSubsequentPeriods = true;


UnconfirmClosedPeriodRequest unconfirmClosedPeriodRequestInstance = new UnconfirmClosedPeriodRequest()
    .DeleteSubsequentPeriods(DeleteSubsequentPeriods);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
