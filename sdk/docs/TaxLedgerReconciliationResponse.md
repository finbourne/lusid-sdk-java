# com.finbourne.lusid.model.TaxLedgerReconciliationResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**ledgerCapitalGainLoss** | **java.math.BigDecimal** | The realised and unrealised capital gain or loss recorded in the ledger for the period. | [optional] [default to java.math.BigDecimal]
**comparableTaxFigure** | **java.math.BigDecimal** | The tax figure on the same basis as the ledger, before the return adjustments. | [optional] [default to java.math.BigDecimal]
**differences** | [**List&lt;TaxReconciliationDifferenceRow&gt;**](TaxReconciliationDifferenceRow.md) | The explained differences between the two sides, by holding. | [optional] [default to List<TaxReconciliationDifferenceRow>]
**unexplained** | **java.math.BigDecimal** | The part of the difference not explained by any category. Nil when the reconciliation is complete. | [optional] [default to java.math.BigDecimal]
**bridge** | [**List&lt;TaxReconciliationBridgeRow&gt;**](TaxReconciliationBridgeRow.md) | The bridge from the ledger figure to the return total. | [optional] [default to List<TaxReconciliationBridgeRow>]
**returnTotal** | **java.math.BigDecimal** | The total of lines A, D and LR. | [optional] [default to java.math.BigDecimal]
**bridgeUnexplained** | **java.math.BigDecimal** | The part of the bridge not explained. Nil when the bridge is complete. | [optional] [default to java.math.BigDecimal]

```java
import com.finbourne.lusid.model.TaxLedgerReconciliationResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
TaxAccountingPeriod Period = new TaxAccountingPeriod();
java.math.BigDecimal LedgerCapitalGainLoss = new java.math.BigDecimal("100.00");
java.math.BigDecimal ComparableTaxFigure = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxReconciliationDifferenceRow> Differences = new List<TaxReconciliationDifferenceRow>();
java.math.BigDecimal Unexplained = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxReconciliationBridgeRow> Bridge = new List<TaxReconciliationBridgeRow>();
java.math.BigDecimal ReturnTotal = new java.math.BigDecimal("100.00");
java.math.BigDecimal BridgeUnexplained = new java.math.BigDecimal("100.00");


TaxLedgerReconciliationResponse taxLedgerReconciliationResponseInstance = new TaxLedgerReconciliationResponse()
    .FundId(FundId)
    .Period(Period)
    .LedgerCapitalGainLoss(LedgerCapitalGainLoss)
    .ComparableTaxFigure(ComparableTaxFigure)
    .Differences(Differences)
    .Unexplained(Unexplained)
    .Bridge(Bridge)
    .ReturnTotal(ReturnTotal)
    .BridgeUnexplained(BridgeUnexplained);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
