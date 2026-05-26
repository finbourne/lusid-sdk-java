# com.finbourne.lusid.model.NavSettlementConfigurationCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**calculateInstructionToPortfolioRate** | **Boolean** | An optional flag that allows for the calculation of the instruction to portfolio rate for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. | [optional] [default to Boolean]
**calculateTradeDateToSettlementFxPnL** | **Boolean** | An optional flag that allows for the calculation of FxPnL between Trade and Settlement Date. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.NavSettlementConfigurationCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Boolean CalculateInstructionToPortfolioRate = true;
@jakarta.annotation.Nullable Boolean CalculateTradeDateToSettlementFxPnL = true;


NavSettlementConfigurationCategory navSettlementConfigurationCategoryInstance = new NavSettlementConfigurationCategory()
    .CalculateInstructionToPortfolioRate(CalculateInstructionToPortfolioRate)
    .CalculateTradeDateToSettlementFxPnL(CalculateTradeDateToSettlementFxPnL);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
