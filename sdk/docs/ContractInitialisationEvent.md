# com.finbourne.lusid.model.ContractInitialisationEvent
Event to initialise a contract with a given limit against a LoanFacility.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limit** | **java.math.BigDecimal** | Limit of this contract. Must be positive. | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Initialisation date of the contract. | [optional] [default to OffsetDateTime]
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]

```java
import com.finbourne.lusid.model.ContractInitialisationEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Limit = new java.math.BigDecimal("100.00");
OffsetDateTime Date = OffsetDateTime.now();
ContractDetails ContractDetails = new ContractDetails();


ContractInitialisationEvent contractInitialisationEventInstance = new ContractInitialisationEvent()
    .Limit(Limit)
    .Date(Date)
    .ContractDetails(ContractDetails);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
