# com.finbourne.lusid.model.SwingBaseline
The price a Single fund's dealing price starts from before any swing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | **String** | The price the dealing price starts from: Mid, the share class unit price, or Bid or Offer, the share class price that the valuation recipe of each active NAV type publishes on that side. Available values: Mid, Bid, Offer. | [default to String]
**includeNdc** | **Boolean** | Whether a Bid or Offer baseline reads the price including notional dealing costs, which needs the NAV type to have a notional dealing cost table. Required for a Bid or Offer baseline and must be omitted for a Mid baseline. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.SwingBaseline;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Source = "example Source";
@jakarta.annotation.Nullable Boolean IncludeNdc = true;


SwingBaseline swingBaselineInstance = new SwingBaseline()
    .Source(Source)
    .IncludeNdc(IncludeNdc);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
