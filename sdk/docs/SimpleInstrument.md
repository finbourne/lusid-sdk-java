# com.finbourne.lusid.model.SimpleInstrument
LUSID representation of a Simple Instrument, used as a basic definition of a generic instrument.  No analytics can be obtained for this.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [optional] [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency. | [default to String]
**assetClass** | **String** | The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown | [default to String]
**fgnCcys** | **List&lt;String&gt;** | The set of foreign currencies, if any (optional). | [optional] [default to List<String>]
**simpleInstrumentType** | **String** | The Instrument type of the simple instrument. | [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]

```java
import com.finbourne.lusid.model.SimpleInstrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
String AssetClass = "example AssetClass";
@jakarta.annotation.Nullable List<String> FgnCcys = new List<String>();
String SimpleInstrumentType = "example SimpleInstrumentType";
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
TradingConventions TradingConventions = new TradingConventions();


SimpleInstrument simpleInstrumentInstance = new SimpleInstrument()
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .AssetClass(AssetClass)
    .FgnCcys(FgnCcys)
    .SimpleInstrumentType(SimpleInstrumentType)
    .TimeZoneConventions(TimeZoneConventions)
    .TradingConventions(TradingConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
