# com.finbourne.lusid.model.TaxLedgerReconciliationHoldingResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**holdingId** | **String** | The identifier of the holding. For a company this is the pooled LUSID instrument identifier, for a fund the portfolio code and instrument identifier. | [optional] [default to String]
**instrumentId** | **String** | The LUSID unique identifier of the instrument. | [optional] [default to String]
**instrumentName** | **String** | The name of the instrument. | [optional] [default to String]
**portfolioCode** | **String** | The code of the portfolio the holding sits in, or the pooled marker for a company. | [optional] [default to String]
**ledgerRealised** | **java.math.BigDecimal** | The realised gain or loss recorded in the ledger for the holding. | [optional] [default to java.math.BigDecimal]
**ledgerUnrealisedMovement** | **java.math.BigDecimal** | The movement in unrealised gain or loss recorded in the ledger for the holding. | [optional] [default to java.math.BigDecimal]
**taxRealisedUnindexed** | **java.math.BigDecimal** | The realised gain or loss for tax before indexation. | [optional] [default to java.math.BigDecimal]
**taxUnrealisedMovementUnindexed** | **java.math.BigDecimal** | The movement in the unrealised gain or loss for tax before indexation. | [optional] [default to java.math.BigDecimal]
**deemedDisposalNet** | **java.math.BigDecimal** | The net deemed-disposal amount for the holding. | [optional] [default to java.math.BigDecimal]
**loanRelationshipNet** | **java.math.BigDecimal** | The net loan relationship credit or debit for the holding. | [optional] [default to java.math.BigDecimal]
**category** | **String** | The reconciliation category of the difference, when there is one. Available values: ExcludedHoldings, TaxCostAdjustments, OutOfSync, Scope, PoolAveraging, Matching, Indexation, KinkTest. | [optional] [default to String]
**difference** | **java.math.BigDecimal** | The difference between the two sides. | [optional] [default to java.math.BigDecimal]
**explanation** | **String** | The explanation of the difference. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TaxLedgerReconciliationHoldingResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
TaxAccountingPeriod Period = new TaxAccountingPeriod();
@jakarta.annotation.Nullable String HoldingId = "example HoldingId";
@jakarta.annotation.Nullable String InstrumentId = "example InstrumentId";
@jakarta.annotation.Nullable String InstrumentName = "example InstrumentName";
@jakarta.annotation.Nullable String PortfolioCode = "example PortfolioCode";
java.math.BigDecimal LedgerRealised = new java.math.BigDecimal("100.00");
java.math.BigDecimal LedgerUnrealisedMovement = new java.math.BigDecimal("100.00");
java.math.BigDecimal TaxRealisedUnindexed = new java.math.BigDecimal("100.00");
java.math.BigDecimal TaxUnrealisedMovementUnindexed = new java.math.BigDecimal("100.00");
java.math.BigDecimal DeemedDisposalNet = new java.math.BigDecimal("100.00");
java.math.BigDecimal LoanRelationshipNet = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Category = "example Category";
java.math.BigDecimal Difference = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String Explanation = "example Explanation";


TaxLedgerReconciliationHoldingResponse taxLedgerReconciliationHoldingResponseInstance = new TaxLedgerReconciliationHoldingResponse()
    .FundId(FundId)
    .Period(Period)
    .HoldingId(HoldingId)
    .InstrumentId(InstrumentId)
    .InstrumentName(InstrumentName)
    .PortfolioCode(PortfolioCode)
    .LedgerRealised(LedgerRealised)
    .LedgerUnrealisedMovement(LedgerUnrealisedMovement)
    .TaxRealisedUnindexed(TaxRealisedUnindexed)
    .TaxUnrealisedMovementUnindexed(TaxUnrealisedMovementUnindexed)
    .DeemedDisposalNet(DeemedDisposalNet)
    .LoanRelationshipNet(LoanRelationshipNet)
    .Category(Category)
    .Difference(Difference)
    .Explanation(Explanation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
