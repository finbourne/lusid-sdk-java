# com.finbourne.lusid.model.FundStructureEdgeTarget
The target of a Fund Structure edge, identifying the master node and share class the feeder invests into.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | **String** | The node code of the master node that is the target of this relationship. | [default to String]
**shareClassShortCode** | **String** | The short code of the share class on the master fund that the feeder invests into. | [default to String]

```java
import com.finbourne.lusid.model.FundStructureEdgeTarget;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Node = "example Node";
String ShareClassShortCode = "example ShareClassShortCode";


FundStructureEdgeTarget fundStructureEdgeTargetInstance = new FundStructureEdgeTarget()
    .Node(Node)
    .ShareClassShortCode(ShareClassShortCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
