# com.finbourne.lusid.model.ShareClassDefinition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | The unique code for the Share Class. Must be unique within the Fund. | [default to String]
**name** | **String** | The display name of the Share Class. | [default to String]
**description** | **String** | An optional description for the Share Class. | [optional] [default to String]
**shareClassShortCode** | **String** | A short code that uniquely identifies the share class within the Fund. | [default to String]
**launchPrice** | **java.math.BigDecimal** | The launch price set when a shareclass is added to the fund. Defaults to 1. | [optional] [default to java.math.BigDecimal]
**launchDate** | [**OffsetDateTime**](OffsetDateTime.md) | The launch date set when a shareclass is added to the fund. Defaults to Fund Inception Date. | [optional] [default to OffsetDateTime]
**apportionmentFactor** | **java.math.BigDecimal** | The weighting factor used for apportionment across this share class. | [optional] [default to java.math.BigDecimal]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | An optional set of properties to attach to the auto-created Instrument. Only applied when createInstrument is true. | [optional] [default to Map<String, Property>]
**fundShareClassType** | **String** | The Type of Share Class. Supported values are: Unitised / Non-Unitised / Series / Private Equity / Partnership. | [default to String]
**distributionType** | **String** | The type of distribution the ShareClass will calculate. Supported values are: Income, Accumulation. | [default to String]
**domCcy** | **String** | The domestic currency of the ShareClass instrument. | [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**unitsPrecision** | **Integer** | Decimal places for the share class units. | [optional] [default to Integer]
**pricePrecision** | **Integer** | Decimal places for the share class price. | [optional] [default to Integer]
**roundingConventions** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding conventions used for the ShareClass quotes. | [optional] [default to List<SimpleRoundingConvention>]
**roundingConventionsUnits** | [**List&lt;SimpleRoundingConvention&gt;**](SimpleRoundingConvention.md) | Rounding conventions used for the ShareClass units. | [optional] [default to List<SimpleRoundingConvention>]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**distributionPaymentType** | **String** | The tax treatment applied to distributions. Supported values are: Gross, Net. | [optional] [default to String]
**hedging** | **String** | Indicates whether the ShareClass applies currency hedging. Supported values are: Invalid, None, ApplyHedging. | [default to String]

```java
import com.finbourne.lusid.model.ShareClassDefinition;
import java.util.*;
import java.lang.System;
import java.net.URI;

String Code = "example Code";
String Name = "example Name";
@jakarta.annotation.Nullable String Description = "example Description";
String ShareClassShortCode = "example ShareClassShortCode";
@jakarta.annotation.Nullable java.math.BigDecimal LaunchPrice = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable OffsetDateTime LaunchDate = OffsetDateTime.now();
@jakarta.annotation.Nullable java.math.BigDecimal ApportionmentFactor = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
String FundShareClassType = "example FundShareClassType";
String DistributionType = "example DistributionType";
String DomCcy = "example DomCcy";
TradingConventions TradingConventions = new TradingConventions();
@jakarta.annotation.Nullable Integer UnitsPrecision = new Integer("100.00");
@jakarta.annotation.Nullable Integer PricePrecision = new Integer("100.00");
@jakarta.annotation.Nullable List<SimpleRoundingConvention> RoundingConventions = new List<SimpleRoundingConvention>();
@jakarta.annotation.Nullable List<SimpleRoundingConvention> RoundingConventionsUnits = new List<SimpleRoundingConvention>();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
@jakarta.annotation.Nullable String DistributionPaymentType = "example DistributionPaymentType";
String Hedging = "example Hedging";


ShareClassDefinition shareClassDefinitionInstance = new ShareClassDefinition()
    .Code(Code)
    .Name(Name)
    .Description(Description)
    .ShareClassShortCode(ShareClassShortCode)
    .LaunchPrice(LaunchPrice)
    .LaunchDate(LaunchDate)
    .ApportionmentFactor(ApportionmentFactor)
    .Properties(Properties)
    .FundShareClassType(FundShareClassType)
    .DistributionType(DistributionType)
    .DomCcy(DomCcy)
    .TradingConventions(TradingConventions)
    .UnitsPrecision(UnitsPrecision)
    .PricePrecision(PricePrecision)
    .RoundingConventions(RoundingConventions)
    .RoundingConventionsUnits(RoundingConventionsUnits)
    .TimeZoneConventions(TimeZoneConventions)
    .DistributionPaymentType(DistributionPaymentType)
    .Hedging(Hedging);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
