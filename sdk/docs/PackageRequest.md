# com.finbourne.lusid.model.PackageRequest
A request to create or update a Package.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order ids. | [default to List<ResourceId>]
**orderInstructionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order instruction ids. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.PackageRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
List<ResourceId> OrderIds = new List<ResourceId>();
List<ResourceId> OrderInstructionIds = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


PackageRequest packageRequestInstance = new PackageRequest()
    .Id(Id)
    .OrderIds(OrderIds)
    .OrderInstructionIds(OrderInstructionIds)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
