# com.finbourne.lusid.model.RecResultLinkKey
One item pairing that established a link between two rec results: the identifiers both results' items carried.  Exactly one of holdingId and transactionId is populated; taxLotId only ever accompanies a holdingId, and only  where the pairing was established at tax-lot precision.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The holding both items carried, for a holding-keyed pairing. Null for a transaction-keyed one. | [optional] [default to String]
**taxLotId** | **String** | The tax lot both items carried within the holding, where the pairing was established at tax-lot precision. Null where it was established at holding precision, and always null for a transaction-keyed pairing. | [optional] [default to String]
**transactionId** | **String** | The transaction both items carried, for a transaction-keyed pairing. Null for a holding-keyed one. | [optional] [default to String]

```java
import com.finbourne.lusid.model.RecResultLinkKey;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String TaxLotId = "example TaxLotId";
@jakarta.annotation.Nullable String TransactionId = "example TransactionId";


RecResultLinkKey recResultLinkKeyInstance = new RecResultLinkKey()
    .HoldingId(HoldingId)
    .TaxLotId(TaxLotId)
    .TransactionId(TransactionId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
