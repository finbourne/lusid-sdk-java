# com.finbourne.lusid.model.LoanFacility
Loan Facility. This is a very lightweight instrument which acts as a placeholder for the state that is built  from the instrument events. The facility acts as an agreement between a single borrower and many lenders (investors).  Several contracts may be drawn up to enable the lending of funds to the borrower. These contracts are modelled via  FlexibleLoan instruments in LUSID. The instrument events on the facility may relate to the facility as a whole  (for example to define a global commitment amount), or they may relate to a single contract (such as a paydown  transaction on a particular contract).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**initialCommitment** | **java.math.BigDecimal** | The initial commitment for the loan facility. | [default to java.math.BigDecimal]
**loanType** | **String** | LoanType for this facility. The facility can either be a revolving or a  term loan.    Supported string (enumeration) values are: [Revolver, TermLoan]. | [default to String]
**schedules** | [**List&lt;Schedule&gt;**](Schedule.md) | Repayment schedules for the loan. | [default to List<Schedule>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.LoanFacility;
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


LoanFacility loanFacilityInstance = new LoanFacility()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .InitialCommitment(InitialCommitment)
    .LoanType(LoanType)
    .Schedules(Schedules)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
