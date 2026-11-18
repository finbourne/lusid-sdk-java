# com.finbourne.lusid.model.PortfolioWithWarnings
A portfolio together with warnings about its configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolio** | [**Portfolio**](Portfolio.md) |  | [optional] [default to Portfolio]
**warnings** | [**List&lt;Warning&gt;**](Warning.md) |  | [optional] [default to List<Warning>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.PortfolioWithWarnings;
import java.util.*;
import java.lang.System;
import java.net.URI;

Portfolio Portfolio = new Portfolio();
@jakarta.annotation.Nullable List<Warning> Warnings = new List<Warning>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


PortfolioWithWarnings portfolioWithWarningsInstance = new PortfolioWithWarnings()
    .Portfolio(Portfolio)
    .Warnings(Warnings)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
