# com.finbourne.lusid.model.DeleteWithholdingTaxRateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**seriesIdentifiers** | **Map&lt;String, Object&gt;** | The identifiers that uniquely define this DataSeries, if any, structured according to the FieldSchema of the parent RelationalDatasetDefinition. | [optional] [default to Map<String, Object>]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]

```java
import com.finbourne.lusid.model.DeleteWithholdingTaxRateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Object> SeriesIdentifiers = new Map<String, Object>();
String EffectiveAt = "example EffectiveAt";


DeleteWithholdingTaxRateRequest deleteWithholdingTaxRateRequestInstance = new DeleteWithholdingTaxRateRequest()
    .SeriesIdentifiers(SeriesIdentifiers)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
