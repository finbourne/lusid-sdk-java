# com.finbourne.lusid.model.FundStructure
Definition of the structure of a fund

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The display name of the Fund Structure. | [default to String]
**description** | **String** | An optional description for the Fund Structure. | [optional] [default to String]
**funds** | [**List&lt;Fund&gt;**](Fund.md) | An optional list of existing funds to be incorporated as part of the structure. | [optional] [default to List<Fund>]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Groups that can apply across a Fund Structure. A group may span the share classes of a member and the members that invest into it through dedicated share class links. | [optional] [default to List<AllocationGroup>]
**nodes** | [**List&lt;FundStructureNode&gt;**](FundStructureNode.md) | The list of nodes that make up the Fund Structure, each referencing a Fund and defining its role. May be empty on create, with members added later through the members endpoint. | [default to List<FundStructureNode>]
**edges** | [**List&lt;FundStructureEdge&gt;**](FundStructureEdge.md) | The list of edges that define how the members of the structure are linked: a member investing into a dedicated share class of another, or holding an equity, GP, LP or carry interest in another through an instrument. | [default to List<FundStructureEdge>]
**roleDataTypeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**navTypeCodes** | **List&lt;String&gt;** | The NAV types every member of the structure produces, by code. Declaring them once here gives the structure a shared Timeline. At least one is required, and every member fund must define a NAV type with each of these codes. | [optional] [default to List<String>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties to decorate onto the Fund Structure. | [optional] [default to Map<String, Property>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.FundStructure;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<Fund> Funds = new List<Fund>();
@jakarta.annotation.Nullable List<AllocationGroup> AllocationGroups = new List<AllocationGroup>();
List<FundStructureNode> Nodes = new List<FundStructureNode>();
List<FundStructureEdge> Edges = new List<FundStructureEdge>();
ResourceId RoleDataTypeId = new ResourceId();
@jakarta.annotation.Nullable List<String> NavTypeCodes = new List<String>();
Version Version = new Version();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


FundStructure fundStructureInstance = new FundStructure()
    .Href(Href)
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .Funds(Funds)
    .AllocationGroups(AllocationGroups)
    .Nodes(Nodes)
    .Edges(Edges)
    .RoleDataTypeId(RoleDataTypeId)
    .NavTypeCodes(NavTypeCodes)
    .Version(Version)
    .Properties(Properties)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
