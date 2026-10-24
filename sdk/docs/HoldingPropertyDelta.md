# com.finbourne.lusid.model.HoldingPropertyDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingPropertyKey** | **String** | The running balance on the holding to adjust. Allowed values: &#39;CommittedCapital&#39;, &#39;UncalledCommitment&#39;, &#39;PaidInCapital&#39;, &#39;ReturnedCapital&#39;, &#39;RecallableCapital&#39;, &#39;NonRecallableCapital&#39;, &#39;ExcessCapitalReturned&#39;, &#39;FundedCapital&#39; and &#39;UnfundedCapital&#39;. &#39;ExcessCapitalReturned&#39; is the cumulative excess capital the fund has handed back, kept separately because a return of excess lowers PaidInCapital and restores UncalledCommitment at the same time. &#39;UnfundedCapital&#39; is a deprecated alias of &#39;UncalledCommitment&#39;; &#39;FundedCapital&#39; is served as PaidInCapital less ReturnedCapital and new configuration should target those two instead. Available values: CommittedCapital, FundedCapital, UnfundedCapital, RecallableCapital, NonRecallableCapital, PaidInCapital, ReturnedCapital, UncalledCommitment, ExcessCapitalReturned. | [default to String]
**source** | **String** | The movement value that sources the adjustment. Allowed values: &#39;Amount&#39; (the movement&#39;s signed amount in transaction currency), &#39;Units&#39; (the movement&#39;s signed units), &#39;PortfolioAmount&#39; (the movement&#39;s signed amount converted to portfolio currency) and &#39;ProportionOfBalance&#39; (the movement&#39;s amount is read as a proportion between 0 and 1 of the balance already held under the key, and the adjustment is that proportion of the balance rounded to the holding currency&#39;s minor unit). Available values: Amount, Units, PortfolioAmount, ProportionOfBalance. | [default to String]
**direction** | **String** | Whether the sourced value increases or decreases the balance. Allowed values: &#39;Increase&#39; and &#39;Decrease&#39;. Available values: Increase, Decrease. | [default to String]

```java
import com.finbourne.lusid.model.HoldingPropertyDelta;
import java.util.*;
import java.lang.System;
import java.net.URI;

String HoldingPropertyKey = "example HoldingPropertyKey";
String Source = "example Source";
String Direction = "example Direction";


HoldingPropertyDelta holdingPropertyDeltaInstance = new HoldingPropertyDelta()
    .HoldingPropertyKey(HoldingPropertyKey)
    .Source(Source)
    .Direction(Direction);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
