# com.finbourne.lusid.model.FeeTypeRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | [default to String]
**displayName** | **String** | The name of the fee type. | [default to String]
**description** | **String** | The description of the fee type. | [optional] [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the fee type to be created. | [default to List<ComponentTransaction>]

```java
import com.finbourne.lusid.model.FeeTypeRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
List<ComponentTransaction> ComponentTransactions = new List<ComponentTransaction>();


FeeTypeRequest feeTypeRequestInstance = new FeeTypeRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .ComponentTransactions(ComponentTransactions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
