# com.finbourne.lusid.model.ConstantVolatilitySurface
Market Data required to build a volatility surface for pricing.  Single constant volatility point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Base date of the engine - this is the reference date for resolution of tenors. | [default to OffsetDateTime]
**assetType** | **String** | What is the asset that the engine is for.  Supported string (enumeration) values are: [Cash, Commodity, Credit, Equity, Fx, Rates, FxVol, IrVol, EquityVol, HolidayCalendar, IndexConvention, FlowConvention, CdsFlowConvention, CorporateActions, FxForwards, Quote, Inflation, EquityCurve, All, VendorOpaque]. | [default to String]
**lineage** | **String** |  | [optional] [default to String]
**volatility** | **java.math.BigDecimal** | Volatility value. | [default to java.math.BigDecimal]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.ConstantVolatilitySurface;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
String AssetType = "example AssetType";
@jakarta.annotation.Nullable String Lineage = "example Lineage";
java.math.BigDecimal Volatility = new java.math.BigDecimal("100.00");
Version Version = new Version();


ConstantVolatilitySurface constantVolatilitySurfaceInstance = new ConstantVolatilitySurface()
    .BaseDate(BaseDate)
    .AssetType(AssetType)
    .Lineage(Lineage)
    .Volatility(Volatility)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
