

# BatchUpsertPortfolioTransactionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**Map&lt;String, Transaction&gt;**](Transaction.md) | The transactions which have been successfully upserted. |  [optional]
**failed** | [**Map&lt;String, ErrorDetail&gt;**](ErrorDetail.md) | The transactions that could not be upserted along with a reason for their failure. |  [optional]
**metadata** | **Map&lt;String, List&lt;ResponseMetaData&gt;&gt;** | Contains warnings related to unresolved instruments or non-existent transaction types for the upserted trades |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]



