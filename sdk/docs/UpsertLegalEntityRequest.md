# com.finbourne.lusid.model.UpsertLegalEntityRequest
Request to create or update an legal entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | The identifiers the legal entity will be upserted with.The provided keys should be idTypeScope, idTypeCode, code | [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Legal Entity. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Legal Entity | [default to String]
**description** | **String** | The description of the Legal Entity | [optional] [default to String]
**counterpartyRiskInformation** | [**CounterpartyRiskInformation**](CounterpartyRiskInformation.md) |  | [optional] [default to CounterpartyRiskInformation]

```java
import com.finbourne.lusid.model.UpsertLegalEntityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
CounterpartyRiskInformation CounterpartyRiskInformation = new CounterpartyRiskInformation();


UpsertLegalEntityRequest upsertLegalEntityRequestInstance = new UpsertLegalEntityRequest()
    .Identifiers(Identifiers)
    .Properties(Properties)
    .DisplayName(DisplayName)
    .Description(Description)
    .CounterpartyRiskInformation(CounterpartyRiskInformation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
