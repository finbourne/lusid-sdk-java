# com.finbourne.lusid.model.UnsettledTransactionCounterLegRevaluation
The receiving (counter) leg of an FX forward revalued into the fund's base currency at the valuation point's  FX rates. Populated only for FX forward transactions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**localCurrency** | **String** | The currency of the FX forward&#39;s receiving (counter) leg. | [optional] [default to String]
**localAmount** | **java.math.BigDecimal** | The amount of the receiving leg in its own currency. | [optional] [default to java.math.BigDecimal]
**baseCurrency** | **String** | The fund&#39;s base currency. | [optional] [default to String]
**bookedBaseAmount** | **java.math.BigDecimal** | The receiving leg amount in base currency at the rate booked on the transaction. Null when no booked rate was recorded. | [optional] [default to java.math.BigDecimal]
**revaluationFxRate** | **java.math.BigDecimal** | The FX rate from the counter-leg currency to base currency at the valuation point&#39;s effective date. Null when the rate could not be resolved. | [optional] [default to java.math.BigDecimal]
**revaluedBaseAmount** | **java.math.BigDecimal** | The receiving leg amount in base currency revalued at the valuation point&#39;s FX rate. Null when the revaluation rate is unavailable. | [optional] [default to java.math.BigDecimal]
**revaluationFxRateEffectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date of the quote used for the counter-leg revaluation FX rate. Null for same-currency legs or when the rate is missing. | [optional] [default to OffsetDateTime]
**status** | **String** | Whether counter-leg revaluation succeeded (Revalued), was not needed (SameCurrency), or failed due to a missing FX rate (MissingFxRate). | [optional] [default to String]
**problems** | [**List&lt;RevaluationProblem&gt;**](RevaluationProblem.md) | Reasons why any counter-leg amounts could not be populated. Empty when revaluation succeeded. | [optional] [default to List<RevaluationProblem>]

```java
import com.finbourne.lusid.model.UnsettledTransactionCounterLegRevaluation;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String LocalCurrency = "example LocalCurrency";
java.math.BigDecimal LocalAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable java.math.BigDecimal BookedBaseAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RevaluationFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RevaluedBaseAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime RevaluationFxRateEffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable List<RevaluationProblem> Problems = new List<RevaluationProblem>();


UnsettledTransactionCounterLegRevaluation unsettledTransactionCounterLegRevaluationInstance = new UnsettledTransactionCounterLegRevaluation()
    .LocalCurrency(LocalCurrency)
    .LocalAmount(LocalAmount)
    .BaseCurrency(BaseCurrency)
    .BookedBaseAmount(BookedBaseAmount)
    .RevaluationFxRate(RevaluationFxRate)
    .RevaluedBaseAmount(RevaluedBaseAmount)
    .RevaluationFxRateEffectiveAt(RevaluationFxRateEffectiveAt)
    .Status(Status)
    .Problems(Problems);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
