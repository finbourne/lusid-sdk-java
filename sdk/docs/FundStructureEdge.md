# com.finbourne.lusid.model.FundStructureEdge
A directed edge in a Fund Structure, defining a relationship from a feeder node to a master node share class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | The node code of the feeder node that is the source of this relationship. | [default to String]
**to** | [**FundStructureEdgeTarget**](FundStructureEdgeTarget.md) |  | [default to FundStructureEdgeTarget]

```java
import com.finbourne.lusid.model.FundStructureEdge;
import java.util.*;
import java.lang.System;
import java.net.URI;

String From = "example From";
FundStructureEdgeTarget To = new FundStructureEdgeTarget();


FundStructureEdge fundStructureEdgeInstance = new FundStructureEdge()
    .From(From)
    .To(To);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
