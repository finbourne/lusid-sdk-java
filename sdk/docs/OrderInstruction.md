# com.finbourne.lusid.model.OrderInstruction
Record of an order instruction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this order instruction. | [default to OffsetDateTime]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**instrumentScope** | **String** | The scope in which the instrument lies | [optional] [default to String]
**lusidInstrumentId** | **String** | The LUSID instrument id for the instrument ordered. | [optional] [default to String]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.OrderInstruction;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
OffsetDateTime CreatedDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
ResourceId PortfolioId = new ResourceId();
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount Price = new CurrencyAndAmount();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable String LusidInstrumentId = "example LusidInstrumentId";
Version Version = new Version();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


OrderInstruction orderInstructionInstance = new OrderInstruction()
    .Id(Id)
    .CreatedDate(CreatedDate)
    .Properties(Properties)
    .PortfolioId(PortfolioId)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Quantity(Quantity)
    .Weight(Weight)
    .Price(Price)
    .InstrumentScope(InstrumentScope)
    .LusidInstrumentId(LusidInstrumentId)
    .Version(Version)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
