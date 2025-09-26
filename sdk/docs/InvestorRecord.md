# com.finbourne.lusid.model.InvestorRecord
Representation of an Investor Record on the LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investor Record lies. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investor Record. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investor Record | [optional] [default to String]
**description** | **String** | The description of the Investor Record | [optional] [default to String]
**investor** | [**Investor**](Investor.md) |  | [optional] [default to Investor]
**lusidInvestorRecordId** | **String** | The unique LUSID Investor Record Identifier of the Investor Record. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investor Record. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Investor Record. | [optional] [default to List<Relationship>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.InvestorRecord;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
Investor Investor = new Investor();
@jakarta.annotation.Nullable String LusidInvestorRecordId = "example LusidInvestorRecordId";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Relationship> Relationships = new List<Relationship>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


InvestorRecord investorRecordInstance = new InvestorRecord()
    .Scope(Scope)
    .Identifiers(Identifiers)
    .DisplayName(DisplayName)
    .Description(Description)
    .Investor(Investor)
    .LusidInvestorRecordId(LusidInvestorRecordId)
    .Properties(Properties)
    .Relationships(Relationships)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
