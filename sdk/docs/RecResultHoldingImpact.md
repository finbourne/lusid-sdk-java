# com.finbourne.lusid.model.RecResultHoldingImpact
One holding, and where known the tax lot within it, that a transaction or settlement activity item impacted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The impacted holding, at holding level: the id a holding item over it carries. | [default to String]
**taxLotId** | **String** | The impacted tax lot within the holding, where the source states one; null when the impact is known at holding level only. Opaque: compare it whole, do not parse it. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecResultHoldingImpact;
import java.util.*;
import java.lang.System;
import java.net.URI;

String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String TaxLotId = "example TaxLotId";


RecResultHoldingImpact recResultHoldingImpactInstance = new RecResultHoldingImpact()
    .HoldingId(HoldingId)
    .TaxLotId(TaxLotId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
