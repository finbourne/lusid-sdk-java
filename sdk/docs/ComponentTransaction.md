# com.finbourne.lusid.model.ComponentTransaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [default to String]
**condition** | **String** |  | [optional] [default to String]
**transactionFieldMap** | [**TransactionFieldMap**](TransactionFieldMap.md) |  | [default to TransactionFieldMap]
**transactionPropertyMap** | [**List&lt;TransactionPropertyMap&gt;**](TransactionPropertyMap.md) |  | [default to List<TransactionPropertyMap>]
**preserveTaxLotStructure** | **Boolean** | Controls if tax lot structure should be preserved when cost base is transferred to a new holding. For example in Spin Off instrument events. | [optional] [default to Boolean]
**marketOpenTimeAdjustments** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.ComponentTransaction;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Condition = "example Condition";
TransactionFieldMap TransactionFieldMap = new TransactionFieldMap();
List<TransactionPropertyMap> TransactionPropertyMap = new List<TransactionPropertyMap>();
@jakarta.annotation.Nullable Boolean PreserveTaxLotStructure = true;
@jakarta.annotation.Nullable List<String> MarketOpenTimeAdjustments = new List<String>();


ComponentTransaction componentTransactionInstance = new ComponentTransaction()
    .DisplayName(DisplayName)
    .Condition(Condition)
    .TransactionFieldMap(TransactionFieldMap)
    .TransactionPropertyMap(TransactionPropertyMap)
    .PreserveTaxLotStructure(PreserveTaxLotStructure)
    .MarketOpenTimeAdjustments(MarketOpenTimeAdjustments);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
