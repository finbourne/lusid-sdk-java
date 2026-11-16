# com.finbourne.lusid.model.TaxFundReconciliationHoldingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**companyAmount** | **java.math.BigDecimal** | The company-level amount for the holding. | [optional] [default to java.math.BigDecimal]
**fundProxies** | [**List&lt;TaxFundReconciliationProxyRow&gt;**](TaxFundReconciliationProxyRow.md) | The member funds&#39; notional figures for the holding. | [optional] [default to List<TaxFundReconciliationProxyRow>]
**difference** | **java.math.BigDecimal** | The difference between the two sides. | [optional] [default to java.math.BigDecimal]
**category** | **String** | The reconciliation category of the difference, when there is one. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. | [optional] [default to String]
**explanation** | **String** | The explanation of the difference. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxFundReconciliationHoldingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
TaxAccountingPeriod Period = new TaxAccountingPeriod();
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
java.math.BigDecimal CompanyAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxFundReconciliationProxyRow> FundProxies = new List<TaxFundReconciliationProxyRow>();
java.math.BigDecimal Difference = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Category = "example Category";
@jakarta.annotation.Nullable String Explanation = "example Explanation";


TaxFundReconciliationHoldingResponse taxFundReconciliationHoldingResponseInstance = new TaxFundReconciliationHoldingResponse()
    .FundId(FundId)
    .Period(Period)
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .CompanyAmount(CompanyAmount)
    .FundProxies(FundProxies)
    .Difference(Difference)
    .Category(Category)
    .Explanation(Explanation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
