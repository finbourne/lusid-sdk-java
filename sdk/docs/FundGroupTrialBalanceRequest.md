# com.finbourne.lusid.model.FundGroupTrialBalanceRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runType** | **String** | How the valuation point is chosen for each fund and NAV type. Available values: LatestApprovedNav (the latest Final valuation point on or before effectiveAt), LatestNav (the latest Final, Estimate or Candidate valuation point on or before effectiveAt), DateRange (every valuation point ending between start and end). AdHoc is not supported for the trial balance. Available values: LatestApprovedNav, LatestNav, AdHoc, DateRange. | [default to String]
**effectiveAt** | **String** | The date, or cut label, the valuation point is chosen for: the latest valuation point whose effective end is on or before this instant. Required for LatestApprovedNav and LatestNav; ignored for DateRange. | [optional] [default to String]
**start** | **String** | The first effective end date, or cut label, a DateRange run includes. Required for DateRange. | [optional] [default to String]
**end** | **String** | The last effective end date, or cut label, a DateRange run includes. Required for DateRange. | [optional] [default to String]
**navTypeCode** | **String** | When provided, every fund in the group is reported on this NAV type and a fund without it is reported as a failure. Otherwise each fund&#39;s NAV type comes from the reference list&#39;s NAV type codes hint, or its primary NAV type. | [optional] [default to String]
**statuses** | **List&lt;String&gt;** | Narrows the valuation point statuses a LatestNav or DateRange run considers. Defaults to all three. Available values: Final, Estimate, Candidate. | [optional] [default to List<String>]
**output** | [**FundGroupReportOutput**](FundGroupReportOutput.md) |  | [optional] [default to FundGroupReportOutput]
**generalLedgerProfileCode** | **String** | The optional code of a General Ledger Profile used to decorate the rows with levels; it must exist in each fund&#39;s chart of accounts. | [optional] [default to String]
**excludeCleardownModule** | **Boolean** | If this is set to true, no Cleardown Module will be applied to the Trial Balances. Defaults to false. | [optional] [default to Boolean]
**variant** | **String** | The optional valuation point variant to report for each fund. | [optional] [default to String]

```java
import com.finbourne.lusid.model.FundGroupTrialBalanceRequest;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunType = "example RunType";
@jakarta.annotation.Nullable String EffectiveAt = "example EffectiveAt";
@jakarta.annotation.Nullable String Start = "example Start";
@jakarta.annotation.Nullable String End = "example End";
@jakarta.annotation.Nullable String NavTypeCode = "example NavTypeCode";
@jakarta.annotation.Nullable List<String> Statuses = new List<String>();
FundGroupReportOutput Output = new FundGroupReportOutput();
@jakarta.annotation.Nullable String GeneralLedgerProfileCode = "example GeneralLedgerProfileCode";
Boolean ExcludeCleardownModule = true;
@jakarta.annotation.Nullable String Variant = "example Variant";


FundGroupTrialBalanceRequest fundGroupTrialBalanceRequestInstance = new FundGroupTrialBalanceRequest()
    .RunType(RunType)
    .EffectiveAt(EffectiveAt)
    .Start(Start)
    .End(End)
    .NavTypeCode(NavTypeCode)
    .Statuses(Statuses)
    .Output(Output)
    .GeneralLedgerProfileCode(GeneralLedgerProfileCode)
    .ExcludeCleardownModule(ExcludeCleardownModule)
    .Variant(Variant);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
