# com.finbourne.lusid.model.AllocationPaymentHold
A hold placed on a partner's payment against an allocation event, blocking receipt until it is released  by a second user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationEventId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record identifier of the partner whose payment is held. | [default to String]
**status** | **String** | The hold status: Blocked, Escrow or Released. | [default to String]
**reason** | **String** | The reason for the hold. | [optional] [default to String]
**reference** | **String** | An external reference for the hold, such as a compliance case number. | [optional] [default to String]
**placedBy** | **String** | The user who placed the hold. | [default to String]
**placedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the hold was placed. | [default to OffsetDateTime]
**releasedBy** | **String** | The user who released the hold, or null while it is active. | [optional] [default to String]
**releasedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the hold was released, or null while it is active. | [optional] [default to OffsetDateTime]
**active** | **Boolean** | Whether the hold is currently blocking receipt of the partner&#39;s payment. | [default to Boolean]

```java
import com.finbourne.lusid.model.AllocationPaymentHold;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId AllocationEventId = new ResourceId();
String InvestorRecordId = "example InvestorRecordId";
String Status = "example Status";
@jakarta.annotation.Nullable String Reason = "example Reason";
@jakarta.annotation.Nullable String Reference = "example Reference";
String PlacedBy = "example PlacedBy";
OffsetDateTime PlacedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String ReleasedBy = "example ReleasedBy";
@jakarta.annotation.Nullable OffsetDateTime ReleasedAt = OffsetDateTime.now();
Boolean Active = true;


AllocationPaymentHold allocationPaymentHoldInstance = new AllocationPaymentHold()
    .AllocationEventId(AllocationEventId)
    .InvestorRecordId(InvestorRecordId)
    .Status(Status)
    .Reason(Reason)
    .Reference(Reference)
    .PlacedBy(PlacedBy)
    .PlacedAt(PlacedAt)
    .ReleasedBy(ReleasedBy)
    .ReleasedAt(ReleasedAt)
    .Active(Active);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
