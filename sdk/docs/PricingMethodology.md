# com.finbourne.lusid.model.PricingMethodology
How a fund prices its share classes for dealing. A Single fund deals at one price per class, which starts at a  baseline and may swing with the fund's net cashflow. A Dual fund deals at a bid and an offer per class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outputShape** | **String** | How many dealing prices each share class publishes: Single, one price that subscriptions and redemptions both deal at, or Dual, a bid that redemptions deal at and an offer that subscriptions deal at. Available values: Single, Dual. | [default to String]
**swingPolicy** | [**SwingPolicy**](SwingPolicy.md) |  | [optional] [default to SwingPolicy]
**priceLabels** | **String** | What a Dual fund&#39;s two prices are. BidOffer is the only label available: the bid and the offer, including notional dealing costs, that the valuation recipe of each active NAV type publishes. Required for a Dual fund and must be omitted for a Single fund. Available values: BidOffer, CreationCancellation. | [optional] [default to String]
**derivation** | [**DualPriceDerivation**](DualPriceDerivation.md) |  | [optional] [default to DualPriceDerivation]

```java
import com.finbourne.lusid.model.PricingMethodology;
import java.util.*;
import java.lang.System;
import java.net.URI;

String OutputShape = "example OutputShape";
SwingPolicy SwingPolicy = new SwingPolicy();
@jakarta.annotation.Nullable String PriceLabels = "example PriceLabels";
DualPriceDerivation Derivation = new DualPriceDerivation();


PricingMethodology pricingMethodologyInstance = new PricingMethodology()
    .OutputShape(OutputShape)
    .SwingPolicy(SwingPolicy)
    .PriceLabels(PriceLabels)
    .Derivation(Derivation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
