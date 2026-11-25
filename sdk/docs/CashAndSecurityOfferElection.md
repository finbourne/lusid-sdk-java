# com.finbourne.lusid.model.CashAndSecurityOfferElection
Election for events that result in both cash and equity via a merger or acquisition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashOfferCurrency** | **String** | Currency of the cash offer | [default to String]
**cashOfferPrice** | **java.math.BigDecimal** | Price per share of the cash offer | [default to java.math.BigDecimal]
**costFactor** | **java.math.BigDecimal** | Optional. The fraction of cost that is transferred from the existing shares to the new shares. | [optional] [default to java.math.BigDecimal]
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**consentFeePrice** | **java.math.BigDecimal** | Optional. The consent fee paid to holders who consent, on top of the exchange consideration. Quoted per 1,000 of face for bonds, using the current notional at the effective date of the event, and per unit for other instruments. Must be greater than 0. Required together with ConsentFeeCurrency, and only supported on an ExchangeOfferEvent. | [optional] [default to java.math.BigDecimal]
**consentFeeCurrency** | **String** | Optional. Currency of the consent fee. Required if a consent fee price is provided, and only supported on an ExchangeOfferEvent. | [optional] [default to String]
**paymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The date this option pays, for both its cash and its security. On MergerEvent,  RepurchaseOfferEvent and ExchangeOfferEvent it sets the settlement date of this option&#39;s transactions;  when omitted, the event-level date applies. Not supported on other events. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CashAndSecurityOfferElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CashOfferCurrency = "example CashOfferCurrency";
java.math.BigDecimal CashOfferPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");
String ElectionKey = "example ElectionKey";
Boolean IsChosen = true;
Boolean IsDefault = true;
UnitsRatio UnitsRatio = new UnitsRatio();
@jakarta.annotation.Nullable java.math.BigDecimal ConsentFeePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConsentFeeCurrency = "example ConsentFeeCurrency";
@jakarta.annotation.Nullable OffsetDateTime PaymentDate = OffsetDateTime.now();


CashAndSecurityOfferElection cashAndSecurityOfferElectionInstance = new CashAndSecurityOfferElection()
    .CashOfferCurrency(CashOfferCurrency)
    .CashOfferPrice(CashOfferPrice)
    .CostFactor(CostFactor)
    .ElectionKey(ElectionKey)
    .IsChosen(IsChosen)
    .IsDefault(IsDefault)
    .UnitsRatio(UnitsRatio)
    .ConsentFeePrice(ConsentFeePrice)
    .ConsentFeeCurrency(ConsentFeeCurrency)
    .PaymentDate(PaymentDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
