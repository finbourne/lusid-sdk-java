# com.finbourne.lusid.model.AllocationPostingLpLine
One instrument event a booking writes on an investor's commitment line.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the posting: the booking reference, investor record, commitment line, component and side. | [optional] [default to String]
**instrument** | **String** | The commitment-line instrument the event is written on. | [optional] [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**event** | **String** | The instrument event type written, for instance CapitalCallEvent. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount posted, in the event currency. | [optional] [default to java.math.BigDecimal]
**component** | **String** | The component of the event the posting carries. | [optional] [default to String]
**investorRecordId** | **String** | The investor record the posting is for. | [optional] [default to String]
**originMemberShortCode** | **String** | The member of the structure the component originates from, when it is not the map&#39;s own member. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationPostingLpLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Instrument = "example Instrument";
ResourceId Portfolio = new ResourceId();
@jakarta.annotation.Nullable String Event = "example Event";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Component = "example Component";
@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
@jakarta.annotation.Nullable String OriginMemberShortCode = "example OriginMemberShortCode";


AllocationPostingLpLine allocationPostingLpLineInstance = new AllocationPostingLpLine()
    .Id(Id)
    .Instrument(Instrument)
    .Portfolio(Portfolio)
    .Event(Event)
    .Amount(Amount)
    .Component(Component)
    .InvestorRecordId(InvestorRecordId)
    .OriginMemberShortCode(OriginMemberShortCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
