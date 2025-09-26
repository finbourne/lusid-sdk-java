# com.finbourne.lusid.model.UpsertInvestmentAccountRequest
Request to create or update an investor record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope in which the Investment Account lies. | [default to String]
**identifiers** | [**Map&lt;String, Property&gt;**](Property.md) | Unique client-defined identifiers of the Investment Account. | [default to Map<String, Property>]
**displayName** | **String** | The display name of the Investment Account | [default to String]
**description** | **String** | The description of the Investment Account | [optional] [default to String]
**accountType** | **String** | The type of the of the Investment Account. | [default to String]
**accountHolders** | [**List&lt;AccountHolderIdentifier&gt;**](AccountHolderIdentifier.md) | The identification of the account holders associated with this investment account | [optional] [default to List<AccountHolderIdentifier>]
**investmentPortfolios** | [**List&lt;InvestmentPortfolioIdentifier&gt;**](InvestmentPortfolioIdentifier.md) | The identification of the investment portfolios associated with this investment account | [optional] [default to List<InvestmentPortfolioIdentifier>]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties associated to the Investment Account. | [optional] [default to Map<String, Property>]

```java
import com.finbourne.lusid.model.UpsertInvestmentAccountRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
Map<String, Property> Identifiers = new Map<String, Property>();
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String AccountType = "example AccountType";
@jakarta.annotation.Nullable List<AccountHolderIdentifier> AccountHolders = new List<AccountHolderIdentifier>();
@jakarta.annotation.Nullable List<InvestmentPortfolioIdentifier> InvestmentPortfolios = new List<InvestmentPortfolioIdentifier>();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();


UpsertInvestmentAccountRequest upsertInvestmentAccountRequestInstance = new UpsertInvestmentAccountRequest()
    .Scope(Scope)
    .Identifiers(Identifiers)
    .DisplayName(DisplayName)
    .Description(Description)
    .AccountType(AccountType)
    .AccountHolders(AccountHolders)
    .InvestmentPortfolios(InvestmentPortfolios)
    .Properties(Properties);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
