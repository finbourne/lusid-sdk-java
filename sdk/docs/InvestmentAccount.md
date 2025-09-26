# com.finbourne.lusid.model.InvestmentAccount
Representation of an Investment Account on the LUSID API

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investment Account lies. | [optional] [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investment Account. | [optional] [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investment Account | [optional] [default to String]
**description** | **String** | The description of the Investment Account | [optional] [default to String]
**accountType** | **String** | The type of the of the Investment Account. | [optional] [default to String]
**accountHolders** | [**List&lt;AccountHolder&gt;**](AccountHolder.md) | The Account Holders of the Investment Account. | [optional] [default to List<AccountHolder>]
**investmentPortfolios** | [**List&lt;InvestmentPortfolio&gt;**](InvestmentPortfolio.md) | The Investment Portfolios of the Investment Account. | [optional] [default to List<InvestmentPortfolio>]
**lusidInvestmentAccountId** | **String** | The unique LUSID Investment Account Identifier of the Investment Account. | [optional] [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investment Account. | [optional] [default to Map<String, Property>]
**relationships** | [**List&lt;Relationship&gt;**](Relationship.md) | A set of relationships associated to the Investment Account. | [optional] [default to List<Relationship>]
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**version** | [**Version**](Version.md) |  | [optional] [default to Version]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.InvestmentAccount;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable Map<String, Property> Identifiers = new Map<String, Property>();
@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
@jakarta.annotation.Nullable String AccountType = "example AccountType";
@jakarta.annotation.Nullable List<AccountHolder> AccountHolders = new List<AccountHolder>();
@jakarta.annotation.Nullable List<InvestmentPortfolio> InvestmentPortfolios = new List<InvestmentPortfolio>();
@jakarta.annotation.Nullable String LusidInvestmentAccountId = "example LusidInvestmentAccountId";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable List<Relationship> Relationships = new List<Relationship>();
@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
Version Version = new Version();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


InvestmentAccount investmentAccountInstance = new InvestmentAccount()
    .Scope(Scope)
    .Identifiers(Identifiers)
    .DisplayName(DisplayName)
    .Description(Description)
    .AccountType(AccountType)
    .AccountHolders(AccountHolders)
    .InvestmentPortfolios(InvestmentPortfolios)
    .LusidInvestmentAccountId(LusidInvestmentAccountId)
    .Properties(Properties)
    .Relationships(Relationships)
    .Href(Href)
    .Version(Version)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
