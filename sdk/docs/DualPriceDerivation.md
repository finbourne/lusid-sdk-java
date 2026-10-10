# com.finbourne.lusid.model.DualPriceDerivation
How a Dual fund derives its dealing prices from one real price by fixed spreads.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**realSide** | **String** | The price read from the valuation: Bid or Offer, from which the other side is derived, or Mid, the share class unit price, from which both sides are derived, for a fund whose market data has no bid or offer. Available values: Bid, Offer, Mid. | [default to String]
**includeNdc** | **Boolean** | Whether the real side is read including notional dealing costs, which needs the NAV type to have a notional dealing cost table. Must be false for Mid. | [default to Boolean]
**bidSpreadBps** | **java.math.BigDecimal** | How far below the real price the bid is set, in basis points of the real price. Zero or more. Required when the bid is derived, for an Offer or Mid real side, and absent for a Bid one. | [optional] [default to java.math.BigDecimal]
**offerSpreadBps** | **java.math.BigDecimal** | How far above the real price the offer is set, in basis points of the real price. Zero or more. Required when the offer is derived, for a Bid or Mid real side, and absent for an Offer one. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.DualPriceDerivation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RealSide = "example RealSide";
Boolean IncludeNdc = true;
@jakarta.annotation.Nullable java.math.BigDecimal BidSpreadBps = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OfferSpreadBps = new java.math.BigDecimal("100.00");


DualPriceDerivation dualPriceDerivationInstance = new DualPriceDerivation()
    .RealSide(RealSide)
    .IncludeNdc(IncludeNdc)
    .BidSpreadBps(BidSpreadBps)
    .OfferSpreadBps(OfferSpreadBps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
