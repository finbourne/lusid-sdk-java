# com.finbourne.lusid.model.TransactionQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The lower bound effective datetime or cut label (inclusive) from which to build the transactions. | [default to String]
**endDate** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions. | [default to String]
**queryMode** | **String** | The date to compare against the upper and lower bounds for the effective datetime or cut label. Defaults to &#39;TradeDate&#39; if not specified. The available values are: TradeDate, SettleDate | [optional] [default to String]
**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. | [optional] [default to Boolean]
**timelineScope** | **String** | Scope of the Timeline for the Portfolio. The Timeline to be used while building transactions | [optional] [default to String]
**timelineCode** | **String** | Code of the Timeline for the Portfolio. The Timeline to be used while building transactions. This can optionally include a colon, followed by the Closed Period Id to use at the head of the timeline, for a timeline with unconfirmed periods. | [optional] [default to String]
**includeEconomics** | **Boolean** | By default is false. When set to true the Economics data would be populated in the response. | [optional] [default to Boolean]
**includeSettlementStatus** | **Boolean** | By default is false. When set to true the Settlement Status data would be populated in the response. | [optional] [default to Boolean]
**settlementStatusDate** | **String** | Optional date used to specify end of an extended window for settlement information. When provided, transactions will be returned between start and end date, but settlement information between start date and this date will be included. When provided, the value must be greater than or equal to end date. | [optional] [default to String]

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


TransactionQueryParameters transactionQueryParametersInstance = new TransactionQueryParameters()
    .StartDate(StartDate)
    .EndDate(EndDate)
    .QueryMode(QueryMode)
    .ShowCancelledTransactions(ShowCancelledTransactions)
    .TimelineScope(TimelineScope)
    .TimelineCode(TimelineCode)
    .IncludeEconomics(IncludeEconomics)
    .IncludeSettlementStatus(IncludeSettlementStatus)
    .SettlementStatusDate(SettlementStatusDate);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
