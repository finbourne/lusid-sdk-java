# com.finbourne.lusid.model.FundingLeg
LUSID representation of a Funding Leg with variable notional.    This Funding Leg is a hybrid between a single leg swap and a loan facility; the notional is not fixed and can vary within a reset period.      The model can be used to represent the funding leg of a basket of instruments (e.g. equities) where the contents  of the basket can change over time. The actual notional history is stored in the FundingLegHistory object.     The actual notional history is stored in the FundingLegHistory object.     The main analytic calculated for this instrument is Accrual rather than PV.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date. | [default to OffsetDateTime]
**legDefinition** | [**LegDefinition**](LegDefinition.md) |  | [default to LegDefinition]
**notional** | **java.math.BigDecimal** | The initial notional of the Funding Leg instrument.  When \&quot;RequiresFundingLegHistory\&quot; property key is present in transaction key, during a GetValuation endpoint call (for instance),  this field would overriden by the Funding Leg history&#39;s notional and this notional field would not be used in the pricing and accrual calculations.  As such, we recommend setting this to 0 or not setting it at all.  Please see the following Notebook example and Knowledge Base article:  Notebook: https://github.com/finbourne/sample-notebooks/blob/master/examples/use-cases/instruments/Funding%20Leg%20Swap.ipynb  Knowledge Base article: https://support.lusid.com/knowledgebase/article/KA-01764/ | [optional] [default to java.math.BigDecimal]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.FundingLeg;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
LegDefinition LegDefinition = new LegDefinition();
@jakarta.annotation.Nullable java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


FundingLeg fundingLegInstance = new FundingLeg()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .LegDefinition(LegDefinition)
    .Notional(Notional)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
