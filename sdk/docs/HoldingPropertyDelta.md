# com.finbourne.lusid.model.HoldingPropertyDelta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingPropertyKey** | **String** | The running balance on the holding to adjust. Allowed values: &#39;CommittedCapital&#39;, &#39;FundedCapital&#39;, &#39;UnfundedCapital&#39;, &#39;RecallableCapital&#39; and &#39;NonRecallableCapital&#39;. Available values: CommittedCapital, FundedCapital, UnfundedCapital, RecallableCapital, NonRecallableCapital. | [default to String]
**source** | **String** | The movement value that sources the adjustment. Allowed values: &#39;Amount&#39; (the movement&#39;s signed amount in transaction currency), &#39;Units&#39; (the movement&#39;s signed units) and &#39;PortfolioAmount&#39; (the movement&#39;s signed amount converted to portfolio currency). Available values: Amount, Units, PortfolioAmount. | [default to String]
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
