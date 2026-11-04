# com.finbourne.lusid.model.EstimateValuation
The swing decision read at both unit prices the transfer agency's unit-denominated orders could be valued at: this valuation point's estimate price and the last official price, with which one the decision used and how far apart they are.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decisionPrice** | **String** | The unit price the swing decision was taken on. &#39;EstimatePrice&#39; is the price struck at this valuation point; &#39;LastOfficialPrice&#39; is the unit price the previous valuation point published or, for a share class that has not published one yet, the launch price the class was set up with. | [default to String]
**atEstimatePrice** | [**DealingFlowValuation**](DealingFlowValuation.md) |  | [default to DealingFlowValuation]
**atLastOfficialPrice** | [**DealingFlowValuation**](DealingFlowValuation.md) |  | [optional] [default to DealingFlowValuation]
**difference** | [**EstimateValuationDifference**](EstimateValuationDifference.md) |  | [optional] [default to EstimateValuationDifference]

```java
import com.finbourne.lusid.model.EstimateValuation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DecisionPrice = "example DecisionPrice";
DealingFlowValuation AtEstimatePrice = new DealingFlowValuation();
DealingFlowValuation AtLastOfficialPrice = new DealingFlowValuation();
EstimateValuationDifference Difference = new EstimateValuationDifference();


EstimateValuation estimateValuationInstance = new EstimateValuation()
    .DecisionPrice(DecisionPrice)
    .AtEstimatePrice(AtEstimatePrice)
    .AtLastOfficialPrice(AtLastOfficialPrice)
    .Difference(Difference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
