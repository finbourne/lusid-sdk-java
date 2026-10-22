# com.finbourne.lusid.model.MarginRunShard
One valuation shard of a margin run: the agreements it values with one recipe, and how far it has got.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the shard within the run. | [default to String]
**recipeId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**agreements** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The collateral agreements the shard values. | [default to List<ResourceId>]
**status** | **String** | The status of the shard. One of Pending, Running, Completed or Failed. | [default to String]
**callCount** | **Integer** | The number of margin calls the shard published. | [default to Integer]
**lineCount** | **Integer** | The number of margin lines the shard published. | [default to Integer]
**detail** | **String** | Why the shard failed, or which of its netting sets it completed without figures and why. | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the shard was valued: the run&#39;s as-at, or the time of the retry that valued it. Null until the shard has finished. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.MarginRunShard;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
ResourceId RecipeId = new ResourceId();
List<ResourceId> Agreements = new List<ResourceId>();
String Status = "example Status";
Integer CallCount = new Integer("100.00");
Integer LineCount = new Integer("100.00");
@jakarta.annotation.Nullable String Detail = "example Detail";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


MarginRunShard marginRunShardInstance = new MarginRunShard()
    .Id(Id)
    .RecipeId(RecipeId)
    .Agreements(Agreements)
    .Status(Status)
    .CallCount(CallCount)
    .LineCount(LineCount)
    .Detail(Detail)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
