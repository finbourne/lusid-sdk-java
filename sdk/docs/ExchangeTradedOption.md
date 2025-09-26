# com.finbourne.lusid.model.ExchangeTradedOption
LUSID representation of an Exchange Traded Option.  Including, but not limited to, Equity Options, Bond Options, Index Options, Future Options, and Interest Rate Options.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) | The start date of the instrument. This is normally synonymous with the trade-date. | [default to OffsetDateTime]
**contractDetails** | [**ExchangeTradedOptionContractDetails**](ExchangeTradedOptionContractDetails.md) |  | [default to ExchangeTradedOptionContractDetails]
**contracts** | **java.math.BigDecimal** | The number of contracts held. | [default to java.math.BigDecimal]
**refSpotPrice** | **java.math.BigDecimal** | The reference spot price for the option at which the contract was entered into. | [default to java.math.BigDecimal]
**tradingConventions** | [**TradingConventions**](TradingConventions.md) |  | [optional] [default to TradingConventions]
**timeZoneConventions** | [**TimeZoneConventions**](TimeZoneConventions.md) |  | [optional] [default to TimeZoneConventions]

```java
import com.finbourne.lusid.model.ExchangeTradedOption;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime StartDate = OffsetDateTime.now();
ExchangeTradedOptionContractDetails ContractDetails = new ExchangeTradedOptionContractDetails();
java.math.BigDecimal Contracts = new java.math.BigDecimal("100.00");
java.math.BigDecimal RefSpotPrice = new java.math.BigDecimal("100.00");
TradingConventions TradingConventions = new TradingConventions();
TimeZoneConventions TimeZoneConventions = new TimeZoneConventions();


ExchangeTradedOption exchangeTradedOptionInstance = new ExchangeTradedOption()
    .StartDate(StartDate)
    .ContractDetails(ContractDetails)
    .Contracts(Contracts)
    .RefSpotPrice(RefSpotPrice)
    .TradingConventions(TradingConventions)
    .TimeZoneConventions(TimeZoneConventions);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
