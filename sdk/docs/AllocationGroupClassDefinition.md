# com.finbourne.lusid.model.AllocationGroupClassDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund and is attached to the transaction. | [default to String]
**shareClassFundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**apportionmentFactor** | **java.math.BigDecimal** | The weighting factor used for apportionment across this share class. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.AllocationGroupClassDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String ShareClassShortCode = "example ShareClassShortCode";
ResourceId ShareClassFundId = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal ApportionmentFactor = new java.math.BigDecimal("100.00");


AllocationGroupClassDefinition allocationGroupClassDefinitionInstance = new AllocationGroupClassDefinition()
    .ShareClassShortCode(ShareClassShortCode)
    .ShareClassFundId(ShareClassFundId)
    .ApportionmentFactor(ApportionmentFactor);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
