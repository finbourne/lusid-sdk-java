# com.finbourne.lusid.model.UpsertResultValuesDataRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**documentId** | [**StructuredResultDataId**](StructuredResultDataId.md) |  | [default to StructuredResultDataId]
**key** | **Map&lt;String, String&gt;** | The structured unit result data key. | [optional] [default to Map<String, String>]
**dataAddress** | **String** | The address of the piece of unit result data | [optional] [default to String]
**resultValue** | [**ResultValue**](ResultValue.md) |  | [optional] [default to ResultValue]

```java
import com.finbourne.lusid.model.UpsertResultValuesDataRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

StructuredResultDataId DocumentId = new StructuredResultDataId();
@jakarta.annotation.Nullable Map<String, String> Key = new Map<String, String>();
@jakarta.annotation.Nullable String DataAddress = "example DataAddress";
ResultValue ResultValue = new ResultValue();


UpsertResultValuesDataRequest upsertResultValuesDataRequestInstance = new UpsertResultValuesDataRequest()
    .DocumentId(DocumentId)
    .Key(Key)
    .DataAddress(DataAddress)
    .ResultValue(ResultValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
