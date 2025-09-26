# com.finbourne.lusid.model.RecommendedSortBy

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeName** | **String** | The property key, identifier type, or field to be sorted by. | [default to String]
**sortOrder** | **String** | The sorting direction. Either ascending (ASC) or descending (DESC). | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecommendedSortBy;
import java.util.*;
import java.lang.System;
import java.net.URI;

String AttributeName = "example AttributeName";
@jakarta.annotation.Nullable String SortOrder = "example SortOrder";


RecommendedSortBy recommendedSortByInstance = new RecommendedSortBy()
    .AttributeName(AttributeName)
    .SortOrder(SortOrder);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
