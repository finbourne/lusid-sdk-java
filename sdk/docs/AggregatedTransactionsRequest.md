# com.finbourne.lusid.model.AggregatedTransactionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fromTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The set of portfolio or portfolio group identifiers containing the relevant transactions. | [optional] [default to List<PortfolioEntityId>]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**metrics** | [**List&lt;AggregateSpec&gt;**](AggregateSpec.md) |  | [default to List<AggregateSpec>]
**groupBy** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**filters** | [**List&lt;PropertyFilter&gt;**](PropertyFilter.md) |  | [optional] [default to List<PropertyFilter>]
**sort** | [**List&lt;OrderBySpec&gt;**](OrderBySpec.md) |  | [optional] [default to List<OrderBySpec>]

```java
import com.finbourne.lusid.model.AggregatedTransactionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime FromTransactionDate = OffsetDateTime.now();
OffsetDateTime ToTransactionDate = OffsetDateTime.now();
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
List<AggregateSpec> Metrics = new List<AggregateSpec>();
@jakarta.annotation.Nullable List<String> GroupBy = new List<String>();
@jakarta.annotation.Nullable List<PropertyFilter> Filters = new List<PropertyFilter>();
@jakarta.annotation.Nullable List<OrderBySpec> Sort = new List<OrderBySpec>();


AggregatedTransactionsRequest aggregatedTransactionsRequestInstance = new AggregatedTransactionsRequest()
    .FromTransactionDate(FromTransactionDate)
    .ToTransactionDate(ToTransactionDate)
    .PortfolioId(PortfolioId)
    .PortfolioEntityIds(PortfolioEntityIds)
    .AsAt(AsAt)
    .Metrics(Metrics)
    .GroupBy(GroupBy)
    .Filters(Filters)
    .Sort(Sort);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
