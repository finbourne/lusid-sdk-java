# com.finbourne.lusid.model.TaxPortfolioSyncStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**lastTransactionAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the latest transaction was booked to the portfolio. Absent when the portfolio has no transactions. | [optional] [default to OffsetDateTime]
**lastTaxAsAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the tax engine last processed the Fund, taken from its latest valuation point. Absent when no valuation point has been run. | [optional] [default to OffsetDateTime]
**inSync** | **Boolean** | True when the tax position is no older than the latest booked transaction, or the portfolio has no transactions. | [default to Boolean]
**assetClass** | **String** | The asset class of the portfolio&#39;s holdings where the holding data carries one. Optional. | [optional] [default to String]
**countryOfDomicile** | **String** | The country of domicile of the portfolio&#39;s holdings where the holding data carries one. Optional. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxPortfolioSyncStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
@jakarta.annotation.Nullable OffsetDateTime LastTransactionAsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime LastTaxAsAt = OffsetDateTime.now();
Boolean InSync = true;
@jakarta.annotation.Nullable String AssetClass = "example AssetClass";
@jakarta.annotation.Nullable String CountryOfDomicile = "example CountryOfDomicile";


TaxPortfolioSyncStatus taxPortfolioSyncStatusInstance = new TaxPortfolioSyncStatus()
    .PortfolioId(PortfolioId)
    .LastTransactionAsAt(LastTransactionAsAt)
    .LastTaxAsAt(LastTaxAsAt)
    .InSync(InSync)
    .AssetClass(AssetClass)
    .CountryOfDomicile(CountryOfDomicile);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
