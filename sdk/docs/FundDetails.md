# com.finbourne.lusid.model.FundDetails
The details of a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **String** | The currency of the fund which is the same as the base currency of all the portfolios of the fund&#39;s Abor. | [optional] [default to String]
**pricingBasis** | **String** | The side of the quote the NAV type valued the fund on: Mid, Bid or Ask. Absent when the NAV type defers to the valuation recipe&#39;s own pricing basis. When the NAV type has a swing pricing rule this is the basis the rule applied. | [optional] [default to String]
**swingPricing** | [**SwingPricingDecision**](SwingPricingDecision.md) |  | [optional] [default to SwingPricingDecision]

```java
import com.finbourne.lusid.model.FundDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String PricingBasis = "example PricingBasis";
SwingPricingDecision SwingPricing = new SwingPricingDecision();


FundDetails fundDetailsInstance = new FundDetails()
    .Currency(Currency)
    .PricingBasis(PricingBasis)
    .SwingPricing(SwingPricing);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
