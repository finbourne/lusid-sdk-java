# com.finbourne.lusid.model.PortfolioSettlementConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stockSettlement** | [**SettlementConfigurationCategory**](SettlementConfigurationCategory.md) |  | [optional] [default to SettlementConfigurationCategory]
**cashSettlement** | [**SettlementConfigurationCategory**](SettlementConfigurationCategory.md) |  | [optional] [default to SettlementConfigurationCategory]
**deferredCashReceipt** | [**SettlementConfigurationCategory**](SettlementConfigurationCategory.md) |  | [optional] [default to SettlementConfigurationCategory]
**transactionMatchingAlternativeId** | [**TransactionMatchingAlternativeId**](TransactionMatchingAlternativeId.md) |  | [optional] [default to TransactionMatchingAlternativeId]

```java
import com.finbourne.lusid.model.PortfolioSettlementConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

SettlementConfigurationCategory StockSettlement = new SettlementConfigurationCategory();
SettlementConfigurationCategory CashSettlement = new SettlementConfigurationCategory();
SettlementConfigurationCategory DeferredCashReceipt = new SettlementConfigurationCategory();
TransactionMatchingAlternativeId TransactionMatchingAlternativeId = new TransactionMatchingAlternativeId();


PortfolioSettlementConfiguration portfolioSettlementConfigurationInstance = new PortfolioSettlementConfiguration()
    .StockSettlement(StockSettlement)
    .CashSettlement(CashSettlement)
    .DeferredCashReceipt(DeferredCashReceipt)
    .TransactionMatchingAlternativeId(TransactionMatchingAlternativeId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
