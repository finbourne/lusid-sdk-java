# com.finbourne.lusid.model.StagedModificationDecisionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decision** | **String** | The decision on the requested staged modification, can be &#39;Approve&#39; or &#39;Reject&#39;. | [default to String]
**comment** | **String** | Comment on decision. | [default to String]

```java
import com.finbourne.lusid.model.StagedModificationDecisionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Decision = "example Decision";
String Comment = "example Comment";


StagedModificationDecisionRequest stagedModificationDecisionRequestInstance = new StagedModificationDecisionRequest()
    .Decision(Decision)
    .Comment(Comment);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
