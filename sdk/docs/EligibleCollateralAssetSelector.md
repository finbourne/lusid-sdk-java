# com.finbourne.lusid.model.EligibleCollateralAssetSelector
The assets an eligible collateral row applies to, as stored on a schedule.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** | What the selector matches. One of BaseCurrencyCash, Cash or Instrument. Available values: BaseCurrencyCash, Cash, Instrument. | [default to String]
**currency** | **String** | The currency of the cash. Required for a Cash selector and not allowed otherwise. | [optional] [default to String]
**instrumentFilter** | **String** | A filter selecting the instruments. Required for an Instrument selector and not allowed otherwise. Checked for structure only when the schedule is stored. | [optional] [default to String]

```java
import com.finbourne.lusid.model.EligibleCollateralAssetSelector;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Kind = "example Kind";
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String InstrumentFilter = "example InstrumentFilter";


EligibleCollateralAssetSelector eligibleCollateralAssetSelectorInstance = new EligibleCollateralAssetSelector()
    .Kind(Kind)
    .Currency(Currency)
    .InstrumentFilter(InstrumentFilter);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
