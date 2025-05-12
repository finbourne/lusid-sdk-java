

# JournalEntryLine

A Journal Entry line entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountingDate** | **OffsetDateTime** | The Journal Entry Line accounting date. |  |
|**activityDate** | **OffsetDateTime** | The actual date of the activity. Differs from the accounting date when creating journals that would occur in a closed period. |  |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  |
|**instrumentId** | **String** | To indicate the instrument of the transaction that the Journal Entry Line posted for, if applicable. |  |
|**instrumentScope** | **String** | The scope in which the Journal Entry Line instrument is in. |  |
|**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which are part of the AccountingKey. |  [optional] |
|**taxLotId** | **String** | If the holding type is &#39;B&#39; (settled cash balance), this is 1. Otherwise, this is the ID of a tax lot if applicable, or the source ID of the original transaction if not. |  [optional] |
|**generalLedgerAccountCode** | **String** | The code of the account in the general ledger the Journal Entry was posted to. |  |
|**local** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**base** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**units** | **java.math.BigDecimal** | Units held for the Journal Entry Line. |  |
|**postingModuleCode** | **String** | The code of the posting module where the posting rules derived the Journal Entry lines. |  [optional] |
|**postingRule** | **String** | The rule generating the Journal Entry Line. |  |
|**asAtDate** | **OffsetDateTime** | The corresponding input date and time of the Transaction generating the Journal Entry Line. |  |
|**activitiesDescription** | **String** | This would be the description of the business activities this Journal Entry Line is for. |  [optional] |
|**sourceType** | **String** | So far are 4 types: LusidTxn, LusidValuation, Manual and External. |  |
|**sourceId** | **String** | For the Lusid Source Type this will be the txn Id. For the rest will be what the user populates. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | A set of properties for the Abor. |  [optional] |
|**movementName** | **String** | If the JE Line is generated from a transaction, the name of the side in the transaction type&#39;s movement. If from a valuation, this is &#39;MarkToMarket&#39;. |  [optional] |
|**holdingType** | **String** | One of the LUSID holding types such as &#39;P&#39; for position or &#39;B&#39; for settled cash balance. |  |
|**economicBucket** | **String** | LUSID automatically categorises a JE Line into a broad economic bucket such as &#39;NA_Cost&#39; or &#39;PL_RealPriceGL&#39;. |  |
|**economicBucketComponent** | **String** | Sub bucket of the economic bucket. |  [optional] |
|**economicBucketVariant** | **String** | Categorisation of a Mark-to-market journal entry line into LongTerm or ShortTerm based on whether the ActivityDate is more than a year after the purchase trade date or not. |  [optional] |
|**levels** | **List&lt;String&gt;** | Resolved data from the general ledger profile where the GeneralLedgerProfileCode is specified in the GetJournalEntryLines request body. |  [optional] |
|**sourceLevels** | **List&lt;String&gt;** | Source data from the general ledger profile where the GeneralLedgerProfileCode is specified in the GetJournalEntryLines request body. |  [optional] |
|**movementSign** | **String** | Indicates if the Journal Entry Line corresponds to a Long or Short movement. |  [optional] |
|**holdingSign** | **String** | Indicates if the Journal Entry Line is operating against a Long or Short holding. |  [optional] |
|**ledgerColumn** | **String** | Indicates if the Journal Entry Line is credit or debit. |  [optional] |
|**journalEntryLineType** | **String** | Indicates the Journal Entry Line type |  [optional] |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



[Back to Model list](../README.md#documentation-for-models) &#8226; [Back to API list](../README.md#documentation-for-api-endpoints) &#8226; [Back to README](../README.md)


