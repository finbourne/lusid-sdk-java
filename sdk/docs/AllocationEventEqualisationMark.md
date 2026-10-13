# com.finbourne.lusid.model.AllocationEventEqualisationMark
A valuation move already allocated to the existing partners that the close re-trues to the admitted partners.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**originMemberShortCode** | **String** | The member of the structure the mark belongs to. | [default to String]
**amount** | **java.math.BigDecimal** | The valuation move already allocated, in the event currency. Negative for a fall in value or an expense. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationEventEqualisationMark;
import java.util.*;
import java.lang.System;
import java.net.URI;

String OriginMemberShortCode = "example OriginMemberShortCode";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


AllocationEventEqualisationMark allocationEventEqualisationMarkInstance = new AllocationEventEqualisationMark()
    .OriginMemberShortCode(OriginMemberShortCode)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
