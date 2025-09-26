# com.finbourne.lusid.model.AccountsUpsertResponse
The upsert accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**accounts** | [**List&lt;Account&gt;**](Account.md) | The Accounts which have been upserted. | [optional] [default to List<Account>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.AccountsUpsertResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Account> Accounts = new List<Account>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


AccountsUpsertResponse accountsUpsertResponseInstance = new AccountsUpsertResponse()
    .Href(Href)
    .Version(Version)
    .Accounts(Accounts)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
