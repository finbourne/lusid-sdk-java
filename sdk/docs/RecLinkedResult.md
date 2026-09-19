# com.finbourne.lusid.model.RecLinkedResult
A rec result of a different rec type in the same rec instance whose items share an identifier with this  result's items, and the keys that established the link. Links are symmetric: the linked result carries one back.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the linked result, as carried in that result&#39;s own id field. | [default to String]
**recType** | **String** | The rec type of the linked result. Always differs from this result&#39;s rec type. Available values: Holding, CashHolding, Valuation, InputTransaction, OutputTransaction, SettlementActivity. | [default to String]
**linkedBy** | [**RecLinkedBy**](RecLinkedBy.md) |  | [default to RecLinkedBy]

```java
import com.finbourne.lusid.model.RecLinkedResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Id = "example Id";
String RecType = "example RecType";
RecLinkedBy LinkedBy = new RecLinkedBy();


RecLinkedResult recLinkedResultInstance = new RecLinkedResult()
    .Id(Id)
    .RecType(RecType)
    .LinkedBy(LinkedBy);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
