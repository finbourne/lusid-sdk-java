# com.finbourne.lusid.model.OpenCloseMovementRecord
One row of the open, close and movement report: the net asset economic buckets at the opening and closing  of the window, the period's movements by economic bucket, and the requested valuation metrics and  instrument properties, per instrument or per kept sub-holding key.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**holdingType** | **String** | The code for the type of the holding e.g. P, B, C, R, F etc. | [optional] [default to String]
**instrumentScope** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding is in. | [optional] [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The values of the sub-holding keys the request kept separate. Empty when the row is consolidated to the instrument. | [optional] [default to Map<String, PerpetualProperty>]
**currency** | **String** | The holding currency. | [optional] [default to String]
**opening** | [**List&lt;EconomicBucketAmount&gt;**](EconomicBucketAmount.md) | The net asset economic buckets at the opening of the window, from the opening valuation. Empty when nothing was held. Amounts follow the journal entry line sign convention: a long position&#39;s balances are positive. Note that the A2B report&#39;s signs are the opposite for gains. | [optional] [default to List<EconomicBucketAmount>]
**closing** | [**List&lt;EconomicBucketAmount&gt;**](EconomicBucketAmount.md) | The net asset economic buckets at the closing of the window, from the closing valuation. Empty when nothing is held. Signs as for the opening. | [optional] [default to List<EconomicBucketAmount>]
**movements** | [**List&lt;EconomicBucketAmount&gt;**](EconomicBucketAmount.md) | The period&#39;s movements by economic bucket, component and variant, classified exactly as the journal entry lines classify them: the transaction lines of the window (cost flows in the NA buckets, carry, fees and realised gains in the PL buckets) plus the remeasurement of each net asset bucket between the two valuations, booked to its PL bucket. Signs follow the journal entry line convention, so income and gains are negative. The row reconciles as: closing &#x3D; opening + movements in NA buckets - movements in the remeasurement buckets (PL_UnrealPriceGL, PL_UnrealFXGL, PL_Accrued, PL_UnrealisedAmortised, PL_PIKAccrued, PL_DelayedCompensation); any residual is booked to PL_Rounding. | [optional] [default to List<EconomicBucketAmount>]
**openingMetrics** | **Map&lt;String, java.math.BigDecimal&gt;** | The requested valuation metrics at the opening of the window, keyed by address key. Absent when nothing was held; null where the metric is unavailable or differs across the consolidated holdings. | [optional] [default to Map<String, java.math.BigDecimal>]
**closingMetrics** | **Map&lt;String, java.math.BigDecimal&gt;** | The requested valuation metrics at the closing of the window, keyed by address key, as the opening metrics. | [optional] [default to Map<String, java.math.BigDecimal>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | The properties which have been requested to be decorated onto the holding. These will be from the &#39;Instrument&#39; domain. | [optional] [default to Map<String, Property>]
**errors** | [**List&lt;ResponseMetaData&gt;**](ResponseMetaData.md) | Any errors with the row are reported here, including metrics that could not be consolidated and reconciliation residuals beyond rounding. | [optional] [default to List<ResponseMetaData>]

```java
import com.finbourne.lusid.model.OpenCloseMovementRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable String HoldingType = "example HoldingType";
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String InstrumentUid = "example InstrumentUid";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable List<EconomicBucketAmount> Opening = new List<EconomicBucketAmount>();
@jakarta.annotation.Nullable List<EconomicBucketAmount> Closing = new List<EconomicBucketAmount>();
@jakarta.annotation.Nullable List<EconomicBucketAmount> Movements = new List<EconomicBucketAmount>();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> OpeningMetrics = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable Map<String, java.math.BigDecimal> ClosingMetrics = new Map<String, java.math.BigDecimal>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<ResponseMetaData> Errors = new List<ResponseMetaData>();


OpenCloseMovementRecord openCloseMovementRecordInstance = new OpenCloseMovementRecord()
    .PortfolioId(PortfolioId)
    .HoldingType(HoldingType)
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .SubHoldingKeys(SubHoldingKeys)
    .Currency(Currency)
    .Opening(Opening)
    .Closing(Closing)
    .Movements(Movements)
    .OpeningMetrics(OpeningMetrics)
    .ClosingMetrics(ClosingMetrics)
    .Properties(Properties)
    .Errors(Errors);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
