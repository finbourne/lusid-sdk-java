# com.finbourne.lusid.model.IrVolCubeData
Market Data required to build a volatility cube for swaption pricing, represented by a list of instruments and corresponding market quotes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseDate** | [**OffsetDateTime**](OffsetDateTime.md) | Base date of the cube - this is the start date of the swaptions on the cube. | [default to OffsetDateTime]
**instruments** | [**List&lt;LusidInstrument&gt;**](LusidInstrument.md) | Retrieve the set of instruments that define the cube. | [default to List<LusidInstrument>]
**quotes** | [**List&lt;MarketQuote&gt;**](MarketQuote.md) | Access the set of quotes that define the cube. | [default to List<MarketQuote>]
**lineage** | **String** | Description of the complex market data&#39;s lineage e.g. &#39;FundAccountant_GreenQuality&#39;. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]

```java
import com.finbourne.lusid.model.IrVolCubeData;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime BaseDate = OffsetDateTime.now();
List<LusidInstrument> Instruments = new List<LusidInstrument>();
List<MarketQuote> Quotes = new List<MarketQuote>();
@jakarta.annotation.Nullable String Lineage = "example Lineage";
Version Version = new Version();


IrVolCubeData irVolCubeDataInstance = new IrVolCubeData()
    .BaseDate(BaseDate)
    .Instruments(Instruments)
    .Quotes(Quotes)
    .Lineage(Lineage)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
