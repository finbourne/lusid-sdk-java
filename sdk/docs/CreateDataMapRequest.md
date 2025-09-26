# com.finbourne.lusid.model.CreateDataMapRequest
Request to create a new data map

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**DataMapKey**](DataMapKey.md) |  | [default to DataMapKey]
**data** | [**DataMapping**](DataMapping.md) |  | [optional] [default to DataMapping]

```java
import com.finbourne.lusid.model.CreateDataMapRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

DataMapKey Id = new DataMapKey();
DataMapping Data = new DataMapping();


CreateDataMapRequest createDataMapRequestInstance = new CreateDataMapRequest()
    .Id(Id)
    .Data(Data);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
