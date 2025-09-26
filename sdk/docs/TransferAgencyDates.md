# com.finbourne.lusid.model.TransferAgencyDates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**priceDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the fund is priced, for the order received on ReceivedDate. Can be passed into the request instead of the ReceivedDate to calculate the TransactionDate and ExpectedPaymentDate. If both the received date and price date are given, a failure is returned. | [optional] [default to OffsetDateTime]
**transactionDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the transaction into or out of the fund is made. | [optional] [default to OffsetDateTime]
**expectedPaymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date by which the cash is expected to be paid to or from the fund. | [optional] [default to OffsetDateTime]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.TransferAgencyDates;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime PriceDate = OffsetDateTime.now();
OffsetDateTime TransactionDate = OffsetDateTime.now();
OffsetDateTime ExpectedPaymentDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


TransferAgencyDates transferAgencyDatesInstance = new TransferAgencyDates()
    .PriceDate(PriceDate)
    .TransactionDate(TransactionDate)
    .ExpectedPaymentDate(ExpectedPaymentDate)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
