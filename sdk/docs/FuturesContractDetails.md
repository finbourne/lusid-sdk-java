# com.finbourne.lusid.model.FuturesContractDetails
Most, if not all, information about contracts is standardized. See, e.g. https://www.cmegroup.com/ for  common codes and similar data. This appears to be in common use by well known market information providers, e.g. Bloomberg and Refinitiv.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domCcy** | **String** | Currency in which the contract is paid. | [default to String]
**fgnCcy** | **String** | Currency of the underlying, for use with FX Futures | [optional] [default to String]
**assetClass** | **String** | The asset class of the underlying. Optional and will default to Unknown if not set.    Supported string (enumeration) values are: [InterestRates, FX, Inflation, Equities, Credit, Commodities, Money]. | [optional] [default to String]
**contractCode** | **String** | The contract code used by the exchange, e.g. “CL” for Crude Oil, “ES” for E-mini SP 500, “FGBL” for Bund Futures, etc. | [default to String]
**contractMonth** | **String** | Which month does the contract trade for.    Supported string (enumeration) values are: [F, G, H, J, K, M, N, Q, U, V, X, Z].  Defaults to \&quot;Unknown\&quot; if not set. | [optional] [default to String]
**contractSize** | **java.math.BigDecimal** | Size of a single contract. | [default to java.math.BigDecimal]
**convention** | **String** | If appropriate, the day count convention method used in pricing (rates futures).  For more information on day counts, see [knowledge base article KA-01798](https://support.lusid.com/knowledgebase/article/KA-01798)     Supported string (enumeration) values are: [Actual360, Act360, MoneyMarket, Actual365, Act365, Thirty360, ThirtyU360, Bond, ThirtyE360, EuroBond, ActualActual, ActAct, ActActIsda, ActActIsma, ActActIcma, OneOne, Act364, Act365F, Act365L, Act365_25, Act252, Bus252, NL360, NL365, ActActAFB, Act365Cad, ThirtyActIsda, Thirty365Isda, ThirtyEActIsda, ThirtyE360Isda, ThirtyE365Isda, ThirtyU360EOM]. | [optional] [default to String]
**country** | **String** | Country (code) for the exchange. | [optional] [default to String]
**description** | **String** | Description of contract. | [optional] [default to String]
**exchangeCode** | **String** | Exchange code for contract. This can be any string to uniquely identify the exchange (e.g. Exchange Name, MIC, BBG code). | [default to String]
**exchangeName** | **String** | Exchange name (for when code is not automatically recognised). | [optional] [default to String]
**tickerStep** | **java.math.BigDecimal** | Minimal step size change in ticker. | [optional] [default to java.math.BigDecimal]
**unitValue** | **java.math.BigDecimal** | The value in the currency of a 1 unit change in the contract price. | [optional] [default to java.math.BigDecimal]
**calendars** | **List&lt;String&gt;** | Holiday calendars that apply to yield-to-price conversions (i.e. for BRL futures). | [optional] [default to List<String>]
**deliveryType** | **String** | Delivery type to be used on settling the contract.  Optional: Defaults to DeliveryType.Physical if not provided.    Supported string (enumeration) values are: [Cash, Physical]. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FuturesContractDetails;
import java.util.*;
import java.lang.System;
import java.net.URI;

String DomCcy = "example DomCcy";
@jakarta.annotation.Nullable String FgnCcy = "example FgnCcy";
@jakarta.annotation.Nullable String AssetClass = "example AssetClass";
String ContractCode = "example ContractCode";
@jakarta.annotation.Nullable String ContractMonth = "example ContractMonth";
java.math.BigDecimal ContractSize = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Convention = "example Convention";
@jakarta.annotation.Nullable String Country = "example Country";
@jakarta.annotation.Nullable String Description = "example Description";
String ExchangeCode = "example ExchangeCode";
@jakarta.annotation.Nullable String ExchangeName = "example ExchangeName";
java.math.BigDecimal TickerStep = new java.math.BigDecimal("100.00");
java.math.BigDecimal UnitValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<String> Calendars = new List<String>();
@jakarta.annotation.Nullable String DeliveryType = "example DeliveryType";


FuturesContractDetails futuresContractDetailsInstance = new FuturesContractDetails()
    .DomCcy(DomCcy)
    .FgnCcy(FgnCcy)
    .AssetClass(AssetClass)
    .ContractCode(ContractCode)
    .ContractMonth(ContractMonth)
    .ContractSize(ContractSize)
    .Convention(Convention)
    .Country(Country)
    .Description(Description)
    .ExchangeCode(ExchangeCode)
    .ExchangeName(ExchangeName)
    .TickerStep(TickerStep)
    .UnitValue(UnitValue)
    .Calendars(Calendars)
    .DeliveryType(DeliveryType);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
