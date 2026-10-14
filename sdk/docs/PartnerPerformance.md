# com.finbourne.lusid.model.PartnerPerformance
The ILPA performance measures for one partner, or for the fund as a whole: paid-in to commitment, the  distribution, residual value and total value multiples, and the net IRR, together with the cash flows the IRR  was solved from. When the fund financed deals through a subscription facility, the measures are also given  with the facility-funded calls re-dated to when the deals were actually funded.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**investorRecordId** | **String** | The investor record identifier of the partner, or null when the figures are for the fund as a whole. | [optional] [default to String]
**currency** | **String** | The currency the cash flows and residual value are expressed in. | [default to String]
**commitment** | **java.math.BigDecimal** | The total commitment the paid-in-capital ratio is measured against. | [default to java.math.BigDecimal]
**paidIn** | **java.math.BigDecimal** | The contributions paid in to the fund. | [default to java.math.BigDecimal]
**distributed** | **java.math.BigDecimal** | The distributions paid out of the fund. | [default to java.math.BigDecimal]
**pic** | **java.math.BigDecimal** | Paid-in capital as a multiple of commitment, or null when there is no commitment. | [optional] [default to java.math.BigDecimal]
**dpi** | **java.math.BigDecimal** | Distributions as a multiple of paid-in capital, or null when nothing has been paid in. | [optional] [default to java.math.BigDecimal]
**rvpi** | **java.math.BigDecimal** | Residual value as a multiple of paid-in capital, or null when nothing has been paid in. | [optional] [default to java.math.BigDecimal]
**tvpi** | **java.math.BigDecimal** | Total value as a multiple of paid-in capital, being DPI plus RVPI. | [optional] [default to java.math.BigDecimal]
**netIrr** | **java.math.BigDecimal** | The annualised net internal rate of return solved from the dated cash flows, or null when no rate can be solved. | [optional] [default to java.math.BigDecimal]
**cashFlows** | [**List&lt;PartnerPerformanceCashFlow&gt;**](PartnerPerformanceCashFlow.md) | The dated cash flows the net IRR was solved from, including the terminal residual value. | [default to List<PartnerPerformanceCashFlow>]
**residualValue** | **java.math.BigDecimal** | The partner&#39;s residual value in the fund at the valuation date. | [default to java.math.BigDecimal]
**residualValueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the residual value is taken as at. | [default to OffsetDateTime]
**withFacility** | [**PartnerPerformanceMeasures**](PartnerPerformanceMeasures.md) |  | [optional] [default to PartnerPerformanceMeasures]
**withoutFacility** | [**PartnerPerformanceMeasures**](PartnerPerformanceMeasures.md) |  | [optional] [default to PartnerPerformanceMeasures]

```java
import com.finbourne.lusid.model.PartnerPerformance;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
String Currency = "example Currency";
java.math.BigDecimal Commitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal PaidIn = new java.math.BigDecimal("100.00");
java.math.BigDecimal Distributed = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Pic = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Dpi = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Rvpi = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Tvpi = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NetIrr = new java.math.BigDecimal("100.00");
List<PartnerPerformanceCashFlow> CashFlows = new List<PartnerPerformanceCashFlow>();
java.math.BigDecimal ResidualValue = new java.math.BigDecimal("100.00");
OffsetDateTime ResidualValueDate = OffsetDateTime.now();
PartnerPerformanceMeasures WithFacility = new PartnerPerformanceMeasures();
PartnerPerformanceMeasures WithoutFacility = new PartnerPerformanceMeasures();


PartnerPerformance partnerPerformanceInstance = new PartnerPerformance()
    .FundId(FundId)
    .InvestorRecordId(InvestorRecordId)
    .Currency(Currency)
    .Commitment(Commitment)
    .PaidIn(PaidIn)
    .Distributed(Distributed)
    .Pic(Pic)
    .Dpi(Dpi)
    .Rvpi(Rvpi)
    .Tvpi(Tvpi)
    .NetIrr(NetIrr)
    .CashFlows(CashFlows)
    .ResidualValue(ResidualValue)
    .ResidualValueDate(ResidualValueDate)
    .WithFacility(WithFacility)
    .WithoutFacility(WithoutFacility);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
