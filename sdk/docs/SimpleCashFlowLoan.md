# com.finbourne.lusid.model.SimpleCashFlowLoan
LUSID representation of a SimpleCashFlowLoan.  This is a simple loan, with interest payments and nationals provided and not calculated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**periods** | [**List&lt;LoanPeriod&gt;**](LoanPeriod.md) | Periods of the underlying loan | [default to List<LoanPeriod>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.SimpleCashFlowLoan;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
List<LoanPeriod> Periods = new List<LoanPeriod>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


SimpleCashFlowLoan simpleCashFlowLoanInstance = new SimpleCashFlowLoan()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .Periods(Periods)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
