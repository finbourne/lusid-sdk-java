# com.finbourne.lusid.model.UnsettledTransactionRevaluation
The transaction's total consideration in base currency, both at the rate it was booked at and revalued at the  valuation point's FX rate. Rates and amounts are null when they could not be resolved; Problems explains why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localCurrency** | **String** | The settlement currency of the transaction (the &#39;local&#39; currency for revaluation purposes). | [optional] [default to String]
**localAmount** | **java.math.BigDecimal** | The total consideration in the settlement currency, as booked. | [optional] [default to java.math.BigDecimal]
**baseCurrency** | **String** | The fund&#39;s base currency. | [optional] [default to String]
**baseFxRate** | **java.math.BigDecimal** | The FX rate from settlement currency to base currency at the time the transaction was booked. Null when no booked rate was recorded. | [optional] [default to java.math.BigDecimal]
**baseAmount** | **java.math.BigDecimal** | The total consideration in base currency at the booked FX rate. Null when the booked rate is unavailable. | [optional] [default to java.math.BigDecimal]
**revaluationFxRate** | **java.math.BigDecimal** | The FX rate from settlement currency to base currency at the valuation point&#39;s effective date. Null when the rate could not be resolved. | [optional] [default to java.math.BigDecimal]
**revaluedBaseAmount** | **java.math.BigDecimal** | The total consideration in base currency revalued at the valuation point&#39;s FX rate. Null when the revaluation rate is unavailable. | [optional] [default to java.math.BigDecimal]
**revaluationFxRateEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the quote used for the revaluation FX rate. Null for same-currency transactions or when the rate is missing. | [optional] [default to OffsetDateTime]
**status** | **String** | Whether revaluation succeeded (Revalued), was not needed (SameCurrency), or failed due to a missing FX rate (MissingFxRate). | [optional] [default to String]
**problems** | [**List&lt;RevaluationProblem&gt;**](RevaluationProblem.md) | Reasons why any of the amounts could not be populated. Empty when revaluation succeeded. | [optional] [default to List<RevaluationProblem>]
**counterLeg** | [**UnsettledTransactionCounterLegRevaluation**](UnsettledTransactionCounterLegRevaluation.md) |  | [optional] [default to UnsettledTransactionCounterLegRevaluation]

```java
import com.finbourne.lusid.model.UnsettledTransactionRevaluation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LocalCurrency = "example LocalCurrency";
java.math.BigDecimal LocalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal BaseFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal BaseAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RevaluationFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RevaluedBaseAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RevaluationFxRateEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable List<RevaluationProblem> Problems = new List<RevaluationProblem>();
UnsettledTransactionCounterLegRevaluation CounterLeg = new UnsettledTransactionCounterLegRevaluation();


UnsettledTransactionRevaluation unsettledTransactionRevaluationInstance = new UnsettledTransactionRevaluation()
    .LocalCurrency(LocalCurrency)
    .LocalAmount(LocalAmount)
    .BaseCurrency(BaseCurrency)
    .BaseFxRate(BaseFxRate)
    .BaseAmount(BaseAmount)
    .RevaluationFxRate(RevaluationFxRate)
    .RevaluedBaseAmount(RevaluedBaseAmount)
    .RevaluationFxRateEffectiveAt(RevaluationFxRateEffectiveAt)
    .Status(Status)
    .Problems(Problems)
    .CounterLeg(CounterLeg);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
