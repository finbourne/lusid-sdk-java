# com.finbourne.lusid.model.PortfolioReconciliationRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**effectiveAt** | **String** | The effective date of the portfolio | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | Optional. The AsAt date of the portfolio | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.PortfolioReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();


PortfolioReconciliationRequest portfolioReconciliationRequestInstance = new PortfolioReconciliationRequest()
    .PortfolioId(PortfolioId)
    .EffectiveAt(EffectiveAt)
    .AsAt(AsAt);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
