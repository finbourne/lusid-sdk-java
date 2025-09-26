# com.finbourne.lusid.model.TransactionQueryParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **String** | The lower bound effective datetime or cut label (inclusive) from which to build the transactions. | [default to String]
**endDate** | **String** | The upper bound effective datetime or cut label (inclusive) from which to retrieve transactions. | [default to String]
**queryMode** | **String** | The date to compare against the upper and lower bounds for the effective datetime or cut label. Defaults to &#39;TradeDate&#39; if not specified. The available values are: TradeDate, SettleDate | [optional] [default to String]
**showCancelledTransactions** | **Boolean** | Option to specify whether or not to include cancelled transactions in the output. Defaults to False if not specified. | [optional] [default to Boolean]
**timelineScope** | **String** | Scope of the Timeline for the Portfolio. The Timeline to be used while building transactions | [optional] [default to String]
**timelineCode** | **String** | Code of the Timeline for the Portfolio. The Timeline to be used while building transactions | [optional] [default to String]
**includeEconomics** | **Boolean** | By default is false. When set to true the Economics data would be populated in the response. | [optional] [default to Boolean]

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


TransactionQueryParameters transactionQueryParametersInstance = new TransactionQueryParameters()
    .StartDate(StartDate)
    .EndDate(EndDate)
    .QueryMode(QueryMode)
    .ShowCancelledTransactions(ShowCancelledTransactions)
    .TimelineScope(TimelineScope)
    .TimelineCode(TimelineCode)
    .IncludeEconomics(IncludeEconomics);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
