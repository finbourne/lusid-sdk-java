# com.finbourne.lusid.model.CashOfferElection
Election for events that result in cash via a merger or acquisition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashOfferCurrency** | **String** | Currency of the cash offer | [default to String]
**cashOfferPrice** | **java.math.BigDecimal** | Price per share of the cash offer | [default to java.math.BigDecimal]
**electionKey** | **String** | Unique key associated to this election. | [default to String]
**isChosen** | **Boolean** | Is this the election that has been explicitly chosen from multiple options. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election automatically applied in the absence of an election having been made.  May only be true for one election if multiple are provided. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CashOfferElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String CashOfferCurrency = "example CashOfferCurrency";
java.math.BigDecimal CashOfferPrice = new java.math.BigDecimal("100.00");
String ElectionKey = "example ElectionKey";
Boolean IsChosen = true;
Boolean IsDefault = true;


CashOfferElection cashOfferElectionInstance = new CashOfferElection()
    .CashOfferCurrency(CashOfferCurrency)
    .CashOfferPrice(CashOfferPrice)
    .ElectionKey(ElectionKey)
    .IsChosen(IsChosen)
    .IsDefault(IsDefault);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
