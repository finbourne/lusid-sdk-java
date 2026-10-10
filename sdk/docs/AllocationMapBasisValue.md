# com.finbourne.lusid.model.AllocationMapBasisValue
The value one investor record is weighted by when an Allocation Map is resolved.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**investorRecordId** | **String** | The investor record the basis value belongs to. | [default to String]
**basisValue** | **java.math.BigDecimal** | The value the investor record is weighted by, for example its commitment. | [default to java.math.BigDecimal]
**currency** | **String** | The currency the basis value is held in. Absent means the base currency of the map&#39;s member fund. When the basis values span more than one currency, each is translated into the fund&#39;s base currency at the spot rate on the event date, from the fund&#39;s ABOR recipe, before it weights the allocation. The rate on the event date is the latest quote at or before 00:00 UTC on that date. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationMapBasisValue;
import java.util.*;
import java.lang.System;
import java.net.URI;

String InvestorRecordId = "example InvestorRecordId";
java.math.BigDecimal BasisValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";


AllocationMapBasisValue allocationMapBasisValueInstance = new AllocationMapBasisValue()
    .InvestorRecordId(InvestorRecordId)
    .BasisValue(BasisValue)
    .Currency(Currency);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
