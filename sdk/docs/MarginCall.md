# com.finbourne.lusid.model.MarginCall
A margin call a run produced under a collateral agreement: our figure, the counterparty's demand once recorded  and how they compare, and where the call is in its lifecycle.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**href** | [**URI**](URI.md) | The URI of this margin call. | [optional] [default to URI]
**id** | **String** | The identifier of the call: the run id and the call&#39;s business key joined with &#39;/&#39;. | [default to String]
**runId** | **String** | The run that produced the call. Filterable. | [default to String]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**counterparty** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [optional] [default to CounterpartyIdentifier]
**item** | **String** | The margin item of the agreement the call is for. Filterable. | [default to String]
**marginType** | **String** | The type of margin called. Currently VariationMargin. Filterable. | [default to String]
**method** | **String** | The calculation method of the margin item. | [optional] [default to String]
**settlement** | **String** | Whether the item is settled or collateralised. | [optional] [default to String]
**direction** | **String** | Who posts: WePost, TheyPost or None when the exposure is flat. Filterable. | [default to String]
**currency** | **String** | The currency of the call, the agreement&#39;s base currency. Filterable. | [default to String]
**required** | **java.math.BigDecimal** | The margin required under the agreement, signed as the call. | [default to java.math.BigDecimal]
**held** | **java.math.BigDecimal** | The collateral already held against the item, signed as the call. | [default to java.math.BigDecimal]
**call** | **java.math.BigDecimal** | Our figure for the amount to move: required less held. Filterable. | [default to java.math.BigDecimal]
**matchTolerance** | **java.math.BigDecimal** | The agreement&#39;s match tolerance captured on the call. | [optional] [default to java.math.BigDecimal]
**counterpartyDemand** | **java.math.BigDecimal** | The counterparty&#39;s figure for the call, once recorded. | [optional] [default to java.math.BigDecimal]
**difference** | **java.math.BigDecimal** | The counterparty&#39;s demand less our call, once recorded. | [optional] [default to java.math.BigDecimal]
**matchStatus** | **String** | How the counterparty&#39;s demand compares to our call. One of Unmatched, Matched, WithinTolerance, Break or NotRequired. Filterable. | [default to String]
**demandReceivedAt** | [**OffsetDateTime**](OffsetDateTime.md) | When the counterparty&#39;s demand was received. | [optional] [default to OffsetDateTime]
**statementReference** | **String** | A reference to the counterparty&#39;s statement, such as a Drive path. | [optional] [default to String]
**demandNote** | **String** | A note recorded with the counterparty&#39;s demand. | [optional] [default to String]
**agreedAmount** | **java.math.BigDecimal** | The amount agreed to move, once the call is accepted or disputed. | [optional] [default to java.math.BigDecimal]
**disputedAmount** | **java.math.BigDecimal** | The part of the larger of our call and the counterparty&#39;s demand left in dispute. | [optional] [default to java.math.BigDecimal]
**disputeReason** | **String** | Why the call is disputed. | [optional] [default to String]
**disputeOwner** | **String** | Who owns the dispute. | [optional] [default to String]
**state** | **String** | Where the call is in its lifecycle. One of Calculated, Accepted or Disputed. Filterable. | [default to String]
**deadline** | [**OffsetDateTime**](OffsetDateTime.md) | The time the call must be agreed by. Empty until agreements carry a notification time. | [optional] [default to OffsetDateTime]
**supersedes** | [**MarginCallReference**](MarginCallReference.md) |  | [optional] [default to MarginCallReference]
**carriedFrom** | [**MarginCallReference**](MarginCallReference.md) |  | [optional] [default to MarginCallReference]
**carriedDisputedAmount** | **java.math.BigDecimal** | The amount left in dispute on the carried call. Informational; not added to this call. | [optional] [default to java.math.BigDecimal]
**scenario** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]

```java
import com.finbourne.lusid.model.MarginCall;
import java.util.*;
import java.lang.System;
import java.net.URI;

@jakarta.annotation.Nullable URI Href = URI.create("http://example.com/Href");
String Id = "example Id";
String RunId = "example RunId";
ResourceId AgreementId = new ResourceId();
CounterpartyIdentifier Counterparty = new CounterpartyIdentifier();
String Item = "example Item";
String MarginType = "example MarginType";
@jakarta.annotation.Nullable String Method = "example Method";
@jakarta.annotation.Nullable String Settlement = "example Settlement";
String Direction = "example Direction";
String Currency = "example Currency";
java.math.BigDecimal Required = new java.math.BigDecimal("100.00");
java.math.BigDecimal Held = new java.math.BigDecimal("100.00");
java.math.BigDecimal Call = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal MatchTolerance = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal CounterpartyDemand = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal Difference = new java.math.BigDecimal("100.00");
String MatchStatus = "example MatchStatus";
@jakarta.annotation.Nullable OffsetDateTime DemandReceivedAt = OffsetDateTime.now();
@jakarta.annotation.Nullable String StatementReference = "example StatementReference";
@jakarta.annotation.Nullable String DemandNote = "example DemandNote";
@jakarta.annotation.Nullable java.math.BigDecimal AgreedAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal DisputedAmount = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String DisputeReason = "example DisputeReason";
@jakarta.annotation.Nullable String DisputeOwner = "example DisputeOwner";
String State = "example State";
@jakarta.annotation.Nullable OffsetDateTime Deadline = OffsetDateTime.now();
MarginCallReference Supersedes = new MarginCallReference();
MarginCallReference CarriedFrom = new MarginCallReference();
@jakarta.annotation.Nullable java.math.BigDecimal CarriedDisputedAmount = new java.math.BigDecimal("100.00");
ResourceId Scenario = new ResourceId();


MarginCall marginCallInstance = new MarginCall()
    .Href(Href)
    .Id(Id)
    .RunId(RunId)
    .AgreementId(AgreementId)
    .Counterparty(Counterparty)
    .Item(Item)
    .MarginType(MarginType)
    .Method(Method)
    .Settlement(Settlement)
    .Direction(Direction)
    .Currency(Currency)
    .Required(Required)
    .Held(Held)
    .Call(Call)
    .MatchTolerance(MatchTolerance)
    .CounterpartyDemand(CounterpartyDemand)
    .Difference(Difference)
    .MatchStatus(MatchStatus)
    .DemandReceivedAt(DemandReceivedAt)
    .StatementReference(StatementReference)
    .DemandNote(DemandNote)
    .AgreedAmount(AgreedAmount)
    .DisputedAmount(DisputedAmount)
    .DisputeReason(DisputeReason)
    .DisputeOwner(DisputeOwner)
    .State(State)
    .Deadline(Deadline)
    .Supersedes(Supersedes)
    .CarriedFrom(CarriedFrom)
    .CarriedDisputedAmount(CarriedDisputedAmount)
    .Scenario(Scenario);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
