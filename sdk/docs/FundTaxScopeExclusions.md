# com.finbourne.lusid.model.FundTaxScopeExclusions
What the UK chargeable-gains figures leave out of the pooled computation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentTypes** | **List&lt;String&gt;** | Instrument types that stay on the portfolio&#39;s ordinary accounting method rather than being pooled, by name. | [default to List<String>]
**leafOutcomes** | **List&lt;String&gt;** | Disposal-leg outcomes the configured regime options disapply. Empty under the standard options. | [default to List<String>]
**appliedInFigures** | **Boolean** | Whether the engine enforces these exclusions when building the pooled lots and gains. | [default to Boolean]

```java
import com.finbourne.lusid.model.FundTaxScopeExclusions;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<String> InstrumentTypes = new List<String>();
List<String> LeafOutcomes = new List<String>();
Boolean AppliedInFigures = true;


FundTaxScopeExclusions fundTaxScopeExclusionsInstance = new FundTaxScopeExclusions()
    .InstrumentTypes(InstrumentTypes)
    .LeafOutcomes(LeafOutcomes)
    .AppliedInFigures(AppliedInFigures);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
