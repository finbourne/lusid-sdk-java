# com.finbourne.lusid.model.MixedLotConstituentsElection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** |  | [default to String]
**isDefault** | **Boolean** |  | [optional] [default to Boolean]
**isChosen** | **Boolean** |  | [optional] [default to Boolean]
**securitiesConstituents** | [**List&lt;SecurityOfferConstituent&gt;**](SecurityOfferConstituent.md) |  | [optional] [default to List<SecurityOfferConstituent>]
**cashConstituents** | [**List&lt;CashOfferConstituent&gt;**](CashOfferConstituent.md) |  | [optional] [default to List<CashOfferConstituent>]
**costFactor** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**consentFeePrice** | **java.math.BigDecimal** | Optional. The consent fee paid to holders who consent, on top of the exchange consideration. Quoted per 1,000 of face for bonds, using the current notional at the effective date of the event, and per unit for other instruments. Must be greater than 0. Required together with ConsentFeeCurrency, and only supported on an ExchangeOfferEvent. | [optional] [default to java.math.BigDecimal]
**consentFeeCurrency** | **String** | Optional. Currency of the consent fee. Required if a consent fee price is provided, and only supported on an ExchangeOfferEvent. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MixedLotConstituentsElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;
@jakarta.annotation.Nullable List<SecurityOfferConstituent> SecuritiesConstituents = new List<SecurityOfferConstituent>();
@jakarta.annotation.Nullable List<CashOfferConstituent> CashConstituents = new List<CashOfferConstituent>();
@jakarta.annotation.Nullable java.math.BigDecimal CostFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ConsentFeePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConsentFeeCurrency = "example ConsentFeeCurrency";


MixedLotConstituentsElection mixedLotConstituentsElectionInstance = new MixedLotConstituentsElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen)
    .SecuritiesConstituents(SecuritiesConstituents)
    .CashConstituents(CashConstituents)
    .CostFactor(CostFactor)
    .ConsentFeePrice(ConsentFeePrice)
    .ConsentFeeCurrency(ConsentFeeCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
