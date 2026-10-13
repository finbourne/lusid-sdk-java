# com.finbourne.lusid.model.AllocationEventRefund
Cash the fund owes back to an investor record.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the refund is owed to. | [optional] [default to String]
**amount** | **java.math.BigDecimal** | The amount owed back, in the event currency. | [optional] [default to java.math.BigDecimal]
**reason** | **String** | Why the refund arose: Overpayment or Reversal. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationEventRefund;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Reason = "example Reason";


AllocationEventRefund allocationEventRefundInstance = new AllocationEventRefund()
    .InvestorRecordId(InvestorRecordId)
    .Amount(Amount)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
