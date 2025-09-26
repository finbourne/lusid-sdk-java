# com.finbourne.lusid.model.CancelSingleHoldingAdjustmentRequest
This request specifies single target holding. i.e. holding data that the  system should match. And deletes previous adjustment made to that holding

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | A set of instrument identifiers that can resolve the holding adjustment to a unique instrument. | [default to Map<String, String>]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the holding. Each property must be from the &#39;Transaction&#39; domain. | [optional] [default to Map<String, PerpetualProperty>]
**currency** | **String** | The Holding currency. | [optional] [default to String]
**custodianAccountId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.CancelSingleHoldingAdjustmentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String Currency = "example Currency";
ResourceId CustodianAccountId = new ResourceId();


CancelSingleHoldingAdjustmentRequest cancelSingleHoldingAdjustmentRequestInstance = new CancelSingleHoldingAdjustmentRequest()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .SubHoldingKeys(SubHoldingKeys)
    .Currency(Currency)
    .CustodianAccountId(CustodianAccountId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
