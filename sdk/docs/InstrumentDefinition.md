# com.finbourne.lusid.model.InstrumentDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the instrument. | [default to String]
**identifiers** | [**Map&lt;String, InstrumentIdValue&gt;**](InstrumentIdValue.md) | A set of identifiers that can be used to identify the instrument. At least one of these must be configured to be a unique identifier. | [default to Map<String, InstrumentIdValue>]
**properties** | [**List&lt;Property&gt;**](Property.md) | Set of unique instrument properties and associated values to store with the instrument. Each property must be from the &#39;Instrument&#39; domain. | [optional] [default to List<Property>]
**lookThroughPortfolioId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**definition** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**settlementCycle** | [**SettlementCycle**](SettlementCycle.md) |  | [optional] [default to SettlementCycle]

```java
import com.finbourne.lusid.model.InstrumentDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Name = "example Name";
Map<String, InstrumentIdValue> Identifiers = new Map<String, InstrumentIdValue>();
@jakarta.annotation.Nullable List<Property> Properties = new List<Property>();
ResourceId LookThroughPortfolioId = new ResourceId();
LusidInstrument Definition = new LusidInstrument();
SettlementCycle SettlementCycle = new SettlementCycle();


InstrumentDefinition instrumentDefinitionInstance = new InstrumentDefinition()
    .Name(Name)
    .Identifiers(Identifiers)
    .Properties(Properties)
    .LookThroughPortfolioId(LookThroughPortfolioId)
    .Definition(Definition)
    .SettlementCycle(SettlementCycle);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
