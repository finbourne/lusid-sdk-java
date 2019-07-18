

# HoldingsAdjustment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime from which the adjustment is valid. There can only be one holdings adjustment for a transaction portfolio at a specific effective datetime, so this uniquely identifies the adjustment. | 
**version** | [**Version**](Version.md) |  | 
**unmatchedHoldingMethod** | [**UnmatchedHoldingMethodEnum**](#UnmatchedHoldingMethodEnum) | Describes how the holdings were adjusted. If &#39;PositionToZero&#39; the entire transaction portfolio&#39;s holdings were set via a call to &#39;Set holdings&#39;. If &#39;KeepTheSame&#39; only the specified holdings were adjusted via a call to &#39;Adjust holdings&#39;. | 
**adjustments** | [**List&lt;HoldingAdjustment&gt;**](HoldingAdjustment.md) | The holding adjustments. | 
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



## Enum: UnmatchedHoldingMethodEnum

Name | Value
---- | -----
POSITIONTOZERO | &quot;PositionToZero&quot;
KEEPTHESAME | &quot;KeepTheSame&quot;



