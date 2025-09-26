# com.finbourne.lusid.model.AdjustHoldingForDateRequest
This request specifies target holdings. i.e. holding data that the  system should match. When processed by the movement  engine, it will create 'true-up' adjustments on the fly.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effectiveAt** | **String** | The Effective date that the target holding will be adjusted at. | [default to String]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | [default to Map<String, String>]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique transaction properties and associated values to store with the holding adjustment transaction automatically created by LUSID. Each property must be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**properties** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | Set of unique holding properties and associated values to store with the target holding. Each property must be from the &#39;Holding&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**taxLots** | [**List&lt;TargetTaxLotRequest&gt;**](TargetTaxLotRequest.md) | The tax-lots that together make up the target holding. | [default to List<TargetTaxLotRequest>]
**currency** | **String** | The Holding currency. This needs to be equal with the one on the TaxLot -&gt; cost if one is specified | [optional] [default to String]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.AdjustHoldingForDateRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String EffectiveAt = "example EffectiveAt";
Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> Properties = new Map<String, PerpetualProperty>();
List<TargetTaxLotRequest> TaxLots = new List<TargetTaxLotRequest>();
@jakarta.annotation.Nullable String Currency = "example Currency";
ResourceId CustodianAccountId = new ResourceId();


AdjustHoldingForDateRequest adjustHoldingForDateRequestInstance = new AdjustHoldingForDateRequest()
    .EffectiveAt(EffectiveAt)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .SubHoldingKeys(SubHoldingKeys)
    .Properties(Properties)
    .TaxLots(TaxLots)
    .Currency(Currency)
    .CustodianAccountId(CustodianAccountId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
