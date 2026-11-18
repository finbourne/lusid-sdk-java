# com.finbourne.lusid.model.ReactivatedNavTypesResponse
The response from reactivating NAV types on a fund. Contains the updated fund and, for each  reactivated follower, the number of valuation points finalised while the follower was dormant.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**fund** | [**Fund**](Fund.md) |  | [default to Fund]
**catchUpCounts** | [**List&lt;NavTypeCatchUp&gt;**](NavTypeCatchUp.md) | For each reactivated follower, the number of valuation points the leader finalised while the follower was dormant. Leaders are not included (they have no catch-up). | [optional] [default to List<NavTypeCatchUp>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ReactivatedNavTypesResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Fund Fund = new Fund();
@jakarta.annotation.Nullable List<NavTypeCatchUp> CatchUpCounts = new List<NavTypeCatchUp>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ReactivatedNavTypesResponse reactivatedNavTypesResponseInstance = new ReactivatedNavTypesResponse()
    .Href(Href)
    .Fund(Fund)
    .CatchUpCounts(CatchUpCounts)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
