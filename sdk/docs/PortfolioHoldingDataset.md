# com.finbourne.lusid.model.PortfolioHoldingDataset
Contains the run-time parameters that are appropriate for check definitions  with datasetSchema.type = \"PortfolioContents\"

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**effectiveAt** | [**OffsetDateTime**](OffsetDateTime.md) | The effectiveAt date to fetch the data. Nullable. Defaults to latest. | [optional] [default to OffsetDateTime]
**portfolioScope** | **String** | The scope of the portfolios whose holdings to check. Nullable. Every scope is checked if not provided. | [optional] [default to String]
**portfolioSelectorAttribute** | **String** | An attribute (field name or propertyKey) to use to narrow down the portfolios whose holdings are checked. | [optional] [default to String]
**portfolioSelectorValue** | **String** | The value of the above attribute used to narrow down the portfolios. | [optional] [default to String]
**holdingSelectorAttribute** | **String** | An attribute (field name, propertyKey or sub-holding key) to use to narrow down the holdings checked  within those portfolios. | [optional] [default to String]
**holdingSelectorValue** | **String** | The value of the above attribute used to narrow down the holdings. | [optional] [default to String]
**byTaxlots** | **Boolean** | Whether to expand holdings to their underlying tax lots. Defaults to false. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.PortfolioHoldingDataset;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime EffectiveAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String PortfolioScope = "example PortfolioScope";
@jakarta.annotation.Nullable String PortfolioSelectorAttribute = "example PortfolioSelectorAttribute";
@jakarta.annotation.Nullable String PortfolioSelectorValue = "example PortfolioSelectorValue";
@jakarta.annotation.Nullable String HoldingSelectorAttribute = "example HoldingSelectorAttribute";
@jakarta.annotation.Nullable String HoldingSelectorValue = "example HoldingSelectorValue";
Boolean ByTaxlots = true;


PortfolioHoldingDataset portfolioHoldingDatasetInstance = new PortfolioHoldingDataset()
    .AsAt(AsAt)
    .EffectiveAt(EffectiveAt)
    .PortfolioScope(PortfolioScope)
    .PortfolioSelectorAttribute(PortfolioSelectorAttribute)
    .PortfolioSelectorValue(PortfolioSelectorValue)
    .HoldingSelectorAttribute(HoldingSelectorAttribute)
    .HoldingSelectorValue(HoldingSelectorValue)
    .ByTaxlots(ByTaxlots);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
