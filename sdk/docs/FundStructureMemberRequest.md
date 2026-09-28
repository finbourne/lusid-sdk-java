# com.finbourne.lusid.model.FundStructureMemberRequest
A member to add to a Fund Structure: the node, and the links that join it to members already in the structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node** | [**FundStructureNode**](FundStructureNode.md) |  | [default to FundStructureNode]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The links joining the new node to members already in the structure. May be empty for a member that is linked later. | [optional] [default to List<FundStructureEdge>]

```java
import com.finbourne.lusid.model.FundStructureMemberRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

FundStructureNode Node = new FundStructureNode();
@jakarta.annotation.Nullable List<FundStructureEdge> Edges = new List<FundStructureEdge>();


FundStructureMemberRequest fundStructureMemberRequestInstance = new FundStructureMemberRequest()
    .Node(Node)
    .Edges(Edges);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
