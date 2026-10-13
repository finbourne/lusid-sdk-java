# com.finbourne.lusid.model.AllocationEventUseOfProceeds
One row of a CapitalCall Allocation Event's use of proceeds: what part of the call pays for what.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purpose** | **String** | What the row pays for: Investment, FacilityRepayment, FacilityInterest, ManagementFee or Expenses. Available values: Investment, FacilityRepayment, FacilityInterest, ManagementFee, Expenses. | [default to String]
**dealId** | **String** | The deal the row funds, or whose facility draw it repays. Required for an Investment row. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The part of the call the row takes, in the event currency. Greater than zero. | [default to java.math.BigDecimal]
**facilityId** | **String** | The facility the row repays. Required for a FacilityRepayment row; on an Investment row it is filled in from the deal&#39;s funding when the call is computed. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventUseOfProceeds;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Purpose = "example Purpose";
@jakarta.annotation.Nullable String DealId = "example DealId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String FacilityId = "example FacilityId";


AllocationEventUseOfProceeds allocationEventUseOfProceedsInstance = new AllocationEventUseOfProceeds()
    .Purpose(Purpose)
    .DealId(DealId)
    .Amount(Amount)
    .FacilityId(FacilityId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
