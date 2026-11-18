# com.finbourne.lusid.model.ConsentAndExchangeElection
Election to both grant consent and exchange the holding (CEXC), at a given units ratio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**unitsRatio** | [**UnitsRatio**](UnitsRatio.md) |  | [default to UnitsRatio]
**consentFeePrice** | **java.math.BigDecimal** | Optional. The consent fee paid to holders who consent, on top of the exchange consideration. Quoted per 1,000 of face for bonds, using the current notional at the effective date of the event, and per unit for other instruments. Must be greater than 0. Required together with ConsentFeeCurrency, and only supported on an ExchangeOfferEvent. | [optional] [default to java.math.BigDecimal]
**consentFeeCurrency** | **String** | Optional. Currency of the consent fee. Required if a consent fee price is provided, and only supported on an ExchangeOfferEvent. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ConsentAndExchangeElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;
UnitsRatio UnitsRatio = new UnitsRatio();
@jakarta.annotation.Nullable java.math.BigDecimal ConsentFeePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConsentFeeCurrency = "example ConsentFeeCurrency";


ConsentAndExchangeElection consentAndExchangeElectionInstance = new ConsentAndExchangeElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen)
    .UnitsRatio(UnitsRatio)
    .ConsentFeePrice(ConsentFeePrice)
    .ConsentFeeCurrency(ConsentFeeCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
