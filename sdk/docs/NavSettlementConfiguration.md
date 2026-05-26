# com.finbourne.lusid.model.NavSettlementConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cashSettlement** | [**NavSettlementConfigurationCategory**](NavSettlementConfigurationCategory.md) |  | [optional] [default to NavSettlementConfigurationCategory]
**deferredCashReceipt** | [**NavSettlementConfigurationCategory**](NavSettlementConfigurationCategory.md) |  | [optional] [default to NavSettlementConfigurationCategory]

```java
import com.finbourne.lusid.model.NavSettlementConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

NavSettlementConfigurationCategory CashSettlement = new NavSettlementConfigurationCategory();
NavSettlementConfigurationCategory DeferredCashReceipt = new NavSettlementConfigurationCategory();


NavSettlementConfiguration navSettlementConfigurationInstance = new NavSettlementConfiguration()
    .CashSettlement(CashSettlement)
    .DeferredCashReceipt(DeferredCashReceipt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
