# com.finbourne.lusid.model.TermDeposit
LUSID representation of a Term Deposit.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. For term deposits this is the start date of the interest calculation period. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The maturity date of the instrument. For term deposits this is the last date of the interest calculation period. | [default to OffsetDateTime]
**contractSize** | **java.math.BigDecimal** | The principal amount of the term deposit. | [default to java.math.BigDecimal]
**flowConvention** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**rate** | **java.math.BigDecimal** | The fixed rate for the term deposit. Specified as a decimal, e.g 0.03 is meant to be 3% interest | [default to java.math.BigDecimal]
**domCcy** | **String** | The domestic currency of the instrument. This should be the same as the Currency set on the FlowConventions.  You do not need to populate this field for Term Deposits in LUSID as all functionality is driven by the Currency set on the FlowConventions.  LUSID will not store values saved on this field. | [optional] [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.TermDeposit;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
FlowConventions FlowConvention = new FlowConventions();
java.math.BigDecimal Rate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String DomCcy = "example DomCcy";
TradingConventions TradingConventions = new TradingConventions();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


TermDeposit termDepositInstance = new TermDeposit()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .ContractSize(ContractSize)
    .FlowConvention(FlowConvention)
    .Rate(Rate)
    .DomCcy(DomCcy)
    .TradingConventions(TradingConventions)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
