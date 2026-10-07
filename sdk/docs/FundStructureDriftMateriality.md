# com.finbourne.lusid.model.FundStructureDriftMateriality
How much ownership drift a Fund Structure member tolerates on the members it holds through an instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**warnAmount** | **java.math.BigDecimal** | The misallocated P&amp;L, in base currency, above which the valuation point carries a warning naming the holder, the held member and both shares. Optional; unset means never warn. | [optional] [default to java.math.BigDecimal]
**refuseAmount** | **java.math.BigDecimal** | The misallocated P&amp;L, in base currency, above which the P&amp;L flow is refused until the sharing percentage is corrected. Must not be less than the warning amount. Optional; unset means never refuse. A share bought from another investor at a premium or a discount shows as drift however correct the sharing percentage. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FundStructureDriftMateriality;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable java.math.BigDecimal WarnAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal RefuseAmount = new java.math.BigDecimal("100.00");


FundStructureDriftMateriality fundStructureDriftMaterialityInstance = new FundStructureDriftMateriality()
    .WarnAmount(WarnAmount)
    .RefuseAmount(RefuseAmount);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
