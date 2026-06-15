# com.finbourne.lusid.model.SettlementActivityQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt time at which to query settlement activity. Defaults to latest. | [optional] [default to OffsetDateTime]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | The portfolios and / or portfolio groups to query. At least one entry is required. | [optional] [default to List<PortfolioEntityId>]
**startActivityDate** | **String** | Lower bound (inclusive) of the activity date range. If not set, no lower bound is applied. | [optional] [default to String]
**endActivityDate** | **String** | Upper bound (inclusive) of the activity date range. Defaults to the current date and time. Treated as effectiveAt. | [optional] [default to String]
**filter** | **String** | A LUSID standard filter expression. Supports traversal into transaction and settlementInstruction. | [optional] [default to String]
**settlementInstructionPropertyKeys** | **List&lt;String&gt;** | Settlement instruction property keys to populate on the response. Behaviour matches BuildSettlementInstructions. | [optional] [default to List<String>]
**transactionPropertyKeys** | **List&lt;String&gt;** | Transaction property keys to populate on the response. Behaviour matches BuildSettlementInstructions. | [optional] [default to List<String>]
**limit** | **Integer** | Page size limit; standard pagination control. Defaults to 5000. | [optional] [default to Integer]
**page** | **String** | Pagination cursor returned by a previous response. | [optional] [default to String]

```java
import com.finbourne.lusid.model.SettlementActivityQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
@jakarta.annotation.Nullable String StartActivityDate = "example StartActivityDate";
@jakarta.annotation.Nullable String EndActivityDate = "example EndActivityDate";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable List<String> SettlementInstructionPropertyKeys = new List<String>();
@jakarta.annotation.Nullable List<String> TransactionPropertyKeys = new List<String>();
@jakarta.annotation.Nullable Integer Limit = new Integer("100.00");
@jakarta.annotation.Nullable String Page = "example Page";


SettlementActivityQuery settlementActivityQueryInstance = new SettlementActivityQuery()
    .AsAt(AsAt)
    .PortfolioEntityIds(PortfolioEntityIds)
    .StartActivityDate(StartActivityDate)
    .EndActivityDate(EndActivityDate)
    .Filter(Filter)
    .SettlementInstructionPropertyKeys(SettlementInstructionPropertyKeys)
    .TransactionPropertyKeys(TransactionPropertyKeys)
    .Limit(Limit)
    .Page(Page);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
