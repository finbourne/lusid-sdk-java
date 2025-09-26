# com.finbourne.lusid.model.ReconciliationConfiguration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**left** | [**ReconciliationSideConfiguration**](ReconciliationSideConfiguration.md) |  | [optional] [default to ReconciliationSideConfiguration]
**right** | [**ReconciliationSideConfiguration**](ReconciliationSideConfiguration.md) |  | [optional] [default to ReconciliationSideConfiguration]
**mappingId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.ReconciliationConfiguration;
import java.util.*;
import java.lang.System;
import java.net.URI;

ReconciliationSideConfiguration Left = new ReconciliationSideConfiguration();
ReconciliationSideConfiguration Right = new ReconciliationSideConfiguration();
ResourceId MappingId = new ResourceId();


ReconciliationConfiguration reconciliationConfigurationInstance = new ReconciliationConfiguration()
    .Left(Left)
    .Right(Right)
    .MappingId(MappingId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
