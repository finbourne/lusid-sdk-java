# com.finbourne.lusid.model.PostingModuleResponse
A Posting Module definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**postingModuleCode** | **String** | The code of the Posting Module. | [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Posting Module. | [default to String]
**description** | **String** | A description for the Posting Module. | [optional] [default to String]
**rules** | [**List&lt;PostingModuleRule&gt;**](PostingModuleRule.md) | The Posting Rules that apply for the Posting Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<PostingModuleRule>]
**status** | **String** | The Posting Module status. Can be Active, Inactive or Deleted. Defaults to Active. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PostingModuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String PostingModuleCode = "example PostingModuleCode";
ResourceId ChartOfAccountsId = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<PostingModuleRule> Rules = new List<PostingModuleRule>();
String Status = "example Status";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PostingModuleResponse postingModuleResponseInstance = new PostingModuleResponse()
    .Href(Href)
    .PostingModuleCode(PostingModuleCode)
    .ChartOfAccountsId(ChartOfAccountsId)
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules)
    .Status(Status)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
