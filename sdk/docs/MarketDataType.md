# com.finbourne.lusid.model.MarketDataType
The format of the complex market data stored. Complex market data is used to store any  data which requires more context than just a simple single point as is the case with a  quote.  Examples of such complex market data are Discount Curve and Volatility Surfaces.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MarketDataType** | [**String**](.md) | **The format of the complex market data stored. Complex market data is used to store any  data which requires more context than just a simple single point as is the case with a  quote.  Examples of such complex market data are Discount Curve and Volatility Surfaces.** | [default to String]

```java
import com.finbourne.lusid.model.MarketDataType;
import java.util.*;
import java.lang.System;
import java.net.URI;

// Example usage of MarketDataType:
MarketDataType method = MarketDataType.DISCOUNTFACTORCURVEDATA;
MarketDataType method = MarketDataType.EQUITYVOLSURFACEDATA;
MarketDataType method = MarketDataType.FXVOLSURFACEDATA;
MarketDataType method = MarketDataType.IRVOLCUBEDATA;
MarketDataType method = MarketDataType.OPAQUEMARKETDATA;
MarketDataType method = MarketDataType.YIELDCURVEDATA;
MarketDataType method = MarketDataType.FXFORWARDCURVEDATA;
MarketDataType method = MarketDataType.FXFORWARDPIPSCURVEDATA;
MarketDataType method = MarketDataType.FXFORWARDTENORCURVEDATA;
MarketDataType method = MarketDataType.FXFORWARDTENORPIPSCURVEDATA;
MarketDataType method = MarketDataType.FXFORWARDCURVEBYQUOTEREFERENCE;
MarketDataType method = MarketDataType.CREDITSPREADCURVEDATA;
MarketDataType method = MarketDataType.EQUITYCURVEBYPRICESDATA;
MarketDataType method = MarketDataType.CONSTANTVOLATILITYSURFACE;
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
