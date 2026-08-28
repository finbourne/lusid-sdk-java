# com.finbourne.lusid.model.BondDefaultEvent
Indicates when an issuer has defaulted on an obligation due to technical default, missed payments, or bankruptcy filing.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the bond default occurred. | [optional] [default to OffsetDateTime]
**defaultReason** | **String** | Why the issuer defaulted, in the client&#39;s own words. Free text, with no effect on any calculation.  This field is optional. | [optional] [default to String]
**suppressionDetails** | [**BondDefaultSuppressionDetails**](BondDefaultSuppressionDetails.md) |  | [optional] [default to BondDefaultSuppressionDetails]
**suppressionDetailsSpecified** | **Boolean** | Whether SuppressionDetails was supplied at all, which an absent section and an empty one cannot  otherwise be told apart by when the percentages are read as separate columns. An absent section  suppresses coupons and principal outright; an empty one suppresses nothing.  Setting this to false while also supplying a percentage is contradictory. The percentages win and  the section is treated as present, because honouring the false would silently discard values the  caller explicitly sent. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.BondDefaultEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EffectiveDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String DefaultReason = "example DefaultReason";
BondDefaultSuppressionDetails SuppressionDetails = new BondDefaultSuppressionDetails();
@jakarta.annotation.Nullable Boolean SuppressionDetailsSpecified = true;


BondDefaultEvent bondDefaultEventInstance = new BondDefaultEvent()
    .EffectiveDate(EffectiveDate)
    .DefaultReason(DefaultReason)
    .SuppressionDetails(SuppressionDetails)
    .SuppressionDetailsSpecified(SuppressionDetailsSpecified);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
