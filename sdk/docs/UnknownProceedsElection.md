# com.finbourne.lusid.model.UnknownProceedsElection
Election representing an outturn whose proceeds are not yet known (UNKNOWN).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.UnknownProceedsElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;


UnknownProceedsElection unknownProceedsElectionInstance = new UnknownProceedsElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
