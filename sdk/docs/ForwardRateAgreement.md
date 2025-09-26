# com.finbourne.lusid.model.ForwardRateAgreement
LUSID representation of a Forward Rate Agreement.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The settlement date of the FRA | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates beyond their last payment date. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**fixingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date at which the rate to be paid, the reference rate, is confirmed/observed. | [default to OffsetDateTime]
**fraRate** | **java.math.BigDecimal** | The rate at which the FRA is traded. | [default to java.math.BigDecimal]
**notional** | **java.math.BigDecimal** | The amount for which the FRA is traded. | [default to java.math.BigDecimal]
**indexConvention** | [**IndexConvention**](IndexConvention.md) |  | [optional] [default to IndexConvention]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.ForwardRateAgreement;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
OffsetDateTime FixingDate = OffsetDateTime.now();
java.math.BigDecimal FraRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal Notional = new java.math.BigDecimal("100.00");
IndexConvention IndexConvention = new IndexConvention();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


ForwardRateAgreement forwardRateAgreementInstance = new ForwardRateAgreement()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .FixingDate(FixingDate)
    .FraRate(FraRate)
    .Notional(Notional)
    .IndexConvention(IndexConvention)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
