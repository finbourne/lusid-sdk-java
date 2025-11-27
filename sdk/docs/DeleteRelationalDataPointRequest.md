# com.finbourne.lusid.model.DeleteRelationalDataPointRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSeries** | [**DataSeries**](DataSeries.md) |  | [default to DataSeries]
**effectiveAt** | **String** | The effectiveAt or cut-label datetime of the DataPoint. | [default to String]

```java
import com.finbourne.lusid.model.DeleteRelationalDataPointRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataSeries DataSeries = new DataSeries();
String EffectiveAt = "example EffectiveAt";


DeleteRelationalDataPointRequest deleteRelationalDataPointRequestInstance = new DeleteRelationalDataPointRequest()
    .DataSeries(DataSeries)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
