

# JELines

An JELines entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountingDate** | **OffsetDateTime** | The JELines accounting date. |  |
|**activityDate** | **OffsetDateTime** | The actual date of the activity. Differs from the accounting date when creating journals that would occur in a closed period. |  |
|**portfolioId** | [**ResourceId**](ResourceId.md) |  |  |
|**instrumentId** | **String** | To indicate the instrument of the transaction that the JE line posted for, if applicable. |  |
|**instrumentScope** | **String** | The scope in which the JELines instrument is in. |  |
|**subHoldingKeys** | [**Map&lt;String, PerpetualProperty&gt;**](PerpetualProperty.md) | The sub-holding properties which are part of the AccountingKey. |  [optional] |
|**taxLotId** | **String** | The tax lot Id that JE line is impacting. |  |
|**glCode** | **String** | Code of general ledger the JE lines posting to. |  |
|**local** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**base** | [**CurrencyAndAmount**](CurrencyAndAmount.md) |  |  |
|**postingModuleId** | [**ResourceId**](ResourceId.md) |  |  [optional] |
|**postingRule** | **String** | The rule generating the JELinse. |  |
|**asAtDate** | **OffsetDateTime** | The corresponding input date and time of the Transaction generating the JELine. |  |
|**activitiesDescription** | **String** | This would be the description of the business activities where these JE lines are posting for. |  [optional] |
|**sourceType** | **String** | So far are 4 types: LusidTxn, LusidValuation, Manual and External. |  |
|**sourceId** | **String** | For the Lusid Source Type this will be the txn Id. For the rest will be what the user populates. |  |
|**properties** | [**Map&lt;String, Property&gt;**](Property.md) | Properties to add to the Abor. |  [optional] |
|**movementName** | **String** | The name of the movement. |  |
|**holdingType** | **String** | Defines the broad category holding within the portfolio. |  |
|**economicBucket** | **String** | Raw JE Line details of the economic bucket for the JE Line. |  |
|**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional] |



