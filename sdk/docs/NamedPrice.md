# com.finbourne.lusid.model.NamedPrice
One recipe-defined named price: the side of the market a PV is read from, and whether the  portfolio's notional dealing cost is added (buy side) or subtracted (sell side). The buy-side  cost is always computed from the offer-side market value and the sell-side cost from the  bid-side market value, whatever the base, so a mid base with a cost is well defined.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name a request uses, as Valuation/PV(NamedPrice&#x3D;name). Starts with a letter and contains  only letters and digits; at most 64 characters. | [default to String]
**base** | **String** | The side of the market the price starts from: one of \&quot;Bid\&quot;, \&quot;Mid\&quot; or \&quot;Offer\&quot;. \&quot;Bid\&quot; and \&quot;Offer\&quot;  read every instrument price rule on that side of the quote; \&quot;Mid\&quot; reads each rule with the quote  field it was written with, which is the recipe&#39;s ordinary valuation. Available values: Bid, Mid, Offer. | [default to String]
**ndc** | **String** | The notional dealing cost applied to the base: one of \&quot;None\&quot; (default), \&quot;AddBuy\&quot; or  \&quot;SubtractSell\&quot;. Available values: None, AddBuy, SubtractSell. | [optional] [default to String]

```java
import com.finbourne.lusid.model.NamedPrice;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Base = "example Base";
@jakarta.annotation.Nullable String Ndc = "example Ndc";


NamedPrice namedPriceInstance = new NamedPrice()
    .Name(Name)
    .Base(Base)
    .Ndc(Ndc);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
