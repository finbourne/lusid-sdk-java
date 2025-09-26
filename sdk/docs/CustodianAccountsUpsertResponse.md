# com.finbourne.lusid.model.CustodianAccountsUpsertResponse
The upsert accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**custodianAccounts** | [**List&lt;CustodianAccount&gt;**](CustodianAccount.md) | The Custodian Accounts which have been upserted. | [optional] [default to List<CustodianAccount>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.CustodianAccountsUpsertResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<CustodianAccount> CustodianAccounts = new List<CustodianAccount>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


CustodianAccountsUpsertResponse custodianAccountsUpsertResponseInstance = new CustodianAccountsUpsertResponse()
    .Href(Href)
    .Version(Version)
    .CustodianAccounts(CustodianAccounts)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
