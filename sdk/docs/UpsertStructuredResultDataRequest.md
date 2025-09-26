# com.finbourne.lusid.model.UpsertStructuredResultDataRequest
The details of the structured unit result data item to upsert into Lusid.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**StructuredResultDataId**](StructuredResultDataId.md) |  | [default to StructuredResultDataId]
**data** | [**StructuredResultData**](StructuredResultData.md) |  | [optional] [default to StructuredResultData]

```java
import com.finbourne.lusid.model.UpsertStructuredResultDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

StructuredResultDataId Id = new StructuredResultDataId();
StructuredResultData Data = new StructuredResultData();


UpsertStructuredResultDataRequest upsertStructuredResultDataRequestInstance = new UpsertStructuredResultDataRequest()
    .Id(Id)
    .Data(Data);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
