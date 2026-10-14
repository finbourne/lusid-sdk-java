# com.finbourne.lusid.model.UnattributedAmount
An amount on the income summary an allocation run could not attribute to any pool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**glCode** | **String** | The general ledger account the unattributed amount sits in. | [default to String]
**amount** | **java.math.BigDecimal** | The amount allocated to the partner. | [default to java.math.BigDecimal]
**reason** | **String** | Why the amount could not be attributed. | [default to String]

```java
import com.finbourne.lusid.model.UnattributedAmount;
import java.util.*;
import java.lang.System;
import java.net.URI;

String GlCode = "example GlCode";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Reason = "example Reason";


UnattributedAmount unattributedAmountInstance = new UnattributedAmount()
    .GlCode(GlCode)
    .Amount(Amount)
    .Reason(Reason);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
