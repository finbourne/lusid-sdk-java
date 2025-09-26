# com.finbourne.lusid.model.SpecificHoldingPricingInfo
Allows a user to specify fallbacks/overrides using Holding fields for sources that match a particular DependencySourceFilter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependencySourceFilter** | [**DependencySourceFilter**](DependencySourceFilter.md) |  | [default to DependencySourceFilter]
**field** | **String** | The Holding field which the fallback/override should use to create a price quote. | [default to String]

```java
import com.finbourne.lusid.model.SpecificHoldingPricingInfo;
import java.util.*;
import java.lang.System;
import java.net.URI;

DependencySourceFilter DependencySourceFilter = new DependencySourceFilter();
String Field = "example Field";


SpecificHoldingPricingInfo specificHoldingPricingInfoInstance = new SpecificHoldingPricingInfo()
    .DependencySourceFilter(DependencySourceFilter)
    .Field(Field);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
