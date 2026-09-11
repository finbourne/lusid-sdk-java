# com.finbourne.lusid.model.ConsentAndTenderElection
Election to both grant consent and tender the holding (CTEN), optionally for a tender offer price and consent fee.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**tenderOfferPrice** | **java.math.BigDecimal** | Optional. Price per unit offered for the tendered holding. | [optional] [default to java.math.BigDecimal]
**tenderOfferCurrency** | **String** | Optional. Currency of the tender offer. Required if a tender offer price is provided. | [optional] [default to String]
**consentFeePrice** | **java.math.BigDecimal** | Optional. The consent fee paid per unit for granting consent. | [optional] [default to java.math.BigDecimal]
**consentFeeCurrency** | **String** | Optional. Currency of the consent fee. Required if a consent fee price is provided. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ConsentAndTenderElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
Boolean IsDefault = true;
Boolean IsChosen = true;
@jakarta.annotation.Nullable java.math.BigDecimal TenderOfferPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String TenderOfferCurrency = "example TenderOfferCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal ConsentFeePrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ConsentFeeCurrency = "example ConsentFeeCurrency";


ConsentAndTenderElection consentAndTenderElectionInstance = new ConsentAndTenderElection()
    .ElectionKey(ElectionKey)
    .IsDefault(IsDefault)
    .IsChosen(IsChosen)
    .TenderOfferPrice(TenderOfferPrice)
    .TenderOfferCurrency(TenderOfferCurrency)
    .ConsentFeePrice(ConsentFeePrice)
    .ConsentFeeCurrency(ConsentFeeCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
