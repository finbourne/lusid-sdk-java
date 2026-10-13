# com.finbourne.lusid.model.EqualisationTerms

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** |  | [default to Boolean]
**interestRate** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**dayCountConvention** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.EqualisationTerms;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean Enabled = true;
@jakarta.annotation.Nullable java.math.BigDecimal InterestRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String DayCountConvention = "example DayCountConvention";


EqualisationTerms equalisationTermsInstance = new EqualisationTerms()
    .Enabled(Enabled)
    .InterestRate(InterestRate)
    .DayCountConvention(DayCountConvention);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
