# com.finbourne.lusid.model.TenderOfferElection
Election for events that result in cash via a merger or acquisition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenderOfferCurrency** | **String** | Currency of the cash offer | [default to String]
**tenderOfferPrice** | **java.math.BigDecimal** | Price per share of the cash offer | [default to java.math.BigDecimal]
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The date this option pays. On RepurchaseOfferEvent it sets the settlement date of this  option&#39;s transactions; when omitted, the event-level date applies. Not supported on other events. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.TenderOfferElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String TenderOfferCurrency = "example TenderOfferCurrency";
java.math.BigDecimal TenderOfferPrice = new java.math.BigDecimal("100.00");
String ElectionKey = "example ElectionKey";
Boolean IsChosen = true;
Boolean IsDefault = true;
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();


TenderOfferElection tenderOfferElectionInstance = new TenderOfferElection()
    .TenderOfferCurrency(TenderOfferCurrency)
    .TenderOfferPrice(TenderOfferPrice)
    .ElectionKey(ElectionKey)
    .IsChosen(IsChosen)
    .IsDefault(IsDefault)
    .PaymentDate(PaymentDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
