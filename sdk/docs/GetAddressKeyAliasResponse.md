# com.finbourne.lusid.model.GetAddressKeyAliasResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**AddressKeyAlias**](AddressKeyAlias.md) |  | [optional] [default to AddressKeyAlias]
**failed** | [**ErrorDetail**](ErrorDetail.md) |  | [optional] [default to ErrorDetail]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetAddressKeyAliasResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
AddressKeyAlias Value = new AddressKeyAlias();
ErrorDetail Failed = new ErrorDetail();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetAddressKeyAliasResponse getAddressKeyAliasResponseInstance = new GetAddressKeyAliasResponse()
    .Href(Href)
    .Value(Value)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
