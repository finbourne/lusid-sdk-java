# com.finbourne.lusid.model.RecDefSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceType** | **String** | The type of entity that this source refers to. One of: Portfolio, PortfolioGroup, Fund. Available values: Portfolio, PortfolioGroup, Fund. | [default to String]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]

```java
import com.finbourne.lusid.model.RecDefSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String SourceType = "example SourceType";
ResourceId Id = new ResourceId();


RecDefSource recDefSourceInstance = new RecDefSource()
    .SourceType(SourceType)
    .Id(Id);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
