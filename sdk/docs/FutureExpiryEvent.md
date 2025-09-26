# com.finbourne.lusid.model.FutureExpiryEvent
Definition of a Future Expiry Event.  This is an event that describes the expiry of a Future instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | Expiry date of the Future instrument. | [optional] [default to OffsetDateTime]
**settlementCurrency** | **String** | Settlement currency of the Future instrument. | [default to String]
**notionalAmountPerUnit** | **java.math.BigDecimal** | The notional amount of each unit in the Future instrument. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FutureExpiryEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime ExpiryDate = OffsetDateTime.now();
String SettlementCurrency = "example SettlementCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal NotionalAmountPerUnit = new java.math.BigDecimal("100.00");


FutureExpiryEvent futureExpiryEventInstance = new FutureExpiryEvent()
    .ExpiryDate(ExpiryDate)
    .SettlementCurrency(SettlementCurrency)
    .NotionalAmountPerUnit(NotionalAmountPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
