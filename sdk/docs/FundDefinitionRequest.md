# com.finbourne.lusid.model.FundDefinitionRequest
The request used to create a Fund.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code given for the Fund. | [default to String]
**displayName** | **String** | The name of the Fund. | [default to String]
**description** | **String** | A description for the Fund. | [optional] [default to String]
**baseCurrency** | **String** | The base currency of the Fund in ISO 4217 currency code format. All portfolios must be of a matching base currency. | [default to String]
**investorStructure** | **String** | The Investor structure to be used by the Fund. Supported values are &#39;NonUnitised&#39; and &#39;Classes&#39;. | [optional] [default to String]
**portfolioIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) | A list of the Portfolio IDs associated with the fund, which are part of the Fund. Note: These must all have the same base currency, which must also much the Fund Base Currency. | [default to List<PortfolioEntityId>]
**fundConfigurationId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**shareClassInstrumentScopes** | **List&lt;String&gt;** | The scopes in which the instruments lie, currently limited to one. | [optional] [default to List<String>]
**shareClassInstruments** | [**List&lt;InstrumentResolutionDetail&gt;**](InstrumentResolutionDetail.md) | Details the user-provided instrument identifiers and the instrument resolved from them. | [optional] [default to List<InstrumentResolutionDetail>]
**type** | **String** | The type of fund; &#39;Standalone&#39;, &#39;Master&#39; or &#39;Feeder&#39; | [optional] [default to String]
**inceptionDate** | [**OffsetDateTime**](OffsetDateTime.md) | Inception date of the Fund | [default to OffsetDateTime]
**decimalPlaces** | **Integer** | Number of decimal places for reporting | [optional] [default to Integer]
**primaryNavType** | [**NavTypeDefinition**](NavTypeDefinition.md) |  | [default to NavTypeDefinition]
**additionalNavTypes** | [**List&lt;NavTypeDefinition&gt;**](NavTypeDefinition.md) | The definitions for any additional NAVs on the Fund. | [optional] [default to List<NavTypeDefinition>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Fund. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.FundDefinitionRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String BaseCurrency = "example BaseCurrency";
@jakarta.annotation.Nullable String InvestorStructure = "example InvestorStructure";
List<PortfolioEntityId> PortfolioIds = new List<PortfolioEntityId>();
ResourceId FundConfigurationId = new ResourceId();
@jakarta.annotation.Nullable List<String> ShareClassInstrumentScopes = new List<String>();
@jakarta.annotation.Nullable List<InstrumentResolutionDetail> ShareClassInstruments = new List<InstrumentResolutionDetail>();
@jakarta.annotation.Nullable String Type = "example Type";
OffsetDateTime InceptionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Integer DecimalPlaces = new Integer("100.00");
NavTypeDefinition PrimaryNavType = new NavTypeDefinition();
@jakarta.annotation.Nullable List<NavTypeDefinition> AdditionalNavTypes = new List<NavTypeDefinition>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


FundDefinitionRequest fundDefinitionRequestInstance = new FundDefinitionRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .BaseCurrency(BaseCurrency)
    .InvestorStructure(InvestorStructure)
    .PortfolioIds(PortfolioIds)
    .FundConfigurationId(FundConfigurationId)
    .ShareClassInstrumentScopes(ShareClassInstrumentScopes)
    .ShareClassInstruments(ShareClassInstruments)
    .Type(Type)
    .InceptionDate(InceptionDate)
    .DecimalPlaces(DecimalPlaces)
    .PrimaryNavType(PrimaryNavType)
    .AdditionalNavTypes(AdditionalNavTypes)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
