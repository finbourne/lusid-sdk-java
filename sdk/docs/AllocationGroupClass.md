# com.finbourne.lusid.model.AllocationGroupClass

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund and is attached to the transaction. | [default to String]
**shareClassFundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**apportionmentFactor** | **java.math.BigDecimal** | The weighting factor used for apportionment across this share class. | [optional] [default to java.math.BigDecimal]
**shareClassSeriesCode** | **String** | An optional series identifier for the share class. If not provided, the share class will include all series. | [optional] [default to String]

```java
import com.finbourne.lusid.model.AllocationGroupClass;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ShareClassShortCode = "example ShareClassShortCode";
ResourceId ShareClassFundId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal ApportionmentFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String ShareClassSeriesCode = "example ShareClassSeriesCode";


AllocationGroupClass allocationGroupClassInstance = new AllocationGroupClass()
    .ShareClassShortCode(ShareClassShortCode)
    .ShareClassFundId(ShareClassFundId)
    .ApportionmentFactor(ApportionmentFactor)
    .ShareClassSeriesCode(ShareClassSeriesCode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
