# com.finbourne.lusid.model.AllocationPostingRollUp
One roll-up a booking writes on a vehicle's line on the register above it, summing the lines beneath.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the posting: the booking reference, investor record, commitment line, component and side. | [optional] [default to String]
**line** | **String** | The roll-up line, rendered as the held vehicle and the register above it. | [optional] [default to String]
**portfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**amount** | **java.math.BigDecimal** | The amount posted, in the event currency. | [optional] [default to java.math.BigDecimal]
**component** | **String** | The component of the event the posting carries. | [optional] [default to String]
**sumOf** | **List&lt;String&gt;** | The identifiers of the postings beneath that the roll-up sums. | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.AllocationPostingRollUp;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String Line = "example Line";
ResourceId Portfolio = new ResourceId();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Component = "example Component";
@jakarta.annotation.Nullable List<String> SumOf = new List<String>();


AllocationPostingRollUp allocationPostingRollUpInstance = new AllocationPostingRollUp()
    .Id(Id)
    .Line(Line)
    .Portfolio(Portfolio)
    .Amount(Amount)
    .Component(Component)
    .SumOf(SumOf);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
