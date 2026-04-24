# com.finbourne.lusid.model.FilteredFundIdList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filter** | **String** |  | [default to String]
**values** | [**List&lt;ResourceId&gt;**](ResourceId.md) |  | [optional] [readonly] [default to List<ResourceId>]

```java
import com.finbourne.lusid.model.FilteredFundIdList;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Filter = "example Filter";
@jakarta.annotation.Nullable List<ResourceId> Values = new List<ResourceId>();


FilteredFundIdList filteredFundIdListInstance = new FilteredFundIdList()
    .Filter(Filter)
    .Values(Values);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
