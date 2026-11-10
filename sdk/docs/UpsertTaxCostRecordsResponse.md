# com.finbourne.lusid.model.UpsertTaxCostRecordsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successes** | [**Map&lt;String, TaxCostRecord&gt;**](TaxCostRecord.md) | The Tax Cost Records that were successfully upserted, keyed by the code supplied in the request. | [optional] [default to Map<String, TaxCostRecord>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The Tax Cost Records that failed to upsert, keyed by the code supplied in the request, with the reason for each failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.UpsertTaxCostRecordsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, TaxCostRecord> Successes = new Map<String, TaxCostRecord>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


UpsertTaxCostRecordsResponse upsertTaxCostRecordsResponseInstance = new UpsertTaxCostRecordsResponse()
    .Successes(Successes)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
