# com.finbourne.lusid.model.PartnerStatementLineDifference
One figure that differs between two partner statements.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the figure. | [default to String]
**before** | **java.math.BigDecimal** | The figure on the statement compared against. | [optional] [default to java.math.BigDecimal]
**after** | **java.math.BigDecimal** | The figure on this statement. | [optional] [default to java.math.BigDecimal]
**change** | **java.math.BigDecimal** | After less before. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerStatementLineDifference;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
@jakarta.annotation.Nullable java.math.BigDecimal Before = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal After = new java.math.BigDecimal("100.00");
java.math.BigDecimal Change = new java.math.BigDecimal("100.00");


PartnerStatementLineDifference partnerStatementLineDifferenceInstance = new PartnerStatementLineDifference()
    .Key(Key)
    .Before(Before)
    .After(After)
    .Change(Change);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
