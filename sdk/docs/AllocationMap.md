# com.finbourne.lusid.model.AllocationMap
The rules that say which investor records share in the economics of a member of a Fund Structure, and on what basis.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**name** | **String** | The display name of the Allocation Map. | [default to String]
**description** | **String** | An optional description for the Allocation Map. | [optional] [default to String]
**structureMemberId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**inheritsFrom** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**participants** | [**AllocationMapParticipants**](AllocationMapParticipants.md) |  | [default to AllocationMapParticipants]
**basisByEventType** | [**List&lt;AllocationMapEventBasis&gt;**](AllocationMapEventBasis.md) | The basis on which each kind of allocation event is shared between the participants. At most one entry per event type. | [default to List<AllocationMapEventBasis>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AllocationMap;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId StructureMemberId = new ResourceId();
ResourceId InheritsFrom = new ResourceId();
AllocationMapParticipants Participants = new AllocationMapParticipants();
List<AllocationMapEventBasis> BasisByEventType = new List<AllocationMapEventBasis>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AllocationMap allocationMapInstance = new AllocationMap()
    .Href(Href)
    .Id(Id)
    .Name(Name)
    .Description(Description)
    .StructureMemberId(StructureMemberId)
    .InheritsFrom(InheritsFrom)
    .Participants(Participants)
    .BasisByEventType(BasisByEventType)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
