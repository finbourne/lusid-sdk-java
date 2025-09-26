# com.finbourne.lusid.model.Economics

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentScope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**lusidInstrumentId** | **String** | The unique Lusid Instrument Id (LUID) of the instrument that economics are for. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which identify the Economic. Each property will be from the &#39;Transaction&#39; domain. These are configured on a transaction portfolio. | [optional] [default to Map<String, PerpetualProperty>]
**buckets** | [**List&lt;Bucket&gt;**](Bucket.md) | Set of economic data related with each of the side impact of the transaction. | [optional] [default to List<Bucket>]

```java
import com.finbourne.lusid.model.Economics;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";
String LusidInstrumentId = "example LusidInstrumentId";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable List<Bucket> Buckets = new List<Bucket>();


Economics economicsInstance = new Economics()
    .InstrumentScope(InstrumentScope)
    .LusidInstrumentId(LusidInstrumentId)
    .SubHoldingKeys(SubHoldingKeys)
    .Buckets(Buckets);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
