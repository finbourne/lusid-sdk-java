# com.finbourne.lusid.model.FundStructureRequest
The request used to create a Fund Structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Fund Structure. | [default to String]
**name** | **String** | The display name of the Fund Structure. | [default to String]
**description** | **String** | An optional description for the Fund Structure. | [optional] [default to String]
**existingFunds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | An optional list of existing funds to be incorporated as part of the structure. | [optional] [default to List<ResourceId>]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. Only classes and feeder funds linked to the master fund specified are allowed. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. | [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define the relationships between feeder and master nodes in the structure. | [default to List<FundStructureEdge>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Fund Structure applies. Defaults to the beginning of time if not specified, so that the structure is visible at every effective datetime. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Fund Structure. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.FundStructureRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<ResourceId> ExistingFunds = new List<ResourceId>();
@jakarta.annotation.Nullable List<AllocationGroup> AllocationGroups = new List<AllocationGroup>();
List<FundStructureNode> Nodes = new List<FundStructureNode>();
List<FundStructureEdge> Edges = new List<FundStructureEdge>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


FundStructureRequest fundStructureRequestInstance = new FundStructureRequest()
    .Code(Code)
    .Name(Name)
    .Description(Description)
    .ExistingFunds(ExistingFunds)
    .AllocationGroups(AllocationGroups)
    .Nodes(Nodes)
    .Edges(Edges)
    .EffectiveAt(EffectiveAt)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
