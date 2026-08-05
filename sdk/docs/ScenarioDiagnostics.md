# com.finbourne.lusid.model.ScenarioDiagnostics
Diagnostics for the scenario shifts a valuation applied: every market data target changed by a  shift, with values before and after, plus warnings for market data that matched a shift but could  not honour it. Populated whenever the valuation ran with a request-level scenario or  scenario-decorated metrics; null otherwise. The same material is written to the market data  manifest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applied** | [**List&lt;AppliedScenarioShift&gt;**](AppliedScenarioShift.md) | One entry per market data target changed by a shift. | [optional] [default to List<AppliedScenarioShift>]
**skipped** | **List&lt;String&gt;** | Market data that matched a shift but was skipped (e.g. an element type that does not support  transformation), with the reason. Prefixed with the scenario&#39;s \&quot;scope/code\&quot; reference. | [optional] [default to List<String>]
**omittedApplied** | **Integer** | The number of further applied records omitted from this section, when the valuation changed  more targets than the section carries (large portfolios over long schedules). Null when  nothing was omitted. The market data manifest always carries the complete set. | [optional] [default to Integer]

```java
import com.finbourne.lusid.model.ScenarioDiagnostics;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<AppliedScenarioShift> Applied = new List<AppliedScenarioShift>();
@jakarta.annotation.Nullable List<String> Skipped = new List<String>();
@jakarta.annotation.Nullable Integer OmittedApplied = new Integer("100.00");


ScenarioDiagnostics scenarioDiagnosticsInstance = new ScenarioDiagnostics()
    .Applied(Applied)
    .Skipped(Skipped)
    .OmittedApplied(OmittedApplied);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
