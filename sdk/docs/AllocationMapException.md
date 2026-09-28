# com.finbourne.lusid.model.AllocationMapException
A departure from the default participation of an Allocation Map for one investor record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the exception applies to. | [default to String]
**treatment** | **String** | What the exception does. Excluded removes the investor record from every allocation; FixedPercentage gives it participationPercent of each event off the top, before the remainder is shared pro rata between the other participants. Available values: Excluded, FixedPercentage. | [default to String]
**participationPercent** | **java.math.BigDecimal** | For a FixedPercentage exception, the fixed share as a fraction in the range (0, 1]. Not allowed on an Excluded exception. The fixed shares of all exceptions may not sum to more than 1. | [optional] [default to java.math.BigDecimal]
**reason** | **String** | Why the exception exists, for example a side letter or regulatory restriction. Required. | [default to String]
**effectiveFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The datetime from which the exception is in force. Defaults to always if not specified. | [optional] [default to OffsetDateTime]

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


AllocationMapException allocationMapExceptionInstance = new AllocationMapException()
    .InvestorRecordId(InvestorRecordId)
    .Treatment(Treatment)
    .ParticipationPercent(ParticipationPercent)
    .Reason(Reason)
    .EffectiveFrom(EffectiveFrom);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
