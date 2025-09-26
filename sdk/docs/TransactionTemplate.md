# com.finbourne.lusid.model.TransactionTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentType** | **String** | A value that represents the instrument type. | [default to String]
**instrumentEventType** | **String** | A value that represents the instrument event type. | [default to String]
**description** | **String** | The description of the transaction template. | [default to String]
**scope** | **String** | The scope in which the transaction template resides. | [default to String]
**componentTransactions** | [**List&lt;ComponentTransaction&gt;**](ComponentTransaction.md) | A set of component transactions that relate to the template to be created. | [default to List<ComponentTransaction>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransactionTemplate;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InstrumentType = "example InstrumentType";
String InstrumentEventType = "example InstrumentEventType";
String Description = "example Description";
String Scope = "example Scope";
List<ComponentTransaction> ComponentTransactions = new List<ComponentTransaction>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransactionTemplate transactionTemplateInstance = new TransactionTemplate()
    .InstrumentType(InstrumentType)
    .InstrumentEventType(InstrumentEventType)
    .Description(Description)
    .Scope(Scope)
    .ComponentTransactions(ComponentTransactions)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
