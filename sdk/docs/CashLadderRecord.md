# com.finbourne.lusid.model.CashLadderRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**open** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]
**activities** | **Map&lt;String, java.math.BigDecimal&gt;** |  | [default to Map<String, java.math.BigDecimal>]
**close** | **java.math.BigDecimal** |  | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CashLadderRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
java.math.BigDecimal Open = new java.math.BigDecimal("100.00");
Map<String, java.math.BigDecimal> Activities = new Map<String, java.math.BigDecimal>();
java.math.BigDecimal Close = new java.math.BigDecimal("100.00");


CashLadderRecord cashLadderRecordInstance = new CashLadderRecord()
    .EffectiveDate(EffectiveDate)
    .Open(Open)
    .Activities(Activities)
    .Close(Close);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
