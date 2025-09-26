# com.finbourne.lusid.model.FlexibleDeposit
LUSID flexible deposit instrument. Represents the basic building block of a bank account  structure that can handle deferred interest payments.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | Repayment schedules for the deposit instrument. | [default to List<Schedule>]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.FlexibleDeposit;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
List<Schedule> Schedules = new List<Schedule>();
TradingConventions TradingConventions = new TradingConventions();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


FlexibleDeposit flexibleDepositInstance = new FlexibleDeposit()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .Schedules(Schedules)
    .TradingConventions(TradingConventions)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
