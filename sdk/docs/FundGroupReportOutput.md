# com.finbourne.lusid.model.FundGroupReportOutput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **String** | Available values: NonConsolidated (each fund&#39;s rows returned as they are, tagged with the fund and valuation point). Consolidated is not yet supported. Defaults to NonConsolidated. Available values: NonConsolidated, Consolidated. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundGroupReportOutput;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Mode = "example Mode";


FundGroupReportOutput fundGroupReportOutputInstance = new FundGroupReportOutput()
    .Mode(Mode);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
