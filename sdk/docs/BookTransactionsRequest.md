# com.finbourne.lusid.model.BookTransactionsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocationIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | A collection of Allocation IDs | [default to List<ResourceId>]
**transactionProperties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | A collection of properties | [optional] [default to Map<String, PerpetualProperty>]
**fxInstrumentType** | **String** | The type of FX instrument to create when settlement currency differs from portfolio base currency. Use None to suppress FX instrument and order creation. Defaults to None. Available values: None, FxForward, FxSpot. | [optional] [default to String]

```java
import com.finbourne.lusid.model.BookTransactionsRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<ResourceId> AllocationIds = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> TransactionProperties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String FxInstrumentType = "example FxInstrumentType";


BookTransactionsRequest bookTransactionsRequestInstance = new BookTransactionsRequest()
    .AllocationIds(AllocationIds)
    .TransactionProperties(TransactionProperties)
    .FxInstrumentType(FxInstrumentType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
