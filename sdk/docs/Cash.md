# com.finbourne.lusid.model.Cash
LUSID representation of Cash which is the sum of one or more cashflows from the past.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**amount** | **java.math.BigDecimal** | Cash amount. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.Cash;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DomCcy = "example DomCcy";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


Cash cashInstance = new Cash()
    .DomCcy(DomCcy)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
