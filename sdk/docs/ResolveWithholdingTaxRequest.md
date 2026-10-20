# com.finbourne.lusid.model.ResolveWithholdingTaxRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **String** | Where the dimension values come from. Raw: from Dimensions. InstrumentResolved: from the instrument, through the configuration&#39;s value sources, as in booking. Available values: Raw, InstrumentResolved. | [default to String]
**taxCountry** | **String** | The tax country of the holder. It is matched like any other dimension. | [default to String]
**profileType** | **String** | The profile type of the holder. It is matched like any other dimension. | [default to String]
**dimensions** | **Map&lt;String, String&gt;** | The value of each matching dimension, keyed by its field name in the rate datasets. A dimension left out is null, as in booking. taxCountry, profileType and ruleSource are not allowed here, and a name that neither dataset matches on is refused. With InstrumentResolved, a value here overrides the derived one, or gives one that the lookup cannot derive (see unresolvedDimensions in the response). | [optional] [default to Map<String, String>]
**whtConfig** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**anomalyDataset** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**mainDataset** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**sourcePriority** | **List&lt;String&gt;** | Optional. The source priority, most preferred first: it replaces the configuration&#39;s, or is used on its own when there is no configuration. An empty list applies no source filter. | [optional] [default to List<String>]
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | The identifiers of the instrument, resolved as for a transaction. Required with InstrumentResolved, not allowed with Raw. | [optional] [default to Map<String, String>]
**instrumentScope** | **String** | Optional. The scope to resolve the instrument in, before the default scope. Only with InstrumentResolved. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ResolveWithholdingTaxRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Mode = "example Mode";
String TaxCountry = "example TaxCountry";
String ProfileType = "example ProfileType";
@jakarta.annotation.Nullable Map<String, String> Dimensions = new Map<String, String>();
ResourceId WhtConfig = new ResourceId();
ResourceId AnomalyDataset = new ResourceId();
ResourceId MainDataset = new ResourceId();
@jakarta.annotation.Nullable List<String> SourcePriority = new List<String>();
@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
@jakarta.annotation.Nullable String InstrumentScope = "example InstrumentScope";


ResolveWithholdingTaxRequest resolveWithholdingTaxRequestInstance = new ResolveWithholdingTaxRequest()
    .Mode(Mode)
    .TaxCountry(TaxCountry)
    .ProfileType(ProfileType)
    .Dimensions(Dimensions)
    .WhtConfig(WhtConfig)
    .AnomalyDataset(AnomalyDataset)
    .MainDataset(MainDataset)
    .SourcePriority(SourcePriority)
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .InstrumentScope(InstrumentScope);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
