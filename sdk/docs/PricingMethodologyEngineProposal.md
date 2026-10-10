# com.finbourne.lusid.model.PricingMethodologyEngineProposal
What the pricing methodology alone publishes for a share class, kept alongside any decision that replaces it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**swung** | **Boolean** | Whether the methodology swings the price. | [default to Boolean]
**swingDirection** | **String** | Offer or Bid when the methodology swings the price. Absent when it does not. | [optional] [default to String]
**spreadSource** | **String** | Where the methodology&#39;s spread came from: Stored or Market. Absent when it does not swing. | [optional] [default to String]
**spreadBps** | **java.math.BigDecimal** | The stored spread the methodology applies, in basis points. Absent when it does not swing or swings to a market price. | [optional] [default to java.math.BigDecimal]
**dealingPrice** | **java.math.BigDecimal** | The dealing price the methodology publishes. Absent when the class has no units in issue. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PricingMethodologyEngineProposal;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Swung = true;
@jakarta.annotation.Nullable String SwingDirection = "example SwingDirection";
@jakarta.annotation.Nullable String SpreadSource = "example SpreadSource";
@jakarta.annotation.Nullable java.math.BigDecimal SpreadBps = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DealingPrice = new java.math.BigDecimal("100.00");


PricingMethodologyEngineProposal pricingMethodologyEngineProposalInstance = new PricingMethodologyEngineProposal()
    .Swung(Swung)
    .SwingDirection(SwingDirection)
    .SpreadSource(SpreadSource)
    .SpreadBps(SpreadBps)
    .DealingPrice(DealingPrice);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
