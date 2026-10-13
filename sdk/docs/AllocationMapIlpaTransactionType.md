# com.finbourne.lusid.model.AllocationMapIlpaTransactionType
The ILPA transaction type an Allocation Map reports one kind of allocation event under, overriding the default.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eventType** | **String** | The kind of allocation event the ILPA transaction type applies to: CapitalCall, Distribution, FeeExpense, ValuationMove, Equalisation, RecallExpiry, Transfer, Default or Commitment. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove, Commitment, Equalisation, RecallExpiry, Transfer, Default, DealFunding. | [default to String]
**ilpaTransactionType** | **String** | The ILPA transaction type events of this kind are reported under, for example &#39;Capital Call: Investments&#39; or &#39;Distribution: Recallable&#39;. Must be a value of the system IlpaTransactionType data type. | [default to String]
**component** | **String** | The component of the event the ILPA transaction type applies to, for example MgmtFee or ROC. Absent means the entry is the default for every component of the event type without an entry of its own. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationMapIlpaTransactionType;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EventType = "example EventType";
String IlpaTransactionType = "example IlpaTransactionType";
@jakarta.annotation.Nullable String Component = "example Component";


AllocationMapIlpaTransactionType allocationMapIlpaTransactionTypeInstance = new AllocationMapIlpaTransactionType()
    .EventType(EventType)
    .IlpaTransactionType(IlpaTransactionType)
    .Component(Component);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
