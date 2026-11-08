# com.finbourne.lusid.model.TaxSyncStatus

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolios** | [**List&lt;TaxPortfolioSyncStatus&gt;**](TaxPortfolioSyncStatus.md) | The sync position of each portfolio in the Fund. | [default to List<TaxPortfolioSyncStatus>]

```java
import com.finbourne.lusid.model.TaxSyncStatus;
import java.util.*;
import java.lang.System;
import java.net.URI;

List<TaxPortfolioSyncStatus> Portfolios = new List<TaxPortfolioSyncStatus>();


TaxSyncStatus taxSyncStatusInstance = new TaxSyncStatus()
    .Portfolios(Portfolios);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
