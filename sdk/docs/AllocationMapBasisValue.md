# com.finbourne.lusid.model.AllocationMapBasisValue
The value one investor record is weighted by when an Allocation Map is resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the basis value belongs to. | [default to String]
**basisValue** | **java.math.BigDecimal** | The value the investor record is weighted by, for example its commitment. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationMapBasisValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal BasisValue = new java.math.BigDecimal("100.00");


AllocationMapBasisValue allocationMapBasisValueInstance = new AllocationMapBasisValue()
    .InvestorRecordId(InvestorRecordId)
    .BasisValue(BasisValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
