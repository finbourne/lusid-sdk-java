# com.finbourne.lusid.model.CommodityForwardPhysicalSettlementEvent
Physical settlement of a physical-delivery CommodityForward at maturity. The forward position is  exchanged for units of the mastered underlying commodity, and the strike becomes the cost basis of  the delivered position. No cash flow arises — the consideration is the physical commodity itself.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The single settlement / maturity date of the forward, on which delivery takes place. Required. | [optional] [default to OffsetDateTime]
**strike** | **java.math.BigDecimal** | Agreed forward price at trade inception, used as the cost basis of the delivered commodity  position. Required. Unconstrained in sign — commodity prices can settle negative. | [optional] [default to java.math.BigDecimal]
**newInstrument** | [**NewInstrument**](NewInstrument.md) |  | [default to NewInstrument]
**deliveredUnits** | **java.math.BigDecimal** | Units of the underlying to deliver, equal to the eligible balance at a units ratio of 1:1.  Optional — it needs holdings-level data so it is never populated by the instrument layer.  Negative for a short position, which delivers units away. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.CommodityForwardPhysicalSettlementEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime MaturityDate = OffsetDateTime.now();
java.math.BigDecimal Strike = new java.math.BigDecimal("100.00");
NewInstrument NewInstrument = new NewInstrument();
@jakarta.annotation.Nullable java.math.BigDecimal DeliveredUnits = new java.math.BigDecimal("100.00");


CommodityForwardPhysicalSettlementEvent commodityForwardPhysicalSettlementEventInstance = new CommodityForwardPhysicalSettlementEvent()
    .MaturityDate(MaturityDate)
    .Strike(Strike)
    .NewInstrument(NewInstrument)
    .DeliveredUnits(DeliveredUnits);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
