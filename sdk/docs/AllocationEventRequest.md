# com.finbourne.lusid.model.AllocationEventRequest
The request used to raise or replace an Allocation Event. The event is computed against its map straight away.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Allocation Event. Together with the scope this uniquely identifies the event. | [default to String]
**allocationMapId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**eventType** | **String** | The type of the event: CapitalCall, Distribution, FeeExpense or ValuationMove. Selects the basis rule from the map. Available values: CapitalCall, Distribution, FeeExpense, ValuationMove. | [default to String]
**amount** | **java.math.BigDecimal** | The total amount to be shared across the participants. | [default to java.math.BigDecimal]
**currency** | **String** | The ISO 4217 code of the currency of the amount. The amount may not be finer than the currency&#39;s minor unit: two decimal places for most currencies, none for JPY, three for KWD and BHD. A code with no defined minor unit, such as XAU or XAG, is taken to have two decimal places. | [default to String]
**eventDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the event: the point at which the map, its participants and their basis values are read. | [default to OffsetDateTime]
**description** | **String** | A description of the Allocation Event. | [optional] [default to String]
**basisValues** | [**List&lt;AllocationMapBasisValue&gt;**](AllocationMapBasisValue.md) | Optional basis values per investor record, used when the map&#39;s basis is not resolvable from stored data. | [optional] [default to List<AllocationMapBasisValue>]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effective datetime at which the event is created or replaced. Defaults to the earliest effective time on create and the current LUSID system datetime on replace. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.AllocationEventRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
ResourceId AllocationMapId = new ResourceId();
String EventType = "example EventType";
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
OffsetDateTime EventDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable List<AllocationMapBasisValue> BasisValues = new List<AllocationMapBasisValue>();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();


AllocationEventRequest allocationEventRequestInstance = new AllocationEventRequest()
    .Code(Code)
    .AllocationMapId(AllocationMapId)
    .EventType(EventType)
    .Amount(Amount)
    .Currency(Currency)
    .EventDate(EventDate)
    .Description(Description)
    .BasisValues(BasisValues)
    .EffectiveAt(EffectiveAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
