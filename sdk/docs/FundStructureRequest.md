# com.finbourne.lusid.model.FundStructureRequest
The request used to create a Fund Structure.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Fund Structure. | [default to String]
**name** | **String** | The display name of the Fund Structure. | [default to String]
**description** | **String** | An optional description for the Fund Structure. | [optional] [default to String]
**existingFunds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | An optional list of existing funds to be incorporated as part of the structure. | [optional] [default to List<ResourceId>]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. A group may span the share classes of a member and the members that invest into it through dedicated share class links. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. May be empty on create, with members added later through the members endpoint. | [optional] [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define how the members of the structure are linked: a member investing into a dedicated share class of another, or holding an equity, GP, LP or carry interest in another through an instrument. | [optional] [default to List<FundStructureEdge>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Fund Structure applies. Defaults to the beginning of time if not specified, so that the structure is visible at every effective datetime. | [optional] [default to OffsetDateTime]
**roleDataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCodes** | **List&lt;String&gt;** | The NAV types every member of the structure produces, by code. Declaring them once here gives the structure a shared Timeline. At least one is required, and every member fund must define a NAV type with each of these codes. | [default to List<String>]
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
@jakarta.annotation.Nullable List<FundStructureNode> Nodes = new List<FundStructureNode>();
@jakarta.annotation.Nullable List<FundStructureEdge> Edges = new List<FundStructureEdge>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
ResourceId RoleDataTypeId = new ResourceId();
List<String> NavTypeCodes = new List<String>();
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
    .RoleDataTypeId(RoleDataTypeId)
    .NavTypeCodes(NavTypeCodes)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
