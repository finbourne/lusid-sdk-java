# com.finbourne.lusid.model.VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version** | [**Version**](Version.md) |  | [default to Version]
**values** | [**List&lt;SettlementInstructionWithTransaction&gt;**](SettlementInstructionWithTransaction.md) | The resources to list. | [default to List<SettlementInstructionWithTransaction>]
**href** | [**URI**](URI.md) | The URI of the resource list. | [optional] [default to URI]
**postBody** | [**SettlementInstructionQuery**](SettlementInstructionQuery.md) |  | [optional] [default to SettlementInstructionQuery]
**nextPage** | [**SettlementInstructionQuery**](SettlementInstructionQuery.md) |  | [optional] [default to SettlementInstructionQuery]
**previousPage** | [**SettlementInstructionQuery**](SettlementInstructionQuery.md) |  | [optional] [default to SettlementInstructionQuery]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

Version Version = new Version();
List<SettlementInstructionWithTransaction> Values = new List<SettlementInstructionWithTransaction>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
SettlementInstructionQuery PostBody = new SettlementInstructionQuery();
SettlementInstructionQuery NextPage = new SettlementInstructionQuery();
SettlementInstructionQuery PreviousPage = new SettlementInstructionQuery();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery versionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQueryInstance = new VersionedResourceListWithPostBodiesOfSettlementInstructionWithTransactionToSettlementInstructionQuery()
    .Version(Version)
    .Values(Values)
    .Href(Href)
    .PostBody(PostBody)
    .NextPage(NextPage)
    .PreviousPage(PreviousPage)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
