# com.finbourne.lusid.model.AmortisationEvent
Definition of an Amortisation event.  This is an event that describes the occurence of amortisation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountReduced** | **java.math.BigDecimal** | The amount reduced in this amortisation event.  That is, the difference between the previous notional amount and the current notional amount as set in this event. | [default to java.math.BigDecimal]
**domCcy** | **String** | Domestic currency of the originating instrument | [default to String]
**payReceive** | **String** | Is this event in relation to the Pay or Receive leg | [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the principal payment is to be made. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AmortisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal AmountReduced = new java.math.BigDecimal("100.00");
String DomCcy = "example DomCcy";
String PayReceive = "example PayReceive";
OffsetDateTime PaymentDate = OffsetDateTime.now();


AmortisationEvent amortisationEventInstance = new AmortisationEvent()
    .AmountReduced(AmountReduced)
    .DomCcy(DomCcy)
    .PayReceive(PayReceive)
    .PaymentDate(PaymentDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
