# com.finbourne.lusid.model.PortfolioEntityIdWithDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**displayName** | **String** |  | [optional] [default to String]
**description** | **String** |  | [optional] [default to String]
**scope** | **String** | The scope within which the portfolio or portfolio group lives. | [default to String]
**code** | **String** | Portfolio name or code. | [default to String]
**portfolioEntityType** | **String** | String identifier for portfolio e.g. \&quot;SinglePortfolio\&quot; and \&quot;GroupPortfolio\&quot;. If not specified, it is assumed to be a single portfolio. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PortfolioEntityIdWithDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable String PortfolioEntityType = "example PortfolioEntityType";


PortfolioEntityIdWithDetails portfolioEntityIdWithDetailsInstance = new PortfolioEntityIdWithDetails()
    .DisplayName(DisplayName)
    .Description(Description)
    .Scope(Scope)
    .Code(Code)
    .PortfolioEntityType(PortfolioEntityType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
