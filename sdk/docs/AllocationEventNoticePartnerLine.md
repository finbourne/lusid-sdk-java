# com.finbourne.lusid.model.AllocationEventNoticePartnerLine
One register line a notice's partner was allocated on: the line, the fund whose register holds it, the line's  commitment at the event date and the partner's share landing on it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitmentLineId** | **String** | The identifier of the register line. | [default to String]
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**commitment** | **java.math.BigDecimal** | The line&#39;s committed capital at the event date. | [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The partner&#39;s share of the event landing on the line, signed as the net amount due is. On a transfer, the committed capital moving on the line. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationEventNoticePartnerLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CommitmentLineId = "example CommitmentLineId";
ResourceId FundId = new ResourceId();
java.math.BigDecimal Commitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


AllocationEventNoticePartnerLine allocationEventNoticePartnerLineInstance = new AllocationEventNoticePartnerLine()
    .CommitmentLineId(CommitmentLineId)
    .FundId(FundId)
    .Commitment(Commitment)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
