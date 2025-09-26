# com.finbourne.lusid.model.UpsertInstrumentPropertyRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierType** | **String** | The unique identifier type to search for the instrument, for example &#39;Figi&#39;. | [default to String]
**identifier** | **String** | A value of that type to identify the instrument to upsert properties for, for example &#39;BBG000BLNNV0&#39;. | [default to String]
**properties** | [**List&lt;Property&gt;**](Property.md) | A set of instrument properties and associated values to store for the instrument. Each property must be from the &#39;Instrument&#39; domain. | [optional] [default to List<Property>]

```java
import com.finbourne.lusid.model.UpsertInstrumentPropertyRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String IdentifierType = "example IdentifierType";
String Identifier = "example Identifier";
@jakarta.annotation.Nullable List<Property> Properties = new List<Property>();


UpsertInstrumentPropertyRequest upsertInstrumentPropertyRequestInstance = new UpsertInstrumentPropertyRequest()
    .IdentifierType(IdentifierType)
    .Identifier(Identifier)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
