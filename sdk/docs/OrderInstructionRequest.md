# com.finbourne.lusid.model.OrderInstructionRequest
A request to create or update a Order Instruction.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The active date of this order instruction. | [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The instrument ordered. | [optional] [default to Map<String, String>]
**quantity** | **java.math.BigDecimal** | The quantity of given instrument ordered. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The proportion of the total portfolio value ordered for the given instrument ordered. | [optional] [default to java.math.BigDecimal]
**price** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [optional] [default to CurrencyAndAmount]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Client-defined properties associated with this execution. | [optional] [default to Map<String, PerpetualProperty>]

```java
import com.finbourne.lusid.model.OrderInstructionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
OffsetDateTime CreatedDate = OffsetDateTime.now();
ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable java.math.BigDecimal Quantity = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
CurrencyAndAmount Price = new CurrencyAndAmount();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();


OrderInstructionRequest orderInstructionRequestInstance = new OrderInstructionRequest()
    .Id(Id)
    .CreatedDate(CreatedDate)
    .PortfolioId(PortfolioId)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Quantity(Quantity)
    .Weight(Weight)
    .Price(Price)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
