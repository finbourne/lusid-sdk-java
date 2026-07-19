# com.finbourne.lusid.model.GetSubscriptionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) |  | [optional] [default to URI]
**value** | [**SubscriptionDefinition**](SubscriptionDefinition.md) |  | [optional] [default to SubscriptionDefinition]
**failed** | [**ErrorDetail**](ErrorDetail.md) |  | [optional] [default to ErrorDetail]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetSubscriptionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
SubscriptionDefinition Value = new SubscriptionDefinition();
ErrorDetail Failed = new ErrorDetail();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetSubscriptionResponse getSubscriptionResponseInstance = new GetSubscriptionResponse()
    .Href(Href)
    .Value(Value)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
