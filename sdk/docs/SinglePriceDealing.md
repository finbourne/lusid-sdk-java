# com.finbourne.lusid.model.SinglePriceDealing
The single dealing price a share class publishes at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealingPrice** | **java.math.BigDecimal** | The price subscriptions and redemptions deal at, rounded as the share class unit price is. Absent when the class has no units in issue. | [optional] [default to java.math.BigDecimal]
**swung** | **Boolean** | Whether the dealing price moved away from its baseline. | [default to Boolean]
**swingDirection** | **String** | Offer when a net inflow swung the price up, Bid when a net outflow swung it down. Absent when the price did not swing. | [optional] [default to String]
**swingFrom** | **String** | The baseline the price swung away from. Absent when it did not swing. | [optional] [default to String]
**perValuationSource** | **String** | Bid or Offer when the dealing price is that side&#39;s share class price read as published, from a Bid or Offer baseline or a Market swing. Absent when the price is the mid or a stored spread was applied to it. | [optional] [default to String]
**spreadBps** | **java.math.BigDecimal** | The stored spread applied, in basis points. Absent when the price did not swing or swung to a market price. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.SinglePriceDealing;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal DealingPrice = new java.math.BigDecimal("100.00");
Boolean Swung = true;
@jakarta.annotation.Nullable String SwingDirection = "example SwingDirection";
@jakarta.annotation.Nullable String SwingFrom = "example SwingFrom";
@jakarta.annotation.Nullable String PerValuationSource = "example PerValuationSource";
@jakarta.annotation.Nullable java.math.BigDecimal SpreadBps = new java.math.BigDecimal("100.00");


SinglePriceDealing singlePriceDealingInstance = new SinglePriceDealing()
    .DealingPrice(DealingPrice)
    .Swung(Swung)
    .SwingDirection(SwingDirection)
    .SwingFrom(SwingFrom)
    .PerValuationSource(PerValuationSource)
    .SpreadBps(SpreadBps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
