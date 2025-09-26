# com.finbourne.lusid.model.DeleteCustodianAccountsResponse
The delete custodian accounts response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**custodianAccountIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The Custodian Accounts which have been soft/hard deleted. | [optional] [default to List<ResourceId>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.DeleteCustodianAccountsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
@jakarta.annotation.Nullable List<ResourceId> CustodianAccountIds = new List<ResourceId>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


DeleteCustodianAccountsResponse deleteCustodianAccountsResponseInstance = new DeleteCustodianAccountsResponse()
    .Version(Version)
    .CustodianAccountIds(CustodianAccountIds)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
