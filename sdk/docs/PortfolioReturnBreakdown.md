# com.finbourne.lusid.model.PortfolioReturnBreakdown
A list of Composite Breakdowns.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**rateOfReturn** | **java.math.BigDecimal** | The return number. | [optional] [default to java.math.BigDecimal]
**openingMarketValue** | **java.math.BigDecimal** | The opening market value. | [optional] [default to java.math.BigDecimal]
**closingMarketValue** | **java.math.BigDecimal** | The closing market value. | [optional] [default to java.math.BigDecimal]
**weight** | **java.math.BigDecimal** | The weight of the constituent into the composite. | [optional] [default to java.math.BigDecimal]
**constituentsInTheComposite** | **Integer** | The number of members in the Composite on the given day. | [optional] [default to Integer]
**constituentsMissing** | **Integer** | The number of the constituents which have a missing return on that day. | [optional] [default to Integer]
**currency** | **String** | The currency of the portfolio. | [optional] [default to String]
**openFxRate** | **java.math.BigDecimal** | The opening fxRate which is used in calculation. | [optional] [default to java.math.BigDecimal]
**closeFxRate** | **java.math.BigDecimal** | The closing fxRate which is used in calculation. | [optional] [default to java.math.BigDecimal]
**localRateOfReturn** | **java.math.BigDecimal** | The rate of return in the local currency. | [optional] [default to java.math.BigDecimal]
**localOpeningMarketValue** | **java.math.BigDecimal** | The opening market value in the local currency. | [optional] [default to java.math.BigDecimal]
**localClosingMarketValue** | **java.math.BigDecimal** | The closing market value in the local currency. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.PortfolioReturnBreakdown;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId PortfolioId = new ResourceId();
java.math.BigDecimal RateOfReturn = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal OpeningMarketValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal ClosingMarketValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal Weight = new java.math.BigDecimal("100.00");
Integer ConstituentsInTheComposite = new Integer("100.00");
Integer ConstituentsMissing = new Integer("100.00");
@jakarta.annotation.Nullable String Currency = "example Currency";
java.math.BigDecimal OpenFxRate = new java.math.BigDecimal("100.00");
java.math.BigDecimal CloseFxRate = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal LocalRateOfReturn = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal LocalOpeningMarketValue = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal LocalClosingMarketValue = new java.math.BigDecimal("100.00");


PortfolioReturnBreakdown portfolioReturnBreakdownInstance = new PortfolioReturnBreakdown()
    .PortfolioId(PortfolioId)
    .RateOfReturn(RateOfReturn)
    .OpeningMarketValue(OpeningMarketValue)
    .ClosingMarketValue(ClosingMarketValue)
    .Weight(Weight)
    .ConstituentsInTheComposite(ConstituentsInTheComposite)
    .ConstituentsMissing(ConstituentsMissing)
    .Currency(Currency)
    .OpenFxRate(OpenFxRate)
    .CloseFxRate(CloseFxRate)
    .LocalRateOfReturn(LocalRateOfReturn)
    .LocalOpeningMarketValue(LocalOpeningMarketValue)
    .LocalClosingMarketValue(LocalClosingMarketValue);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
