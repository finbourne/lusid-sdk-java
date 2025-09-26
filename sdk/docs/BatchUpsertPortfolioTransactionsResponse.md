# com.finbourne.lusid.model.BatchUpsertPortfolioTransactionsResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, Transaction&gt;**](Transaction.md) | The transactions which have been successfully upserted. | [optional] [default to Map<String, Transaction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The transactions that could not be upserted along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**metadata** | [**Map&lt;String, List&lt;ResponseMetaData&gt;&gt;**](List.md) | Contains warnings related to unresolved instruments or non-existent transaction types for the upserted trades | [optional] [default to Map<String, List<ResponseMetaData>>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchUpsertPortfolioTransactionsResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, Transaction> Values = new Map<String, Transaction>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable Map<String, List<ResponseMetaData>> Metadata = new Map<String, List<ResponseMetaData>>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchUpsertPortfolioTransactionsResponse batchUpsertPortfolioTransactionsResponseInstance = new BatchUpsertPortfolioTransactionsResponse()
    .Values(Values)
    .Failed(Failed)
    .Metadata(Metadata)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
