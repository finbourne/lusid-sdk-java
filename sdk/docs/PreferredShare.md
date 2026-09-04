# com.finbourne.lusid.model.PreferredShare
LUSID representation of a preferred (preference) share: an equity-classified security that pays an  intrinsic, schedule-driven dividend of DividendRate x ParValue. The schedule is perpetual unless a  MaturityDate is supplied, in which case the share redeems at par on that date.  It carries Bond's shape rather than Equity's - StartDate, MaturityDate and FlowConventions are real,  settable properties - but its dividend is a flat amount per period rather than a day-count-weighted  coupon, and its schedule can be open ended.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is the first dividend accrual start date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The redemption date of a dated series. Omit it for a perpetual, which is the default: there is  no sentinel date for the client to supply, and a distant date such as one in the year 9999 is  taken literally and schedules a par redemption on it. | [optional] [default to OffsetDateTime]
**flowConventions** | [**FlowConventions**](FlowConventions.md) |  | [default to FlowConventions]
**identifiers** | [**PreferredShareAllOfIdentifiers**](PreferredShareAllOfIdentifiers.md) |  | [optional] [default to PreferredShareAllOfIdentifiers]
**domCcy** | **String** | The domestic currency of the instrument. It is the currency of the dividends and of ParValue. | [default to String]
**callSchedule** | [**OptionalitySchedule**](OptionalitySchedule.md) |  | [optional] [default to OptionalitySchedule]
**cfiCode** | **String** | The ISO 10962 CFI code, if the client stores one. Free text, not validated against the standard. | [optional] [default to String]
**conversionSchedule** | [**BondConversionSchedule**](BondConversionSchedule.md) |  | [optional] [default to BondConversionSchedule]
**dividendRate** | **java.math.BigDecimal** | The fixed annualised dividend rate applied to ParValue, so 0.06 is 6%. A scalar for the life of  the share: there is no rate reset, so a fixed-to-floating preferred carries the rate for the  current period and is re-upserted at each reset. | [default to java.math.BigDecimal]
**firstDividendDate** | [**OffsetDateTime**](OffsetDateTime.md) | Anchors a short or long first dividend period. Omitted means no stub. | [optional] [default to OffsetDateTime]
**isCumulative** | **Boolean** | Whether a missed dividend accumulates as arrears rather than being forfeited. The client must  state it; there is no default. | [default to Boolean]
**lotSize** | **Integer** | The minimum number of shares that can be traded at once. Microstructure only: it has no effect  on valuation or on cash flows. Defaults to 1. | [optional] [default to Integer]
**parValue** | **java.math.BigDecimal** | The liquidation preference per share. It is the base for the dividend, for the call strike and  for the redemption amount. It is not a price multiplier. | [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PreferredShare;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
FlowConventions FlowConventions = new FlowConventions();
@jakarta.annotation.Nullable PreferredShareAllOfIdentifiers Identifiers = new PreferredShareAllOfIdentifiers();
String DomCcy = "example DomCcy";
OptionalitySchedule CallSchedule = new OptionalitySchedule();
@jakarta.annotation.Nullable String CfiCode = "example CfiCode";
BondConversionSchedule ConversionSchedule = new BondConversionSchedule();
java.math.BigDecimal DividendRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime FirstDividendDate = OffsetDateTime.now();
Boolean IsCumulative = true;
Integer LotSize = new Integer("100.00");
java.math.BigDecimal ParValue = new java.math.BigDecimal("100.00");


PreferredShare preferredShareInstance = new PreferredShare()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .FlowConventions(FlowConventions)
    .Identifiers(Identifiers)
    .DomCcy(DomCcy)
    .CallSchedule(CallSchedule)
    .CfiCode(CfiCode)
    .ConversionSchedule(ConversionSchedule)
    .DividendRate(DividendRate)
    .FirstDividendDate(FirstDividendDate)
    .IsCumulative(IsCumulative)
    .LotSize(LotSize)
    .ParValue(ParValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
