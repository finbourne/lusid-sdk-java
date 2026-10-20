# com.finbourne.lusid.model.TransactionQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The lower bound effective datetime or cut label (inclusive) from which to build the transactions. | [default to String]
**endDate** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions. | [default to String]
**queryMode** | **String** | The date to compare against the upper and lower bounds for the effective datetime or cut label. Default value: TradeDate. Available values: TradeDate, SettleDate. | [optional] [default to String]
**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. | [optional] [default to Boolean]
**timelineScope** | **String** | Scope of the Timeline for the Portfolio. The Timeline to be used while building transactions | [optional] [default to String]
**timelineCode** | **String** | Code of the Timeline for the Portfolio. The Timeline to be used while building transactions. This can optionally include a colon, followed by the Closed Period Id to use at the head of the timeline, for a timeline with unconfirmed periods. | [optional] [default to String]
**includeEconomics** | **Boolean** | By default is false. When set to true the Economics data would be populated in the response. | [optional] [default to Boolean]
**includeSettlementStatus** | **Boolean** | By default is false. When set to true the Settlement Status data would be populated in the response. | [optional] [default to Boolean]
**settlementStatusDate** | **String** | Optional date used to specify end of an extended window for settlement information. When provided, transactions will be returned between start and end date, but settlement information between start date and this date will be included. When provided, the value must be greater than or equal to end date. | [optional] [default to String]
**returnExcludedTransactions** | **Boolean** | Option to specify whether or not to include transactions that are marked as excluded by the portfolio&#39;s transaction exclusion filter. Excluded transactions do not affect holdings. Defaults to false if not specified. | [optional] [default to Boolean]
**allocationExpansion** | **String** | How an input transaction that was split into allocation slices (strategy tag allocations or a prorated allocation method) is presented. &#39;Expanded&#39; (the default) returns one output transaction per slice. &#39;Combined&#39; returns one output transaction per input transaction with units, consideration and realised gain/loss summed over the slices, with every realised gain/loss record of each slice, including zero-realised ones, listed with its own transaction type and sub-holding key properties. For a prorated type with no units side the combined units are the total position the slices were prorated over, not the input&#39;s units. Transaction filters apply per slice, so a filter on a slice-level property combines only the matching slices. Sequence numbers are assigned after combining. Holdings and tax lots are identical in both modes. Available values: Expanded, Combined. | [optional] [default to String]

```java
import com.finbourne.lusid.model.TransactionQueryParameters;
import java.util.*;
import java.lang.System;
import java.net.URI;

String StartDate = "example StartDate";
String EndDate = "example EndDate";
String QueryMode = "example QueryMode";
Boolean ShowCancelledTransactions = true;
@jakarta.annotation.Nullable String TimelineScope = "example TimelineScope";
@jakarta.annotation.Nullable String TimelineCode = "example TimelineCode";
Boolean IncludeEconomics = true;
Boolean IncludeSettlementStatus = true;
@jakarta.annotation.Nullable String SettlementStatusDate = "example SettlementStatusDate";
Boolean ReturnExcludedTransactions = true;
@jakarta.annotation.Nullable String AllocationExpansion = "example AllocationExpansion";


TransactionQueryParameters transactionQueryParametersInstance = new TransactionQueryParameters()
    .StartDate(StartDate)
    .EndDate(EndDate)
    .QueryMode(QueryMode)
    .ShowCancelledTransactions(ShowCancelledTransactions)
    .TimelineScope(TimelineScope)
    .TimelineCode(TimelineCode)
    .IncludeEconomics(IncludeEconomics)
    .IncludeSettlementStatus(IncludeSettlementStatus)
    .SettlementStatusDate(SettlementStatusDate)
    .ReturnExcludedTransactions(ReturnExcludedTransactions)
    .AllocationExpansion(AllocationExpansion);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
