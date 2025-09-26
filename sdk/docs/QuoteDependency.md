# com.finbourne.lusid.model.QuoteDependency
For indicating a dependency on the value of an asset at a point in time.  If the time is omitted, then the dependency is interpreted as the latest value with respect to anything observing it.  E.g. An EquitySwap will declare a dependency on the current price of the underlying equity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketIdentifier** | **String** | Type of the code identifying the asset, e.g. ISIN or CUSIP | [default to String]
**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt of the quote for the identified entity. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.QuoteDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MarketIdentifier = "example MarketIdentifier";
String Code = "example Code";
OffsetDateTime Date = OffsetDateTime.now();


QuoteDependency quoteDependencyInstance = new QuoteDependency()
    .MarketIdentifier(MarketIdentifier)
    .Code(Code)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
