# com.finbourne.lusid.model.Series

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifier** | **String** | The identifier that uniquely identifies this Series within the Share Class. | [default to String]
**seriesType** | **String** | The type of the Series. Valid values are: Lead, Standard. | [default to String]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date on which the Series was launched. | [default to OffsetDateTime]
**launchPriceType** | **String** | The type of launch price for the Series. Valid values are: Manual, Calculated. | [default to String]
**domCcy** | **String** | The denomination currency of the Series. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | An optional set of properties to associate with the Series. Only applied if createInstrument is set to true on the parent Fund. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.Series;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SeriesIdentifier = "example SeriesIdentifier";
String SeriesType = "example SeriesType";
OffsetDateTime LaunchDate = OffsetDateTime.now();
String LaunchPriceType = "example LaunchPriceType";
String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


Series seriesInstance = new Series()
    .SeriesIdentifier(SeriesIdentifier)
    .SeriesType(SeriesType)
    .LaunchDate(LaunchDate)
    .LaunchPriceType(LaunchPriceType)
    .DomCcy(DomCcy)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
