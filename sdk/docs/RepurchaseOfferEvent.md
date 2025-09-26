# com.finbourne.lusid.model.RepurchaseOfferEvent
Representation of a repurchase offer corporate action.  Represents an offer by the issuer to repurchase its own shares from a shareholder at a given price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Payment date of the event. | [optional] [default to OffsetDateTime]
**marketDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date set by the issuer or by an agent of the issuer as the latest date to respond to the offer. Must be before or equal to the PaymentDate. | [optional] [default to OffsetDateTime]
**repurchaseQuantity** | **java.math.BigDecimal** | Quantity of the security to be repurchased. | [default to java.math.BigDecimal]
**cashOfferElections** | [**List&lt;CashOfferElection&gt;**](CashOfferElection.md) | List of possible CashOfferElections for this event. Only 1 should be provided. | [default to List<CashOfferElection>]
**lapseElections** | [**List&lt;LapseElection&gt;**](LapseElection.md) | List of possible LapseElections for this event. Only 1 should be provided.  Allows the user to opt out of the offer. | [default to List<LapseElection>]
**tenderOfferElections** | [**List&lt;TenderOfferElection&gt;**](TenderOfferElection.md) | List of possible TenderOfferElections for this event. Only 1 should be provided. | [default to List<TenderOfferElection>]
**prorationRate** | **java.math.BigDecimal** | The fraction used to calculate a proportional adjustment for RepurchaseQuantity when a full period is not used.  Defaults to 1 if not set. Must be greater than 0 and less than or equal to 1. | [optional] [default to java.math.BigDecimal]
**responseDeadlineDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date set by the account servicer as the latest date to respond to the offer.  Optional. If set, must be before or equal to MarketDeadlineDate.  Defaults to MarketDeadlineDate if not set. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.RepurchaseOfferEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PaymentDate = OffsetDateTime.now();
OffsetDateTime MarketDeadlineDate = OffsetDateTime.now();
java.math.BigDecimal RepurchaseQuantity = new java.math.BigDecimal("100.00");
List<CashOfferElection> CashOfferElections = new List<CashOfferElection>();
List<LapseElection> LapseElections = new List<LapseElection>();
List<TenderOfferElection> TenderOfferElections = new List<TenderOfferElection>();
java.math.BigDecimal ProrationRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime ResponseDeadlineDate = OffsetDateTime.now();


RepurchaseOfferEvent repurchaseOfferEventInstance = new RepurchaseOfferEvent()
    .PaymentDate(PaymentDate)
    .MarketDeadlineDate(MarketDeadlineDate)
    .RepurchaseQuantity(RepurchaseQuantity)
    .CashOfferElections(CashOfferElections)
    .LapseElections(LapseElections)
    .TenderOfferElections(TenderOfferElections)
    .ProrationRate(ProrationRate)
    .ResponseDeadlineDate(ResponseDeadlineDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
