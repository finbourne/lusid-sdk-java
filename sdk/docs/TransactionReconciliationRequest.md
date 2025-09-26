# com.finbourne.lusid.model.TransactionReconciliationRequest
Specifies the parameter to be use when performing a Transaction Reconciliation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leftPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**rightPortfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**mappingId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**fromTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**toTransactionDate** | [**OffsetDateTime**](OffsetDateTime.md) |  | [default to OffsetDateTime]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | [optional] [default to OffsetDateTime]
**propertyKeys** | **List&lt;String&gt;** |  | [optional] [default to List<String>]

```java
import com.finbourne.lusid.model.TransactionReconciliationRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId LeftPortfolioId = new ResourceId();
ResourceId RightPortfolioId = new ResourceId();
ResourceId MappingId = new ResourceId();
OffsetDateTime FromTransactionDate = OffsetDateTime.now();
OffsetDateTime ToTransactionDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime AsAt = OffsetDateTime.now();
@jakarta.annotation.Nullable List<String> PropertyKeys = new List<String>();


TransactionReconciliationRequest transactionReconciliationRequestInstance = new TransactionReconciliationRequest()
    .LeftPortfolioId(LeftPortfolioId)
    .RightPortfolioId(RightPortfolioId)
    .MappingId(MappingId)
    .FromTransactionDate(FromTransactionDate)
    .ToTransactionDate(ToTransactionDate)
    .AsAt(AsAt)
    .PropertyKeys(PropertyKeys);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
