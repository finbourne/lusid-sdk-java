# com.finbourne.lusid.model.EquityCurveDependency
For indicating a dependency on an EquityCurve.  E.g. When pricing an EquitySwap one may want to make predictions about the price of the underlying equity at future dates.  If so, that model would declare an EquityCurve dependency so that it could obtain predictions from the EquityCurve.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketIdentifier** | **String** | Type of the code identifying the corresponding equity, e.g. ISIN or CUSIP | [default to String]
**code** | **String** | The code identifying the corresponding equity, e.g. US0378331005 if the MarketIdentifier was set to ISIN | [default to String]
**curveType** | **String** | The curve type of the EquityCurve required. E.g. EquityCurveByPrices | [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveDate of the entity that this is a dependency for.  Unless there is an obvious date this should be, like for a historic reset, then this is the valuation date. | [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.EquityCurveDependency;
import java.util.*;
import java.lang.System;
import java.net.URI;

String MarketIdentifier = "example MarketIdentifier";
String Code = "example Code";
String CurveType = "example CurveType";
OffsetDateTime Date = OffsetDateTime.now();


EquityCurveDependency equityCurveDependencyInstance = new EquityCurveDependency()
    .MarketIdentifier(MarketIdentifier)
    .Code(Code)
    .CurveType(CurveType)
    .Date(Date);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
