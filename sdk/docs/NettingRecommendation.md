# com.finbourne.lusid.model.NettingRecommendation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the recommendation was made from. Filterable. | [default to String]
**sourceAgreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**sourceItem** | **String** | The initial-margin item the trades would leave. Filterable. | [default to String]
**targetAgreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**targetItem** | **String** | The initial-margin item the trades would join. Filterable. | [default to String]
**transfer** | **String** | How the trades would get there: Redesignation when both agreements face one counterparty, Novation otherwise. Filterable. | [default to String]
**instrumentType** | **String** | LUSID&#39;s type for the instruments in the cluster. Filterable. | [optional] [default to String]
**currency** | **String** | The currency the cluster&#39;s trades are denominated in. Filterable. | [optional] [default to String]
**maturityBucket** | **String** | The residual-maturity bucket the cluster&#39;s trades fall in on the run date; empty for instruments without a maturity. Filterable. | [optional] [default to String]
**trades** | [**List&lt;TradeReference&gt;**](TradeReference.md) | The holdings that would move. | [default to List<TradeReference>]
**savingPerDay** | **java.math.BigDecimal** | What we would no longer fund each day across both sets, in the sets&#39; base currency. Filterable. | [default to java.math.BigDecimal]
**oneOffCost** | **java.math.BigDecimal** | The novation cost when the transfer is one; zero for a re-designation. Filterable. | [default to java.math.BigDecimal]
**paybackDays** | **java.math.BigDecimal** | How many days of saving cover the one-off cost. Filterable. | [default to java.math.BigDecimal]
**initialMarginChange** | **java.math.BigDecimal** | The sum over both sets of what we would post after the move less what we post today. Filterable. | [default to java.math.BigDecimal]
**source** | [**InitialMarginChange**](InitialMarginChange.md) |  | [default to InitialMarginChange]
**target** | [**InitialMarginChange**](InitialMarginChange.md) |  | [default to InitialMarginChange]

```java
import com.finbourne.lusid.model.NettingRecommendation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
ResourceId SourceAgreementId = new ResourceId();
String SourceItem = "example SourceItem";
ResourceId TargetAgreementId = new ResourceId();
String TargetItem = "example TargetItem";
String Transfer = "example Transfer";
@jakarta.annotation.Nullable String InstrumentType = "example InstrumentType";
@jakarta.annotation.Nullable String Currency = "example Currency";
@jakarta.annotation.Nullable String MaturityBucket = "example MaturityBucket";
List<TradeReference> Trades = new List<TradeReference>();
java.math.BigDecimal SavingPerDay = new java.math.BigDecimal("100.00");
java.math.BigDecimal OneOffCost = new java.math.BigDecimal("100.00");
java.math.BigDecimal PaybackDays = new java.math.BigDecimal("100.00");
java.math.BigDecimal InitialMarginChange = new java.math.BigDecimal("100.00");
InitialMarginChange Source = new InitialMarginChange();
InitialMarginChange Target = new InitialMarginChange();


NettingRecommendation nettingRecommendationInstance = new NettingRecommendation()
    .RunId(RunId)
    .SourceAgreementId(SourceAgreementId)
    .SourceItem(SourceItem)
    .TargetAgreementId(TargetAgreementId)
    .TargetItem(TargetItem)
    .Transfer(Transfer)
    .InstrumentType(InstrumentType)
    .Currency(Currency)
    .MaturityBucket(MaturityBucket)
    .Trades(Trades)
    .SavingPerDay(SavingPerDay)
    .OneOffCost(OneOffCost)
    .PaybackDays(PaybackDays)
    .InitialMarginChange(InitialMarginChange)
    .Source(Source)
    .Target(Target);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
