# com.finbourne.lusid.model.PortfolioEntityId
Specification of a portfolio or portfolio group id, its scope and which it is.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scope** | **String** | The scope within which the portfolio or portfolio group lives. | [default to String]
**code** | **String** | Portfolio name or code. | [default to String]
**portfolioEntityType** | **String** | String identifier for portfolio e.g. \&quot;SinglePortfolio\&quot; and \&quot;GroupPortfolio\&quot;. If not specified, it is assumed to be a single portfolio. | [optional] [default to String]

```java
import com.finbourne.lusid.model.PortfolioEntityId;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Scope = "example Scope";
String Code = "example Code";
@jakarta.annotation.Nullable String PortfolioEntityType = "example PortfolioEntityType";


PortfolioEntityId portfolioEntityIdInstance = new PortfolioEntityId()
    .Scope(Scope)
    .Code(Code)
    .PortfolioEntityType(PortfolioEntityType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
