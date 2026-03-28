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
**investorStructure** | **String** | The Investor structure to be used by the Fund. Supported values are &#39;NonUnitised&#39; and &#39;Classes&#39;. | [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityIdWithDetails&gt;**](PortfolioEntityIdWithDetails.md) | A list of the portfolios on the fund, which are part of the Fund. Note: These must all have the same base currency, which must also much the Fund Base Currency. | [optional] [default to List<PortfolioEntityIdWithDetails>]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**aborId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. These would be decommissioned in favour of the new AllocationGroups and ShareClasses structures. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39; | [optional] [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**yearEndDate** | [**DayMonth**](DayMonth.md) |  | [optional] [default to DayMonth]
**primaryNavType** | [**NavType**](NavType.md) |  | [optional] [default to NavType]
**additionalNavTypes** | [**List&lt;NavType&gt;**](NavType.md) | The definitions for any additional NAVs on the Fund. | [optional] [default to List<NavType>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]
**createInstrument** | **Boolean** | Whether to create instruments for the Fund&#39;s share classes, series, or partner classes upon creation. Defaults to false. | [optional] [default to Boolean]
**apportionmentMethodProperty** | [**ApportionmentMethodProperty**](ApportionmentMethodProperty.md) |  | [optional] [default to ApportionmentMethodProperty]
**allocationGroups** | [**List&lt;AllocationGroup&gt;**](AllocationGroup.md) | An optional list of Allocation Group definitions for the Fund. | [optional] [default to List<AllocationGroup>]
**shareClasses** | [**List&lt;ShareClass&gt;**](ShareClass.md) | An optional list of Share Class definitions for the Fund. | [optional] [default to List<ShareClass>]
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
String InvestorStructure = "example InvestorStructure";
@jakarta.annotation.Nullable List<PortfolioEntityIdWithDetails> PortfolioIds = new List<PortfolioEntityIdWithDetails>();
ResourceId FundConfigurationId = new ResourceId();
ResourceId AborId = new ResourceId();
@jakarta.annotation.Nullable List<InstrumentResolutionDetail> ShareClassInstruments = new List<InstrumentResolutionDetail>();
@jakarta.annotation.Nullable String Type = "example Type";
OffsetDateTime InceptionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer DecimalPlaces = new Integer("100.00");
DayMonth YearEndDate = new DayMonth();
NavType PrimaryNavType = new NavType();
@jakarta.annotation.Nullable List<NavType> AdditionalNavTypes = new List<NavType>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Boolean CreateInstrument = true;
ApportionmentMethodProperty ApportionmentMethodProperty = new ApportionmentMethodProperty();
@jakarta.annotation.Nullable List<AllocationGroup> AllocationGroups = new List<AllocationGroup>();
@jakarta.annotation.Nullable List<ShareClass> ShareClasses = new List<ShareClass>();
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


Fund fundInstance = new Fund()
    .Href(Href)
    .Id(Id)
    .DisplayName(DisplayName)
    .Description(Description)
    .BaseCurrency(BaseCurrency)
    .InvestorStructure(InvestorStructure)
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
    .CreateInstrument(CreateInstrument)
    .ApportionmentMethodProperty(ApportionmentMethodProperty)
    .AllocationGroups(AllocationGroups)
    .ShareClasses(ShareClasses)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
