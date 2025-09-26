# com.finbourne.lusid.model.JournalEntryLine
A Journal Entry line entity.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The Journal Entry Line accounting date. | [default to OffsetDateTime]
**activityDate** | [**OffsetDateTime**](OffsetDateTime.md) | The actual date of the activity. Differs from the accounting date when creating journals that would occur in a closed period. | [default to OffsetDateTime]
**portfolioId** | [**ResourceId**](ResourceId.md) |  | [default to ResourceId]
**instrumentId** | **String** | To indicate the instrument of the transaction that the Journal Entry Line posted for, if applicable. | [default to String]
**instrumentScope** | **String** | The scope in which the Journal Entry Line instrument is in. | [default to String]
**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which are part of the AccountingKey. | [optional] [default to Map<String, PerpetualProperty>]
**taxLotId** | **String** | If the holding type is &#39;B&#39; (settled cash balance), this is 1. Otherwise, this is the ID of a tax lot if applicable, or the source ID of the original transaction if not. | [optional] [default to String]
**generalLedgerAccountCode** | **String** | The code of the account in the general ledger the Journal Entry was posted to. | [default to String]
**local** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**base** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  | [default to CurrencyAndAmount]
**units** | **java.math.BigDecimal** | Units held for the Journal Entry Line. | [default to java.math.BigDecimal]
**postingModuleCode** | **String** | The code of the posting module where the posting rules derived the Journal Entry lines. | [optional] [default to String]
**postingRule** | **String** | The rule generating the Journal Entry Line. | [default to String]
**asAtDate** | [**OffsetDateTime**](OffsetDateTime.md) | The corresponding input date and time of the Transaction generating the Journal Entry Line. | [default to OffsetDateTime]
**activitiesDescription** | **String** | This would be the description of the business activities this Journal Entry Line is for. | [optional] [default to String]
**sourceType** | **String** | So far are 4 types: LusidTxn, LusidValuation, Manual and External. | [default to String]
**sourceId** | **String** | For the Lusid Source Type this will be the txn Id. For the rest will be what the user populates. | [default to String]
**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. | [optional] [default to Map<String, Property>]
**movementName** | **String** | If the JE Line is generated from a transaction, the name of the side in the transaction type&#39;s movement. If from a valuation, this is &#39;MarkToMarket&#39;. | [optional] [default to String]
**holdingType** | **String** | One of the LUSID holding types such as &#39;P&#39; for position or &#39;B&#39; for settled cash balance. | [default to String]
**economicBucket** | **String** | LUSID automatically categorises a JE Line into a broad economic bucket such as &#39;NA_Cost&#39; or &#39;PL_RealPriceGL&#39;. | [default to String]
**economicBucketComponent** | **String** | Sub bucket of the economic bucket. | [optional] [default to String]
**economicBucketVariant** | **String** | Categorisation of a Mark-to-market journal entry line into LongTerm or ShortTerm based on whether the ActivityDate is more than a year after the purchase trade date or not. | [optional] [default to String]
**levels** | **List&lt;String&gt;** | Resolved data from the general ledger profile where the GeneralLedgerProfileCode is specified in the GetJournalEntryLines request body. | [optional] [default to List<String>]
**sourceLevels** | **List&lt;String&gt;** | Source data from the general ledger profile where the GeneralLedgerProfileCode is specified in the GetJournalEntryLines request body. | [optional] [default to List<String>]
**movementSign** | **String** | Indicates if the Journal Entry Line corresponds to a Long or Short movement. | [optional] [default to String]
**holdingSign** | **String** | Indicates if the Journal Entry Line is operating against a Long or Short holding. | [optional] [default to String]
**ledgerColumn** | **String** | Indicates if the Journal Entry Line is credit or debit. | [optional] [default to String]
**journalEntryLineType** | **String** | Indicates the Journal Entry Line type | [optional] [default to String]
**links** | [**List&lt;Link&gt;**](Link.md) |  | [optional] [default to List<Link>]

```java
import com.finbourne.lusid.model.JournalEntryLine;
import java.util.*;
import java.lang.System;
import java.net.URI;

OffsetDateTime AccountingDate = OffsetDateTime.now();
OffsetDateTime ActivityDate = OffsetDateTime.now();
ResourceId PortfolioId = new ResourceId();
String InstrumentId = "example InstrumentId";
String InstrumentScope = "example InstrumentScope";
@jakarta.annotation.Nullable Map<String, PerpetualProperty> SubHoldingKeys = new Map<String, PerpetualProperty>();
@jakarta.annotation.Nullable String TaxLotId = "example TaxLotId";
String GeneralLedgerAccountCode = "example GeneralLedgerAccountCode";
CurrencyAndAmount Local = new CurrencyAndAmount();
CurrencyAndAmount Base = new CurrencyAndAmount();
java.math.BigDecimal Units = new java.math.BigDecimal("100.00");
@jakarta.annotation.Nullable String PostingModuleCode = "example PostingModuleCode";
String PostingRule = "example PostingRule";
OffsetDateTime AsAtDate = OffsetDateTime.now();
@jakarta.annotation.Nullable String ActivitiesDescription = "example ActivitiesDescription";
String SourceType = "example SourceType";
String SourceId = "example SourceId";
@jakarta.annotation.Nullable Map<String, Property> Properties = new Map<String, Property>();
@jakarta.annotation.Nullable String MovementName = "example MovementName";
String HoldingType = "example HoldingType";
String EconomicBucket = "example EconomicBucket";
@jakarta.annotation.Nullable String EconomicBucketComponent = "example EconomicBucketComponent";
@jakarta.annotation.Nullable String EconomicBucketVariant = "example EconomicBucketVariant";
@jakarta.annotation.Nullable List<String> Levels = new List<String>();
@jakarta.annotation.Nullable List<String> SourceLevels = new List<String>();
@jakarta.annotation.Nullable String MovementSign = "example MovementSign";
@jakarta.annotation.Nullable String HoldingSign = "example HoldingSign";
@jakarta.annotation.Nullable String LedgerColumn = "example LedgerColumn";
@jakarta.annotation.Nullable String JournalEntryLineType = "example JournalEntryLineType";
@jakarta.annotation.Nullable List<Link> Links = new List<Link>();


JournalEntryLine journalEntryLineInstance = new JournalEntryLine()
    .AccountingDate(AccountingDate)
    .ActivityDate(ActivityDate)
    .PortfolioId(PortfolioId)
    .InstrumentId(InstrumentId)
    .InstrumentScope(InstrumentScope)
    .SubHoldingKeys(SubHoldingKeys)
    .TaxLotId(TaxLotId)
    .GeneralLedgerAccountCode(GeneralLedgerAccountCode)
    .Local(Local)
    .Base(Base)
    .Units(Units)
    .PostingModuleCode(PostingModuleCode)
    .PostingRule(PostingRule)
    .AsAtDate(AsAtDate)
    .ActivitiesDescription(ActivitiesDescription)
    .SourceType(SourceType)
    .SourceId(SourceId)
    .Properties(Properties)
    .MovementName(MovementName)
    .HoldingType(HoldingType)
    .EconomicBucket(EconomicBucket)
    .EconomicBucketComponent(EconomicBucketComponent)
    .EconomicBucketVariant(EconomicBucketVariant)
    .Levels(Levels)
    .SourceLevels(SourceLevels)
    .MovementSign(MovementSign)
    .HoldingSign(HoldingSign)
    .LedgerColumn(LedgerColumn)
    .JournalEntryLineType(JournalEntryLineType)
    .Links(Links);
```


[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)
