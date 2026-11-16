# com.finbourne.lusid.model.TaxReturnLoanRelationshipRow

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**ledgerAmount** | **java.math.BigDecimal** | The loan relationship credit or debit recorded in the ledger. | [optional] [default to java.math.BigDecimal]
**upliftExcluded** | **java.math.BigDecimal** | The uplift excluded from the loan relationship figure. | [optional] [default to java.math.BigDecimal]
**netCreditDebit** | **java.math.BigDecimal** | The net loan relationship credit or debit, after the uplift is excluded. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxReturnLoanRelationshipRow;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
java.math.BigDecimal LedgerAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal UpliftExcluded = new java.math.BigDecimal("100.00");
java.math.BigDecimal NetCreditDebit = new java.math.BigDecimal("100.00");


TaxReturnLoanRelationshipRow taxReturnLoanRelationshipRowInstance = new TaxReturnLoanRelationshipRow()
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .PortfolioCode(PortfolioCode)
    .LedgerAmount(LedgerAmount)
    .UpliftExcluded(UpliftExcluded)
    .NetCreditDebit(NetCreditDebit);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
