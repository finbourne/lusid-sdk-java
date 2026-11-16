# com.finbourne.lusid.model.TaxFundReconciliationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**companyTotal** | **java.math.BigDecimal** | The company-level total of lines A, D and LR. | [optional] [default to java.math.BigDecimal]
**sumOfFundProxies** | **java.math.BigDecimal** | The sum of the member funds&#39; notional totals. | [optional] [default to java.math.BigDecimal]
**differences** | [**List&lt;TaxReconciliationDifferenceRow&gt;**](TaxReconciliationDifferenceRow.md) | The explained differences between the two sides, by holding. | [optional] [default to List<TaxReconciliationDifferenceRow>]
**unexplained** | **java.math.BigDecimal** | The part of the difference not explained by any category. Nil when the reconciliation is complete. | [optional] [default to java.math.BigDecimal]
**companyLineD** | **java.math.BigDecimal** | Line D at company level. | [optional] [default to java.math.BigDecimal]
**fundsLineD** | **java.math.BigDecimal** | The sum of line D across the member funds. | [optional] [default to java.math.BigDecimal]
**companyLineLR** | **java.math.BigDecimal** | Line LR at company level. | [optional] [default to java.math.BigDecimal]
**fundsLineLR** | **java.math.BigDecimal** | The sum of line LR across the member funds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxFundReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
TaxAccountingPeriod Period = new TaxAccountingPeriod();
java.math.BigDecimal CompanyTotal = new java.math.BigDecimal("100.00");
java.math.BigDecimal SumOfFundProxies = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxReconciliationDifferenceRow> Differences = new List<TaxReconciliationDifferenceRow>();
java.math.BigDecimal Unexplained = new java.math.BigDecimal("100.00");
java.math.BigDecimal CompanyLineD = new java.math.BigDecimal("100.00");
java.math.BigDecimal FundsLineD = new java.math.BigDecimal("100.00");
java.math.BigDecimal CompanyLineLR = new java.math.BigDecimal("100.00");
java.math.BigDecimal FundsLineLR = new java.math.BigDecimal("100.00");


TaxFundReconciliationResponse taxFundReconciliationResponseInstance = new TaxFundReconciliationResponse()
    .FundId(FundId)
    .Period(Period)
    .CompanyTotal(CompanyTotal)
    .SumOfFundProxies(SumOfFundProxies)
    .Differences(Differences)
    .Unexplained(Unexplained)
    .CompanyLineD(CompanyLineD)
    .FundsLineD(FundsLineD)
    .CompanyLineLR(CompanyLineLR)
    .FundsLineLR(FundsLineLR);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
