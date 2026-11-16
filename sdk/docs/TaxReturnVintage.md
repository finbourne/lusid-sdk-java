# com.finbourne.lusid.model.TaxReturnVintage

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**periodId** | **String** | The label of the period the amount falls into. | [optional] [default to String]
**start** | [**OffsetDateTime**](OffsetDateTime.md) | The first day of the period, inclusive. | [optional] [default to OffsetDateTime]
**end** | [**OffsetDateTime**](OffsetDateTime.md) | The last day of the period, inclusive. | [optional] [default to OffsetDateTime]
**deemedGains** | **java.math.BigDecimal** | The deemed gains arising at the end of the period. | [optional] [default to java.math.BigDecimal]
**deemedLosses** | **java.math.BigDecimal** | The deemed losses arising at the end of the period. | [optional] [default to java.math.BigDecimal]
**netAmount** | **java.math.BigDecimal** | The net deemed amount, gains less losses. | [optional] [default to java.math.BigDecimal]
**carryBackReduction** | **java.math.BigDecimal** | The reduction to the net amount from losses carried back from later periods. | [optional] [default to java.math.BigDecimal]
**spreadAmount** | **java.math.BigDecimal** | The net amount after carry-back that is spread over seven periods. | [optional] [default to java.math.BigDecimal]
**outstanding** | **java.math.BigDecimal** | The amount of the spread that has not yet been brought into charge. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxReturnVintage;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String PeriodId = "example PeriodId";
OffsetDateTime Start = OffsetDateTime.now();
OffsetDateTime End = OffsetDateTime.now();
java.math.BigDecimal DeemedGains = new java.math.BigDecimal("100.00");
java.math.BigDecimal DeemedLosses = new java.math.BigDecimal("100.00");
java.math.BigDecimal NetAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarryBackReduction = new java.math.BigDecimal("100.00");
java.math.BigDecimal SpreadAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal Outstanding = new java.math.BigDecimal("100.00");


TaxReturnVintage taxReturnVintageInstance = new TaxReturnVintage()
    .PeriodId(PeriodId)
    .Start(Start)
    .End(End)
    .DeemedGains(DeemedGains)
    .DeemedLosses(DeemedLosses)
    .NetAmount(NetAmount)
    .CarryBackReduction(CarryBackReduction)
    .SpreadAmount(SpreadAmount)
    .Outstanding(Outstanding);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
