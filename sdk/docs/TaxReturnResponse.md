# com.finbourne.lusid.model.TaxReturnResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fundId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**period** | [**TaxAccountingPeriod**](TaxAccountingPeriod.md) |  | [optional] [default to TaxAccountingPeriod]
**status** | **String** | The workflow status of the return. Available values: Draft, Prepared, Reviewed, SignedOff, Final. Available values: Draft, Prepared, Reviewed, SignedOff, Final. | [optional] [default to String]
**steps** | [**List&lt;TaxReturnWorkflowStep&gt;**](TaxReturnWorkflowStep.md) | The workflow history of the return in the order the steps were taken. | [optional] [default to List<TaxReturnWorkflowStep>]
**lineA** | [**List&lt;TaxReturnDisposalRow&gt;**](TaxReturnDisposalRow.md) | Chargeable gains and allowable losses on actual disposals in the period. | [optional] [default to List<TaxReturnDisposalRow>]
**lineATotal** | **java.math.BigDecimal** | The total of line A, in whole pounds. | [optional] [default to java.math.BigDecimal]
**vintages** | [**List&lt;TaxReturnVintage&gt;**](TaxReturnVintage.md) | The deemed-disposal vintages, one per period, that feed line D. | [optional] [default to List<TaxReturnVintage>]
**instalments** | [**List&lt;TaxReturnSpreadInstalment&gt;**](TaxReturnSpreadInstalment.md) | The instalments of earlier vintages that fall into the period. | [optional] [default to List<TaxReturnSpreadInstalment>]
**lineDTotal** | **java.math.BigDecimal** | The total of line D, in whole pounds. | [optional] [default to java.math.BigDecimal]
**loanRelationships** | [**List&lt;TaxReturnLoanRelationshipRow&gt;**](TaxReturnLoanRelationshipRow.md) | The loan relationship and derivative holdings that make up line LR. Empty for a fund. | [optional] [default to List<TaxReturnLoanRelationshipRow>]
**lineLRTotal** | **java.math.BigDecimal** | The total of line LR, in whole pounds. Zero for a fund. | [optional] [default to java.math.BigDecimal]
**outside** | [**List&lt;TaxReturnExcludedRow&gt;**](TaxReturnExcludedRow.md) | The holdings excluded from the return, with the reason. | [optional] [default to List<TaxReturnExcludedRow>]
**summary** | [**List&lt;TaxReturnMemoRow&gt;**](TaxReturnMemoRow.md) | Memo rows such as the tax at the applicable rate and the minimum-profits trade profit. | [optional] [default to List<TaxReturnMemoRow>]
**syncBreakOpen** | **Boolean** | True when the tax records are out of sync with the ledger and the return cannot advance past Reviewed. | [optional] [default to Boolean]

```java
import com.finbourne.lusid.model.TaxReturnResponse;
import java.util.*;
import java.lang.System;
import java.net.URI;

ResourceId FundId = new ResourceId();
TaxAccountingPeriod Period = new TaxAccountingPeriod();
@jakarta.annotation.Nullable String Status = "example Status";
@jakarta.annotation.Nullable List<TaxReturnWorkflowStep> Steps = new List<TaxReturnWorkflowStep>();
@jakarta.annotation.Nullable List<TaxReturnDisposalRow> LineA = new List<TaxReturnDisposalRow>();
java.math.BigDecimal LineATotal = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxReturnVintage> Vintages = new List<TaxReturnVintage>();
@jakarta.annotation.Nullable List<TaxReturnSpreadInstalment> Instalments = new List<TaxReturnSpreadInstalment>();
java.math.BigDecimal LineDTotal = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxReturnLoanRelationshipRow> LoanRelationships = new List<TaxReturnLoanRelationshipRow>();
java.math.BigDecimal LineLRTotal = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable List<TaxReturnExcludedRow> Outside = new List<TaxReturnExcludedRow>();
@jakarta.annotation.Nullable List<TaxReturnMemoRow> Summary = new List<TaxReturnMemoRow>();
Boolean SyncBreakOpen = true;


TaxReturnResponse taxReturnResponseInstance = new TaxReturnResponse()
    .FundId(FundId)
    .Period(Period)
    .Status(Status)
    .Steps(Steps)
    .LineA(LineA)
    .LineATotal(LineATotal)
    .Vintages(Vintages)
    .Instalments(Instalments)
    .LineDTotal(LineDTotal)
    .LoanRelationships(LoanRelationships)
    .LineLRTotal(LineLRTotal)
    .Outside(Outside)
    .Summary(Summary)
    .SyncBreakOpen(SyncBreakOpen);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
