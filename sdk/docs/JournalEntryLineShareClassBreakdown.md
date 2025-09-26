# com.finbourne.lusid.model.JournalEntryLineShareClassBreakdown
The apportionment from overall fund level journal entry Line to the share class.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shortCode** | **String** | The share class identifier. | [optional] [default to String]
**apportionmentFactor** | **java.math.BigDecimal** | The share class apportionment factor (capital ratio). | [optional] [default to java.math.BigDecimal]
**localValue** | **java.math.BigDecimal** | This journal entry line&#39;s local value amount after apportionment is applied. | [optional] [default to java.math.BigDecimal]
**baseValue** | **java.math.BigDecimal** | This journal entry line&#39;s base value amount after apportionment is applied | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.JournalEntryLineShareClassBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String ShortCode = "example ShortCode";
java.math.BigDecimal ApportionmentFactor = new java.math.BigDecimal("100.00");
java.math.BigDecimal LocalValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal BaseValue = new java.math.BigDecimal("100.00");


JournalEntryLineShareClassBreakdown journalEntryLineShareClassBreakdownInstance = new JournalEntryLineShareClassBreakdown()
    .ShortCode(ShortCode)
    .ApportionmentFactor(ApportionmentFactor)
    .LocalValue(LocalValue)
    .BaseValue(BaseValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
