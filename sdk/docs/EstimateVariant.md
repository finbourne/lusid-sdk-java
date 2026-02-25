# com.finbourne.lusid.model.EstimateVariant

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**variant** | **String** | The Variant of the Calendar Entry. Together with the valuation point code marks the unique branch for the NavType. | [optional] [default to String]
**displayName** | **String** | The name of the Fund Calendar entry. | [default to String]
**description** | **String** | A description for the Fund Calendar entry. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt datetime for the Calendar Entry. | [default to OffsetDateTime]
**holdingsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for building holdings in the Valuation Point. Defaults to Latest. | [optional] [default to OffsetDateTime]
**valuationsAsAtOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAt Override to use for performing valuations in the Valuation Point. Defaults to Latest. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties for the Calendar Entry. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [default to Version]

```java
import com.finbourne.lusid.model.EstimateVariant;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Variant = "example Variant";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime HoldingsAsAtOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ValuationsAsAtOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();


EstimateVariant estimateVariantInstance = new EstimateVariant()
    .Variant(Variant)
    .DisplayName(DisplayName)
    .Description(Description)
    .AsAt(AsAt)
    .HoldingsAsAtOverride(HoldingsAsAtOverride)
    .ValuationsAsAtOverride(ValuationsAsAtOverride)
    .Properties(Properties)
    .Version(Version);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
