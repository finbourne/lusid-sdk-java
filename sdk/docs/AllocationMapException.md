# com.finbourne.lusid.model.AllocationMapException
A departure from the default participation of an Allocation Map for one investor record or one of its register lines.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the exception applies to. | [default to String]
**treatment** | **String** | What the exception does. Excluded removes the investor record from every allocation; FixedPercentage gives it participationPercent of each event off the top, before the remainder is shared pro rata between the other participants. Available values: Excluded, FixedPercentage. | [default to String]
**participationPercent** | **java.math.BigDecimal** | For a FixedPercentage exception, the fixed share as a fraction in the range (0, 1]. Not allowed on an Excluded exception. The fixed shares of all exceptions may not sum to more than 1. | [optional] [default to java.math.BigDecimal]
**reason** | **String** | Why the exception exists, for example a side letter or regulatory restriction. Required. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime from which the exception is in force. Defaults to always if not specified. | [optional] [default to OffsetDateTime]
**commitmentLineId** | **String** | The register line of the investor record the exception applies to, when it applies to one line rather than the record as a whole. The record&#39;s other lines take part as usual: an Excluded line&#39;s basis leaves the event&#39;s basis total, and a FixedPercentage line takes its fixed share off the top. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationMapException;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
String Treatment = "example Treatment";
@jakarta.annotation.Nullable java.math.BigDecimal ParticipationPercent = new java.math.BigDecimal("100.00");
String Reason = "example Reason";
@jakarta.annotation.Nullable OffsetDateTime EffectiveFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable String CommitmentLineId = "example CommitmentLineId";


AllocationMapException allocationMapExceptionInstance = new AllocationMapException()
    .InvestorRecordId(InvestorRecordId)
    .Treatment(Treatment)
    .ParticipationPercent(ParticipationPercent)
    .Reason(Reason)
    .EffectiveFrom(EffectiveFrom)
    .CommitmentLineId(CommitmentLineId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
