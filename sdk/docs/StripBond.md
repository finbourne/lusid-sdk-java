# com.finbourne.lusid.model.StripBond
A stripped bond: an entitlement to one side of a mastered parent bond's cash flows. An interest-only strip  receives the interest the parent pays, on a notional that runs down with the parent's principal; a  principal-only strip receives the parent's principal and none of its interest. The strip carries no schedule,  coupon or conventions of its own: it points at the parent through a MasteredInstrument and reads the parent's  cash flows, pool factor, dates and conventions from the parent's live definition, so a re-upsert of the parent  reaches every strip on it. One unit of a strip is one unit of the parent's original face.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowNegativeYield** | **Boolean** | Whether a negative effective yield books negative income. Null means false: a negative effective yield is  then applied as zero, so the whole receipt returns capital. | [optional] [default to Boolean]
**stripType** | **String** | Which side of the parent&#39;s flows the strip receives: InterestOnly receives the parent&#39;s interest,  PrincipalOnly receives the parent&#39;s principal.     Supported string (enumeration) values are: [InterestOnly, PrincipalOnly]. Available values: InterestOnly, PrincipalOnly. | [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]

```java
import com.finbourne.lusid.model.StripBond;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Boolean AllowNegativeYield = true;
String StripType = "example StripType";
TradingConventions TradingConventions = new TradingConventions();
LusidInstrument Underlying = new LusidInstrument();


StripBond stripBondInstance = new StripBond()
    .AllowNegativeYield(AllowNegativeYield)
    .StripType(StripType)
    .TradingConventions(TradingConventions)
    .Underlying(Underlying);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
