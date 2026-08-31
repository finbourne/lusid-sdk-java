# com.finbourne.lusid.model.BondForward
LUSID representation of an OTC bilateral forward contract to buy or sell a specified, already-mastered  debt security (Bond or ComplexBond) at an agreed clean price on a settlement date beyond the market's  standard settlement cycle. No cash moves at trade date, there is no premium, and both parties are  unconditionally obliged. Quote-driven valuation; cash settlement only in the current scope (physical  delivery is future work). Direction is the sign of the holding's units and size is the holding's units,  neither is on the definition, so a partial unwind or novation is an ordinary change in units.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The contractual settlement date, on which cash settlement takes place. Named MaturityDate because  IDefinition requires it and every other forward uses it. Supplied as an agreed business day on the  settlement currency&#39;s own calendar; LUSID does not adjust it. | [default to OffsetDateTime]
**domCcy** | **String** | The domestic currency of the instrument. | [default to String]
**agreedCleanPrice** | **java.math.BigDecimal** | The agreed price, percent of par. Named agreedCleanPrice rather than strike because the contract  carries no optionality, and a percent-of-par price would read as an option strike under that name. | [default to java.math.BigDecimal]
**contractSize** | **java.math.BigDecimal** | Face amount of the underlying per unit. Together with the per-100 price this converts price into  money: pricePerUnit &#x3D; agreedCleanPrice / 100 generate justfile test_sdk contractSize. Set 1 to make one unit equal one  currency unit of face. | [default to java.math.BigDecimal]
**deliveryType** | **String** | How the forward settles. Only Cash is accepted in the current scope: physical delivery of a bond by  a wrapper instrument has no shipped mechanism for opening the delivered position with purchased  accrued. The field is required rather than defaulted so that a physically-settling contract is  refused explicitly rather than silently cash-settled.     Supported string (enumeration) values are: [Cash, Physical]. Available values: Cash, Physical. | [default to String]
**priceBasis** | **String** | Whether the agreed price is quoted clean or dirty. Only Clean is accepted: a dirty forward price is  an invoice price for value at settlement, and nothing downstream carries the clean-and-accrued split,  so a Dirty value is rejected at upsert with the conversion instruction. The field is required so that  a dirty price supplied as clean is declared rather than silently mispriced.     Supported string (enumeration) values are: [Clean, Dirty]. Available values: Clean, Dirty. | [default to String]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [default to LusidInstrument]

```java
import com.finbourne.lusid.model.BondForward;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
String DomCcy = "example DomCcy";
java.math.BigDecimal AgreedCleanPrice = new java.math.BigDecimal("100.00");
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
String DeliveryType = "example DeliveryType";
String PriceBasis = "example PriceBasis";
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();
TradingConventions TradingConventions = new TradingConventions();
LusidInstrument Underlying = new LusidInstrument();


BondForward bondForwardInstance = new BondForward()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .DomCcy(DomCcy)
    .AgreedCleanPrice(AgreedCleanPrice)
    .ContractSize(ContractSize)
    .DeliveryType(DeliveryType)
    .PriceBasis(PriceBasis)
    .TimeZoneConventions(TimeZoneConventions)
    .TradingConventions(TradingConventions)
    .Underlying(Underlying);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
