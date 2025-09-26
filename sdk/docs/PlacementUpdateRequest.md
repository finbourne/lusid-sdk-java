# com.finbourne.lusid.model.PlacementUpdateRequest
A request to create or update a Placement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this placement. | [optional] [default to Map<String, PerpetualProperty>]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. | [optional] [default to String]
**executionSystem** | **String** | Optionally specifies the execution system in use. | [optional] [default to String]
**entryType** | **String** | Optionally specifies the entry type of this placement. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PlacementUpdateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String Counterparty = "example Counterparty";
@jakarta.annotation.Nullable String ExecutionSystem = "example ExecutionSystem";
@jakarta.annotation.Nullable String EntryType = "example EntryType";


PlacementUpdateRequest placementUpdateRequestInstance = new PlacementUpdateRequest()
    .Id(Id)
    .Quantity(Quantity)
    .Properties(Properties)
    .Counterparty(Counterparty)
    .ExecutionSystem(ExecutionSystem)
    .EntryType(EntryType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
