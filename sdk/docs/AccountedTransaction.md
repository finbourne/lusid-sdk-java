# com.finbourne.lusid.model.AccountedTransaction
The Valuation Point Data Response for the Fund and specified date.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The transaction&#39;s accounting date. | [optional] [default to OffsetDateTime]
**journalEntryAction** | **String** | The journal entry line action associated with this transaction. | [optional] [default to String]
**transaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]
**portfolioId** | [**PortfolioId**](PortfolioId.md) |  | [optional] [default to PortfolioId]

```java
import com.finbourne.lusid.model.AccountedTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AccountingDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String JournalEntryAction = "example JournalEntryAction";
OutputTransaction Transaction = new OutputTransaction();
PortfolioId PortfolioId = new PortfolioId();


AccountedTransaction accountedTransactionInstance = new AccountedTransaction()
    .AccountingDate(AccountingDate)
    .JournalEntryAction(JournalEntryAction)
    .Transaction(Transaction)
    .PortfolioId(PortfolioId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
