# com.finbourne.lusid.model.WithholdingTaxAlternativeMatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ifValues** | **Map&lt;String, String&gt;** | The values of the unresolved dimensions that choose this row, one or more. | [default to Map<String, String>]
**matchedRuleId** | **String** | The identifier booking would stamp for the row that these values choose. | [default to String]
**stopAtSourceRate** | **java.math.BigDecimal** | The rate that this row would withhold at source. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.WithholdingTaxAlternativeMatch;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> IfValues = new Map<String, String>();
String MatchedRuleId = "example MatchedRuleId";
java.math.BigDecimal StopAtSourceRate = new java.math.BigDecimal("100.00");


WithholdingTaxAlternativeMatch withholdingTaxAlternativeMatchInstance = new WithholdingTaxAlternativeMatch()
    .IfValues(IfValues)
    .MatchedRuleId(MatchedRuleId)
    .StopAtSourceRate(StopAtSourceRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
