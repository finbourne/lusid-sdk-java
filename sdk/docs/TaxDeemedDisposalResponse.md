# com.finbourne.lusid.model.TaxDeemedDisposalResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The deterministic identifier of the deemed disposal, derived from the holding and date. | [optional] [default to String]
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date the deemed disposal arises, the end of the period. | [optional] [default to OffsetDateTime]
**units** | **java.math.BigDecimal** | The units disposed of. | [optional] [default to java.math.BigDecimal]
**cost** | **java.math.BigDecimal** | The allowable cost of the units disposed of. | [optional] [default to java.math.BigDecimal]
**marketValue** | **java.math.BigDecimal** | The market value of the holding at the deemed-disposal date. | [optional] [default to java.math.BigDecimal]
**netAmount** | **java.math.BigDecimal** | The net deemed amount, gains less losses. | [optional] [default to java.math.BigDecimal]
**notional** | **Boolean** | True when the deemed disposal is notional, as it is for a member fund, rather than an actual deemed disposal at company level. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.TaxDeemedDisposalResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String Id = "example Id";
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
OffsetDateTime Date = OffsetDateTime.now();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
java.math.BigDecimal Cost = new java.math.BigDecimal("100.00");
java.math.BigDecimal MarketValue = new java.math.BigDecimal("100.00");
java.math.BigDecimal NetAmount = new java.math.BigDecimal("100.00");
Boolean Notional = true;


TaxDeemedDisposalResponse taxDeemedDisposalResponseInstance = new TaxDeemedDisposalResponse()
    .Id(Id)
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .PortfolioCode(PortfolioCode)
    .Date(Date)
    .Units(Units)
    .Cost(Cost)
    .MarketValue(MarketValue)
    .NetAmount(NetAmount)
    .Notional(Notional);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
