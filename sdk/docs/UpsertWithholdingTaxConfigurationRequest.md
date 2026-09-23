# com.finbourne.lusid.model.UpsertWithholdingTaxConfigurationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anomalyDataset** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**mainDataset** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourcePriority** | **List&lt;String&gt;** | The rule sources in priority order, most preferred first. Optional: a single-source customer configures none and leaves ruleSource blank on every rate row, in which case no source filter is applied and specificity alone decides. | [optional] [default to List<String>]
**valueSources** | [**List&lt;WithholdingTaxValueSource&gt;**](WithholdingTaxValueSource.md) | One declaration per customer-defined matching dimension across both datasets, naming where the engine reads that dimension&#39;s value from. A dataset column name cannot imply a storage location, so a declaration is required for every customer dimension: an unmapped dimension is never supplied by the matching request, so no row ever matches on it and the customer silently gets a broader rate than they configured. No declaration is required for taxCountry or profileType, which the engine fills from the waterfall, nor for ruleSource, which is compared against SourcePriority. | [optional] [default to List<WithholdingTaxValueSource>]

```java
import com.finbourne.lusid.model.UpsertWithholdingTaxConfigurationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId AnomalyDataset = new ResourceId();
ResourceId MainDataset = new ResourceId();
@jakarta.annotation.Nullable List<String> SourcePriority = new List<String>();
@jakarta.annotation.Nullable List<WithholdingTaxValueSource> ValueSources = new List<WithholdingTaxValueSource>();


UpsertWithholdingTaxConfigurationRequest upsertWithholdingTaxConfigurationRequestInstance = new UpsertWithholdingTaxConfigurationRequest()
    .AnomalyDataset(AnomalyDataset)
    .MainDataset(MainDataset)
    .SourcePriority(SourcePriority)
    .ValueSources(ValueSources);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
