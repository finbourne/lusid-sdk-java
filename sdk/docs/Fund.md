# com.finbourne.lusid.model.Fund
A Fund entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**displayName** | **String** | The name of the Fund. | [optional] [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityIdWithDetails&gt;**](PortfolioEntityIdWithDetails.md) | A list of the portfolios on the fund, which are part of the Fund. Note: These must all have the same base currency, which must also much the Fund Base Currency. | [optional] [default to List<PortfolioEntityIdWithDetails>]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**aborId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39; | [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**yearEndDate** | [**DayMonth**](DayMonth.md) |  | [optional] [default to DayMonth]
**primaryNavType** | [**NavTypeDefinition**](NavTypeDefinition.md) |  | [optional] [default to NavTypeDefinition]
**additionalNavTypes** | [**List&lt;NavTypeDefinition&gt;**](NavTypeDefinition.md) | The definitions for any additional NAVs on the Fund. | [optional] [default to List<NavTypeDefinition>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.Fund;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
ResourceId Id = new ResourceId();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable List<PortfolioEntityIdWithDetails> PortfolioIds = new List<PortfolioEntityIdWithDetails>();
ResourceId FundConfigurationId = new ResourceId();
ResourceId AborId = new ResourceId();
@jakarta.annotation.Nullable List<InstrumentResolutionDetail> ShareClassInstruments = new List<InstrumentResolutionDetail>();
String Type = "example Type";
OffsetDateTime InceptionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer DecimalPlaces = new Integer("100.00");
DayMonth YearEndDate = new DayMonth();
NavTypeDefinition PrimaryNavType = new NavTypeDefinition();
@jakarta.annotation.Nullable List<NavTypeDefinition> AdditionalNavTypes = new List<NavTypeDefinition>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Fund fundInstance = new Fund()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .BaseCurrency(BaseCurrency)
    .PortfolioIds(PortfolioIds)
    .FundConfigurationId(FundConfigurationId)
    .AborId(AborId)
    .ShareClassInstruments(ShareClassInstruments)
    .Type(Type)
    .InceptionDate(InceptionDate)
    .DecimalPlaces(DecimalPlaces)
    .YearEndDate(YearEndDate)
    .PrimaryNavType(PrimaryNavType)
    .AdditionalNavTypes(AdditionalNavTypes)
    .Properties(Properties)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
