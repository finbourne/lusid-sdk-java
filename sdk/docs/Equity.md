# com.finbourne.lusid.model.Equity
LUSID representation of an Equity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**EquityAllOfIdentifiers**](EquityAllOfIdentifiers.md) |  | [optional] [default to EquityAllOfIdentifiers]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**lotSize** | **Integer** | Deprecated: Use TradingConventions field instead  Equity LotSize, the minimum number of shares that can be bought at once.  Optional, if set must be non-negative, if not set defaults to 1.    Note this property does not impact valuation. From a LUSID analytics perspective, it is purely informational. | [optional] [default to Integer]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.lusid.model.Equity;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable EquityAllOfIdentifiers Identifiers = new EquityAllOfIdentifiers();
String DomCcy = "example DomCcy";
Integer LotSize = new Integer("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
TradingConventions TradingConventions = new TradingConventions();


Equity equityInstance = new Equity()
    .Identifiers(Identifiers)
    .DomCcy(DomCcy)
    .LotSize(LotSize)
    .TimeZoneConventions(TimeZoneConventions)
    .TradingConventions(TradingConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
