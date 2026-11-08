# com.finbourne.lusid.model.CollateralAllocation
Which of our assets to move for a margin call and why: every holding considered, with its rank or the constraint  that excluded it, and the lines chosen cheapest first, each carrying what a transaction moving it needs. Amounts  are in the agreement's base currency.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**runId** | **String** | The run the call belongs to. | [default to String]
**callId** | **String** | The business key of the call within the run: agreement scope and code, item, margin type and direction joined with &#39;/&#39;. | [default to String]
**direction** | **String** | Whether the collateral is delivered to the counterparty or recalled from it. One of Deliver or Recall. | [default to String]
**inventorySource** | **String** | Where the holdings were read from: RunStore for the proposal the run made, Live for a ranking against the holdings as they stand now. | [default to String]
**asAt** | [**OffsetDateTime**](OffsetDateTime.md) | The asAt the holdings and terms were read at. | [default to OffsetDateTime]
**agreementId** | [**ResourceId**](ResourceId.md) |  | [optional] [default to ResourceId]
**item** | **String** | The margin item of the call. | [optional] [default to String]
**counterparty** | [**CounterpartyIdentifier**](CounterpartyIdentifier.md) |  | [optional] [default to CounterpartyIdentifier]
**businessDate** | [**OffsetDateTime**](OffsetDateTime.md) | The business date of the call, which a transaction for a line trades on. | [optional] [default to OffsetDateTime]
**deadline** | [**OffsetDateTime**](OffsetDateTime.md) | When the movement must have settled under the agreement&#39;s cut label. Null when the agreement sets none. | [optional] [default to OffsetDateTime]
**marginAccount** | **String** | The code of the custodian account the item names for collateral we post, which a delivery moves assets into and a recall moves them out of. Null when the item names none. | [optional] [default to String]
**baseCurrency** | **String** | The agreement&#39;s base currency, which every amount is in. | [default to String]
**requiredAmount** | **java.math.BigDecimal** | The collateral value to deliver, or for a recall the excess to take back. | [default to java.math.BigDecimal]
**coveredAmount** | **java.math.BigDecimal** | The collateral value of the lines chosen: below the requirement when the inventory ran out, above it when a lot could not be split. | [default to java.math.BigDecimal]
**carryPerDay** | **java.math.BigDecimal** | What the chosen lines cost the fund a day to leave locked up, in the base currency. | [default to java.math.BigDecimal]
**allCashCarryPerDay** | **java.math.BigDecimal** | What covering the whole call in base-currency cash would cost a day. Null when the cash rate is unavailable or for a recall. | [optional] [default to java.math.BigDecimal]
**candidates** | [**List&lt;CollateralAllocationCandidate&gt;**](CollateralAllocationCandidate.md) | Every holding considered, ranked ones first by rank, then the excluded with the constraint that excluded them. | [default to List<CollateralAllocationCandidate>]
**allocation** | [**List&lt;CollateralAllocationLine&gt;**](CollateralAllocationLine.md) | The assets chosen, cheapest first, each with what a transaction moving it needs. | [default to List<CollateralAllocationLine>]

```java
import com.finbourne.lusid.model.CollateralAllocation;
import java.util.*;
import java.lang.System;
import java.net.URI;

String RunId = "example RunId";
String CallId = "example CallId";
String Direction = "example Direction";
String InventorySource = "example InventorySource";
OffsetDateTime AsAt = OffsetDateTime.now();
ResourceId AgreementId = new ResourceId();
@jakarta.annotation.Nullable String Item = "example Item";
CounterpartyIdentifier Counterparty = new CounterpartyIdentifier();
@jakarta.annotation.Nullable OffsetDateTime BusinessDate = OffsetDateTime.now();
@jakarta.annotation.Nullable OffsetDateTime Deadline = OffsetDateTime.now();
@jakarta.annotation.Nullable String MarginAccount = "example MarginAccount";
String BaseCurrency = "example BaseCurrency";
java.math.BigDecimal RequiredAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal CoveredAmount = new java.math.BigDecimal("100.00");
java.math.BigDecimal CarryPerDay = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable java.math.BigDecimal AllCashCarryPerDay = new java.math.BigDecimal("100.00");
List<CollateralAllocationCandidate> Candidates = new List<CollateralAllocationCandidate>();
List<CollateralAllocationLine> Allocation = new List<CollateralAllocationLine>();


CollateralAllocation collateralAllocationInstance = new CollateralAllocation()
    .RunId(RunId)
    .CallId(CallId)
    .Direction(Direction)
    .InventorySource(InventorySource)
    .AsAt(AsAt)
    .AgreementId(AgreementId)
    .Item(Item)
    .Counterparty(Counterparty)
    .BusinessDate(BusinessDate)
    .Deadline(Deadline)
    .MarginAccount(MarginAccount)
    .BaseCurrency(BaseCurrency)
    .RequiredAmount(RequiredAmount)
    .CoveredAmount(CoveredAmount)
    .CarryPerDay(CarryPerDay)
    .AllCashCarryPerDay(AllCashCarryPerDay)
    .Candidates(Candidates)
    .Allocation(Allocation);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
