# com.finbourne.lusid.model.PartnerCapitalAccountMemo
The memo block of a capital account statement: commitment balances from the register at the period end.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitment** | **java.math.BigDecimal** | The partner&#39;s total commitment. | [default to java.math.BigDecimal]
**uncalledCommitment** | **java.math.BigDecimal** | The commitment not yet called. | [default to java.math.BigDecimal]
**recallable** | **java.math.BigDecimal** | Distributions that the fund may recall. | [default to java.math.BigDecimal]
**availableCommitment** | **java.math.BigDecimal** | The commitment available to call, being uncalled plus recallable. | [default to java.math.BigDecimal]
**contributionsReceivable** | **java.math.BigDecimal** | Called contributions not yet received from the partner, counting capital that was returned as recallable and has since been recalled. Omitted while a register line of the partner that has had returned capital marked recallable has not been rebuilt with recalled capital as a balance, since the figure could then miss an unpaid recall; the declared distributions are then served gross. | [optional] [default to java.math.BigDecimal]
**distributionsDeclaredNotPaid** | **java.math.BigDecimal** | Distributions declared to the partner but not yet paid. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PartnerCapitalAccountMemo;
import java.util.*;
import java.lang.System;
import java.net.URI;

java.math.BigDecimal Commitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal UncalledCommitment = new java.math.BigDecimal("100.00");
java.math.BigDecimal Recallable = new java.math.BigDecimal("100.00");
java.math.BigDecimal AvailableCommitment = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ContributionsReceivable = new java.math.BigDecimal("100.00");
java.math.BigDecimal DistributionsDeclaredNotPaid = new java.math.BigDecimal("100.00");


PartnerCapitalAccountMemo partnerCapitalAccountMemoInstance = new PartnerCapitalAccountMemo()
    .Commitment(Commitment)
    .UncalledCommitment(UncalledCommitment)
    .Recallable(Recallable)
    .AvailableCommitment(AvailableCommitment)
    .ContributionsReceivable(ContributionsReceivable)
    .DistributionsDeclaredNotPaid(DistributionsDeclaredNotPaid);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
