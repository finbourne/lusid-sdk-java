# com.finbourne.lusid.model.WithholdingTaxRateTiers

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countryRate** | **java.math.BigDecimal** | The statutory rate of the matched row, before relief. | [default to java.math.BigDecimal]
**treatyRate** | **java.math.BigDecimal** | The treaty rate of the matched row. Null when the tier does not apply. | [optional] [default to java.math.BigDecimal]
**betterRate** | **java.math.BigDecimal** | The better rate of the matched row. Null when the tier does not apply. | [optional] [default to java.math.BigDecimal]
**enhancedRate** | **java.math.BigDecimal** | The enhanced rate of the matched row. Null when the tier does not apply. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.WithholdingTaxRateTiers;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal CountryRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal TreatyRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal BetterRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal EnhancedRate = new java.math.BigDecimal("100.00");


WithholdingTaxRateTiers withholdingTaxRateTiersInstance = new WithholdingTaxRateTiers()
    .CountryRate(CountryRate)
    .TreatyRate(TreatyRate)
    .BetterRate(BetterRate)
    .EnhancedRate(EnhancedRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
