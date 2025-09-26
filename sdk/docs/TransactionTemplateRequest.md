# com.finbourne.lusid.model.TransactionTemplateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the transaction template. | [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the template to be created. | [default to List<ComponentTransaction>]

```java
import com.finbourne.lusid.model.TransactionTemplateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Description = "example Description";
List<ComponentTransaction> ComponentTransactions = new List<ComponentTransaction>();


TransactionTemplateRequest transactionTemplateRequestInstance = new TransactionTemplateRequest()
    .Description(Description)
    .ComponentTransactions(ComponentTransactions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
