# com.finbourne.lusid.model.EarlyRedemptionEvent
Early redemption as a consequence of a bond being called or putted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of redemption.  For internally generated European callables, this is set to the exercise date.  For internally generated American callables, this is set to the start of the exercise period. | [optional] [default to OffsetDateTime]
**currency** | **String** | Currency of the redemption. | [default to String]
**earlyRedemptionElections** | [**List&lt;EarlyRedemptionElection&gt;**](EarlyRedemptionElection.md) | EarlyRedemptionElection for the redemption. Used to trigger the redemption. | [default to List<EarlyRedemptionElection>]
**redemptionPercentage** | **java.math.BigDecimal** | Percentage of the original issue that is redeemed, where 0.5 implies 50%. Defaults to 1 if not set. Must be between 0 and 1. | [optional] [default to java.math.BigDecimal]
**pricePerUnit** | **java.math.BigDecimal** | The price, or strike, that each unit is redeemed at. | [optional] [default to java.math.BigDecimal]
**accruedInterestPerUnit** | **java.math.BigDecimal** | Unpaid accrued interest also repaid as part of the redemption, per unit.  Optional field.  If left empty, will be resolved internally by calculating the accrued owed on the EffectiveDate.  This process may require additional market data. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.EarlyRedemptionEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime EffectiveDate = OffsetDateTime.now();
String Currency = "example Currency";
List<EarlyRedemptionElection> EarlyRedemptionElections = new List<EarlyRedemptionElection>();
java.math.BigDecimal RedemptionPercentage = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal PricePerUnit = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AccruedInterestPerUnit = new java.math.BigDecimal("100.00");


EarlyRedemptionEvent earlyRedemptionEventInstance = new EarlyRedemptionEvent()
    .EffectiveDate(EffectiveDate)
    .Currency(Currency)
    .EarlyRedemptionElections(EarlyRedemptionElections)
    .RedemptionPercentage(RedemptionPercentage)
    .PricePerUnit(PricePerUnit)
    .AccruedInterestPerUnit(AccruedInterestPerUnit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
