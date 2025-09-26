# com.finbourne.lusid.model.DeleteAccountsResponse
The delete accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**accountIds** | **List&lt;String&gt;** | The Accounts which have been soft/hard deleted. | [optional] [default to List<String>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DeleteAccountsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
@jakarta.annotation.Nullable List<String> AccountIds = new List<String>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DeleteAccountsResponse deleteAccountsResponseInstance = new DeleteAccountsResponse()
    .Version(Version)
    .AccountIds(AccountIds)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
