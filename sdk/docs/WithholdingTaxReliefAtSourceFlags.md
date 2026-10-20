# com.finbourne.lusid.model.WithholdingTaxReliefAtSourceFlags

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**treatyRas** | **Boolean** | Whether relief at source applies at the treaty rate. | [default to Boolean]
**betterRas** | **Boolean** | Whether relief at source applies at the better rate. | [default to Boolean]
**enhancedRas** | **Boolean** | Whether relief at source applies at the enhanced rate. | [default to Boolean]

```java
import com.finbourne.lusid.model.WithholdingTaxReliefAtSourceFlags;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean TreatyRas = true;
Boolean BetterRas = true;
Boolean EnhancedRas = true;


WithholdingTaxReliefAtSourceFlags withholdingTaxReliefAtSourceFlagsInstance = new WithholdingTaxReliefAtSourceFlags()
    .TreatyRas(TreatyRas)
    .BetterRas(BetterRas)
    .EnhancedRas(EnhancedRas);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
