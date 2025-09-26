# com.finbourne.lusid.model.InvestmentPortfolio
An Investment Portfolio of an Investment Account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | A client-defined key used to identify the Investment Portfolio, unique within the Investment Account | [optional] [default to String]
**scope** | **String** | The scope of the Investment Portfolio | [optional] [default to String]
**identifiers** | **Map&lt;String, String&gt;** | The code identifier of the Investment Portfolio | [optional] [default to Map<String, String>]
**entityUniqueId** | **String** | The unique Portfolio entity identifier | [optional] [default to String]
**portfolio** | [**Portfolio**](Portfolio.md) |  | [optional] [default to Portfolio]

```java
import com.finbourne.lusid.model.InvestmentPortfolio;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Key = "example Key";
@jakarta.annotation.Nullable String Scope = "example Scope";
@jakarta.annotation.Nullable Map<String, String> Identifiers = new Map<String, String>();
@jakarta.annotation.Nullable String EntityUniqueId = "example EntityUniqueId";
Portfolio Portfolio = new Portfolio();


InvestmentPortfolio investmentPortfolioInstance = new InvestmentPortfolio()
    .Key(Key)
    .Scope(Scope)
    .Identifiers(Identifiers)
    .EntityUniqueId(EntityUniqueId)
    .Portfolio(Portfolio);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
