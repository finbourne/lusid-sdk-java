# com.finbourne.lusid.model.PortfolioTransactionDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"PortfolioContents\" and datasetSchema.entityType = \"Transaction\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**fromEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The earliest transaction date to check, inclusive. Nullable. Unbounded if not provided. | [optional] [default to OffsetDateTime]
**toEffectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The latest transaction date to check, inclusive. Nullable — the window is unbounded above if not  provided. This value also resolves as the run&#39;s effectiveAt, so portfolios are resolved and transactions  decorated as of it; when not provided, that defaults to latest. Must be on or after fromEffectiveDate  when both are provided. | [optional] [default to OffsetDateTime]
**portfolioScope** | **String** | The scope of the portfolios whose transactions to check. Nullable. Every scope is checked if not provided. | [optional] [default to String]
**portfolioSelectorAttribute** | **String** | An attribute (field name or propertyKey) to use to narrow down the portfolios whose transactions are  checked. Cannot be provided without portfolioSelectorValue, and vice versa. | [optional] [default to String]
**portfolioSelectorValue** | **String** | The value of the above attribute used to narrow down the portfolios. Cannot be provided without  portfolioSelectorAttribute, and vice versa. | [optional] [default to String]
**transactionSelectorAttribute** | **String** | An attribute (field name or propertyKey) to use to narrow down the transactions checked within those  portfolios. Cannot be provided without transactionSelectorValue, and vice versa. | [optional] [default to String]
**transactionSelectorValue** | **String** | The value of the above attribute used to narrow down the transactions. Cannot be provided without  transactionSelectorAttribute, and vice versa. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PortfolioTransactionDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime FromEffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime ToEffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String PortfolioScope = "example PortfolioScope";
@jakarta.annotation.Nullable String PortfolioSelectorAttribute = "example PortfolioSelectorAttribute";
@jakarta.annotation.Nullable String PortfolioSelectorValue = "example PortfolioSelectorValue";
@jakarta.annotation.Nullable String TransactionSelectorAttribute = "example TransactionSelectorAttribute";
@jakarta.annotation.Nullable String TransactionSelectorValue = "example TransactionSelectorValue";


PortfolioTransactionDataset portfolioTransactionDatasetInstance = new PortfolioTransactionDataset()
    .AsAt(AsAt)
    .FromEffectiveDate(FromEffectiveDate)
    .ToEffectiveDate(ToEffectiveDate)
    .PortfolioScope(PortfolioScope)
    .PortfolioSelectorAttribute(PortfolioSelectorAttribute)
    .PortfolioSelectorValue(PortfolioSelectorValue)
    .TransactionSelectorAttribute(TransactionSelectorAttribute)
    .TransactionSelectorValue(TransactionSelectorValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
