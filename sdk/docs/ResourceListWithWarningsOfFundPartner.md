# com.finbourne.lusid.model.ResourceListWithWarningsOfFundPartner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List&lt;FundPartner&gt;**](FundPartner.md) | The resources to list. | [default to List<FundPartner>]
**href** | [**URI**](URI.md) | The URI of the resource list. | [optional] [default to URI]
**nextPage** | **String** | The next page of results. | [optional] [default to String]
**previousPage** | **String** | The previous page of results. | [optional] [default to String]
**warnings** | [**List&lt;Warning&gt;**](Warning.md) |  | [optional] [default to List<Warning>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ResourceListWithWarningsOfFundPartner;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<FundPartner> Values = new List<FundPartner>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String NextPage = "example NextPage";
@jakarta.annotation.Nullable String PreviousPage = "example PreviousPage";
@jakarta.annotation.Nullable List<Warning> Warnings = new List<Warning>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ResourceListWithWarningsOfFundPartner resourceListWithWarningsOfFundPartnerInstance = new ResourceListWithWarningsOfFundPartner()
    .Values(Values)
    .Href(Href)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Warnings(Warnings)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
