# com.finbourne.lusid.model.DrawdownEvent
Event to draw down balance from a LoanFacility to a FlexLoan contract holding.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **java.math.BigDecimal** | Amount to be drawn down. Must be positive. | [default to java.math.BigDecimal]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the drawdown | [optional] [default to OffsetDateTime]
**contractDetails** | [**ContractDetails**](ContractDetails.md) |  | [default to ContractDetails]
**agencyFxRate** | **java.math.BigDecimal** | Agency FX rate for multi-currency drawdowns.  When a drawdown is in a currency that&#39;s different to the facility&#39;s, an agency FX rate is specified for converting drawdown amount into facility currency to alter the facility&#39;s balance.  Default value of 1. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.DrawdownEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
OffsetDateTime Date = OffsetDateTime.now();
ContractDetails ContractDetails = new ContractDetails();
java.math.BigDecimal AgencyFxRate = new java.math.BigDecimal("100.00");


DrawdownEvent drawdownEventInstance = new DrawdownEvent()
    .Amount(Amount)
    .Date(Date)
    .ContractDetails(ContractDetails)
    .AgencyFxRate(AgencyFxRate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
