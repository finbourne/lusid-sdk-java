# com.finbourne.lusid.model.CreatePortfolioDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxLotSelectionCostBasis** | **String** | The cost figure that cost-referencing accounting methods evaluate when selecting tax lots for a disposal. This can be: Cost or AmortisedCost. If not supplied, the portfolio&#39;s current value is left unchanged; supply Default to reset it. A reset or never-configured basis reads back as absent. Available values: Default, Cost, AmortisedCost. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreatePortfolioDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CorporateActionSourceId = new ResourceId();
@jakarta.annotation.Nullable String TaxLotSelectionCostBasis = "example TaxLotSelectionCostBasis";


CreatePortfolioDetails createPortfolioDetailsInstance = new CreatePortfolioDetails()
    .CorporateActionSourceId(CorporateActionSourceId)
    .TaxLotSelectionCostBasis(TaxLotSelectionCostBasis);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
