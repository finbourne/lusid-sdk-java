# com.finbourne.lusid.model.PortfolioTransactionResult
Represents transaction details for a data quality check result.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **String** | The type of the entity. Always \&quot;Transaction\&quot;. | [optional] [default to String]
**transactionView** | **String** | Whether this is an input or an output transaction | [optional] [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The as-at timestamp for the transaction | [optional] [default to OffsetDateTime]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The transaction date | [optional] [default to OffsetDateTime]
**transactionId** | **String** | The transaction&#39;s identifier within its portfolio | [optional] [default to String]
**entityUniqueId** | **String** | The transaction&#39;s unique identifier across portfolios | [optional] [default to String]
**sourcePortfolioScope** | **String** | The scope of the portfolio this transaction came from | [optional] [default to String]
**sourcePortfolioCode** | **String** | The code of the portfolio this transaction came from | [optional] [default to String]
**sourcePortfolioEntityUniqueId** | **String** | The unique identifier of the portfolio this transaction came from | [optional] [default to String]
**sourcePortfolioDisplayName** | **String** | The display name of the portfolio this transaction came from | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument identifier of the instrument transacted | [optional] [default to String]
**instrumentDisplayName** | **String** | The name of the instrument transacted | [optional] [default to String]
**transactionType** | **String** | The transaction type, e.g. Buy, Sell | [optional] [default to String]

```java
import com.finbourne.lusid.model.PortfolioTransactionResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String EntityType = "example EntityType";
@jakarta.annotation.Nullable String TransactionView = "example TransactionView";
OffsetDateTime AsAt = OffsetDateTime.now();
OffsetDateTime TransactionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
@jakarta.annotation.Nullable String SourcePortfolioScope = "example SourcePortfolioScope";
@jakarta.annotation.Nullable String SourcePortfolioCode = "example SourcePortfolioCode";
@jakarta.annotation.Nullable String SourcePortfolioEntityUniqueId = "example SourcePortfolioEntityUniqueId";
@jakarta.annotation.Nullable String SourcePortfolioDisplayName = "example SourcePortfolioDisplayName";
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable String InstrumentDisplayName = "example InstrumentDisplayName";
@jakarta.annotation.Nullable String TransactionType = "example TransactionType";


PortfolioTransactionResult portfolioTransactionResultInstance = new PortfolioTransactionResult()
    .EntityType(EntityType)
    .TransactionView(TransactionView)
    .AsAt(AsAt)
    .TransactionDate(TransactionDate)
    .TransactionId(TransactionId)
    .EntityUniqueId(EntityUniqueId)
    .SourcePortfolioScope(SourcePortfolioScope)
    .SourcePortfolioCode(SourcePortfolioCode)
    .SourcePortfolioEntityUniqueId(SourcePortfolioEntityUniqueId)
    .SourcePortfolioDisplayName(SourcePortfolioDisplayName)
    .LusidInstrumentId(LusidInstrumentId)
    .InstrumentDisplayName(InstrumentDisplayName)
    .TransactionType(TransactionType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
