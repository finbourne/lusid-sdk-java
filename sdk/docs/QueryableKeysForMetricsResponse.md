# com.finbourne.lusid.model.QueryableKeysForMetricsResponse
The queryable key definition of each requested metric. Every requested metric appears in exactly one of  the two maps.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | [**Map&lt;String, QueryableKey&gt;**](QueryableKey.md) | The definition of each metric that resolved, describing what a valuation returns for it and how to  present it. Keyed by the metric as it was requested, for example &#39;Valuation/PV&#39; or  &#39;ProfitAndLoss/Realised/Market(Window&#x3D;YTD)&#39;. Identical requested keys appear once; different  spellings of the same underlying key, such as a property&#39;s raw and wrapper forms, each appear. | [default to Map<String, QueryableKey>]
**failed** | **Map&lt;String, String&gt;** | Why each metric that did not resolve cannot be requested, keyed as for Metrics. Empty when every  metric resolved. | [default to Map<String, String>]

```java
import com.finbourne.lusid.model.QueryableKeysForMetricsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, QueryableKey> Metrics = new Map<String, QueryableKey>();
Map<String, String> Failed = new Map<String, String>();


QueryableKeysForMetricsResponse queryableKeysForMetricsResponseInstance = new QueryableKeysForMetricsResponse()
    .Metrics(Metrics)
    .Failed(Failed);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
