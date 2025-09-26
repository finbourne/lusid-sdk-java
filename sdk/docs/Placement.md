# com.finbourne.lusid.model.Placement
A street order for a quantity of a single instrument placed with a single market entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**parentPlacementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**blockIds** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The IDs of the Blocks associated with this placement. | [default to List<ResourceId>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this placement. | [optional] [default to Map<String, PerpetualProperty>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument placement. | [default to String]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [default to java.math.BigDecimal]
**state** | **String** | The state of this placement (typically a FIX state; Open, Filled, etc). | [default to String]
**side** | **String** | The side (Buy, Sell, ...) of this placement. | [default to String]
**timeInForce** | **String** | The time in force applicable to this placement (GTC, FOK, Day, etc) | [default to String]
**type** | **String** | The type of this placement (Market, Limit, etc). | [default to String]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this placement. | [default to OffsetDateTime]
**limitPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**stopPrice** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**counterparty** | **String** | Optionally specifies the market entity this placement is placed with. | [optional] [default to String]
**executionSystem** | **String** | Optionally specifies the execution system in use. | [optional] [default to String]
**entryType** | **String** | Optionally specifies the entry type of this placement. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Placement;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
ResourceId ParentPlacementId = new ResourceId();
List<ResourceId> BlockIds = new List<ResourceId>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String LusidInstrumentId = "example LusidInstrumentId";
java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
String State = "example State";
String Side = "example Side";
String TimeInForce = "example TimeInForce";
String Type = "example Type";
OffsetDateTime CreatedDate = OffsetDateTime.now();
CurrencyAndAmount LimitPrice = new CurrencyAndAmount();
CurrencyAndAmount StopPrice = new CurrencyAndAmount();
@jakarta.annotation.Nullable String Counterparty = "example Counterparty";
@jakarta.annotation.Nullable String ExecutionSystem = "example ExecutionSystem";
@jakarta.annotation.Nullable String EntryType = "example EntryType";
Version Version = new Version();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Placement placementInstance = new Placement()
    .Id(Id)
    .ParentPlacementId(ParentPlacementId)
    .BlockIds(BlockIds)
    .Properties(Properties)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .LusidInstrumentId(LusidInstrumentId)
    .Quantity(Quantity)
    .State(State)
    .Side(Side)
    .TimeInForce(TimeInForce)
    .Type(Type)
    .CreatedDate(CreatedDate)
    .LimitPrice(LimitPrice)
    .StopPrice(StopPrice)
    .Counterparty(Counterparty)
    .ExecutionSystem(ExecutionSystem)
    .EntryType(EntryType)
    .Version(Version)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
