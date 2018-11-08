
# HoldingsAdjustment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | There can be at most one holdings adjustment for a portfolio at a  specific effective time so this uniquely identifies the adjustment. |  [optional]
**version** | [**Version**](Version.md) |  |  [optional]
**unmatchedHoldingMethod** | [**UnmatchedHoldingMethodEnum**](#UnmatchedHoldingMethodEnum) |  |  [optional]
**adjustments** | [**List&lt;HoldingAdjustment&gt;**](HoldingAdjustment.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]


<a name="UnmatchedHoldingMethodEnum"></a>
## Enum: UnmatchedHoldingMethodEnum
Name | Value
---- | -----
POSITIONTOZERO | &quot;PositionToZero&quot;
KEEPTHESAME | &quot;KeepTheSame&quot;



