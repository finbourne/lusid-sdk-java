# com.finbourne.lusid.model.CollateralAgreementApplicability
The portfolios a collateral agreement currently covers, according to its applicability filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**applicabilityFilter** | **String** | The applicability filter that was evaluated. Only its clauses on portfolio fields are applied to select the portfolios returned. | [default to String]
**portfolios** | [**List&lt;ResourceId&gt;**](ResourceId.md) | The portfolios matching the applicability filter, up to the requested limit. | [default to List<ResourceId>]
**hasMorePortfolios** | **Boolean** | Whether more portfolios match the filter than were returned. | [default to Boolean]

```java
import com.finbourne.lusid.model.CollateralAgreementApplicability;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId Id = new ResourceId();
String ApplicabilityFilter = "example ApplicabilityFilter";
List<ResourceId> Portfolios = new List<ResourceId>();
Boolean HasMorePortfolios = true;


CollateralAgreementApplicability collateralAgreementApplicabilityInstance = new CollateralAgreementApplicability()
    .Id(Id)
    .ApplicabilityFilter(ApplicabilityFilter)
    .Portfolios(Portfolios)
    .HasMorePortfolios(HasMorePortfolios);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
