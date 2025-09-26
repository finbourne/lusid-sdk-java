# com.finbourne.lusid.model.BondConversionEntry
Information required to specify a conversion event for a convertible bond.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the bond can be converted | [optional] [default to OffsetDateTime]
**denomination** | **java.math.BigDecimal** | The number of shares to be issued on conversion will be equal to the denomination of the  bond divided by the conversion price.  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. | [optional] [default to java.math.BigDecimal]
**price** | **java.math.BigDecimal** | The conversion price  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. | [optional] [default to java.math.BigDecimal]
**ratio** | **java.math.BigDecimal** | The number of common shares received at the time of conversion for each convertible bond  Two (and only two) entries out of (Price, Ratio, Denomination) must be provided.  So, to allow one entry out of the three to not be provided, we make all the three  nullable defaulting to zero and during validation we check if there is exactly one  of the three equal to zero. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.BondConversionEntry;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Denomination = new java.math.BigDecimal("100.00");
java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
java.math.BigDecimal Ratio = new java.math.BigDecimal("100.00");


BondConversionEntry bondConversionEntryInstance = new BondConversionEntry()
    .Date(Date)
    .Denomination(Denomination)
    .Price(Price)
    .Ratio(Ratio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
