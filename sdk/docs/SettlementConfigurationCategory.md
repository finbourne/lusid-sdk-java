# com.finbourne.lusid.model.SettlementConfigurationCategory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **String** | The method of settlement for the movements of the relevant type(s). Allowed values: &#39;Automatic&#39; and &#39;Instructed&#39;. A value of &#39;Instructed&#39; means that such movements can only be settled with a SettlementInstruction. A value of &#39;Automatic&#39; means that such movements will settle automatically but a SettlementInstruction will still override automatic settlement. | [optional] [default to String]
**calculateInstructionToPortfolioRate** | **Boolean** | An optional flag that allows for the calculation of the instruction to portfolio rate for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. Defaults to false if not specified. | [optional] [default to Boolean]
**calculateInLieuSettlementAmount** | **Boolean** | An optional flag that allows for the calculation of the in lieu amount for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. Defaults to false if not specified. | [optional] [default to Boolean]
**methodOverride** | [**SettlementConfigurationMethodOverride**](SettlementConfigurationMethodOverride.md) |  | [optional] [default to SettlementConfigurationMethodOverride]
**calculateTradeDateToSettlementFxPnL** | **Boolean** | An optional flag that allows for the calculation of the in lieu amount for instructions with settlement category CashSettlement or DeferredCashReceipt, if it is not provided on the settlement instruction. Defaults to false if not specified. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.SettlementConfigurationCategory;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Method = "example Method";
Boolean CalculateInstructionToPortfolioRate = true;
Boolean CalculateInLieuSettlementAmount = true;
SettlementConfigurationMethodOverride MethodOverride = new SettlementConfigurationMethodOverride();
Boolean CalculateTradeDateToSettlementFxPnL = true;


SettlementConfigurationCategory settlementConfigurationCategoryInstance = new SettlementConfigurationCategory()
    .Method(Method)
    .CalculateInstructionToPortfolioRate(CalculateInstructionToPortfolioRate)
    .CalculateInLieuSettlementAmount(CalculateInLieuSettlementAmount)
    .MethodOverride(MethodOverride)
    .CalculateTradeDateToSettlementFxPnL(CalculateTradeDateToSettlementFxPnL);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
