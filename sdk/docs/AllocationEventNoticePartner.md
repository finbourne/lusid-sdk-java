# com.finbourne.lusid.model.AllocationEventNoticePartner
The partner a notice is addressed to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record identifier of the partner. | [default to String]
**displayName** | **String** | The display name of the partner. | [optional] [default to String]
**commitment** | **java.math.BigDecimal** | The partner&#39;s committed capital on the fund the event allocates over at the event date, summed over the lines the event allocates to there; for a partner looked through to, its line on the feeder. Never the partner&#39;s total across funds. | [default to java.math.BigDecimal]
**lines** | [**List&lt;AllocationEventNoticePartnerLine&gt;**](AllocationEventNoticePartnerLine.md) | The register lines the partner was allocated on, one per line, each with the fund whose register holds it, its commitment at the event date and the partner&#39;s share landing on it. The shares sum to the net amount due before tax withheld. | [optional] [default to List<AllocationEventNoticePartnerLine>]

```java
import com.finbourne.lusid.model.AllocationEventNoticePartner;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
java.math.BigDecimal Commitment = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<AllocationEventNoticePartnerLine> Lines = new List<AllocationEventNoticePartnerLine>();


AllocationEventNoticePartner allocationEventNoticePartnerInstance = new AllocationEventNoticePartner()
    .InvestorRecordId(InvestorRecordId)
    .DisplayName(DisplayName)
    .Commitment(Commitment)
    .Lines(Lines);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
