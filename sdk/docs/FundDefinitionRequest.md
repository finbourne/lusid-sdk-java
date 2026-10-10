# com.finbourne.lusid.model.FundDefinitionRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Fund. | [default to String]
**shortCode** | **String** | A short code for the Fund. A fund structure tags journal entry lines with the short code of the member they originated from, so it should be unique across the funds of one structure. Optional. | [optional] [default to String]
**displayName** | **String** | The name of the Fund. | [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. | [default to String]
**investorStructure** | **String** | The Investor structure to be used by the Fund. Available values: NonUnitised, Classes. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | A list of the Portfolio IDs associated with the fund, which are part of the Fund. Note: These must all have the same base currency, which must also match the Fund Base Currency. | [default to List<PortfolioEntityId>]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [optional] [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. These would be decommissioned in favour of the new AllocationGroups and ShareClasses structures. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The kind of vehicle the fund is, one of the values of the system/fundVehicleType data type. Master and Feeder are deprecated: the structural role of a fund now lives on its fund structure node, and a fund with either type cannot be a member of a fund structure. Available values: Standalone, Master, Feeder, SPV, AIV, TaxBlocker, CarryVehicle, SponsorCommitmentVehicle, CoInvestVehicle, GPInterestHolder, SMA, CTA. | [optional] [default to String]
**taxTransparency** | **String** | Whether the Fund is looked through for tax: Transparent passes its income and gains to its holders as their own, Opaque is taxed in its own right. Optional; if not set, a TaxBlocker is Opaque and a CarryVehicle or GPInterestHolder is Transparent. A fund structure requires it on every SPV and AIV member. Available values: Transparent, Opaque. | [optional] [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**primaryNavType** | [**NavTypeDefinition**](NavTypeDefinition.md) |  | [default to NavTypeDefinition]
**additionalNavTypes** | [**List&lt;NavTypeDefinition&gt;**](NavTypeDefinition.md) | The definitions for any additional NAVs on the Fund. | [optional] [default to List<NavTypeDefinition>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]
**createInstrument** | **Boolean** | Whether to create instruments for the Fund&#39;s share classes, series, or partner classes upon creation. Defaults to false. | [optional] [default to Boolean]
**shareClasses** | [**List&lt;ShareClassDefinition&gt;**](ShareClassDefinition.md) | An optional list of Share Class definitions for the Fund. | [optional] [default to List<ShareClassDefinition>]
**pricingMethodology** | [**PricingMethodology**](PricingMethodology.md) |  | [optional] [default to PricingMethodology]
**reportingPrices** | [**List&lt;ReportingPrice&gt;**](ReportingPrice.md) | Share class prices the Fund publishes at each valuation point under labels of its own, alongside the dealing price, for example a mid price for performance reporting. Optional. Each source other than Mid must be published by the valuation recipe of every active NAV type. Labels must be unique and cannot be dealingPrice, dealingBid or dealingOffer. Patch the list whole at /reportingPrices. | [optional] [default to List<ReportingPrice>]

```java
import com.finbourne.lusid.model.FundDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
@jakarta.annotation.Nullable String ShortCode = "example ShortCode";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable String InvestorStructure = "example InvestorStructure";
List<PortfolioEntityId> PortfolioIds = new List<PortfolioEntityId>();
ResourceId FundConfigurationId = new ResourceId();
@jakarta.annotation.Nullable List<String> ShareClassInstrumentScopes = new List<String>();
@jakarta.annotation.Nullable List<InstrumentResolutionDetail> ShareClassInstruments = new List<InstrumentResolutionDetail>();
@jakarta.annotation.Nullable String Type = "example Type";
@jakarta.annotation.Nullable String TaxTransparency = "example TaxTransparency";
OffsetDateTime InceptionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer DecimalPlaces = new Integer("100.00");
NavTypeDefinition PrimaryNavType = new NavTypeDefinition();
@jakarta.annotation.Nullable List<NavTypeDefinition> AdditionalNavTypes = new List<NavTypeDefinition>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
Boolean CreateInstrument = true;
@jakarta.annotation.Nullable List<ShareClassDefinition> ShareClasses = new List<ShareClassDefinition>();
PricingMethodology PricingMethodology = new PricingMethodology();
@jakarta.annotation.Nullable List<ReportingPrice> ReportingPrices = new List<ReportingPrice>();


FundDefinitionRequest fundDefinitionRequestInstance = new FundDefinitionRequest()
    .Code(Code)
    .ShortCode(ShortCode)
    .DisplayName(DisplayName)
    .Description(Description)
    .BaseCurrency(BaseCurrency)
    .InvestorStructure(InvestorStructure)
    .PortfolioIds(PortfolioIds)
    .FundConfigurationId(FundConfigurationId)
    .ShareClassInstrumentScopes(ShareClassInstrumentScopes)
    .ShareClassInstruments(ShareClassInstruments)
    .Type(Type)
    .TaxTransparency(TaxTransparency)
    .InceptionDate(InceptionDate)
    .DecimalPlaces(DecimalPlaces)
    .PrimaryNavType(PrimaryNavType)
    .AdditionalNavTypes(AdditionalNavTypes)
    .Properties(Properties)
    .CreateInstrument(CreateInstrument)
    .ShareClasses(ShareClasses)
    .PricingMethodology(PricingMethodology)
    .ReportingPrices(ReportingPrices);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
