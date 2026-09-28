# com.finbourne.lusid.model.FundStructureEdgeTarget
The member a link points at, and for a dedicated share class link the share class on that member.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | **String** | The node code of the member the link points at. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class on the target member that the source invests into. Required for a DedicatedShareClass link and not allowed on any other. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundStructureEdgeTarget;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Node = "example Node";
@jakarta.annotation.Nullable String ShareClassShortCode = "example ShareClassShortCode";


FundStructureEdgeTarget fundStructureEdgeTargetInstance = new FundStructureEdgeTarget()
    .Node(Node)
    .ShareClassShortCode(ShareClassShortCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
