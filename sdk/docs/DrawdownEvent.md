# com.finbourne.lusid.model.DrawdownEvent
Event to draw down balance from a LoanFacility to a FlexLoan contract holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | Amount to be drawn down. Must be positive. | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Initialisation date of the contract. | [optional] [default to OffsetDateTime]
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]

```java
import com.finbourne.lusid.model.DrawdownEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
OffsetDateTime Date = OffsetDateTime.now();
ContractDetails ContractDetails = new ContractDetails();


DrawdownEvent drawdownEventInstance = new DrawdownEvent()
    .Amount(Amount)
    .Date(Date)
    .ContractDetails(ContractDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
