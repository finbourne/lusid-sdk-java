# com.finbourne.lusid.model.PartnerStatementLine
One figure on a partner statement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | The key of the figure. | [default to String]
**label** | **String** | The label of the figure. | [default to String]
**amount** | **java.math.BigDecimal** | The amount of the figure. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerStatementLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Key = "example Key";
String Label = "example Label";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");


PartnerStatementLine partnerStatementLineInstance = new PartnerStatementLine()
    .Key(Key)
    .Label(Label)
    .Amount(Amount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
