# com.finbourne.lusid.model.RecDefByTaxLots
Per-side tax-lot granularity for a Holding entry of a rec definition's rulesets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | **Boolean** | Whether the left side splits holdings by tax lot. Must be omitted when the left side is relational, and reads as null there. | [optional] [default to Boolean]
**right** | **Boolean** | Whether the right side splits holdings by tax lot. Must be omitted when the right side is relational, and reads as null there. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.RecDefByTaxLots;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Boolean Left = true;
@jakarta.annotation.Nullable Boolean Right = true;


RecDefByTaxLots recDefByTaxLotsInstance = new RecDefByTaxLots()
    .Left(Left)
    .Right(Right);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
