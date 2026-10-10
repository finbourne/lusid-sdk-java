# com.finbourne.lusid.model.DualPriceDealing
The bid and offer dealing prices a share class of a Dual fund publishes at a valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dealingBid** | **java.math.BigDecimal** | The price redemptions deal at, rounded as the share class unit price is. Absent when the class has no units in issue or the valuation did not price the side. | [optional] [default to java.math.BigDecimal]
**dealingOffer** | **java.math.BigDecimal** | The price subscriptions deal at, rounded as the share class unit price is. Absent when the class has no units in issue or the valuation did not price the side. | [optional] [default to java.math.BigDecimal]
**bidPerValuationSource** | **String** | The share class price the dealing bid was read or derived from: Bid when it is the bid read as published, Offer or Mid when it was derived from that price. Absent when nothing was dealt. | [optional] [default to String]
**offerPerValuationSource** | **String** | The share class price the dealing offer was read or derived from: Offer when it is the offer read as published, Bid or Mid when it was derived from that price. Absent when nothing was dealt. | [optional] [default to String]
**bidSpreadBps** | **java.math.BigDecimal** | The spread, in basis points, the dealing bid was set below the price it was derived from by. Absent when the bid was read. | [optional] [default to java.math.BigDecimal]
**offerSpreadBps** | **java.math.BigDecimal** | The spread, in basis points, the dealing offer was set above the price it was derived from by. Absent when the offer was read. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.DualPriceDealing;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal DealingBid = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DealingOffer = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String BidPerValuationSource = "example BidPerValuationSource";
@jakarta.annotation.Nullable String OfferPerValuationSource = "example OfferPerValuationSource";
@jakarta.annotation.Nullable java.math.BigDecimal BidSpreadBps = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OfferSpreadBps = new java.math.BigDecimal("100.00");


DualPriceDealing dualPriceDealingInstance = new DualPriceDealing()
    .DealingBid(DealingBid)
    .DealingOffer(DealingOffer)
    .BidPerValuationSource(BidPerValuationSource)
    .OfferPerValuationSource(OfferPerValuationSource)
    .BidSpreadBps(BidSpreadBps)
    .OfferSpreadBps(OfferSpreadBps);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
