# com.finbourne.lusid.model.FutureMarkToMarketEvent
Definition of a Future Mark to Market Event.  Represents 'Mark to Market' daily settlement of Future instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the mark to market event. | [optional] [default to OffsetDateTime]
**settlementCurrency** | **String** | The currency in which the Future contract is paid. | [default to String]
**notionalAmountPerUnit** | **java.math.BigDecimal** | The notional value of the contract on the effective date. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FutureMarkToMarketEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
String SettlementCurrency = "example SettlementCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal NotionalAmountPerUnit = new java.math.BigDecimal("100.00");


FutureMarkToMarketEvent futureMarkToMarketEventInstance = new FutureMarkToMarketEvent()
    .EffectiveDate(EffectiveDate)
    .SettlementCurrency(SettlementCurrency)
    .NotionalAmountPerUnit(NotionalAmountPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
