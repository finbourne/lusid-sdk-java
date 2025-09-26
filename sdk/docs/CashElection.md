# com.finbourne.lusid.model.CashElection
Cash election for Events that result in a cash payment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**electionKey** | **String** | Unique key used to identify this election. | [default to String]
**exchangeRate** | **java.math.BigDecimal** | The exchange rate if this is not the declared CashElection. Defaults to 1 if Election is Declared. | [optional] [default to java.math.BigDecimal]
**dividendRate** | **java.math.BigDecimal** | The payment rate for this CashElection. | [optional] [default to java.math.BigDecimal]
**isChosen** | **Boolean** | Has this election been chosen. Only one Election may be Chosen per Event. | [optional] [default to Boolean]
**isDeclared** | **Boolean** | Is this the declared CashElection. Only one Election may be Declared per Event. | [optional] [default to Boolean]
**isDefault** | **Boolean** | Is this election the default. Only one Election may be Default per Event | [optional] [default to Boolean]
**dividendCurrency** | **String** | The payment currency for this CashElection. | [default to String]

```java
import com.finbourne.lusid.model.CashElection;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ElectionKey = "example ElectionKey";
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DividendRate = new java.math.BigDecimal("100.00");
Boolean IsChosen = true;
Boolean IsDeclared = true;
Boolean IsDefault = true;
String DividendCurrency = "example DividendCurrency";


CashElection cashElectionInstance = new CashElection()
    .ElectionKey(ElectionKey)
    .ExchangeRate(ExchangeRate)
    .DividendRate(DividendRate)
    .IsChosen(IsChosen)
    .IsDeclared(IsDeclared)
    .IsDefault(IsDefault)
    .DividendCurrency(DividendCurrency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
