# com.finbourne.lusid.model.AllocationEventTransferConsideration
The consideration paid for a transferred capital interest.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | The consideration amount. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the consideration. | [default to String]
**recordOnly** | **Boolean** | Whether the consideration is recorded for reference only, with no cash movement booked. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.AllocationEventTransferConsideration;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
Boolean RecordOnly = true;


AllocationEventTransferConsideration allocationEventTransferConsiderationInstance = new AllocationEventTransferConsideration()
    .Amount(Amount)
    .Currency(Currency)
    .RecordOnly(RecordOnly);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
