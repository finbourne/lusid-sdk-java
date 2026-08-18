# com.finbourne.lusid.model.BondOptionTerminationEvent
Bond option termination — the underlying bond of a BondOption was redeemed early (called), which  terminates the option and settles its residual intrinsic value against the price the underlying was  actually called at. Posted against the option's own instrument by the feed or orchestration layer:  LUSID does not derive it from the underlying's own EarlyRedemptionEvent, because the corporate action  dependency graph is self-keyed by LUID.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**terminationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the option terminates, being the effective date of the underlying bond&#39;s early redemption. | [optional] [default to OffsetDateTime]
**callPrice** | **java.math.BigDecimal** | The price the underlying bond was actually redeemed at, as a percentage of par. Must be supplied:  it comes from the underlying&#39;s own redemption and cannot be inferred from the option. | [default to java.math.BigDecimal]
**settlementCurrency** | **String** | The currency the residual settlement is paid in, being the option&#39;s domestic currency. | [default to String]
**domCcy** | **String** | The domestic currency of the option. | [default to String]
**settlementAmountPerUnit** | **java.math.BigDecimal** | The residual intrinsic value settled per contract. Computed by LUSID from the call price and the  option&#39;s strike and contract size, so it is not supplied on the request; zero is a legitimate value  when the option terminates worthless. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BondOptionTerminationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime TerminationDate = OffsetDateTime.now();
java.math.BigDecimal CallPrice = new java.math.BigDecimal("100.00");
String SettlementCurrency = "example SettlementCurrency";
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable java.math.BigDecimal SettlementAmountPerUnit = new java.math.BigDecimal("100.00");


BondOptionTerminationEvent bondOptionTerminationEventInstance = new BondOptionTerminationEvent()
    .TerminationDate(TerminationDate)
    .CallPrice(CallPrice)
    .SettlementCurrency(SettlementCurrency)
    .DomCcy(DomCcy)
    .SettlementAmountPerUnit(SettlementAmountPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
