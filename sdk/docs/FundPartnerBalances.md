# com.finbourne.lusid.model.FundPartnerBalances
The capital balances of one register line, in the commitment currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**committed** | **java.math.BigDecimal** | The committed capital. | [default to java.math.BigDecimal]
**uncalledCommitment** | **java.math.BigDecimal** | The commitment not yet called. | [default to java.math.BigDecimal]
**paidIn** | **java.math.BigDecimal** | The capital paid in. | [default to java.math.BigDecimal]
**returned** | **java.math.BigDecimal** | The capital returned. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | The returned capital that may be recalled. | [default to java.math.BigDecimal]
**unfunded** | **java.math.BigDecimal** | The unfunded capital. | [default to java.math.BigDecimal]
**funded** | **java.math.BigDecimal** | The funded capital. | [default to java.math.BigDecimal]
**outstandingCalls** | **java.math.BigDecimal** | Capital called but not yet paid in. Omitted on a register line that has had returned capital marked recallable, since recalled capital is not yet tracked as a balance and the figure would exclude it. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.FundPartnerBalances;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Committed = new java.math.BigDecimal("100.00");
java.math.BigDecimal UncalledCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal PaidIn = new java.math.BigDecimal("100.00");
java.math.BigDecimal Returned = new java.math.BigDecimal("100.00");
java.math.BigDecimal Recallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal Unfunded = new java.math.BigDecimal("100.00");
java.math.BigDecimal Funded = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OutstandingCalls = new java.math.BigDecimal("100.00");


FundPartnerBalances fundPartnerBalancesInstance = new FundPartnerBalances()
    .Committed(Committed)
    .UncalledCommitment(UncalledCommitment)
    .PaidIn(PaidIn)
    .Returned(Returned)
    .Recallable(Recallable)
    .Unfunded(Unfunded)
    .Funded(Funded)
    .OutstandingCalls(OutstandingCalls);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
