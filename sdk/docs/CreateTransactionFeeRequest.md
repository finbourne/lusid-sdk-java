# com.finbourne.lusid.model.CreateTransactionFeeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The display name of the transaction fee. | [default to String]
**description** | **String** | A description of the transaction fee. | [default to String]
**calculation** | [**FeeCalculationRequest**](FeeCalculationRequest.md) |  | [default to FeeCalculationRequest]
**conditions** | **List&lt;String&gt;** | The conditions that the transaction must meet in order for the fee to be applied. | [default to List<String>]
**capitalised** | **String** | Specifies whether the fee should be capitalised, not capitalised or conditionally capitalised. | [default to String]
**capitalisationCondition** | **String** | If the fee Capitalisation is Conditional, this condition determines whether the fee is capitalised, when applied to the transaction. | [optional] [default to String]
**txnPropertyKey** | **String** | The property key to which the fee value will be applied and decorated onto the transaction. Must be in the &#39;Transaction&#39; property domain. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the transaction fee. | [optional] [default to Map<String, Property>]
**isActive** | **Boolean** | Indicates whether the transaction fee is currently active and should be applied to transactions. Optional when creating a transaction fee, defaults to true, if a value is not provided. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.CreateTransactionFeeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
String Description = "example Description";
FeeCalculationRequest Calculation = new FeeCalculationRequest();
List<String> Conditions = new List<String>();
String Capitalised = "example Capitalised";
@jakarta.annotation.Nullable String CapitalisationCondition = "example CapitalisationCondition";
String TxnPropertyKey = "example TxnPropertyKey";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Boolean IsActive = true;


CreateTransactionFeeRequest createTransactionFeeRequestInstance = new CreateTransactionFeeRequest()
    .Name(Name)
    .Description(Description)
    .Calculation(Calculation)
    .Conditions(Conditions)
    .Capitalised(Capitalised)
    .CapitalisationCondition(CapitalisationCondition)
    .TxnPropertyKey(TxnPropertyKey)
    .Properties(Properties)
    .IsActive(IsActive);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
