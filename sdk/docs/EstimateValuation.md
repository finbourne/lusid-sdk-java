# com.finbourne.lusid.model.EstimateValuation
The swing decision read at both unit prices the transfer agency's unit-denominated orders could be valued at: this valuation point's estimate price and the last official price, with which one the decision used and how far apart they are.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decisionPrice** | **String** | The unit price the swing decision was taken on. &#39;EstimatePrice&#39; is the price struck at this valuation point; &#39;LastOfficialPrice&#39; is the unit price the previous valuation point published. &#39;EstimatePrice&#39; when the fund asked for the last official price but has none yet, as on its first valuation point. | [default to String]
**atEstimatePrice** | [**DealingFlowValuation**](DealingFlowValuation.md) |  | [default to DealingFlowValuation]
**atLastOfficialPrice** | [**DealingFlowValuation**](DealingFlowValuation.md) |  | [optional] [default to DealingFlowValuation]
**difference** | [**EstimateValuationDifference**](EstimateValuationDifference.md) |  | [optional] [default to EstimateValuationDifference]
**unitBasedShare** | **java.math.BigDecimal** | The fraction of the decision&#39;s net cashflow that came from unit-denominated orders, from 0 to 1. Zero when the net cashflow is zero. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.EstimateValuation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DecisionPrice = "example DecisionPrice";
DealingFlowValuation AtEstimatePrice = new DealingFlowValuation();
DealingFlowValuation AtLastOfficialPrice = new DealingFlowValuation();
EstimateValuationDifference Difference = new EstimateValuationDifference();
java.math.BigDecimal UnitBasedShare = new java.math.BigDecimal("100.00");


EstimateValuation estimateValuationInstance = new EstimateValuation()
    .DecisionPrice(DecisionPrice)
    .AtEstimatePrice(AtEstimatePrice)
    .AtLastOfficialPrice(AtLastOfficialPrice)
    .Difference(Difference)
    .UnitBasedShare(UnitBasedShare);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
