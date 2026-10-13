# com.finbourne.lusid.model.AllocationReceivable
One investor's position on a booked capital call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record. | [optional] [default to String]
**called** | **java.math.BigDecimal** | What the investor record was called for. | [optional] [default to java.math.BigDecimal]
**received** | **java.math.BigDecimal** | What has been received and applied so far. | [optional] [default to java.math.BigDecimal]
**outstanding** | **java.math.BigDecimal** | What is still owed. Never negative: an overpayment becomes a refund payable instead. | [optional] [default to java.math.BigDecimal]
**daysPastDue** | **Integer** | How many days past the due date the outstanding amount is, or zero when not yet due or nothing is owed. | [optional] [default to Integer]
**bucket** | **String** | The ageing bucket: Current, 1-30, 31-60, 61-90 or 90+. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationReceivable;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal Called = new java.math.BigDecimal("100.00");
java.math.BigDecimal Received = new java.math.BigDecimal("100.00");
java.math.BigDecimal Outstanding = new java.math.BigDecimal("100.00");
Integer DaysPastDue = new Integer("100.00");
@jakarta.annotation.Nullable String Bucket = "example Bucket";


AllocationReceivable allocationReceivableInstance = new AllocationReceivable()
    .InvestorRecordId(InvestorRecordId)
    .Called(Called)
    .Received(Received)
    .Outstanding(Outstanding)
    .DaysPastDue(DaysPastDue)
    .Bucket(Bucket);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
