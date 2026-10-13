# com.finbourne.lusid.model.AllocationEventDealFunding
The details of a DealFunding Allocation Event: the deal the vehicle funds, where the money came from and which  investor records are excused from it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealId** | **String** | The deal the vehicle funds. A later capital call names it in an Investment row of its use of proceeds. | [default to String]
**facilityId** | **String** | The subscription facility the funding was drawn from. Absent means the deal was paid from cash. | [optional] [default to String]
**excludedInvestorRecordIds** | **List&lt;String&gt;** | The investor records excused from the deal. They pay nothing towards it when it is called and the others take up their share. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.AllocationEventDealFunding;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DealId = "example DealId";
@jakarta.annotation.Nullable String FacilityId = "example FacilityId";
@jakarta.annotation.Nullable List<String> ExcludedInvestorRecordIds = new List<String>();


AllocationEventDealFunding allocationEventDealFundingInstance = new AllocationEventDealFunding()
    .DealId(DealId)
    .FacilityId(FacilityId)
    .ExcludedInvestorRecordIds(ExcludedInvestorRecordIds);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
