# com.finbourne.lusid.model.TransferAgencyTransactionFromOrderResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**securityTransactionId** | **String** |  | [optional] [default to String]
**amendedCashTransactionId** | **String** |  | [optional] [default to String]
**price** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]
**units** | **java.math.BigDecimal** |  | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TransferAgencyTransactionFromOrderResult;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId OrderId = new ResourceId();
@jakarta.annotation.Nullable String SecurityTransactionId = "example SecurityTransactionId";
@jakarta.annotation.Nullable String AmendedCashTransactionId = "example AmendedCashTransactionId";
java.math.BigDecimal Price = new java.math.BigDecimal("100.00");
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");


TransferAgencyTransactionFromOrderResult transferAgencyTransactionFromOrderResultInstance = new TransferAgencyTransactionFromOrderResult()
    .OrderId(OrderId)
    .SecurityTransactionId(SecurityTransactionId)
    .AmendedCashTransactionId(AmendedCashTransactionId)
    .Price(Price)
    .Units(Units);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
