# com.finbourne.lusid.model.AllocationMapRequest
The request used to create or update an Allocation Map.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Allocation Map. | [default to String]
**name** | **String** | The display name of the Allocation Map. | [default to String]
**description** | **String** | An optional description for the Allocation Map. | [optional] [default to String]
**structureMemberId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**inheritsFrom** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**participants** | [**AllocationMapParticipants**](AllocationMapParticipants.md) |  | [optional] [default to AllocationMapParticipants]
**basisByEventType** | [**List&lt;AllocationMapEventBasis&gt;**](AllocationMapEventBasis.md) | The basis on which each kind of allocation event is shared between the participants. At most one entry per event type and component; an entry without a component is the default for the event type. | [optional] [default to List<AllocationMapEventBasis>]
**roundingPartnerLine** | **String** | The investor record that takes every minor unit left over when the shares of an event are rounded. Absent means the leftover is spread one minor unit at a time over the largest remainders. | [optional] [default to String]
**ilpaTransactionTypes** | [**List&lt;AllocationMapIlpaTransactionType&gt;**](AllocationMapIlpaTransactionType.md) | The ILPA transaction types the map reports particular kinds of allocation event under, where they differ from the default for the event type and component. At most one entry per event type and component; an entry without a component is the default for the event type. Every value must be one the system IlpaTransactionType data type lists. | [optional] [default to List<AllocationMapIlpaTransactionType>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the Allocation Map applies. Defaults to the beginning of time if not specified, so that the map is visible at every effective datetime. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AllocationMapRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
ResourceId StructureMemberId = new ResourceId();
ResourceId InheritsFrom = new ResourceId();
AllocationMapParticipants Participants = new AllocationMapParticipants();
@jakarta.annotation.Nullable List<AllocationMapEventBasis> BasisByEventType = new List<AllocationMapEventBasis>();
@jakarta.annotation.Nullable String RoundingPartnerLine = "example RoundingPartnerLine";
@jakarta.annotation.Nullable List<AllocationMapIlpaTransactionType> IlpaTransactionTypes = new List<AllocationMapIlpaTransactionType>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();


AllocationMapRequest allocationMapRequestInstance = new AllocationMapRequest()
    .Code(Code)
    .Name(Name)
    .Description(Description)
    .StructureMemberId(StructureMemberId)
    .InheritsFrom(InheritsFrom)
    .Participants(Participants)
    .BasisByEventType(BasisByEventType)
    .RoundingPartnerLine(RoundingPartnerLine)
    .IlpaTransactionTypes(IlpaTransactionTypes)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
