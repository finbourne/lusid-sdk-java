# com.finbourne.lusid.model.FlexibleRepoPartialClosureEvent
Event representing the partial closure of a repurchase   agreement. Each event reduces the outstanding notional   and generates a corresponding receive-leg cashflow. The   final maturity cashflow is adjusted accordingly.  If multiple events are created, their effects compound.   Once the total repaid amount reaches the original purchase   price, no further receive-leg cashflows are generated. Any   event exceeding the remaining notional is marked with a   diagnostic to indicate it is invalid due to excessive repayment.  For example, for a repo with a 5% rate, 1% haircut and   collateral value of 100 (purchase price = 99), a partial   closure of cash amount 10 followed by one of 100 results in   only the first event producing a cashflow. The second,   exceeding the remaining balance, is ignored and flagged   with a diagnostic. The remaining balance is settled at   maturity of the repurchase agreement.  Specific to a FlexibleRepo instrument.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entitlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required property.  The date on which the counterparties become entitled   to exchange cash as part of a partial closure of the   repurchase agreement. The date must be before or on   the settlement date, and on or before the maturity   date of the repo.  This is a required field, unless otherwise supplied via \&quot;EventDateStamps\&quot; in  the instrument event upsert request. | [optional] [default to OffsetDateTime]
**settlementDate** | [**OffsetDateTime**](OffsetDateTime.md) | Required property.  The date on which the exchange of cash is settled.   The date must be on or after the entitlement date,  and on or before the maturity date of the repo.  This is a required field, unless otherwise supplied via \&quot;EventDateStamps\&quot; in  the instrument event upsert request. | [optional] [default to OffsetDateTime]
**amount** | **java.math.BigDecimal** | The amount of cash to be exchanged as part of a partial closure of the repurchase agreement.  Either the absolute cash amount or a percentage of the remaining amount,  depending on the AmountType. | [default to java.math.BigDecimal]
**amountType** | **String** | AmountType of the cash amount to be exchanged as part of a partial closure of the repurchase agreement.  Either percentage or absolute cash amount.    Supported string (enumeration) values are: [Percentage, Units]. | [default to String]
**partialClosureConstituents** | [**List&lt;PartialClosureConstituent&gt;**](PartialClosureConstituent.md) | List of the collateral instruments involved in this partial closure, along with how they are affected. | [default to List<PartialClosureConstituent>]

```java
import com.finbourne.lusid.model.FlexibleRepoPartialClosureEvent;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime EntitlementDate = OffsetDateTime.now();
OffsetDateTime SettlementDate = OffsetDateTime.now();
java.math.BigDecimal Amount = new java.math.BigDecimal("100.00");
String AmountType = "example AmountType";
List<PartialClosureConstituent> PartialClosureConstituents = new List<PartialClosureConstituent>();


FlexibleRepoPartialClosureEvent flexibleRepoPartialClosureEventInstance = new FlexibleRepoPartialClosureEvent()
    .EntitlementDate(EntitlementDate)
    .SettlementDate(SettlementDate)
    .Amount(Amount)
    .AmountType(AmountType)
    .PartialClosureConstituents(PartialClosureConstituents);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
