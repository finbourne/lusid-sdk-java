# com.finbourne.lusid.model.TransactionSettlementSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overallStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]
**stockStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]
**cashStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]
**deferredCashReceiptStatus** | [**CategorySettlementStatus**](CategorySettlementStatus.md) |  | [default to CategorySettlementStatus]

```java
import com.finbourne.lusid.model.TransactionSettlementSummary;
import java.util.*;
import java.lang.System;
import java.net.URI;

CategorySettlementStatus OverallStatus = new CategorySettlementStatus();
CategorySettlementStatus StockStatus = new CategorySettlementStatus();
CategorySettlementStatus CashStatus = new CategorySettlementStatus();
CategorySettlementStatus DeferredCashReceiptStatus = new CategorySettlementStatus();


TransactionSettlementSummary transactionSettlementSummaryInstance = new TransactionSettlementSummary()
    .OverallStatus(OverallStatus)
    .StockStatus(StockStatus)
    .CashStatus(CashStatus)
    .DeferredCashReceiptStatus(DeferredCashReceiptStatus);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
