# com.finbourne.lusid.model.ModelPackage
A structure used to describe the structure of an order or orders that make up a non-trivial trade.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**orderIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order ids. | [default to List<ResourceId>]
**orderInstructionIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | Related order instruction ids. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.ModelPackage;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
List<ResourceId> OrderIds = new List<ResourceId>();
List<ResourceId> OrderInstructionIds = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Version Version = new Version();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


ModelPackage modelPackageInstance = new ModelPackage()
    .Id(Id)
    .OrderIds(OrderIds)
    .OrderInstructionIds(OrderInstructionIds)
    .Properties(Properties)
    .Version(Version)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
