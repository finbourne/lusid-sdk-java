# com.finbourne.lusid.model.CleardownModuleResponse
A Cleardown Module definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**cleardownModuleCode** | **String** | The code of the Cleardown Module. | [default to String]
**chartOfAccountsId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Cleardown Module. | [default to String]
**description** | **String** | A description for the Cleardown Module. | [optional] [default to String]
**rules** | [**List&lt;CleardownModuleRule&gt;**](CleardownModuleRule.md) | The Cleardown Rules that apply for the Cleardown Module. Rules are evaluated in the order they occur in this collection. | [optional] [default to List<CleardownModuleRule>]
**status** | **String** | The Cleardown Module status. Can be Active, Inactive or Deleted. Defaults to Active. | [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CleardownModuleResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String CleardownModuleCode = "example CleardownModuleCode";
ResourceId ChartOfAccountsId = new ResourceId();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<CleardownModuleRule> Rules = new List<CleardownModuleRule>();
String Status = "example Status";
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CleardownModuleResponse cleardownModuleResponseInstance = new CleardownModuleResponse()
    .Href(Href)
    .CleardownModuleCode(CleardownModuleCode)
    .ChartOfAccountsId(ChartOfAccountsId)
    .DisplayName(DisplayName)
    .Description(Description)
    .Rules(Rules)
    .Status(Status)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
