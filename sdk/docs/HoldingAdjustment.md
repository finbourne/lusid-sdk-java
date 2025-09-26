# com.finbourne.lusid.model.HoldingAdjustment
The target holdings.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | [optional] [default to Map<String, String>]
**instrumentScope** | **String** | The scope of the instrument that the holding adjustment is in. | [optional] [default to String]
**instrumentUid** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that the holding adjustment is in. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The set of unique transaction properties and associated values stored with the holding adjustment transactions automatically created by LUSID. Each property will be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The set of unique holding properties and associated values stored with the target holding. Each property will be from the &#39;Holding&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**taxLots** | [**List&lt;TargetTaxLot&gt;**](TargetTaxLot.md) | The tax-lots that together make up the target holding. | [default to List<TargetTaxLot>]
**currency** | **String** | The Holding currency. | [optional] [default to String]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.HoldingAdjustment;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String InstrumentUid = "example InstrumentUid";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
List<TargetTaxLot> TaxLots = new List<TargetTaxLot>();
@jakarta.annotation.Nullable String Currency = "example Currency";
ResourceId CustodianAccountId = new ResourceId();


HoldingAdjustment holdingAdjustmentInstance = new HoldingAdjustment()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstrumentScope(InstrumentScope)
    .InstrumentUid(InstrumentUid)
    .SubHoldingKeys(SubHoldingKeys)
    .Properties(Properties)
    .TaxLots(TaxLots)
    .Currency(Currency)
    .CustodianAccountId(CustodianAccountId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
