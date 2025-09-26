# com.finbourne.lusid.model.GetCounterpartyAgreementResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**value** | [**CounterpartyAgreement**](CounterpartyAgreement.md) |  | [optional] [default to CounterpartyAgreement]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The counterparty agreement that could not be retrieved along with a reason for failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.GetCounterpartyAgreementResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
CounterpartyAgreement Value = new CounterpartyAgreement();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


GetCounterpartyAgreementResponse getCounterpartyAgreementResponseInstance = new GetCounterpartyAgreementResponse()
    .Href(Href)
    .Value(Value)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
