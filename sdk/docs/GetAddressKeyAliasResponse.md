# com.finbourne.lusid.model.GetAddressKeyAliasResponse
The response to a singular address key alias read. There is deliberately no failure block on this  type: every route returning it is a singular (or list-of-singular) read, never a batch keyed  lookup, so there is no per-key error to report - an invalid entity is rejected at upsert and  a failed read fails the whole request. The IGetResponse batch members below throw for the  same reason; do not reintroduce a Failed property when copying this shape.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**AddressKeyAlias**](AddressKeyAlias.md) |  | [optional] [default to AddressKeyAlias]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetAddressKeyAliasResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
AddressKeyAlias Value = new AddressKeyAlias();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetAddressKeyAliasResponse getAddressKeyAliasResponseInstance = new GetAddressKeyAliasResponse()
    .Href(Href)
    .Value(Value)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
