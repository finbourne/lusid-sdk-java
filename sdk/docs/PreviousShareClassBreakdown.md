# com.finbourne.lusid.model.PreviousShareClassBreakdown
The data for a Share Class at the previous valuation point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nav** | [**PreviousNAV**](PreviousNAV.md) |  | [default to PreviousNAV]
**unitisation** | [**UnitisationData**](UnitisationData.md) |  | [optional] [default to UnitisationData]
**shareClassToFundFxRate** | **java.math.BigDecimal** | The fx rate from the Share Class currency to the fund currency at this valuation point. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PreviousShareClassBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

PreviousNAV Nav = new PreviousNAV();
UnitisationData Unitisation = new UnitisationData();
java.math.BigDecimal ShareClassToFundFxRate = new java.math.BigDecimal("100.00");


PreviousShareClassBreakdown previousShareClassBreakdownInstance = new PreviousShareClassBreakdown()
    .Nav(Nav)
    .Unitisation(Unitisation)
    .ShareClassToFundFxRate(ShareClassToFundFxRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
