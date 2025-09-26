# com.finbourne.lusid.model.Future
LUSID representation of a Future.  Including, but not limited to, Equity Futures, Bond Futures, Index Futures, Currency Futures, and Interest Rate Futures.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The final maturity date of the instrument. This means the last date on which the instruments makes a payment of any amount.  For the avoidance of doubt, that is not necessarily prior to its last sensitivity date for the purposes of risk; e.g. instruments such as  Constant Maturity Swaps (CMS) often have sensitivities to rates that may well be observed or set prior to the maturity date, but refer to a termination date beyond it. | [default to OffsetDateTime]
**identifiers** | **Map&lt;String, String&gt;** | External market codes and identifiers for the bond, e.g. ISIN. | [default to Map<String, String>]
**contractDetails** | [**FuturesContractDetails**](FuturesContractDetails.md) |  | [default to FuturesContractDetails]
**contracts** | **java.math.BigDecimal** | The number of contracts held. This is optional and will default to 1 if not set.  Instrument events will only work when this field is 1.  We recommend not using this field and instead relying on the number of holdings to   represent the number of futures contracts. | [optional] [default to java.math.BigDecimal]
**markToMarketConventions** | [**MarkToMarketConventions**](MarkToMarketConventions.md) |  | [optional] [default to MarkToMarketConventions]
**refSpotPrice** | **java.math.BigDecimal** | The reference spot price for the future at which the contract was entered into. | [optional] [default to java.math.BigDecimal]
**underlying** | [**LusidInstrument**](LusidInstrument.md) |  | [optional] [default to LusidInstrument]
**calculationType** | **String** | Calculation type for some Future instruments which have non-standard methodology.  Optional, if not set defaults as follows:  - If ExchangeCode is \&quot;ASX\&quot; and ContractCode is \&quot;IR\&quot; or \&quot;BB\&quot; set to ASX_BankBills  - If ExchangeCode is \&quot;ASX\&quot; and ContractCode is \&quot;YT\&quot; set to ASX_3Year  - If ExchangeCode is \&quot;ASX\&quot; and ContractCode is \&quot;VT\&quot; set to ASX_5Year  - If ExchangeCode is \&quot;ASX\&quot; and ContractCode is \&quot;XT\&quot; set to ASX_10Year  - If ExchangeCode is \&quot;ASX\&quot; and ContractCode is \&quot;LT\&quot; set to ASX_20Year  - otherwise set to Standard     Specific calculation types for bond and interest rate futures are:  - [Standard] The default calculation type, which does not fit into any of the categories below.  - [ASX_BankBills] Used for AUD and NZD futures “IR” and “BB” on ASX. 90D Bank Bills.  - [ASX_3Year] Used for “YT” on ASX. 3YR semi-annual bond (6 coupons) @ 6%.  - [ASX_5Year] Used for “VT” on ASX. 5yr semi-annual bond (10 coupons) @ 2%.  - [ASX_10Year] Used for “XT” on ASX. 10yr semi-annual bond (20 coupons) @ 6%.  - [ASX_20Year] Used for “LT” on ASX. 20yr semi-annual bond (40 coupons) @ 4%.  - [B3_DI1] Used for “DI1” on B3. Average of 1D interbank deposit rates.   - For futures with this calculation type, quote values are expected to be specified as a percentage.   For example, a quoted rate of 13.205% should be specified as a quote of 13.205 with a face value of 100.     Supported string (enumeration) values are: [Standard, ASX_BankBills, ASX_3Year, ASX_5Year, ASX_10Year, ASX_20Year, B3_DI1]. | [optional] [default to String]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.Future;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
OffsetDateTime MaturityDate = OffsetDateTime.now();
Map<String, String> Identifiers = new Map<String, String>();
FuturesContractDetails ContractDetails = new FuturesContractDetails();
java.math.BigDecimal Contracts = new java.math.BigDecimal("100.00");
MarkToMarketConventions MarkToMarketConventions = new MarkToMarketConventions();
java.math.BigDecimal RefSpotPrice = new java.math.BigDecimal("100.00");
LusidInstrument Underlying = new LusidInstrument();
@jakarta.annotation.Nullable String CalculationType = "example CalculationType";
TradingConventions TradingConventions = new TradingConventions();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


Future futureInstance = new Future()
    .StartDate(StartDate)
    .MaturityDate(MaturityDate)
    .Identifiers(Identifiers)
    .ContractDetails(ContractDetails)
    .Contracts(Contracts)
    .MarkToMarketConventions(MarkToMarketConventions)
    .RefSpotPrice(RefSpotPrice)
    .Underlying(Underlying)
    .CalculationType(CalculationType)
    .TradingConventions(TradingConventions)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
