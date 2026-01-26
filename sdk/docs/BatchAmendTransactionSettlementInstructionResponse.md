# com.finbourne.lusid.model.BatchAmendTransactionSettlementInstructionResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The specific Uniform Resource Identifier (URI) for this resource at the requested effective and asAt datetime. | [optional] [default to URI]
**values** | [**Map&lt;String, TransactionSettlementInstruction&gt;**](TransactionSettlementInstruction.md) | The settlement instructions which have been successfully upserted. | [optional] [default to Map<String, TransactionSettlementInstruction>]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The request ids of the settlement instructions which could not be upserted, along with a reason for their failure. | [optional] [default to Map<String, ErrorDetail>]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.BatchAmendTransactionSettlementInstructionResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
@jakarta.annotation.Nullable Map<String, TransactionSettlementInstruction> Values = new Map<String, TransactionSettlementInstruction>();
@jakarta.annotation.Nullable Map<String, ErrorDetail> Failed = new Map<String, ErrorDetail>();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


BatchAmendTransactionSettlementInstructionResponse batchAmendTransactionSettlementInstructionResponseInstance = new BatchAmendTransactionSettlementInstructionResponse()
    .Href(Href)
    .Values(Values)
    .Failed(Failed)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
