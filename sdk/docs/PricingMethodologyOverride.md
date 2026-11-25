# com.finbourne.lusid.model.PricingMethodologyOverride
The fund manager's override a share class's dealing price follows instead of the pricing methodology's proposal,  and who made it when.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**decision** | **String** | The basis the dealing price is published on: Mid, Bid or Offer. Under a Stored spread source the spread for Bid or Offer is the stored tier the net cashflow matches in that direction, or that direction&#39;s first tier when the flow is below every tier. Under a Market spread source Bid or Offer reads that side&#39;s price including notional dealing costs, which every active NAV type&#39;s valuation recipe must publish. | [default to String]
**reason** | **String** | Why the fund manager overrode the methodology&#39;s decision. | [default to String]
**user** | **String** | The user who made the override. | [optional] [default to String]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) | When the override was made. | [default to OffsetDateTime]
**netCashflow** | **java.math.BigDecimal** | The fund&#39;s net dealing cashflow the decision was taken on, in the fund currency, read as at the override&#39;s timestamp. An inflow is positive and an outflow negative. A net that moves within its swing tier leaves the decision standing, so this can differ from the audit&#39;s current netCashflow, and both are kept on the final valuation point. Null when the swing policy approves automatically, or the decision was taken before the net was recorded. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PricingMethodologyOverride;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Decision = "example Decision";
String Reason = "example Reason";
@jakarta.annotation.Nullable String User = "example User";
OffsetDateTime Timestamp = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal NetCashflow = new java.math.BigDecimal("100.00");


PricingMethodologyOverride pricingMethodologyOverrideInstance = new PricingMethodologyOverride()
    .Decision(Decision)
    .Reason(Reason)
    .User(User)
    .Timestamp(Timestamp)
    .NetCashflow(NetCashflow);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
