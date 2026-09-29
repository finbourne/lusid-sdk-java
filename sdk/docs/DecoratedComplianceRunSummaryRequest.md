# com.finbourne.lusid.model.DecoratedComplianceRunSummaryRequest
Specification for retrieving a decorated compliance run summary, optionally restricted to a  set of portfolios and/or portfolio groups.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**portfolioEntityIds** | [**List&lt;PortfolioEntityId&gt;**](PortfolioEntityId.md) |  | [optional] [default to List<PortfolioEntityId>]
**propertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.DecoratedComplianceRunSummaryRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId RunId = new ResourceId();
@jakarta.annotation.Nullable List<PortfolioEntityId> PortfolioEntityIds = new List<PortfolioEntityId>();
@jakarta.annotation.Nullable List<String> PropertyKeys = new List<String>();


DecoratedComplianceRunSummaryRequest decoratedComplianceRunSummaryRequestInstance = new DecoratedComplianceRunSummaryRequest()
    .RunId(RunId)
    .PortfolioEntityIds(PortfolioEntityIds)
    .PropertyKeys(PropertyKeys);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
