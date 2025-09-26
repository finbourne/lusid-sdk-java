# com.finbourne.lusid.model.OrderBySpec

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key that uniquely identifies a queryable address in Lusid. | [default to String]
**sortOrder** | **String** | The available values are: Ascending, Descending | [default to String]

```java
import com.finbourne.lusid.model.OrderBySpec;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String SortOrder = "example SortOrder";


OrderBySpec orderBySpecInstance = new OrderBySpec()
    .Key(Key)
    .SortOrder(SortOrder);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
