# com.finbourne.lusid.model.TaxReturnSpreadInstalment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourcePeriodId** | **String** | The label of the period whose deemed disposal is being spread. | [optional] [default to String]
**periodId** | **String** | The label of the period the amount falls into. | [optional] [default to String]
**fraction** | **java.math.BigDecimal** | The fraction of the source period&#39;s spread amount that falls into the period. | [optional] [default to java.math.BigDecimal]
**amount** | **java.math.BigDecimal** | The amount, in pounds. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxReturnSpreadInstalment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String SourcePeriodId = "example SourcePeriodId";
@jakarta.annotation.Nullable String PeriodId = "example PeriodId";
java.math.BigDecimal Fraction = new java.math.BigDecimal("100.00");
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


TaxReturnSpreadInstalment taxReturnSpreadInstalmentInstance = new TaxReturnSpreadInstalment()
    .SourcePeriodId(SourcePeriodId)
    .PeriodId(PeriodId)
    .Fraction(Fraction)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
