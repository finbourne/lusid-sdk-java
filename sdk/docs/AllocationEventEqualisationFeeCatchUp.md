# com.finbourne.lusid.model.AllocationEventEqualisationFeeCatchUp
The management fees one admitted partner owes from the first fee date to the close, as an explicit amount.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The admitted partner the fee catch-up is charged to. | [default to String]
**amount** | **java.math.BigDecimal** | The fee catch-up in the event currency. Must not be negative. | [default to java.math.BigDecimal]
**dueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the fee would have been due had the partner been admitted at the first close, from which interest on it accrues when charged. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AllocationEventEqualisationFeeCatchUp;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime DueDate = OffsetDateTime.now();


AllocationEventEqualisationFeeCatchUp allocationEventEqualisationFeeCatchUpInstance = new AllocationEventEqualisationFeeCatchUp()
    .InvestorRecordId(InvestorRecordId)
    .Amount(Amount)
    .DueDate(DueDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
