# com.finbourne.lusid.model.ApiEndpoint

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **String** |  | [optional] [default to String]
**httpMethod** | **String** |  | [default to String]
**path** | **String** |  | [default to String]
**status** | **String** |  | [optional] [default to String]
**summary** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ApiEndpoint;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Operation = "example Operation";
String HttpMethod = "example HttpMethod";
String Path = "example Path";
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable String Summary = "example Summary";
@jakarta.annotation.Nullable String Description = "example Description";


ApiEndpoint apiEndpointInstance = new ApiEndpoint()
    .Operation(Operation)
    .HttpMethod(HttpMethod)
    .Path(Path)
    .Status(Status)
    .Summary(Summary)
    .Description(Description);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
