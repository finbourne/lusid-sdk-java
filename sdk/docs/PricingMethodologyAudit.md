# com.finbourne.lusid.model.PricingMethodologyAudit
The working behind a share class's dealing price: the net cashflow it was decided on, the spread applied and  what the methodology alone proposed, with how any Market swing triggers were evaluated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**netCashflow** | **java.math.BigDecimal** | The fund&#39;s net dealing cashflow for the valuation point, in the fund currency. An inflow is positive and an outflow negative. | [default to java.math.BigDecimal]
**netCashflowPctOfNav** | **java.math.BigDecimal** | The net cashflow as a percentage of the previous valuation point&#39;s NAV. Absent when there is no previous NAV to measure it against. | [optional] [default to java.math.BigDecimal]
**spreadsApplied** | [**SwingSpreadApplied**](SwingSpreadApplied.md) |  | [optional] [default to SwingSpreadApplied]
**engineProposal** | [**PricingMethodologyEngineProposal**](PricingMethodologyEngineProposal.md) |  | [default to PricingMethodologyEngineProposal]
**override** | [**PricingMethodologyOverride**](PricingMethodologyOverride.md) |  | [optional] [default to PricingMethodologyOverride]
**inflowTrigger** | [**SwingTriggerEvaluation**](SwingTriggerEvaluation.md) |  | [optional] [default to SwingTriggerEvaluation]
**outflowTrigger** | [**SwingTriggerEvaluation**](SwingTriggerEvaluation.md) |  | [optional] [default to SwingTriggerEvaluation]
**dealingFlows** | [**DealingFlowSummary**](DealingFlowSummary.md) |  | [optional] [default to DealingFlowSummary]

```java
import com.finbourne.lusid.model.PricingMethodologyAudit;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal NetCashflow = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal NetCashflowPctOfNav = new java.math.BigDecimal("100.00");
SwingSpreadApplied SpreadsApplied = new SwingSpreadApplied();
PricingMethodologyEngineProposal EngineProposal = new PricingMethodologyEngineProposal();
PricingMethodologyOverride Override = new PricingMethodologyOverride();
SwingTriggerEvaluation InflowTrigger = new SwingTriggerEvaluation();
SwingTriggerEvaluation OutflowTrigger = new SwingTriggerEvaluation();
DealingFlowSummary DealingFlows = new DealingFlowSummary();


PricingMethodologyAudit pricingMethodologyAuditInstance = new PricingMethodologyAudit()
    .NetCashflow(NetCashflow)
    .NetCashflowPctOfNav(NetCashflowPctOfNav)
    .SpreadsApplied(SpreadsApplied)
    .EngineProposal(EngineProposal)
    .Override(Override)
    .InflowTrigger(InflowTrigger)
    .OutflowTrigger(OutflowTrigger)
    .DealingFlows(DealingFlows);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
