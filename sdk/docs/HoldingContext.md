# com.finbourne.lusid.model.HoldingContext
Holding context node.  Contains settings that control how LUSID handles holdings within portfolios.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxLotLevelHoldings** | **Boolean** | Whether or not to expand the holdings to return the underlying tax-lots. Defaults to True. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.HoldingContext;
import java.util.*;
import java.lang.System;
import java.net.URI;

Boolean TaxLotLevelHoldings = true;


HoldingContext holdingContextInstance = new HoldingContext()
    .TaxLotLevelHoldings(TaxLotLevelHoldings);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
