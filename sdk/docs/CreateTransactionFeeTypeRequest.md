# com.finbourne.lusid.model.CreateTransactionFeeTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the transaction fee type. | [default to String]
**description** | **String** | A description of the transaction fee type. | [default to String]
**calculation** | [**FeeCalculationRequest**](FeeCalculationRequest.md) |  | [default to FeeCalculationRequest]
**condition** | **String** | The condition that the transaction must meet in order for the fee to be applied. | [default to String]
**txnPropertyKey** | **String** | The property key to which the fee value will be applied and decorated onto the transaction. Must be in the &#39;Transaction&#39; property domain. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the transaction fee type. | [optional] [default to Map<String, Property>]
**isActive** | **Boolean** | Indicates whether the transaction fee type is currently active and should be applied to transactions. Optional when creating a transaction fee type, defaults to true, if a value is not provided. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CreateTransactionFeeTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DisplayName = "example DisplayName";
String Description = "example Description";
FeeCalculationRequest Calculation = new FeeCalculationRequest();
String Condition = "example Condition";
String TxnPropertyKey = "example TxnPropertyKey";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Boolean IsActive = true;


CreateTransactionFeeTypeRequest createTransactionFeeTypeRequestInstance = new CreateTransactionFeeTypeRequest()
    .DisplayName(DisplayName)
    .Description(Description)
    .Calculation(Calculation)
    .Condition(Condition)
    .TxnPropertyKey(TxnPropertyKey)
    .Properties(Properties)
    .IsActive(IsActive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
