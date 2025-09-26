# com.finbourne.lusid.model.PackageSetRequest
A request to create or update multiple Packages.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requests** | [**List&lt;PackageRequest&gt;**](PackageRequest.md) | A collection of PackageRequests. | [optional] [default to List<PackageRequest>]

```java
import com.finbourne.lusid.model.PackageSetRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<PackageRequest> Requests = new List<PackageRequest>();


PackageSetRequest packageSetRequestInstance = new PackageSetRequest()
    .Requests(Requests);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
