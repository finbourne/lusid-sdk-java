# com.finbourne.lusid.model.FractionalUnitsTrueUpConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fractionalUnitsHandling** | **String** | The fractional-units handling scheme for the portfolio&#39;s corporate-action processing. This can be: LotLevelRounding or CustodianLevelTrueUp. Defaults to LotLevelRounding, today&#39;s per-lot-only processing, if not specified. Available values: LotLevelRounding, CustodianLevelTrueUp. | [optional] [default to String]
**nominatedSubHoldingKey** | **String** | The sub-holding key (from the &#39;Transaction&#39; domain) that custodian-level fractional-units true-ups are booked to. The key must be one of the portfolio&#39;s sub-holding keys, must have a pre-defined property definition, and event processing never creates it. | [optional] [default to String]
**nominatedSubHoldingKeyValue** | **String** | The value of the nominated sub-holding key under which the true-up holding is booked, for example the bucket that quarantines fractional rounding true-ups. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FractionalUnitsTrueUpConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String FractionalUnitsHandling = "example FractionalUnitsHandling";
@jakarta.annotation.Nullable String NominatedSubHoldingKey = "example NominatedSubHoldingKey";
@jakarta.annotation.Nullable String NominatedSubHoldingKeyValue = "example NominatedSubHoldingKeyValue";


FractionalUnitsTrueUpConfiguration fractionalUnitsTrueUpConfigurationInstance = new FractionalUnitsTrueUpConfiguration()
    .FractionalUnitsHandling(FractionalUnitsHandling)
    .NominatedSubHoldingKey(NominatedSubHoldingKey)
    .NominatedSubHoldingKeyValue(NominatedSubHoldingKeyValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
