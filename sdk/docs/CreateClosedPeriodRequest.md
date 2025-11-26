# com.finbourne.lusid.model.CreateClosedPeriodRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closedPeriodId** | **String** | The unique Id of the Closed Period. The ClosedPeriodId, together with the Timeline Scope and Code, uniquely identifies a Closed Period | [default to String]
**effectiveEnd** | [**OffsetDateTime**](OffsetDateTime.md) | The effective end of the Closed Period | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The Closed Periods properties. These will be from the &#39;ClosedPeriod&#39; domain. | [optional] [default to Map<String, Property>]
**asAtClosed** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt closed datetime for the Closed Period | [optional] [default to OffsetDateTime]
**displayName** | **String** | The name of the Closed Period. | [optional] [default to String]
**description** | **String** | A description for the Closed Period. | [optional] [default to String]
**holdingsAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for building holdings in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]
**valuationAsAtClosedOverride** | [**OffsetDateTime**](OffsetDateTime.md) | The optional AsAtClosed Override to use for performing valuations in the Closed Period.If not specified, the AsAtClosed on the Closed Period will be used. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CreateClosedPeriodRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ClosedPeriodId = "example ClosedPeriodId";
OffsetDateTime EffectiveEnd = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable OffsetDateTime AsAtClosed = OffsetDateTime.now();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable OffsetDateTime HoldingsAsAtClosedOverride = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ValuationAsAtClosedOverride = OffsetDateTime.now();


CreateClosedPeriodRequest createClosedPeriodRequestInstance = new CreateClosedPeriodRequest()
    .ClosedPeriodId(ClosedPeriodId)
    .EffectiveEnd(EffectiveEnd)
    .Properties(Properties)
    .AsAtClosed(AsAtClosed)
    .DisplayName(DisplayName)
    .Description(Description)
    .HoldingsAsAtClosedOverride(HoldingsAsAtClosedOverride)
    .ValuationAsAtClosedOverride(ValuationAsAtClosedOverride);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
