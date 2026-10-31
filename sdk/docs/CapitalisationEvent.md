# com.finbourne.lusid.model.CapitalisationEvent
Capitalisation (CAPI, AMI-SeCo SCoRE section 4.10): an increase in the current principal of a debt instrument  without an increase in its nominal value, normally from incorporating due but unpaid interest into the  principal. A notified CAPI on a ComplexBond, recording the factor before (previousFactor) and after  (nextFactor) the event. Mandatory and purely informational: it generates no cash flow, movements or  transactions. The capitalisation itself is booked by the bond's PikSchedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the next factor applies (:98A::EFFD). Required. | [optional] [default to OffsetDateTime]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The payment date (:98A::PAYD). Optional and informational; it may fall before effectiveDate. | [optional] [default to OffsetDateTime]
**recordDate** | [**OffsetDateTime**](OffsetDateTime.md) | The record date (:98A::RDTE). Optional and informational; when supplied it must not fall after  effectiveDate. | [optional] [default to OffsetDateTime]
**previousFactor** | **java.math.BigDecimal** | The factor, current principal per unit of nominal, in force before the event (:92A::PRFC). Optional, but  supplied together with nextFactor or not at all; greater than 0 when supplied. An event without the  factors is stored as economically incomplete. | [optional] [default to java.math.BigDecimal]
**nextFactor** | **java.math.BigDecimal** | The factor, current principal per unit of nominal, in force from effectiveDate (:92A::NWFC). Optional, but  supplied together with previousFactor or not at all; not less than previousFactor when supplied. | [optional] [default to java.math.BigDecimal]
**interestRate** | **java.math.BigDecimal** | The annual interest rate capitalised, as a fraction, so 6 per cent is 0.06 (:92A::INTP). Optional and  informational; not negative when supplied. | [optional] [default to java.math.BigDecimal]
**currency** | **String** | The currency of the capitalised principal (:11A::DENO). Optional and informational. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CapitalisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime RecordDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal PreviousFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NextFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal InterestRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";


CapitalisationEvent capitalisationEventInstance = new CapitalisationEvent()
    .EffectiveDate(EffectiveDate)
    .PaymentDate(PaymentDate)
    .RecordDate(RecordDate)
    .PreviousFactor(PreviousFactor)
    .NextFactor(NextFactor)
    .InterestRate(InterestRate)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
