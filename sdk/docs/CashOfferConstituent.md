# com.finbourne.lusid.model.CashOfferConstituent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offerPrice** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**currency** | **String** |  | [default to String]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**minPieceSize** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**minIncrement** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CashOfferConstituent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal OfferPrice = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
OffsetDateTime SettlementDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal MinPieceSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MinIncrement = new java.math.BigDecimal("100.00");


CashOfferConstituent cashOfferConstituentInstance = new CashOfferConstituent()
    .OfferPrice(OfferPrice)
    .Currency(Currency)
    .SettlementDate(SettlementDate)
    .MinPieceSize(MinPieceSize)
    .MinIncrement(MinIncrement);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
