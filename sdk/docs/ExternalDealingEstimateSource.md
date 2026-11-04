# com.finbourne.lusid.model.ExternalDealingEstimateSource
The system that sent an external order set, and its own reference for the batch.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system** | **String** |  | [default to String]
**reference** | **String** |  | [optional] [default to String]

```java
import com.finbourne.lusid.model.ExternalDealingEstimateSource;
import java.util.*;
import java.lang.System;
import java.net.URI;

String System = "example System";
@jakarta.annotation.Nullable String Reference = "example Reference";


ExternalDealingEstimateSource externalDealingEstimateSourceInstance = new ExternalDealingEstimateSource()
    .System(System)
    .Reference(Reference);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
