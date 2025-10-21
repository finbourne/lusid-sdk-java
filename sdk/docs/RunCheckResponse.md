# com.finbourne.lusid.model.RunCheckResponse
Response containing the results of running data quality checks

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataQualityCheckResults** | [**List&lt;DataQualityCheckResult&gt;**](DataQualityCheckResult.md) | Collection of data quality check results | [optional] [default to List<DataQualityCheckResult>]

```java
import com.finbourne.lusid.model.RunCheckResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable List<DataQualityCheckResult> DataQualityCheckResults = new List<DataQualityCheckResult>();


RunCheckResponse runCheckResponseInstance = new RunCheckResponse()
    .DataQualityCheckResults(DataQualityCheckResults);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
