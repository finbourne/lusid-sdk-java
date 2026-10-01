# com.finbourne.lusid.model.WholeLoanFacility
Whole Loan Facility. A loan facility wholly funded by a single lender: it shares the contractual terms of a  LoanFacility, but ownership is not shared pro-rata across investors. Like a LoanFacility, this is a lightweight  instrument; the state of the facility is carried by the holding rather than by the instrument itself.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**initialCommitment** | **java.math.BigDecimal** | The initial commitment for the whole loan facility. | [default to java.math.BigDecimal]
**loanType** | **String** | LoanType for this facility. The facility can either be a revolving or a  term loan. Available values: Revolver, TermLoan. | [default to String]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | Repayment schedules for the facility. | [default to List<Schedule>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.WholeLoanFacility;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
java.math.BigDecimal InitialCommitment = new java.math.BigDecimal("100.00");
String LoanType = "example LoanType";
List<Schedule> Schedules = new List<Schedule>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


WholeLoanFacility wholeLoanFacilityInstance = new WholeLoanFacility()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .InitialCommitment(InitialCommitment)
    .LoanType(LoanType)
    .Schedules(Schedules)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
