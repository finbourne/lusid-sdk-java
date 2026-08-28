# com.finbourne.lusid.model.ShareClass

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instrumentIdentifiers** | **Map&lt;String, String&gt;** | Unique instrument identifiers | [optional] [default to Map<String, String>]
**name** | **String** | The display name of the Share Class. | [default to String]
**description** | **String** | An optional description for the Share Class. | [optional] [default to String]
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund. | [default to String]
**launchPrice** | **java.math.BigDecimal** | The launch price set when a shareclass is added to the fund. Defaults to 1. | [optional] [default to java.math.BigDecimal]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The launch date set when a shareclass is added to the fund. Defaults to Fund Inception Date. | [optional] [default to OffsetDateTime]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | An optional set of properties to attach to the auto-created Instrument. Only applied when createInstrument is true. | [optional] [default to Map<String, Property>]
**investorType** | **String** | The Type of Share Class. Available values: Unitised. | [default to String]
**distributionType** | **String** | The type of distribution the ShareClass will calculate. Available values: Income, Accumulation. | [optional] [default to String]
**domCcy** | **String** | The domestic currency of the ShareClass instrument. | [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**roundingConventionsPrice** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding conventions used for the ShareClass quotes. | [optional] [default to List<SimpleRoundingConvention>]
**roundingConventionsUnits** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding conventions used for the ShareClass units. | [optional] [default to List<SimpleRoundingConvention>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**distributionPaymentType** | **String** | The tax treatment applied to distributions. Available values: Invalid, Gross, Net. | [optional] [default to String]
**hedging** | **String** | Indicates whether the ShareClass applies currency hedging. Available values: Invalid, None, ApplyHedging. | [optional] [default to String]

```java
import com.finbourne.lusid.model.ShareClass;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable Map<String, String> InstrumentIdentifiers = new Map<String, String>();
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
String ShareClassShortCode = "example ShareClassShortCode";
@jakarta.annotation.Nullable java.math.BigDecimal LaunchPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime LaunchDate = OffsetDateTime.now();
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String InvestorType = "example InvestorType";
@jakarta.annotation.Nullable String DistributionType = "example DistributionType";
String DomCcy = "example DomCcy";
TradingConventions TradingConventions = new TradingConventions();
@jakarta.annotation.Nullable List<SimpleRoundingConvention> RoundingConventionsPrice = new List<SimpleRoundingConvention>();
@jakarta.annotation.Nullable List<SimpleRoundingConvention> RoundingConventionsUnits = new List<SimpleRoundingConvention>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
@jakarta.annotation.Nullable String DistributionPaymentType = "example DistributionPaymentType";
@jakarta.annotation.Nullable String Hedging = "example Hedging";


ShareClass shareClassInstance = new ShareClass()
    .InstrumentIdentifiers(InstrumentIdentifiers)
    .Name(Name)
    .Description(Description)
    .ShareClassShortCode(ShareClassShortCode)
    .LaunchPrice(LaunchPrice)
    .LaunchDate(LaunchDate)
    .Properties(Properties)
    .InvestorType(InvestorType)
    .DistributionType(DistributionType)
    .DomCcy(DomCcy)
    .TradingConventions(TradingConventions)
    .RoundingConventionsPrice(RoundingConventionsPrice)
    .RoundingConventionsUnits(RoundingConventionsUnits)
    .TimeZoneConventions(TimeZoneConventions)
    .DistributionPaymentType(DistributionPaymentType)
    .Hedging(Hedging);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
