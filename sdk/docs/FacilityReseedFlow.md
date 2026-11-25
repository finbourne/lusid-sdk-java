# com.finbourne.lusid.model.FacilityReseedFlow
A draw or repayment booked on a Facility, as a re-seed reads it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event** | **String** | The event that booked the draw or repayment. | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the draw or repayment takes effect. | [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount drawn or repaid. | [default to java.math.BigDecimal]
**currency** | **String** | The currency the amount was booked in. | [default to String]
**isDraw** | **Boolean** | Whether the flow draws the Facility rather than repaying it. | [default to Boolean]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**structureMemberId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**reason** | **String** | Why the flow cannot be attributed to the Fund: its allocation map&#39;s structureMemberId is not the map&#39;s member fund. Present for an unattributable flow. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FacilityReseedFlow;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Event = "example Event";
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
Boolean IsDraw = true;
ResourceId AllocationMapId = new ResourceId();
ResourceId StructureMemberId = new ResourceId();
@jakarta.annotation.Nullable String Reason = "example Reason";


FacilityReseedFlow facilityReseedFlowInstance = new FacilityReseedFlow()
    .Event(Event)
    .Date(Date)
    .Amount(Amount)
    .Currency(Currency)
    .IsDraw(IsDraw)
    .AllocationMapId(AllocationMapId)
    .StructureMemberId(StructureMemberId)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
