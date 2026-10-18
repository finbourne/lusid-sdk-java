# com.finbourne.lusid.model.MarginRunIssue
Something a margin run could not do for some of its agreements, and why.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agreements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collateral agreements the issue concerns. | [default to List<ResourceId>]
**detail** | **String** | What prevented the agreements from being valued. | [default to String]
**shardId** | **String** | The shard the issue arose in, when it arose while valuing. | [optional] [default to String]

```java
import com.finbourne.lusid.model.MarginRunIssue;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> Agreements = new List<ResourceId>();
String Detail = "example Detail";
@jakarta.annotation.Nullable String ShardId = "example ShardId";


MarginRunIssue marginRunIssueInstance = new MarginRunIssue()
    .Agreements(Agreements)
    .Detail(Detail)
    .ShardId(ShardId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
