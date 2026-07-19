# com.finbourne.lusid.model.FundStructureRequest
The request used to create a Fund Structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Fund Structure. | [default to String]
**name** | **String** | The display name of the Fund Structure. | [default to String]
**description** | **String** | An optional description for the Fund Structure. | [optional] [default to String]
**existingFunds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | An optional list of existing funds to be incorporated as part of the structure. | [optional] [default to List<ResourceId>]
**newFunds** | [**List&lt;FundDefinitionRequest&gt;**](FundDefinitionRequest.md) | An optional list of Fund definitions to be created inline as part of the structure. | [optional] [default to List<FundDefinitionRequest>]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. Only classes and feeder funds linked to the master fund specified are allowed. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. | [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define the relationships between feeder and master nodes in the structure. | [default to List<FundStructureEdge>]

```java
import com.finbourne.lusid.model.FundStructureRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<ResourceId> ExistingFunds = new List<ResourceId>();
@jakarta.annotation.Nullable List<FundDefinitionRequest> NewFunds = new List<FundDefinitionRequest>();
@jakarta.annotation.Nullable List<AllocationGroup> AllocationGroups = new List<AllocationGroup>();
List<FundStructureNode> Nodes = new List<FundStructureNode>();
List<FundStructureEdge> Edges = new List<FundStructureEdge>();


FundStructureRequest fundStructureRequestInstance = new FundStructureRequest()
    .Code(Code)
    .Name(Name)
    .Description(Description)
    .ExistingFunds(ExistingFunds)
    .NewFunds(NewFunds)
    .AllocationGroups(AllocationGroups)
    .Nodes(Nodes)
    .Edges(Edges);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
