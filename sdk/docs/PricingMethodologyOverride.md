# com.finbourne.lusid.model.PricingMethodologyOverride
The fund manager's override a share class's dealing price follows instead of the pricing methodology's proposal,  and who made it when.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decision** | **String** | The basis the dealing price is published on: Mid, Bid or Offer. Under a Stored spread source the spread for Bid or Offer is the stored tier the net cashflow matches in that direction, or that direction&#39;s first tier when the flow is below every tier. Under a Market spread source Bid or Offer reads that side&#39;s price including notional dealing costs, which every active NAV type&#39;s valuation recipe must publish. | [default to String]
**reason** | **String** | Why the fund manager overrode the methodology&#39;s decision. | [default to String]
**user** | **String** | The user who made the override. | [optional] [default to String]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | When the override was made. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PricingMethodologyOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Decision = "example Decision";
String Reason = "example Reason";
@jakarta.annotation.Nullable String User = "example User";
OffsetDateTime Timestamp = OffsetDateTime.now();


PricingMethodologyOverride pricingMethodologyOverrideInstance = new PricingMethodologyOverride()
    .Decision(Decision)
    .Reason(Reason)
    .User(User)
    .Timestamp(Timestamp);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
