# com.finbourne.lusid.model.LegalEntity
Representation of Legal Entity on LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** | The display name of the Legal Entity | [optional] [default to String]
**description** | **String** | The description of the Legal Entity | [optional] [default to String]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**lusidLegalEntityId** | **String** | The unique LUSID Legal Entity Identifier of the Legal Entity. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Legal Entity. | [optional] [default to Map<String, Property>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Legal Entity. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Legal Entity. | [optional] [default to List<Relationship>]
**counterpartyRiskInformation** | [**CounterpartyRiskInformation**](CounterpartyRiskInformation.md) |  | [optional] [default to CounterpartyRiskInformation]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.LegalEntity;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String LusidLegalEntityId = "example LusidLegalEntityId";
@jakarta.annotation.Nullable Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Relationship> Relationships = new List<Relationship>();
CounterpartyRiskInformation CounterpartyRiskInformation = new CounterpartyRiskInformation();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


LegalEntity legalEntityInstance = new LegalEntity()
    .DisplayName(DisplayName)
    .Description(Description)
    .Href(Href)
    .LusidLegalEntityId(LusidLegalEntityId)
    .Identifiers(Identifiers)
    .Properties(Properties)
    .Relationships(Relationships)
    .CounterpartyRiskInformation(CounterpartyRiskInformation)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
