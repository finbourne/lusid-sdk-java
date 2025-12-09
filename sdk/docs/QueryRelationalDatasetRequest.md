# com.finbourne.lusid.model.QueryRelationalDatasetRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queryMethod** | **String** | The method used to query data points. Can be either &#39;Latest&#39; or &#39;TimeSeries&#39;. | [optional] [default to String]
**filter** | **String** | Expression to filter the result set. For more information about filtering LUSID results, see https://support.lusid.com/knowledgebase/article/KA-01914. | [optional] [default to String]
**customSortBy** | [**List&lt;CustomSortBy&gt;**](CustomSortBy.md) | A list of fields and values to sort the results by. | [optional] [default to List<CustomSortBy>]

```java
import com.finbourne.lusid.model.QueryRelationalDatasetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String QueryMethod = "example QueryMethod";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable List<CustomSortBy> CustomSortBy = new List<CustomSortBy>();


QueryRelationalDatasetRequest queryRelationalDatasetRequestInstance = new QueryRelationalDatasetRequest()
    .QueryMethod(QueryMethod)
    .Filter(Filter)
    .CustomSortBy(CustomSortBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
