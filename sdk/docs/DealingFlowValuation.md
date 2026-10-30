# com.finbourne.lusid.model.DealingFlowValuation
The transfer agency's dealing flows with unit-denominated orders valued at one unit price, and the swing outcome that net flow leads the methodology to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netCashflow** | **java.math.BigDecimal** | The inflows less the outflows at this unit price, in the fund currency. | [default to java.math.BigDecimal]
**netCashflowPctOfNav** | **java.math.BigDecimal** | The net cashflow as a percentage of the fund&#39;s NAV at the previous valuation point. Absent when there is no previous NAV. | [optional] [default to java.math.BigDecimal]
**grossInflow** | **java.math.BigDecimal** | The sum of the inflows at this unit price, in the fund currency. Zero or more. | [default to java.math.BigDecimal]
**grossOutflow** | **java.math.BigDecimal** | The sum of the outflows at this unit price, in the fund currency, as a magnitude. Zero or more. | [default to java.math.BigDecimal]
**outcome** | [**EstimateValuationOutcome**](EstimateValuationOutcome.md) |  | [optional] [default to EstimateValuationOutcome]

```java
import com.finbourne.lusid.model.DealingFlowValuation;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal NetCashflow = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NetCashflowPctOfNav = new java.math.BigDecimal("100.00");
java.math.BigDecimal GrossInflow = new java.math.BigDecimal("100.00");
java.math.BigDecimal GrossOutflow = new java.math.BigDecimal("100.00");
EstimateValuationOutcome Outcome = new EstimateValuationOutcome();


DealingFlowValuation dealingFlowValuationInstance = new DealingFlowValuation()
    .NetCashflow(NetCashflow)
    .NetCashflowPctOfNav(NetCashflowPctOfNav)
    .GrossInflow(GrossInflow)
    .GrossOutflow(GrossOutflow)
    .Outcome(Outcome);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
