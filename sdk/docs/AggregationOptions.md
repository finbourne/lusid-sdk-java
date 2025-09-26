# com.finbourne.lusid.model.AggregationOptions
Options for controlling the default aspects and behaviour of the aggregation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**useAnsiLikeSyntax** | **Boolean** | Should the aggregation behave like ANSI Sql or MySql with respect to a conceptual request which is equivalent to \&quot;select a,sum(a) from results\&quot;;  ANSI Sql would report an error if a was not unique where MySql would simply view a,suma(a) as equivalent to firstof(a),sum(a). | [optional] [default to Boolean]
**allowPartialEntitlementSuccess** | **Boolean** | In the case of valuing a portfolio group where some, but not all entitlements fail, should the aggregation return the valuations  applied only to those portfolios where entitlements checks succeeded. | [optional] [default to Boolean]
**applyIso4217Rounding** | **Boolean** | Various results that are units of currency might need to be rounded.  This will round according to the ISO4217 standard number of decimal places for a currency. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.AggregationOptions;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean UseAnsiLikeSyntax = true;
Boolean AllowPartialEntitlementSuccess = true;
Boolean ApplyIso4217Rounding = true;


AggregationOptions aggregationOptionsInstance = new AggregationOptions()
    .UseAnsiLikeSyntax(UseAnsiLikeSyntax)
    .AllowPartialEntitlementSuccess(AllowPartialEntitlementSuccess)
    .ApplyIso4217Rounding(ApplyIso4217Rounding);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
