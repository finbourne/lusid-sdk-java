# com.finbourne.lusid.model.Instrument
A list of instruments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**scope** | **String** | The scope in which the instrument lies. | [optional] [default to String]
**lusidInstrumentId** | **String** | The unique LUSID Instrument Identifier (LUID) of the instrument. | [default to String]
**version** | [**Version**](Version.md) |  | [default to Version]
**stagedModifications** | [**StagedModificationsInfo**](StagedModificationsInfo.md) |  | [optional] [default to StagedModificationsInfo]
**name** | **String** | The name of the instrument. | [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The set of identifiers that can be used to identify the instrument. | [default to Map<String, String>]
**properties** | [**List&lt;Property&gt;**](Property.md) | The requested instrument properties. These will be from the &#39;Instrument&#39; domain. | [optional] [default to List<Property>]
**lookthroughPortfolio** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**instrumentDefinition** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**state** | **String** | The state of of the instrument at the asAt datetime of this version of the instrument definition. The available values are: Active, Inactive, Deleted | [default to String]
**assetClass** | **String** | The nominal asset class of the instrument, e.g. InterestRates, FX, Inflation, Equities, Credit, Commodities, etc. The available values are: InterestRates, FX, Inflation, Equities, Credit, Commodities, Money, Unknown | [optional] [default to String]
**domCcy** | **String** | The domestic currency, meaning the currency in which the instrument would typically be expected to pay cashflows, e.g. a share in AAPL being USD. | [optional] [default to String]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the instrument. | [optional] [default to List<Relationship>]
**settlementCycle** | [**SettlementCycle**](SettlementCycle.md) |  | [optional] [default to SettlementCycle]
**dataModelMembership** | [**DataModelMembership**](DataModelMembership.md) |  | [optional] [default to DataModelMembership]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Instrument;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable String Scope = "example Scope";
String LusidInstrumentId = "example LusidInstrumentId";
Version Version = new Version();
StagedModificationsInfo StagedModifications = new StagedModificationsInfo();
String Name = "example Name";
Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable List<Property> Properties = new List<Property>();
ResourceId LookthroughPortfolio = new ResourceId();
LusidInstrument InstrumentDefinition = new LusidInstrument();
String State = "example State";
String AssetClass = "example AssetClass";
@jakarta.annotation.Nullable String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable List<Relationship> Relationships = new List<Relationship>();
SettlementCycle SettlementCycle = new SettlementCycle();
DataModelMembership DataModelMembership = new DataModelMembership();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Instrument instrumentInstance = new Instrument()
    .Href(Href)
    .Scope(Scope)
    .LusidInstrumentId(LusidInstrumentId)
    .Version(Version)
    .StagedModifications(StagedModifications)
    .Name(Name)
    .Identifiers(Identifiers)
    .Properties(Properties)
    .LookthroughPortfolio(LookthroughPortfolio)
    .InstrumentDefinition(InstrumentDefinition)
    .State(State)
    .AssetClass(AssetClass)
    .DomCcy(DomCcy)
    .Relationships(Relationships)
    .SettlementCycle(SettlementCycle)
    .DataModelMembership(DataModelMembership)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
