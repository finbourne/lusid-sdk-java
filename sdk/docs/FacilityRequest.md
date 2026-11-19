# com.finbourne.lusid.model.FacilityRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The code of the Facility, unique within the Fund. | [default to String]
**displayName** | **String** | The name of the Facility. | [default to String]
**description** | **String** | A description for the Facility. | [optional] [default to String]
**lender** | **String** | The name of the lender providing the Facility. | [default to String]
**limit** | **java.math.BigDecimal** | The committed limit of the Facility. Must be greater than zero. | [default to java.math.BigDecimal]
**currency** | **String** | The three-letter currency code in which the Facility is denominated. | [default to String]
**rateReference** | **String** | The reference rate the Facility interest is based on, for example SOFR. Optional. | [optional] [default to String]
**margin** | **java.math.BigDecimal** | The margin over the reference rate, expressed as a decimal. Must be zero or greater. | [default to java.math.BigDecimal]
**commitmentFeeRate** | **java.math.BigDecimal** | The annual commitment fee rate charged on the undrawn balance, expressed as a decimal. Must be zero or greater. | [default to java.math.BigDecimal]
**dayCountConvention** | **String** | The day count convention used to accrue interest. One of: Act360, Act365, Act365F, Thirty360. | [default to String]
**availableFrom** | [**OffsetDateTime**](OffsetDateTime.md) | The first date the Facility may be drawn, inclusive. A draw dated before it is refused. Required on creation; a Facility stored without one may be drawn on any date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date the Facility may be drawn, inclusive. A draw dated after it is refused; a repayment is not. Optional; omit for a Facility with no maturity. | [optional] [default to OffsetDateTime]
**limitChanges** | [**List&lt;FacilityLimitChange&gt;**](FacilityLimitChange.md) | Changes to the committed limit after the initial limit, each in force from its effective date until the next. Each must take effect after AvailableFrom and, when set, on or before MaturityDate. A draw is held to the limit in force on its date. | [optional] [default to List<FacilityLimitChange>]

```java
import com.finbourne.lusid.model.FacilityRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String DisplayName = "example DisplayName";
@jakarta.annotation.Nullable String Description = "example Description";
String Lender = "example Lender";
java.math.BigDecimal Limit = new java.math.BigDecimal("100.00");
String Currency = "example Currency";
@jakarta.annotation.Nullable String RateReference = "example RateReference";
java.math.BigDecimal Margin = new java.math.BigDecimal("100.00");
java.math.BigDecimal CommitmentFeeRate = new java.math.BigDecimal("100.00");
String DayCountConvention = "example DayCountConvention";
OffsetDateTime AvailableFrom = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime MaturityDate = OffsetDateTime.now();
@jakarta.annotation.Nullable List<FacilityLimitChange> LimitChanges = new List<FacilityLimitChange>();


FacilityRequest facilityRequestInstance = new FacilityRequest()
    .Code(Code)
    .DisplayName(DisplayName)
    .Description(Description)
    .Lender(Lender)
    .Limit(Limit)
    .Currency(Currency)
    .RateReference(RateReference)
    .Margin(Margin)
    .CommitmentFeeRate(CommitmentFeeRate)
    .DayCountConvention(DayCountConvention)
    .AvailableFrom(AvailableFrom)
    .MaturityDate(MaturityDate)
    .LimitChanges(LimitChanges);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
