# com.finbourne.lusid.model.SettlementInstructionQuery

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**startDate** | **String** |  | [optional] [default to String]
**endDate** | **String** |  | [optional] [default to String]
**limit** | **Integer** |  | [optional] [default to Integer]
**page** | **String** |  | [optional] [default to String]
**filter** | **String** |  | [optional] [default to String]
**settlementInstructionPropertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]
**transactionPropertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.SettlementInstructionQuery;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String StartDate = "example StartDate";
@jakarta.annotation.Nullable String EndDate = "example EndDate";
@jakarta.annotation.Nullable Integer Limit = new Integer("100.00");
@jakarta.annotation.Nullable String Page = "example Page";
@jakarta.annotation.Nullable String Filter = "example Filter";
@jakarta.annotation.Nullable List<String> SettlementInstructionPropertyKeys = new List<String>();
@jakarta.annotation.Nullable List<String> TransactionPropertyKeys = new List<String>();


SettlementInstructionQuery settlementInstructionQueryInstance = new SettlementInstructionQuery()
    .AsAt(AsAt)
    .StartDate(StartDate)
    .EndDate(EndDate)
    .Limit(Limit)
    .Page(Page)
    .Filter(Filter)
    .SettlementInstructionPropertyKeys(SettlementInstructionPropertyKeys)
    .TransactionPropertyKeys(TransactionPropertyKeys);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
