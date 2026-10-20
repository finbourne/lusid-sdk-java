# com.finbourne.lusid.model.WithholdingTaxRateSplit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**stopAtSourceRate** | **java.math.BigDecimal** | The rate withheld at source. | [default to java.math.BigDecimal]
**irrecoverableRate** | **java.math.BigDecimal** | The part of the country rate that cannot be recovered. | [default to java.math.BigDecimal]
**reliefAtSourceRate** | **java.math.BigDecimal** | The part of the country rate relieved at source. | [default to java.math.BigDecimal]
**reclaimableRate** | **java.math.BigDecimal** | The part of the rate withheld at source that can be reclaimed. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.WithholdingTaxRateSplit;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal StopAtSourceRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal IrrecoverableRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal ReliefAtSourceRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal ReclaimableRate = new java.math.BigDecimal("100.00");


WithholdingTaxRateSplit withholdingTaxRateSplitInstance = new WithholdingTaxRateSplit()
    .StopAtSourceRate(StopAtSourceRate)
    .IrrecoverableRate(IrrecoverableRate)
    .ReliefAtSourceRate(ReliefAtSourceRate)
    .ReclaimableRate(ReclaimableRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
