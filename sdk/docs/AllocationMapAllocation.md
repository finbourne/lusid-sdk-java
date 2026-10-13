# com.finbourne.lusid.model.AllocationMapAllocation
One investor record's share of a resolved allocation event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record that receives the share. | [optional] [default to String]
**basisValue** | **java.math.BigDecimal** | The basis value the pro rata share was weighted by. Absent for a fixed or excluded investor record. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The fraction of the remainder the investor record receives, or the fixed fraction of the whole amount for a FixedPercentage exception. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount allocated to the investor record. | [optional] [default to java.math.BigDecimal]
**treatment** | **String** | How the share was found. Derived means pro rata from the basis; FixedPercentage means off the top from an exception; Excluded means an exception removed the investor record and it receives nothing. Available values: Derived, FixedPercentage, Excluded. | [optional] [default to String]
**commitmentLineId** | **String** | For a Commitment event, the commitment line the share is recorded against. Absent for other event types. | [optional] [default to String]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**component** | **String** | The component of the event the share belongs to. Absent when the event was resolved whole. | [optional] [default to String]
**originMemberShortCode** | **String** | The deal the share is for, when a capital call&#39;s use of proceeds split one component across deals. Absent when the component&#39;s own origin applies. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationMapAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
@jakarta.annotation.Nullable java.math.BigDecimal BasisValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Treatment = "example Treatment";
@jakarta.annotation.Nullable String CommitmentLineId = "example CommitmentLineId";
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String Component = "example Component";
@jakarta.annotation.Nullable String OriginMemberShortCode = "example OriginMemberShortCode";


AllocationMapAllocation allocationMapAllocationInstance = new AllocationMapAllocation()
    .InvestorRecordId(InvestorRecordId)
    .BasisValue(BasisValue)
    .Weight(Weight)
    .Amount(Amount)
    .Treatment(Treatment)
    .CommitmentLineId(CommitmentLineId)
    .PortfolioId(PortfolioId)
    .Component(Component)
    .OriginMemberShortCode(OriginMemberShortCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
