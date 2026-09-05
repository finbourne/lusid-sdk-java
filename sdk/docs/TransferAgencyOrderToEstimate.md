# com.finbourne.lusid.model.TransferAgencyOrderToEstimate
The values of an order to estimate, for an order that has not been saved yet or whose values are being  changed. Carries only what the estimate reads - it is not a whole order and cannot be used to create one.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentIdentifierType** | **String** |  | [default to String]
**instrumentIdentifier** | **String** |  | [default to String]
**instrumentScope** | **String** |  | [optional] [default to String]
**transactionCategory** | **String** | Available values: Subscription, Redemption, SwitchOut, SwitchIn, TransferOut, TransferIn. | [optional] [default to String]
**currency** | **String** |  | [default to String]
**quantity** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**exchangeRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TransferAgencyOrderToEstimate;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
String InstrumentIdentifierType = "example InstrumentIdentifierType";
String InstrumentIdentifier = "example InstrumentIdentifier";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String TransactionCategory = "example TransactionCategory";
String Currency = "example Currency";
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime TransactionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal ExchangeRate = new java.math.BigDecimal("100.00");


TransferAgencyOrderToEstimate transferAgencyOrderToEstimateInstance = new TransferAgencyOrderToEstimate()
    .PortfolioId(PortfolioId)
    .InstrumentIdentifierType(InstrumentIdentifierType)
    .InstrumentIdentifier(InstrumentIdentifier)
    .InstrumentScope(InstrumentScope)
    .TransactionCategory(TransactionCategory)
    .Currency(Currency)
    .Quantity(Quantity)
    .Amount(Amount)
    .Weight(Weight)
    .TransactionDate(TransactionDate)
    .ExchangeRate(ExchangeRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
