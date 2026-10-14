# com.finbourne.lusid.model.PartyTerms
What one party posts under a margin item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**threshold** | **java.math.BigDecimal** | The exposure that is tolerated before margin is called. Empty means no threshold. | [optional] [default to java.math.BigDecimal]
**independentAmount** | **java.math.BigDecimal** | The independent amount posted in addition to variation margin. | [default to java.math.BigDecimal]
**cashInterest** | [**CashInterest**](CashInterest.md) |  | [optional] [default to CashInterest]

```java
import com.finbourne.lusid.model.PartyTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal Threshold = new java.math.BigDecimal("100.00");
java.math.BigDecimal IndependentAmount = new java.math.BigDecimal("100.00");
CashInterest CashInterest = new CashInterest();


PartyTerms partyTermsInstance = new PartyTerms()
    .Threshold(Threshold)
    .IndependentAmount(IndependentAmount)
    .CashInterest(CashInterest);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
