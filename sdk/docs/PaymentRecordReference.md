# com.finbourne.lusid.model.PaymentRecordReference
Identifies a Payment Record attached to a specific transaction within a portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**transactionId** | **String** | The ID of the cash transaction within the portfolio to which the Payment Record is attached. | [default to String]
**paymentRecordId** | **String** | The unique identifier of the Payment Record attached to the above transaction. | [default to String]

```java
import com.finbourne.lusid.model.PaymentRecordReference;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
String TransactionId = "example TransactionId";
String PaymentRecordId = "example PaymentRecordId";


PaymentRecordReference paymentRecordReferenceInstance = new PaymentRecordReference()
    .PortfolioId(PortfolioId)
    .TransactionId(TransactionId)
    .PaymentRecordId(PaymentRecordId);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
