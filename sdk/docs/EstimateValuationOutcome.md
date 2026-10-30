# com.finbourne.lusid.model.EstimateValuationOutcome
Where a net cashflow leads the methodology: whether and which way it swings, the spread and tier it lands in, and the dealing price that results.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**swung** | **Boolean** | Whether the methodology swings the price on this net cashflow. | [default to Boolean]
**swingDirection** | **String** | &#39;Bid&#39; or &#39;Offer&#39;, the side the price swings to. Absent when it does not swing. | [optional] [default to String]
**spreadBps** | **java.math.BigDecimal** | The stored spread applied, in basis points. Absent when the price does not swing or the spread comes from the market. | [optional] [default to java.math.BigDecimal]
**tierMatched** | [**SwingSpreadTierBounds**](SwingSpreadTierBounds.md) |  | [optional] [default to SwingSpreadTierBounds]
**dealingPrice** | **java.math.BigDecimal** | The dealing price the methodology publishes on this net cashflow. Absent when the baseline price is unavailable. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.EstimateValuationOutcome;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Swung = true;
@jakarta.annotation.Nullable String SwingDirection = "example SwingDirection";
@jakarta.annotation.Nullable java.math.BigDecimal SpreadBps = new java.math.BigDecimal("100.00");
SwingSpreadTierBounds TierMatched = new SwingSpreadTierBounds();
@jakarta.annotation.Nullable java.math.BigDecimal DealingPrice = new java.math.BigDecimal("100.00");


EstimateValuationOutcome estimateValuationOutcomeInstance = new EstimateValuationOutcome()
    .Swung(Swung)
    .SwingDirection(SwingDirection)
    .SpreadBps(SpreadBps)
    .TierMatched(TierMatched)
    .DealingPrice(DealingPrice);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
