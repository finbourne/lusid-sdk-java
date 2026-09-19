# com.finbourne.lusid.model.CreatePortfolioDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporateActionSourceId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**taxLotSelectionCostBasis** | **String** | The cost figure that cost-referencing accounting methods evaluate when selecting tax lots for a disposal. This can be: Cost or AmortisedCost. If not supplied, the portfolio&#39;s current value is left unchanged; supply Default to reset it. A reset or never-configured basis reads back as absent. Available values: Default, Cost, AmortisedCost. | [optional] [default to String]
**fractionalUnitsTrueUpConfiguration** | [**FractionalUnitsTrueUpConfiguration**](FractionalUnitsTrueUpConfiguration.md) |  | [optional] [default to FractionalUnitsTrueUpConfiguration]
**holdingsFungibility** | **String** | Whether the portfolio&#39;s holdings are fungible across the currencies of a currency group. This can be: Default or Enabled. If not supplied, the portfolio&#39;s current value is left unchanged; supply Default to reset it. A reset or never-configured flag reads back as absent. Available values: Default, Enabled. | [optional] [default to String]

```java
import com.finbourne.lusid.model.CreatePortfolioDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId CorporateActionSourceId = new ResourceId();
@jakarta.annotation.Nullable String TaxLotSelectionCostBasis = "example TaxLotSelectionCostBasis";
FractionalUnitsTrueUpConfiguration FractionalUnitsTrueUpConfiguration = new FractionalUnitsTrueUpConfiguration();
@jakarta.annotation.Nullable String HoldingsFungibility = "example HoldingsFungibility";


CreatePortfolioDetails createPortfolioDetailsInstance = new CreatePortfolioDetails()
    .CorporateActionSourceId(CorporateActionSourceId)
    .TaxLotSelectionCostBasis(TaxLotSelectionCostBasis)
    .FractionalUnitsTrueUpConfiguration(FractionalUnitsTrueUpConfiguration)
    .HoldingsFungibility(HoldingsFungibility);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
