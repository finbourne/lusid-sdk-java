# com.finbourne.lusid.model.OpenCloseMovementQueryParameters
The parameters of an open, close and movement report over a valuation point window.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [optional] [default to DateOrDiaryEntry]
**end** | [**DateOrDiaryEntry**](DateOrDiaryEntry.md) |  | [default to DateOrDiaryEntry]
**variant** | **String** | Optional variant code. Only required when it is necessary to choose between scenarios with multiple estimates. | [optional] [default to String]
**subHoldingKeysToKeep** | **List&lt;String&gt;** | The sub-holding keys to report separately, in the format {domain}/{scope}/{code}. Holdings of an instrument are consolidated to one row per holding type and currency across every other sub-holding key; with none kept every instrument is one row. | [optional] [default to List<String>]
**instrumentPropertyKeys** | **List&lt;String&gt;** | Property keys from the &#39;Instrument&#39; domain to decorate onto each row, in the format {domain}/{scope}/{code} e.g. &#39;Instrument/system/Name&#39;. | [optional] [default to List<String>]
**openingMetrics** | **List&lt;String&gt;** | Valuation address keys to report at the opening of the window, e.g. &#39;Holding/Units&#39;, &#39;Quotes/Price&#39; or &#39;Valuation/PV&#39;. When holdings are consolidated a metric that scales with quantity is summed; any other is reported only when it is the same on every consolidated holding, and is otherwise null with a diagnostic in the row&#39;s errors. | [optional] [default to List<String>]
**closingMetrics** | **List&lt;String&gt;** | Valuation address keys to report at the closing of the window, aggregated as the opening metrics are. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.OpenCloseMovementQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

DateOrDiaryEntry Start = new DateOrDiaryEntry();
DateOrDiaryEntry End = new DateOrDiaryEntry();
@jakarta.annotation.Nullable String Variant = "example Variant";
@jakarta.annotation.Nullable List<String> SubHoldingKeysToKeep = new List<String>();
@jakarta.annotation.Nullable List<String> InstrumentPropertyKeys = new List<String>();
@jakarta.annotation.Nullable List<String> OpeningMetrics = new List<String>();
@jakarta.annotation.Nullable List<String> ClosingMetrics = new List<String>();


OpenCloseMovementQueryParameters openCloseMovementQueryParametersInstance = new OpenCloseMovementQueryParameters()
    .Start(Start)
    .End(End)
    .Variant(Variant)
    .SubHoldingKeysToKeep(SubHoldingKeysToKeep)
    .InstrumentPropertyKeys(InstrumentPropertyKeys)
    .OpeningMetrics(OpeningMetrics)
    .ClosingMetrics(ClosingMetrics);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
