# com.finbourne.lusid.model.ErrorDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the failed item that this error relates to. | [optional] [default to String]
**type** | **String** | The type of failure that occurred. | [optional] [default to String]
**detail** | **String** | Description of the failure that occurred. | [optional] [default to String]
**errorDetails** | [**List&lt;Map&lt;String, String&gt;&gt;**](Map.md) | Information about the particular instance of the failure (supplied information depends on the type of failure). | [optional] [default to List<Map<String, String>>]

```java
import com.finbourne.lusid.model.ErrorDetail;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String Detail = "example Detail";
@jakarta.annotation.Nullable List<Map<String, String>> ErrorDetails = new List<Map<String, String>>();


ErrorDetail errorDetailInstance = new ErrorDetail()
    .Id(Id)
    .Type(Type)
    .Detail(Detail)
    .ErrorDetails(ErrorDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
