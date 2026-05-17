# com.finbourne.lusid.model.UnsettledTransaction
A transaction that remains unsettled as at the valuation point, with per-bucket settlement status.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transaction** | [**OutputTransaction**](OutputTransaction.md) |  | [optional] [default to OutputTransaction]
**portfolioId** | [**PortfolioId**](PortfolioId.md) |  | [optional] [default to PortfolioId]
**overallSettlementStatus** | **String** | The overall settlement status of the transaction (Unsettled, PartSettled, Settled, None). | [optional] [default to String]
**overallIsOverdue** | **Boolean** | Whether the transaction is overdue for settlement. | [optional] [default to Boolean]
**cashSettlementStatus** | **String** | The settlement status of the cash component. | [optional] [default to String]
**cashIsOverdue** | **Boolean** | Whether the cash component is overdue for settlement. | [optional] [default to Boolean]
**stockSettlementStatus** | **String** | The settlement status of the stock component. | [optional] [default to String]
**stockIsOverdue** | **Boolean** | Whether the stock component is overdue for settlement. | [optional] [default to Boolean]
**deferredCashSettlementStatus** | **String** | The settlement status of the deferred cash component. | [optional] [default to String]
**deferredCashIsOverdue** | **Boolean** | Whether the deferred cash component is overdue for settlement. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.UnsettledTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

OutputTransaction Transaction = new OutputTransaction();
PortfolioId PortfolioId = new PortfolioId();
@jakarta.annotation.Nullable String OverallSettlementStatus = "example OverallSettlementStatus";
Boolean OverallIsOverdue = true;
@jakarta.annotation.Nullable String CashSettlementStatus = "example CashSettlementStatus";
Boolean CashIsOverdue = true;
@jakarta.annotation.Nullable String StockSettlementStatus = "example StockSettlementStatus";
Boolean StockIsOverdue = true;
@jakarta.annotation.Nullable String DeferredCashSettlementStatus = "example DeferredCashSettlementStatus";
Boolean DeferredCashIsOverdue = true;


UnsettledTransaction unsettledTransactionInstance = new UnsettledTransaction()
    .Transaction(Transaction)
    .PortfolioId(PortfolioId)
    .OverallSettlementStatus(OverallSettlementStatus)
    .OverallIsOverdue(OverallIsOverdue)
    .CashSettlementStatus(CashSettlementStatus)
    .CashIsOverdue(CashIsOverdue)
    .StockSettlementStatus(StockSettlementStatus)
    .StockIsOverdue(StockIsOverdue)
    .DeferredCashSettlementStatus(DeferredCashSettlementStatus)
    .DeferredCashIsOverdue(DeferredCashIsOverdue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
