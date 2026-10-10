# com.finbourne.lusid.model.ReportingPrice
A share class price a fund publishes at each valuation point under a label of its own, alongside the dealing price.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The share class price published: Mid, the unit price, or Bid, Offer, BidIncNdc or OfferIncNdc, as the valuation recipe of each active NAV type publishes it. Available values: Mid, Bid, Offer, BidIncNdc, OfferIncNdc, Creation, Cancellation. | [default to String]
**label** | **String** | The name the price is published under in the share class&#39;s reporting prices. Unique within the fund. | [default to String]

```java
import com.finbourne.lusid.model.ReportingPrice;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Source = "example Source";
String Label = "example Label";


ReportingPrice reportingPriceInstance = new ReportingPrice()
    .Source(Source)
    .Label(Label);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
