# com.finbourne.lusid.model.TransferAgencyOrderEstimateResult
The estimated values for one order, together with the market facts they were struck from. The market facts  are repeated on every order priced against the same share class so that each result stands alone.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**mostRecentValuationDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**pricePerShare** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**priceCurrency** | **String** |  | [optional] [default to String]
**estimatedUnits** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**estimatedAmount** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**estimatedAmountCurrency** | **String** |  | [optional] [default to String]
**fxRateUsed** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TransferAgencyOrderEstimateResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
OffsetDateTime MostRecentValuationDate = OffsetDateTime.now();
java.math.BigDecimal PricePerShare = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String PriceCurrency = "example PriceCurrency";
java.math.BigDecimal EstimatedUnits = new java.math.BigDecimal("100.00");
java.math.BigDecimal EstimatedAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String EstimatedAmountCurrency = "example EstimatedAmountCurrency";
java.math.BigDecimal FxRateUsed = new java.math.BigDecimal("100.00");


TransferAgencyOrderEstimateResult transferAgencyOrderEstimateResultInstance = new TransferAgencyOrderEstimateResult()
    .OrderId(OrderId)
    .MostRecentValuationDate(MostRecentValuationDate)
    .PricePerShare(PricePerShare)
    .PriceCurrency(PriceCurrency)
    .EstimatedUnits(EstimatedUnits)
    .EstimatedAmount(EstimatedAmount)
    .EstimatedAmountCurrency(EstimatedAmountCurrency)
    .FxRateUsed(FxRateUsed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
