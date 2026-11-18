# com.finbourne.lusid.model.CompositePortfolioConstituentRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**fromDate** | [**OffsetDateTime**](OffsetDateTime.md) | The effective date from which the constituent contributes to the composite portfolio. Defaults to the constituent&#39;s creation date, and must not be later than it, because a constituent contributes its whole history. | [optional] [default to OffsetDateTime]

```java
import com.finbourne.lusid.model.CompositePortfolioConstituentRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime FromDate = OffsetDateTime.now();


CompositePortfolioConstituentRequest compositePortfolioConstituentRequestInstance = new CompositePortfolioConstituentRequest()
    .PortfolioId(PortfolioId)
    .FromDate(FromDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
